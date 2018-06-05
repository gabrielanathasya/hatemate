package com.example.asus.hatematenew.Model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("ID")
    public String ID;
    @SerializedName("Email")
    public String Email;
    @SerializedName("Password")
    public String Password;
    @SerializedName("FirstName")
    public String FirstName;
    @SerializedName("LastName")
    public String LastName;
    @SerializedName("Gender")
    public String Gender;
    @SerializedName("Status")
    public String Status;
}
