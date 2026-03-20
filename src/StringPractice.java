public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    myString = "Seadrah";

    // Find the length of the string

    stringLength = myString.length();

    // Concatenate (add) two strings together and reassign the result

    newString = myString + " Berger";

    // Find the value of the character at index 3

    char fourth = myString.charAt(3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

    boolean abc = myString.contains("abc");

    // Iterate over the characters of the string, printing each one on a separate line

    for (int i = 0; i < myString.length(); i++) {
      System.out.println(myString.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable

    ArrayList<String> strings = new ArrayList<String>();


    // Add multiple strings to the List (OK to do one-by-one)

    strings.add("Hello");
    strings.add("I am");
    strings.add("an");
    strings.add("ArrayList");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop

    joinedList = String.join(", ", myList);

    // Check whether two strings are equal

    myString.equals(newString);
    

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
