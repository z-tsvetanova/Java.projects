import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class Port {
	static final int PORT=80;
	static final int TIMEOUT=2500;
	static final String HOST_NAME ="www.kst.tugab.bg";
	public static void main(String[] args)
	{
		InetAddress ip;  //deklarirame obekt ot tozi klas Inet
		try
		{
			ip = InetAddress.getByName(HOST_NAME);  //Metoda getbyname priema kato parametur nqkakuv host i vrushta kato rezultat ip addressa na dadeniq host
		}
		catch(UnknownHostException e)
		{
			System.out.println("Nerazpoznato ime na host");
			return;
		}
		Socket socket = new Socket();   //Suzdavame socket 
		try
		{
			socket.connect( new InetSocketAddress(ip, PORT), TIMEOUT);
			System.out.println("PORT" + PORT);
		}
		catch(SocketTimeoutException e)
		{
			System.out.println("Survura ne otgovarq");
		}
		catch(IOException e)
		{
			System.out.println("PORT" + PORT + "e zatvoren");
		}
	}
}
