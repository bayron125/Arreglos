import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion4 {
    public static void main(String[] args) {
        int[] a =new int[10];
        int [] b = new int[a.length-1];
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese 10 valores");
        for (int i = 0; i<a.length; i++){
            a[i] = x.nextInt();
        }
        System.out.println("Ingrese la posición que desea eliminar:");
        int posicion= x.nextInt();

        for (int i=posicion; i<a.length-1; i++){
            a[i]=a[i+1];
        }
        System.arraycopy(a, 0, b, 0, b.length);
        for(int i=0; i<b.length; i++){
            System.out.println("Posición #" + i +": "+b[i]);
        }

    }
}
