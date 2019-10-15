package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Form3 extends JFrame{
    private JLabel lb;
    private JSlider sl;
    public Form3(){
        setTitle("Sliling fornt");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,150);
        setLayout(new BorderLayout());
        lb = new JLabel("Java is cool");
        lb.setForeground(Color.BLUE);
        lb.setFont(new Font("Courier New",Font.BOLD,24));
        lb.setPreferredSize(new Dimension(400,180));
        add(lb,BorderLayout.NORTH);
        sl = new JSlider();
        sl.setMinimum(10);
        sl.setMaximum(100);
        sl.setMajorTickSpacing(20);
        sl.setMinorTickSpacing(5);
        sl.setPaintLabels(true);
        sl.setPaintTicks(true);
        sl.setPaintTrack(true);
        sl.setPreferredSize(new Dimension(100,50));
        add(sl,BorderLayout.SOUTH);
        sl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Font f = lb.getFont();
                int value = sl.getValue();
                lb.setFont(new Font(f.getFontName(),f.getStyle(),value));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        sl.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Font f = lb.getFont();
                int value = sl.getValue();
                lb.setFont(new Font(f.getFontName(),f.getStyle(),value));
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               
            }
        });
   }
    
    
    public static void main(String[] args) {
        Form3 f = new Form3();
        f.setVisible(true);
    }
    
}
