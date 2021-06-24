package btapArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.them");
        System.out.println("2.show");
        System.out.println("3.sua");
        System.out.println("4.xoa");
        System.out.println("5.serah");
        System.out.println("6.sap xep");

        int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    System.out.println("id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("name");
                    String name = sc.nextLine();
                    System.out.println("nhap gia");
                    String gia = sc.nextLine();
                    ProductManager.add(id, name, gia);
                    break;
                }
                case 2:
                    ProductManager.show();
                    break;
                case 3: {
                    System.out.println("nhap id");
                    int id = Integer.parseInt(sc.nextLine());
                    ProductManager.edit(id);
                    break;
                }
                case 4:{
                    System.out.println("nhap id");
                    int id = Integer.parseInt(sc.nextLine());
                    ProductManager.del(id);
                }
                case 5:{
                    System.out.println("nhap name");
                    String name = sc.nextLine();
                    ProductManager.search(name);
                }
                case 6:{
                    ProductManager.sort();
                }

            }
        }
    }
}
