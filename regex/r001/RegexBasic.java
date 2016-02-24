package r001;


import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic 
{

	/**
	 * ������ʽ����֪ʶ
	 * @param args
	 */
	public static void main(String[] args)
	{
		ipSort();
		System.out.println("-----------------");
		
		
		int j = 0;
		for (int i = 0; i < 10; i++)
		{
			j=j++;
		}
		System.out.println(j);//���Ϊ0��
		
		
		/* * 1.ƥ��
		 * ������ʽ
		 * ��֤�Ƿ�Ϊqq��
		 * ����Ϊ5-15����ͷ��Ϊ0
		 */
		 
		String qq = "595461241345352";
		
		String regex = "[1-9][0-9]{4,14}"; //��һλΪ1-9�� �ڶ�λΪ0-9����0-9������4-14��
		
		boolean check = qq.matches(regex); //����ƥ�䷵�ؽ��Ϊboolean����
		System.out.println(qq+"       "+check);
		
		
		/* 
		 *  �и�
		 */
		 
		String str = "zhangleittttwangfeimmmliudaren";
		
		String regex2 = "(.)\\1+"; // ()���� .���������ַ�  1�����һ��   \\ת��  +����һ��
									//����Ĺ������: ��һ����������Ϊ�����ַ���������һ��
		
		String[] result = str.split(regex2); //�и������ŵ�result��
		System.out.println("**********************");
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
		System.out.println("**********************");
		
		
		/*
		 *�滻
		 *��Ĵ����жϣ��������ž���
		 */
		String result3 = str.replaceAll("(.)\\1+","#"); //�滻��str�г��ִ�����������1�ε��ַ�����#
		System.out.println(result3);
		
		String result4 = str.replaceAll("(.)\\1+","$1"); //str�г��ִ�����������1�ε��ַ����� ��ȡ���ĵ�һ���ַ� //$1��ȡ��һ���ַ� 
		System.out.println(result4);
		
//		������ӡ������£�
//		zhanglei#wangfei#liudaren
//		zhangleitwangfeimliudaren
		
		//��ϰ: �绰������ʾ��ʽΪ158****1546
		String tel = "13689464561";
		String telNew = tel.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1****$3");//˼·�����绰����ֳ����飬��ȡÿ���ֵ�����滻
		System.out.println(telNew);
		
		
		/*
		 * 
		 * ��ȡ
		 * ͨ��һ��������ѧϰ��ȡ
		 * 
		 * ���ַ���  "da jia hao, wo shi yi ge xin shou xue yuan "  �������ַ������ĵ��ʴ�ӡ
		 */
		 
		System.out.println("-------------");
		String str4 = "da jia hao, wo shi yi ge xin shou xue yuan ";
		
		String regex4 = "\\b[a-z]{3}\\b"; // �����ʱ߽�\\b 
		 

		Pattern p = Pattern.compile(regex4); //��װ
		Matcher m = p.matcher(str4);		//ƥ��
		
		while (m.find()) 
		{
			System.out.print(m.group()+"  "); //��ȡƥ���������
			System.out.println(m.start()+": "+m.end()); //��ԭ�ַ����иô�ӡ�ַ���ʼ�ͽ�����λ��
			
		}
	}
	
	/**
	 * ip ����
	 * 195.1.635.16 3.3.36.2 265.46.987.0 192.001.23.546
	 */
	public static void ipSort()
	{
		String ip_str = "195.1.635.16 3.3.36.2 265.46.987.0 192.1.23.546 192.1.22.546";
		System.out.println("ԭʼ\n"+ip_str);
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");  //���� �磺 00195.001.00635.0016 003.003.0036.002
		ip_str = ip_str.replaceAll("0*(\\d{3})", "$1"); //ÿ�α�����λ����
		String[] ips = ip_str.split(" +");              //�г�ip��ַ
		
		TreeSet<String> sort = new TreeSet<String>(); //��������
		
		//���ip��sort�����У�sort�Զ�����
		for (String ip : ips) 
		{
			sort.add(ip);
		}
		//��ӡ������ip
		System.out.println("���ڣ�");
		for (String ip : sort)
		{
			System.out.println(ip.replaceAll("0*(\\d+)", "$1")); //����ȫ0���ֶλ�ԭ
		}
		
	}
}
