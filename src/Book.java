
/*This program will enable a class to be created for a book where a title,price,ISBN pages
* and number of pages will be included*/
public class Book {
//Declares attributes of class
    private String title,isbn;
    private float price;
    private int noPages;


    //Constructor Methods
    public Book()
    {
        setTitle("No Title");
        setPrice(0.00f);
        setIsbn("No ISBN");
        setNoPages(0);
    }


    public Book(String title,float price,String isbn,int noPages)
    {
        setTitle(title);
        setPrice(price);
        setIsbn(isbn);
        setNoPages(noPages);
    }

    /*public Book(String title,float price,String isbn,int noPages)
    {
       this("Unknown,"Unknown",0,0.0f)
    }*/

    //Mutator Methods
    public void setTitle(String title)
    {
      this.title = title;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public void setNoPages(int noPages)
    {
        this.noPages = noPages;
    }


    //Accessor Methods
    public String getTitle()
    {
        return title;
    }

    public float getPrice()
    {
        return price;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public int getNoPages()
    {
        return noPages;
    }


    public String toString()
    {
      return String.format("%-20s%-20.2f%-20s%-20d",getTitle(),getPrice(),getIsbn(),getNoPages());

    }
}
