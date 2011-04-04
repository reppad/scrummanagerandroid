package com.reppad.scrummanager.model.dataAccess;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ScrumManagerDatabase extends SQLiteOpenHelper {

	//creation requests
	private static final String CREATE_TABLE_PROJECTS = "CREATE TABLE " + DAOConstants.TABLE_PROJECTS + " ("
	+ DAOConstants.COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ DAOConstants.COL_ALL_NAME + " TEXT NOT NULL, "
	+ DAOConstants.COL_PROJECTS_STARTDATE + " INTEGER NOT NULL, "
	+ DAOConstants.COL_PROJECTS_ESTIMATEDDURATION + " INTEGER NOT NULL, "
	+ DAOConstants.COL_ALL_STATE +  " INTEGER NOT NULL);";
	
	private static final String CREATE_TABLE_SPRINTS = "CREATE TABLE " + DAOConstants.TABLE_SPRINTS + " ("
	+ DAOConstants.COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ DAOConstants.COL_SPRINTS_NUMBER + " INTEGER NOT NULL, "
	+ DAOConstants.COL_ALL_NAME + " TEXT NOT NULL, "
	+ DAOConstants.COL_SPRINTS_STARTDATE + " INTEGER NOT NULL, "
	+ DAOConstants.COL_SPRINTS_THEORICALCAPACITY + " INTEGER NOT NULL, "
	+ DAOConstants.COL_SPRINTS_ESTIMATEDDURATION + " INTEGER NOT NULL, "
	+ DAOConstants.COL_ALL_STATE + " INTEGER NOT NULL, "
	+ DAOConstants.COL_SPRINTS_PROJECTID +   " INTEGER NOT NULL);";
	
	private static final String CREATE_TABLE_TASKS = "CREATE TABLE " + DAOConstants.TABLE_TASKS + " ("
	+ DAOConstants.COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ DAOConstants.COL_ALL_NAME + " TEXT NOT NULL, "
	+ DAOConstants.COL_TASKS_ESTIMATEDCOMPLEXITY + " INTEGER NOT NULL, "
	+ DAOConstants.COL_ALL_STATE + " INTEGER NOT NULL, "
	+ DAOConstants.COL_TASKS_SPRINTID + " INTEGER NOT NULL, "
	+ DAOConstants.COL_TASKS_PROJECTID + " INTEGER NOT NULL, "
	+ DAOConstants.COL_TASKS_USERID +  " INTEGER NOT NULL);";
	
	private static final String CREATE_TABLE_TEAMMEMBERS = "CREATE TABLE " + DAOConstants.TABLE_TEAMMEMBERS + " ("
	+ DAOConstants.COL_ALL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
	+ DAOConstants.COL_ALL_NAME + " TEXT NOT NULL);";


	public ScrumManagerDatabase(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLE_PROJECTS);
		db.execSQL(CREATE_TABLE_SPRINTS);
		db.execSQL(CREATE_TABLE_TASKS);
		db.execSQL(CREATE_TABLE_TEAMMEMBERS);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//nothing to do
	}

}
