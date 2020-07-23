package com.etz.calculator;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;



@Stateless
@Path("/calc2")
public class calc2 {

    @Path("/addition")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")

    public String cal(String json) {
       int sum = 0;
        JSONObject jsonob = new JSONObject(json);
        String firstNo = StringUtils.defaultIfBlank((String)jsonob.get("val"), "");
        String secondNo = StringUtils.defaultIfBlank((String)jsonob.get("val2"), "");

        sum = Integer.parseInt(firstNo) + Integer.parseInt(secondNo);

        return "[MS:1]~[MS:2]| The sum is " + sum + "~~ Thank you.";
    }

     @Path("/subtract")    
     @POST     
     @Consumes("application/json")   
     @Produces("text/plain")   
     public String sub(String json) {      
         int sub = 0; 
     JSONObject jsonob = new JSONObject(json);         
     String firstNo = StringUtils.defaultIfBlank((String) jsonob.get("vals"), "");        
     String secondNo = StringUtils.defaultIfBlank((String) jsonob.get("vals2"), ""); 
 
      sub = Integer.parseInt(firstNo) - Integer.parseInt(secondNo); 
 
     return "[MS:1]~[MS:2]| The difference is " + sub + "~~ Thank you."; 
}
       @Path("/mult")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String Mult(String json) {
        int mult = 1;
        JSONObject jsonob = new JSONObject(json);
        String firstNo = StringUtils.defaultIfBlank((String) jsonob.get("valm"), "");
        String secondNo = StringUtils.defaultIfBlank((String) jsonob.get("valm2"), "");

        mult = Integer.parseInt(firstNo) * Integer.parseInt(secondNo);

        return "[MS:1]~[MS:2]| The Multiplication is " + mult + "~~ Thank you.";
    }
    
    @Path("/divide")
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String divide(String json) {
        int div = 0;
        JSONObject jsonob = new JSONObject(json);
        String firstNo = StringUtils.defaultIfBlank((String) jsonob.get("vald"), "");
        String secondNo = StringUtils.defaultIfBlank((String) jsonob.get("vald2"), "");

        div = Integer.parseInt(firstNo) / Integer.parseInt(secondNo);

        return "[MS:1]~[MS:2]| " + firstNo + "/" + secondNo + " is " + div + "~~ Thank you.";

    }
     
     
     
     
}