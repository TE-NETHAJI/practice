package com.company.module.reverse;

public class Soccer extends Sports {
	
	    @Override
	    String getName(){
	    	this.getName();
	        return "Soccer Class";
	    }
	    public static void main(String[] args) {
				
		    Sports obj1 = new Soccer();
		    Sports obj2 =(Sports) obj1;
		    obj2.getNumberOfTeamMembers();
		    obj2.getName();
		    
		    
		}

}
