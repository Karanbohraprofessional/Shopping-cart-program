import java.util.Scanner;
        public class main
        {
            public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println(" what item would you like to buy ? :");
                String item1 = scanner.nextLine();

                System.out.println(" What is the price for each?: ");
                double price = scanner.nextDouble();

                System.out.println(" How many would you like ? : ");
                int quantity = scanner.nextInt();

                System.out.println(" You have bought " + quantity  +  item1 + "/s");

                System.out.println(" Your total is $" + price * quantity);

                System.out.println(" Thank you!");

                System.out.println(" Please visit again ");
            }
        }