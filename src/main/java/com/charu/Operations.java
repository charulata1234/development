package com.charu;
import java.util.Scanner;

import java.util.*;
public class Operations {
    Tasks task ;
    Scanner myObj = new Scanner(System.in);
    ArrayList<Tasks> lists = new ArrayList<Tasks>();
    int counter;
    public void add(){
     if(!lists.isEmpty()){
    counter+=lists.get(lists.size()-1).getId();
     }
     else{
        counter=1;
     }
    System.out.println("Add name");
    String name = myObj.next();
    task = new Tasks(counter, name, "inprogress");
    lists.add(task);
    System.out.println(lists);
    }
    public void delete(){
 

        System.out.println("Enter id to be deleted");
        int serialNumber = myObj.nextInt();
        for(int i=0;i<lists.size();i++){
            if(lists.get(i).getId()==serialNumber){
                lists.remove(i);
                 System.out.println("deleted");
            }
            else{
                System.out.println("not present");
            }
        }
    }
    public void fetch(){
        System.out.println("Enter id to be fetched");
        int serialNumber = myObj.nextInt();
        for(int i=0;i<lists.size();i++){
            if(lists.get(i).getId()==serialNumber){
                
                 System.out.println(lists.get(i));
            }
            else{
                System.out.println("not present");
            }
        }
    }
    public void fetchAllTasks(){
        System.out.println("----------All tasks are listed below-------");
        System.out.println(lists);
    }
    public void updateTaskById(){
        System.out.println("Enter id to be updated");
        int serialNumber = myObj.nextInt();
        for(int i=0;i<lists.size();i++){
            if(lists.get(i).getId()==serialNumber){
                System.out.println("Enter name");
                String updatedName = myObj.next();
                lists.get(i).setName(updatedName);
                System.out.println("Update status");
                String status = myObj.next();
                
                lists.get(i).setStatus(status);
                System.out.println("Record updated");
            }
            else{
                System.out.println("not present");
            }
        }
    }
}



