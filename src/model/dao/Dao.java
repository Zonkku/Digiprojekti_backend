package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Kayttaja;

public class Dao {
	private Connection con=null;
	private ResultSet rs = null;
	private PreparedStatement stmtPrep=null; 
	private String sql;
	private String db ="Digip.sqlite";
	
	private Connection yhdista(){
    	Connection con = null;    	
    	String path = System.getProperty("catalina.base");    	
    	path = path.substring(0, path.indexOf(".metadata")).replace("\\", "/"); 
    	String url = "jdbc:sqlite:"+path+db;    	
    	try {	       
    		Class.forName("org.sqlite.JDBC");
	        con = DriverManager.getConnection(url);	
	        System.out.println("Yhteys avattu.");
	     }catch (Exception e){	
	    	 System.out.println("Yhteyden avaus epäonnistui.");
	        e.printStackTrace();	         
	     }
	     return con;
	}
	
	public ArrayList<Kayttaja> listaaKaikki(){
		ArrayList<Kayttaja> kayttajat = new ArrayList<Kayttaja>();
		sql = "SELECT * FROM Digip";       
		try {
			con=yhdista();
			if(con!=null){ //jos yhteys onnistui
				stmtPrep = con.prepareStatement(sql);        		
        		rs = stmtPrep.executeQuery();   
				if(rs!=null){ //jos kysely onnistui
					//con.close();					
					while(rs.next()){
						Kayttaja kayttaja = new Kayttaja();
						kayttaja.setUsername(rs.getString(1));
						kayttaja.setSocialSecurityCode(rs.getString(2));
						kayttaja.setFamilyName(rs.getString(3));	
						kayttaja.setFirstNames(rs.getString(4));	
						kayttaja.setNickName(rs.getString(5));	
						kayttaja.setAddress(rs.getString(6));	
						kayttaja.setPostalCode(rs.getString(7));	
						kayttaja.setPostalDistrict(rs.getString(8));	
						kayttaja.setLanguageCode(rs.getString(9));	
						kayttaja.setLanguageCodeDescription(rs.getString(10));	
						kayttaja.setWorkPeriodId(rs.getString(11));	
						kayttaja.setWorkPeriodDescription(rs.getString(12));	
						kayttaja.setOficialJobDescription(rs.getString(13));	
						kayttaja.setWorkDepartment(rs.getString(14));	
						kayttaja.setWorkPeriodStartDate(rs.getDate(15));	
						kayttaja.setWorkPeriodEndDate(rs.getDate(16));	
						kayttaja.setWorkPeriodStatus(rs.getBoolean(17));	
						kayttaja.setIsSupervisor(rs.getBoolean(18));	
						kayttaja.setIdOfSupervisor(rs.getString(19));	
						
						
						
						
						kayttajat.add(kayttaja);
					}					
				}				
			}	
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return kayttajat;
	}
}
