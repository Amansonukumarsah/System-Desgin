// basePizza---extends--->cheesePizzaCost
public abstract class basePizza {
    public abstract int cost();
}

// extends the basePizza in concert class

public class cheesePizzaCost extends basePizza {

    @Override
    public int cost() {
        return 100;
    }
}

// public class pannerPizzaCost extends basePizza{

// @overrride
// public int cost()
// {
// return 110;
// }
// }

// extends the abstract class in abstract

public abstract class decoratorBasePizza extends basePizza {
}

public class extraCheesePizzaCost extends decoratorBasePizza {
    basePizza basePizza;

    public extraCheesePizzaCost(basePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}

public static void main(String args[]) {
    cheesePizzaCost chessePizza = new cheesePizzaCost();
    int val = chessePizza.cost();
    System.out.print(val);
}
