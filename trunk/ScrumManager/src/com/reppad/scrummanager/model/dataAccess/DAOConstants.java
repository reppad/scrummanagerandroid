package com.reppad.scrummanager.model.dataAccess;

public class DAOConstants {
	
	public static final int DB_VERSION = 1;
	public static final String DB_NAME = "scrummanager.db";

	public static final String TABLE_PROJECTS = "projects";
	public static final String TABLE_SPRINTS = "sprints";
	public static final String TABLE_TASKS = "tasks";
	public static final String TABLE_TEAMMEMBERS = "team_members";

	//fields used by many tables
	public static final String COL_ALL_ID = "id";
	public static final String COL_ALL_NAME = "name";
	public static final String COL_ALL_STATE = "state";
	
	//fields used by "projects" table
	public static final String COL_PROJECTS_STARTDATE = "start_date";
	public static final String COL_PROJECTS_ESTIMATEDDURATION = "estimated_duration";

	//fields used by "sprints" table
	public static final String COL_SPRINTS_NUMBER = "number";
	public static final String COL_SPRINTS_STARTDATE = "start_date";
	public static final String COL_SPRINTS_THEORICALCAPACITY = "theoretical_capacity";
	public static final String COL_SPRINTS_ESTIMATEDDURATION = "estimatedDuration";
	public static final String COL_SPRINTS_PROJECTID = "project_id";

	//fields used by "tasks" table
	public static final String COL_TASKS_ESTIMATEDCOMPLEXITY = "estimated_complexity";
	public static final String COL_TASKS_SPRINTID = "sprint_id";
	public static final String COL_TASKS_PROJECTID = "project_id";
	public static final String COL_TASKS_USERID = "user_id";

}
