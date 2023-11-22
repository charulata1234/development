package com.charu;

import java.util.Scanner;

public class Print {

    Operations perfrom = new Operations();
    Scanner input = new Scanner(System.in);

    boolean flag = true;

    public void toDoList() {
        // method
        while (flag) {
            System.out.println("1. Add task");
            System.out.println("2. Update a task");
            System.out.println("3. Delete a task");
            System.out.println("4. Fetch task by id");
            System.out.println("5. Fetch all tasks");
            System.out.println("6. Fetch tasks by status");
            System.out.println("7. Search tasks ");
            System.out.println("8. Search tasks by keyword");
            System.out.println("9. View task list in ascending order");
            System.out.println("10.View task list in descending order");
            System.out.println("11. Pagination");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    perfrom.addTask();
                    System.out.println("task created");
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("Update a task");
                    perfrom.updateTaskById();
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("Delete a task");
                    perfrom.deleteTask();
                    System.out.print("\n");
                    break;
                case 4:
                    System.out.println("Fetch task by id");
                    perfrom.fetchTaskById();
                    System.out.print("\n");
                    break;
                case 5:
                    System.out.println("Fetch all tasks");
                    perfrom.fetchAllTasks();
                    System.out.print("\n");
                    break;
                case 6:
                    System.out.println("Fetch all tasks");
                    perfrom.fetchTaskByStatus();
                    System.out.print("\n");
                    break;
                case 7:
                    System.out.println("Search task ");
                    perfrom.exactSearch();
                    System.out.println("\n");
                    break;
                case 8:
                    System.out.println("Search task by keyword");
                    perfrom.fuzzySearch();
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.print("Sorting ascending");
                    perfrom.sortDeadlineInAscendingOrder();
                    System.out.println("\n");
                    break;
                case 10:
                    System.out.print("Sorting descending");
                    perfrom.sortDeadlineInDescendingOrder();
                    ;
                    System.out.println("\n");
                    break;
                case 11:
                    System.out.print("page");
                    perfrom.pagination();
                    ;

                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Invalid option");
                    flag = false;
                    break;
            }
            System.out.println("do u wish to continue");
            String ans = input.next();
            if (ans.equalsIgnoreCase("no")) {
                flag = false;
                System.out.print(("\n"));
                System.out.println("*****Thanks for using . Visit again*******");
            } else if (ans.equalsIgnoreCase("yes")) {
                flag = true;
            } else {
                System.out.println("Sorry! Invalid answer. Can't continue further");
                flag = false;
            }
        }
        input.close();
    }

}