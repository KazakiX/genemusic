package GeneMusic;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class Midi {
	Sequencer sequencer;
	Sequence sequence;
	Track track;
//	int high;//Òô¸ß
//	int chan;//ÀÖÆ÷
//	String[] genenames = {"¸Ê°±Ëá","±û°±Ëá","çÓ°±Ëá","ÁÁ°±Ëá","ÒìÁÁ°±Ëá","±½±û°±Ëá","¸¬°±Ëá","É«°±Ëá",
//			"Ë¿°±Ëá","ÀÒ°±Ëá","°ëë×°±Ëá","µ°°±Ëá","Ìì¶¬õ£°·","¹È°±õ£°·","ËÕ°±Ëá",
//			"Ìì¶¬°±Ëá","¹È°±Ëá","Àµ°±Ëá","¾«°±Ëá","×é°±Ëá"};
//	ArrayList<Integer> musiclist = new ArrayList<>();//´æ·ÅÒô·ûË³Ğò
//	ArrayList<Integer> anjisuanlist = new ArrayList<>();//´æ·Å°±»ùËáË³Ğò
//	int genelist[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//´æ·Å°±»ùËá¶ÔÓ¦µÄÒô·û
//	
//	public static void main(String[] args) {
//		new Midi().build();
//	}
	public void start() {
		Start.musiclist.clear();
		Start.longlist.clear();
		getlist();
		setUpMidi();
		buildTrackAndStart();
		
		
	}
	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
		}catch(Exception e) {e.printStackTrace();}
	}

	public void buildTrackAndStart() {
		
//		sequence.deleteTrack(track);
//		track = sequence.createTrack();
		
		makeTracks(Start.musiclist,Start.chan,Start.high);
		try {
			sequencer.setSequence(sequence);
			sequencer.setTempoInBPM(120);
			sequencer.start();
		}catch(Exception e) {e.printStackTrace();}
		
	}		
	
	public void getlist() {//°±»ùËáË³Ğò×ª»»
//		System.out.println("hahah")	;
		for(int i=0;i<Start.anjisuanlist.size();i++) {
			int key = Start.anjisuanlist.get(i);
			Start.musiclist.add(Start.genelist[key]);
			Start.longlist.add(Start.ticklist[key]);	
			
		}
	}
	public void makeTracks(ArrayList<Integer> musiclist,int chan,int high) {
		for(int i = 0;i<musiclist.size();i++) {
			int key = musiclist.get(i);
			
			int tick =Start.longlist.get(i);
			
			track.add(makeEvent(192,1,chan,0,0));
			track.add(makeEvent(144,1,key,high,i));
			track.add(makeEvent(128,1,key,high,i+tick*2));
			System.out.println(tick);
			
		}
	}
	
	public MidiEvent makeEvent(int comd,int chan,int one,int two,int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd,chan,one,two);
			event = new MidiEvent(a,tick);
		}catch(Exception e) {e.printStackTrace();}
		return event;
	}

}