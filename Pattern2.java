public class Pattern2 {
    public static void main(String[] args) {
        int n=4;
        int trows = n;  //kitti rows print hogi

        int spaces = n-1;  //rows mein kitni spaces print hongi
        int stars =1;  //pehle row mein kitne stars print honge
        for(int row =1; row<=trows; row++){
            //current for the current row

            //spaces
            for(int csp=1;csp<=spaces; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst =1;cst<= stars; cst++){
                System.out.print("*");
            }
            //prep for next row
            System.out.println();
            spaces--;
            stars+=2;
        }
    }
}
