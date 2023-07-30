import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        for (int i=1 ; i<=12;i++)
//            for (int j = 1; j <= 12; j++) {
//                int a = i * j;
//                System.out.print("\t" + i + "*" + j + "=" + a + "\t");


//            Scanner scanner = new Scanner(System.in);
//            System.out.print("enter the word");
//            String word = scanner.nextLine();}

//        }
//        double x = 50;
//        double n = 65;
//        double firstsell =x*(100/80) ;
//        System.out.println(n);

//        double numPensSold = (int) (x * 0.80);
//        double profitPercentage = 0.20;
//        int sellingPriceWithProfit = calculateSellingPrice(firstsell, numPensSold, profitPercentage);
//
//        int remainingPens = x - numPensSold;
//        int lossPerPen = 9;
//        int sellingPriceWithLoss = calculateSellingPrice(firstsell, remainingPens, -lossPerPen);
//
//        int totalProfit = sellingPriceWithProfit + sellingPriceWithLoss - firstsell;
//
//        System.out.println("Total Profit: " + totalProfit + " Vials");
//    }
//
//    private static int calculateSellingPrice(int totalCost, int numPens, double profitPercentage) {
//        double costPerPen = (double) totalCost / numPens;
//        double profitPerPen = costPerPen * profitPercentage;
//        return (int) (costPerPen + profitPerPen);


//    Scanner d = new Scanner(System.in);
//        String input = d.nextLine();
//        String[] word = input.split(" ");
//
//            System.out.println("Reversed senlence");
//            for (int i = word.length - 1; i >= 0; i--) {
//                System.out.print(word[i] + " ");
//            }


//  int Random;
//                Scanner scanner = new Scanner(System.in);
//                Scanner random = new Scanner(System.in);
//
//                System.out.println("Choose (Stone/Paper/Scissors) and press Enter.");
//
//                String[] choices = {"Stone", "paper", "scissors"};
//
//                 {
//                    String playerChoice = scanner.next().toLowerCase();
//
//                    if (playerChoice.equals("Stone") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
//                        String computerChoice = choices[random.nextInt(choices.length)];
//
//                        System.out.println("computerChoice: " +computerChoice );
//                        String playerChoice = scanner.next().toLowerCase();
//
//                        if (playerChoice.equals("حجر") || playerChoice.equals("ورقة") || playerChoice.equals("مقص")) {
//                            String computerChoice = choices[random.nextInt(choices.length)];
//
//                            System.out.println("اختيار الكمبيوتر: " + computerChoice);
//
//                            String result = determineWinner(playerChoice, computerChoice);
//                            System.out.println(result);
//
//                            System.out.println("هل ترغب في اللعب مرة أخرى؟ (نعم/لا)");
//                            String playAgain = scanner.next().toLowerCase();
//                            if (!playAgain.equals("نعم")) {
//                                break;
//
//
//            }
//            }
//        }}
//
//
        int userChoice, computerChoice, rock, paper, scissors;

        Scanner input = new Scanner (System.in);

        Random rnd = new Random();

        rock = 0;
        paper = 1;
        scissors = 2;


        System.out.println("ROCK - PAPER - SCISSORRS GAME");
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        userChoice = input.nextInt();
        while (userChoice > 2) {
            System.out.println("give number between 0 and 2");
            userChoice = input.nextInt();
        }

        if (userChoice == rock)
        {
            System.out.println("User chose ROCK");
        }
        else
        {
            if(userChoice== paper)
            {
                System.out.println("User chose PAPER");
            }
            else
            {
                System.out.println("User chose SCISSORS");
            }
        }

        computerChoice = rnd.nextInt(3);


        if(computerChoice == rock)
        {
            System.out.println("Computer chose ROCK");
        }
        else
        {
            if(computerChoice == paper)
            {
                System.out.println("Computer chose PAPER");
            }
            else
            {
                System.out.println("Computer chose SCISSORS");
            }
        }



        //Draw
        while (userChoice == computerChoice) {
            System.out.println(" try again");


            userChoice = input.nextInt();
            while (userChoice > 2) {
                System.out.println("give number between 0 and 2");
                userChoice = input.nextInt();
            }
            computerChoice = rnd.nextInt(3);

            if (userChoice == rock)
            {
                System.out.println("User chose ROCK");
            }
            else
            {
                if(userChoice== paper)
                {
                    System.out.println("User chose PAPER");
                }
                else
                {
                    System.out.println("User chose SCISSORS");
                }
            }

            if(computerChoice == rock)
            {
                System.out.println("Computer chose ROCK");
            }
            else
            {
                if(computerChoice == paper)
                {
                    System.out.println("Computer chose PAPER");
                }
                else
                {
                    System.out.println("Computer chose SCISSORS");
                }
            }
        }


        if (computerChoice==rock)
        {
            if (userChoice==paper)
            {
                System.out.println("User wins!");
            }
            else
            {
                System.out.println("Computer Wins");
            }
        }
        else if (computerChoice==paper)
        {
            if (userChoice==rock)
            {
                System.out.println("Computer wins");
            }
            else
            {
                System.out.println("User Wins!");
            }
        }
        else if (userChoice==rock)
        {
            System.out.println("User Wins");
        }
        else
        {
            System.out.println("Computer Wins");
        }
    }
}
