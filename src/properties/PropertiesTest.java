package properties;

import java.util.Properties;

public class PropertiesTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Properties prop = new Properties();
		
		//�洢Ԫ��
		prop.setProperty("shuxing","zhi");
		prop.setProperty("ok","12");
		
		//�޸�Ԫ��
		
		prop.setProperty("ok", "456");
		
		//ȡ��Ԫ��
		
		System.out.println(prop.getProperty("shuxing"));
 		
	}
	
}
