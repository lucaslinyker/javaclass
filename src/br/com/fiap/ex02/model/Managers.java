package br.com.fiap.ex02.model;

public class Managers extends Functionaries {
    private String office;
    private int ramal;
    private double semiannualRevenue;

    public Managers(String name, String cpf, double salary, String office, int ramal, double semiannualRevenue, Address address) {
        super(name, cpf, salary, address);
        this.office = office;
        this.ramal = ramal;
        this.semiannualRevenue = semiannualRevenue;
    }

    public Managers() {
        super();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double getSemiannualRevenue() {
        return semiannualRevenue;
    }

    public void setSemiannualRevenue(double semiannualRevenue) {
        this.semiannualRevenue = semiannualRevenue;
    }

    @Override
    public double viewBonus() {
        return getSemiannualRevenue() * 0.05; // 5%
    }

    @Override
    public String getDetails() {
        return """
                Name: %s, CPF: %s, Office: %s, Ramal: %d, Semiannual revenue: %.2f
                Address: %s
                Salary: %.2f
                Bonus: 5%% - R$ %.2f
                """.formatted(getName(), getCpf(), getOffice(), getRamal(), getSemiannualRevenue(), getAddress().getCompleteAddress(), getSalary(), viewBonus());
    }
}
