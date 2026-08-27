package br.com.fiap.ex01.model;

public class Student {
    private int rm;
    private String name;

    private Address address;

    public Student(int rm, String name) {
        this.rm = rm;
        this.name = name;
    }

    public Student() {}

    public int getRm() {
        return rm;
    }

    public Student setRm(int rm) {
        this.rm = rm;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Student setAddress(Address address) {
        this.address = address;
        return this;
    }
}
