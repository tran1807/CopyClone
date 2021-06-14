package advance;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Student std1 = new Student("Tran", 19, "Hue", "0392389", 8.8);
			Student std2 = (Student) std1.clone();
			System.out.println(std1.toString());
			System.out.println(std2.toString());
	   } catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
	     }
	}

}
