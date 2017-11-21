import java.util.Scanner;
/**
 * Creator: Hamid Majeed
 * Purpose: To compare two peoples age and name
 */

public class PersonDriver {

    public static void main(String[] args) {

        /** Get name input from user */

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first persons name");
        String name = keyboard.next();
        String outputAge;

        /**get age input from user*/

        System.out.println("Please enter the first persons age");
        int age = Integer.parseInt(keyboard.next());
        Person person1 = new Person(name,age);
        System.out.println(person1);

        /**Now input information from user for person 2*/

        System.out.println("Please enter the second persons name");
        name = keyboard.next();
        System.out.println("Please enter the second persons age");
        age = Integer.parseInt(keyboard.next());
        Person person2 = new Person(name,age);
        System.out.println(person2);

        /**comparison of both persons and output to user*/


        if (person1.toString().equals(person2.toString())==true){
            System.out.println("Person 1 equals to Person 2");
        } else {
            System.out.println("Person 1 does not equal to Person 2");
        }
        if (person1.getName().equals(person2.getName())){
            System.out.println("The first person does have the same name as the second Person");
        } else {
            System.out.println("The first person does not have the same name as the second Person");
        }
        if (person1.getAge()==person2.getAge()){
            outputAge ="The first person is the same age as the second person";
        }
        else if (person1.getAge()>person2.getAge()) {
            outputAge="The first person is older than the second person";
        }
        else {
            outputAge="The first person is younger than the second person";
        }
        System.out.println(outputAge);
    }
}