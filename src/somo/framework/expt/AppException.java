package somo.framework.expt;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * Business Logic 상 발생되는 다양한 예외상황을 표현한다.<BR>
 * 개발자는 발생된 예외 상황에 맞는 적절한 코드 및 메세지등을 세팅한다.<BR>
 */
public class AppException extends Exception  implements java.io.Serializable
{
  /**
   * 발생된 에러를 표현하는 코드값
   */
    private String error_code;
    /**
     * 발생된 에러를 설명하는 메세지
     */
    private String error_message;
    /**
     * 발생된 에러를 추가로 설명하는 상세메세지
     */
    private String error_detail;

    /**
     * 에러를 설명하는 메세지를 통해 객체를 생성한다.
     * @param cause 에러를 설명하는 메세지
     */
    public AppException(String cause) {
        super(cause);
    }

    /**
     * 에러를 표현하는 코드값과 메세지를 통해 객체를 생성한다.
     * @param errCode 에러별 에러코드
     * @param errMsg  에러를 설명하는 에러메시지
     */
    public AppException(String errCode, String errMsg) {
      this.error_code = errCode;
      this.error_message = errMsg;
    }

    /**
     * 에러를 표현하는 코드값, 메세지, 상세메세지를 통해 객체를 생성한다.
     * @param errCode 에러별 에러코드
     * @param errMsg  에러를 설명하는 에러메시지
     * @param error_detail  에러를 설명하는 상세 에러메시지
     */
    public AppException(String errCode, String errMsg, String error_detail) {
        this.error_code     = errCode;
        this.error_message  = errMsg;
        this.error_detail   = error_detail;
    }

    /**
     * 객체가 표현하는 에러 코드를 얻는다.
     * @return  에러코드
     */
    public String getErrorCode() {
        return error_code;
    }

    /**
     * 객체가 표현하는 에러 메세지를 얻는다.
     * @return  에러메시지
     */
    public String getErrorMessage() {
        return error_message;
    }

    /**
     * 객체가 표현하는 상세 에러 메세지를 얻는다.
     * @return  상세 에러메시지
     */
    public String getErrorDetail(){
      return error_detail;
    }


    /**
     * 객체가 표현하는 에러 코드를 설정한다.
     * @param errCode 에러코드
     */
    public void setErrorCode(String errCode) {
        this.error_code = errCode;
    }

    /**
     * 객체가 표현하는 에러 메세지를 설정한다.
     * @param errMsg  에러메시지
     */
    public void setErrorMessage(String errMsg) {
        this.error_message = errMsg;
    }

    /**
     * 객체가 표현하는 상세 에러 메세지를 설정한다.
     * @param errDetail 상세 에러메시지
     */
    public void setErrorDetail(String errDetail){
      this.error_message = errDetail;
    }

}

