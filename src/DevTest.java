import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String m = SafeInput.getRegExString(in, "Enter a UC M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("You entered: " + m);
    }
}