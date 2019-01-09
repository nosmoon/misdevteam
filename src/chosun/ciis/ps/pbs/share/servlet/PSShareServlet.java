/***************************************************************************************************
 * ���ϸ� : PSShareServlet.java
 * ��� : �������� ���� �̺�Ʈ �б�
 * �ۼ����� : 2004-02-20
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.share.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.servlet.ChosunServlet;
import chosun.ciis.ps.pbs.share.servlet.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;
import chosun.ciis.ps.pbs.share.wb.*;
import chosun.ciis.ps.pbs.common.servlet.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;
import chosun.ciis.ps.pbs.common.wb.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class PSShareServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/share/";
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
     * SSSHAREWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {

        String nextPage = null;

        PSShare1101WB wb1101 = null;
        PSShare1201WB wb1201 = null;
        PSShare1301WB wb1301 = null;

        PSShare1601WB wb1601 = null;
        PSShare1801WB wb1801 = null;

//        PSShare1401WB wb1401 = null;
//        PSShare1501WB wb1501 = null;

        switch (pid) {

            // ��������-����
            case PSShareWBMapping.SHARE_1101: //��������-����-�ʱ�ȭ��
                wb1101 = new PSShare1101WB();
                nextPage = "/jsp/ps/share/ps_share_1101_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1106: //��������-����-��ȸ(����Ʈ)
                wb1101 = new PSShare1101WB();
                wb1101.selectTacomScheList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1106_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1111: //��������-����-�󼼺���
                wb1101 = new PSShare1101WB();
                wb1101.selectTacomScheDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1111_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1116: //��������-����-����(���)
                wb1101 = new PSShare1101WB();
                wb1101.accessTacomSche(req, res);
                nextPage = "/jsp/ps/share/ps_share_1116_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1121: //��������-����-����(����)
                wb1101 = new PSShare1101WB();
                wb1101.accessTacomSche(req, res);
                nextPage = "/jsp/ps/share/ps_share_1121_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1126: //��������-����-����
                wb1101 = new PSShare1101WB();
                wb1101.accessTacomSche(req, res);
                nextPage = "/jsp/ps/share/ps_share_1126_d.jsp";
                break;

                //��������-�Խ���-��������
            case PSShareWBMapping.SHARE_1201: //��������-�Խ���-��������-��ȸ(����Ʈ)
                wb1201 = new PSShare1201WB();
                wb1201.selectInitList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1201_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1206: //��������-�Խ���-��������-��ȸ(�˻�)
                wb1201 = new PSShare1201WB();
                wb1201.selectSrchList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1206_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1211: //��������-�Խ���-��������-���ȭ��
                wb1201 = new PSShare1201WB();
                wb1201.selectCombo(req, res);
//				wb1201.writeInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1211_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1216: //��������-�Խ���-��������-���
                wb1201 = new PSShare1201WB();
                try {
                    wb1201.insertInfoexg(req, res);
                } catch (IOException ex) {} catch (AppException ex) {}
                nextPage = "/jsp/ps/share/ps_share_1216_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1221: //��������-�Խ���-��������-�󼼺���
                wb1201 = new PSShare1201WB();
                wb1201.selectCombo(req, res);
                wb1201.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1221_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1226: //��������-�Խ���-��������-����
                wb1201 = new PSShare1201WB();
                wb1201.updateInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1226_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1231: //��������-�Խ���-��������-����
                wb1201 = new PSShare1201WB();
                wb1201.deleteInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1231_d.jsp";
                break;
            case PSShareWBMapping.SHARE_1236: //��������-�Խ���-��������-��õ
                wb1201 = new PSShare1201WB();
                wb1201.recomInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1236_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1241: //��������-�Խ���-��������-�ٿ�ε�
                wb1201 = new PSShare1201WB();
                wb1201.dwloadInfoexg(req, res);
                nextPage = "/jsp/ps/common/download.jsp";
                break;

                //��������-�Խ���-�Ǹű��Խ���
            case PSShareWBMapping.SHARE_1301: //��������-�Խ���-�Ǹű��Խ���-��ȸ(����Ʈ)
                wb1301 = new PSShare1301WB();
                wb1301.selectInitList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1301_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1306: //��������-�Խ���-�Ǹű��Խ���-��ȸ(�˻�)
                wb1301 = new PSShare1301WB();
                wb1301.selectSrchList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1306_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1311: //��������-�Խ���-�Ǹű��Խ���-���ȭ��
                wb1301 = new PSShare1301WB();
                wb1301.writeInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1311_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1316: //��������-�Խ���-�Ǹű��Խ���-���
                wb1301 = new PSShare1301WB();
                wb1301.insertInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1316_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1321: //��������-�Խ���-�Ǹű��Խ���-�󼼺���
                wb1301 = new PSShare1301WB();
                wb1301.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1321_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1326: //��������-�Խ���-�Ǹű��Խ���-����
                wb1301 = new PSShare1301WB();
                wb1301.updateInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1326_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1331: //��������-�Խ���-�Ǹű��Խ���-����
                wb1301 = new PSShare1301WB();
                wb1301.deleteInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1331_d.jsp";
                break;
            case PSShareWBMapping.SHARE_1336: //��������-�Խ���-�Ǹű��Խ���-��õ
                wb1301 = new PSShare1301WB();
                wb1301.recomInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1336_u.jsp";
                break;
            case PSShareWBMapping.SHARE_1341: //��������-�Խ���-�Ǹű��Խ���-�亯ȭ��
                wb1301 = new PSShare1301WB();
                wb1301.answerInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1341_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1346: //��������-�Խ���-�Ǹű��Խ���-�亯
                wb1301 = new PSShare1301WB();
                wb1301.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ps/share/ps_share_1346_i.jsp";
                break;
            case PSShareWBMapping.SHARE_1351: //��������-�Խ���-�Ǹű��Խ���-�ٿ�ε�
                wb1301 = new PSShare1301WB();
                wb1301.dwloadInfoexg(req, res);
                nextPage = "/jsp/ps/common/download.jsp";
                break;

                //��������-�޷�
            case PSShareWBMapping.SHARE_1601: //��������-�޷�
                wb1601 = new PSShare1601WB();
                wb1601.selectMonthScheList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1601_a.jsp";
                break;
            case PSShareWBMapping.SHARE_1606: //��������-��
                wb1601 = new PSShare1601WB();
                wb1601.selectDayScheDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1606_s.jsp";
                break;

                //��������-�Խ���-��������
            case PSShareWBMapping.SHARE_1801: //��������-�Խ���-��������-��ȸ(����Ʈ)
                wb1801 = new PSShare1801WB();
                wb1801.selectInitList(req, res);
                nextPage = "/jsp/ps/share/ps_share_1801_l.jsp";
                break;
            case PSShareWBMapping.SHARE_1806: //��������-�Խ���-��������-�󼼺���
                wb1801 = new PSShare1801WB();
                wb1801.selectCombo(req, res);
                wb1801.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ps/share/ps_share_1806_s.jsp";
                break;
            case PSShareWBMapping.SHARE_1811: //��������-�Խ���-��������-�ٿ�ε�
                wb1801 = new PSShare1801WB();
                wb1801.dwloadInfoexg(req, res);
                nextPage = "/jsp/ps/common/download.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));

        }
        return nextPage;
    }
}