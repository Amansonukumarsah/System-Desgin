package Vending_Machine;

import java.util.List;

public interface state {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(Vending_Machine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void chooseProduct(Vending_Machine machine, int codeNumber) throws Exception;

    public void getChange(int returnChangeMonkey) throws Exception;

    public void dispenseProduct(Vending_Machine machine, int codeNumber) throws Exception;

    public List<Coin> refundMoney(Vending_Machine machine) throws Exception;

    public void updateInventory(Vending_Machine machine, Item item, int codeNumber) throws Exception;

}
