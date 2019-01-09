package somo.framework.expt;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * Business Logic �� �߻��Ǵ� �پ��� ���ܻ�Ȳ�� ǥ���Ѵ�.<BR>
 * �����ڴ� �߻��� ���� ��Ȳ�� �´� ������ �ڵ� �� �޼������� �����Ѵ�.<BR>
 */
public class AppException extends Exception  implements java.io.Serializable
{
  /**
   * �߻��� ������ ǥ���ϴ� �ڵ尪
   */
    private String error_code;
    /**
     * �߻��� ������ �����ϴ� �޼���
     */
    private String error_message;
    /**
     * �߻��� ������ �߰��� �����ϴ� �󼼸޼���
     */
    private String error_detail;

    /**
     * ������ �����ϴ� �޼����� ���� ��ü�� �����Ѵ�.
     * @param cause ������ �����ϴ� �޼���
     */
    public AppException(String cause) {
        super(cause);
    }

    /**
     * ������ ǥ���ϴ� �ڵ尪�� �޼����� ���� ��ü�� �����Ѵ�.
     * @param errCode ������ �����ڵ�
     * @param errMsg  ������ �����ϴ� �����޽���
     */
    public AppException(String errCode, String errMsg) {
      this.error_code = errCode;
      this.error_message = errMsg;
    }

    /**
     * ������ ǥ���ϴ� �ڵ尪, �޼���, �󼼸޼����� ���� ��ü�� �����Ѵ�.
     * @param errCode ������ �����ڵ�
     * @param errMsg  ������ �����ϴ� �����޽���
     * @param error_detail  ������ �����ϴ� �� �����޽���
     */
    public AppException(String errCode, String errMsg, String error_detail) {
        this.error_code     = errCode;
        this.error_message  = errMsg;
        this.error_detail   = error_detail;
    }

    /**
     * ��ü�� ǥ���ϴ� ���� �ڵ带 ��´�.
     * @return  �����ڵ�
     */
    public String getErrorCode() {
        return error_code;
    }

    /**
     * ��ü�� ǥ���ϴ� ���� �޼����� ��´�.
     * @return  �����޽���
     */
    public String getErrorMessage() {
        return error_message;
    }

    /**
     * ��ü�� ǥ���ϴ� �� ���� �޼����� ��´�.
     * @return  �� �����޽���
     */
    public String getErrorDetail(){
      return error_detail;
    }


    /**
     * ��ü�� ǥ���ϴ� ���� �ڵ带 �����Ѵ�.
     * @param errCode �����ڵ�
     */
    public void setErrorCode(String errCode) {
        this.error_code = errCode;
    }

    /**
     * ��ü�� ǥ���ϴ� ���� �޼����� �����Ѵ�.
     * @param errMsg  �����޽���
     */
    public void setErrorMessage(String errMsg) {
        this.error_message = errMsg;
    }

    /**
     * ��ü�� ǥ���ϴ� �� ���� �޼����� �����Ѵ�.
     * @param errDetail �� �����޽���
     */
    public void setErrorDetail(String errDetail){
      this.error_message = errDetail;
    }

}

