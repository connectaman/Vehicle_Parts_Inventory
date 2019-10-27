package com.mytoyota.Register;

public class UserRegisterModel {
private String name;
private String email;
private String password;
private String phone;
private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "UserRegisterModel [name=" + name + ", email=" + email
			+ ", password=" + password + ", phone=" + phone + ", city=" + city
			+ "]";
}



}
