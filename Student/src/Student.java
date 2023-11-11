import java.util.Scanner;
public class Student
{
  private String name,thirdname;
  private int id;
  private int yearofstudy;
  private String semester;
  private String egn;
  public Student()
  {
	  name="";
	  thirdname="";
	  id=0;
	  yearofstudy=0;
	  semester="";
	  egn="";
  }
  public Student(String name,String thirdname,int id,int yearofstudy,String semester,String egn)
  {
	  this.name=name;
	  this.thirdname=thirdname;
	  this.id=id;
	  this.yearofstudy=yearofstudy;
	  this.semester=semester;
	  this.egn=egn;
  }
  public String GetName()
  {
	  return name;
  }
  public String SetName(String name)
  {
	  this.name=name;
	  return name;
  }
  public int Getid()
  {
	  return id;
  }
  public int Setid(int id)
  {
	  this.id=id;
	  return id;
  }
  public int Getyearofstudy()
  {
	  return yearofstudy;
  }
  public int Setyearofstudy(int yearofstudy)
  {
	  this.yearofstudy=yearofstudy;
	  return yearofstudy;
  }
  public String GetSemester()
  {
	  return semester;
  }
  public String SetSemester(String semester)
  {  
	  this.semester=semester;
	  return semester;
  }
  public String Getegn()
  {
	  return egn;
  }
  public String Setegn(String egn)
  {
	  this.egn=egn;
	  return egn;
  }
  public void InPut()
  {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Name:");
	  name=scanner.next();
	  System.out.println("Thirdname:");
	  thirdname=scanner.next();
	  System.out.println("Id:");
	  id=scanner.nextInt();
	  System.out.println("Yearofstudy:");
	  yearofstudy=scanner.nextInt();
	  System.out.println("Semester:");
	  semester=scanner.next();
	 
  }
  public void OutPut()
  {
	  System.out.println(String.format("Name of the student %s",name,thirdname));
	  System.out.println(String.format("Id and year of study of the student %d",id,yearofstudy));
	  System.out.println(String.format("Semester %s",semester));
	  System.out.println(String.format("egn %s",egn));
  }
  public void isEGNValidator(String birthday, String city,boolean isMale)
  {
	  String Daybirth [] = birthday.split("-"); //Split Masiv na Daybirth 2002-11-20  DayBirth[0] = "2002"; DayBirth[1] = "11"; DayBirth[2] = "20";
	  int year = Integer.parseInt(Daybirth[0]); //Promenqme tipa ot string na int i go zapisvame v nova promenliva
	  String n= String.format("%02d", year % 100);      //Izchisleniqta v string promenqme v string i vzimame poslednite dve cifri ot egn
	  egn = egn+n; // zapisvame poslednite dve cifri ot godinata
	  int month = Integer.parseInt(Daybirth[1]);
	  if(year<1900)  //Rodenite predi 1900 se dobavq 20
	  {
		  month+=20;
	  }
	  else if(year>1999) //Rodenite sled 1999 se dobavq 40
	  {
		  month+=40;
	  }
	  egn += String.valueOf(month);  //dinamichno parsvane oshte v samoto izchislenie
	  egn += Daybirth[2];
	  switch(city)
	  {
	  case  "Pleven" : egn+="400";
	  break;
	  case  "Plovdiv" : egn+="500";
	  break;
	  case  "Gabrovo" : egn+="233";
	  break;
	  case  "Sofiq" : egn+="721";
	  break;
	  case "Burgas" : egn+="093";
	  break;
	  case "Haskovo" : egn+="871";
	  }
	  if(isMale)
	  {
		  egn+="1";
	  }
	  else
	  {
		  egn+="0";  
	  }
  }
  public void isEGNValue()
  {
	  try
	  {
		  if(egn.length()>10)
		  {
			  throw new EGNException("Egn is not value"); //Generira izklyuchenie
		  }
		  else
		  {
			  System.out.println("Egn is valued");
		  }
	  }
	  catch(EGNException e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
  
}
