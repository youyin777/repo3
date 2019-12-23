public class Main {

    public static void main(String[] args) {



        for (int i = 101; i < 200; i ++){
            for (int j = 2; j < 200 ;j ++){
                int  k = i % j;
                if (i != j && k == 0){
                    break;
                }
                if (i == j && k == 0){
                    System.out.println(j);
                }
            }




        }



    }
}
