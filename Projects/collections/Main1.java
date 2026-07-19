import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Card implements Comparable<Card> {
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

    @Override
    public int compareTo(Card other) {
        return Character.compare(this.symbol, other.symbol);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Card> cardSet = new TreeSet<>();
        Set<Character> uniqueSymbols = new HashSet<>();
        int cardCount = 0;

        while (uniqueSymbols.size() < 4) {
            System.out.println("Enter a card : ");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();
            cardCount++;

            if (!uniqueSymbols.contains(symbol)) {
                uniqueSymbols.add(symbol);
                cardSet.add(new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + cardCount + " cards.");
        System.out.println("Cards in Set are :");
        for (Card card : cardSet) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        scanner.close();
    }
}