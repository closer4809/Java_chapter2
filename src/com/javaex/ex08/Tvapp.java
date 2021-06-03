package com.javaex.ex08;

public class Tvapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv( 7, 20, false);  	
		
		tv.status();	
		    
		tv.power( true );
		tv.volume( 120 );  //100으로 유지
		tv.status();		          
		        
		tv.volume( false );
		tv.status();
		
		tv.channal( 0 );
		tv.status();		          
		
		tv.channal( true );
		tv.channal( true );
		tv.channal( true );
		tv.status();
		
		tv.power( false );
		tv.status();      	

	
	}

}
