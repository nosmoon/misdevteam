package somo.framework.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * 모든 Controller 서블릿이 상속받는 추상 클래스<BR>
 * Request를 받으면 권한 및 로그인 처리를 선행적으로 수행한 후 process()를 호출한다.<BR>
 * 상속받는 Controller 서블릿은 checkAuthority()를 구현하여 권한 및 로그인 처리를 수행한다.<BR>
 * 상속받는 Controller 서블릿은 process()를 구현하여 다음과 같은 작업을 수행한다.
 *   1. Request Processing, Session Processing을 통해 Bean의 메소드를 호출할 준비를 수행한다.<BR>
 *   2. URL 맵핑 등을 이용하여 적절한 Bean 및 Bean의 메소드를 선택하여 호출한다.<BR>
 *   3. Bean 의 메소드 호출결과에 따라, 적절한 JSP로 분기시키며, 분기시 JSP 가 보여줄 데이터를 RequestDispatching을 통해 전달한다.
 *
 */
public abstract class ControllerServlet extends HttpServlet {
  /**
   * 초기화에 필요한 작업을 수행한다.<BR>
   * 하위 Controller 서블릿은 필요시에 overriding을 통해 추가적인 작업을 수행한다.
   * @throws ServletException
   */
  public void init() throws ServletException {
  }

  /**
   * HTTP GET 방식의 요청을 처리한다.
   * @param req 사용자 HTTP 요청
   * @param res 사용자 HTTP 응답
   * @throws ServletException
   * @throws IOException
   */
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    checkAuthority();
    process(req, res);
  }

  /**
   * HTTP POST 방식의 요청을 처리한다.
   * @param req 사용자 HTTP 요청
   * @param res 사용자 HTTP 응답
   * @throws ServletException
   * @throws IOException
   */
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    doGet(req, res);
  }

  /**
   * 리소스 반납 등 서블릿의 수명종료 작업을 수행한다.<BR>
   * 하위 Controller 서블릿은 필요시에 overriding을 통해 추가적인 작업을 수행한다.
   */
  public void destroy() {
  }

  /**
   * 하위 클래스에서 구현하여 권한 및 로그인 처리를 수행한다.
   */
  public abstract void checkAuthority();
  /**
   * 하위 클래스에서 구현하여 파라미터 처리,Bean의 메소드호출,JSP 분기등의 작업을 수행한다.
   * @param req 사용자 HTTP 요청
   * @param res 사용자 HTTP 응답
   */
  public abstract void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException ;
}