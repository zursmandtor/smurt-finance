package com.rudenko.android.wallet21.entities.operation;



/**
 * Created by Евгений on 18.09.2014.
 */
public class TypeOfOperation {

    private String name;
    private String type;

    public TypeOfOperation() {
    }

    public TypeOfOperation(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	
    	
        	this.name = name;

    	
    }
    

    
    
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    
   
}
