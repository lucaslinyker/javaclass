package br.com.fiap.ex01.model;

public class Address {
    private String street;
    private int number;
    private int cep;

    private City city;

    public Address(String street, int number, int cep, City city) {
        this.street = street;
        this.number = number;
        this.cep = cep;
        setCity(city);
    }

    public Address() {}

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }

    public int getCep() {
        return cep;
    }

    public Address setCep(int cep) {
        this.cep = cep;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Address setCity(City city) {
        this.city = city;
        return this;
    }
}
