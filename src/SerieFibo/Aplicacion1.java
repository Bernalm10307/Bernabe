package SerieFibo;

public class Aplicacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V1=0;
        int V2=1, V3;
        int i=1;
        System.out.println("Serie Fibonacci");
        while (i<10) {
            V3 = V1 + V2;
            V1 = V2;
            V2 = V3;
            i++;
            System.out.println(V3);
        }

	}

}
