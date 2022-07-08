import java.util.Scanner;

public class Calculadora {
    private static int primerNumero;
    private static int segundoNumero;
    private static Scanner leerDatos = new Scanner(System.in);

    public static void main(String[] args) {
        boolean estado = true;
        while (estado) {
            Scanner leerDatos = new Scanner(System.in);
            System.out.println("Ingrese la opcion");
            System.out.println("Digite el numero segun la operacion");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Raiz cuadrada");
            System.out.println("6.Potencia");
            System.out.println("7.Salir \n");
            try {
                int op = Integer.parseInt(leerDatos.nextLine());
                switch (op) {
                    case 1:
                        suma();
                        break;

                    case 2:
                        resta();
                        break;

                    case 3:
                        multiplicacion();
                        break;

                    case 4:
                        division();
                        break;
                    case 5:
                        raiz();
                        break;
                    case 6:
                        potencia();
                        break;
                    case 7:
                        salir();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Solo se aceptan numeros");
            }

        }
    }

    private static void potencia() {
        try {
            System.out.println("==========Potencia==========");
            System.out.println("Digite la base");
            primerNumero = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Digite el exponente");
            segundoNumero = Integer.parseInt(leerDatos.nextLine());
            double resultado = Math.pow(primerNumero, segundoNumero);

            System.out.println("El resultado de la potencia es : " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Solo se aceptan numeros");
        }
    }

    private static void raiz() {
        try {
            System.out.println("==========Raiz Cuadrada==========");
            System.out.println("Digite un numero");
            primerNumero = Integer.parseInt(leerDatos.nextLine());
            double resultado = Math.sqrt(primerNumero);

            System.out.println("El resultado de la Raiz cuadrada es : " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Solo se aceptan numeros");
        }
    }

    private static void salir() {
        System.exit(0);
    }

    private static void division() {
        try {
            System.out.println("==========Division==========");
            System.out.println("Digite el numero uno");
            primerNumero = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Digite el numero dos");
            segundoNumero = Integer.parseInt(leerDatos.nextLine());

            if (segundoNumero == 0) {
                System.out.println("La division entre 0 da infinito");
            } else {
                int resultado = primerNumero / segundoNumero;
                System.out.println("El resultado de la division es : " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Error: Solo se aceptan numeros");
        }
    }

    private static void resta() {
        try {
            System.out.println("==========Resta==========");
            System.out.println("Digite el numero uno");
            primerNumero = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Digite el numero dos");
            segundoNumero = Integer.parseInt(leerDatos.nextLine());

            int resultado = primerNumero - segundoNumero;
            System.out.println("El resultado de la resta es : " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Solo se aceptan numeros");
        }
    }

    private static void suma() {
        try {
            System.out.println("==========Suma==========");
            System.out.println("Digite el numero uno");
            primerNumero = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Digite el numero dos");
            segundoNumero = Integer.parseInt(leerDatos.nextLine());

            int resultado = primerNumero + segundoNumero;
            System.out.println("El resultado de la suma es : " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Solo se aceptan numeros");
        }
    }

    private static void multiplicacion() {
        try {
            System.out.println("==========Multiplicacion==========");
            System.out.println("Digite el numero uno");
            primerNumero = Integer.parseInt(leerDatos.nextLine());
            System.out.println("Digite el numero dos");
            segundoNumero = Integer.parseInt(leerDatos.nextLine());

            int resultado = primerNumero * segundoNumero;
            System.out.println("El resultado de la multiplicacion es : " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Solo se aceptan numeros");
        }
    }
}