

public class Main {
    public static void main(String[] args) {
        int a = 3, b=2;
        var resultado = a + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Resultado suma a + b : " + resultado);

        resultado = a - b;
        System.out.println("resultado resta a - b = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion a * b = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division a / b = " + resultado2);

        resultado = a % b;
            System.out.println("resultado residuo a % b = " + resultado);

        System.out.println("Numero A");
        if (a % 2  == 0) {
            System.out.println(" es par");
        } else {
            System.out.println(" es impar");
        }
     }
}