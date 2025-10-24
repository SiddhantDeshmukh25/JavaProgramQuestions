public class starpattern3 {
    public static void main(String[] args) {


    int n = 9;
    int trows =n;
    int stars =1;
    for(int row=1;row<=trows;row++){
        for(int csp=1;csp<=stars;csp++){
         System.out.print(csp);
        }
        //prep for the next row
        System.out.println();
        if(row<=trows/2){
            stars++;
        }else{
            stars--;
        }
    }
}
}
