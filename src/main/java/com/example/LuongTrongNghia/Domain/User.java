package com.example.LuongTrongNghia.Domain;

public class User {
    public int Id;
    public String Name;
    public String Email;
    public String Phone;
    public String Address;
    public String Password;
    public int Role;


    public User(){

    }

    public User(int Id, String Name, String Email, String Phone, String Address, String Password, int Role){
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;
        this.Password = Password;
        this.Role = Role;
    }

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name= Name;
    }

    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email= Email;
    }

    public String getPhone(){
        return Phone;
    }
    public void setPhone(String Phone){
        this.Phone= Phone;
    }

    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address= Address;
    }

    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password= Password;
    }

    public int getRole(){
        return Role;
    }
    public void setRole(int Role){
        this.Role=Role;
    }

}
