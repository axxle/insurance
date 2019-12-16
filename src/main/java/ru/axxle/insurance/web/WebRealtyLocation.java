package ru.axxle.insurance.web;

public class WebRealtyLocation {

    private String country          ; //государство					Строка	Доступно	Обязательное	Ввод с клавиатуры
    private String postIndex        ; //индекс						Строка	Доступно	Нет				Ввод с клавиатуры
    private String federalRegion    ; //республика, край, область	Строка	Доступно	Обязательное	Ввод с клавиатуры
    private String district         ; //район						Строка	Доступно	Нет				Ввод с клавиатуры
    private String place            ; //населённый пункт			Строка	Доступно	Обязательное	Ввод с клавиатуры
    private String street           ; //улица						Строка	Доступно	Обязательное	Ввод с клавиатуры
    private String houseNumber      ; //дом							Целое	Доступно	Нет				Ввод с клавиатуры
    private String houseBlock       ; //корпус						Строка	Доступно	Нет				Ввод с клавиатуры
    private String building         ; //строение					Строка	Доступно	Нет				Ввод с клавиатуры
    private String apartment        ; //квартира					Целое	Доступно	Обязательное	Ввод с клавиатуры
    private String comment          ; //Комментарий к договору		Строка	Доступно	Нет				Ввод с клавиатуры

    public WebRealtyLocation() {}

    public WebRealtyLocation(String country, String postIndex, String federalRegion, String district, String place, String street, String houseNumber, String houseBlock, String building, String apartment, String comment) {
        this.country = country;
        this.postIndex = postIndex;
        this.federalRegion = federalRegion;
        this.district = district;
        this.place = place;
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseBlock = houseBlock;
        this.building = building;
        this.apartment = apartment;
        this.comment = comment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getFederalRegion() {
        return federalRegion;
    }

    public void setFederalRegion(String federalRegion) {
        this.federalRegion = federalRegion;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseBlock() {
        return houseBlock;
    }

    public void setHouseBlock(String houseBlock) {
        this.houseBlock = houseBlock;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}