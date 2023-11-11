import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
	
	
	public static void main(String[] args) 
	{  
		String [] Tablica = { "https://www.tugab.bg/", 
		"https://www.tu-sofia.bg/",
		"https://www1.tu-varna.bg/tu-varna/",
		"https://www.uni-ruse.bg/",
		"https://consent.yahoo.com/v2/collectConsent?sessionId=3_cc-session_11582e11-61b7-4f91-b2e1-8a435c8ed1e5",
		"https://twitter.com/",
		"https://www.google.com/",
		"https://www.nasa.gov/",
		"https://www.intel.com/content/www/us/en/homepage.html",
		"https://www.intel.com/content/www/us/en/homepage.html",
		"https://www.fbi.gov/"};
		
		for(int i=0;i<Tablica.length;i++)
		{
			String REQUEST = Tablica[i];
			try
			{
				URL server = new URL(REQUEST);
				URLConnection conn = server.openConnection();
				String serverInfo = conn.getHeaderField("Server");
				if(serverInfo !=null)
				{
					System.out.println(serverInfo);
				}
				else 
				{
					if(conn.getContentLength() == -1)
				    {
						System.out.println("Lipsva mrejova svurzanost");
				    }
					else
					{
						System.out.println("Ne e zadadeno ime na web servera");
					}
				}		   
			}
			catch(MalformedURLException e)
			{
				System.out.println("Nevaliden sisntaksis na zaqvkata");
			}
			catch(IOException e)
			{
				System.out.println("Greshka pri komunikaciq sus survura");
			}

		}
	    
	}

}
