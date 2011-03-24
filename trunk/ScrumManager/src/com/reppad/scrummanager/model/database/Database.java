package com.reppad.scrummanager.model.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

//TODO exemple a adapter (http://www.tutomobile.fr/comment-utiliser-sqlite-sous-android-tutoriel-android-n%C2%B019/19/10/2010/)
public class Database extends SQLiteOpenHelper {
	
	private static final String TABLE_LIVRES = "table_livres";
	private static final String COL_ID = "ID";
	private static final String COL_ISBN = "ISBN";
	private static final String COL_TITRE = "Titre";
 
	private static final String CREATE_BDD = "CREATE TABLE " + TABLE_LIVRES + " ("
	+ COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_ISBN + " TEXT NOT NULL, "
	+ COL_TITRE + " TEXT NOT NULL);";
 
	public Database(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
 
	@Override
	public void onCreate(SQLiteDatabase db) {
		//on créé la table à partir de la requête écrite dans la variable CREATE_BDD
		db.execSQL(CREATE_BDD);
	}
 
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//On peut fait ce qu'on veut ici moi j'ai décidé de supprimer la table et de la recréer
		//comme ça lorsque je change la version les id repartent de 0
		db.execSQL("DROP TABLE " + TABLE_LIVRES + ";");
		onCreate(db);
	}

}
