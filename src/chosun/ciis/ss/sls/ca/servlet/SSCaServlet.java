/***************************************************************************************************
 * ���ϸ� : SSCaServlet.java
 * ��� : ���̹�����-����
 * �ۼ����� : 2005-04-18
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.ca.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.wb.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.wb.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

public class SSCaServlet extends ChosunServlet {
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
            String servletMappedUrl = "/ss/ca/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSCaServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSCaServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSCaWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        SSCa1000WB     wb1000 = null; //���̹�����-���̹�������
        SSBrinfo1000WB wb1100 = null; //���̹�����-���̹�����û�� �ʱ�
        SSCa1100WB     wb1110 = null; //���̹�����-���̹�����û��
        SSCa1200WB     wb1200 = null; //���̹�����-���̹���������
        SSCa1300WB     wb1300 = null; //���̹�����-���̹����縶��

        switch (pid) {

            //���̹�����-���̹�������
            case SSCaWBMapping.CA_1000: //���̹�����-���̹�������-�ʱ�ȭ��
                wb1000 = new SSCa1000WB();
                wb1000.initCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1000_a.jsp";
                break;
            case SSCaWBMapping.CA_1005: //���̹�����-���̹�������-���
                wb1000 = new SSCa1000WB();
                wb1000.selectCaHeadList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1005_l.jsp";
                break;
            case SSCaWBMapping.CA_1010: //���̹�����-���̹�������-��
                wb1000 = new SSCa1000WB();
                wb1000.selectCaHeadDetail(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1010_s.jsp";
                break;
            case SSCaWBMapping.CA_1015: //���̹�����-���̹�������-���
                wb1000 = new SSCa1000WB();
                wb1000.accessCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1015_i.jsp";
                break;
            case SSCaWBMapping.CA_1020: //���̹�����-���̹�������-����
                wb1000 = new SSCa1000WB();
                wb1000.accessCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1020_u.jsp";
                break;
            case SSCaWBMapping.CA_1025: //���̹�����-���̹�������-����
                wb1000 = new SSCa1000WB();
                wb1000.accessCaHead(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1025_d.jsp";
                break;

            //���̹�����-���̹�����û��
            case SSCaWBMapping.CA_1100: //���̹�����-���̹�����û��-�ʱ�ȭ��
                wb1100 = new SSBrinfo1000WB();
                wb1100.initBoZip(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1100_a.jsp";
                break;
            case SSCaWBMapping.CA_1110: //���̹�����-���̹�����û��-��ȸ
                wb1110 = new SSCa1100WB();
                wb1110.selectClamList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1110_l.jsp";
                break;
            case SSCaWBMapping.CA_1120: //���̹�����-���̹�����û��-����
                wb1110 = new SSCa1100WB();
                wb1110.updateCybalon(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1120_i.jsp";
                break;
            case SSCaWBMapping.CA_1130: //���̹�����-���̹�����û��-�μ�
                nextPage = "/jsp/ss/ca/ss_ca_1130_t.jsp";
                break;

            //���̹�����-���̹���������
            case SSCaWBMapping.CA_1200: //���̹�����-���̹���������-�ʱ�ȭ��
                nextPage = "/jsp/ss/ca/ss_ca_1200_l.jsp";
                break;
            case SSCaWBMapping.CA_1210: //���̹�����-���̹���������-��ȸ
                wb1200 = new SSCa1200WB();
                wb1200.selectStafpayList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1210_l.jsp";
                break;
            case SSCaWBMapping.CA_1220: //���̹�����-���̹���������-�μ�
                nextPage = "/jsp/ss/ca/ss_ca_1220_t.jsp";
                break;
            case SSCaWBMapping.CA_1230: //���̹�����-���̹���������-DOWNLOAD
                wb1200 = new SSCa1200WB();
                wb1200.selectDownloadList(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1230_l.jsp";
                break;

            //���̹�����-���̹����縶��
            case SSCaWBMapping.CA_1300: //���̹�����-���̹����縶��-��������
                wb1300 = new SSCa1300WB();
                wb1300.selectAlonClos(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1300_l.jsp";
                break;
            case SSCaWBMapping.CA_1310: //���̹�����-���̹����縶��-���긶�������
                wb1300 = new SSCa1300WB();
                wb1300.accessAlonClos(req, res);
                nextPage = "/jsp/ss/ca/ss_ca_1310_a.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
