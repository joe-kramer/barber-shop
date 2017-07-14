import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class ClientTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  // @Test
  // public void delete_deletesTask_true() {
  //   Task myTask = new Task("Mow the lawn", 1);
  //   myTask.save();
  //   int myTaskId = myTask.getId();
  //   myTask.delete();
  //   assertEquals(null, Task.find(myTaskId));
  // }

  @Test
  public void client_instantiatesCorrectly_true() {
    Client newClient= new Client("Joe", "likes hair", 1);
    assertEquals(true, newClient instanceof Client);
  }

  @Test
  public void getId_tasksInstantiateWithAnID() {
    Client newClient= new Client("Joe", "likes hair", 1);
    assertTrue(newClient.getId() > 0);
  }

  @Test
  public void find_returnsClientWithSameId_secondClient() {
    Client client1 = new Client("Joe", "likes hair", 1);
    Client client2 = new Client("Taylor", "likes beards", 1);
    assertEquals(Client.find(client2.getId()), client2);
  }

  @Test
  public void update_updatesClientDetails_true() {
    Client newClient= new Client("Joe", "likes hair", 1);
    newClient.update("new details");
    assertEquals("new details", Client.find(newClient.getId()).getDetails());
  }
}
