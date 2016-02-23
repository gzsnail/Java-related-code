package byteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class BASdame
{

	/**
	 * �����ֽ����� byteArrayStream
	 * ���Ƶ��У�
	 *       �����ַ����� CharArrayReader CharArrayWrite
	 *       �����ַ���   StringReader StringWrite
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteArrayInputStream bais = new ByteArrayInputStream("abcde".getBytes());

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int ch = 0;
		while ((ch=bais.read())!= -1)
		{
			baos.write(ch);
		}
		
		System.out.println(baos.toString());
	}

}
