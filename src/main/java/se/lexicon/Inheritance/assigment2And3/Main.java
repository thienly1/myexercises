package se.lexicon.Inheritance.assigment2And3;

/**
 * 3. Continue working with the program you created in previous Exercise.
 * a. Instantiate three books, one for each type of book, and store them in an array of type Book.
 * b. Iterate through the array and only print out the books that are instanceof the Loanable interface.
 * c. Iterate through the array and only print out the book that is not loanable.
 * d. Iterate through the array and only print out the book that has the category CHILD.
 * e. Iterate through the array and only print out the book that has the category ADULT
 */
public class Main {
    public static void main(String[] args) {
        ChildBook childBook = new ChildBook("first book", "aba", 2020, 120);
        YoungAdultBook youngAdultBook = new YoungAdultBook("second book", "Lya", 2022,200);
        ReferenceBook referenceBook = new ReferenceBook("third book", "Sarah", 2021,153);
        Book [] names = new Book[3];
        names[0] = childBook;
        names[1] = youngAdultBook;
        names[2] = referenceBook;
        childBook.getCategory();
        youngAdultBook.getCategory();
        referenceBook.getCategory();
        //childBook.loan();
        //youngAdultBook.loan();

        for ( Book i : names){
            if (i instanceof Loanable) { // if i is instantiated from Loanable Interface
                System.out.println(" The books have instance of The Loanable interface are : " +i);
            }
            if (i.getCategory().equals(Category.NOT_LOANABLE)){
                System.out.println("The book that is not loanable is: " +i);
            }
        }
       for( Book i : names){
            if(i.getCategory().equals(Category.CHILD)){
                System.out.println(" The book that has category CHILD is : " + i);
            }
        }
       for (Book i : names){
           if ( i.getCategory().equals(Category.ADULT)){
               System.out.println(" The book that has category ADULT is : " + i);
           }
       }
    }
}
