package watchlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import watchlist.models.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {
    // JpaRepository provides default methods like save, findById, etc.
}