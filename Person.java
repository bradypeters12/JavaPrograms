public class Person {
    //Attributes
    private String name;
    private String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
//Getters and Setters 
    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    //Return String
    public String toString()
    {
        return name + "(" + address + ")";
    }
}
