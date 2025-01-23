package Vending_Machine;

public interface state {
    public void insertMoney(vendingMachine vm, double item);

    public void selectItem(vendingMachine vm, double amount);

    public void dispenseItem(vendingMachine vm);

    public void refund(vendingMachine vm);
}
