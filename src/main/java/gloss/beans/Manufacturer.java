package gloss.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Manufacturer {
	
	private String name;
	private String line;
	/**
	 * 
	 */
	public Manufacturer() {
		super();
		
	}
	/**
	 * @param name
	 * @param line
	 */
	public Manufacturer(String name, String line) {
		super();
		this.name = name;
		this.line = line;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the line
	 */
	public String getLine() {
		return line;
	}
	/**
	 * @param line the line to set
	 */
	public void setLine(String line) {
		this.line = line;
	}
	@Override
	public String toString() {
		return "Manufacturer [name=" + name + ", line=" + line + "]";
	}
	
	
}
