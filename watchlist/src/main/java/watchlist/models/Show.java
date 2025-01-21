package watchlist.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table (name = "shows")
public class Show {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement id 
@Column (name ="show_id", nullable = false, unique = true)
private int showId;

@Column(name="name", nullable = false)
private String name;

@Column(name="genre", nullable = false)
private String genre;

@Column(name="release_year",nullable = false)
private Date releaseYear;
	
//getter 
public int getShowId() {
	return showId;
}
public void setShowId(int id) {
	this.showId = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Date getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(Date year) {
	this.releaseYear = year;
}
}
