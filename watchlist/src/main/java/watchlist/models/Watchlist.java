package watchlist.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="watchlists")
public class Watchlist {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement id 
@Column (name ="watchlist_id", nullable = false, unique = true)
private int watchlistId;

@Column(name="user_id",nullable = false)
private int userId;

@Column(name="name",nullable = false)
private String watchlistName;

public int getWatchlistId() {
	return watchlistId;
}
public void setWatchlistId(int id) {
	this.watchlistId = id;
}
public int getUserId(){
	return userId;
}
public void setUserId(int id) {
	this.userId = id;
}
public String getWatchlistName(){
	return watchlistName;
}
public void setWatchlistName(String name) {
	this.watchlistName = name;
}
}
