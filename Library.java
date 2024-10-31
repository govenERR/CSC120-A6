import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {
  
  private Hashtable<String, Boolean> collection;
  /*
   * Creates a new Library
   */
  public Library(Hashtable<String, Boolean> collection, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = collection;
    System.out.println("You have built a library: 📖");
    }
  
  /*
   * Adds a new book into the Library's collection
   */
  public void addTitle(String title) {
    this.collection.put(title, true);
  }

  /*
   * Removes a book from the Library's collection
   */
  public void removeTitle(String title) {
    this.collection.remove(title);
  }

  /*
   * Checks to see if the library has a book
   */
  public boolean containsTitle(String title) {
    return this.collection.contains(title);
  }
  
  /*
   * Checks to see if the book is avaliable in the library
   */
  public boolean isAvaliable(String title) {
    return this.collection.get(title);
  }

  /*
   * Prints the entire Library's collection
   */
  public void printCollection() {
    System.out.println(this.collection);
  }

  public static void main(String[] args) {
    Hashtable<String, Boolean> neilsonBooks = new Hashtable<>();
    neilsonBooks.put("The Hunger Games", true);
    neilsonBooks.put("Cell Energetics", false);
    Library neilson = new Library(neilsonBooks, "Neilson", "7 Neilson Dr", 4);
    System.out.println(neilson.getAddress());
  }
  
  }
