package btl_de1;

import java.util.Scanner;

public class Category {
    private int id;
    private String name;
    private boolean status;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã danh mục: ");
        id=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên danh mục: ");
        name=sc.nextLine();
        System.out.print("Nhập trạng thái: ");
        status=Boolean.getBoolean(sc.nextLine());
    }
    public void displayData(){
        System.out.format("%32d%10s%16s", id, name, status);
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
