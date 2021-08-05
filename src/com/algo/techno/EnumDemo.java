package com.algo.techno;

public class EnumDemo {
Directions dir;

	public EnumDemo(Directions dir) {
	super();
	this.dir = dir;
}
public void getDirection() {
	 switch (dir) {
     case EAST:
        System.out.println("Est");
        break;
                  
     case WEST:
        System.out.println("Ouest");
        break;
                       
     case NORTH: 
        System.out.println("Nord");
        break;
                      
     default:
        System.out.println("Sud");
        break;
   }
}

	public static void main(String[] args) {
		EnumDemo enp=new EnumDemo(Directions.EAST);
       enp.getDirection();
	}

}
