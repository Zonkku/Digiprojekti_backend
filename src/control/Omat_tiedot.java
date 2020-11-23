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


@WebServlet("/omat_tiedot")
public class Omat_tiedot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Omat_tiedot() {
        super();
        System.out.println("Omat_tiedot.Omat_tiedot()");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Omat_tiedot.doGet()");
		Dao dao = new Dao();
		ArrayList<Kayttaja> kayttajat = dao.listaaKaikki();
		System.out.println(kayttajat);
		String strJSON = new JSONObject().put("kayttajat", kayttajat).toString(); //kayttajat-lista jsoniin	
		response.setContentType("application/json"); //kirjoitetaan servletin html-rajapintaan
		//m‰‰ritet‰‰n kirjoituksen tyypiksi application/json
		PrintWriter out = response.getWriter(); //out-niminen print writer 
		out.println(strJSON); //kirjoitetaan strJSON		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doPost()");		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doPut()");		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Autot.doDelete()");		
	}

}
