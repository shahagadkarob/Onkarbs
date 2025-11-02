class Date {
	int day,month,year;
	String dow;
	void setDay(int d)
	{ 
		this.day = d;
	}
	void setMonth(int m)
	{ 
		this.month = m;
	}
	void setYear(int y)
	{ 
		this.year = y;
	}
	void setDow(String str )
	{ 
		this.dow = str;
	}
	}//Date class ends here
class Test {
	public static void main(String args[]){
		 Date d1;
		d1= new Date();
		d1.setDay(8);
		d1.setMonth(3);
		d1.setYear(2003);
		d1.setDow("Wednesday");
		System.out.println("Date:"+d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println("Day:"+d1.dow);

		
	}//main ends here
}//test class ends here