public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int [] a = new int[20];
        int [] b = new int[20];
        int [] c = new int[a.length+b.length];

        for (int i= 0; i<a.length; i++){
            a[i]=i+1;
        }
        for (int i = 0; i < a.length; i++){
            b[i]=(i+1)*5;
        }
        int aux=0;
        for (int i = 0; i < c.length/2; i+=5){
            for(int j=0; j < 5; j++) {
                c[aux++] = a[i+j];
            }
            for(int j = 0; j < 5; j++)
                c[aux++] = b[i+j];

        }
        for (int caux:c) {
            System.out.println("num : "+caux);
        }
    }
}
