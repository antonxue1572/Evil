import java.awt.*;
import javax.swing.*;

public class MouseClick
{
	public static void main(String[] args)
	{
		Robot rob = null;
		try
		{
			rob = new Robot();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,"Cannot Alocate Robot");
			System.exit(0);
		}


		while(true)
		{
			rob.delay((int)(Math.random()*10001)+5000);
			rob.mousePress(16);
			rob.delay(200);
			rob.mouseRelease(16);
		}
	}
}