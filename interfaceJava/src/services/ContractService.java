package services;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {



    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        double vb = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++){
            double va = onlinePaymentService.interest(vb, i);
            double vt = onlinePaymentService.paymentFee(vb + va);

            Calendar cal = Calendar.getInstance();
            cal.setTime(contract.getDate());
            cal.add(Calendar.MONTH, i);
            Date date = cal.getTime();

            Installment ob = new Installment(vt, date);
            contract.getInstallment().add(ob);
        }
    }
}
