public class Book {
    static class Author
    {
        String AuthorName;
        String email;
        char gender;
        public void  setAuthor(String AuthorName,String email,char gender)
        {
            this.AuthorName=AuthorName;
            this.email=email;
            this.gender=gender;
        }
    }
    int length=1;
    Author[] authors = new Author[length];
    String BookName;
    double price;
    int qty = 0;
    void Book(String BookName,Author[] authors, double price)
    {
        this.BookName=BookName;
        this.authors=authors;
        this.price=price;
    }
    void Book(String BookName,Author[] authors,double price,int qty)
    {
        this.BookName=BookName;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName()
    {
        return BookName;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setQty(int qty)
    {
        this.qty=qty;
    }
    public String toString()
    {
        return ("Book[name="+BookName+",authors={Author[name="+authors[0].AuthorName+",email="+authors[0].email+",gender="+authors[0].gender+"]},price="+price+",qty="+qty+"]");
    }
    public String getAuthorNames()
    {
        return ("AuthorNames:"+authors[0].AuthorName);
    }
    public static void main(String args[])
    {
        Book B = new Book();
        Book.Author A[] = new Book.Author[1];
        A[0]= new Book.Author();
        A[0].setAuthor("Gemini","Gemini-Lin",'M');
        B.Book("MyWorld",A,2000.0,1000);
        System.out.println(B.toString());
        System.out.println(B.getAuthorNames());
        System.out.println("\n"+"AfterModify----"+"\n");
        B.setPrice(3000.0);
        B.setQty(2000);
        System.out.println(B.toString());
        System.out.println(B.getAuthorNames());
    }
}

