package com.revature.warrior;

import java.io.Serializable;

public class Warrior implements Serializable,Cloneable{
	
	private String name;
	private String clan;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}
	public Warrior() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Warrior(String name, String clan) {
		super();
		this.name = name;
		this.clan = clan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clan == null) ? 0 : clan.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Warrior other = (Warrior) obj;
		if (clan == null) {
			if (other.clan != null)
				return false;
		} else if (!clan.equals(other.clan))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Warrior [name=" + name + ", clan=" + clan + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
}
