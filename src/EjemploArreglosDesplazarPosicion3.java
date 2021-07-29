import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        int[] a =new int[10];
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese 9 valores");
        for (int i = 0; i<a.length-1; i++){
            a[i] = x.nextInt();
        }

        for (int i =0; i<a.length-2; i++){
            int aux=0;
            for (int j= 0; j<a.length-i-2; j++){

                if (a[j]>a[j+1]){
                    aux=a[j+1];
                    a[j+1]=a[j];
                    a[j]=aux;
                }
            }
        }
        for (int i = 0; i<a.length; i++){
            System.out.println("posicion "+i+": "+a[i]);
        }
        System.out.println("ingrese un valor");
        int valor= x.nextInt();
        int posicion=0;
       while (posicion<a.length-1 && valor > a[posicion] ){
           posicion++;
        }


        for (int i=a.length-1; i>posicion; i--){
            a[i]=a[i-1];
        }
        a[posicion]=valor;

        for (int i = 0; i<a.length; i++){
            System.out.println("posicion "+i+": "+a[i]);
        }

    }
}
