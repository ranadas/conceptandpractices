package com.rdas.rest.model;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.joda.time.DateTime;
import javax.annotation.Nullable;
/**
 * Created by rdas on 24/01/2015.
 */
public class EscrowRequest implements RegistryDatasetDetails {
    private Long id;
    private String depositId;
    private String tld;
    private RegistryDatasetWatermark watermark;
    private RegistryDatasetDepositType depositType;
    private Integer resendCounter;
    private Integer depositCounter;
    private DateTime depositCreationDate;
    private Optional<String> previousDepositId;

    private EscrowRequest() {
        previousDepositId = Optional.absent();
    }

    public static Builder getBuilderFor(EscrowRequest escrowRequest) {
        // @Formatter:off
        return (new Builder())
                .withId(escrowRequest.getId())
                .withDepositId(escrowRequest.getDepositId())
                .withDepositCreationDate(DateTime.now())
                .withTld(escrowRequest.getTld())
                .withResendCounter(escrowRequest.getResendCounter())
                .withWatermark(escrowRequest.getWatermark())
                .withDepositCounter(escrowRequest.getDepositCounter())
                .withDepositType(escrowRequest.getDepositType());
        // @Formatter:on
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public Optional<String> getPreviousDepositId() {
        return previousDepositId;
    }

    public String getDepositId() {
        return depositId;
    }

    public RegistryDatasetWatermark getWatermark() {
        return watermark;
    }

    public String getTld() {
        return tld;
    }

    public Integer getResendCounter() {
        return resendCounter;
    }

    public Integer getDepositCounter() {
        return depositCounter;
    }

    @Override
    public DateTime getDepositCreationDate() {
        return depositCreationDate;
    }

    public RegistryDatasetDepositType getDepositType() {
        return depositType;
    }

    @Override
    public Optional<String> getClientRoid() {
        return Optional.absent();
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public static class Builder {
        private final EscrowRequest escrowRequest;

        private Builder() {
            escrowRequest = new EscrowRequest();
        }

        public Builder withId(Long id) {
            this.escrowRequest.id = id;
            return this;
        }

        public Builder withDepositId(String depositId) {
            this.escrowRequest.depositId = depositId;
            return this;
        }

        public Builder withWatermark(RegistryDatasetWatermark watermark) {
            this.escrowRequest.watermark = watermark;
            return this;
        }

        public Builder withTld(String tld) {
            this.escrowRequest.tld = tld;
            return this;
        }

        public Builder withResendCounter(Integer resendCounter) {
            this.escrowRequest.resendCounter = resendCounter;
            return this;
        }

        public Builder withDepositCounter(Integer depositCounter) {
            this.escrowRequest.depositCounter = depositCounter;
            return this;
        }

        public Builder withDepositType(RegistryDatasetDepositType depositType) {
            this.escrowRequest.depositType = depositType;
            return this;
        }

        public Builder withDepositCreationDate(final DateTime depositCreationDate) {
            this.escrowRequest.depositCreationDate = depositCreationDate;
            return this;
        }

        public Builder withOptionalPreviousDepositId(@Nullable final String previousDepositId) {
            this.escrowRequest.previousDepositId = Optional.fromNullable(previousDepositId);
            return this;
        }

        public EscrowRequest build() {
            Preconditions.checkNotNull(escrowRequest.id, "id can't be null");
            Preconditions.checkNotNull(escrowRequest.depositId, "depositId can't be null");
            Preconditions.checkNotNull(escrowRequest.watermark, "watermark can't be null");
            Preconditions.checkNotNull(escrowRequest.tld, "tld can't be null");
            Preconditions.checkNotNull(escrowRequest.depositType, "depositType can't be null");
            Preconditions.checkNotNull(escrowRequest.resendCounter, "resendCounter can't be null");
            Preconditions.checkNotNull(escrowRequest.depositCounter, "depositCounter can't be null");
            Preconditions.checkNotNull(escrowRequest.depositCreationDate, "depositCreationDate can't be null");
            Preconditions.checkArgument(escrowRequest.depositCounter > 0, "depositCounter must be greater than zero");
            Preconditions.checkArgument(escrowRequest.resendCounter >= 0, "resendCounter must be greater or equal to zero");

            return escrowRequest;
        }
    }
}
