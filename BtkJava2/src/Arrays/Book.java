package Arrays;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Book {
    private String bookName;
    private String writer;
    private int price;
    private String description;
    private boolean ForSale = true;
    private boolean isSold = false;
    private String buyer;

    public Book() {
    }

    public Book(String bookname, String writer, int price, String description) {
        this.bookName = bookname;
        this.writer = writer;
        this.price = price;
        this.description = description;
    }

    public void SetData(String bookname, String writer, int price, String description) {
        this.bookName = bookname;
        this.writer = writer;
        this.price = price;
        this.description = description;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void ShowData() {
        System.out.println("Book Name :" + bookName);
        System.out.println("Writer :" + writer);
        System.out.println("Price :" + price);
        System.out.println("Description :" + description);
    }

    public void BuyBook(String newOwner) {
        this.buyer=newOwner;
        System.out.println("Book sold to you");
        this.ForSale = false;
        this.isSold = true;
        System.out.println("---- Receipt ----");
        System.out.println("Payment time : " + LocalDateTime.now().toLocalDate());
        System.out.println("Buyer :" + newOwner);
        System.out.println("Price :"+this.price);
        System.out.println("------------------");
        this.ShowData();
        System.out.println("------------------");
    }

    public void SendBackToLibrary() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Are you sure to send back '" + this.bookName + "' to library? {true,false}");
        if (Boolean.parseBoolean(sc1.nextLine())) {
            System.out.println("Book sending back to library");
            this.isSold = false;
            this.ForSale = true;
        } else {
            System.out.println("Book still on you,dont forget to send back book to library");
            System.out.println("For more detail https://www.libData.com");
        }
    }

    public static Book CreateBook() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Book name :");
        String bookName = sc1.nextLine();

        System.out.print("Writer :");
        String writer = sc1.nextLine();

        System.out.print("Price :");
        int price = Integer.parseInt(sc1.nextLine());

        System.out.print("Description :");
        String description = sc1.nextLine();

        return new Book(bookName, writer, price, description);
    }
}
