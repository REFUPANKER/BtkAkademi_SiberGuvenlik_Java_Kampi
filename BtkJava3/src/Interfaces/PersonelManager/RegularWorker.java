package Interfaces.PersonelManager;

public class RegularWorker implements iPerson, iBankAccount {
    private String name;
    private String iban = "TR 1948567421849567712";
    private int budget;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void DisplayPersonData() {
        System.out.println("----Person data----");
        System.out.println("Name :" + name);
    }

    @Override
    public void DisplayBankAccountData() {
        System.out.println("----Bank data----");
        System.out.println("IBAN :" + getIBAN().substring(0, getIBAN().length() / 2)+"...");
        System.out.println("Budget :" + getBudget());
    }

    @Override
    public String getIBAN() {
        return iban;
    }

    @Override
    public float getBudget() {
        return budget;
    }

    @Override
    public void addBudget(int value) {
        budget += Math.abs(value);
    }
}
