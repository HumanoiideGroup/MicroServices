package com.spring.cloud.api.ereuka.client.app.dto;


/***
 * 
 * @author Marc Montan
 *
 */

public class Etudiant
{
    private String name;
    private String className;
     
    public Etudiant(String name, String className) {
        super();
        this.name = name;
        this.className = className;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getClassName() {
        return className;
    }
 
    public void setClassName(String className) {
        this.className = className;
    }

	@Override
	public String toString() {
		return "Etudiant [name=" + name + ", className=" + className + "]";
	}
    
}