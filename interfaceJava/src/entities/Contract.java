package entities;

import java.util.ArrayList;
import java.util.Date;


public class Contract {

    private Integer number;
    private Date date;
    private Double totalValue;

    ArrayList<Installment> installment = new ArrayList<>();

    public Contract(Integer number, Date date, Double totalValue) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Installment> getInstallment() {
        return installment;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }


}