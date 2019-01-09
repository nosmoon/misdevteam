/***************************************************************************************************
 * ���ϸ�   : PSAllowServlet.java
 * ���     : ���Ǳ� ����޴� ��ǥ ����
 * �ۼ����� : 2004-02-24
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.wb.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * ����޴� ��ǥ ����
 */
public class PSAllowServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/allow/";

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
     * PSAllowWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException {
        String nextPage = null;

        PSAllow1101WB wb1101 = null;
        PSAllow1201WB wb1201 = null;
        PSAllow1301WB wb1301 = null;
        PSAllow1401WB wb1401 = null;
        PSAllow1501WB wb1501 = null;
        PSAllow1601WB wb1601 = null;
        PSAllow1701WB wb1701 = null;
        PSAllow1801WB wb1801 = null;
        PSAllow1901WB wb1901 = null;
        PSAllow2001WB wb2001 = null;
        PSAllow2101WB wb2101 = null;

        switch (pid) {
            //������������ �ʱ�
            case PSAllowWBMapping.PSALLOW_1101:
            	wb1101  =  new PSAllow1101WB();
                wb1101.selectBoemp_AlonKind(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1101_l.jsp";
                break;
            //������������ ����
            case PSAllowWBMapping.PSALLOW_1106:
            	wb1101  =  new PSAllow1101WB();
                wb1101.accessBoemp_AlonKind(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1106_a.jsp";
                break;

            //�������� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1201:
                wb1201 = new PSAllow1201WB() ;
                wb1201.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1201_s.jsp";
                break;
            //�������� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_1206:
                wb1201 = new PSAllow1201WB() ;
                wb1201.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1206_l.jsp";
                break;
            //�������� ����
            case PSAllowWBMapping.PSALLOW_1211:
                wb1201 = new PSAllow1201WB() ;
                wb1201.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1211_a.jsp";
                break;
            //�������� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1301:
                wb1301 = new PSAllow1301WB() ;
                wb1301.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1301_s.jsp";
                break;
            //�������� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_1306:
                wb1301 = new PSAllow1301WB() ;
                wb1301.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1306_l.jsp";
                break;
            //�������� ����
            case PSAllowWBMapping.PSALLOW_1311:
                wb1301 = new PSAllow1301WB() ;
                wb1301.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1311_a.jsp";
                break;
            //Ư������ �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1401:
                wb1401 = new PSAllow1401WB() ;
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1401_s.jsp";
                break;
            //Ư������ ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_1406:
                wb1401 = new PSAllow1401WB() ;
                wb1401.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1406_l.jsp";
                break;
            //Ư������ ����
            case PSAllowWBMapping.PSALLOW_1411:
                wb1401 = new PSAllow1401WB() ;
                wb1401.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1411_a.jsp";
                break;
            //��å���� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1501:
                wb1501 = new PSAllow1501WB() ;
                wb1501.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1501_s.jsp";
                break;
            //��å���� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_1506:
                wb1501 = new PSAllow1501WB() ;
                wb1501.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1506_l.jsp";
                break;
            //��å���� ����
            case PSAllowWBMapping.PSALLOW_1511:
                wb1501 = new PSAllow1501WB() ;
                wb1501.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1511_a.jsp";
                break;
            //��ټ��� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1601:
                wb1601 = new PSAllow1601WB() ;
                wb1601.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1601_s.jsp";
                break;
            //��ټ��� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_1606:
                wb1601 = new PSAllow1601WB() ;
                wb1601.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1606_l.jsp";
                break;
            //��ټ��� ����
            case PSAllowWBMapping.PSALLOW_1611:
                wb1601 = new PSAllow1601WB() ;
                wb1601.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1611_a.jsp";
                break;
            //ķ���ΰ��� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1701:
                wb1701 = new PSAllow1701WB() ;
                wb1701.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1701_s.jsp";
                break;
            //ķ���ΰ��� ����
            case PSAllowWBMapping.PSALLOW_1706:
                wb1701 = new PSAllow1701WB() ;
                wb1701.insertCampAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1706_i.jsp";
                break;
            //ķ���ΰ��� �˻�
            case PSAllowWBMapping.PSALLOW_1711:
                wb1701 = new PSAllow1701WB() ;
                wb1701.selectCampAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1711_l.jsp";
                break;
            //ķ���ΰ��� ����
            case PSAllowWBMapping.PSALLOW_1716:
                wb1701 = new PSAllow1701WB() ;
                wb1701.deleteCampAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1716_d.jsp";
                break;
            //ķ���ΰ��� ����� ķ���� �󼼳���
            case PSAllowWBMapping.PSALLOW_1721:
                wb1701 = new PSAllow1701WB() ;
                wb1701.selectCampaign(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1721_p.jsp";
                break;
            //ķ���ΰ��� ���ķ���� ���� �˻�
            case PSAllowWBMapping.PSALLOW_1726:
                wb1701 = new PSAllow1701WB() ;
                wb1701.selectEmpCampaign(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1726_l.jsp";
                break;
            //ķ���ΰ��� ���ķ���� ���� ���
            case PSAllowWBMapping.PSALLOW_1731:
                wb1701 = new PSAllow1701WB() ;
                wb1701.insertEmpCampAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1731_i.jsp";
                break;
            //��������� �ʱ�
            case PSAllowWBMapping.PSALLOW_1801:
            	wb1801  =  new PSAllow1801WB();
                wb1801.selectAlonClos(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1801_a.jsp";
                break;
            //��������� �۾�
            case PSAllowWBMapping.PSALLOW_1806:
                wb1801 = new PSAllow1801WB();
                wb1801.accessAlonClos(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1806_a.jsp";
                break;
            //��������� ����۾�
            case PSAllowWBMapping.PSALLOW_1811:
                wb1801 = new PSAllow1801WB();
                wb1801.deleteAlonClos(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1811_d.jsp";
                break;
            //��������� �˻�
            case PSAllowWBMapping.PSALLOW_1816:
            	wb1801  =  new PSAllow1801WB();
                wb1801.selectAlonClos(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1801_a.jsp";
                break;

            //��������� ���
            case PSAllowWBMapping.PSALLOW_1821:
                nextPage = "/jsp/ps/allow/ps_alon_1821_t.jsp";
                break;

            //���ݼ��� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_1901:
                wb1901 = new PSAllow1901WB();
                wb1901.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1901_s.jsp";
                break;
            //���ݼ��� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_1906:
                wb1901 = new PSAllow1901WB();
                wb1901.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1906_l.jsp";
                break;
            //���ݼ��� ����
            case PSAllowWBMapping.PSALLOW_1911:
                wb1901 = new PSAllow1901WB();
                wb1901.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_1911_a.jsp";
                break;

            //���Ұ��� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_2001:
                wb2001 = new PSAllow2001WB();
                wb2001.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2001_s.jsp";
                break;
            //���Ұ��� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_2006:
                wb2001 = new PSAllow2001WB();
                wb2001.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2006_l.jsp";
                break;
            //���Ұ��� ����
            case PSAllowWBMapping.PSALLOW_2011:
                wb2001 = new PSAllow2001WB();
                wb2001.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2011_a.jsp";
                break;
            //���Ұ��� �� ��ȸ
            case PSAllowWBMapping.PSALLOW_2016:
                wb2001 = new PSAllow2001WB();
                wb2001.select_Payadv_Detail(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2016_s.jsp";
                break;

            //���Ұ��� �� ����/����
            case PSAllowWBMapping.PSALLOW_2021:
                wb2001 = new PSAllow2001WB();
                wb2001.accessPayadv(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2021_a.jsp";
                break;
            //���Ұ��� �� ���
            case PSAllowWBMapping.PSALLOW_2026:
                nextPage = "/jsp/ps/allow/ps_alon_2026_t.jsp";
                break;

            //�μ�Ƽ����� �ʱ�ȭ��
            case PSAllowWBMapping.PSALLOW_2101:
                wb2101 = new PSAllow2101WB();
                wb2101.selectCodeList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2101_s.jsp";
                break;
            //�μ�Ƽ����� ��ȸȭ��
            case PSAllowWBMapping.PSALLOW_2106:
                wb2101 = new PSAllow2101WB();
                wb2101.selectRsltList(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2106_l.jsp";
                break;
            //�μ�Ƽ����� ����
            case PSAllowWBMapping.PSALLOW_2111:
                wb2101 = new PSAllow2101WB();
                wb2101.accessAlon(req, res);
                nextPage = "/jsp/ps/allow/ps_alon_2111_a.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }

}
