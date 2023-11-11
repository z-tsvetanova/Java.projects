
public class Firma 
{
   String name;
   String adress;
   int Number;
   int fNumber;
   String Website;
   Manager Manager;
   public Firma()
   {
	   Manager = new Manager("Zorry","Cvetanova",0);
	   name ="";
	   adress = "";
	   Number = 0;
	   fNumber = 0;
	   Website = "";   
	   
   }
   public Firma(String name,String adress,int Number,int fNumber,String Website)
   {
	   this.name = name;
	   this.adress = adress;
	   this.Number = Number;
	   this.fNumber = fNumber;
	   this.Website = Website;	   
   }
   public void OutPut()
   {
	   System.out.println(name);
	   System.out.println(adress);
	   System.out.println(fNumber);
	   System.out.println(Website);
	   System.out.println(Manager.Name);
	   System.out.println(Manager.Thirdname);
	   System.out.println(Manager.Number);
   }
}

