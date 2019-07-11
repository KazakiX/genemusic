package GeneMusic;

import javax.sound.midi.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.*;

public class paintFrame extends JFrame{
	
//	int [] s= {5,23,45,56,66,3,6,7};
	paintFrame(){
		setTitle("my paint");
		setBounds(260,50,750,600);
		
		 
	}
	 void start() {
		
		 add (new wuxianpu());
		
	}
	
}

//		public static void main(String[] args) {
//	    	 paintFrame jp=new paintFrame();
//	    	 
//	    	 
//	     }

