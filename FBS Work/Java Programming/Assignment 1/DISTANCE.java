class Distance {
	int km;
	int m;

	void setKM(int km)
	{ 
		this.km= km;
	}
	void setM(int m)
	{ 
		this.m = m;
	}
}//Distance class ends here
class CalDistance {
	public static void main(String args[]){
		Distance d1 = new Distance();
		d1.setKM(123);
		d1.setM(23);
		


		System.out.println("Distance is: "+d1.km+" KiloMeter "+d1.m+" Meter");

		
	}//main ends here
}// CalDistance class ends here
