package com.reppad.scrummanager.model.dataAccess;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ScrumManagerDatabase extends SQLiteOpenHelper {


	public ScrumManagerDatabase(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DAOConstants.CREATE_TABLE_PROJECTS);
		db.execSQL(DAOConstants.CREATE_TABLE_SPRINTS);
		db.execSQL(DAOConstants.CREATE_TABLE_TASKS);
		db.execSQL(DAOConstants.CREATE_TABLE_TEAMMEMBERS);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//nothing to do
	}

}
