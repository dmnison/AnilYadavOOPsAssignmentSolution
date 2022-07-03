import com.gl.java.admin.*;
import com.gl.java.hr.*;
import com.gl.java.tech.*;

public class Driveclass {
	
	public static void main(String[] args) {
		Admindepartment ad = new Admindepartment();
		Hrdepartment hr = new Hrdepartment();
		Techdepartment tec = new Techdepartment();
		
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("\n");
		
		System.out.println(hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");
		
		System.out.println(tec.departmentName());
		System.out.println(tec.getTodaysWork());
		System.out.println(tec.getWorkDeadline());
		System.out.println(tec.getTechStackInformation());
		System.out.println(tec.isTodayAHoliday());
	}

}
