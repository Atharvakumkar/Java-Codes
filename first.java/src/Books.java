public class Books {
    String title;
    String author;
    int price;

    public Books(String bktitle, String bkAuthor, int bkPrice) {
        title = bktitle;
        author = bkAuthor;
        price = bkPrice;
    }

    public void details() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);
    }
}

class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Devidas Gulwade: My Guru", "Raj Mohite", 699);
        book1.details();
    }
}
