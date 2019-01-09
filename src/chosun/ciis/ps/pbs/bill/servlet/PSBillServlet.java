/***************************************************************************************************
 * ���ϸ�   : PSBillServlet.java
 * ���     : ���� ��ǥ ����
 * �ۼ����� : 2003-11-28
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.wb.*;
import chosun.ciis.ps.pbs.bill.wb.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * ���ݸ޴� ��ǥ ����
 */

public class PSBillServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/bill/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ps/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PSBillWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {
        /*
         selectCodeList         �����ڵ���ȸ
         selectSeprrecptList    �����Աݸ���Ʈ
         accessSeprrcpm         �����Ա� �Է�,����,����
         selectReaderDetail     ���� �� ����
         selectLumprcpmList     ���� ���� ����Ʈ
         selectLumprcpmDetail   ���� ���� �� ����Ʈ
         selectNonrcpmList      �������Ա� ����Ʈ
         accessNonrcpm          �������Ա� ����,����,�Է�
         */
        String nextPage = null;
        PSBill1101WB wb1101 = null;
        PSBill1201WB wb1201 = null;
        PSBill1301WB wb1301 = null;
        PSBill1401WB wb1401 = null;
        PSBill1501WB wb1501 = null;
        PSBill1701WB wb1701 = null;
        PSBill1801WB wb1801 = null;
        PSBill1901WB wb1901 = null;

