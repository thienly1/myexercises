package se.lexicon.string;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args) {
        String java = "Java";                  //1. What is the length of the String: "Java" ?
        System.out.println(java.length());

        String sentence1 = "Long example sentence"; //1. What char is at index position 6 in the following String:"Long example sentence" ?
        System.out.println(sentence1.charAt(6));

        String sentence2 = "Even longer example sentence"; //2. What is the index position of 'o' in the following String:"Even longer example sentence" ?
        System.out.println(sentence2.indexOf("o"));

        /*
        3. Given the following String: "Ok this is not as long!" create a substring of only "not as long" (excluding the
 exclamation point) and print it out.
         */
        String sentence3 = "Ok this is not as long!";
        System.out.println(sentence3.substring(11, 22));

        /* 4. Convert the following String: "CAPS EQUALS SCREAMING" to
         * lowercase and print it out. Then convert it back to
         * uppercase and print it out again.
         */
        String sen4 = "CAPS EQUALS SCREAMING";
        System.out.println(sen4.toLowerCase());
        System.out.println(sen4.toUpperCase());

        /*
        5. Correct the following String: "Java is the worst
 * programming language!" by replacing the (obviously
 * incorrect) word "worst" with the word "best". Then print
 * out the sentence.
         */
        String sen5 = "Java is the worst programming language!";
        System.out.println(sen5.replace("worst", "best"));

        /*6. What is the output of the following String:
         * "\tJ\ta\tv\ta\t" after you trim it?
         */
        String sen6 = "\tJ\ta\tv\ta\t";
        System.out.println(sen6);
        System.out.println(sen6.trim());

        /*7. Parse the following int: 20 to a String and add a 20 to the
         * end of the String. Printing it out should return: "2020".
         */
        String sen7 = "20";
        System.out.println(sen7.replace("0", "020"));
        System.out.println(sen7.concat(sen7));

        /*
        8. Oil and water don't go well together. Given the String:
 * "Oil and Water", split them up into the words "Oil","Water"
 * and store them in a String array.
         */
        String sen8 = "Oil and Water";
        String[] array = sen8.split(" and ");
        System.out.println(Arrays.toString(array));

         /*9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
         * into an array. Print out all names separately.
         */
        String sen9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arrays = sen9.split(",");
        System.out.println(Arrays.toString(arrays));

        /*10. Convert the following String: "ThisShouldBeConverted" to
         * a char array. Iterate through the char array and print out
         * each element.
         */
        String sen10 = "ThisShouldBeConverted";
        String[] charec = sen10.split("");
        System.out.println(Arrays.toString(charec));

        /*
         11. Convert the following char[]: {'J','a','v','a'} to a
 * String and print it out
         */
        char[] sen11 = {'J', 'a', 'v', 'a'};
        String result ="";
        for ( int i= 0; i< sen11.length; i++){
        result = result.concat(String.valueOf(sen11[i]));
        }
        System.out.println(result);
        String joinName = "";
        String delimit = "";
        for (int j = 0; j< sen11.length; j++){
            joinName = String.join(delimit, String.valueOf(sen11));
        }
        System.out.println(" Join an array = " + joinName);
    }
}
