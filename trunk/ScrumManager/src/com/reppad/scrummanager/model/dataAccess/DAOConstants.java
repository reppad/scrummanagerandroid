package com.reppad.scrummanager.model.dataAccess;

public class DAOConstants {

	private static final String TABLE_PROJECTS = "projects";
	private static final String TABLE_SPRINTS = "sprints";
	private static final String TABLE_TASKS = "tasks";
	private static final String TABLE_TEAMMEMBERS = "team_members";

	//TODO complete table fields
	private static final String COL_PROJECTS_NAME = "name";
	private static final String COL_PROJECTS_STARTDATE = "start_date";
	private static final String COL_PROJECTS_ESTIMATEDDURATION = "estimated_duration";
	private static final String COL_PROJECTS_STATE = "state";

	//TODO complete table fields
	private static final String COL_SPRINTS_NUMBER = "number";
	private static final String COL_SPRINTS_NAME = "name";
	private static final String COL_SPRINTS_STARTDATE = "start_date";
	private static final String COL_SPRINTS_THEORICALCAPACITY = "theoretical_capacity";
	private static final String COL_SPRINTS_ESTIMATEDDURATION = "estimatedDuration";
	private static final String COL_SPRINTS_STATE = "state";

	//TODO complete table fields
	private static final String COL_TASKS_NAME = "name";
	private static final String COL_TASKS_ESTIMATEDCOMPLEXITY = "estimated_complexity";
	private static final String COL_TASKS_STATE = "state";

	//TODO complete table fields
	private static final String COL_TEAMMEMBERS_NAME = "name";

}
