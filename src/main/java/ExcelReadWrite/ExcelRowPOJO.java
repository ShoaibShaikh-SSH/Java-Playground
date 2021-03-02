package ExcelReadWrite;

public class ExcelRowPOJO
{
    String Name;
    String Gender;
    String Profession;
    String Country;

    public void setName(String name)
    {
        this.Name=name;
    }
    public String getName()
    {
        return this.Name;
    }

    public void setGender(String gender)
    {
        this.Gender=gender;
    }
    public String getGender()
    {
        return this.Gender;
    }

    public void setProfession(String profession)
    {
        this.Profession=profession;
    }
    public String getProfession()
    {
        return this.Profession;
    }

    public void setCountry(String country)
    {
        this.Country=country;
    }
    public String getCountry()
    {
        return this.Country;
    }
}
