package com.employee;

public class Discovery
{
	private String developers;
	private String testers;
	public String getDevelopers() {
		return developers;
	}
	public void setDevelopers(String developers) {
		this.developers = developers;
	}
	public String getTesters() {
		return testers;
	}
	public void setTesters(String testers) {
		this.testers = testers;
	}
	@Override
	public String toString() {
		return "Discovery [developers=" + developers + ", testers=" + testers + "]";
	}

}
