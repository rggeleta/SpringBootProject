package dmacc.bean;

import javax.persistence.Embeddable;

/**
 * @author roman-rggeleta@dmacc.edu CIS175-Spring 2022 Mar 9, 2022
 */
@Embeddable
public class CampusAddress {
	private String street;
	private String city;
	private String state;

	public CampusAddress() {
 
	}

	public CampusAddress(String street, String city, String state) {

	}

//getters and setters
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}
