package ActivityDec8;

public class StudentCourse {
	private int cId;
	private String cName;
	private String sName;
	public StudentCourse(int cId, String cName, String sName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.sName = sName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

}
