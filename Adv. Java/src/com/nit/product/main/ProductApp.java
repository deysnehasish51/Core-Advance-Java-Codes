package com.nit.product.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nit.product.bean.Product;
import com.nit.product.service.ProductService;

public class ProductApp {

    public static void main(String[] args) {

        ProductService ps = new ProductService();
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Insert Product");
            System.out.println("2. Get All Products");
            System.out.println("3. Filter Low Stock Product (<10)");
            System.out.println("4. Sort Product by Price (Lowest)");
            System.out.println("5. Total Inventory Value");
            System.out.println("6. Display Products (Sorted by Price)");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1: {
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(sc.nextLine());

                    if (quantity > 0) {
                        Product product = new Product(id, name, price, quantity);
                        ps.addProduct(product);
                    } else {
                        System.out.println("Quantity must be greater than 0");
                    }
                    break;
                }

                case 2: {
                    list = new ArrayList<>();
                    ps.fetchData(list);
                    list.forEach(System.out::println);
                    break;
                }

                case 3: {
                    list = new ArrayList<>();
                    ps.fetchData(list);
                    ps.filterLowStockProduct(list);
                    break;
                }

                case 4: {
                    list = new ArrayList<>();
                    ps.fetchData(list);
                    ps.sortThePrice(list);
                    break;
                }

                case 5: {
                    list = new ArrayList<>();
                    ps.fetchData(list);
                    ps.totalInventoryValue(list);
                    break;
                }

                case 6: {
                    list = new ArrayList<>();
                    ps.fetchData(list);
                    ps.calculateCostliestProduct(list);
                    break;
                }

                case 7: {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }

                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}