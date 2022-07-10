package se.lexicon.Inheritance.assigment2And3;

/**
 * 2. Create a program that demonstrates additional features of inheritance.
 * a. Define a class called Book and give it the following fields:
 * title,author,category(enum),year and pages. Add getters and
 * setters.
 * b. Create a default constructor that sets the pages field to 100.
 * Next, create an additional constructor that allows manual setting of
 * the pages field.
 * c. Create category(enum) and give it three different values:
 * CHILD,ADULT and NOT_LOANABLE.
 * d. Define three child classes: ChildBook ,YoungAdultBook
 * and ReferenceBook. All classes should extend the Book class.
 * e. When creating a new ChildBook the category(enum) field should be set to CHILD. (Example:
 * Category.CHILD). Do the same for YoungAdultBook, it’s category(enum) field should be set to
 * ADULT. Lastly, ReferenceBook’s category(enum) should be set to NOT_LOANABLE.
 * f. Create an interface called Loanable. Give this interface a void
 * method with no input parameters and call it loan().
 * g. A ReferenceBook can not be borrowed. Implement the Loanable interface only in the book
 * classes that are able to be borrowed. Next, override the loan() method, and give it a message to
 * print out.
 */
public abstract class Book {


    private String title;
    private String author;
    private Enum category;
    private int year;
    private int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;



    }

    public Book() {
        this.title = "NOT_DEFINED";
        this.author = "DON'T KNOW";
        this.year = 0;
        this.pages = 100;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Enum getCategory() {
        return category;
    }
    public void setCategory(Enum category){
       this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }




}
