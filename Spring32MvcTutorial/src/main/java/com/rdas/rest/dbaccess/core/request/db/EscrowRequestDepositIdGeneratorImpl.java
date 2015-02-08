package com.rdas.rest.dbaccess.core.request.db;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Component;

/**
 * Created by rdas on 24/01/2015.
 */
@Component
public class EscrowRequestDepositIdGeneratorImpl implements EscrowRequestDepositIdGenerator {
    @Override
    public String generate(Long escrowRequestId, String repositoryIdentifier) {
        Preconditions.checkNotNull(escrowRequestId, "escrowRequestId can't be null");
        Preconditions.checkNotNull(repositoryIdentifier, "repositoryIdentifier can't be null");

        return escrowRequestId + repositoryIdentifier;
    }
}