        switch (pid) {
            //�����Ա� �ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1101 :
                wb1101 = new PSBill1101WB();
                wb1101.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1101_a.jsp";
                break;
            //�����Ա� ����Ʈ
            case PSBillWBMapping.PSBILL_1106 :
                wb1101 = new PSBill1101WB();
                wb1101.selectSeprrecptList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1106_l.jsp";
                break;
            //�����Ա� �Է�
            case PSBillWBMapping.PSBILL_1111 :
                wb1101 = new PSBill1101WB();
                wb1101.accessSeprrcpm(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1111_i.jsp";
                break;
            //�����Ա� ����
            case PSBillWBMapping.PSBILL_1116 :
                wb1101 = new PSBill1101WB();
                wb1101.accessSeprrcpm(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1116_u.jsp";
                break;
            //�����Ա� ����
            case PSBillWBMapping.PSBILL_1121 :
                wb1101 = new PSBill1101WB();
                wb1101.accessSeprrcpm(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1121_d.jsp";
                break;
            //�����Ա� ���
            case PSBillWBMapping.PSBILL_1126 :
                nextPage = "/jsp/ps/bill/ps_bil_1126_t.jsp";
                break;
            //�ϰ��Ա� �ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1201 :
                wb1201 = new PSBill1201WB();
                wb1201.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1201_a.jsp";
                break;
            //�ϰ��Ա� �˻�
            case PSBillWBMapping.PSBILL_1206:
                wb1201 = new PSBill1201WB();
                wb1201.selectLumprcpmList(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1206_l.jsp";
                break;
            //�ϰ��Ա� �� ���
            case PSBillWBMapping.PSBILL_1211:
                wb1201 = new PSBill1201WB();
                wb1201.selectLumprcpmDetail(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1211_l.jsp";
                break;
                //�ϰ��Ա� �� ��� ���
            case PSBillWBMapping.PSBILL_1216:
                nextPage = "/jsp/ps/bill/ps_bil_1216_t.jsp";
                break;
            //������ �Ա� �ʱ� ȭ��
            case PSBillWBMapping.PSBILL_1301:
                wb1301 = new PSBill1301WB();
                wb1301.selectCodeList(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1301_a.jsp";
                break;
            //������ �Ա� ����Ʈ
            case PSBillWBMapping.PSBILL_1306:
                wb1301 = new PSBill1301WB();
                wb1301.selectNonrcpmList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1306_l.jsp";
                break;
            //������ �Ա� ����
            case PSBillWBMapping.PSBILL_1311:
                wb1301 = new PSBill1301WB();
                wb1301.accessNonrcpm(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1311_u.jsp";
                break;
            //������ �Ա� ����Ʈ ���
            case PSBillWBMapping.PSBILL_1316:
                nextPage = "/jsp/ps/bill/ps_bil_1316_t.jsp";
                break;
            //�ʰ��Ա�ó�� �ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1401:
                wb1401 = new PSBill1401WB();
                wb1401.selectCombolist(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1401_a.jsp";
                break;
            //�ʰ��Ա�ó�� ����Ʈ��ȸ
            case PSBillWBMapping.PSBILL_1406:
                wb1401 = new PSBill1401WB();
                wb1401.selectList(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1406_l.jsp";
                break;
            //�ʰ��Ա�ó�� �ű��Է�
            case PSBillWBMapping.PSBILL_1411:
                wb1401 = new PSBill1401WB();
                wb1401.aceessExcsamt(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1411_i.jsp";
                break;
            //�ʰ��Ա�ó�� ����
            case PSBillWBMapping.PSBILL_1421:
                wb1401 = new PSBill1401WB();
                wb1401.aceessExcsamt(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1421_d.jsp";
                break;
            //�ʰ��Ա�ó�� ���
            case PSBillWBMapping.PSBILL_1426:
                nextPage = "/jsp/ps/bill/ps_bil_1426_t.jsp";
                break;
            //�ʰ��Ա�ó�� ���� �������� �˻�
            case PSBillWBMapping.PSBILL_1431:
                wb1401 = new PSBill1401WB();
                wb1401.selectRdrinfoPart(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1431_s.jsp";
                break;

            // �����ڵ���ü��û-�ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1501:
                wb1501 = new PSBill1501WB();
                wb1501.initAutoShftAplc(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1501_a.jsp";
                break;
             // ī���ڵ���ü��û-�ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1506:
                wb1501 = new PSBill1501WB();
                wb1501.initAutoShftAplc(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1506_a.jsp";
                break;
            // ī������
            case PSBillWBMapping.PSBILL_1511:
                nextPage = "/jsp/ps/bill/ps_bil_1511_a.jsp";
                break;
             // ����-ī�� �ڵ���ü��û-���
            case PSBillWBMapping.PSBILL_1516:
                wb1501 = new PSBill1501WB();
                wb1501.insertAutoshftAplc(req, res);
                nextPage = "/jsp/ps/bill/ps_bil_1516_a.jsp";
                break;
            // ����-���ڸ���Ʈ ��ȸ
           case PSBillWBMapping.PSBILL_1521:
               wb1501 = new PSBill1501WB();
               wb1501.selectPbrdrList(req, res);
               nextPage = "/jsp/ps/bill/ps_bil_1521_l.jsp";
               break;


            //�ڵ���ü��û �����ȸȭ�� �ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1701 :
                wb1701 = new PSBill1701WB();
                wb1701.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1701_a.jsp";
                break;
            //�ڵ���ü��û �����ȸ
            case PSBillWBMapping.PSBILL_1706 :
                wb1701 = new PSBill1701WB();
                wb1701.selectAplcList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1706_l.jsp";
                break;
            //�ڵ���ü��û �������
            case PSBillWBMapping.PSBILL_1711 :
                wb1701 = new PSBill1701WB();
                wb1701.updateAplc(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1711_u.jsp";
                break;
            //�ڵ���ü��û ����ȸ
            case PSBillWBMapping.PSBILL_1716 :
                wb1701 = new PSBill1701WB();
                wb1701.selectAplcDetail(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1716_s.jsp";
                break;
            //�ڵ���ü��û ������
            case PSBillWBMapping.PSBILL_1726 :
                wb1701 = new PSBill1701WB();
                wb1701.updateAplcInfo(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1726_u.jsp";
                break;

            //�ڵ���üû��Ȯ�� �ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1801 :
                wb1101 = new PSBill1101WB();
                wb1101.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1801_a.jsp";
                break;
            //�ڵ���üû��Ȯ�� �˻�
            case PSBillWBMapping.PSBILL_1806 :
                wb1801 = new PSBill1801WB();
                wb1801.selectPlanList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1806_l.jsp";
                break;
            //�ڵ���üû��Ȯ�� ���
            case PSBillWBMapping.PSBILL_1811 :
                nextPage = "/jsp/ps/bill/ps_bil_1811_t.jsp";
                break;

            //�ڵ���üû����� �ʱ�ȭ��
            case PSBillWBMapping.PSBILL_1901 :
                wb1701 = new PSBill1701WB();
                wb1701.selectCodeList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1901_a.jsp";
                break;
            //�ڵ���üû����� �����ȸ
            case PSBillWBMapping.PSBILL_1906 :
                wb1901 = new PSBill1901WB();
                wb1901.selectClamSsum(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1906_l.jsp";
                break;
            //�ڵ���üû����� ����ȸ
            case PSBillWBMapping.PSBILL_1911 :
                wb1901 = new PSBill1901WB();
                wb1901.selectClamOcomList(req,res);
                nextPage = "/jsp/ps/bill/ps_bil_1911_l.jsp";
                break;
            //�ڵ���üû����� �����
            case PSBillWBMapping.PSBILL_1916 :
                nextPage = "/jsp/ps/bill/ps_bil_1916_t.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
