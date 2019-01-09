/***************************************************************************************************
 * ���ϸ� : SSShareServlet.java
 * ��� : �������� ���� �̺�Ʈ �б�
 * �ۼ����� : 2003-10-30
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
package chosun.ciis.ss.sls.share.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.servlet.ChosunServlet;
import chosun.ciis.ss.sls.share.servlet.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;
import chosun.ciis.ss.sls.share.wb.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;
import chosun.ciis.ss.sls.common.wb.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSShareServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/share/";
            iPid = extractPid(req, servletMappedUrl);

// import ������ ��.

System.out.println("SSShareServlet : process : iPid : "+iPid);
            nextPage = executeWorker(req, res, iPid);
System.out.println("SSShareServlet : process : nextPage : "+nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            System.out.println("SSShareServlet : process : appException : "+ae.toString() + ae.getErrorMessage());
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,int pid) throws AppException {

        String nextPage = null;
        SSShare1000WB ssshare1000WB = null;
        SSShare1100WB ssshare1100WB = null;
        SSShare1200WB ssshare1200WB = null;
        SSShare1300WB ssshare1300WB = null;
        SSShare1400WB ssshare1400WB = null;
        SSShare1500WB ssshare1500WB = null;
        SSShare1600WB ssshare1600WB = null;
        SSShare1700WB ssshare1700WB = null;
        SSShare1800WB ssshare1800WB = null;
        SSShare1900WB ssshare1900WB = null;
        SSShare2000WB ssshare2000WB = null;
        SSShare2100WB ssshare2100WB = null;
        SSShare2200WB ssshare2200WB = null;

        // ����Ͽ�
        SSShare11300WB ssshare11300WB = null;

        switch (pid) {
            // ��������-����
            case SSShareWBMapping.SHARE_1000:	//��������-����-�ʱ�ȭ��
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1000_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1010:	//��������-����-��ȸ(����Ʈ)
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.selectTacomScheList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1010_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1020:	//��������-����-�󼼺���
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.selectTacomScheDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1020_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1030:	//��������-����-����(���)
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.accessTacomSche(req, res);
                nextPage = "/jsp/ss/share/ss_share_1030_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1040:	//��������-����-����(����)
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.accessTacomSche(req, res);
                nextPage = "/jsp/ss/share/ss_share_1040_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1050:	//��������-����-����
                ssshare1000WB = new SSShare1000WB();
                ssshare1000WB.accessTacomSche(req, res);
                nextPage = "/jsp/ss/share/ss_share_1050_d.jsp";
                break;
            //��������-Ÿ��߼ۺμ�
            case SSShareWBMapping.SHARE_1100:	//��������-Ÿ��߼ۺμ�-�ʱ�ȭ��
                ssshare1100WB = new SSShare1100WB();
                nextPage = "/jsp/ss/share/ss_share_1100_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1110:	//��������-Ÿ��߼ۺμ�-��ȸ(����Ʈ)
                ssshare1100WB = new SSShare1100WB();
                ssshare1100WB.selectOthqtyList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1110_l.jsp";
                break;
            //��������-�ǽð�����
            case SSShareWBMapping.SHARE_1200:	//��������-�ǽð�����-��������-��ȸ(����Ʈ)
                ssshare1200WB = new SSShare1200WB();
                ssshare1200WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1200_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1201:	//��������-�ǽð�����-��������-��ȸ(�˻�)
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1201_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1210:	//��������-�ǽð�����-��������-���ȭ��
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.writeAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1210_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1215:	//��������-�ǽð�����-��������-���
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.insertAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1215_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1216:	//��������-�ǽð�����-��������-����
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.updateAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1216_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1217:	//��������-�ǽð�����-��������-����
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.deleteAnncbo(req, res);
                nextPage = "/jsp/ss/share/ss_share_1217_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1220:	//��������-�ǽð�����-��������-���
            	ssshare1200WB = new SSShare1200WB();
            	ssshare1200WB.selectSrchDtls(req, res);
                nextPage = "/jsp/ss/share/ss_share_1220_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1250:	//��������-�ǽð�����-�Ǹű�����-���ȭ��
                ssshare1200WB = new SSShare1200WB();
                ssshare1200WB.writeAnncsls(req, res);
                nextPage = "/jsp/ss/share/ss_share_1250_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1251:	//��������-�ǽð�����-�Ǹű�����-���
                ssshare1200WB = new SSShare1200WB();
                ssshare1200WB.insertAnncsls(req, res);
                nextPage = "/jsp/ss/share/ss_share_1251_i.jsp";
                break;
            //��������-�Խ���-��������
            case SSShareWBMapping.SHARE_1300:	//��������-�Խ���-��������-��ȸ(����Ʈ)
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1300_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1301:	//��������-�Խ���-��������-��ȸ(�˻�)
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1301_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1310:	//��������-�Խ���-��������-���ȭ��
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1310_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1315:	//��������-�Խ���-��������-���
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1315_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1320:	//��������-�Խ���-��������-�󼼺���
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1320_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1330:	//��������-�Խ���-��������-����
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1330_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1340:	//��������-�Խ���-��������-����
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1340_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1350:	//��������-�Խ���-��������-��õ
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1350_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1360: //��������-�Խ���-��������-�ٿ�ε�
                ssshare1300WB = new SSShare1300WB();
                ssshare1300WB.dwloadInfoexg(req, res);
//20060608 ���� ����
                nextPage = "/jsp/ss/common/download.jsp";

//20050708 ��뼷 ����                nextPage = "/jsp/ss/common/download.jsp";
//                nextPage = "/jsp/ss/common/download2.jsp"; //20050708 ��뼷 �߰�(���ϻ��� �� �ٿ�ε�)
                break;
            //��������-�Խ���-�Ǹű��Խ���
            case SSShareWBMapping.SHARE_1400: //��������-�Խ���-�Ǹű��Խ���-��ȸ(����Ʈ)
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1400_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1401:	//��������-�Խ���-�Ǹű��Խ���-��ȸ(�˻�)
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1401_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1410:	//��������-�Խ���-�Ǹű��Խ���-���ȭ��
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1410_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1415:	//��������-�Խ���-�Ǹű��Խ���-���
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1415_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1420:	//��������-�Խ���-�Ǹű��Խ���-�󼼺���
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1420_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1430:	//��������-�Խ���-�Ǹű��Խ���-����
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1430_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1440:	//��������-�Խ���-�Ǹű��Խ���-����
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1440_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1450:	//��������-�Խ���-�Ǹű��Խ���-��õ
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1450_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1460:	//��������-�Խ���-�Ǹű��Խ���-�亯ȭ��
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1460_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1465:	//��������-�Խ���-�Ǹű��Խ���-�亯
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1465_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1470: //��������-�Խ���-�Ǹű��Խ���-�ٿ�ε�
                ssshare1400WB = new SSShare1400WB();
                ssshare1400WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�Խ���-�̽��Խ���
            case SSShareWBMapping.SHARE_1500:	//��������-�Խ���-�̽��Խ���-��ȸ(����Ʈ)
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1500_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1501:	//��������-�Խ���-�̽��Խ���-��ȸ(�˻�)
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1501_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1510:	//��������-�Խ���-�̽��Խ���-���ȭ��
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1510_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1515:	//��������-�Խ���-�̽��Խ���-���
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1515_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1520:	//��������-�Խ���-�̽��Խ���-�󼼺���
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1520_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1530:	//��������-�Խ���-�̽��Խ���-����
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1530_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1540:	//��������-�Խ���-�̽��Խ���-����
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1540_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1550:	//��������-�Խ���-�̽��Խ���-��õ
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1550_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1560:	//��������-�Խ���-�̽��Խ���-�亯ȭ��
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1560_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1565:	//��������-�Խ���-�̽��Խ���-�亯
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1565_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1570: //��������-�Խ���-�̽��Խ���-�ٿ�ε�
                ssshare1500WB = new SSShare1500WB();
                ssshare1500WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�Խ���-�Ź���Խ���
            case SSShareWBMapping.SHARE_1600:	//��������-�Խ���-�Ź���Խ���-��ȸ(����Ʈ)
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1600_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1601:	//��������-�Խ���-�Ź���Խ���-��ȸ(�˻�)
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1601_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1610: //��������-�Խ���-�Ź���Խ���-���ȭ��
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1610_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1615:	//��������-�Խ���-�Ź���Խ���-���
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1615_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1620:	//��������-�Խ���-�Ź���Խ���-�󼼺���
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1620_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1630:	//��������-�Խ���-�Ź���Խ���-����
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1630_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1640:	//��������-�Խ���-�Ź���Խ���-����
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1640_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1650:	//��������-�Խ���-�Ź���Խ���-��õ
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1650_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1660:	//��������-�Խ���-�Ź���Խ���-�亯ȭ��
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1660_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1665:	//��������-�Խ���-�Ź���Խ���-�亯
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1665_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1670: //��������-�Խ���-�Ź���Խ���-�ٿ�ε�
                ssshare1600WB = new SSShare1600WB();
                ssshare1600WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�Խ���-�����Խ���
            case SSShareWBMapping.SHARE_1700:	//��������-�Խ���-�����Խ���-��ȸ(����Ʈ)
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1700_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1701: //��������-�Խ���-�����Խ���-��ȸ(�˻�)
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1701_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1710:	//��������-�Խ���-�����Խ���-���ȭ��
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.writeInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1710_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1715:	//��������-�Խ���-�����Խ���-���
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1715_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1720:	//��������-�Խ���-�����Խ���-�󼼺���
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.selectInfoexgDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1720_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1730:	//��������-�Խ���-�����Խ���-����
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.updateInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1730_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1740:	//��������-�Խ���-�����Խ���-����
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.deleteInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1740_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1750:	//��������-�Խ���-�����Խ���-��õ
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.recomInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1750_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1760:	//��������-�Խ���-�����Խ���-�亯ȭ��
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.answerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1760_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1765:	//��������-�Խ���-�����Խ���-�亯
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.insertAnswerInfoexg(req, res);
                nextPage = "/jsp/ss/share/ss_share_1765_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1770: //��������-�Խ���-�Ź���Խ���-�ٿ�ε�
                ssshare1700WB = new SSShare1700WB();
                ssshare1700WB.dwloadInfoexg(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�����׺���-���Ͼ�������
            case SSShareWBMapping.SHARE_1800:	//��������-�����׺���-���Ͼ�������-��ȸ(����Ʈ)
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1800_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1801:	//��������-�����׺���-���Ͼ�������-��ȸ(�˻�)
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1801_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1810:	//��������-�����׺���-���Ͼ�������-���ȭ��
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.writeJobrec(req, res);
                nextPage = "/jsp/ss/share/ss_share_1810_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1815:	//��������-�����׺���-���Ͼ�������-���
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.insertJobrec(req,res);
                nextPage = "/jsp/ss/share/ss_share_1815_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1820:	//��������-�����׺���-���Ͼ�������-�󼼺���
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.selectJobrecDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1820_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1830:	//��������-�����׺���-���Ͼ�������-����
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.updateJobrec(req, res);
                nextPage = "/jsp/ss/share/ss_share_1830_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1840:	//��������-�����׺���-���Ͼ�������-����
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.deleteJobrec(req, res);
                nextPage = "/jsp/ss/share/ss_share_1840_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1850: //��������-�����׺���-���Ͼ�������-�ٿ�ε�
                ssshare1800WB = new SSShare1800WB();
                ssshare1800WB.dwloadJobrec(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�����׺���-���庸��
            case SSShareWBMapping.SHARE_1900:	//��������-�����׺���-���庸��-��ȸ(����Ʈ)
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1900_a.jsp";
                break;
            case SSShareWBMapping.SHARE_1901:	//��������-�����׺���-���庸��-��ȸ(�˻�)
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_1901_l.jsp";
                break;
            case SSShareWBMapping.SHARE_1910:	//��������-�����׺���-���庸��-���ȭ��
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.writeOutrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_1910_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1915:	//��������-�����׺���-���庸��-���
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.insertOutrpt(req,res);
                nextPage = "/jsp/ss/share/ss_share_1915_i.jsp";
                break;
            case SSShareWBMapping.SHARE_1920:	//��������-�����׺���-���庸��-�󼼺���
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.selectOutrptDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_1920_s.jsp";
                break;
            case SSShareWBMapping.SHARE_1930:	//��������-�����׺���-���庸��-����
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.updateOutrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_1930_u.jsp";
                break;
            case SSShareWBMapping.SHARE_1940:	//��������-�����׺���-���庸��-����
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.deleteOutrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_1940_d.jsp";
                break;
            case SSShareWBMapping.SHARE_1950: //��������-�����׺���-���庸��-�ٿ�ε�
                ssshare1900WB = new SSShare1900WB();
                ssshare1900WB.dwloadOutrpt(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�����׺���-�����ٹ�����
            case SSShareWBMapping.SHARE_2000:	//��������-�����׺���-�����ٹ�����-��ȸ(����Ʈ)
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2000_a.jsp";
                break;
            case SSShareWBMapping.SHARE_2001:	//��������-�����׺���-�����ٹ�����-��ȸ(�˻�)
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2001_l.jsp";
                break;
            case SSShareWBMapping.SHARE_2010:	//��������-�����׺���-�����ٹ�����-���ȭ��
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.writeDawnrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2010_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2015:	//��������-�����׺���-�����ٹ�����-���
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.insertDawnrpt(req,res);
                nextPage = "/jsp/ss/share/ss_share_2015_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2020:	//��������-�����׺���-�����ٹ�����-�󼼺���
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.selectDawnrptDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2020_s.jsp";
                break;
            case SSShareWBMapping.SHARE_2030:	//��������-�����׺���-�����ٹ�����-����
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.updateDawnrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2030_u.jsp";
                break;
            case SSShareWBMapping.SHARE_2040:	//��������-�����׺���-�����ٹ�����-����
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.deleteDawnrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2040_d.jsp";
                break;
            case SSShareWBMapping.SHARE_2050: //��������-�����׺���-�����ٹ�����-�ٿ�ε�
                ssshare2000WB = new SSShare2000WB();
                ssshare2000WB.dwloadDawnrpt(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //��������-�����׺���-Ÿ�絿�⺸��
            case SSShareWBMapping.SHARE_2100:	//��������-�����׺���-Ÿ�絿�⺸��-��ȸ(����Ʈ)
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.selectInitList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2100_a.jsp";
                break;
            case SSShareWBMapping.SHARE_2101:	//��������-�����׺���-Ÿ�絿�⺸��-��ȸ(�˻�)
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.selectSrchList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2101_l.jsp";
                break;
            case SSShareWBMapping.SHARE_2110:	//��������-�����׺���-Ÿ�絿�⺸��-���ȭ��
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.writeOthrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2110_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2115:	//��������-�����׺���-Ÿ�絿�⺸��-���
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.insertOthrpt(req,res);
                nextPage = "/jsp/ss/share/ss_share_2115_i.jsp";
                break;
            case SSShareWBMapping.SHARE_2120:	//��������-�����׺���-Ÿ�絿�⺸��-�󼼺���
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.selectOthrptDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2120_s.jsp";
                break;
            case SSShareWBMapping.SHARE_2130:	//��������-�����׺���-Ÿ�絿�⺸��-����
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.updateOthrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2130_u.jsp";
                break;
            case SSShareWBMapping.SHARE_2140:	//��������-�����׺���-Ÿ�絿�⺸��-����
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.deleteOthrpt(req, res);
                nextPage = "/jsp/ss/share/ss_share_2140_d.jsp";
                break;
            case SSShareWBMapping.SHARE_2150: //��������-�����׺���-Ÿ�絿�⺸��-�ٿ�ε�
                ssshare2100WB = new SSShare2100WB();
                ssshare2100WB.dwloadOthrpt(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            //�Ǹű�����
            case SSShareWBMapping.SHARE_2200:	//�Ǹű�����-�ʱ�ȭ��
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectMainInit(req, res);
                nextPage = "/jsp/ss/share/ss_share_2200_a.jsp";
                break;
            case SSShareWBMapping.SHARE_2210: //�Ǹű�����-�޷�-�������� ��ȸ
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectMonthScheList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2210_l.jsp";
                break;
            case SSShareWBMapping.SHARE_2212: //�Ǹű�����-�޷�-�Ϻ����� ��ȸ(�˾�)
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectDayScheList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2212_p.jsp";
                break;
            case SSShareWBMapping.SHARE_2220: //�Ǹű�����-��������-��(�˾�)
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectAnncDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2220_p.jsp";
                break;
            case SSShareWBMapping.SHARE_2222: //�Ǹű�����-��������-�ٿ�ε�
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.dwloadAnnc(req, res);
                nextPage = "/jsp/ss/common/download.jsp";
                break;
            case SSShareWBMapping.SHARE_2230: //�Ǹű�����-�ǽð�����-��(�˾�)
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectAnncslsDetail(req, res);
                nextPage = "/jsp/ss/share/ss_share_2230_p.jsp";
                break;
            case SSShareWBMapping.SHARE_2240: //�Ǹű�����-�ʱ�ȭ��-hidden
                ssshare2200WB = new SSShare2200WB();
                ssshare2200WB.selectAnncslsList(req, res);
                nextPage = "/jsp/ss/share/ss_share_2240_s.jsp";
                break;

/*******************************************����Ͽ�******************************************************************/
            case SSShareWBMapping.SHARE_11301:	//��������-�Խ���-��������-��ȸ(�˻�)
                ssshare11300WB = new SSShare11300WB();
                ssshare11300WB.mo_selectSrchList(req, res);
                nextPage = "/jsp/ss/share/mo_ss_share_11301_l.jsp";
                break;
            case SSShareWBMapping.SHARE_11302:	//��������-�Խ���-��������-��ȸ(��)/ agency/commun_11120 ����
                ssshare11300WB = new SSShare11300WB();
                ssshare11300WB.mo_selectSrchDetail(req, res);
                nextPage = "/jsp/ss/share/mo_ss_share_11302_s.jsp";
                break;
            case SSShareWBMapping.SHARE_11315:	//��������-�Խ���-��������-���
                ssshare11300WB = new SSShare11300WB();
                ssshare11300WB.mo_insertInfoexg(req, res);
                nextPage = "/jsp/ss/share/mo_ss_share_11315_i.jsp";
                break;

            default:
            throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
