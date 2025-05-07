// Main.java
public class Main {
    public static void main(String[] args) {

        // O que estamos criando aqui? Para que serve cada instância?

        Developer dev = new Developer(1, "Alice", 5000.0);
        Manager mgr = new Manager(2, "Bob", 5000.0, 5);

        // Por que usamos getName() em vez de acessar diretamente 'name'?
        // Qual nível de encapsulamento isso demonstra?

        System.out.println("Developer name (via getName): " + dev.getName());

        System.out.println("Developer salary: " + dev.salary);
        // id é público: por que conseguimos acessá-lo diretamente?

        System.out.println("Manager ID (public): " + mgr.id);


        // Associação: criamos um departamento e adicionamos funcionários a ele
        Department dept = new Department("TI");

        // O que faz o método addEmployee? Qual relação isso representa?
        dept.addEmployee(dev);
        dept.addEmployee(mgr);

        // E se chamássemos addEmployee(null)? O que aconteceria?
        // Como poderíamos evitar adicionar valores nulos?


        System.out.println("\n=== BÔNUS DOS FUNCIONÁRIOS ===");
        dept.showAllBonuses();

   
        /*

        TODAS AS PERGUNTAS ESPALHADAS NO CÓDIGO: 

         1. Na classe Department:
            - Que tipo de conceito é usado aqui? (associação, agregação, composição?)

         2. No construtor de Manager:
            - Por que o construtor dessa classe é diferente da classe Developer?

         3. Na declaração `extends Employee` em Developer:
            - Para que serve esse `extends`? Ele faz parte de qual conceito
              (herança, polimorfismo, encapsulamento)?

         4. No uso de `super(...)` em Developer:
            - Para que usamos esse método `super`?

         5. No método calculateBonus() em Developer e Manager:
            - Qual conceito de POO é utilizado aqui? (polimorfismo, herança,
              encapsulamento?)

         6. Na classe abstrata Employee:
            - O que é uma classe abstrata? Como ela é usada?
            - Explique os modificadores de acesso (private, protected, public):
              por que são diferentes e como são usados.

         7. No atributo `private String name` em Employee:
            - Por que esse atributo é private? Que vantagens isso traz?

         8. No atributo `protected double salary` em Employee:
            - Onde eu posso acessar essa variável? Onde eu não posso?

         9. No atributo `public int id` em Employee:
            - Por que esse atributo é public? Quais casos justificam isso?

        10. No construtor `public Employee(...)`:
            - O construtor está certo? Por que é interessante definir
              seu acesso como public?

        11. Nos getters e setters de Employee:
            - Para que servem os getters e setters? Quando devo usar?

        12. No método abstrato `public abstract double calculateBonus();`:
            - O que é um método abstrato? Como ele é usado?

        13. No método `@Override public String toString()` em Employee:
            - O que é o método toString()? Como e quando é utilizado?

        14. No uso de `new Developer(...)` e `new Manager(...)` em Main:
            - O que estamos criando aqui? Para que serve cada instância?

        15. No uso de `dev.getName()` em Main:
            - Por que usamos getName() em vez de acessar diretamente name?
            - Qual nível de encapsulamento isso demonstra?

        16. No acesso direto a `mgr.id` em Main:
            - Por que conseguimos acessá-lo diretamente?


        17. No método addEmployee(Employee e) em Department:
            - O que faz esse método? Qual relação ele representa?
            - E se chamássemos addEmployee(null)? O que aconteceria?
              Como evitar valores nulos?

        18. No método showAllBonuses() em Department:
            - Quem implementa calculateBonus()? Onde o método é definido?
            - Como o polimorfismo aparece aqui em tempo de execução?

        19. Questões finais gerais:
            a. Qual a diferença entre herança e associação?
            b. Como o polimorfismo ajuda a deixar o código mais flexível?
            c. Quais modificadores de acesso você usaria para cada atributo
               em um sistema real?
            d. Em que situações você escolheria agregação em vez de composição,
               ou vice-versa?
         */
    }
}
