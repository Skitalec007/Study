public class Bird
{
    String species;
    public Bird(String species)
    {
        this.species = species;
    }
    public void toFly()
    {
        System.out.println(species + " летает!");
    }
    public void laysEggs()
    {
        System.out.println(species + " сидит на яйцах!");
    }
    public  void hatchChicks()
    {
        System.out.println(species + " высиживаются!");
    }
    public String getSpecies()
    {
        return species;
    }
}
