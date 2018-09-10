package br.com.soft360;

import javax.ws.rs.*;

@Path("/starwars")
public class StarWarsWS {

    @GET
    @Path("/author")
    public String getAuthor() {
        return "George Lucas";
    }

}
