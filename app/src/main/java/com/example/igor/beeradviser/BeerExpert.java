package com.example.igor.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 24.08.2016.
 */
public class BeerExpert {

   ArrayList<String> getBrands(String spinner_color_Type)
    {

        ArrayList<String> brands = new ArrayList<String>();

        if(spinner_color_Type.equals("light"))
        {
            brands.add("Jack light");
            brands.add("light");
        }
        else if(spinner_color_Type.equals("amber"))
        {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else if(spinner_color_Type.equals("brown"))
        {
            brands.add("Jack brown");
            brands.add("brown");
        }
        else
        {
            brands.add("Jack dark");
            brands.add("dark");
        }
        return brands;
    }
}
