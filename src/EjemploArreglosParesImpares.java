import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;

        a=new int[10];
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese 10 números:");
        for(int i = 0; i<a.length; i++){
            a[i] = x.nextInt();
        }
        int maxPar=0;
        int maxImpar=0;
        for(int i = 0; i<a.length; i++){
            if ( a[i]%2==0) {
                maxPar++;
            }else{
                maxImpar++;
            }
        }
        pares=new int[maxPar];
        impares= new int[maxImpar];

        int j = 0, k = 0;

        for(int i = 0; i<a.length; i++) {
            if ( a[i]%2==0) {
                pares[j++]=a[i];
            }else{
                impares[k++]=a[i];
            }


        }

        System.out.println("pares");
        for (int n:pares) {
            System.out.println(n);
        }
        System.out.println("\n Impares");
        for (int n:impares) {
            System.out.println( n);
        }
    }
}
