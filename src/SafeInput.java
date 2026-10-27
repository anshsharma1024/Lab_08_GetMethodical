import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int value = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
        } while (!done);

        return value;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double value = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a number, not: " + trash);
            }
        } while (!done);

        return value;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Out of range. Enter a value from " + low + " to " + high + ".");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
        } while (!done);

        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                if (value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Out of range. Enter a value from " + low + " to " + high + ".");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a number, not: " + trash);
            }
        } while (!done);

        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean result = false;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.matches("[YyNn]"))
            {
                result = response.equalsIgnoreCase("Y");
                done = true;
            }
            else
            {
                System.out.println("You must enter Y or N, not: " + response);
            }
        } while (!done);

        return result;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Invalid input: " + response + " does not match the required pattern.");
            }
        } while (!done);

        return response;
    }

    public static void prettyHeader(String msg)
    {
        final int WIDTH = 60;
        final int INNER = WIDTH - 6;   // space between the 3 stars on each end

        // top row of stars
        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        // middle row: 3 stars, centered message, 3 stars
        int left = Math.max(0, (INNER - msg.length()) / 2);
        int right = Math.max(0, INNER - msg.length() - left);

        System.out.print("***");
        for (int i = 0; i < left; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < right; i++)
        {
            System.out.print(" ");
        }
        System.out.println("***");

        // bottom row of stars
        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}