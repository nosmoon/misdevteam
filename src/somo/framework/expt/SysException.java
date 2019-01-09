package somo.framework.expt;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * System ���� �߻��Ǵ� �پ��� ���ܻ�Ȳ�� ǥ���Ѵ�.<BR>
 * ��� �����ӿ�ũ�� public �޼ҵ�� System ���� ���ܻ����� �߻��ϸ� �� SysException�� �߻���Ų��.<BR>
 *
 */
public class SysException extends RuntimeException
{
    private Exception e;

    /**
     * Default ������
     */
    public SysException(){
    }

    /**
     *
     * @param e �߻��� System Exception
     */
    public SysException(Exception e) {
      this.e = e;
    }

    /**
     *
     * @return  System Exception
     */
    public Exception getException(){
      return e;
    }

    /**
     *
     * @param e System Exception
     */
    public void setException(Exception e){
      this.e = e;
    }
}

