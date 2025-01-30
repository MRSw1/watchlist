package watchlist.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import watchlist.models.Show;
import watchlist.services.ShowService;

@RestController

public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }
    //add a new Show to the Database
    @PostMapping("/api/shows")
    public ResponseEntity<Show> addShow(@RequestBody Show show) {
        Show savedShow = showService.saveShow(show);
        return ResponseEntity.ok(savedShow);
    }
    //Return the show with the specified id 
    @GetMapping("/api/shows/{id}")
   Show one(@PathVariable int id) {
    	return showService.getShow(id);
    }
    //return all shows saved in the Database
    @GetMapping("api/shows/")
    List<Show> all(){
    	return showService.getAllShows();
    }
    //Update existing Database entity 
    @PutMapping("api/shows/{id}")
    Show one(@PathVariable int id, @RequestBody Show show) {
    	return showService.updateShow(id, show);
    }
    
}