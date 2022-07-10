package se.lexicon.Inheritance.assigment2And3;

public class YoungAdultBook extends Book implements Loanable{

    @Override
    public void loan() {
        System.out.println("You are loanable child and adult books");
    }

    public YoungAdultBook(String title, String author, int year, int pages) {
        super(title, author, year, pages);
        setCategory(Category.ADULT);
    }

    @Override
    public String toString() {
        return "YoungAdultBook{}";
    }
}
