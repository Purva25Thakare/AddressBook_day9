package com.bridge.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Address_Book {
 public static void main(String[] args) {
	 System.out.println("Welcome to Address Book");
	 	/*Scanner sc = new Scanner(System.in);
	 	String info =sc.next()*/
	 ArrayList<ContactInfo> contacts;
	 
	//constructor
	       public Address_Book(){
	           ContactInfo contacts = new ArrayList<ContactInfo>();
	           ContactInfo contacts = new ContactInfo(firstname,lastname, address,zip,mobileNo);
	           
	           //add the above PersonInfo object to arraylist
	           contacts.add(contacts);
	           public void search(String name){
	               
	               for(int i = 0; i < persons.size(); i++){
	                  PersonInfo p = (PersonInfo)persons.get(i); 
	                  if(name.equals(p.name)){
	                   p.print();
	                     
	                }//if statment
	         } //for loop
	                      
	      }//function search
	    
	                 public void remove(String name){
	                for(int i = 0; i < persons.size(); i++){
	                ContactInfo contact = (ContactInfo)contacts.get(i); 
	                  if(name.equals(contact.name)){
	                   contact.remove(i); }
	                   }
	}
 
 }
 
}
