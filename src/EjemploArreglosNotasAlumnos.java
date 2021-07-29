import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        double[] matematicas, historia, lenguaje;
        matematicas = new double[7];
        historia = new double[7];
        lenguaje = new double[7];
        double sumaMatematicas=0, sumaHistoria=0,sumaLenguaje=0;

        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudianes para matematicas");
        for ( int i = 0; i<matematicas.length; i++){
            matematicas[i]= x.nextDouble();
            sumaMatematicas+=matematicas[i];
        }
        double promMatematicas=sumaMatematicas/matematicas.length;

        System.out.println("Ingrese 7 notas de estudianes para historia");
        for ( int i = 0; i<historia.length; i++){
            historia[i]= x.nextDouble();
            sumaHistoria+=historia[i];
        }
        double promHistoria=sumaHistoria/historia.length;

        System.out.println("Ingrese 7 notas de estudianes para lenguaje");
        for ( int i = 0; i<lenguaje.length; i++){
            lenguaje[i]= x.nextDouble();
            sumaLenguaje+=lenguaje[i];
        }
        double promLenguaje=sumaLenguaje/lenguaje.length;

        double promTotal= (promMatematicas+promHistoria+promLenguaje)/3;

        System.out.println("Promedio clase matematicas: "+promMatematicas);
        System.out.println("Promedio clase historia:    "+promHistoria);
        System.out.println("Promedio clase lenguaje:    "+ promLenguaje);
        System.out.println("Promedio total :            "+ promTotal);

        System.out.println("ingrese el numero de alumno a evaluar: ");

        int identificador= x.nextInt();
        System.out.println("Matematicas : " + matematicas[identificador-1]);
        System.out.println("Historia    : " + historia   [identificador-1]);
        System.out.println("Lenguaje    : " + lenguaje   [identificador-1]);
        System.out.println("Promedio    : " + ((matematicas[identificador-1]+
                historia[identificador-1]+lenguaje[identificador-1])/3));
    }
}
