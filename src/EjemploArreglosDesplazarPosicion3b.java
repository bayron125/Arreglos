import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {
        int[] a =new int[5];
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese 5 valores");
        for (int i = 0; i<a.length; i++){
            a[i] = x.nextInt();
        }

        for (int i =0; i<a.length-1; i++){
            int aux=0;
            for (int j= 0; j<a.length-i-1; j++){

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
        int[] b= new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println("Ingrese un valor:");
        int valor= x.nextInt();
        int posicion=0;
        while (posicion<a.length-1 && valor > b[posicion] ){
            posicion++;
        }



        for (int i=b.length-1; i>posicion; i--){
            b[i]=b[i-1];
        }
        b[posicion]=valor;

        for (int i = 0; i<b.length; i++){
            System.out.println("posicion "+i+": "+b[i]);
        }

    }
}
