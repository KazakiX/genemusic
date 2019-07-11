package GeneMusic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class setMatchFrame extends JFrame implements ActionListener{
	GridLayout grid = new GridLayout(4,5);
	BorderLayout border = new BorderLayout();
	
	JPanel background = new JPanel(border);
	Box  bottombox = new Box(BoxLayout.X_AXIS);
	JButton  save = new JButton();
	JButton  returnmain = new JButton();
	
	JTextField[] jtf = new JTextField[20];
	JComboBox[] jcb = new JComboBox[20];
	
	JPanel mymatchbg = new JPanel(grid);//�м��Ӧ��ϵ�������
	
//	String anjisuan[] ={"�ʰ���","������","�Ӱ���","������","��������","��������","������","ɫ����",
//			"˿����","�Ұ���","���װ���","������","�춬����","�Ȱ�����","�հ���",
//			"�춬����","�Ȱ���","������","������","�鰱��"};
//	int genelist[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};//��Ű������Ӧ������

	
	setMatchFrame(){
		
		setTitle("������Թ�ϵ");// ���ڱ���
        setSize(900,500);// ���ڴ�С
        setLocationRelativeTo(null);// ���ھ���
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// �رմ������˳������
		
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));//�趨��ɫ��Ե
        save.setText("      ����             ");
        save.addActionListener(this);
        returnmain.setText("      ����             ");
        returnmain.addActionListener(this);
        bottombox.add(Box.createHorizontalStrut (100));
		bottombox.add(save);
		bottombox.add(Box.createHorizontalGlue ());
		bottombox.add(returnmain);
		bottombox.add(Box.createHorizontalStrut (100));
				for(int i=0; i<20; i++) {
				Box mymatchbox = new Box(BoxLayout.Y_AXIS);
				JPanel mymatch = new JPanel();
				JPanel length  = new JPanel();
				JLabel label1= new JLabel(Start.anjisuan[i]+"����");
				JLabel label2= new JLabel(Start.anjisuan[i]+"����");
				jtf[i] = new JTextField("jtf"+i,6);
				jcb[i] = new JComboBox();
				for(int j = 0;j<4;j++) {
					jcb[i].addItem(j+1);
				}
				jtf[i].addFocusListener(new JTextFieldHintListener("1-127", jtf[i]));
				jtf[i].setForeground(Color.GRAY);
				jtf[i].setText("1-127");
				mymatch.add(label1);
				mymatch.add(jtf[i]);
				length.add(label2);
				length.add(jcb[i]);
				mymatchbox.add(length);
				mymatchbox.add(mymatch);
				mymatchbg.add(mymatchbox);
        }
        //mymatch.add(Box.createVerticalStrut(10));	
		background.add(bottombox,BorderLayout.SOUTH);
		background.add(mymatchbg,BorderLayout.CENTER);
		
		add(background);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(returnmain)) {
			this.setVisible(false);
			//System.out.println("return");
		}
		if(e.getSource().equals(save)) {
			
			for(int i = 0;i<20;i++) {
				
				Start.ticklist[i]=(int) jcb[i].getSelectedItem();

			}
			
			
			for(int i = 0;i<20;i++) {
				if(jtf[i].getText().equals("1-127")) 
				{    
					Start.genelist[i]=i+1;
				}
				else{
				Start.genelist[i] = Integer.parseInt(jtf[i].getText());
				
				}
//				System.out.println(Start.genelist[i]);
			}
			
		}
	}
	public class JTextFieldHintListener implements FocusListener {//ʵ��textfield��ʾ��Ϣ
	    private String mHintText;
	    private JTextField mTextField;

	    public JTextFieldHintListener(String hintText, JTextField textField) {
	        this.mHintText = hintText;
	        this.mTextField = textField;
	        textField.setForeground(Color.GRAY);
	    }
	    @Override
	    public void focusGained(FocusEvent e) {
	        String temp = mTextField.getText();
	        if(temp.equals(mHintText)){
	            mTextField.setText("");
	            mTextField.setForeground(Color.BLACK);
	        }
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        String temp = mTextField.getText();
	        if(temp.equals("")){
	            mTextField.setForeground(Color.GRAY);
	            mTextField.setText(mHintText);
	        }
	    }
	}
	
//	public static void main(String[] args) {
//        new setMatchFrame().setVisible(true);//������¼����,���ɼ�
//    }
//	
}
