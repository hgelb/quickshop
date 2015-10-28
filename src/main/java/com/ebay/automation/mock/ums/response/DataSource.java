package com.ebay.automation.mock.ums.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlType(name = "DataSource")
@XmlEnum
public enum DataSource {
	
	@XmlEnumValue("SellerTag")
    SELLER_TAG("SellerTag"),
    @XmlEnumValue("Catalog")
    CATALOG("Catalog"),
    @XmlEnumValue("BuyerTag")
    BUYER_TAG("BuyerTag"),
    @XmlEnumValue("Repository")
    REPOSITORY("Repository"),
    @XmlEnumValue("Unified")
    UNIFIED("Unified"),
    @XmlEnumValue("RepositorySellerTag")
    REPOSITORY_SELLER_TAG("RepositorySellerTag"),
    @XmlEnumValue("RepositoryCatalog")
    REPOSITORY_CATALOG("RepositoryCatalog"),
    @XmlEnumValue("RepositoryBuyerTag")
    REPOSITORY_BUYER_TAG("RepositoryBuyerTag"),
    @XmlEnumValue("RepositoryDiscoveryTag")
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
