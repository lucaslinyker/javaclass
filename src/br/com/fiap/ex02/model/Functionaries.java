package br.com.fiap.ex02.model;

public abstract class Functionaries {
    private String name;
    private String cpf;
    private double salary;
    private Address address;

    public Functionaries(String name, String cpf, double salary, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
        this.address = address;
    }

    public Functionaries() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public abstract double viewBonus();

    public abstract String getDetails();
}
