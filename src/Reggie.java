import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number (M#####)", "^(M|m)\\d{5}$");
        String choice = SafeInput.getRegExString(in, "Menu: [O]pen [S]ave [V]iew [Q]uit", "^[OoSsVvQq]$");

        System.out.println("\nSSN: " + ssn);
        System.out.println("M number: " + mNumber);
        System.out.println("Menu choice: " + choice);
    }
}