package org.example.Products;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSetExample {
    public static void main(String [] args){
        Set<String> names = new HashSet<>();

        names.add("Milk");
        names.add("Cheese");
        names.add("Butter");
        names.add("Yogurt");
        names.add("Cheese1");

        // for (String name : names){
            //System.out.println("names");
        //}

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
    }
}
