package watchlist.services;

import org.springframework.stereotype.Service;

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
}