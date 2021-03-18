package org.acme;


import io.quarkus.panache.common.Sort;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CatResource {

    @GetMapping("/cats")
    public List<Cat> getCats(){
        return Cat.listAll();
    }

    @PostMapping("/cats")
    @Transactional
public void addCats(Cat cat){
        Cat.persist(cat);
    }

    @GetMapping("/cat/{id}")
    public Cat getCat(@PathVariable("id") long id){
        return Cat.findById(id);
    }

    @DeleteMapping("/cat/{id}")
    @Transactional
    public void deleteCat(@PathVariable("id") long id)
    {
        Cat.delete("id", id);
    }

   @GetMapping("/cat/name/{name}")
   public List<Cat> getCatwithName(@PathVariable("name") String name){
      return Cat.getCatByName(name);
    }

}
