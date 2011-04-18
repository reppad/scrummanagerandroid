package com.reppad.scrummanager.model.valueObjects;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	public enum State { TODO , IP , DONE };
	
	public Long id;
	public String name;
	public int startDate;
	public int estimatedDuration;
	public State state;
	
	public List<Sprint> sprints;
	
	public Project() {
		sprints = new ArrayList<Sprint>();
	}
	
	public void setIntegerState(int intState) {
		switch (intState) {
		case 0:
			state = State.TODO;
			break;
		case 1:
			state = State.IP;
			break;
		case 2:
			state = State.DONE;
			break;
		default:
			break;
		}
	}
}
