import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("Select (Stone/Paper/Scissors) and press Enter.");
//
//        String[] choices = {"Stone", "paper", "scissors"};
//
//        if (true) {
//            String playerChoice = scanner.next().toLowerCase();
//
//            if (playerChoice.equals("Stone") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
//                String computerChoice = choices[random.nextInt(choices.length)];
//
//                System.out.println("computerChoice: " + computerChoice);
//
//                String result = determineWinner(playerChoice, computerChoice);
//                System.out.println(result);
//
//
//                }
//            } else {
//                System.out.println("Incorrect option, please choose (stone/paper/scissors)");
//            }
//        }
//
//
//    private static String determineWinner(String playerChoice, String computerChoice) {
//        if (playerChoice.equals(computerChoice)) {
//            return "be balanced!";
//        } else if ((playerChoice.equals("Stone") && computerChoice.equals("scissors")) ||
//                (playerChoice.equals("paper") && computerChoice.equals("Stone")) ||
//                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
//            return "Well done, you won!";
//        } else {
//            return "Sorry, you lost!";
//
//               //     Scanner scanner = new Scanner (System.in);
//                    System.out.println("Select (Stone/Paper/scissors) and press Enter.");
//
//                    String[] choices = {"Stone", "Paper", "scissors"};
//
//                    String player1Choice = scanner.next().toLowerCase();
//
//                    while (!(player1Choice.equals("Stone") || player1Choice.equals("paper") || player1Choice.equals("scissors"))) {
//                        System.out.println("Incorrect option, please choose (stone/paper/scissors)");
//                        player1Choice = scanner.next().toLowerCase();
//                    }
//
//                    System.out.println("For player 2, select (stone/paper/scissors) and press Enter.");
//                    String player2Choice = scanner.next().toLowerCase();
//
//                    if (!(player2Choice.equals("Stone") || player2Choice.equals("paper") || player2Choice.equals("scissors"))) {
//                        System.out.println("Incorrect option, please choose (stone/paper/scissors)");
//                        player2Choice = scanner.next().toLowerCase();
//                    }
//
//                    String result = determineWinner(player1Choice, player2Choice);
//                    System.out.println(result);
//
//                }
//
//            System.out.println("String playerChoice + String computerChoice");
//                if (playerChoice.equals(computerChoice)) {
//                    return "be balanced!";
//                } else if ((playerChoice.equals("Stone") && computerChoice.equals("scissors")) ||
//                        (playerChoice.equals("paper") && computerChoice.equals("Stone")) ||
//                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
//
//
//                        return "Player 1 won!";
//                    }
//                    else
//                        return "Player 1 won!";
//                    }
//                }
//

        int userChoice, computerChoice, rock, paper, scissors;

        Scanner input = new Scanner(System.in);

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

        if (userChoice == rock) {
            System.out.println("User chose ROCK");
        } else {
            if (userChoice == paper) {
                System.out.println("User chose PAPER");
            } else {
                System.out.println("User chose SCISSORS");
            }
        }

        computerChoice = rnd.nextInt(3);


        if (computerChoice == rock) {
            System.out.println("Computer chose ROCK");
        } else {
            if (computerChoice == paper) {
                System.out.println("Computer chose PAPER");
            } else {
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

            if (userChoice == rock) {
                System.out.println("User chose ROCK");
            } else {
                if (userChoice == paper) {
                    System.out.println("User chose PAPER");
                } else {
                    System.out.println("User chose SCISSORS");
                }
            }

            if (computerChoice == rock) {
                System.out.println("Computer chose ROCK");
            } else {
                if (computerChoice == paper) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSORS");
                }
            }
        }


        if (computerChoice == rock) {
            if (userChoice == paper) {
                System.out.println("User wins!");
            } else {
                System.out.println("Computer Wins");
            }
        } else if (computerChoice == paper) {
            if (userChoice == rock) {
                System.out.println("Computer wins");
            } else {
                System.out.println("User Wins!");
            }
        } else if (userChoice == rock) {
            System.out.println("User Wins");
        } else {
            System.out.println("Computer Wins");
        }
    }}