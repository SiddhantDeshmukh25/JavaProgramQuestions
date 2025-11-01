public class pattern4 {
    public static void main(String[] args) {
        int n =5;
        int trows = n;
        int stars = n;


        for(int rows=1; rows<=trows;rows++){

            //spaces

            for(int cst=1; cst<=stars;cst++){
                System.out.print("*");
            }
            System.out.println();
            stars--;
        }
    }
}
