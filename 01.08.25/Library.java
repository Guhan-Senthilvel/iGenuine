abstract class Item {
    private String title;
    private String authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Item(String title, String authors) {
        this.title = title;
        this.authors = authors;
    }

    abstract void display();
}

class Book extends Item {
    private String genre;

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public Book(String genre, String title, String authors) {
        super(title, authors);
        this.genre = genre;
    }

    @Override
    void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("Genre: " + getGenre());
    }
}

class BorrowedBook extends Book {
    private String borrowerName;
    private String dueDate;

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public BorrowedBook(String borrowerName, String dueDate, String genre, String title, String authors) {
        super(genre, title, authors);
        this.borrowerName = borrowerName;
        this.dueDate = dueDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Borrower Name: " + getBorrowerName());
        System.out.println("Due Date: " + getDueDate());
    
    }
}

public class Library {
    public static void main(String[] args) {
        // BorrowedBook obj1 = new BorrowedBook("Guhan", "31 Aug", "Thriller", "KGF", "Neel");
        // BorrowedBook obj2 = new BorrowedBook("Giri", "31 Aug", "Horror", "Aranmanai", "Sundar C");
        // Book obj3 = new Book("Comedy", "Comedy Galatta", "Joker Giri");
        // obj1.display();
        // obj2.display();
        // obj3.display();

        Item items[]=new Item[3];
        items[0] = new Book("Comedy", "Comedy Galatta", "Joker Giri");
        items[1] = new BorrowedBook("Guhan", "31 Aug", "Thriller", "KGF", "Neel");
        items[2] = new BorrowedBook("Giri", "31 Aug", "Horror", "Aranmanai", "Sundar C");
        // items[0].display();

        for (Item i : items) {
            i.display();  
        }
    }
}
