package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        String data = scanner.next();
        Date date = null;
        try {
            date = sdf.parse(data);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int months = scanner.nextInt();

        Contract ct = new Contract(number, date, totalValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(ct, months);

        System.out.println("Parcelas:");
        for (Installment installment : ct.getInstallment()) {
            System.out.println(installment);
        }

        scanner.close();

    }
}
