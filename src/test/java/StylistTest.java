import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class StylistTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void syliest_instantiatesCorrectly_true() {
    Stylist stylistTest = new Stylist("Trisha");
    assertEquals(true, stylistTest instanceof Stylist);
  }

  @Test
  public void getName_stylistInstantiatesWithName_trisha() {
    Stylist stylistTest = new Stylist("Trisha", "likes hair");
    assertEquals("Trisha", stylistTest.getName());
  }

  @Test
  public void all_returnsAllInstances_true() {
    Stylist stylistTest1 = new Stylist("Trisha", "likes hair");
    Stylist stylistTest2 = new Stylist("Trisha", "likes hair");
    assertEquals(true, Stylist.getAll().get(0).equals(stylistTest1));
    assertEquals(true, Stylist.getAll().get(1).equals(stylistTest2));
  }

  @Test
  public void equals_returnsTrueIfSame_true() {
    Stylist stylistTest1 = new Stylist("Trisha", "likes hair");
    Stylist stylistTest2 = new Stylist("Trisha", "likes hair");
    assertTrue(stylistTest1.equals(stylistTest2));
  }

  @Test
  public void save_savesIntoDatabase_true() {
    Stylist stylistTest1 = new Stylist("Trisha", "likes hair");
    assertTrue(Stylist.all().get(0).equals(stylistTest1));
  }

  @Test
  public void getClients_getsAllAssociatedClients_true() {
    Styliest stylistTest = new Stylist("Trisha", "likes hair");
    Client client1 = new Client("Joe", "likes hair");
    Client client2 = new Client("Taylor", "likes beards");
    Client[] clients = new Client[] { client1, client2 };
    assertTrue(stylistTest.getClients().containsAll(Arrays.asList(tasks)));


  @Test
  public void find_returnsStylistsWithSameId_secondStylist() {
    Stylist stylistTest1 = new Stylist("Trisha", "likes hair");
    Stylist stylistTest2 = new Stylist("Taylor", "likes hair");
    assertEquals(Stylist.find(stylistTest2.getId()), stylistTest2);
  }
}
