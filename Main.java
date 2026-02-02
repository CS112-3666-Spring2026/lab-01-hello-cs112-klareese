public class Main {
    public static void main(String[] args) {
        //PART 1
        System.out.println("Welcome to CS 112!");

        //PART 2
        greeting();
        int doubled = doubleNum(5);
        System.out.println("Double of 5 is " + doubled);
        
        //PART 3
        Book book1 = new Book("Java Fundamentals");
        Book book2 = new Book(book1); 

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
    }

    public static void greeting() {
        System.out.println("Have a great semester!");
    }

    public static int doubleNum(int num) {
        return num * 2;
    }

    //PART 3
    static class Book {
        private String title;

        public Book() {
            title = "Untitled";
        }

        public Book(String title) {
            this.title = title;
        }

        public Book(Book other) {
            this.title = other.title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String toString() {
            return "Book title: " + title;
        }

        public boolean equals(Book other) {
            return this.title.equals(other.title);
        }
    }
}