package btl_de1;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private double price;
    private int categoryId;
    private boolean status;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        id=sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        name=sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        price=Double.parseDouble(sc.nextLine());
        System.out.print("Nhập mã danh mục: ");
        categoryId=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập trạng thái: ");
        status=Boolean.getBoolean(sc.nextLine());
    }

    public void displayData(){
        System.out.format("%32s%16s%16f%16d%16s",id,name,price,categoryId,status);
        System.out.println("");
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                ", status=" + status +
                '}';
    }
}
