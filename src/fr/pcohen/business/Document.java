package fr.pcohen.business;

import java.util.ArrayList;

public class Document {
	
	private String title;
	private String description;
	private String type;
	private String contentURI;
	private ArrayList<Tag> listTags;
	
	public Document(String title, String description, String type, String contentURI, ArrayList<Tag> listTags) {
		this.title = title;
		this.description = description;
		this.type = type;
		this.contentURI = contentURI;
		this.listTags = listTags;
	}
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getType() {
		return type;
	}
	public String getContentURI() {
		return contentURI;
	}
	public ArrayList<Tag> getListTags() {
		return listTags;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private void setDescription(String description) {
		this.description = description;
	}
	private void setType(String type) {
		this.type = type;
	}
	private void setContentURI(String contentURI) {
		this.contentURI = contentURI;
	}
	private void setListTags(ArrayList<Tag> listTags) {
		this.listTags = listTags;
	}

	@Override
	public String toString() {
		
		String tags = "";
		for (Tag tag : listTags) tags += tag.toString()+ " ";
		
		return "{Document [title=" + title + ", description=" + description + ", type=" + type + ", contentURI=" + contentURI + ", listTags=" + tags + "]}";
	}

	

}
