package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import model.Kayttaja;
import model.dao.Dao;


@WebServlet("/users/*")
public class Users extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Users() {
        super();
        System.out.println("Users.Users()");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Users.doGet()");
		
		String pathInfo = request.getPathInfo(); //haetaan kutsun polkutiedot, /username			
		System.out.println("polku: "+pathInfo);	
		String hakusana = pathInfo.replace("/", "");

		Dao dao = new Dao();
		ArrayList<Kayttaja> kayttajat = dao.listaaKaikki(hakusana);
		
		//Haetaan kayttajat-lista daosta
		
		System.out.println(kayttajat);
		String strJSON = new JSONObject().put("kayttajat", kayttajat).toString(); //kayttajat-lista jsoniin	
		response.setContentType("application/json"); //kirjoitetaan servletin html-rajapintaan
		//m‰‰ritet‰‰n kirjoituksen tyypiksi application/json
		PrintWriter out = response.getWriter(); //out-niminen print writer 
		out.println(strJSON); //kirjoitetaan strJSON		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Users.doPost()");		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Users.doPut()");		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Users.doDelete()");		
	}

}
