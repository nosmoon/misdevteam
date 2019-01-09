/***************************************************************************************************
 * ���ϸ�   : PSSendServlet.java
 * ���     : �߼�-�߼۸޴� ����
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.send.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.wb.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-�߼۸޴� ��ǥ ����
 */
public class PSSendServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/send/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ps/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ps/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PBReaderWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PSSend1101WB wb1101 = null;
        PSSend1201WB wb1201 = null;
        PSSend1301WB wb1301 = null;
        PSSend1401WB wb1401 = null;
        PSSend1501WB wb1501 = null;
        PSSend1601WB wb1601 = null;
        PSSend1701WB wb1701 = null;
        PSSend1801WB wb1801 = null;
        PSSend1901WB wb1901 = null;
        PSSend2001WB wb2001 = null;
        PSSend2101WB wb2101 = null;
        PSSend2301WB wb2301 = null;
        PSSend2401WB wb2401 = null;

        switch (pid) {
            // �ϰ��߼�Ȯ�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1101:
                wb1101 = new PSSend1101WB();
                wb1101.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1101_a.jsp";
                break;
            // �ϰ��߼�Ȯ�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1106:
                wb1101 = new PSSend1101WB();
                wb1101.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1106_l.jsp";
                break;
            // �ϰ��߼�Ȯ�� ó��
            case PSSendWBMapping.PSSEND_1111:
                wb1101 = new PSSend1101WB();
                wb1101.updateSendcnfm(req, res);
                nextPage = "/jsp/ps/send/ps_send_1111_u.jsp";
                break;
            // �ϰ��߼�Ȯ�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_1116:
                wb1101 = new PSSend1101WB();
                wb1101.selectMthdList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1116_l.jsp";
                break;
            // �ϰ��߼�Ȯ�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1121:
                wb1101 = new PSSend1101WB();
                wb1101.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1121_s.jsp";
                break;

            // �ϰ��߼�ó�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1201:
                wb1201 = new PSSend1201WB();
                wb1201.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1201_a.jsp";
                break;
            // �ϰ��߼�ó�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1206:
                wb1201 = new PSSend1201WB();
                wb1201.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1206_l.jsp";
                break;
            // �ϰ��߼�ó�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_1211:
                wb1201 = new PSSend1201WB();
                wb1201.selectMthdList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1211_l.jsp";
                break;
            // �ϰ��߼�ó�� ����Ʈ ���
            case PSSendWBMapping.PSSEND_1216:
                nextPage = "/jsp/ps/send/ps_send_1216_t.jsp";
                break;
            // �ϰ��߼�ó�� ����Ʈ ��ƼĿ���
            case PSSendWBMapping.PSSEND_1221:
                nextPage = "/jsp/ps/send/ps_send_1221_t.jsp";
                break;
            // �ϰ��߼�ó�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1226:
                wb1201 = new PSSend1201WB();
                wb1201.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1226_s.jsp";
                break;
            // �ϰ��߼�ó�� ����Ʈ ���
            case PSSendWBMapping.PSSEND_1231:
                wb1201 = new PSSend1201WB();
                wb1201.printLumpSticker(req, res);
                nextPage = "/jsp/ps/send/ps_send_1231_t.jsp";
                break;


            // ���Ϲ߼�Ȯ�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1301:
                wb1301 = new PSSend1301WB();
                wb1301.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1301_a.jsp";
                break;
            // ���Ϲ߼�Ȯ�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1306:
                wb1301 = new PSSend1301WB();
                wb1301.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1306_l.jsp";
                break;
            // ���Ϲ߼�Ȯ�� ó��
            case PSSendWBMapping.PSSEND_1311:
                wb1301 = new PSSend1301WB();
                wb1301.updateSendcnfm(req, res);
                nextPage = "/jsp/ps/send/ps_send_1311_u.jsp";
                break;
            // ���Ϲ߼�Ȯ�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_1316:
                wb1301 = new PSSend1301WB();
                wb1301.selectMthdList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1316_l.jsp";
                break;
            // ���Ϲ߼�Ȯ�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1321:
                wb1301 = new PSSend1301WB();
                wb1301.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1321_s.jsp";
                break;

            // ���Ϲ߼�ó�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1401:
                wb1401 = new PSSend1401WB();
                wb1401.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1401_a.jsp";
                break;
            // ���Ϲ߼�ó�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1406:
                wb1401 = new PSSend1401WB();
                wb1401.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1406_l.jsp";
                break;
            // ���Ϲ߼�ó�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_1411:
                wb1401 = new PSSend1401WB();
                wb1401.selectMthdList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1411_l.jsp";
                break;
            // ���Ϲ߼�ó�� ����Ʈ ���
            case PSSendWBMapping.PSSEND_1416:
                nextPage = "/jsp/ps/send/ps_send_1416_t.jsp";
                break;
            // ���Ϲ߼�ó�� ��ƼĿ ���
            case PSSendWBMapping.PSSEND_1421:
                nextPage = "/jsp/ps/send/ps_send_1421_t.jsp";
                break;
            // ���Ϲ߼�ó�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1426:
                wb1401 = new PSSend1401WB();
                wb1401.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1426_s.jsp";
                break;
            // ���Ϲ߼�ó�� ������
            case PSSendWBMapping.PSSEND_1431:
                wb1401 = new PSSend1401WB();
                wb1401.printDdSticker(req, res);
                nextPage = "/jsp/ps/send/ps_send_1431_t.jsp";
                break;

            // �߰��߼�Ȯ�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1501:
                wb1501 = new PSSend1501WB();
                wb1501.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1501_a.jsp";
                break;
            // �߰��߼�Ȯ�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1506:
                wb1501 = new PSSend1501WB();
                wb1501.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1506_l.jsp";
                break;
            // �߰��߼�Ȯ�� ó��
            case PSSendWBMapping.PSSEND_1511:
                wb1501 = new PSSend1501WB();
                wb1501.updateSendcnfm(req, res);
                nextPage = "/jsp/ps/send/ps_send_1511_u.jsp";
                break;
            // �߰��߼�Ȯ�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_1516:
                wb1501 = new PSSend1501WB();
                wb1501.selectMthdList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1516_l.jsp";
                break;

            // �߰��߼�ó�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1601:
                wb1601 = new PSSend1601WB();
                wb1601.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1601_a.jsp";
                break;
            // �߰��߼�ó�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1606:
                wb1601 = new PSSend1601WB();
                wb1601.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1606_l.jsp";
                break;
            // �߰��߼�ó�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_1611:
                wb1601 = new PSSend1601WB();
                wb1601.selectMthdList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1611_l.jsp";
                break;
            // �߰��߼�ó�� ����Ʈ ���
            case PSSendWBMapping.PSSEND_1616:
                nextPage = "/jsp/ps/send/ps_send_1616_t.jsp";
                break;
            // �߰��߼�ó�� ��ƼĿ ���
            case PSSendWBMapping.PSSEND_1621:
                nextPage = "/jsp/ps/send/ps_send_1621_t.jsp";
                break;
            // �߰��߼�ó�� ��ƼĿ ���
            case PSSendWBMapping.PSSEND_1626:
                wb1601 = new PSSend1601WB();
                wb1601.printAddmSticker(req, res);
                nextPage = "/jsp/ps/send/ps_send_1626_t.jsp";
                break;

            //�߼�-���ʽ��Ϲ߼� Ȯ��ó�� �ʱ�
            case PSSendWBMapping.PSSEND_1701:
                wb1701 = new PSSend1701WB();
                wb1701.selectCodeList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1701_s.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� Ȯ��ó�� ��ȸȭ��
            case PSSendWBMapping.PSSEND_1706:
                wb1701 = new PSSend1701WB();
                wb1701.selectBnsbkList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1706_l.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� Ȯ��ó�� ����ȸȭ��
            case PSSendWBMapping.PSSEND_1711:
                wb1701 = new PSSend1701WB();
                wb1701.selectBnsbkDetail(req, res);
                nextPage = "/jsp/ps/send/ps_send_1711_l.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� Ȯ��ó�� ����ó��ȭ��
            case PSSendWBMapping.PSSEND_1716:
                wb1701 = new PSSend1701WB();
                wb1701.updateBnsbk(req, res);
                nextPage = "/jsp/ps/send/ps_send_1716_u.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� �߼�ó�� �ʱ�
            case PSSendWBMapping.PSSEND_1801:
                wb1801 = new PSSend1801WB();
                wb1801.selectCodeList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1801_s.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� �߼�ó�� ��ȸȭ��
            case PSSendWBMapping.PSSEND_1806:
                wb1801 = new PSSend1801WB();
                wb1801.selectBnsbkList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1806_l.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� �߼�ó�� �󼼸���Ʈ
            case PSSendWBMapping.PSSEND_1811:
                wb1801 = new PSSend1801WB();
                wb1801.selectBnsbkDetail(req, res);
                nextPage = "/jsp/ps/send/ps_send_1811_l.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� �߼�ó�� �󼼸���Ʈ ���
            case PSSendWBMapping.PSSEND_1816:
                nextPage = "/jsp/ps/send/ps_send_1816_t.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� �߼�ó�� ��ƼĿ���
            case PSSendWBMapping.PSSEND_1821:
                nextPage = "/jsp/ps/send/ps_send_1821_t.jsp";
                break;
            //�߼�-���ʽ��Ϲ߼� �߼�ó�� ����
            case PSSendWBMapping.PSSEND_1826:
                wb1801 = new PSSend1801WB();
                wb1801.printBnsbkSticker(req, res);
                nextPage = "/jsp/ps/send/ps_send_1826_t.jsp";
                break;

            // ���ι߼� ����߼� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_1901:
                wb1901 = new PSSend1901WB();
                wb1901.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_1901_a.jsp";
                break;
            // ���ι߼� ����߼� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1906:
                wb1901 = new PSSend1901WB();
                wb1901.selectNormsendList(req, res);
                nextPage = "/jsp/ps/send/ps_send_1906_l.jsp";
                break;
            // ���ι߼� ����߼� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_1911:
                nextPage = "/jsp/ps/send/ps_send_1911_t.jsp";
                break;
            // ���ι߼� ����߼� ���κ������
            case PSSendWBMapping.PSSEND_1916:
                nextPage = "/jsp/ps/send/ps_send_1916_t.jsp";
                break;
            // ���ι߼� ����߼� �������
            case PSSendWBMapping.PSSEND_1921:
                nextPage = "/jsp/ps/send/ps_send_1921_t.jsp";
                break;

            //�����߰��߼۵�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_2001:
                wb2001 = new PSSend2001WB();
                wb2001.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2001_a.jsp";
                break;
            //�����߰��߼۵�� �ű��Է�
            case PSSendWBMapping.PSSEND_2006:
                wb2001 = new PSSend2001WB();
                wb2001.aceessGiroaddmsend(req, res);
                nextPage = "/jsp/ps/send/ps_send_2006_a.jsp";
                break;
            //�����߰��߼۵�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_2011:
                wb2001 = new PSSend2001WB();
                wb2001.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2011_l.jsp";
                break;
            //�����߰��߼۵�� ����
            case PSSendWBMapping.PSSEND_2026:
                wb2001 = new PSSend2001WB();
                wb2001.deleteList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2026_d.jsp";
                break;
            //�����߰��߼۵�� �μ�
            case PSSendWBMapping.PSSEND_2031:
                nextPage = "/jsp/ps/send/ps_send_2031_t.jsp";
                break;
            //�����߰��߼� �����μ�
            case PSSendWBMapping.PSSEND_2036:
                nextPage = "/jsp/ps/send/ps_send_2036_t.jsp";
                break;
            //�����߰��߼� �����μ�
            case PSSendWBMapping.PSSEND_2041:
                nextPage = "/jsp/ps/send/ps_send_2041_t.jsp";
                break;

            //�ݼ۰��� �ʱ�
            case PSSendWBMapping.PSSEND_2101:
                wb2101 = new PSSend2101WB();
                wb2101.selectCodeList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2101_s.jsp";
                break;
            //�ݼ۰��� ����Ʈ ��ȸ
            case PSSendWBMapping.PSSEND_2106:
                wb2101 = new PSSend2101WB();
                wb2101.selectRetnList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2106_l.jsp";
                break;
            //�ݼ۰��� ����Ʈ �󼼳��� ���� ����
            case PSSendWBMapping.PSSEND_2111:
                wb2101 = new PSSend2101WB();
                wb2101.accessRetn(req, res);
                nextPage = "/jsp/ps/send/ps_send_2111_a.jsp";
                break;
            //�ݼ۰��� ����Ʈ �󼼳��� ����
            case PSSendWBMapping.PSSEND_2116:
                wb2101 = new PSSend2101WB();
                wb2101.deleteRetn(req, res);
                nextPage = "/jsp/ps/send/ps_send_2116_d.jsp";
                break;
            //�ݼ۰��� ����Ʈ ���
            case PSSendWBMapping.PSSEND_2121:
                nextPage = "/jsp/ps/send/ps_send_2121_t.jsp";
                break;
            //�ݼ۰��� ����Ʈ �󼼳��� ��ȸ
            case PSSendWBMapping.PSSEND_2126:
                wb2101 = new PSSend2101WB();
                wb2101.selectRetnDetail(req, res);
                nextPage = "/jsp/ps/send/ps_send_2126_s.jsp";
                break;
            //�ݼ۰��� ����Ʈ ���ʽ���
            case PSSendWBMapping.PSSEND_2131:
                wb2101 = new PSSend2101WB();
                wb2101.selectBnsList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2131_l.jsp";
                break;
            //�ݼ۰��� ���� ���
            case PSSendWBMapping.PSSEND_2136:
                nextPage = "/jsp/ps/send/ps_send_2136_t.jsp";
                break;
            //�ݼ۰��� excel ���ε� pop
            case PSSendWBMapping.PSSEND_2141:
                nextPage = "/jsp/ps/send/ps_send_2141_p.jsp";
                break;
            //�ݼ۰��� excel �Է�
            case PSSendWBMapping.PSSEND_2146:
                wb2101 = new PSSend2101WB();
                wb2101.excelUpload(req, res);
                nextPage = "/jsp/ps/send/ps_send_2146_u.jsp";
                break;

            //�߼����� �ʱ�
            case PSSendWBMapping.PSSEND_2201:
                wb1201 = new PSSend1201WB();
                wb1201.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2201_a.jsp";
                break;
            //�߼����� ���
            case PSSendWBMapping.PSSEND_2206:
                nextPage = "/jsp/ps/send/ps_send_2206_t.jsp";
                break;
            //�ŷ����� ���
            case PSSendWBMapping.PSSEND_2211:
                nextPage = "/jsp/ps/send/ps_send_2211_t.jsp";
                break;

            // �������߼�Ȯ�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_2301:
                wb2301 = new PSSend2301WB();
                wb2301.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2301_a.jsp";
                break;
            // �������߼�Ȯ�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_2306:
                wb2301 = new PSSend2301WB();
                wb2301.selectList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2306_l.jsp";
                break;
            // �������߼�Ȯ�� �߼۹���� ����ȸ
            case PSSendWBMapping.PSSEND_2311:
                wb2301 = new PSSend2301WB();
                wb2301.selectBoList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2311_l.jsp";
                break;
            // �������߼�Ȯ�� ����Ʈ ���
            case PSSendWBMapping.PSSEND_2316:
                nextPage = "/jsp/ps/send/ps_send_2316_t.jsp";
                break;
            // �������߼�Ȯ�� ����Ʈ ��ƼĿ���
            case PSSendWBMapping.PSSEND_2321:
                wb2301 = new PSSend2301WB();
                wb2301.printSticker(req, res);
                nextPage = "/jsp/ps/send/ps_send_2321_t.jsp";
                break;
            // �������߼�Ȯ�� ��ü����� ȣ��/���� ����
            case PSSendWBMapping.PSSEND_2326:
                wb2301 = new PSSend2301WB();
                wb2301.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2326_s.jsp";
                break;
            // �������߼�Ȯ�� ����Ʈ ���
            case PSSendWBMapping.PSSEND_2331:
                nextPage = "/jsp/ps/send/ps_send_2331_t.jsp";
                break;
            // �������߼�Ȯ�� �μ������ ������������
            case PSSendWBMapping.PSSEND_2336:
                wb2301 = new PSSend2301WB();
                wb2301.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2336_l.jsp";
                break;

            // �������߼۸�� �ʱ�ȭ��
            case PSSendWBMapping.PSSEND_2351:
                wb2301 = new PSSend2301WB();
                wb2301.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2351_a.jsp";
                break;
            // �������߼۸�� ����Ʈ��ȸ
            case PSSendWBMapping.PSSEND_2356:
                wb2301 = new PSSend2301WB();
                wb2301.selectSendBoList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2356_l.jsp";
                break;
            // �������߼۸�� ��ƼĿ
            case PSSendWBMapping.PSSEND_2366:
                nextPage = "/jsp/ps/send/ps_send_2366_t.jsp";
                break;
            // �������߼۸�� ����Ʈ ����
            case PSSendWBMapping.PSSEND_2371:
                wb2301 = new PSSend2301WB();
                wb2301.selectSendBoPrint(req, res);
                nextPage = "/jsp/ps/send/ps_send_2371_t.jsp";
                break;

            //�ְ���������-��޺����긶��-�ʱ�ȭ��
            case PSSendWBMapping.PSSEND_2401:
                wb1101 = new PSSend1101WB();
                wb1101.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2401_s.jsp";
                break;

            //�ְ���������-��޺����긶��-���������
            case PSSendWBMapping.PSSEND_2405:
                //wb2401 = new PSSend2401WB();
                //wb2401.ClosandCancel(req, res);
                nextPage = "/jsp/ps/send/ps_send_2405_a.jsp";
                break;

            //�ְ���������-��޺����긶��-��������
            case PSSendWBMapping.PSSEND_2411:
                wb2401 = new PSSend2401WB();
                wb2401.initClosList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2411_l.jsp";
                break;

            //�ְ���������-��޺����긶��-��������-��������
            case PSSendWBMapping.PSSEND_2415:
                wb2401 = new PSSend2401WB();
                wb2401.closListExcel(req, res);
                nextPage = "/jsp/ps/send/ps_send_2415_p.jsp";
                break;

            //�ְ���������-��޺����긶��-��������-ȣ���� ��
            case PSSendWBMapping.PSSEND_2421:
                wb2401 = new PSSend2401WB();
                wb2401.closSernoList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2421_s.jsp";
                break;

            //��޺񸶰�-�ʱ�ȭ��
            case PSSendWBMapping.PSSEND_2501:
                wb1101 = new PSSend1101WB();
                wb1101.selectCombolist(req, res);
                nextPage = "/jsp/ps/send/ps_send_2501_a.jsp";
                break;

            //��޺񸶰�-����/�������
            case PSSendWBMapping.PSSEND_2506:
                wb2401 = new PSSend2401WB();
                wb2401.ClosandCancel(req, res);
                nextPage = "/jsp/ps/send/ps_send_2506_u.jsp";
                break;

            //��޺񸶰�-�������� ��ȸȭ��
            case PSSendWBMapping.PSSEND_2511:
                wb2401 = new PSSend2401WB();
                wb2401.initClosList(req, res);
                nextPage = "/jsp/ps/send/ps_send_2511_l.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
