package People;

public class Supplier extends Person {
    private int supplierId;
    private String company;
    private String product;

    public Supplier(String name, int age, String address, int supplierId, String company, String product) {
        super(name, age, address);
        this.supplierId = supplierId;
        this.company = company;
        this.product = product;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
