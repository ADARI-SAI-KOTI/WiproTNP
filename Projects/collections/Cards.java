import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Card {
    private char symbol;
    private int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, List<Card>> cardMap = new TreeMap<>();

        System.out.print("Enter Number of Cards : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter card " + i + ": ");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();

            Card card = new Card(symbol, number);
            
            if (!cardMap.containsKey(symbol)) {
                cardMap.put(symbol, new ArrayList<>());
            }
            cardMap.get(symbol).add(card);
        }

        System.out.print("Distinct Symbols are : ");
        for (Character symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        for (Map.Entry<Character, List<Card>> entry : cardMap.entrySet()) {
            char symbol = entry.getKey();
            List<Card> cards = entry.getValue();

            System.out.println("Cards in " + symbol + " Symbol");
            
            int sum = 0;
            for (Card card : cards) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        scanner.close();
    }
}