package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        LibraryManager();
    }

    private static void LibraryManager() {
        //TODO: Add Bound Control
        Ogrenci ogrenci = Ogrenci.CreateOgrenci();
        ArrayList<Book> LibraryList = new ArrayList<>();
        ArrayList<Book> BookInventory = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        String inputCondition = "";
        for (int i = 0; i < 10; i++) {
            LibraryList.add(new Book("book" + i, "writer" + i, 10, "description" + i));
        }
        while (!inputCondition.equalsIgnoreCase("exit")) {
            System.out.println("Commands : {add,remove,list(l),listdata(ld),inventory(inv),buy,sendback(sb),exit}");
            System.out.print("Entry :");
            inputCondition = sc1.nextLine();
            switch (inputCondition) {
                case "add":
                    System.out.println("Book creating ...");
                    LibraryList.add(Book.CreateBook());
                    System.out.println("Book created");
                    break;
                case "remove":
                    ListBooks(LibraryList);
                    System.out.println("Type bookID to remove");
                    int bookId = Integer.parseInt(sc1.nextLine());
                    System.out.println("Book removed :" + LibraryList.get(bookId - 1).getBookName());
                    LibraryList.remove(bookId - 1);
                    break;
                case "l":
                case "list":
                    ListBooks(LibraryList);
                    break;
                case "ld":
                case "listdata":
                    System.out.println("---- Listing books ----");
                    System.out.println("ID\tName");
                    System.out.println("=====================================");
                    for (int i = 0; i < LibraryList.size(); i++) {
                        LibraryList.get(i).ShowData();
                        System.out.println("=====================================");
                    }
                    break;
                case "buy":
                    ListBooks(LibraryList);
                    System.out.println("Type ID for buy book");
                    int bookID = Integer.parseInt(sc1.nextLine())-1;
                    System.out.println("Book sold !! :" + LibraryList.get(bookID).getBookName());
                    LibraryList.get(bookID).BuyBook(ogrenci.name);
                    BookInventory.add(LibraryList.get(bookID));
                    LibraryList.remove(bookID);
                    break;
                case "sb":
                case "sendback":
                    System.out.println("---- Listing inventory ----");
                    System.out.println("ID\tName");
                    for (int i = 0; i < BookInventory.size(); i++) {
                        System.out.println((i + 1) + "\t" + BookInventory.get(i).getBookName());
                    }
                    System.out.println("Type ID for send books back");
                    int bookid = Integer.parseInt(sc1.nextLine());
                    BookInventory.get(bookid - 1).SendBackToLibrary();
                    LibraryList.add(BookInventory.get(bookid - 1));
                    BookInventory.remove(bookid - 1);
                    break;
                case "inv":
                case "inventory":
                    System.out.println("---- Listing inventory ----");
                    System.out.println("ID\tName");
                    for (int i = 0; i < BookInventory.size(); i++) {
                        System.out.println((i + 1) + "\t" + BookInventory.get(i).getBookName());
                    }
                    break;
                case "$exit": {
                    System.out.println("Leaving from library");
                    break;
                }
            }
        }
        System.out.println("App ended");
        sc1.close();
    }

    private static void ListBooks(ArrayList<Book> LibraryList) {
        System.out.println("---- Listing books ----");
        System.out.println("ID\tName");
        for (int i = 0; i < LibraryList.size(); i++) {
            System.out.println((i + 1) + "\t|" + LibraryList.get(i).getBookName());
        }
    }

    private static void OgrenciManager() {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Ogrenci Sayısı :");
        int ogrenciSayisi = sc1.nextInt();
        sc1.nextLine();
        Ogrenci[] ogrenciler = new Ogrenci[ogrenciSayisi];

        for (int i = 0; i < ogrenciler.length; i++) {
            Ogrenci yeniOgrenci = new Ogrenci();
            System.out.println((i + 1) + ". Ogrenci verileri");


            System.out.print("Ogrenci Adi :");
            yeniOgrenci.name = sc1.nextLine();


            System.out.print("Ogrenci yaşı :");
            yeniOgrenci.age = Integer.parseInt(sc1.nextLine());


            System.out.print("Ogrenci Cinsiyeti :");
            yeniOgrenci.gender = sc1.nextLine();

            System.out.print("Ogrenci Mezun mu {y,n - e,h - t,f}:");

            String yesNo = (sc1.nextLine() + "").toLowerCase();

            if (yesNo.startsWith("y") || yesNo.startsWith("e") || yesNo.startsWith("t")) {
                yeniOgrenci.graduated = true;
            } else {
                yeniOgrenci.graduated = false;
            }
            System.out.println(yeniOgrenci.graduated);
            ogrenciler[i] = yeniOgrenci;
        }

        System.out.println(ogrenciler.length + " adet ogrenci nesnesi oluşturuldu");
        System.out.println("Ogrencileri listelemek için 'list' yazın");
        if (sc1.nextLine().equalsIgnoreCase("list")) {
            System.out.println("============================");
            for (Ogrenci ogrenci : ogrenciler) {
                ogrenci.ShowData();
                System.out.println("============================");
            }
        }
        sc1.close();
    }
}
