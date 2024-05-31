package service;

import models.Person;

public class PersonViewer implements PersonService {
    @Override
    public void view(Person person) {
        System.out.println(person.getClass().getSimpleName()+" ......");
        System.out.print("   Name: "+person.getName());
        System.out.print("\n   Email: "+person.getEmail());
        System.out.print("\n   Description: "+person.getDescription());
        System.out.print("\n\n");
    }
}
