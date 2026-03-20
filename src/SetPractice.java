public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Setstrings.join(", ");

    HashSet<String> myHash = new HashSet<String>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)

    myHash.add("one");
    myHash.add("two");
    myHash.add("three");

    // Check whether the Set contains a given String

    myHash.contains("two");

    // Remove an element from the Set

    myHash.remove("two");

    // Get the size of the Set

    int size = myHash.size();

    // Iterate over the elements of the Set, printing each one on a separate line

    for (String s : myHash) {
      System.out.println(s);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
