package com.charu;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
class Tasks {

    private int taskId;

    private String taskName;

    private TaskStatus taskStatus;

    private String deadline;

}