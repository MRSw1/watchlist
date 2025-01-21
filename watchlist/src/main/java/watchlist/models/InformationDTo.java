package watchlist.models;

import java.sql.Date;

public class InformationDTo {

	public int userId;
	public String username;
	public String email;
	public String role;
	public String passwordHashed;
	
	public int watchlistId;
	public String watchlistName;
	
	public int watchlistItemId;
	public float rating;
	public String progress; 
	
	public int showId;
	public String showName;
	public String genre;
	public Date releaseYear;
	
	 // Getters and Setters for userId
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getters and Setters for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getters and Setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getters and Setters for role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getters and Setters for passwordHashed
    public String getPasswordHashed() {
        return passwordHashed;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed;
    }

    // Getters and Setters for watchlistId
    public int getWatchlistId() {
        return watchlistId;
    }

    public void setWatchlistId(int watchlistId) {
        this.watchlistId = watchlistId;
    }

    // Getters and Setters for watchlistName
    public String getWatchlistName() {
        return watchlistName;
    }

    public void setWatchlistName(String watchlistName) {
        this.watchlistName = watchlistName;
    }

    // Getters and Setters for watchlistItemId
    public int getWatchlistItemId() {
        return watchlistItemId;
    }

    public void setWatchlistItemId(int watchlistItemId) {
        this.watchlistItemId = watchlistItemId;
    }

    // Getters and Setters for rating
    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    // Getters and Setters for progress
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    // Getters and Setters for showId
    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    // Getters and Setters for showName
    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    // Getters and Setters for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getters and Setters for releaseYear
    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }
}
