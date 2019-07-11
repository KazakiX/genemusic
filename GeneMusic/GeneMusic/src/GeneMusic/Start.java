package GeneMusic;

import java.util.ArrayList;

public class Start {
	static String anjisuan[] ={"¸Ê°±Ëá","±û°±Ëá","çÓ°±Ëá","ÁÁ°±Ëá","ÒìÁÁ°±Ëá","±½±û°±Ëá","¸¬°±Ëá","É«°±Ëá",
			"Ë¿°±Ëá","ÀÒ°±Ëá","°ëë×°±Ëá","µ°°±Ëá","Ìì¶¬õ£°·","¹È°±õ£°·","ËÕ°±Ëá",
			"Ìì¶¬°±Ëá","¹È°±Ëá","Àµ°±Ëá","¾«°±Ëá","×é°±Ëá"};
	
	static int genelist[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//´æ·Å°±»ùËá¶ÔÓ¦µÄÒô·û
	static ArrayList<Integer> musiclist = new ArrayList<>();//´æ·ÅÒôµ÷Ë³Ğò
	static ArrayList<Integer> anjisuanlist = new ArrayList<>();//´æ·Å°±»ùËáË³Ğò
	static ArrayList<Integer> longlist = new ArrayList<>();//Òô³¤
	static int high;//Òô¸ß
	static int chan;//ÀÖÆ÷
	static String ins[] = {"±´Ë¹","¸ÖÇÙ","¼ªËû","Ğ¡ÌáÇÙ"}; //ÀÖÆ÷ÖÖÀà
	static int ticklist[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	



	
	public static void main(String args[]) {
		new mainFrame().setVisible(true);
	}
}
