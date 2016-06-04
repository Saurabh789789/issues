package main.java;

import javax.validation.constraints.Size;

public class Repo {

	@Size(min=4, max=35)
	private String url;
	
	
 
	public String geturl() {
		return url;
	}
 
	public void seturl(String url) {
		this.url = url;
	}
 
	

}