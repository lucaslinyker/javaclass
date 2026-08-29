package br.com.fiap.ex02.model;

public class Salespeople extends Functionaries {
    private double semiannualSales;

    public Salespeople(String name, String cpf, double salary, double semiannualSales, Address address) {
        super(name, cpf, salary, address);
        this.semiannualSales = semiannualSales;
    }

    public Salespeople() {
        super();
    }

    public double getSemiannualSales() {
        return semiannualSales;
    }

    public void setSemiannualSales(double semiannualSales) {
        this.semiannualSales = semiannualSales;
    }

    @Override
    public double viewBonus() {
        return getSemiannualSales() * 0.015; // 1.5%
    }

    @Override
    public String getDetails() {
        return """
                Name: %s, CPF: %s, Semiannual Sales: %.2f
                Address: %s
                Salary: %.2f
                Bonus: 1.5%% - R$ %.2f
                """.formatted(getName(), getCpf(), getSemiannualSales(), getAddress().getCompleteAddress(), getSalary(), viewBonus());
    }
}
