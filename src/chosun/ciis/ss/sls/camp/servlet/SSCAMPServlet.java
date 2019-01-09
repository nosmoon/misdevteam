/***************************************************************************************************
 * ���ϸ� : SSCAMPServlet.java
 * ��� :  ķ����Ȯ���� servlet
 * �ۼ����� : 2005-05-27
 * �ۼ��� :  ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.camp.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.wb.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.wb.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.wb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.wb.*;
import chosun.ciis.ss.sal.rdr.ds.*;

import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.wb.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * �Ǹű� �������� ���� Servlet
 */

public class SSCAMPServlet extends ChosunServlet {

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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws IOException
     * @throws ServletException
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/camp/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSCAMPServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSCAMPServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSCAMPWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {

        String nextPage = null;
/*        SSExtn1000WB wbextn = null; //Ȯ����Ȳ
        SSMove1000WB wbmove = null; //�̻絶��
        SSReader1100WB wbdsct = null; //���ں���
        SSReader1200WB wbvs = null; //VacationStop
        SLReader2400WB wbvs2 = null; //VacationStop(����)*/
        SSCAMP1000WB wbcamp = null;

        switch (pid) {
            // ����-Ȯ��
            case SSCAMPWBMapping.CAMP_1000: //ķ����Ȯ�� �ʱ�ȭ��
                wbcamp = new SSCAMP1000WB();
                wbcamp.init(req, res);
                nextPage = "/jsp/ss/camp/ss_camp_1000_a.jsp";
                break;
            case SSCAMPWBMapping.CAMP_1100: //ķ����Ȯ�� ���
                wbcamp = new SSCAMP1000WB();
                wbcamp.saveCampExtn(req, res);
                nextPage = "/jsp/ss/camp/ss_camp_1100_i.jsp";
                break;

            case SSCAMPWBMapping.CAMP_1101: //ķ����Ȯ�� �̺�Ʈ��� �˻�
                wbcamp = new SSCAMP1000WB();
                wbcamp.searchCampEventList(req, res);
                System.out.println("camp_1101...");
                nextPage = "/jsp/ss/camp/ss_camp_1101_a.jsp";
                break;

           default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
