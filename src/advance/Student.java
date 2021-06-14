package advance;

public class Student implements Cloneable{
	String name;
	int age;
	String diachi;
	String sdt;
	double dtb;
	
	public Student(String name, int age, String diachi, String sdt, double dtb) {
		super();
		this.name = name;
		this.age = age;
		this.diachi = diachi;
		this.sdt = sdt;
		this.dtb = dtb;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name: %s, age: %s, diachi: %s, sdt: %s, dtb: %s ", name,age,diachi,sdt,dtb);
	}
}
