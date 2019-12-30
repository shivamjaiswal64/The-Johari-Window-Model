/*
  *This is made by me (Shivam Jaiswal,@shivamjaiswal64)
  *Questions are taken from the books.
  *No copyright infrigement. Questions are for Educational purposes only.
  *Some more updation will be done later
*/
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class JW extends Frame implements ActionListener{
	Frame f; 
	static int i=1,sumA,sumB;
	Label l1,l2,l3,l4,l5,l6,lNote;
	TextField tf1,tf2;
	String s1,op1,op2,varS;
	Button b1,b2,b3;
	String fn;
	
	JW(){			
		this.f = new Frame(fn);
		Image icon = Toolkit.getDefaultToolkit().getImage("icons/quiz.png");
		f.setIconImage(icon);
		questionChoose();
	}
	
	private Frame questionChoose() {
		switch(this.i) { //10 questions with 2 statements
			case 1:	
				s1="1)If a friend of mine had a 'personality conflict' with a mutual acquaintance of ours with whom it was important forhim/her to get along, I would: ";
				op1="A. Tell my friend that I felt s/he was partially responsible for any problems with this other person and try to let him/her know how the person was being affected by him/her.";
				op2="B. Not get involved because I wouldn't be able to continue to get along with both of them once I had entered in any way.";	
				questionFrame();
				break;
			case 2:
				 s1="2)If one of my friends and I had a heated argument in the past and I realized that s/he was ill at ease around me from that time on, I would:"; 
				 op1="A. Avoid making things worse by discussing his/her behavior and just let the whole thing drop.";
				 op2="B. Bring up his/her behavior and ask him/her how s/he felt the argument had affected our relationship.";
				 questionFrame();
				 break;
	
			case 3:
				s1="3)If a friend began to avoid me and act in an aloof and withdrawn manner, I would:";
				op1="A. Tell him/her about his/her behavior and suggest that s/he tell me what was on his/her mind";
				op2="B. Follow his/her lead and keep our contact brief and aloof since that seems to be what s/he wants.";
				questionFrame();
				break;
	
			case 4:
				s1="4)If two of my friends and I were talking and one of my friends slipped and brought up a personal problem of mine that involved the other friend, of which s/he was not yet aware, I would:";
				op1="A. Change the subject and signal my friend to do the same.";
				op2="B. Fill my uniformed friend in on what the other friend was talking about and suggest that we go into it later.";
				questionFrame();
				break;

			case 5:
				s1="5)If a friend of mine were to tell me that, in his/her opinion, I was doing things that made me less effective than I might be in social situations, I would:";
				op1="A. Ask him/her to spell out or describe what s/he has observed and suggest changes I might make.";
				op2="B. Resent his/her criticism and let him/her know why I behave the way I do. ";
				questionFrame();
				break;	
			case 6:
				s1="6)If one of my friends aspired to an office in our organization for which I felt s/he was unqualified, and if s/he had been tentatively assigned to that position by the leader of our group, I would:";
				op1="A. Not mention my misgivings to either my friend or the leader of our group and let them handle it in their own way. ";
				op2=" B. Tell my friend and the leader of our group of my misgivings and then leave the final decision up to them";
				questionFrame();
				break;			
			case 7:
				s1="7)If I felt that one of my friends was being unfair to me and his/her other friends, but none of them had mentionedanything about it, I would:";
				op1="A. Ask several of these people how they perceived the situation to see if they felt s/he was being unfair.";
				op2="B. Not ask the others how they perceived our friend, but wait for them to bring it up with me. ";
				questionFrame();
				break;	
			case 8:
				s1="8)If I were preoccupied with some personal matters and a friend told me that I had become irritated with him/her and others and that I was jumping on him/her for unimportant things, I would: ";
				op1="A. Tell him/her I was preoccupied and would probably be on edge for a while and would prefer not to bebothered.";
				op2=" B. Listen to his/her complaints but not try to explain my actions to him/her.";
				questionFrame();
				break;				
			case 9:
				s1="9)If I had heard some friends discussing an ugly rumor about a friend of mine which I knew could hurt him/her ands/he asked me what I knew about it, if anything, I would:";
				op1="A. Say I didn't know anything about it and tell him/her no one would believe a rumor like that anyway.";
				op2="B. Tell him/her exactly what I had heard, when I had heard it, and from whom I had heard it.";
				questionFrame();
				break;	
			case 10:
				s1="10)If a friend pointed out the fact that I had a personality conflict with another friend with whom it was important for me to get along, I would:";
				op1="A. Consider his/her comments out of line and tell him/her I didn't want to discuss the matter any further. ";
				op2="B. Talk about it openly with him/her to find out how my behavior was being affected by this.";
				questionFrame();
				break;	
			default:
				ThanksFrame();
		}
		
		return f;
	}
		
	private Frame questionFrame() {
		this.f.setTitle("Johari Window Questionnaire " + i);
		lNote = new Label("How much you satisfied with Statement A(Full=5;Not=0)");
		l1 = new Label(s1);
		l2 = new Label(op1);
		l3 = new Label(op2);
		l4 = new Label();
		l5 = new Label("Total A and B score");
		l6 = new Label();	l6.setText("A: "+sumA+"	     B: "+sumB);
		tf1 = new TextField();
		b1 = new Button("Submit") ;
		b2 = new Button("Next"); 
		l1.setBounds(50,50,1200,50);
		l2.setBounds(100,100,1150,20);
		l3.setBounds(100,125,1150,20);	lNote.setBounds(50,260,450,20);
		l4.setBounds(100,200,450,20);
		l5.setBounds(500,280,200,20);	l6.setBounds(500,300,200,20);
		tf1.setBounds(50,300,80,40);
		b1.setBounds(50,450,60,40); 
		b2.setBounds(150,450,60,40);
	
		b2.setEnabled(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
	//	b1.addKeyListener(this);
		f.setBackground(Color.PINK);
	
		f.add(lNote);
		f.add(l1);	f.add(l2);	f.add(l3);	f.add(l4);	f.add(l5); f.add(l6);//Label
		f.add(tf1);
		tf1.requestFocus();
		f.add(b1);	f.add(b2); 	//button
		f.addWindowListener(new WindowEventListener());
		
		f.setBounds(50,80,900,600);
		f.setLayout(null);
		f.setSize(1300,600); //Frame Size 
		f.setVisible(true);

		Font font = new Font("Verdana", Font.ITALIC,15);
        f.setFont(font);
        
        return f;
	}
	
	private Frame ThanksFrame(){
		this.f.setTitle("Thank you Frame");
		l1 = new Label("Thanks for giving Quiz");
		l1.setBounds(50,50,700,50);
		l2 = new Label("Scored in A: "+Integer.toString(sumA));
		l2.setBounds(100,100,350,20);
		l3 = new Label("Scored in B: "+Integer.toString(sumB));
		l3.setBounds(100,125,350,20);
		b3 = new Button("Close");
		b3.setBounds(200,200,50,50);
		b3.addActionListener(this);
		f.add(b3);	

		f.add(l1);	f.add(l2);	f.add(l3);
		f.addWindowListener(new WindowEventListener());
		
		f.setLayout(null);
		f.setBounds(50,80,500,600);
	//	f.setSize(1300,600);
		f.setVisible(true);
	
		return f;	
	}
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
	
			if(Integer.parseInt(tf1.getText())>-1&&Integer.parseInt(tf1.getText())<=5){
			//	l4.setText(""+tf1.getText());
	
				varS=tf1.getText();
			//	l4.setText("A: "+varS+" B: ");
				int tempA = Integer.parseInt(varS);
				l4.setText("A: "+varS+" B: "+(5-tempA));
				sumB =sumB+(5-tempA);
				sumA=sumA+tempA;
	
				System.out.print("A score: ");
				System.out.println(sumA);
				System.out.println(sumB);
			//	String SsumB = Integer.toString(sumB);
			//	String SsumA = Integer.toString(sumA);
				l6.setText("A: "+sumA+"	    B: "+sumB);
				tf1.setEditable(false);
				b2.setEnabled(true);
				b1.setEnabled(false);
			}
			else {
				l4.setText("Wrong Input:Enter the digit between 0 and 5");	
			}
		}
		else if (e.getSource()==b2) {
			System.out.println(i +" recorded");		
			
			this.f.removeAll();
			this.f.revalidate();
			this.f.repaint();
			
			this.i++;
			questionChoose();
		}
		else if(e.getSource()==b3){
			System.exit(0);
		}
	}
	
		
	
	public static void main(String[] args)throws NumberFormatException{
		new JW();
	}
}

class WindowEventListener extends WindowAdapter{
	public void windowClosing(WindowEvent e1){
		System.out.println("WindowClosedByUser");
		System.exit(0);
	}
}
