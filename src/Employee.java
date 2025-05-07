public abstract class Employee {
    // O que é uma classe abstrata? Como ela é usada?
    // Explique os modificadores de acesso, porque eles são diferentes e como são usados.

    private String name;          
    protected double salary;      // Onde eu posso acessar essa variável? onde eu não posso?
    public int id;                

    // O construtor está certo? Porque é interressante difinir seu acesso como public? 
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Para que serve os getters e setters? quando devo usar? 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // O que é um método abstrato? Como ele é usado?
    public abstract double calculateBonus();

    // O que é o método toString? Como ele é usado?
    @Override
    public String toString() {
        return String.format("Employee[id=%d, name=%s, salary=%.2f]", id, name, salary);
    }
}
