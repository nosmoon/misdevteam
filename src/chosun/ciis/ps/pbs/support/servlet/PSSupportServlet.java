/***************************************************************************************************
 * ���ϸ�   : PSReaderServlet.java
 * ���     : ����������� �� ��ϵ� �������� ���� ��ȸ�� ó�� ����
 * �ۼ����� : 2003-11-20
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.support.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.wb.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * ���������޴� ��ǥ ����
 */
public class PSSupportServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/support/";
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
     * PSSupportWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        PSSupport1101WB wb1101 = null;
        PSSupport1201WB wb1201 = null;
        PSSupport1301WB wb1301 = null;
        PSSupport1401WB wb1401 = null;

        switch (pid) {
            //�������� top�޴�
            case PSSupportWBMapping.PSSUPPORT_1000:
                nextPage = "/jsp/ps/support/ps_sppt_1000_m.jsp";
                break;
            //�������� sub�޴�
            case PSSupportWBMapping.PSSUPPORT_1006:
                nextPage = "/jsp/ps/support/ps_sppt_1006_s.jsp";
                break;
            //��������-�ʱ�ȭ��
            case PSSupportWBMapping.PSSUPPORT_1011:
                nextPage = "/jsp/ps/support/ps_sppt_1011_f.jsp";
                break;
            //�������� �ʱ�
            case PSSupportWBMapping.PSSUPPORT_1101:
                wb1101 = new PSSupport1101WB();
                wb1101.selectCodeList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1101_s.jsp";
                break;
            //�������� ���ڰ˻�
            case PSSupportWBMapping.PSSUPPORT_1106:
                wb1101 = new PSSupport1101WB();
                wb1101.selectRdrList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1106_p.jsp";
                break;
           //�������� ���
            case PSSupportWBMapping.PSSUPPORT_1111:
                wb1101 = new PSSupport1101WB();
                wb1101.insertDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1111_i.jsp";
                break;
            //�������� �ʱ�
            case PSSupportWBMapping.PSSUPPORT_1201:
                wb1101 = new PSSupport1101WB();
                wb1101.selectCodeList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1201_s.jsp";
                break;
            //�������� ���� ��ȸ
            case PSSupportWBMapping.PSSUPPORT_1206:
                wb1201 = new PSSupport1201WB();
                wb1201.selectRdrList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1206_l.jsp";
                break;
            //�������� Ȯ�� �� ó�����
            case PSSupportWBMapping.PSSUPPORT_1211:
                wb1201 = new PSSupport1201WB();
                wb1201.updateDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1211_u.jsp";
                break;
            //����ó�� �󼼳�������
            case PSSupportWBMapping.PSSUPPORT_1216:
                wb1201 = new PSSupport1201WB();
                wb1201.selectDsctDetail(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1216_s.jsp";
                break;
            //����ó�� ����Ʈ���
            case PSSupportWBMapping.PSSUPPORT_1221:
                nextPage = "/jsp/ps/support/ps_sppt_1221_t.jsp";
                break;
            //�������� Ȯ�� �� �������
            case PSSupportWBMapping.PSSUPPORT_1226:
                wb1201 = new PSSupport1201WB();
                wb1201.updateBranchDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1226_u.jsp";
                break;

            //�̻��û �ʱ�
            case PSSupportWBMapping.PSSUPPORT_1301:
                nextPage = "/jsp/ps/support/ps_sppt_1301_s.jsp";
                break;
            //�̻��û ���� ��ȸ
            case PSSupportWBMapping.PSSUPPORT_1306:
                wb1301 = new PSSupport1301WB();
                wb1301.selectMoveList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1306_l.jsp";
                break;
            //�̻��û �������
            case PSSupportWBMapping.PSSUPPORT_1311:
                wb1301 = new PSSupport1301WB();
                wb1301.updateBranchMove(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1311_u.jsp";
                break;

            ///�̻��û �󼼳�������
            case PSSupportWBMapping.PSSUPPORT_1316:
                wb1301 = new PSSupport1301WB();
                wb1301.selectMoveDetail(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1316_s.jsp";
                break;
            ///�̻��û ����Ʈ���
            case PSSupportWBMapping.PSSUPPORT_1321:
                nextPage = "/jsp/ps/support/ps_sppt_1321_t.jsp";
                break;
/*
            //�̻��û Ȯ�� �� ó�����
            case PSSupportWBMapping.PSSUPPORT_1226:
                wb1201 = new PSSupport1201WB();
                wb1301.updateDsct(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1226_u.jsp";
                break;
*/

            //���ݿ����� ��û �ʱ�
            case PSSupportWBMapping.PSSUPPORT_1401:
                wb1401 = new PSSupport1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1401_a.jsp";
                break;
            //���ݿ����� ��û ��ȸ
            case PSSupportWBMapping.PSSUPPORT_1406:
                wb1401 = new PSSupport1401WB();
                wb1401.selectCashrcptList(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1406_l.jsp";
                break;
            //���ݿ����� ��û ���
            case PSSupportWBMapping.PSSUPPORT_1411:
                nextPage = "/jsp/ps/support/ps_sppt_1411_t.jsp";
                break;

            ///���ݿ����� ����ȸ/�Է�/����
            case PSSupportWBMapping.PSSUPPORT_1416:
                wb1401 = new PSSupport1401WB();
                wb1401.accessCashrcpt(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1416_a.jsp";
                break;
            ///���ݿ����� ����ȸ/�Է�/����
            case PSSupportWBMapping.PSSUPPORT_1421:
                wb1401 = new PSSupport1401WB();
                wb1401.selectCashrcptDetail(req, res);
                nextPage = "/jsp/ps/support/ps_sppt_1421_s.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}