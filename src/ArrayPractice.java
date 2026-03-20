public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4

    String[] arr = ["string1", "string2", "string3", "string4"];

    // OR String arr = new String[4];
    //arr.add("string1"); etc. etc...

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one

    arr[0] = "new1";
    arr[1] = "new2";
    arr[2] = "new3";
    arr[3] = "new4";

    // Get the value of the array at index 2

    val = arr[2];

    // Get the length of the array

    arrLen = arr.length;

    // Iterate over the array using a traditional for loop and print out each item

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    // Iterate over the array using a for-each loop and print out each item

    for (String item : arr) {
      System.out.print(item + " ");
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
