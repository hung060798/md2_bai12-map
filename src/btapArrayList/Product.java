package btapArrayList;

import java.util.Comparator;

public class Product  {
    private int id;
    private String name;
    private String gia;

    public Product() {
    }

    public Product(int id, String name, String gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
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

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nsame='" + name + '\'' +
                ", gia='" + gia + '\'' +
                '}';
    }

}
