import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        int[] a =new int[10];
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese 10 valores");
        for (int i = 0; i<a.length; i++) {
            a[i] = x.nextInt();
        }
        System.out.println("-------lista------");
        for (int i = 0; i<a.length; i++){
            System.out.println("Posicion #" + i +": "+ a[i]);
        }
        System.out.println("Ingrese un valor que desea adicionar:");
        int valor = x.nextInt();
        System.out.println("Ingrese la posicion en que lo desea adicionar:");
        int posicion= x.nextInt();

        int []b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);

        for(int i =b.length-1; i>posicion; i--){
            b[i]=b[i-1];
        }
        b[posicion]=valor;

        System.out.println("-------lista modificada-");
        for (int i = 0; i<b.length; i++){
            System.out.println("Posicion" + i +": "+ b[i]);
        }
    }
}
