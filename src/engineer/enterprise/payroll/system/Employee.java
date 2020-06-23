/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineer.enterprise.payroll.system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed
 */
   public abstract  class  Employee{
    
    private String ID;
    private String name;
    private int age;
    private double Salary;

    
    public Employee(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        
    }
    // setter for data
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return Salary;
    }
    
    
    abstract void Add();
//    abstract void Edit(String id);
    abstract void Delete();
} 


class Engineer extends Employee{ 
  
    Grade grade;
    Boolean check =false;
    static Vector<Engineer> eng = new Vector<Engineer>();

    
    
    public Grade getGrade() {
        return grade;
    }
    
 
     
    public Engineer(String ID, String name, int age, Grade grade) {
        super(ID, name, age);
        this.grade=grade;
        Upto60(age);
        super.setSalary(grade.salary);
    }
    @Override
    void Add() {
       
        eng.addElement(this);
       
    }
// ___________________________remove this??? we don't use this edit function_________________________________________ 
//    @Override
//    void Edit(String id) {
//      for(int i =0 ;i<eng.capacity();i++){
//          if(id.equals(eng.get(i).getID())){
//              // view data 
//          }
//      }
//    }
//___________________________________________________________________________________________________________________
    @Override
     void Delete() {
       
         eng.remove(this);
        
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
        super.setSalary(grade.salary);
        
    }
    public void Upto60(int age){
        
        if(age>=60){
            check=true;
           grade.salary=2500;
            super.setSalary(grade.salary);
        }
    }
   
}
 

class Grade{
    
String position ;
double payRate=0;
double salary;
double taxRate;
int workingHour;
double Bouns;
Grade(int workingHour,String position){
this.workingHour=workingHour;
this.position=position;
    salary=calcSalary(position);
    
}
double calcSalary(String position){
  
    if(position.equals("Manager")||position.equals("manager")){
        
        position ="Manager";
        if(workingHour<7){
        payRate=2000;
        taxRate= 0.1*((workingHour*payRate));
        salary =(workingHour*payRate)-taxRate;
        }
        else{
            payRate=2000;
            taxRate= 0.1*((workingHour*payRate));
            salary =(workingHour*payRate)-taxRate;
            Bouns=0.4*(salary);
            salary+= Bouns;
        }
       
   }
   else if(position.equals("Project Manager")||position.equals("project manager")){
        
        position ="Project Manager";
        if(workingHour<8){
        payRate=1500;
        taxRate= 0.1*((workingHour*payRate));
        salary =(workingHour*payRate)-taxRate;
        }
        else{
            payRate=1500;
            taxRate= 0.1*((workingHour*payRate));
            salary =(workingHour*payRate)-taxRate;
            Bouns=0.35*(salary);
            salary+= Bouns;
        }
       
   }
    
   else if(position.equals("team leader")||position.equals("Team Leader")){
       position ="Team Leader";
       if(workingHour<9){
       payRate=1000;
       taxRate= 0.1*((workingHour*payRate));
       salary =(workingHour*payRate)-taxRate;
       }
       else{
       payRate=1000;
       taxRate= 0.1*((workingHour*payRate));
       salary =(workingHour*payRate)-taxRate;
       Bouns=0.3*(salary);
       salary+= Bouns;
        
       }
       
   }
   else if(position.equals("team member")||position.equals("Team Member")){
       position ="Team Member";
       if(workingHour<10){
       payRate=600;
       taxRate= 0.1*((workingHour*payRate));
       salary =(workingHour*payRate)-taxRate;
       }
       else{
           payRate=600;
       taxRate= 0.1*((workingHour*payRate));
       salary =(workingHour*payRate)-taxRate;
       Bouns=0.2*(salary);
       salary+= Bouns;
       }
       
   }
   else{
       payRate=500;
       taxRate=0.1*((workingHour*payRate));
       salary =(workingHour*payRate)-taxRate;
       
   }
 return salary;
}

}
class trainee extends Employee{

static Vector<trainee> tra = new Vector<trainee>();
private String universty_name;
private int Gpa ;
private String acdemic_year;
final double  salary = 1000;
private int days=0;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void setUniversty_name(String universty_name) {
        this.universty_name = universty_name;
    }

    public void setGpa(int Gpa) {
        this.Gpa = Gpa;
    }

    public void setAcdemic_year(String acdemic_year) {
        this.acdemic_year = acdemic_year;
    }

    public String getUniversty_name() {
        return universty_name;
    }

