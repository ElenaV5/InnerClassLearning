package ru.synergy.methodinner;

import java.util.LinkedList;
import java.util.List;

public class Sample {
    public void createNewPerson(String name){
        String nameFIO = name;

        class GenericName {
            List<String> names = new LinkedList<String>();
             public GenericName(){
                for(String str : nameFIO.split(" ")){
                    names.add(str);
                }
            }
            public String getFirstName(){
                return names.get(0);
            }
            public String getLastName(){
                 return names.get(names.size() - 1);
            }
        }

        GenericName gname = new GenericName();
        System.out.println("Клиент: " + gname.getFirstName().charAt(0) + "." + gname.getLastName());
    }
}
