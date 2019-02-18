package fr.pcohen.business;

import java.util.ArrayList;

public class Search {
	
	private ArrayList<Document> documents;
	
	/**
	 * Instanciate a new search of documents
	 * Can be accessed by byTag() method
	 * @param ArrayList<Document>
	 */
	public Search(ArrayList<Document> documents) {
		setDocuments(documents);
	}
	
	/**
	 * verify if an arraylist of documents have an entry who match with a the tag
	 * @param tag (Tag)
	 * @return List of document containing tag (ArrayList<Document>)
	 */
	public ArrayList<Document> byTag(Tag tag) {
		
		ArrayList<Document> ListDocuments = new ArrayList<>();
		
		//Lookup into each document of the array
		for (Document document :  documents) {
			ArrayList<Tag> tags = document.getListTags();
			
			//compare our tag whit each tag of the document
			for(Tag compareTag : tags) {
				if (tag.getTag().equals(compareTag.getTag())) ListDocuments.add(document);
			}
			
			
		}
		
		return ListDocuments;
		
		
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	private void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

}
