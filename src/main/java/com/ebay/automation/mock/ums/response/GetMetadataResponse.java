package com.ebay.automation.mock.ums.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMetadataResponse", propOrder = {
    "recommendations"
})
public class GetMetadataResponse extends BaseResponse {
	
	@XmlElement(required = true)
    protected Recommendations recommendations;
	

    public GetMetadataResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link Recommendations }
     *     
     */
    public Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recommendations }
     *     
     */
    public void setRecommendations(Recommendations value) {
        this.recommendations = value;
    }

}
