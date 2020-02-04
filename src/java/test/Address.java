/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stomp
 */
public class Address {
    
    private int id;
    private String fName;
    private String lName;
    private String address;
    private int age;
    private String gender;

    public Address(int id, String fName, String lName, String address, int age, String gender) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    
    
    public void SetID(int id) {
        id = id;
    }

    @Override
    public String toString() {
        return "id = " + id + ", Name = " + fName + " " + lName + ", address = " + address + ", age = " + age + ", gender = " + gender + '}';
    }

    
    
}
