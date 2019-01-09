/***************************************************************************************************
* ���ϸ� : SSCommonServlet.java
 * ��� : �μ�,���� �� ���� ����
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.post.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.co.post.dm.*;
import chosun.ciis.co.post.wb.*;
import chosun.ciis.co.post.ds.*;
import chosun.ciis.co.post.servlet.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class COCommonServlet extends chosun.ciis.co.base.servlet.BaseServlet {
    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws IOException
     * @throws ServletException
     */
      public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String requestURI = null;
      String strPid = null;
      int iPid = 0;
      String nextPage = null;
      try {
        String servletMappedUrl = "/co/post/";
        iPid = extractPid(req, servletMappedUrl);
System.out.println("COCommonServlet : process : iPid : "+iPid);
        nextPage = executeWorker(req, res, iPid);
System.out.println("COCommonServlet : process : nextPage : "+nextPage);
      } catch (AppException ae) {
        req.setAttribute("appException", ae);
        nextPage = "/jsp/co/post/app_error.jsp";
      } catch (SysException se) {
        req.setAttribute("sysException", se);
        nextPage = "/jsp/co/post/sys_error.jsp";
      } catch (Exception e) {
          req.setAttribute("sysException", new SysException(e));
          nextPage = "/comm_jsp/sys_error.jsp";        
      }

      RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
         rd.forward(req, res);
    }

    /**
     * PilotWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,int pid) throws AppException, SQLException {
      String nextPage = null;
      COCommon1100WB wb = null;
      switch (pid) {
      
        case COCommonWBMapping.COMMON_1150: //�����ȣ�˻�(�ʱ�ȭ��)
            nextPage = "/jsp/co/post/co_common_1150_p.jsp";
            break;
        case COCommonWBMapping.COMMON_1152: //�����ȣ�˻�(�����ȣ,��/��/�� �Է� - ����Ű)
            wb = new COCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/co/post/co_common_1152_l.jsp";
            break;
        case COCommonWBMapping.COMMON_1154: //�����ȣ�˻�(�����ȸ)
            wb = new COCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/co/post/co_common_1154_l.jsp";
            break;
        
        // ���������� �������� �ʰ� ��� �ּҸ� ��ȸ�ϴ� �ּ��˾�â �߰�����(20090827 ������)
        // url���� ���ν������� �����и� 
        case COCommonWBMapping.COMMON_1160: //�����ȣ�˻�(�ʱ�ȭ��)
            nextPage = "/jsp/co/post/co_common_1160_p.jsp";
            break;
        case COCommonWBMapping.COMMON_1162: //�����ȣ�˻�(�����ȣ,��/��/�� �Է� - ����Ű)
            wb = new COCommon1100WB();
            wb.selectZipListAll(req, res);
            nextPage = "/jsp/co/post/co_common_1162_l.jsp";
            break;
        case COCommonWBMapping.COMMON_1164: //�����ȣ�˻�(�����ȸ)
            wb = new COCommon1100WB();
            wb.selectZipListAll(req, res);
            nextPage = "/jsp/co/post/co_common_1164_l.jsp";
            break;            

        default:
          throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
      }
      return nextPage;
    }
}