    public int getGpa() {
        return Gpa;
    }

    public String getAcdemic_year() {
        return acdemic_year;
    }

    public double getSalary() {
        return salary;
    }


public trainee(String ID, String name, int age,String universty_name ,int Gpa ,String acdemic_year){

super(ID , name , age);
this.universty_name = universty_name;
this.Gpa = Gpa;
this.acdemic_year = acdemic_year;
}
  public trainee(String ID, String name, int age,String universty_name ,int Gpa ,String acdemic_year,int days){

super(ID , name , age);
this.universty_name = universty_name;
this.Gpa = Gpa;
this.acdemic_year = acdemic_year;
this.days=days;
}

 @Override
    void Add() {
       
        tra.addElement(this);
       
    }
// ___________________________remove this??? we don't use this edit function_________________________________________ 
//@Override
//    void Edit(String id) {
//     
//      
//    }
//___________________________________________________________________________________________________________________
            @Override
     void Delete() {
         tra.remove(this);
    }
}

    class readfile_Eng{


 public void readData_Eng(){
        Scanner data;
        try{
            data=new Scanner(new File("EngineerData.txt"));
            
            while(data.hasNext()){
                data.useDelimiter("\n");
                String line=data.next();
                String arr[]=line.split("\\*");
                String id =arr[0];
                String name =arr[1];
                String position =arr[2];
                String workingHour =arr[3];
                String salary =arr[4];
                String age=arr[5];
                Grade g=new Grade(Integer.parseInt(workingHour),position);
                Employee emp=new Engineer(id, name, Integer.parseInt(age),g);
                emp.Add();
            }
            data.close();
            
        }
        catch(Exception e){
            System.out.println("Error");
        }
    } 

}
class readFile_trainee{
    Scanner data;
    public void readData_tra(){
    try{
      data=new Scanner(new File("traineeData.txt"));
      while(data.hasNext()){
          data.useDelimiter("\n");
          String line=data.next();
          String arr[]=line.split("\\*");
          String id=arr[0];
          String name=arr[1];
          String uniName=arr[2];
          int Gpa=Integer.parseInt(arr[3]);
          int days=Integer.parseInt(arr[4]);
          String acdYear=arr[5];
          int age=Integer.parseInt(arr[6]);
          Employee emp =new trainee(id, name, age, uniName, Gpa,acdYear,days);
          emp.Add();
          
      }
     }
    catch(Exception e){
      System.out.println("Error");
     }
    }
    
}
       class writeData_trainee{
     public void writeData_tra(){
         File file =new File("traineeData.txt");
        try{
        FileWriter Data= new FileWriter(file);
        for(int i=0;i<trainee.tra.size();i++){
       Data.write(trainee.tra.get(i).getID());
      Data.write("*");
       Data.write(trainee.tra.get(i).getName());
        Data.write("*");
        Data.write(trainee.tra.get(i).getUniversty_name());
        Data.write("*");
        Data.write(String.valueOf(trainee.tra.get(i).getGpa()));
        Data.write("*");
        Data.write(String.valueOf(trainee.tra.get(i).getDays()));
        Data.write("*");
        Data.write(trainee.tra.get(i).getAcdemic_year());
        Data.write("*");
        Data.write(String.valueOf(trainee.tra.get(i).getAge())+"\n");
        }
        Data.close();
       }
        catch(IOException e){
        System.out.println("Error");
    }
     }
}
       class writeData_Eng{
    public void WriteData_Eng(){
    File file =new File("EngineerData.txt");
        try{
        FileWriter Data= new FileWriter(file);
        for(int i=0;i<Engineer.eng.size();i++){
          Data.write(Engineer.eng.get(i).getID());
        Data.write("*");
        Data.write(Engineer.eng.get(i).getName());
        Data.write("*");
        Data.write(Engineer.eng.get(i).getGrade().position);
        Data.write("*");
        Data.write(String.valueOf(Engineer.eng.get(i).getGrade().workingHour));
        Data.write("*");
        Data.write(String.valueOf(Engineer.eng.get(i).getSalary()));
        Data.write("*");
        Data.write(String.valueOf(Engineer.eng.get(i).getAge())+"\n");
        }
        Data.close();
       }
        catch(IOException e){
        System.out.println("Error");
    }
   }
}
//////////////////_________________________________________________________________________///////////////////////
//////////////////////////...........thank you for making me happy always...........//////////////////////////////
////////////////////////////////////...............................///////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////_________________________________________________________________________///////////////////////
