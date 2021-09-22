package DatajpaC.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import DatajpaC.model.Student;
import DatajpaC.repo.Stdrepo;
@Component
public class Stdrunner implements CommandLineRunner{
	
	@Autowired
	Stdrepo repo;

	@Override
	public void run(String... args) throws Exception {
	/*
	 * where we storing data like parent  table in data and child table related parent table data
	 * HERE I USED LIST OF MARKS TO SPECIFY THE DATA	
	 */
	    Student std=new Student();
		std.setStdId(2);
		std.setStdName("Ram");
		std.setStdDepo("Dev");
		std.setMarks(Arrays.asList(100,99,98));
		repo.save(std);
	
		
		/*
		 * where we storing data like parent  table in data and child table related parent table data
	     * HERE I USED MAP OF MARKS TO SPECIFY THE DATA
	     */
		Student std1=new Student();
		std1.setStdId(1);
		std1.setStdDepo("Dev");
		std1.setStdName("Ram");
		Map<String, String> map = new HashMap<>();
		map.put("maths","A+");
		map.put("mechanics","A");
		map.put("physics","A+");
		std1.setResult(map);
		repo.save(std1);
		
		
	}

}
