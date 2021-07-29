public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int [] numeros= new int[10];
        int [] numerosB= new int[10];
        int total= numeros.length;

        for (int i = 0; i < total; i++){
            numeros[i] = i + 1;
        }
        for (int n:numeros) {
            System.out.println("numero :"+ n);
        }

        System.out.println("--------organizado intercalado");
        int j=0;
        for(int i = 0; i<total-i; i++){
            numerosB[j++]=numeros[i];
            numerosB[j]=numeros[total-i-1];
            j++;
        }
        for(int i = 0; i<total; i++){
            System.out.println("valor "+(i+1)+" ="+numerosB[i]);
        }
    }
}
