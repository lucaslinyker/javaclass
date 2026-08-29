package br.com.fiap.ex02.model;

public class Address {
    private String street;
    private int number;
    private String complement;
    private int cep;
    private String city;
    private String state;

    public Address() {}

    public Address(String street, int number, String complement, int cep, String city, String state) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.cep = cep;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompleteAddress() {
        return this.street + ", "
                + this.number + ", "
                + this.complement + ", "
                + this.cep + ", "
                + this.city + ", "
                + this.state;
    }
}

