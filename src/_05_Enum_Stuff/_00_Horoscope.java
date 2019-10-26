package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		
		Zodiac[] options = {Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO, 
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES};
		
		JOptionPane.showMessageDialog(null, "Select your Zodiac sign", "Zodiac sign", , icon);
		zodiacEnum(Zodiac.ARIES);
		
		
	}
	
	static void zodiacEnum(Zodiac a) {
		
		//GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
		
		
		switch(a) {
		case ARIES:
			
		case TAURUS:
			
		case GEMINI:
			
		case CANCER:
		
		case LEO:
			
		case VIRGO:
			
		case LIBRA:
			
		case SCORPIO:
			
		case SAGITTARIUS:
			
		case CAPRICORN:
			
		case AQUARIUS:
			
		case PISCES:
			
		}
		
	}
	
	
}
