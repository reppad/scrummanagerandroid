package com.reppad.scrummanager.model.dataAccess;

import java.util.Date;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DAO {
 
	private SQLiteDatabase db;
	private ScrumManagerDatabase scrumManagerDB;
 
	public DAO(Context context){
		//create DB and tables
		scrumManagerDB = new ScrumManagerDatabase(context, DAOConstants.DB_NAME, null, DAOConstants.DB_VERSION);
	}
 
	public void open(){
		//open DB in write mode
		db = scrumManagerDB.getWritableDatabase();
	}
 
	public void close(){
		//close DB access
		db.close();
	}
 
	public SQLiteDatabase getDB(){
		return db;
	}
 
	public long insertProject(String name, Date startDate, int duration, int state){
		//creation of ContentValue (works like a HashMap)
		ContentValues values = new ContentValues();
		//put values in ContentValue, keys correpond to columns names
		values.put(DAOConstants.COL_ALL_NAME, name);
		values.put(DAOConstants.COL_PROJECTS_STARTDATE, startDate.getTime());
		values.put(DAOConstants.COL_PROJECTS_ESTIMATEDDURATION, duration);
		values.put(DAOConstants.COL_ALL_STATE, state);
		//insert in table
		return db.insert(DAOConstants.TABLE_PROJECTS, null, values);
	}
 
	public long insertSprint(int number, String name, Date startDate, int theoricalCapacity, int estimatedDuration, int state, int projectId){
		//creation of ContentValue (works like a HashMap)
		ContentValues values = new ContentValues();
		//put values in ContentValue, keys correpond to columns names
		values.put(DAOConstants.COL_SPRINTS_NUMBER, number);
		values.put(DAOConstants.COL_ALL_NAME, name);
		values.put(DAOConstants.COL_SPRINTS_STARTDATE, startDate.getTime());
		values.put(DAOConstants.COL_SPRINTS_THEORICALCAPACITY, theoricalCapacity);
		values.put(DAOConstants.COL_SPRINTS_ESTIMATEDDURATION, estimatedDuration);
		values.put(DAOConstants.COL_ALL_STATE, state);
		values.put(DAOConstants.COL_SPRINTS_PROJECTID, projectId);
		//insert in table
		return db.insert(DAOConstants.TABLE_SPRINTS, null, values);
	}
	
	public long insertTask(String name, int estimatedComplexity, int state, int sprintId, int projectId, int userId){
		//creation of ContentValue (works like a HashMap)
		ContentValues values = new ContentValues();
		//put values in ContentValue, keys correpond to columns names
		values.put(DAOConstants.COL_ALL_NAME, name);
		values.put(DAOConstants.COL_TASKS_ESTIMATEDCOMPLEXITY, estimatedComplexity);
		values.put(DAOConstants.COL_ALL_STATE, state);
		values.put(DAOConstants.COL_TASKS_SPRINTID, sprintId);
		values.put(DAOConstants.COL_TASKS_PROJECTID, projectId);
		values.put(DAOConstants.COL_TASKS_USERID, userId);
		//insert in table
		return db.insert(DAOConstants.TABLE_TASKS, null, values);
	}
	
	public long insertUser(String name){
		//creation of ContentValue (works like a HashMap)
		ContentValues values = new ContentValues();
		//put value in ContentValue, key correpond to column name
		values.put(DAOConstants.COL_ALL_NAME, name);
		//insert in table
		return db.insert(DAOConstants.TABLE_TEAMMEMBERS, null, values);
	}
 
	/**
	 * remove a project and all these sprints and tasks
	 * @param projectId
	 * @return
	 */
	public int removeProject(int projectId){
		//remove project tasks
		db.delete(DAOConstants.TABLE_TASKS, DAOConstants.COL_TASKS_PROJECTID + " = " + projectId, null);
		//remove project sprints
		db.delete(DAOConstants.TABLE_SPRINTS, DAOConstants.COL_SPRINTS_PROJECTID + " = " + projectId, null);
		//remove project
		return db.delete(DAOConstants.TABLE_PROJECTS, DAOConstants.COL_ALL_ID + " = " + projectId, null);
	}
	
	/**
	 * remove sprint and all these tasks
	 * @param sprintId
	 * @return
	 */
	public int removeSprint(int sprintId){
		//remove tasks assigned to this sprint
		db.delete(DAOConstants.TABLE_TASKS, DAOConstants.COL_TASKS_SPRINTID, null);
		//remove sprint
		return db.delete(DAOConstants.TABLE_SPRINTS, DAOConstants.COL_ALL_ID + " = " + sprintId, null);
	}
	
	/**
	 * remove a task
	 * @param taskId
	 * @return
	 */
	public int removeTask(int taskId){
		return db.delete(DAOConstants.TABLE_TASKS, DAOConstants.COL_ALL_ID + " = " + taskId, null);
	}
	
	/**
	 * remove a team member
	 * @param userId
	 * @return
	 */
	public int removeTeamMemberWithId(int userId){
		//TODO update all tasks assigned to this user
		return db.delete(DAOConstants.TABLE_TEAMMEMBERS, DAOConstants.COL_ALL_ID + " = " + userId, null);
	}
 
//	public int updateLivre(int id, Livre livre){
//		//La mise à jour d'un livre dans la BDD fonctionne plus ou moins comme une insertion
//		//il faut simple préciser quelle livre on doit mettre à jour grâce à l'ID
//		ContentValues values = new ContentValues();
//		values.put(COL_ISBN, livre.getIsbn());
//		values.put(COL_TITRE, livre.getTitre());
//		return db.update(TABLE_LIVRES, values, COL_ID + " = " +id, null);
//	}
// 
//	public Livre getLivreWithTitre(String titre){
//		//Récupère dans un Cursor les valeur correspondant à un livre contenu dans la BDD (ici on sélectionne le livre grâce à son titre)
//		Cursor c = db.query(TABLE_LIVRES, new String[] {COL_ID, COL_ISBN, COL_TITRE}, COL_TITRE + " LIKE \"" + titre +"\"", null, null, null, null);
//		return cursorToLivre(c);
//	}
// 
//	//Cette méthode permet de convertir un cursor en un livre
//	private Livre cursorToLivre(Cursor c){
//		//si aucun élément n'a été retourné dans la requête, on renvoie null
//		if (c.getCount() == 0)
//			return null;
// 
//		//Sinon on se place sur le premier élément
//		c.moveToFirst();
//		//On créé un livre
//		Livre livre = new Livre();
//		//on lui affecte toutes les infos grâce aux infos contenues dans le Cursor
//		livre.setId(c.getInt(NUM_COL_ID));
//		livre.setIsbn(c.getString(NUM_COL_ISBN));
//		livre.setTitre(c.getString(NUM_COL_TITRE));
//		//On ferme le cursor
//		c.close();
// 
//		//On retourne le livre
//		return livre;
//	}

}
