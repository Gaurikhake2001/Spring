package mypack;

public class Address {
	private String city, state, contry;

	public Address(String city, String state, String contry) {
		super();
		this.city = city;
		this.state = state;
		this.contry = contry;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", contry=" + contry + "]";
	}

	
	
	

}
