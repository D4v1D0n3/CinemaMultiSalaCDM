package it.unimib.finalproject.server;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.core.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;
import java.net.*;

//connessione con il database 
@Path("proiezioni")
public class ProiezioniResource {

    /**
     * Implementazione di GET "/contacts".
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public /*Response*/void getProiezioni() {
        try {
            Socket client = new Socket("localhost", 5353);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream());
            System.out.println("Collegato all'host " + client.getInetAddress());
            String response = "";
            while(true){
                response = in.readLine();
                if(response.equals("EOF"))
                    break;
                System.out.println(response);
            }
            out.println("getProiezioni: ");
            out.flush();
            response = in.readLine();
            System.out.println(response); //gestione risposta dal DB
            out.close();
            in.close();
            client.close();
            System.out.println("Connessione chiusa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    /**
//     * Implementazione di POST "/contacts".
//     */
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response getContacts(String body) {
//        var contact = new Contact();
//
//        try {
//            var mapper = new ObjectMapper();
//            contact = mapper.readValue(body, Contact.class);
//
//            // Il nome e il numero ci devono essere.
//            if (contact.getNumber() == null || contact.getName() == null)
//                return Response.status(Response.Status.BAD_REQUEST).build();
//
//        } catch (JsonParseException | JsonMappingException e) {
//            System.out.println(e);
//            return Response.status(Response.Status.BAD_REQUEST).build();
//        } catch (IOException e) {
//            System.out.println(e);
//            return Response.serverError().build();
//        }
//
//        // Si apre una socket verso il database, si ottiene un nuovo ID, lo si
//        // applica al contatto e lo si aggiunge.
//
//        try {
//            var uri = new URI("/contacts/" + contact.getId());
//
//            return Response.created(uri).build();
//        } catch (URISyntaxException e) {
//            System.out.println(e);
//            return Response.serverError().build();
//        }
//    }

    /**
     * Implementazione di GET "/contacts/{id}".
     */
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContact(@PathParam("id") int id) {
        String response = "";
        try {
            Socket client = new Socket("localhost", 5353);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream());
            System.out.println("Collegato all'host " + client.getInetAddress());
            while(true){
                response = in.readLine();
                if(response.equals("EOF"))
                    break;
                System.out.println(response);
            }
            out.println("getProiezioneByID: ");
            out.flush();
            response = in.readLine();
            System.out.println(response); //gestione risposta dal DB
            out.close();
            in.close();
            client.close();
            System.out.println("Connessione chiusa");
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        if (response == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok().build();
    }
}
