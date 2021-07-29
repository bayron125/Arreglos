import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        int[] a= new int[5];
        Scanner x= new Scanner(System.in);
        int max=0;
        System.out.println("Ingrese 5 numeros:");

        for(int i = 0; i< a.length; i++){
            a[i]= x.nextInt();
        }
        for (int i = 1; i<a.length; i++){
            max= (a[max]>a[i])? max:i;
        }
        System.out.println("El numero mayor es: "+a[max]);
    }
}
