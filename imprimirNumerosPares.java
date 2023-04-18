public class imprimirNumerosPares {
    public static void main(String[] args) {

        //criar o array
        int p[] = {2,3,5,7,11,13,18,34};

        for (int i = 0; i < 8; i++) {
          if(p[i]%2==0) {
                System.out.println(p[i]);
            }
        }
    }
}
