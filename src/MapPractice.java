

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map

    Map myMap = new HashMap<String, Integer>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)

    myMap.put("one", 1);
    myMap.put("two", 2);
    myMap.put("three", 3);

    // Get the value associated with a given key in the Map

    myMap.get("one");

    // Find the size (number of key/value pairs) of the Map

    myMap.size();

    // Replace the value associated with a given key (the size of the Map shoukld not change)

    myMap.replace("one", 4);

    // Check whether the Map contains a given key

    myMap.containsKey("two");

    // Check whether the Map contains a given value

    myMap.containsValue(5);

    // Iterate over the keys of the Map, printing each key

    Set<String> keys = myMap.keySet();
    for (String key : keys) {
      System.out.println(key);
    }

    // Iterate over the values of the map, printing each value

    for (Integer val : myMap.values()) {
      System.out.println(val);
    }

    // Iterate over the entries in the map, printing each key and value

    Set<String> keys = myMap.keySet();
    for (String key : keys) {
      System.out.println("Key: " + key);
      System.out.println("Value: " + myMap.get(key));
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
