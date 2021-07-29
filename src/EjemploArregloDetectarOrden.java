import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros:");

        for (int i = 0; i < a.length; i++) {
            a[i] = x.nextInt();
        }
        boolean descendente=false;
        boolean ascendente=false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
            if(a[i]>a[i+1]){
                descendente = true;
            }
        }
       if(ascendente && descendente){
           System.out.println("arreglo desordenado");
       } else if(ascendente && descendente==false){
           System.out.println("arreglo es ascendente");
       }else{
           System.out.println("arreglo es descendente");

       }

    }
}
