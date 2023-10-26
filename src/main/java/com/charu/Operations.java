package com.charu;

import java.util.*;

public class Operations {
    private Tasks task;
    Scanner input = new Scanner(System.in);
    ArrayList<Tasks> lists = new ArrayList<Tasks>();
    int newTask = 0;

    public void addTask() {
        // method
        if (!lists.isEmpty()) {
            newTask = newTask + 1;
        } else {
            newTask = 1;
        }
        System.out.println("Enter your taskName please....");
        String taskName = input.next();

        System.out.println("Enter deadline for the task");
        String taskDeadline = input.next();

        System.out.println("Confirm status");
        System.out.print("\n");
        System.out.println("1 --> INPROGRES");
        System.out.println("2 --> TODO");
        System.out.println("3 --> DONE");
        String inputStatus = input.next();

        try {
            if (inputStatus.equalsIgnoreCase(TaskStatus.INPROGRESS.getValue())
                    || inputStatus.equalsIgnoreCase("inprogress")) {
                task = new Tasks(newTask, taskName, TaskStatus.INPROGRESS, taskDeadline);
            } else {
                System.out.print("Can't proceed");
                System.exit(1);

            }

            lists.add(task);
        } catch (Exception e) {
            System.out.printf("Exception occurred while  adding tasks", e.getMessage());
            ;
        }
        System.out.print("\n");
        System.out.println("***************************************");
        System.out.print("\n");
        System.out.println("Serial No" + "|" + "Task Name" + "|" + "Status" + "      " + "|" + "Deadline");
        System.out.print("\n");
        System.out.println(lists.get(0).getTaskId() + "        " + "| " + lists.get(0).getTaskName() + "      " + "|"
                + lists.get(0).getTaskStatus() + "  " + "| " + lists.get(0).getDeadline());
        System.out.print("\n");
        System.out.println("***************************************");
        System.out.println();
    }

    public void deleteTask() {

        if (lists.isEmpty()) {
            System.out.println("No task present to be deleted");
        } else {
            System.out.println("Enter taskId to be deleted");

            int taskId = input.nextInt();
            try {
                for (int i = 0; i < lists.size(); i++) {
                    if (lists.get(i).getTaskId() == taskId) {
                        lists.remove(i);
                        System.out.printf("Task deleted with taskId :" + " ", taskId);
                    } else {
                        System.out.println("Task Id not present");
                    }
                }
            } catch (Exception e) {
                System.out.printf("Exception occurred while deleting task", e.getMessage());
            }
        }
    }

    public void fetchTaskById() {
        System.out.println("Enter task id to be fetched");
        int taskId = input.nextInt();
        if (lists.isEmpty()) {
            System.out.print("No tasks exists to be fetched");
        } else {
            try {
                for (int i = 0; i < lists.size(); i++) {
                    if (lists.get(i).getTaskId() == taskId) {

                        System.out.print("\n");
                        System.out.println("***************************************");
                        System.out.print("\n");
                        System.out.println(
                                "Serial No" + "|" + "Task Name" + "|" + "Status" + "      " + "|" + "Deadline");
                        System.out.print("\n");
                        System.out.println(
                                lists.get(i).getTaskId() + "        " + "| " + lists.get(i).getTaskName() + "      "
                                        + "|"
                                        + lists.get(i).getTaskStatus() + "  " + "| " + lists.get(i).getDeadline());
                        System.out.print("\n");
                        System.out.println("***************************************");
                        System.out.println();
                    } else {
                        System.out.println("Sorry ! above taskId not present");
                    }
                }
            } catch (Exception e) {
                System.out.printf("Exception occurred while fetching task by id");
            }
        }
    }

