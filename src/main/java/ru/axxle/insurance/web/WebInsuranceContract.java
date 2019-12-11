package ru.axxle.insurance.web;

public class WebInsuranceContract {
	
	private String city;
	
	public WebInsuranceContract(){}

    public WebInsuranceContract(String city){
        this.city = city;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}