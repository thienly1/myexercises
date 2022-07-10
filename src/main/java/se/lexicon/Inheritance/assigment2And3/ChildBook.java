package se.lexicon.Inheritance.assigment2And3;

public class ChildBook extends Book implements Loanable{


    @Override
    public void loan() {
        System.out.println(" You are loanable to borrow child book");
    }

    public ChildBook(String title, String author, int year, int pages) {
        super(title, author, year, pages);
        setCategory(Category.CHILD);
    }

    @Override
    public String toString() {
        return "ChildBook{}";
    }
}

