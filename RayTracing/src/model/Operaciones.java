package model;



public class Operaciones {

	public double dot(Vector a, Vector b){
		return a.x*b.x+a.y*b.y+a.z*b.z;
	}
	
	public Vector cross(Vector a,Vector b){
		double x = a.y*b.z-b.y*a.z;
		double y = a.z*b.x-b.z*a.x;
		double z = a.x*b.y-b.x*a.y;
		return new Vector(x,y,z);
	}
	
	public Vector escale(Vector a, double e){
		return new Vector(a.x*e,a.y*e,a.z*e);
	}
	
	
	
	
}
