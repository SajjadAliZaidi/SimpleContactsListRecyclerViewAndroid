package com.smsaz.class14;

public class Contact {
    private int imagePath;
    private String contactName;
    private String contactNumber;

    public Contact(int imagePath, String contactName, String contactNumber) {
        this.imagePath = imagePath;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public int getImagePath() {
        return imagePath;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
