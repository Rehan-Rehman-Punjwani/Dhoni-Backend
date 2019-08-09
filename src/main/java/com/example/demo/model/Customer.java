package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dhoni_customer")
public class Customer {
		@Id
		int id;
		public String firstname;
		public String lastname;
		public String username;
		public String address;
		public String cnic;
		public String cell_no;
		public String password;
		public String email;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCnic() {
			return cnic;
		}
		public void setCnic(String cnic) {
			this.cnic = cnic;
		}
		public String getCell_no() {
			return cell_no;
		}
		public void setCell_no(String cell_no) {
			this.cell_no = cell_no;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
					+ username + ", address=" + address + ", cnic=" + cnic + ", cell_no=" + cell_no + ", password="
					+ password + "]";
		}
		
		
}
