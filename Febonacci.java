public class Febonacci {
    public static void main(String[] args) {
        int n =11;
        int a =0;
        int b = 1;
        int count =1;
        while(count<= n+1){
            System.out.println(a);

            int sum = a+b;
            a=b;
            b=sum;
            count = count+1;
        }
    }
}
