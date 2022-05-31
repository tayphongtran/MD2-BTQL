import java.io.*;
import java.util.List;

public class QLSP implements Serializable {
    private String productCode;
    private String nameProduct;
    private String producer;
    private double price;
    private String status;

    public QLSP() {
    }

    public QLSP(String productCode, String nameProduct, String producer, double price, String status) {
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
        this.status = status;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QLSP{" +
                "productCode='" + productCode + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }




}
