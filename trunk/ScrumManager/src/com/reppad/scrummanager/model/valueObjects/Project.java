package com.reppad.scrummanager.model.valueObjects;

import java.util.List;

public class Project {
	
	public enum State { TODO , IP , DONE };
	
	public String name;
	public int startDate;
	public int estimatedDuration;
	public State state;
	
	public List<Sprint> sprints;
	public List<Task> outSprintTasks;
	public List<Task> redundantTasks;
}
