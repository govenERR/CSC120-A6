/* This is a stub for the House class */
import java.util.ArrayList;
/*
 * Class that creates a Smith College house
 */
public class House extends Building {
  
  private boolean hasDiningRoom;
  private ArrayList<String> residents;
/*
 * Creates the house
 */
  public House(boolean hasDiningRoom, ArrayList<String> residents, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = residents;
    System.out.println("You have built a house: 🏠");
  }
  /*
  Returns whether or not the house has a dining hall 
  */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }
/*
 * Returns the number of residents in the house
 */
  public int numResidents() {
    return this.residents.size();
  }
  /*
   * Method to add residents into the houses' resident array
   */
  public void moveIn(String name) {
    this.residents.add(name);
  }
  /*
   * Method to remove residents from the houses' resident array
   */
  public void moveOut(String name) {
    this.residents.remove(name);
  }
  /*
   * Method to check if a person is on the array of the houses' residents
   */
  public boolean isResident(String name) {
    return this.residents.contains(name);
  }


  public static void main(String[] args) {
    ArrayList<String> gspotResidents = new ArrayList<String>();
    gspotResidents.add("Lily");
    gspotResidents.add("Sabina");
    gspotResidents.add("Moly");
    House gardinerHouse = new House(false,gspotResidents, "Gardiner", "1 Paradise Rd", 4);
    System.out.println(gardinerHouse.getAddress());

  }

}
