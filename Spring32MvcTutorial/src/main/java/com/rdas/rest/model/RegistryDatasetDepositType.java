package com.rdas.rest.model;

/**
 * Created by rdas on 24/01/2015.
 */
import com.google.common.base.Optional;
//import ietf.params.xml.ns.rde_1.DepositTypeType;

public enum RegistryDatasetDepositType {
    FULL("full");

    private final String filenameTag;

    private RegistryDatasetDepositType(String filenameTag) {
        this.filenameTag = filenameTag;
    }

    public String getFilenameTag() {
        return filenameTag;
    }

    public static Optional<RegistryDatasetDepositType> createFromFilenameTag(String filenameTag) {
        RegistryDatasetDepositType[] values = RegistryDatasetDepositType.values();
        for (RegistryDatasetDepositType dt : values) {
            if (dt.getFilenameTag().equals(filenameTag)) {
                return Optional.of(dt);
            }
        }
        return Optional.absent();
    }

//    public static RegistryDatasetDepositType fromDepositTypeType(final DepositTypeType depositTypeType) {
//        switch (depositTypeType) {
//            case FULL:
//                return RegistryDatasetDepositType.FULL;
//            default:
//                throw new IllegalArgumentException("Unsupported deposit type");
//        }
//    }
}
