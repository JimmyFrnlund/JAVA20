package booklist;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void addBook() {

        System.out.println("Enter nsme of book: ");
        String bookName = input.nextLine();

        System.out.println("Enter name of book ");
        String authorName = input.nextLine();

        Book book = new Book(bookName, authorName);
        books.add(book);
        System.out.println("Book is created");

    }

    public static void showAllBooks() {

        System.out.println(books);
    }

    public static void showBookById() {
        System.out.println("Enter id to find book ");
        int bookId = input.nextInt();
        input.nextLine();

        for (Book book : books) {
            if(book.getId()==bookId){
                System.out.println(book);
            }
            
            
        }
    }
    
    public static void removeBookByName(){
        
        System.out.println("Enter name to remove book");
        String name = input.nextLine();
        
        for (int i = books.size()-1; i >=0 ; i--){
            
            if(books.get(i).getName().equals(name))
                books.remove(books.get(i));
            
        }
    
        
    }
    
    public static void removeBookById(){
        
        System.out.println("Enter Id to remove book");
        int Id = input.nextInt();
        input.nextLine();
        
        for(int i = books.size()-1; i>=0; i--){
            if(books.get(i).getId()==Id){
                books.remove(books.get(i));
            }
            
        }
    }
    
    public static void updateBookName(){
        
        System.out.println("Enter book Id to change book:");
        int Id = input.nextInt();
        input.nextLine();
        
        for(Book book : books){
            
            if(book.getId()==Id){
                System.out.println("Enter new name for book");
                String newName = input.nextLine();
                book.setName(newName);
                System.out.println("Book is updated");
            }
            
        }
    }
    
    public static int numberOfBooks(){
        
        return books.size();
    }

}


