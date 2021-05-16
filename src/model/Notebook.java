package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Notebook implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String notes;
	private ArrayList<Section> content;
	
	public Notebook(String title) {
		this(title, "");
	}

	public Notebook(String title, String notes) {
		this.setTitle(title);
		this.setNotes(notes);
	}
	
	public void addSection() {
		
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the content
	 */
	public ArrayList<Section> getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(ArrayList<Section> content) {
		this.content = content;
	}
	
	
}
