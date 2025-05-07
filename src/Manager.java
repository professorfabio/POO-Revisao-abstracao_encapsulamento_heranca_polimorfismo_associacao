public class Manager extends Employee {
    private int teamSize;  

    // por que o contrutor dessa classe é diferente da classe Developer?
    public Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    // Polimorfismo: implementa cálculo de bônus diferente para gerente
    @Override
    public double calculateBonus() {
        return salary * 0.20 + teamSize * 100;  
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
