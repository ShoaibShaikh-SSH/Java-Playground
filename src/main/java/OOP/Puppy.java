package Basics;

public class Puppy
{
    int puppyAge;
    String puppyName;
    String puppyBreed;

//    public Puppy(String name)
//    {
//        System.out.println("Puppy name is: "+name);
//    }

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
}
