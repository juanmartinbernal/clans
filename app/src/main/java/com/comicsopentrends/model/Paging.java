package com.comicsopentrends.model;

public class Paging{
	private Cursors cursors;

	public void setCursors(Cursors cursors){
		this.cursors = cursors;
	}

	public Cursors getCursors(){
		return cursors;
	}

	@Override
 	public String toString(){
		return 
			"Paging{" + 
			"cursors = '" + cursors + '\'' + 
			"}";
		}
}
