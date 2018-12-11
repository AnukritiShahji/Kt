package com.employee;

public class Project
{
   
   private Discovery discovery;

public Discovery getDiscovery() {
	return discovery;
}
public void setDiscovery(Discovery discovery) {
	this.discovery = discovery;
}
@Override
public String toString() {
	return "Project [discovery=" + discovery + "]";
}
	

}
