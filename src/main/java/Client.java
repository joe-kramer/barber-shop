import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Client {
  private String details;
  private String name;
  private int id;
  private int stylistId;

  public Task(String name, String details, int stylistId) {
    this.details = details;
    this.name = name;
    this.stylistId = stylistId;
  }

  public int getStylistId() {
    return stylistId;
  }

  public String getDetails() {
    return details;
  }

  public int getId() {
    return id;
  }

  public static Client find(int id) {
    try(Connection con = DB.sql2o.open();) {
      String sql = "SELECT * FROM clients where id=:id";
      Client client = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Client.class);
      return client;
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open();) {
      String sql = "INSERT INTO clients (name, details, stylistId) VALUES (:name, :details, :stylistId)";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .addParameter("details", this.details)
      .addParameter("stylistId", this.stylistId)
      .executeUpdate()
      .getKey();
    }
  }

  public void update(String details) {
    try(Connection con = DB.sql2o.open();) {
      String sql = "UPDATE clients SET details = :details WHERE id = :id";
      con.createQuery(sql)
      .addParameter("details", details)
      .addParameter("id", this.id)
      .executeUpdate();
    }
  }
}
