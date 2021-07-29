import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a =new int[10];
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese 10 valores");
        for (int i = 0; i<a.length; i++){
            a[i] = x.nextInt();
        }
        int aux = a[a.length-1];
        for(int i= a.length-1; i>0; i--){
            a[i]=a[i-1];
        }
        a[0]=aux;
        System.out.println("Lista desplaza:");
        for (int i = 0; i<a.length; i++){
            System.out.println("posicion "+i+": "+a[i]);
        }
        System.out.println("Por favor ingrese un valor:");
        int valor= x.nextInt();
        System.out.println("Indique por la posición en que lo desea almacenar: ");
        int posicion= x.nextInt();

        for (int i=a.length-1; i>posicion; i--){
            a[i]=a[i-1];
        }
        a[posicion]=valor;

        for (int i = 0; i<a.length; i++){
            System.out.println("posicion "+i+": "+a[i]);
        }

    }
}
