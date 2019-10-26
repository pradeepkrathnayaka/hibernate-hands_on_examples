package com.rmpksoft.pgsql;

import java.time.LocalDate;

public class VisitSite {
	
	private int id;
	private String url;
	private LocalDate dt;

	public VisitSite() {
	}

	public VisitSite(int id, String url, LocalDate dt) {
		this.id = id;
		this.url = url;
		this.dt = dt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "VisitSite [id=" + id + ", url=" + url + ", dt=" + dt + "]";
	}

}
