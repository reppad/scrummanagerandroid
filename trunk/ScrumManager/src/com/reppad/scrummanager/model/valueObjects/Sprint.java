package com.reppad.scrummanager.model.valueObjects;

import java.util.ArrayList;
import java.util.List;

public class Sprint {
	public Long id;
	public int number;
	public int startDate;
	public int theoreticalCapacity;
	public int estimatedDuration;
	public Project.State state;
	
	public List<Task> todoTasks;
	public List<Task> ipTasks;
	public List<Task> doneTasks;
	
	public Sprint() {
		todoTasks = new ArrayList<Task>();
		ipTasks = new ArrayList<Task>();
		doneTasks = new ArrayList<Task>();
	}
}
