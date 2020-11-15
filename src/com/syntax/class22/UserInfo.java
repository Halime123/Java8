package com.syntax.class22;

public class UserInfo extends UserClass{
    String address;
    UserInfo(String liya,String name, int num) {
        super(name, num);
        this.address = address;
    }

        void details(){
            System.out.println(super.getName()+super.getNum());

    }

    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Liya","34567890",67890);
        userInfo.details();
    }
}
