package br.com.fiap.ex01.model;

// note: There is no setter because a city's data does not change
// this class could be a Record
public class City {
    private final String name;
    private final String state;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}
