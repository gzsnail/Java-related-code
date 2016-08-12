package a001.Singleton;

/**
 * 
 *����ģʽ-����ʽ
 */
public class Singleton01
{
    /** 
     * 
     * 1.������˽�л�
     * 
     * 2.������� Ψһ��˽�С���̬ ʵ������
     * 
     * 3.���������ȡ�� ��̬ ����
     */

    private Singleton01(){}
    
    private static Singleton01 instance = new Singleton01();
    
    public static Singleton01 getInstance()
    {
        return instance;
    }
}
