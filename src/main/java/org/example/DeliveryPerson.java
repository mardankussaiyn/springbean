package org.example;

public class DeliveryPerson {
    private int id;
    private String name;
    private String phoneNumber;
    private String vehicle;

    public DeliveryPerson() {
    }
    public DeliveryPerson(int id, String name, String phoneNumber, String vehicle) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicle = vehicle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getVehicle() {
        return vehicle;
    }
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehicle='" + vehicle + '\'' +
                '}';
    }
}
