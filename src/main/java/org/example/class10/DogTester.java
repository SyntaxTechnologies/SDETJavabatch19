package org.example.class10;

public class DogTester {

    public static void main(String[] args) {
    /*
    We have created a variable dogObj1 which has a
    data type Dog  we are creating the object of Dog
    and we are storing it in dogObj1 variable.
     */
    Dog dogObj1= new Dog();
    dogObj1.name="Jimmi";
    dogObj1.breed="German";
    dogObj1.color="Black";
    dogObj1.age=4;
    dogObj1.weight=20;
        System.out.println(dogObj1.name);
        System.out.println(dogObj1.breed);
        System.out.println(dogObj1.color);
        System.out.println(dogObj1.age);
    dogObj1.bark();

  Dog dog2= new Dog();
  dog2.name="Bob";
  dog2.color="White";
  dog2.breed="BullDog";
  dog2.age=10;
  dog2.weight=15;
        System.out.println(dog2.name);
        System.out.println(dog2.color);
        System.out.println(dog2.age);

  dog2.sleep();



    }
}
