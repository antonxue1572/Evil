import java.awt.*;
import javax.swing.*;

public class MouseMove
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
		int width = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int height = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

		while(true)
		{
			rob.delay((int)(Math.random()*10001)+5000);
			rob.mouseMove((int)(Math.random()*width), (int)(Math.random()*height));
		}
	}
}