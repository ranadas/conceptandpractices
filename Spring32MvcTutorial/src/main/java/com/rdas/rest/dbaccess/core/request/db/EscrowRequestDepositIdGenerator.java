package com.rdas.rest.dbaccess.core.request.db;

/**
 * Created by rdas on 24/01/2015.
 */
public interface EscrowRequestDepositIdGenerator {
    String generate(Long escrowRequestId, String repositoryIdentifier);
}
