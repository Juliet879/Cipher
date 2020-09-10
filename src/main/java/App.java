import java.util.HashMap;
import java.util.Map;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;

import static spark.Spark.*;

public class App{
    public static void main(String[] args) {

        StringBuilder var = decipher("Ksh",4);
        System.out.println(var);

    }
}