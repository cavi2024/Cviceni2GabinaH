public class Computers02 {
    private String model = "ZZZ";
    private double weight;
    private double diagonalOfMonitor;
    private boolean isCompanyComputer;
    private boolean isLaptop;

    public Computers02(String model, double weight, double diagonalOfMonitor, boolean isCompanyComputer, boolean isLaptop) {
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.isLaptop = isLaptop;
    }
    public Computers02(String model, double weight) {
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = 15.6;
        this.isCompanyComputer = true;
        this.isLaptop = true;
        // nebo může být napsáno:
        // this(model. weight, diagonalOfMonitor: 15.6, isCompanyComputer: true, isLaptop: true)

    }

}
