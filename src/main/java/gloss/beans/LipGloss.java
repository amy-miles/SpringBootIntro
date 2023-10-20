package gloss.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LipGloss {

	@Id
	@GeneratedValue
	private int id;
	private String colorName;
	private int colorNumber;
	@Autowired
	private Manufacturer manufacturer;

	/**
	 * 
	 */
	public LipGloss() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	/**
	 * @param colorName
	 * @param colorNumber
	 */
	public LipGloss(String colorName, int colorNumber) {
		super();
		this.colorName = colorName;
		this.colorNumber = colorNumber;
	}

	/**
	 * @param id
	 * @param colorName
	 * @param colorNumber
	 */
	public LipGloss(int id, String colorName, int colorNumber) {
		super();
		this.id = id;
		this.colorName = colorName;
		this.colorNumber = colorNumber;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the colorName
	 */
	public String getColorName() {
		return colorName;
	}

	/**
	 * @param colorName the colorName to set
	 */
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	/**
	 * @return the colorNumber
	 */
	public int getColorNumber() {
		return colorNumber;
	}

	/**
	 * @param colorNumber the colorNumber to set
	 */
	public void setColorNumber(int colorNumber) {
		this.colorNumber = colorNumber;
	}

	/**
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "LipGloss [id=" + id + ", colorName=" + colorName + ", colorNumber=" + colorNumber + ", manufacturer="
				+ manufacturer + "]";
	}
	
	
	
	
	
}
