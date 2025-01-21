package watchlist.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement id 
@Column (name ="user_id", nullable = false, unique = true)
private int userId;

@Column(name="username",nullable = false)
private String username;

@Column(name="mail",nullable=false)
private String email;
	
@Column(name="role",nullable=false)
private String role;

@Column(name="password_hash",nullable = false)
private String passwordHashed;

public int getUserId() {
	return userId;
}
public void setUserId(int id) {
	this.userId = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String name) {
	this.username = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getPasswordHash() {
	return passwordHashed;
}
public void setPasswordHash(String password) {
	this.passwordHashed = password;
}
}
