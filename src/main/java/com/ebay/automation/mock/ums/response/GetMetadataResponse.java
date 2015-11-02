package com.ebay.automation.mock.ums.response;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.common.base.MoreObjects;


/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class GetMetadataResponse extends BaseResponse {
	

    protected Recommendations recommendations;
	

    public GetMetadataResponse() {
		super();

	}
    
    
    
    public GetMetadataResponse(AckValue ack, ErrorMessage errorMessage, String version,
    		XMLGregorianCalendar timestamp, List<ExtensionType> extension, Recommendations recommendations) {
		super(ack, errorMessage, version, timestamp, extension);
		this.recommendations = recommendations;
	}
    

	public GetMetadataResponse(Recommendations recommendations) {
		super();
		this.recommendations = recommendations;
	}



	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("recommendations", recommendations).toString();
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
