import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
	

	public static void main(String[] args)
	{
		/*Student [] students = { new Student(), new Student(),new Student()};
		for(int i=0;i<students.length;i++)
		{
			students[i].InPut();
			students[i].OutPut();
		}
		*/
		List<Student> MyList = new ArrayList<>();
		MyList.add(new Student());
		MyList.add(new Student());
		MyList.add(new Student());
		/*for(int i=0;i<MyList.size();i++)
		{
			MyList.get(i).InPut();
			//MyList.get(i).OutPut();
		}
		*/
		//for( Student student: MyList);
		MyList.get(0).isEGNValidator("2002-11-20","Pleven",true);
		System.out.println(MyList.get(0).Getegn());
		MyList.get(1).isEGNValidator("1975-10-12","Pleven", true);
		System.out.println(MyList.get(1).Getegn());
		MyList.get(1).isEGNValue();

	}
}
