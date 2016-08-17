package com.company;

/**
 * Created by Administrator on 2016-08-16.
 */
public class Address
{
    //private int id;
    private String id;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String email;

/*    public int getId(){
        return id;

    }
    public int getName(){
        return id;

    }
    public void setName(String name){
        this.name = name;

    }
    public void setId(int id){
        this.id = id;

    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        int intid = Integer.parseInt(id);
        if(intid < 0)
            this.id = "0";
        else
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() == 0)
            name = "unknown";
        else
            this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() > 20)
            this.address = address.substring(0,20);
        else
            this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        if(zipcode.length() == 5 && isNumeric(zipcode))
            this.zipcode = zipcode;
        else
            zipcode = "00000";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        int lastindexa = email.lastIndexOf("@");
        int lastindexdot = email.lastIndexOf(".");
        if (lastindexdot == -1 || lastindexa == -1)
            this.email = "";
        else
            if(email.length() > 5 && (lastindexdot > lastindexa))
                this.email = email;
            else
                this.email = "";
    }

    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
