package btl_de1;

import btl_de1.DAO.DaoType;
import btl_de1.DAO.GeneralDAO;
import btl_de1.DAO.Ipm.CategoryDAOImp;

import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DAOFactory factory = new DAOFactory();
        int n, i, id;
        String id1;
        while (true) {
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int chon;
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    GeneralDAO<Category> category = factory.getDAO(DaoType.CATEGORY);
                    while (true) {
                        System.out.println("________________Quản lý danh mục________________");
                        System.out.println("1. Hiển thị d/s danh mục sắp xếp theo tên A-Z (status hiển thị ẩn/hiện)");
                        System.out.println("2. Thêm mới danh mục");
                        System.out.println("3. Cập nhật danh mục");
                        System.out.println("4. Xóa danh mục");
                        System.out.println("5. Quay lại");
                        System.out.print("Nhập lựa chọn: ");
                        int chon1;
                        chon1 = Integer.parseInt(sc.nextLine());
                        switch (chon1) {
                            case 1:
                                category.get().sort((Category c1,Category c2)->c1.getName().compareTo(c2.getName()));
                                System.out.format("%32s%10s%16s","Id","Name","Status");
                                System.out.println("");
                                for (Category cat : category.get()) {
                                    cat.displayData();
                                }
                                break;
                            case 2:
                                System.out.print("Nhập số danh mục cần thêm mới: ");
                                n = Integer.parseInt(sc.nextLine());
                                for (i = 0; i < n; i++) {
                                    Category cat = new Category();
                                    System.out.println("Nhập danh mục thứ " + (i + 1) + ": ");
                                    cat.inputData();
                                    category.add(cat);
                                }
                                break;
                            case 3:
                                System.out.print("Nhập mã của danh mục cần sửa: ");
                                id = Integer.parseInt(sc.nextLine());
                                int index = 0,sua1=0;
                                for (Category cat : category.get()) {
                                    if (cat.getId() == id) {
                                        cat.inputData();
                                        category.edit(cat, index);
                                        sua1++;
                                    }
                                    index++;
                                }
                                if(sua1>0){
                                    System.out.println("Sửa thành công");
                                }
                                else {
                                    System.out.println("Sửa không thành công");
                                }
                                break;
                            case 4:
                                int xoa1=0;
                                System.out.print("Nhập mã của danh mục cần xóa: ");
                                id = Integer.parseInt(sc.nextLine());
                                for (i = 0; i < category.get().size(); i++) {
                                    if (category.get().get(i).getId() == id) {
                                        category.remove(category.get().get(i));
                                        xoa1++;
                                    }
                                }
                                if(xoa1>0){
                                    System.out.println("Xóa thành công");
                                }
                                else {
                                    System.out.println("Xóa không thành công");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Nhập từ 1 đến 5");
                                break;

                        }
                        if (chon1 == 5) {
                            break;
                        }
                    }
                    break;
                case 2:
                    GeneralDAO<Product> product = factory.getDAO(DaoType.PRODUCT);
                    while (true) {
                        System.out.println("________________Quản lý sản phẩm________________");
                        System.out.println("1. Hiển thị d/s sản phẩm (id, name, price, categoryName, status(ẩn/hiện))");
                        System.out.println("2. Thêm mới sản phẩm");
                        System.out.println("3. Cập nhật thông tin sản phẩm");
                        System.out.println("4. Xóa sản phẩm");
                        System.out.println("5. Quay lại");
                        System.out.print("Nhập lựa chọn: ");
                        int chon2;
                        chon2 = Integer.parseInt(sc.nextLine());
                        switch (chon2) {
                            case 1:
                                System.out.format("%32s%16s%16s%16s%16s","Id","Name","Price","CategoryId","Status");
                                System.out.println("");
                                for (Product pro : product.get()) {
                                    pro.displayData();
                                }
                                break;
                            case 2:
                                System.out.print("Nhập số sản phẩm cần thêm mới: ");
                                n = Integer.parseInt(sc.nextLine());
                                for (i = 0; i < n; i++) {
                                    Product pro = new Product();
                                    System.out.println("Nhập sản phẩm thứ " + (i + 1) + ": ");
                                    pro.inputData();
                                    product.add(pro);
                                }
                                break;
                            case 3:
                                System.out.print("Nhập mã của sản phẩm cần sửa: ");
                                id1 = sc.nextLine();
                                int index = 0,sua2=0;
                                for (Product pro : product.get()) {
                                    if (pro.getId().equalsIgnoreCase(id1)) {
                                        pro.inputData();
                                        product.edit(pro, index);
                                        sua2++;
                                    }
                                    index++;
                                }
                                if(sua2>0){
                                    System.out.println("Sửa thành công");
                                }
                                else {
                                    System.out.println("Sửa không thành công");

                                }
                                break;
                            case 4:
                                int xoa2=0;
                                System.out.print("Nhập mã của sản phẩm cần xóa: ");
                                id1 =sc.nextLine();
                                for (i = 0; i < product.get().size(); i++) {
                                    if (product.get().get(i).getId().equalsIgnoreCase(id1)) {
                                        product.remove(product.get().get(i));
                                        xoa2++;
                                    }
                                }
                                if(xoa2>0){
                                    System.out.println("Xóa thành công");
                                }
                                else {
                                    System.out.println("Xóa không thành công");

                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Nhập từ 1 đến 5");
                                break;

                        }
                        if (chon2 == 5) {
                            break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập từ 1 đến 3");
                    break;
            }


        }


    }
}
