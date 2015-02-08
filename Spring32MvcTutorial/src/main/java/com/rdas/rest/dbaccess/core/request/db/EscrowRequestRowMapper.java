package com.rdas.rest.dbaccess.core.request.db;

import com.rdas.rest.model.EscrowRequest;
import com.rdas.rest.model.RegistryDatasetDepositType;
import com.rdas.rest.model.RegistryDatasetWatermark;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rdas on 24/01/2015.
 */
@Component
public class EscrowRequestRowMapper implements RowMapper<EscrowRequest> {

    @Autowired
    private EscrowRequestDepositIdGenerator escrowRequestDepositIdGenerator;

    @Override
    public EscrowRequest mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        // @Formatter:off
        long id = resultSet.getLong("id");
        EscrowRequest.Builder builder = EscrowRequest.getBuilder()
                .withId(id)
                .withDepositId(escrowRequestDepositIdGenerator.generate(id, resultSet.getString("repository_identifier")))
                .withDepositCounter(resultSet.getInt("deposit_counter"))
                .withDepositCreationDate(new DateTime(resultSet.getDate("create_date").getTime()))
                .withDepositType(RegistryDatasetDepositType.valueOf(resultSet.getString("report_type").toUpperCase()))
                .withResendCounter(resultSet.getInt("resend_counter"))
                .withTld(resultSet.getString("tld"))
                .withWatermark(new RegistryDatasetWatermark(resultSet.getDate("watermark")));
        // @Formatter:on

        builder.withOptionalPreviousDepositId(null); //TODO this is always empty, bug filed see RY-881

        return builder.build();
    }
}