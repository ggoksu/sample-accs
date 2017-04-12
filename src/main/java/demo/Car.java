package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String brand;
	private String model;
    private String year;

	public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }
}