package com.example.cmdf_app.parsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RecipesParser {
    /*
    API: 72eb399b
     */

    public void parseRecipes(String food) throws IOException {

        String search = "";
        for (String s: food.split(" ")) {
            search = search + "%20" + s;
        }
        

        BufferedReader br = null;

        try {
            String theURL = "https://api.edamam.com/api/food-database/parser?nutrition-type=logging&ingr=" + search +
                    "&app_id=72eb399b&app_key=6aea8f2bd49d1d0833b68c587029d600"; //this can point to any URL
            URL url = new URL(theURL);
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                //sb.append(System.lineSeparator());
            }

            System.out.println(sb);
        } finally {

            if (br != null) {
                br.close();
            }
        }
    }
}
