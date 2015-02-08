package com.rdas.rest.model;

import com.google.common.base.Optional;
import org.joda.time.DateTime;

/**
 * Created by rdas on 24/01/2015.
 */
public interface RegistryDatasetDetails {
    String getDepositId();

    Optional<String> getPreviousDepositId();

    String getTld();

    RegistryDatasetWatermark getWatermark();

    RegistryDatasetDepositType getDepositType();

    Integer getResendCounter();

    Integer getDepositCounter();

    Optional<String> getClientRoid();

    DateTime getDepositCreationDate();
}
