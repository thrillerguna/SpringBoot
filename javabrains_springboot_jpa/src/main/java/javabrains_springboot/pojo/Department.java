package javabrains_springboot.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Department")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class Department {
	@XmlElement
	@Id
	private String id;
	@XmlElement
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Department() {
	}

	
}
