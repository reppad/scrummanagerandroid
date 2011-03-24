package com.reppad.scrummanager.model.valueObjects;

import java.util.List;

public class Sprint {
	public int number;
	public int name;
	public int startDate;
	public int theoreticalCapacity;
	public int estimatedDuration;
	public Project.State state;
	
	public List<Task> todoTasks;
	public List<Task> ipTasks;
	public List<Task> doneTasks;
}
