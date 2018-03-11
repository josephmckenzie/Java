public class Newfoundlands
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor Declaration of Class
	  //We set the types we are going to set Ie: String or int
    public Newfoundlands(String name,
															String breed,
                   int age,
															String color
														)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // Our method for getting the sweet pups names
    public String getName()
    {
        return name;
    }
 
    // We get our Breed of the very awesome dogs
    public String getBreed()
    {
        return breed;
    }
 
    // our method for getting thier ages
    public int getAge()
    {
        return age;
    }
 
    // Now we can get their colors
    public String getColor()
    {
        return color;
    }
 
	   //The @Override means that the method is overriding the parent class
	  //It can be overridden without the annotation. It just helps let us know that there is a parent class method that has been overridden by a child class. 
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName() +
               ", I'm a " + this.getBreed() +
															", and I'm " + this.getAge() + " years old" +
															", My color is " + this.getColor() + "."
														);
    }
 
    public static void main(String[] args)
    {
        Newfoundlands teecee = new Newfoundlands("Teecee","Newfoundland", 2, "Black");
					   Newfoundlands coder = new Newfoundlands("Coder","Newfoundland", 1, "White and Brown");
        System.out.println(teecee.toString());
				   	System.out.println(coder.toString());
    }
}