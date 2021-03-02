package Basics;

public class TestPuppy
{
    public static void main(String[] args)
    {
        Puppy pup1 = new Puppy();
        Puppy pup2 = new Puppy();

        pup1.setPuppyAge(2);
        pup1.setBreed("Labrador");
        pup1.setPuppyName("Tommy");

        pup2.setPuppyAge(3);
        pup2.setPuppyName("Bruno");
        pup2.setBreed("Great Den");


        pup2.printPup();


    }
}
