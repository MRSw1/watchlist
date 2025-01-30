package watchlist.services;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import watchlist.models.Show;
import watchlist.repositories.ShowRepository;

@Service
public class ShowService {

    private final ShowRepository showRepository;

    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public Show saveShow(Show show) {
        return showRepository.save(show);
    }
    public Show getShow(int id) {
    	return showRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }
    public List<Show> getAllShows(){
    	return showRepository.findAll();
    }
    public Show updateShow(int id, Show show) {
    	show.setShowId(id);
    	return showRepository.save(show);
    }
}