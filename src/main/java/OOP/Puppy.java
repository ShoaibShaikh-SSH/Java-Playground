package OOP;

public class Puppy
{
    int puppyAge;
    String puppyName;
    String puppyBreed;


    public void setPuppyAge(int age)
    {
        if (age>0 && age <10)
        {
            puppyAge=age;
        }
        else
            System.out.println("Invalid age entered for puppy");
    }
    public void setPuppyName(String name)
    {
        puppyName=name;
    }

    public void setBreed(String breed)
    {
        puppyBreed=breed;
    }

    public int getPuppyAge() throws Exception
    {
        if (puppyAge>0 && puppyAge <=10)
        {
            return puppyAge;
        }
        else
            throw new Exception("Invalid age");

    }

    public void printPup()
    {
        System.out.println("Puppy age: "+puppyAge);
        System.out.println("Puppy name: "+puppyName);
        System.out.println("Puppy breed: "+puppyBreed);
    }

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
