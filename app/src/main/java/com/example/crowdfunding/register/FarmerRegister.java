package com.example.crowdfunding.register;

public class FarmerRegister {
    private int _id;
    private String _name,_mail,_address,_password;

    public FarmerRegister(){

    }
    public FarmerRegister(String name){
        this._name=name;
        /*this._mail=mail;
        this._address=address;
        this._password=password;*/
    }
    public int get_id(){
        return _id;
    }
   public String get_name(){
        return _name;
   }
   public String get_mail(){
        return _mail;
   }
   public String get_address(){
        return _address;
   }
   public String get_password(){
        return _password;
   }

   public void set_id(int _id){
        this._id=_id;
   }
   public void set_name(String name){
        this._name=name;
   }
    public void set_mail(String mail){
        this._mail=mail;
    }
    public void set_address(String address){
        this._address=address;
    }
    public void set_password(String password){
        this._password=password;
    }

}
