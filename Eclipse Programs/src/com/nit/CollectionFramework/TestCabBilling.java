package com.nit.CollectionFramework;

import java.util.ArrayList;

class CabCustomer{
    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private String phone;
   
    public CabCustomer() {
        this.custId = 0;
        this.customerName = "Unknown";
        this.pickupLocation = "Unknown";
        this.dropLocation = "Unknown";
        this.distance = 0;
        this.phone = "N/A";
    }

    public CabCustomer(int custId, String customerName, String pickupLocation,
                       String dropLocation, int distance, String phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    public String getDropLocation() {
        return dropLocation;
    }
    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CabCustomer [custId=" + custId + ", customerName=" + customerName +
                ", pickupLocation=" + pickupLocation + ", dropLocation=" + dropLocation +
                ", distance=" + distance + ", phone=" + phone + "]";
    } 
}

class CabCustomerService{

    ArrayList<CabCustomer> customer = new ArrayList<>();

    public void addCabCustomer(CabCustomer c) {
        customer.add(c);
        System.out.println("Customer added successfully");
    }

    public void isDuplicateCustomer(CabCustomer c) {
        for(CabCustomer cabCustomer: customer) {
            if(cabCustomer.getCustId() == c.getCustId()) {
                System.out.println("Duplicate customer found");
                return;
            }
        }
    }

    public boolean isFirstCustomer(CabCustomer cus) {
        for(CabCustomer c : customer) {
            if(c.getPhone().equals(cus.getPhone())) {
                return false;
            }
        }
        return true;
    }

    public double calculateBill(CabCustomer customer) {

        if(isFirstCustomer(customer)) {
            return 0.0;
        }

        int distance = customer.getDistance();

        if(distance <= 4) {
            return 80.0;
        } else {
            return 80 + (distance * 6);
        }
    }

    public void printBill(CabCustomer customer) {
        double billAmount = calculateBill(customer);
        System.out.println(
            customer.getCustomerName().toUpperCase() +
            " Please pay your bill of Rs." + billAmount
        );
    }
}

public class TestCabBilling {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main starts");

        CabCustomer c1 = new CabCustomer(102, "Alice", "nIt", "JNTU", 15, "+91-6321784590");
        CabCustomer c2 = new CabCustomer(104, "Bob", "nIt", "New Campus", 2, "+91-7098342156");
        CabCustomer c3 = new CabCustomer(102, "Charlie", "nIt","manjeera", 1, "+91-9123908123");
        CabCustomer c4 = new CabCustomer(101, "James", "nIt", "hostel", 5, "+91-9871231234");

        CabCustomerService olaCabCustomerService = new CabCustomerService();

        olaCabCustomerService.printBill(c1);
        olaCabCustomerService.addCabCustomer(c1);
        Thread.sleep(500);

        olaCabCustomerService.printBill(c2);
        olaCabCustomerService.addCabCustomer(c2);
        Thread.sleep(500);

        olaCabCustomerService.printBill(c3);
        olaCabCustomerService.addCabCustomer(c3);
        Thread.sleep(500);

        olaCabCustomerService.printBill(c4);
        olaCabCustomerService.addCabCustomer(c4);
        Thread.sleep(500);

        System.out.println("main ends");

        int count = 0;
        for(int index = 0; index < olaCabCustomerService.customer.size(); index++) {
            CabCustomer cabCustomer = olaCabCustomerService.customer.get(index);
            for(int j = index + 1; j < olaCabCustomerService.customer.size(); j++) {
                if(cabCustomer.getCustId() == olaCabCustomerService.customer.get(j).getCustId()) {

                    count++;
                    System.out.println(cabCustomer);
                    System.out.println(olaCabCustomerService.customer.get(j));
                    break;
                }
            }
        }

        if(count > 0) {
            System.out.println("Duplicate found");
        } else {
            System.out.println("No duplicates. All are unique");
        }
    }
}
