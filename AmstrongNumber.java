import com.sun.jdi.PathSearchingVirtualMachine;

public class AmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isAmstrong(153));}
        public static boolean isAmstrong(int n){
            int nod = countDigits(n);
            int on =n;
            int sum =0;
            while (n>0) {
                int rem = n % 10;
                sum += Math.pow(rem, nod);
                n = n / 10;
            }
            if(sum ==on){
                return true;

            }else{
                return false;
            }
        }
        public static int countDigits(int n){
            int nod = 0;
            while(n>0){
                n=n/10;
                nod++;
            }
            return nod;
        }
    }

