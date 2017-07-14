import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Client {
  private String details;
  private String name;
  private int id;
  private int StylistId;

  public Task(String name, String details, int stylistId) {
    this.details = details;
    this.name = name;
    this.stylistId = stylistId;
  }

  public int getCategoryId() {
    return categoryId;
  }

  public String getDescription() {
    return description;
  }
