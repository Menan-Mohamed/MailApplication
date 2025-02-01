//package com.example.demo.Model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FolderContact {
//    private String name;
//    private List<Contact> userContacts ;
//
//    public FolderContact(String name) {
//        this.name = name;
//        this.userContacts = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Contact> getUserMails() {
//        return userContacts;
//    }
//
//    public void setUserMails(List<Contact> userMails) {
//        this.userContacts = userMails;
//    }
//
//    public void addUserMail(String userName , String userMail) {
//        ArrayList<String> emailList = new ArrayList<>();
//        emailList.add(userMail);
//        Contact contact = new Contact(userName, emailList);
//        this.userContacts.add(contact);
//    }
//}
