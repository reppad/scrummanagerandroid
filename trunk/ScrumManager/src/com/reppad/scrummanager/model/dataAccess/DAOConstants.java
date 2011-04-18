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


	//creation requests
	public static final String CREATE_TABLE_PROJECTS = "CREATE TABLE " + TABLE_PROJECTS + " ("
	+ COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ COL_ALL_NAME + " TEXT NOT NULL, "
	+ COL_PROJECTS_STARTDATE + " INTEGER NOT NULL, "
	+ COL_PROJECTS_ESTIMATEDDURATION + " INTEGER NOT NULL, "
	+ COL_ALL_STATE +  " INTEGER NOT NULL);";

	public static final String CREATE_TABLE_SPRINTS = "CREATE TABLE " + TABLE_SPRINTS + " ("
	+ COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ COL_SPRINTS_NUMBER + " INTEGER NOT NULL, "
	+ COL_SPRINTS_STARTDATE + " INTEGER NOT NULL, "
	+ COL_SPRINTS_THEORICALCAPACITY + " INTEGER NOT NULL, "
	+ COL_SPRINTS_ESTIMATEDDURATION + " INTEGER NOT NULL, "
	+ COL_ALL_STATE + " INTEGER NOT NULL, "
	+ COL_SPRINTS_PROJECTID +   " INTEGER NOT NULL);";

	public static final String CREATE_TABLE_TASKS = "CREATE TABLE " + TABLE_TASKS + " ("
	+ COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ COL_ALL_NAME + " TEXT NOT NULL, "
	+ COL_TASKS_ESTIMATEDCOMPLEXITY + " INTEGER NOT NULL, "
	+ COL_ALL_STATE + " INTEGER NOT NULL, "
	+ COL_TASKS_SPRINTID + " INTEGER NOT NULL, "
	+ COL_TASKS_PROJECTID + " INTEGER NOT NULL, "
	+ COL_TASKS_USERID +  " INTEGER NOT NULL);";

	public static final String CREATE_TABLE_TEAMMEMBERS = "CREATE TABLE " + TABLE_TEAMMEMBERS + " ("
	+ COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ COL_ALL_NAME + " TEXT NOT NULL);";

}
