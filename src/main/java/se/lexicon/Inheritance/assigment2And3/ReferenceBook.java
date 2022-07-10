package se.lexicon.Inheritance.assigment2And3;

public class ReferenceBook extends Book{

    public ReferenceBook(String title, String author, int year, int pages) {
        super(title, author, year, pages);
        setCategory(Category.NOT_LOANABLE);

    }

    @Override
    public String toString() {
        return "ReferenceBook{}";
    }
}
