package application;


import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number product: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Custom, used or imported? (c/u/i) ");
            char ch = scanner.next().charAt(0);
            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                Product imported = new ImportedProduct(name, price, customsFee);
                list.add(imported);
            } else if (ch == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
            else{
                Product product = new Product(name, price);
                list.add(product);
            }
        }

        scanner.nextLine();
        System.out.println("PRICE TAG: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }


        scanner.close();
    }
}

