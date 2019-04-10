package com.revature.warrior;

public class Assasin extends Warrior{
	
	private String weapon;

	public Assasin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assasin(String name, String clan, String weapon) {
		super(name, clan);
		// TODO Auto-generated constructor stub
		this.weapon = weapon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assasin other = (Assasin) obj;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"Assasin [weapon=" + weapon + "]";
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	
	
	
	

}
