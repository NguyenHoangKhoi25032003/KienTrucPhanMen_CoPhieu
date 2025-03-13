package fit.iuh;

public class ConcreteInvestor implements Investor{
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " nhận thông báo: Cổ phiếu " + stockName + " thay đổi giá: " + price);
    }
}
