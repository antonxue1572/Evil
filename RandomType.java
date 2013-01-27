import java.awt.*;
import javax.swing.*;

public class RandomType
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
			while(Math.random() < .5)
			{
				int key = (int)(Math.random()*26)+65;
				rob.keyPress(key);
				rob.delay(200);
				rob.keyRelease(key);
				rob.delay(200);
			}
		}
	}
}