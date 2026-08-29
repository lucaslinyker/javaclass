package br.com.fiap.ex02.model;

public class Programmers extends Functionaries {
    private int ramal;

    public Programmers(String name, String cpf, double salary, int ramal, Address address) {
        super(name, cpf, salary, address);
        this.ramal = ramal;
    }

    public Programmers() {
        super();
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public double viewBonus() {
        return getSalary() * 0.02; // 2%
    }

    @Override
    public String getDetails() {
        return """
                Name: %s, CPF: %s, Ramal: %d
                Address: %s
                Salary: %.2f
                Bonus: 2%% - R$ %.2f
                """.formatted(getName(), getCpf(), getRamal(), getAddress().getCompleteAddress(), getSalary(), viewBonus());
    }
}
