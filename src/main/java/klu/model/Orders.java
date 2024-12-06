package klu.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jfsdexam")
public class Orders {
	@Id
	@Column(name="id")
	Long id;
	@Column(name = "date")
	String date;
	@Column(name = "productname")
	String productname;
	@Column(name = "custname")
	String custname;
	@Column(name = "quantity")
	int quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", date=" + date + ", productname=" + productname + ", custname=" + custname
				+ ", quantity=" + quantity + "]";
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
