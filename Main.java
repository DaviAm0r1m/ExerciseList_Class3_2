package questao;

public class Main {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Joao", "Silva", 2000.00);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3000.00);

        System.out.println("Salario anual:");

        System.out.println(empregado1.getPn() + " " + empregado1.getSn() + ": R$ " + empregado1.getSalarioAnual());

        System.out.println(empregado2.getPn() + " " + empregado2.getSn() + ": R$ " + empregado2.getSalarioAnual());

        empregado1.setSm(empregado1.getSm() * 1.10);
        empregado2.setSm(empregado2.getSm() * 1.10);

        System.out.println("\nSalario anual depois do aumento de 10%:");

        System.out.println(empregado1.getPn() + " " + empregado1.getSn() + ": R$ " + empregado1.getSalarioAnual());

        System.out.println(empregado2.getPn() + " " + empregado2.getSn() + ": R$ " + empregado2.getSalarioAnual());
    }
}