package com.employee;

public class Employee
{
	 private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [project=" + project + "]";
	}

}
