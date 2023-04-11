package com.vineela.learn;
enum Capital
{	
	California,Georgia,Texas;
	//GA,TX,FL,NY,CA;	


public static void main(String[] args) {
	Capital CA=California;
	switch (CA) {

		//case GA:
	case California:
				//System.out.println("GEORGIA");
		System.out.println("CA");
				break;
				
		//case TX:
		case Texas:
           //System.out.println("Texas");
			System.out.println("Tx");
	 			break;	
	 		//case NY:
			//System.out.println("NEWYORK");
			//break;

	 	//	case CA:
			//System.out.println("CALIFORNIA");
		//	break;
			
			default :
				System.out.println("GA");
	}
}
}
