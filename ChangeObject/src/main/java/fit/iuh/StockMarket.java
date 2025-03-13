package fit.iuh;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private String name;
    private double price;
    private boolean state;
    List<Investor> investors;

    public StockMarket(boolean state, double price, String name) {
        this.state = state;
        this.price = price;
        this.name = name;
        investors = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    @Override
    public void addInvestor(Investor investor) {
            investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        state =!state;
        System.out.println(state);
        for (Investor investor : investors) {
            investor.update(name, price);
        }

    }
}
