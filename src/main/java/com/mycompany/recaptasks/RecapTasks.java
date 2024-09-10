/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recaptasks;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class RecapTasks {

  
    

    public static void Person(String Name, String lastName, int dateofbirth ,int age, String gender){
        System.out.println("FullName"+ Name +"\nLastName" + lastName + "\nDateOfBirth" + dateofbirth + "\nAge" + age + "\nGender" + gender);
       
       
    }
    
    
    public static void main(String[] args) {
        buzz();
      
    }
    public static void buzz(){
       Scanner Buzz= new Scanner(System.in);
        String name;
       String lastname;
       int dateofbirth;
       int age;
       String gender;
       
       System.out.println("Enter your name: ");
        name= Buzz.next();
        
        System.out.println("Enter your Last name: ");
        lastname= Buzz.next();
        
        System.out.println("Enter your dateofbirth: ");
        dateofbirth= Buzz.nextInt();

        System.out.println("Enter your age: ");
        age= Buzz.nextInt();

        System.out.println("Enter your Gender: ");
        gender= Buzz.next();
       
    }
    /*public static void Contains(){
        if  (name.contains("at"){
            
        }
        else{
            System.out.println("Value missing");
       }*/ 
    }            
    
    


   
