<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<title>Omat tiedot</title>

<style>
.oikealle{
	text-align: right;
}
</style>

</head>
<body>
<table id="listaus">
	<thead>	
		<tr>
			<th class="oikealle">Hakusana:</th>
			<th colspan="2"><input type="text" id="hakusana"></th>
			<th><input type="button" value="hae" id="hakunappi"></th>
		</tr>			
		<tr>
			<th>username</th>
			<th>socialSecurityCode</th>
			<th>familyName</th>
			<th>firstNames</th>
            <th>nickName</th>
			<th>address</th>
			<th>postalCode</th>
			<th>PostalDistrict</th>
			<th>LanguageCode</th>
			<th>LanguageCodeDescription</th>
			<th>workPeriodId</th>
			<th>workPeriodDescription</th>
			<th>OficialJobDescription</th>
			<th>workDepartment</th>
			<th>workPeriodStartDate</th>
			<th>workPeriodEndDate</th>
			<th>workPeriodStatus</th>
			<th>isSupervisor</th>
			<th>idOfSupervisor</th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>
<script>

/*

Kaikki funktiot joko ovat $(document).readyn sisällä tai niitä kutsutaan sieltä.

Aiemmin tehty String strJSON = new JSONObject().put("kayttajat", kayttajat).toString(); 

Jsonissa on nyt "kayttajat"-niminen elementti, joka pitää sisällään kayttajat-listan

*/	


$(document).ready(function(){
	
	
	$("#hakunappi").click(function(){		
		haeTiedot();
	});
	$(document.body).on("keydown", function(event){
		  if(event.which==13){ //Enteriä painettu, ajetaan haku
			  haeTiedot();
		  }
	});

	$("#hakusana").focus();//viedään kursori hakusana-kenttään sivun latauksen yhteydessä	

});
	  
		
        //Haetaan tiedot back endistä javascriptin ajax-funktiolla.
        
        
            //Näytetään tiedot selaimessa ottamalla ne each-loopilla resultin kautta. Kayttajat-objektin lista käydään läpi
        
    
 function haeTiedot(){
		$("#listaus tbody").empty();	
		$.ajax({
			url:"users/"+$("#hakusana").val(),
    		type:"GET",
    		dataType:"json",
    		
    		//Funktio antaa tiedot resultissa json-objektina
    		success:function(result){ 
    		
        	$.each(result.kayttajat, function(i, field){  
        
        	
    	        //Tehdään html-string "htmlStr" ja lisätään siihen fieldin tieto. 
        	    var htmlStr;
        		htmlStr+="<tr>";
        		htmlStr+="<td>"+field.username+"</td>";
        		htmlStr+="<td>"+field.socialSecurityCode+"</td>";
        		htmlStr+="<td>"+field.familyName+"</td>";
        		htmlStr+="<td>"+field.firstNames+"</td>";  
        		htmlStr+="<td>"+field.nickName+"</td>";
        		htmlStr+="<td>"+field.address+"</td>";
        		htmlStr+="<td>"+field.postalCode+"</td>";  
        		htmlStr+="<td>"+field.PostalDistrict+"</td>";
        		htmlStr+="<td>"+field.LanguageCode+"</td>";
        		htmlStr+="<td>"+field.LanguageCodeDescription+"</td>";
        		htmlStr+="<td>"+field.workPeriodId+"</td>";  
        		htmlStr+="<td>"+field.workPeriodDescription+"</td>";
        		htmlStr+="<td>"+field.OficialJobDescription+"</td>";
        		htmlStr+="<td>"+field.workDepartment+"</td>";
        		htmlStr+="<td>"+field.workPeriodStartDate+"</td>";  
        		htmlStr+="<td>"+field.workPeriodEndDate+"</td>";
        		htmlStr+="<td>"+field.workPeriodStatus+"</td>";
        		htmlStr+="<td>"+field.isSupervisor+"</td>";
        		htmlStr+="<td>"+field.idOfSupervisor+"</td>";  
        		htmlStr+="</tr>";
            
            	//Viedään tiedot eli htmlStr table bodyyn
        		$("#listaus tbody").append(htmlStr);
        	    
        		
        });	
    }});
}	

	
</script>
</body>
</html>