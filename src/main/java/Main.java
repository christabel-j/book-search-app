/*
* Controls user menu:
*   - ask user for search term
    - call service
    - print results
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("## 📚 Book Search & Info App 📚 ##");

        Scanner scanner = new Scanner(System.in); // scanner object for user input

        boolean appRunning = true;

        while (appRunning){
            // prompt to ask user to search for book
            System.out.println("""
                Type an option:
                A: Search book
                B: Exit app
                """);

            try {
                String menuInput = scanner.nextLine();
                if (menuInput.equalsIgnoreCase("A")) {
                    System.out.print("Enter your search query: ");
                    String bookQuery = scanner.nextLine();
                    System.out.println("Searching '" + bookQuery + "'...");

                    // API call
                    String jsonResponse = bookService.callAPI(bookService.buildURL(bookQuery));
                    bookService.parseBooks(jsonResponse);

                } else if (menuInput.equalsIgnoreCase("B")) {
                    System.out.println("Bye, happy reading :)");
                    appRunning = false;
                } else {
                    System.out.println("Invalid option. Please type A or B.");
                }
            } catch (Exception e) {
                System.out.println("Error. Try again");
                throw new RuntimeException(e);
            }
        }



    }
}
