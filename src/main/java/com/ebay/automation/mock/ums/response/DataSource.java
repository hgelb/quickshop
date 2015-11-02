package com.ebay.automation.mock.ums.response;


/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public enum DataSource {
	

    SELLER_TAG("SellerTag"),

    CATALOG("Catalog"),

    BUYER_TAG("BuyerTag"),

    REPOSITORY("Repository"),

    UNIFIED("Unified"),

    REPOSITORY_SELLER_TAG("RepositorySellerTag"),

    REPOSITORY_CATALOG("RepositoryCatalog"),

    REPOSITORY_BUYER_TAG("RepositoryBuyerTag"),

    REPOSITORY_DISCOVERY_TAG("RepositoryDiscoveryTag");
    
    private final String value;


	DataSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataSource fromValue(String v) {
        for (DataSource c: DataSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
