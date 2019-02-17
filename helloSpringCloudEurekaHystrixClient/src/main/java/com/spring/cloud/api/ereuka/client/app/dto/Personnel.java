package com.spring.cloud.api.ereuka.client.app.dto;


/***
 * 
 * @author Marc Montan
 *
 */

public class Personnel {
	 
    private String name;
    private int id;
     
    public Personnel(int id, String name) {
        super();
        this.id=id;
        this.name=name;
    }
     
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    @Override
    public String toString() {
        return "Personnel [name=" + name + ", id=" + id + "]";
    }
}