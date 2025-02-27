public class Bus
{
    private String driver;
    private int number;
    private String route;
    private String brand;
    private int year;
    private int mileage;

    public Bus(String driver, int number, String route, String brand, int year, int mileage)
    {
        this.driver = driver;
        this.number = number;
        this.route = route;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public String getDriver()
    {
        return driver;
    }

    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getRoute()
    {
        return route;
    }

    public void setRoute(String route)
    {
        this.route = route;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMileage()
    {
        return mileage;
    }

    public void setMileage(int mileage)
    {
        this.mileage = mileage;
    }

    @Override
    public String toString()
    {
        return "Водитель: " + getDriver() + "\nМаршрут: " + getRoute() + "\nМарка автобуса: " +
                getBrand() + "\nНомер: " + getNumber() + "\n Эксплуатация с: " + getYear() +
                " г.\nПробег: " + getMileage() + " км" +
                "\n===============================================================================";
    }
}
