/***************************************************************************************************
 * ���ϸ� : PSCodeServlet.java
 * ��� : ���Ǳ� ��ü�ܰ� ���긴
 * �ۼ����� : 2004-02-20
 * �ۼ��� : ���ȣ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.code.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.wb.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * ���ʸ޴� ��ǥ ����
 */
public class PSCodeServlet extends ChosunServlet {

  private static final String CONTENT_TYPE = "text/html; charset=KSC5601";

  //Initialize global variables
  public void init() throws ServletException {
  }

  //Clean up resources
  public void destroy() {
  }

  public void checkAuthority() {
  }

  /**
   * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
   * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
   * ���ϵ� nextPage�� request�� forward�Ѵ�.
   *
   * @param req request
   * @param res response
   * @throws IOException
   * @throws ServletException
   */
    public void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    String requestURI = null;
    String strPid = null;
    int iPid = 0;
    String nextPage = null;
    try {
      String servletMappedUrl = "/ps/code/";
      iPid = extractPid(req, servletMappedUrl);
      nextPage = executeWorker(req, res, iPid);
    } catch (AppException ae) {
      req.setAttribute("appException", ae);
      nextPage = "/jsp/ps/comm_jsp/app_error.jsp";
    } catch (SysException se) {
      req.setAttribute("sysException", se);
      nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
    }

    RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
       rd.forward(req, res);
  }

  /**
     * PBBaseWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
   * �޼ҵ带 ȣ���Ѵ�.
   * ����� ���� nextPage�� ��ȯ�Ѵ�.
   *
   * @param req request
   * @param res response
   * @param pid process id
     * @return String (forward�� nextPage)
   * @throws SysException
   * @throws AppException
   */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {
        String nextPage = null;

        PSCode1101WB wb1101 = null  ;
        PSCode1201WB wb1201 = null  ; //��ü�ܰ�����
        PSCode1301WB wb1301 = null  ; //���ʽ��ϰ���
        PSCode1401WB wb1401 = null  ; //���������ڵ����
        PSCode1501WB wb1501 = null  ; //����������°���

            switch (pid) {
              // ���ົ �ʱ�ȭ��
              case PSCodeWBMapping.PSCODE_1101:
                  wb1101 =  new PSCode1101WB();
                  wb1101.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1101_a.jsp";
                  break;
              // ���ົ �ڵ帮��Ʈ��ȸ
              case PSCodeWBMapping.PSCODE_1106:
                  wb1101 =  new PSCode1101WB();
                  wb1101.selectList(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1106_l.jsp";
                  break;

              // ���ົ �ڵ�����
              case PSCodeWBMapping.PSCODE_1116:
                  wb1101 =  new PSCode1101WB();
                  wb1101.insertSepbkCode(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1116_i.jsp";
                  break;
              // ���ົ �ڵ����
              case PSCodeWBMapping.PSCODE_1121:
                  wb1101 =  new PSCode1101WB();
                  wb1101.updateSepbkCode(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1121_u.jsp";
                  break;
              // ��ü�ܰ� �ʱ�ȭ��
              case PSCodeWBMapping.PSCODE_1201:
                  wb1201 =  new PSCode1201WB();
                  wb1201.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1201_a.jsp";
                  break;
              // ��ü�ܰ� ����Ʈ��ȸ
              case PSCodeWBMapping.PSCODE_1206:
                  wb1201 =  new PSCode1201WB();
                  wb1201.selectList(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1206_l.jsp";
                  break;
              // ��ü�ܰ� ����
              case PSCodeWBMapping.PSCODE_1211:
                  wb1201 =  new PSCode1201WB();
                  wb1201.insertMedipri(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1211_i.jsp";
                  break;
              // ��ü�ܰ� ����
              case PSCodeWBMapping.PSCODE_1216:
                  wb1201 =  new PSCode1201WB();
                  wb1201.updateMedipri(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1216_u.jsp";
                  break;
              // ��ü�ܰ� ����
              case PSCodeWBMapping.PSCODE_1221:
                  wb1201 =  new PSCode1201WB();
                  wb1201.deleteMedipri(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1221_d.jsp";
                  break;
              // ���ົ �ڵ����
              case PSCodeWBMapping.PSCODE_1126:
                  wb1101 =  new PSCode1101WB();
                  wb1101.deleteSepbkCode(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1126_d.jsp";
                  break;
              // ���ົ �󼼳���
              case PSCodeWBMapping.PSCODE_1131:
                  wb1101 =  new PSCode1101WB();
                  wb1101.selectSepbkDtl(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1131_s.jsp";
                  break;
              // ���ʽ��� �ʱ�ȭ��
              case PSCodeWBMapping.PSCODE_1301:
                  wb1301 =  new PSCode1301WB();
                  wb1301.selectCodelist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1301_a.jsp";
                  break;
              // ���ʽ��� ����Ʈ��ȸ
              case PSCodeWBMapping.PSCODE_1306:
                  wb1301 =  new PSCode1301WB();
                  wb1301.selectBnsbklist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1306_l.jsp";
                  break;
              // ���ʽ��� ���ó��
              case PSCodeWBMapping.PSCODE_1311:
                  wb1301 =  new PSCode1301WB();
                  wb1301.insertBnsbk(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1311_i.jsp";
                  break;
              // ���ʽ��� ����ó��
              case PSCodeWBMapping.PSCODE_1316:
                  wb1301 =  new PSCode1301WB();
                  wb1301.updateBnsbk(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1316_u.jsp";
                  break;
              // ���ʽ��� ����ó��
              case PSCodeWBMapping.PSCODE_1321:
                  wb1301 =  new PSCode1301WB();
                  wb1301.deleteBnsbk(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1321_d.jsp";
                  break;
              // ���������ڵ���� �ʱ�ȭ��
              case PSCodeWBMapping.PSCODE_1401:
                  wb1401 =  new PSCode1401WB();
                  wb1401.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1401_s.jsp";
                  break;
              // ���������ڵ���� ��ȸȭ��
              case PSCodeWBMapping.PSCODE_1406:
                  wb1401 =  new PSCode1401WB();
                  wb1401.selectCmpybolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1406_l.jsp";
                  break;
              // ���������ڵ���� ����ȭ��
              case PSCodeWBMapping.PSCODE_1411:
                  wb1401 =  new PSCode1401WB();
                  wb1401.insertCmpybo(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1411_i.jsp";
                  break;

              // ����������°��� �ʱ�ȭ��
              case PSCodeWBMapping.PSCODE_1501:
                  wb1501 =  new PSCode1501WB();
                  wb1501.selectCombolist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1501_s.jsp";
                  break;
              // ����������°��� ��ȸȭ��
              case PSCodeWBMapping.PSCODE_1506:
                  wb1501 =  new PSCode1501WB();
                  wb1501.selectBoacctlist(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1506_l.jsp";
                  break;
              // ����������°��� ����ȭ��
              case PSCodeWBMapping.PSCODE_1511:
                  wb1501 =  new PSCode1501WB();
                  wb1501.accessBoacct(req, res);
                  nextPage = "/jsp/ps/code/ps_code_1511_a.jsp";
                  break;
      default:
        throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
    }
    return nextPage;
  }
}
