package com.rmpksoft.pgsql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "CLASS_DIRECTORY")
@Immutable
public class ClassDirectory implements Serializable {

	@Id
	@Column(name = "ID", unique = true)
	private int id;

	@Column(name = "CLASS_NAME", nullable = true)
	private String className;

	@Column(name = "PCKG_NAME", nullable = true)
	private String packageName;

	@Column(name = "VERSION", nullable = true)
	private String version;

	public ClassDirectory(int id, String className, String packageName, String version) {
		this.id = id;
		this.className = className;
		this.packageName = packageName;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
