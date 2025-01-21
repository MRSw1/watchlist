package watchlist.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "watchlist_items")
public class WatchlistItem {
@Id //Primary Key of entity 
@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement id 
@Column (name ="watchlist_item_id", nullable = false, unique = true)
private int watchlistItemId; 

@Column(name = "watchlist_id", nullable = false, unique = true)
private int watchlistId; 

@Column(name ="show_id",nullable = false, unique = true)
private int showId;

@Column(name = "rating", nullable = false)
private float rating;

@Column(name = "progress",nullable = false)
private String progress;

//Getter 
public int getWatchlistItemId() {
	return watchlistItemId;
}
public int getWatchlistId() {
	return watchlistId;
}
public int getShowId() {
	return showId;
}
public float getRating() {
	return rating;
}
public String getProgress() {
	return progress;
}

//setter 
public void setWatchlistItemId(int id) {
	this.watchlistItemId = id;
}
public void setWatchlistId(int id) {
	this.watchlistId = id;
}
public void setShowId(int id) {
	this.showId = id;
}
public void setRating(float rating) {
	this.rating = rating;
}
public void setProgress(String progress) {
	this.progress = progress;
}
}
