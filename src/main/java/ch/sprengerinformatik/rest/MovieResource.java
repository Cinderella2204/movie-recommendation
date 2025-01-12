package ch.sprengerinformatik.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @GET
    public List<Movie> getMovies() {
        // Mocked data
        return List.of(
                new Movie(1L, "Harry Potter and the Sorcerer's Stone", "Fantasy", 2001, 7.6)
        );
    }
}