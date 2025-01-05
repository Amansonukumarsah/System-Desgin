package Vending_Machine;

import Vending_Machine.vendingState.idelState;

public class vendingMachine {

   private state state;
   private double balance;

   vendingMachine() {
      this.state = new idelState();
      this.balance = 0.0;
   }

   public void setState(state state) {
      this.state = state;
   }

   public void addAmount(double amount) {
      this.balance = amount;
   }

}
