package fr.pcohen.business;

public class Tag {
	
	private String tag;
	
	/**
	 * Construct a Tag from a String
	 * @param tag (String)
	 */
	public Tag(String tag) {
		
		setTag(tag);
		
	}
	
	/*
	 * Accesssors
	 */
	public String getTag() {
		return tag;
	}

	private void setTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public String toString() {
		
		String toString = "{Tag[Name : " + this.tag + "]}";
		
		return toString;
		
	}

}
