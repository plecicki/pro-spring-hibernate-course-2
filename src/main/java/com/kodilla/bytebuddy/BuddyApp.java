package com.kodilla.bytebuddy;

import java.util.List;

public class BuddyApp {

    public static void main(String[] args) throws Exception {
        List<Book> books = BooksGenerator.generate(100);
        BooksFilter booksFilter = new BooksFilter(books);
        List<Book> filteredBooks = booksFilter.onlyBooksOlderThan(20);
        System.out.println(filteredBooks.size());

        //Exercise at end of module
        JavaAgentController controller = new JavaAgentController();
        boolean sthIsDone = controller.isUserDoingSomething();
        System.out.println("Main method: User is doing: " + sthIsDone);
    }
}
