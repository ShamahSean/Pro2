package cput.ac.za;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Pro2
{
    public static void main(String[] args)
    {
        ArrayList <String> list = new ArrayList<>();
        list.add("Bentley");
        list.add("BMW");
        list.add("Mercedes");
        list.add("Jaguar");
        list.add("Tesla");

        list.set(3,"Volvo");

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        TreeSet<Double> price = new TreeSet<>();
        price.add(5.99);
        price.add(7.50);
        price.add(2.45);
        price.add(20.88);
        price.add(100.5);

        Iterator<Double> itr = price.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
