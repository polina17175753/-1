
public class Main {
    public static void main(String[] args) {

        int[] x = {4, 3, 8, 9, 7};
        int[] y;
        y = new int[]{6, 7, 2, 17, 8};
        int[] z;
        z = new int[]{6, 3 ,8 ,2 , 9};
        int[] ar = new int[5];
        int b = 0;

        for (int i = 0; i < x.length; i++) {
            b = b + ((x[i] - y[i])^2);
        }
        for (int j = 0; j < ar.length; j++) {
            ar[j] = (x[j]*y[j]*z[j]);
            System.out.println(ar[j]);

        }
    }
}



