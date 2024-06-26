public class Computers02 {
    private String model;
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
        this.diagonalOfMonitor = 13.6;
        this.isCompanyComputer = true;
        this.isLaptop = true;
        // nebo může být napsáno:
        // this(model. weight, diagonalOfMonitor: 15.6, isCompanyComputer: true, isLaptop: true)

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(double diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
}
