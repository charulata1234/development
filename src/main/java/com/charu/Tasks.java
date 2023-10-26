package com.charu;

import java.time.LocalDate;
import java.util.Date;

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

    private LocalDate deadline;

}