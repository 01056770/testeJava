package br.com.atos.entidade;

import java.util.Date;

public class Project {
	
	private String name;
	private String customer;
	private String valueOfProject;
	private Date dtBegin;
	private Date dtEnd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getValueOfProject() {
		return valueOfProject;
	}
	public void setValueOfProject(String valueOfProject) {
		this.valueOfProject = valueOfProject;
	}
	public Date getDtBegin() {
		return dtBegin;
	}
	public void setDtBegin(Date dtBegin) {
		this.dtBegin = dtBegin;
	}
	public Date getDtEnd() {
		return dtEnd;
	}
	public void setDtEnd(Date dtEnd) {
		this.dtEnd = dtEnd;
	}
}
