import java.util.Scanner;
public class Reverseastring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String rev = "";
        for(int i = input.length() - 1; i>=0;i--){
            rev = rev+input.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }
}
//we can also do StringBuilder sb = new StringBuilder(input);
//System.out.println("Reversed String: "+ sb.reverse());
