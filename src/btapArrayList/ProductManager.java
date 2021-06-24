package btapArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {

    static ArrayList<Product> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static Comparator<Product> comparator = (o1, o2) -> {
        if (o1.getId()> o2.getId()){
           return 1;
        } else return -1;
    };

    public static void add(int id, String name, String gia){
        list.add(new Product(id, name, gia));
    }

    public static void edit(int id){
        for(Product p : list){
            if (p.getId() == id){
                System.out.println("nhap ten moi");
                String name = sc.nextLine();
                p.setName(name);
            }
        }
    }

    public static void show(){
        for (Product p : list){
            System.out.println(p);
        }
    }

    public static void  del(int id) {
        Product a = new Product();
        for (Product p : list){
            if (id == p.getId()){
                a=p;
                break;
            }
        }
        list.remove(a);
    }

    public static void search(String name){
        for (Product p : list){
            if (p.getName().equals(name)){
                System.out.println(p);
            }
        }
    }

    public static void sort(){
        list.sort(comparator);
    }

}
