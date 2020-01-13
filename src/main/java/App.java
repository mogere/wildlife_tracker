import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String [] args){
        staticFileLocation("/public");
    get("/" ,(request, response) ->{
        Map<String, Object> model = new HashMap<>();
        List<Animals> allAnimals = Animals.allAnimals();
       // List<Sighting> allSightings = Sighting.allSightings();
        model.put("allAnimals", allAnimals);
        //model.put("allSightings", allSightings);
        return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

    post("/postSighting",(request, response) ->{
        Map<String, Object> model = new HashMap<>();
        int animal_id = Integer.parseInt(request.queryParams("animal"));
        String endangered = request.queryParams("endangered");
        String location = request.queryParams("location");
        String ranger = request.queryParams("ranger");
        Sighting newSighting = new Sighting(location, animal_id, endangered, ranger);
        return new ModelAndView(model, "successSighting.hbs");
    },new HandlebarsTemplateEngine());

    }

}
