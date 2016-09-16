package lab.domain;

public class Country {
	
	private int id;
	
	private String Name;
	
	private String codeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", Name=" + Name + ", codeName="
				+ codeName + "]";
	}

}
