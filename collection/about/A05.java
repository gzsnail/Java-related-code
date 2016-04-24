package about;

import java.util.Calendar;

public class A05
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR); 
		int month = c.get(Calendar.MONTH+1);//�·ݴ�0��ʼ��
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(year+"��"+month+"��"+day+"�� \n"+getWeek(week));
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.YEAR, 2);//ʱ��ƫ��
		
		int year2 = c2.get(Calendar.YEAR);
		
		System.out.println("ʱ��ƫ�ƺ�      "+year2+"��");
		
		
		//��ʾÿ��Ķ����ж�����
		int FindYear = 2013;
		int Firdays = showFirDay(FindYear);
		System.out.println(FindYear+"��Ķ�����"+Firdays+"��");

	}
	
	/**
	 * ����ÿ��Ķ����ж�����
	 * ˼·�����ò����������Ϊ3��1�գ�Ȼ���ټ���һ�죬��Ϊ����
	 * @param year
	 * @return int
	 */
	public static int showFirDay(int year)
	{
		Calendar c = Calendar.getInstance();
		
		c.set(year, 2 ,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		return c.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * ����ʽ��������ת��Ϊ���ĸ�ʽ
	 * @param week
	 * @return
	 */
	public static String getWeek(int week)
	{
		String weeks[] = {"","������","����һ","���ڶ�","������","������","������","������"};
		return weeks[week];
	}
}
