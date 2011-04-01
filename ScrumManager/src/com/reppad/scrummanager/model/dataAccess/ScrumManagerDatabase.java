package com.reppad.scrummanager.model.dataAccess;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ScrumManagerDatabase extends SQLiteOpenHelper {

	//TODO build creation requests with DAOConstants
	private static final String CREATE_TABLE_PROJECTS = "";
	private static final String CREATE_TABLE_SPRINTS = "";
	private static final String CREATE_TABLE_TASKS = "";
	private static final String CREATE_TABLE_TEAMMEMBERS = "";

	//	private static final String CREATE_BDD = "CREATE TABLE " + TABLE_LIVRES + " ("
	//	+ COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_ISBN + " TEXT NOT NULL, "
	//	+ COL_TITRE + " TEXT NOT NULL);";

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
