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
}
