package model;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private int age;
    
    //#region get e set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    
    //#endregion


    //#region cotructor
    public Person() {
    }
    public Person(UUID id, String name, int age) {
        this.name = name;
        this.age = age;
    }
 

    

    //#endregion


    
}
