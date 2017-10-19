/*This problem will have a Book object to show the title,price,ISBN and the
* number of pages*/
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        String title,isbn;
        float price;
        int noPages;

        Book bk1 = new Book();
        Book bk2 = new Book("Ask and the Answer",2.45f,"586-3-53-196839-0",5999);

        Scanner input = new Scanner(System.in);

        System.out.println("\n" + bk1.toString());

        System.out.println(bk2.toString());


        System.out.print("\nPlease enter the name of your favourite book:");
        title = input.nextLine();
        System.out.print("Please enter the price for the book:");
        price = input.nextFloat();
        input.nextLine();
        System.out.print("Please enter the ISBN of your favourite book:");
        isbn = input.nextLine();
        System.out.print("Please enter the number of pages of your favourite book:");
        noPages = input.nextInt();

        Book bk3 = new Book(title,price,isbn,noPages);

        System.out.println("\n" + bk3.toString());

       input.nextLine();

        System.out.print("\nPlease enter the name of your least favourite book:");
        title = input.nextLine();
        System.out.print("Please enter the price for the book:");
        price = input.nextFloat();
        input.nextLine();
        System.out.print("Please enter the ISBN of your least favourite book:");
        isbn = input.nextLine();
        System.out.print("Please enter the number of pages of your least favourite book:");
        noPages = input.nextInt();



        Book bk4 = new Book(title,price,isbn,noPages);

        System.out.println("\n" + bk4.toString());

    }
}
