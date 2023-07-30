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


    Scanner d = new Scanner(System.in);
        String input = d.nextLine();
        String[] word = input.split("");

            System.out.println("Reversed senlence");
            for (int i = word.length - 1; i >= 0; i--) {
                System.out.print(word[i] + "");
            }
        }
    }


