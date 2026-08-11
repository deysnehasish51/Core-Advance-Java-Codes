public class LibraryBook
{
    int bookId;
    String bookTitle;
    boolean isAvailable=true;
    int noOfBook=10;

    public void borrowBook(int quantity)
    {
        if(this.isAvailable==true&&avalableQuantity>0)
        {
            System.out.println("Congratulations ! Book is Issued");
            this.avalableQuantity-=quantity;
        }
        else{
            System.out.println("Sorry ! Book is not Available");
        }
    }
    public void returnBook()
    {
        if(this.isAvailable==false)
        {
            System.out.println("Book is Returned Successfully.");
            this.isAvailable=true;
        }
        else{
            System.out.println("Book is already Returned.");
        }
    }

    public void displayDetails(int bookId,String bookTitle)
    {
        this.bookId=bookId;
        this.bookTitle=bookTitle;

        System.out.println("---- Book Details ----");
        System.out.println("Book ID : "+bookId);
        System.out.println("Book Title : "+bookTitle);
        System.out.println("Book Availability : "+this.isAvailable);
    }
    public static void main(String []args)
    {
        LibraryBook b1 = new LibraryBook();
        
        b1.borrowBook();
        b1.returnBook();
        b1.displayDetails(14322,"Atomic Habits");
    }
}