    public void fetchTaskByStatus() {
        if (lists.isEmpty()) {
            System.out.print("No tasks exists to be fetched");
        } else {
            System.out.println("Enter status of the tasks to be fetched");
            String status = input.next();
            System.out.print("\n");
            System.out.println("***************************************");
            System.out.print("\n");
            System.out.println("Serial No" + "|" + "Task Name" + "|" + "Status" + "      " + "|" + "Deadline");
            System.out.print("\n");
            try {
                for (int i = 0; i < lists.size(); i++) {
                    if (status.equalsIgnoreCase(TaskStatus.INPROGRESS.getValue())
                            || status.equalsIgnoreCase("inprogress")) {
                        if (lists.get(i).getTaskStatus().equals(TaskStatus.INPROGRESS)) {

                            System.out.println(lists.get(i).getTaskId() + "        " + "| " + lists.get(i).getTaskName()
                                    + "      " + "|"
                                    + lists.get(i).getTaskStatus() + "  " + "| " + lists.get(i).getDeadline());

                        }

                    } else {
                        System.out.println("Sorry ! above taskId with status not present");
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception occurred while fetching task by status");
            }
            System.out.print("\n");
            System.out.println("***************************************");
            System.out.print("\n");
        }
    }

    public void fetchAllTasks() {
        if (lists.isEmpty()) {
            System.out.print("No tasks exists to be fetched");
        } else {
            System.out.println("----------All tasks are listed below-------");
            System.out.print("\n");
            System.out.println("***************************************");
            System.out.print("\n");
            System.out.println("Serial No" + "|" + "Task Name" + "|" + "Status" + "      " + "|" + "Deadline");
            System.out.print("\n");

            try {
                for (int i = 0; i < lists.size(); i++) {

                    System.out.println(
                            "" + lists.get(i).getTaskId() + "        " + "| " + lists.get(i).getTaskName() + "      "
                                    + "|"
                                    + lists.get(i).getTaskStatus() + "  " + "| " + lists.get(i).getDeadline());
                    System.out.print("\n");
                }
            } catch (Exception e) {
                System.out.printf("Exception occurred while fetching all tasks");
            }
            System.out.println("***************************************");
            System.out.print("\n");
        }
    }

    public void updateTaskById() {
        if (lists.isEmpty()) {
            System.out.print("No tasks exists to be fetched");
        } else {
            System.out.println("Enter id to be updated");
            System.out.println("1 --> INPROGRES");
            System.out.println("2 --> TODO");
            System.out.println("3 --> DONE");
            int taskId = input.nextInt();
            try {
                for (int i = 0; i < lists.size(); i++) {
                    if (lists.get(i).getTaskId() == taskId) {
                        System.out.println("Enter updated task");
                        String updatedName = input.next();

                        System.out.println("Update status");
                        String status = input.next();
                        if (status.equalsIgnoreCase(TaskStatus.INPROGRESS.getValue())
                                || status.equalsIgnoreCase("inprogress")) {

                            lists.get(i).setTaskName(updatedName);
                            lists.get(i).setTaskStatus(TaskStatus.INPROGRESS);
                        } else if (status.equalsIgnoreCase(TaskStatus.TODO.getValue())
                                || status.equalsIgnoreCase(("todo"))) {

                            lists.get(i).setTaskName(updatedName);
                            lists.get(i).setTaskStatus(TaskStatus.TODO);

                        } else if (status.equalsIgnoreCase(TaskStatus.DONE.getValue())
                                || status.equalsIgnoreCase(("done"))) {

                            lists.get(i).setTaskName(updatedName);
                            lists.get(i).setTaskStatus(TaskStatus.DONE);
                        } else {
                            System.out.print("Invalid status");
                            System.exit(1);
                        }

                        System.out.println("Task updated");
                    } else {
                        System.out.println("Sorry! task id not present to be updated");
                    }
                }
            } catch (Exception e) {
                System.out.printf("Exception ocurred while updating task for a given id");
            }
        }
    }

    public void searchByTaskId() {

        System.out.println("Please enter taskId to be searched");
        int listsSize = lists.size();
        int[] taskIds = new int[listsSize];
        for (int i = 0; i < taskIds.length; i++) {
            taskIds[i] = lists.get(i).getTaskId();
        }
        int i = 0;
        int j = taskIds.length - 1;
        int mid;
        Arrays.sort(taskIds);
        int inputStatus = input.nextInt();
        while (i <= j) {
            mid = i + (j - i) / 2;

            if (taskIds[mid] == inputStatus) {
                System.out.println("TaskId is present" + " " + taskIds[mid]);

                System.out.print("\n");
                System.out.println("***************************************");
                System.out.print("\n");
                System.out.println("Serial No" + "|" + "Task Name" + "|" + "Status" + "      " + "|" + "Deadline");
                System.out.print("\n");
                System.out.println("***************************************");

                System.out.println(
                        "" + lists.get(mid).getTaskId() + "        " + "| " + lists.get(mid).getTaskName() + "      "
                                + "|"
                                + lists.get(mid).getTaskStatus() + "  " + "| " + lists.get(mid).getDeadline());
                System.out.print("\n");

                return;
            }
            if (taskIds[mid] < inputStatus) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }
        System.out.println("Sorry!task id not present");
        return;
    }

    public void searchByTaskName() {

        System.out.println("Please enter taskName to be searched");
        int listsSize = lists.size();
        String[] taskNames = new String[listsSize];
        for (int i = 0; i < taskNames.length; i++) {
            taskNames[i] = lists.get(i).getTaskName();

        }
        int i = 0;
        int j = taskNames.length - 1;
        int mid;
        Arrays.sort(taskNames);
        String inputStatus = input.next();
        while (i <= j) {
            mid = i + (j - i) / 2;
            int res = inputStatus.compareTo(taskNames[mid]);
            if (res == 0) {
                System.out.println("Task name is present" + " " + taskNames[mid]);

                System.out.print("\n");
                System.out.println("***************************************");
                System.out.print("\n");
                System.out.println("Serial No" + "|" + "Task Name" + "|" + "Status" + "      " + "|" + "Deadline");
                System.out.print("\n");
                System.out.println("***************************************");

                System.out.println(
                        "" + lists.get(mid).getTaskId() + "        " + "| " + lists.get(mid).getTaskName() + "      "
                                + "|"
                                + lists.get(mid).getTaskStatus() + "  " + "| " + lists.get(mid).getDeadline());
                System.out.print("\n");

                return;
            }
            if (res > 0) {
                i = mid + 1;

            } else {
                j = mid - 1;
            }
        }
        System.out.println("Sorry! task name not present");
        return;

    }
    
}