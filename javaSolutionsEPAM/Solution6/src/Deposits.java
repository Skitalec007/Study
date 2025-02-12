import java.util.Currency;

public class Deposits
{
    private  String durationType;
    private String typeDeposit;
    private double amount;
    private String currency;
    private double percentRate;
    public Deposits(String durationType, String typeDeposit, double amount, String currency, double percentRate)
    {
        this.durationType = durationType;
        this.typeDeposit = typeDeposit;
        this.amount = amount;
        this.currency = currency;
        this.percentRate = percentRate;
    }
    public void setDepositType(String type)
    {
        this.durationType = type;
    }
    public String getDepositType()
    {
        return durationType;
    }
    public String isRevocalbe()
    {
        return typeDeposit;
    }
    public Deposits changeCurrency(String currency)
    {
        return new Deposits(this.durationType, this.typeDeposit, this.amount, currency, this.percentRate);
    }
    public double calculate(int years)
    {
        return amount * years * percentRate;
    }
    @Override
    public String toString()
    {
        return "Информация по вкладу: " +
                "\n1. продолжительность вклада: " + durationType +
                "\n2. вид вклада: " + typeDeposit +
                "\n3. сумма вклада: " + amount +
                "\n4. валюта: " + currency +
                "\n5. процентная ставка " + percentRate + "%";

    }

}
