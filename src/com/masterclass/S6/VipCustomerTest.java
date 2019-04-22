package com.masterclass.S6;

public class VipCustomerTest {

    public static void main(String[] args) {
        //VipCustomer vp = new VipCustomer();
        //VipCustomer vp = new VipCustomer("Hercules",500);
        VipCustomer vp = new VipCustomer("Hercules",500, "myemail@hercules.com");
        System.out.println(vp.getName()+ " "+vp.getCreditLimit()+" "+vp.getEmail());


    }
}
