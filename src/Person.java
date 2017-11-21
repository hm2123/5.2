/**
 * Creator: Hamid Majeed
 * purpose: create classes for name and ages of two people
 */
public class Person {
    private String name;
    private int age;

    /**
     * Construct new person with name Steve and age=25
     */
    public Person(){
        name="Steve";
        age=0;
    }
    /**
     * Constructing new person using information provided by name and age param
     */

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    /**
     * Get and return name of the person
     */
    public String getName(){
        return name;
    }
    /**
     * Setting name of the person according to the name para
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * Get and return age
     */
    public int getAge(){
        return age;
    }
    /**
     * setting the age of the person according to the age param
     */
    public void setAge(int age){
        this.age=age;
    }
    /**
     * return name and age of the person
     */
    public String toString(){
        return "Name: " +name+"Age: "+age;
    }
}