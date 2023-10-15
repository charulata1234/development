package com.charu;
import java.util.Scanner;

public  class App 
{
    
    public static void main( String[] args )
    {
      
        Operations perfrom =new Operations();
        Scanner myObj = new Scanner(System.in);
     
        boolean flag =true;
       
        System.out.println( "*********Welcome to do list applicat1ion*********" );
        System.out.println("Choose operations from below given option: ");

        while(flag){
        System.out.println("1. Add task");
        System.out.println("2. Update a task");
        System.out.println("3. Delete a task");
        System.out.println("4. Fetch task");
        System.out.println("5. Fetch all tasks");

        int option = myObj.nextInt();
        
        switch (option) {
            case 1:
              perfrom.add();
              System.out.println("task created");
              break;
            case 2:
              System.out.println("Update a task");
              perfrom.updateTaskById();
              break;
            case 3:
              System.out.println("Delete a task");
              perfrom.delete();
              break;
            case 4:
              System.out.println("Fetch task by id");
              perfrom.fetch();
              break;
            case 5:
              System.out.println("Fetch all tasks");
              perfrom.fetchAllTasks();
              break;
            default:
              System.out.println("Invalid option");
              flag=false;
              break;
    }
    System.out.println("do u wish to continue");
    String ans= myObj.next();
    if(ans.equalsIgnoreCase("no")){
        flag=false;
    }
    else if(ans.equalsIgnoreCase("yes")){
        flag=true;
    }
    else{
        System.out.println("Sorry! Invalid answer. Can't continue further");
        flag=false;
    }
}
     myObj.close();
}
}
