package com.kevlar.SpringFxApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hib__categories")
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	@Column(length = 25, unique = true)
	private String name;
	private boolean visible;

	public Category(String name) 
	{
		this.name = name;
		visible = true;
	}
	public Category(){}

	public Short getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public boolean isVisible() 
	{
		return visible;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setVisible(boolean visible) 
	{
		this.visible = visible;
	}

	@Override
	public String toString() 
	{
		return "Category{" + "id=" + id + ", name=" + name + ", visible=" + visible + '}';
	}
}
