package GeneMusic;

import java.util.ArrayList;

public class Start {
	static String anjisuan[] ={"�ʰ���","������","�Ӱ���","������","��������","��������","������","ɫ����",
			"˿����","�Ұ���","���װ���","������","�춬����","�Ȱ�����","�հ���",
			"�춬����","�Ȱ���","������","������","�鰱��"};
	
	static int genelist[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//��Ű������Ӧ������
	static ArrayList<Integer> musiclist = new ArrayList<>();//�������˳��
	static ArrayList<Integer> anjisuanlist = new ArrayList<>();//��Ű�����˳��
	static ArrayList<Integer> longlist = new ArrayList<>();//����
	static int high;//����
	static int chan;//����
	static String ins[] = {"��˹","����","����","С����"}; //��������
	static int ticklist[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	



	
	public static void main(String args[]) {
		new mainFrame().setVisible(true);
	}
}
