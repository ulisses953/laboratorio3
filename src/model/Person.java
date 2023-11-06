package model;

public abstract class Person {
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
    //#endregion


    //#region cotructor
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //#endregion


    
}
