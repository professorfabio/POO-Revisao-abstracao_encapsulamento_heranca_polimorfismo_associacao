
// para que serve esse metodo extends ? Ele faz parte de qual conceito (herança, polimorfismo, encapsulamento)?
public class Developer extends Employee {

    // para que usamos esse metodo super? 
    public Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    // qual conceito de POO é utilizado aqui?
    @Override
    public double calculateBonus() {
        return salary * 0.10;  
    }
}
