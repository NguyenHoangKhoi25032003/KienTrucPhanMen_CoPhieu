package fit.iuh;

public class Main {
    public static void main(String[] args) {
        StockMarket appleStock = new StockMarket(true,100, "Apple");

        Investor investor1 = new ConcreteInvestor("Nhà đầu tư A");
        Investor investor2 = new ConcreteInvestor("Nhà đầu tư B");

        appleStock.addInvestor(investor1);
        appleStock.addInvestor(investor2);

        System.out.println("Giá cổ phiếu thay đổi...");
        appleStock.setPrice(155.5);

        System.out.println("Giá cổ phiếu thay đổi lần nữa...");
        appleStock.setPrice(160.0);
    }
    }
