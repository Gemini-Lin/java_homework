public class TestBook {
    static class Book {
        String BookName;
        String AuthorName;
        String email;
        String gender;
        double price;
        int qty = 0;
        Book(String BookName,String AuthorName, String email,String gender,double price)
        {
            this.BookName=BookName;
            this.AuthorName=AuthorName;
            this.email=email;
            this.gender=gender;
            this.price=price;
        }
        Book(String BookName,String AuthorName, String email,String gender,double price,int qty)
        {
            this.BookName=BookName;
            this.AuthorName=AuthorName;
            this.email=email;
            this.gender=gender;
            this.price=price;
            this.qty=qty;
        }
        public String getName()
        {
            return BookName;
        }
        public String  getAuthorName()
        {
            return AuthorName;
        }
        public String  getAuthorEmail()
        {
            return email;
        }
        public String getAuthorGender()
        {
            return gender;
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
            return ("Book[name="+BookName+",authors={Author[name="+AuthorName+",email="+email+",gender="+gender+"],price="+price+",qty="+qty);
        }
        public String getAuthorNames()
        {
            return ("AuthorNames:"+AuthorName);
        }
    }
    public static void main(String args[])
    {
        int qty = 100;
        Book B= new Book("MyWorld","Gemini","Geminilinjun@gmail.com","male",50,100);
        String BookName;
        String AuthorName;
        String email;
        String gender;
        double price;
        int quantity;
        BookName =B.getName();
        AuthorName=B.getAuthorName();
        email=B.getAuthorEmail();
        gender=B.getAuthorGender();
        price=B.getPrice();
        quantity=B.getQty();
        String str1;
        str1=B.toString();
        System.out.println(str1);
        System.out.println("BookName="+BookName);
        System.out.println("AuthorName="+AuthorName);
        System.out.println("Email="+email);
        System.out.println("Gender="+gender);
        System.out.println("Price="+price);
        System.out.println("Quantity="+quantity);
    }
}
