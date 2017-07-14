import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      Stylist stylistTest1 = new Stylist("Trisha", "likes hair");
      model.put("stylists", stylistTest1);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // post("/stylists", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   String name = request.queryParams("name");
    //   String details = request.queryParams("details");
    //   Stylist newStylist = new Stylist(name, details);
    //   response.redirect("/");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
  }
}
