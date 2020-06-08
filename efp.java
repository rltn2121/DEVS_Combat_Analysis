package midterm;
import java.awt.*;
import simView.*;

public class efp extends ViewableDigraph {
	// constructor
	public efp() {
		super("efp");
		// enemy, ef ����
		ViewableAtomic enemy = new enemy("enemy");
		ViewableDigraph ef = new ef("ef", 20, 1000);
		
		// enemy, ef ǥ��
		add(enemy);
		add(ef);
		
		// port�� ����
		addCoupling(ef, "out", enemy, "in");  // ef�� out -> enemy�� in
		addCoupling(enemy, "out", ef, "in");  // enemy�� out -> ef�� in
	}
	
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(980, 644);
        ((ViewableComponent)withName("enemy")).setPreferredLocation(new Point(490, 501));
        ((ViewableComponent)withName("ef")).setPreferredLocation(new Point(273, 111));
    }
 }