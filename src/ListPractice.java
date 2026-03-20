public class ListPractice {


  public static void main(String[] args) {

    // Create an empty ArrayList of Strings and assign it to a variable of type List

    List<String> myList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)

    myList.add("hey");
    myList.add("hi");
    myList.add("hello");

    // Print the element at index 1

    System.out.println(myList[0]);

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)

    myList[0] = "new";

    // Insert a new element at index 0 (the length of the list will change)

    myList.addFirst("new2");

    // Check whether the list contains a certain string

    myList.contains("hey");

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line

    for (int i = 0; i < myList.length; i++) {
      System.out.println(i);
      System.out.println(myList[i]);
    }

    // Sort the list using the Collections library

    myList.sort();

    // Iterate over the list using a for-each loop
    // Print each value on a second line

   for (String s : myList) {
      System.out.print(s + " ");
   }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}