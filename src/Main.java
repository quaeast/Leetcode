import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[500];
        int k = 0;
        while (true) {
            String tempId = scan.next();
            String tempName = scan.next();
            double tempPrice = scan.nextDouble();
            if (tempId.equals("0")) break;
            books[k++] = new Book(tempId, tempName, tempPrice);
        }
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (books[j].getPrice() < books[j + 1].getPrice()) {
                    Book t = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(books[i].getId() + " " + books[i].getName() + " " + String.format("%.2f", books[i].getPrice()));
        }
    }


}

class Book {
    private String id;
    private String name;
    private double price;

    public Book(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}