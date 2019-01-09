/***************************************************************************************************
 * ���ϸ� : SSBrmgrServlet.java
 * ��� : �����濵 ����
 * �ۼ����� : 2004-03-06
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
//import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.wb.*;
//import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;
/*
import chosun.ciis.ss.sls.rdr.ejb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
*/

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSBrmgrServlet extends ChosunServlet {

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
    public void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/brmgr/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSBrmgrServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSBrmgrServlet : process : nextPage : " + nextPage);
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
     * SSBrmgrWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {

        String nextPage = null;
        SSBrmgr1000WB wb1000 = null; //�����濵-�����μ���Ȳ
        SSBrmgr1100WB wb1100 = null; //�����濵-���ϸ�����Ȳ
        SSBrmgr1200WB wb1200 = null; //�����濵-�μ����� ���
        SSBrmgr1300WB wb1300 = null; //�����濵-�μ����� �μ����
        SSBrmgr1400WB wb1400 = null; //�����濵-�μ����� ��û����
        SSBrmgr1500WB wb1500 = null; //�����濵-�μ����� ��û����
        SSBrmgr1600WB wb1600 = null; //�����濵-�������μ���Ȳ
        SSBrmgr1700WB wb1700 = null; //�����濵-������������
        SSBrmgr1800WB wb1800 = null; //�����濵-����Ʈ���Է�
        SSBrmgr1900WB wb1900 = null; //�����濵-�ְ������߼۰���
        SSBrmgr2000WB wb2000 = null; //�����濵-��������ķ����
        SSBrmgr2100WB wb2100 = null;
        SSBrmgr2200WB wb2200 = null;
        SSBrmgr2300WB wb2300 = null;
        SSBrmgr2400WB wb2400 = null;
        SSBrmgr2500WB wb2500 = null;
        SSBrmgr2600WB wb2600 = null;
        SSBrmgr2700WB wb2700 = null;
        SSBrmgr2800WB wb2800 = null; //���Ͱ�������
        SSBrmgr3000WB wb3000 = null;
        SSReader1700WB wb1700rdr = null;

		/* ����ϰ��� wb ���� �и�  */
        SSBrmgr12500WB wb12500 = null; //���Ͱ���-����������-����������������
        SSBrmgr11800WB wb11800 = null; //���Ͱ���-���Է�����

        switch (pid) {
            // �����μ���Ȳ
            case SSBrmgrWBMapping.BRMGR_1000: //�����濵-�����μ���Ȳ-�ʱ�ȭ��
                wb1000 = new SSBrmgr1000WB();
                wb1000.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1000_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1010: //�����濵-�����μ���Ȳ-��ȸ(����Ʈ)
                wb1000 = new SSBrmgr1000WB();
                wb1000.selectBoqtypcondList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1010_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1020: //�����濵-�����μ���Ȳ-��ȸ(����Ʈ)
                wb1000 = new SSBrmgr1000WB();
                wb1000.selectBoqtypcondEXCEL(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1020_p.jsp";
                break;

            // ���ϸ�����Ȳ
            case SSBrmgrWBMapping.BRMGR_1100: //�����濵-���ϸ�����Ȳ-�ʱ�ȭ��
                wb1100 = new SSBrmgr1100WB();
                wb1100.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1100_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1110: //�����濵-���ϸ�����Ȳ-��ȸ(����Ʈ)
                wb1100 = new SSBrmgr1100WB();
                wb1100.selectMigllmmtclosList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1110_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1120: //�����濵-���ϸ�����Ȳ-��ȸ(����Ʈ)
                wb1100 = new SSBrmgr1100WB();
                wb1100.selectMilgpayDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1120_l.jsp";
                break;
            // �μ�����-����
            case SSBrmgrWBMapping.BRMGR_1200: //�����濵-�μ�����-������û(����)-�ʱ�ȭ��
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1200_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1210: //�����濵-�μ�����-������û(����)-��ȸ(����Ʈ)
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectQtyaplcMainNwspList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1210_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1220: //�����濵-�μ�����-������û(����)-����
                wb1200 = new SSBrmgr1200WB();
                wb1200.updateQtyaplcMainNwsp(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1220_u.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1225: //�����濵-�μ�����-������û(����)-�μ�
                wb1200 = new SSBrmgr1200WB();
                wb1200.printQtyaplcMainNwspClosList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1225_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1230: //�����濵-�μ�����-��û(����)-�ʱ�ȭ��
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1230_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1240: //�����濵-�μ�����-��û(����)-��ȸ(����Ʈ)
                wb1200 = new SSBrmgr1200WB();
                wb1200.selectQtyaplcList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1240_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1250: //�����濵-�μ�����-��û(����)-����
                wb1200 = new SSBrmgr1200WB();
                wb1200.updateQtyaplc(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1250_u.jsp";
                break;
            // �μ�����-����
            case SSBrmgrWBMapping.BRMGR_1300: //�����濵-�μ�����-������û(����)-�ʱ�ȭ��
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1300_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1310: //�����濵-�μ�����-������û(����)-��ȸ(����Ʈ)
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectQtyaplcMainNwspList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1310_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1320: //�����濵-�μ�����-������û(����)-����
                wb1300 = new SSBrmgr1300WB();
                wb1300.updateQtyaplcMainNwspClos(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1320_u.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1340: //�����濵-�μ�����-��û(����)-�ʱ�ȭ��
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1340_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1350: //�����濵-�μ�����-��û(����)-��ȸ(����Ʈ)
                wb1300 = new SSBrmgr1300WB();
                wb1300.selectQtyaplcList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1350_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1360: //�����濵-�μ�����-��û(����)-����
                wb1300 = new SSBrmgr1300WB();
                wb1300.updateQtyaplcClos(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1360_u.jsp";
                break;
            // �μ����� ��û���� �μ����
            case SSBrmgrWBMapping.BRMGR_1400: //�����濵-�μ�����-��û����(����)-�ʱ�ȭ��
                wb1400 = new SSBrmgr1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1400_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1410: //�����濵-�μ�����-��û����(����)-��ȸ
                wb1400 = new SSBrmgr1400WB();
                wb1400.selectQtyaplcVexcList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1410_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1420: //�����濵-�μ�����-��û����(����)-����
                wb1400 = new SSBrmgr1400WB();
                wb1400.updateQtyaplcVexc(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1420_u.jsp";
                break;

            // �����������
            case SSBrmgrWBMapping.BRMGR_1500: //�����濵-�����������-�ʱ�ȭ��
                wb1500 = new SSBrmgr1500WB();
                wb1500.selectCodeList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1500_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1510: //�����濵-�����������-��ȸ(����Ʈ)
                wb1500 = new SSBrmgr1500WB();
                wb1500.selectCommList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1510_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1520: //�����濵-�����������-����ȸ
                wb1500 = new SSBrmgr1500WB();
                wb1500.selectFctFrftDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1520_s.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1530: //�����濵-�����������-�Է�
                wb1500 = new SSBrmgr1500WB();
                wb1500.accessFctFrft(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1530_i.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1540: //�����濵-�����������-����
                wb1500 = new SSBrmgr1500WB();
                wb1500.accessFctFrft(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1540_u.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1550: //�����濵-�����������-����
                wb1500 = new SSBrmgr1500WB();
                wb1500.accessFctFrft(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1550_d.jsp";
                break;

            // �������μ���Ȳ
            case SSBrmgrWBMapping.BRMGR_1600: //�����濵-�������μ���Ȳ-�ʱ�ȭ��
                wb1600 = new SSBrmgr1600WB();
                wb1600.initSpQty(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1600_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1610: //�����濵-�������μ���Ȳ-���
                wb1600 = new SSBrmgr1600WB();
                wb1600.selectSpQtyList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1610_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1620: //�����濵-�������μ���Ȳ-�μ�
                wb1600 = new SSBrmgr1600WB();
                wb1600.printSpQtyExcel(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1620_p.jsp";
                break;

            // ������������
            case SSBrmgrWBMapping.BRMGR_1700: //�����濵-������������-�ʱ�ȭ��
                wb1700 = new SSBrmgr1700WB();
                wb1700.initRdrMovm(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1700_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1710: //�����濵-������������-���
                wb1700 = new SSBrmgr1700WB();
                wb1700.selectRdrMovmList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1710_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1720: //�����濵-������������-��
                wb1700 = new SSBrmgr1700WB();
                wb1700.selectRdrMovmDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1720_s.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1730: //�����濵-������������-���Ȯ��
                wb1700 = new SSBrmgr1700WB();
                wb1700.updateRdrMovm(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1730_u.jsp";
                break;

            // ����Ʈ���Է�
            case SSBrmgrWBMapping.BRMGR_1800: //�����濵-����Ʈ���Է�-�ʱ�ȭ��(����Ʈ)
                wb1800 = new SSBrmgr1800WB();
                wb1800.initApt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1800_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1805: //�����濵-����Ʈ���Է�-���(����Ʈ)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1805_l.jsp";
                break;
/*=======================================================*/
            case SSBrmgrWBMapping.BRMGR_1810: //�����濵-����Ʈ���Է�-�ʱ�ȭ��
//                wb1800 = new SSBrmgr1800WB();
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1810_a.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1815: //�����濵-����Ʈ���Է�-�ʱ�ȭ��(���Է�)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1815_a.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1820: //SLCommunWBMapping.COMMUN_2620:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectDongList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1820_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1825:  //�����濵-����Ʈ���Է�-�ּҷ� ����Ʈ�����ȸ
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1825_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1826:  //�����濵-����Ʈ���Է�-�ּҷ� ����Ʈ�����ȸ
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAddrToAptList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1826_s.jsp";
                break;


            case SSBrmgrWBMapping.BRMGR_1830: //�����濵-����Ʈ���Է�-������
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1830_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1840:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptinfo(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1840_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1841:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptQuickSearch(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1841_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1850:  //�����濵-����Ʈ���Է�-���系�� �󼼺���
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1850_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1851:  //�����濵-����Ʈ���Է�-����Ʈ���� �μ� �ʱ�ȭ��
//                wb1800 = new SSBrmgr1800WB();
//                wb1800.selectThrwDetail(req, res);
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1851_a.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1852:  //�����濵-����Ʈ���Է�-����Ʈ���� �μ�
                wb1800 = new SSBrmgr1800WB();
//                wb1800.selectThrwDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1852_t.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1853:  //�����濵-����Ʈ���Է�-����Ʈ���
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectAptAddrList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1853_l.jsp";
                break;


                //�����˻�
            case SSBrmgrWBMapping.BRMGR_1860:
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1860_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1868:
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectBoempList(req, res);
//                nextPage = "/jsp/ss/account/sl_account_1168_l.jsp";
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1868_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1870:
                wb1800 = new SSBrmgr1800WB();
                wb1800.accessThrw(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1870_a.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1880: //�����濵-����Ʈ���Է�-��ü,�����
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectMediyList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1880_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1881: //�����濵-����������-��Ȳ�˻�-����Ʈ��(���)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1881_l.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1885: //�����濵-����������-��Ȳ�˻�-����Ʈ ���������系�� ����ȸ �˾� �ʱ�ȭ��
//                wb1800 = new SSBrmgr1800WB();
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1885_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1886: //�����濵-����������-��Ȳ�˻�-����Ʈ ���������系�� ����ȸ �˾� ����
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1886_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1890: //�����濵-����Ʈ���Է�-Ȱ����Ȳ ��� �˾� �ʱ�
                wb1800 = new SSBrmgr1800WB();
                wb1800.accessActMemo(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1890_p.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1891: //�����濵-����Ʈ���Է�-���Է����
                wb1800 = new SSBrmgr1800WB();
                wb1800.calcThrwRate(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1891_s.jsp";
                break;

            case SSBrmgrWBMapping.BRMGR_1895: //�����濵-����Ʈ���Է�-Ȱ����Ȳ ��� �˾� �ʱ�
                wb1800 = new SSBrmgr1800WB();
                wb1800.accessActMemo(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1895_a.jsp";
              break;

          case SSBrmgrWBMapping.BRMGR_1896: //�����濵-����Ʈ���Է�-Ȱ����Ȳ ��� �˾� �ʱ�
              wb1800 = new SSBrmgr1800WB();
              wb1800.accessActMemo(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1896_p.jsp";
              break;


          case SSBrmgrWBMapping.BRMGR_1897: //�����濵-����Ʈ���Է�-�ʱ�ȭ��
              wb1700rdr = new SSReader1700WB();
              wb1700rdr.selectInitList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1897_a.jsp";
                break;

          case SSBrmgrWBMapping.BRMGR_1898: //�����濵-����Ʈ���Է�-�ʱ�ȭ��
              wb1700rdr = new SSReader1700WB();
//              wb1700rdr.selectInitList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1898_a.jsp";
              break;

          case SSBrmgrWBMapping.BRMGR_1899: //�����濵-����Ʈ���Է�-�ʱ�ȭ��
              wb1800 = new SSBrmgr1800WB();
              wb1800.selectResult(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1899_l.jsp";
              break;

          //�ְ����� �߼۰���
          // �������߼�ó�� �ʱ�ȭ��
           case SSBrmgrWBMapping.BRMGR_1900:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1901_a.jsp";
               break;
           // �������߼�ó�� ����Ʈ��ȸ
           case SSBrmgrWBMapping.BRMGR_1906:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1906_l.jsp";
               break;
           // �������߼�ó�� �߼۹���� ����ȸ
           case SSBrmgrWBMapping.BRMGR_1911:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectBoList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1911_l.jsp";
               break;
           // �������߼�ó�� ����Ʈ ���
           case SSBrmgrWBMapping.BRMGR_1916:
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1916_t.jsp";
               break;
           // �������߼�ó�� ����Ʈ ��ƼĿ���
           case SSBrmgrWBMapping.BRMGR_1921:
               wb1900 = new SSBrmgr1900WB();
               wb1900.printSticker(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1921_t.jsp";
               break;
           // �������߼�ó�� ��ü����� ȣ��/���� ����
           case SSBrmgrWBMapping.BRMGR_1926:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1926_s.jsp";
               break;
           // �������߼�ó�� ����Ʈ ���
           case SSBrmgrWBMapping.BRMGR_1931:
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1931_t.jsp";
               break;
           // �������߼�ó�� ���������
           case SSBrmgrWBMapping.BRMGR_1936:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1936_l.jsp";
                break;

            //���� ���� �ʱ�
           case SSBrmgrWBMapping.BRMGR_1951:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectCombolist(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1951_s.jsp";
               break;

           //���� ���� ��ȸ
           case SSBrmgrWBMapping.BRMGR_1956:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectBoReaderList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1956_l.jsp";
               break;

           //���� ���� �� ��ȸ
           case SSBrmgrWBMapping.BRMGR_1961:
               wb1900 = new SSBrmgr1900WB();
               wb1900.selectBoReaderDetail(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1961_s.jsp";
               break;

           //������ ����(������ư)
           case SSBrmgrWBMapping.BRMGR_1966:
               wb1900 = new SSBrmgr1900WB();
               wb1900.updateBoReaderInfo(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1966_u.jsp";
               break;

           //����-������ȸ ���ȭ��
           case SSBrmgrWBMapping.BRMGR_1971:
               nextPage = "/jsp/ss/brmgr/ss_brmgr_1971_t.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2000:
        	   wb1000 = new SSBrmgr1000WB();
        	   wb1000.selectInitList(req, res);
//               wb2000.selectlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2000_a.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2010:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.campinfolist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2010_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2020:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.selectlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2020_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2050:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.selectaptlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2050_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2055:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.updateaptlist(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2055_u.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2058:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.aptlistinit1(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2058_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2059:
        	   wb2000 = new SSBrmgr2000WB();
               wb2000.aptlistinit(req,res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2059_l.jsp";
               break;
/*
        // ���־���Ʈ��Ȳ
        case SSBrmgrWBMapping.BRMGR_1900: //�����濵-���־���Ʈ��Ȳ-����Ȯ����ȸ �ʱ�ȭ��
             wb1700rdr = new SSReader1700WB();
             wb1700rdr.selectInitList(req, res);
             nextPage = "/jsp/ss/brmgr/ss_brmgr_1900_a.jsp";
             break;

        case SSBrmgrWBMapping.BRMGR_1910: //�����濵-���־���Ʈ��Ȳ-����Ȯ����
             wb1900 = new SSBrmgr1900WB();
             wb1900.selectMoveinExtnList(req, res);
             nextPage = "/jsp/ss/brmgr/ss_brmgr_1910_l.jsp";
             break;

         case SSBrmgrWBMapping.BRMGR_1915: //�����濵-���־���Ʈ��Ȳ-����Ȯ����-��������
              wb1900 = new SSBrmgr1900WB();
              wb1900.selectMoveinExtnListPrint(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1915_p.jsp";
             break;

         // ���־���Ʈ �ʱ�ȭ��
         case SSBrmgrWBMapping.BRMGR_1920: //�����濵-���־���Ʈ��Ȳ-���־���Ʈ-�ʱ�ȭ��
              wb1700rdr = new SSReader1700WB();
              wb1700rdr.selectInitList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1920_a.jsp";
              break;

         // ���־���Ʈ �����ȸ
         case SSBrmgrWBMapping.BRMGR_1930: //�����濵-���־���Ʈ��Ȳ-���־���Ʈ��ȸ
              wb1900 = new SSBrmgr1900WB();
              wb1900.selectMoveinAptList(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1930_l.jsp";
              break;

        // ���־���Ʈ ��� ��������
          case SSBrmgrWBMapping.BRMGR_1935: //�����濵-���־���Ʈ��Ȳ-���־���Ʈ ��������
              wb1900 = new SSBrmgr1900WB();
              wb1900.selectMoveinAptPrint(req, res);
              nextPage = "/jsp/ss/brmgr/ss_brmgr_1935_p.jsp";
              break;
*/
/*=======================================================*/
/*
            case SSBrmgrWBMapping.BRMGR_1815: //�����濵-����Ʈ���Է�-���(���Է�)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwrtList(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1815_l.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1820: //�����濵-����Ʈ���Է�-��(���Է�)
                wb1800 = new SSBrmgr1800WB();
                wb1800.selectThrwrtDetail(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1820_s.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1825: //�����濵-����Ʈ���Է�-���(���Է�)
                wb1800 = new SSBrmgr1800WB();
                wb1800.insertThrwrt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1825_i.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1830: //�����濵-����Ʈ���Է�-����(���Է�)
                wb1800 = new SSBrmgr1800WB();
                wb1800.updateThrwrt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1830_u.jsp";
                break;
            case SSBrmgrWBMapping.BRMGR_1835: //�����濵-����Ʈ���Է�-����(���Է�)
                wb1800 = new SSBrmgr1800WB();
                wb1800.deleteThrwrt(req, res);
                nextPage = "/jsp/ss/brmgr/ss_brmgr_1835_d.jsp";
                break;
*/
           case SSBrmgrWBMapping.BRMGR_2070: //�����濵-�����μ���Ȳ-�ʱ�ȭ��
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectInitList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2070_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2075: //�����濵-�����μ���Ȳ-��ȸ(����Ʈ)
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectBoqtypcondList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2075_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2076: //�����濵-�����μ���Ȳ-��ȸ(����)
               wb1000 = new SSBrmgr1000WB();
               wb1000.selectBoqtypcondEXCEL(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2076_p.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2077: //�����濵-�����μ���Ȳ-��ȸ(��)
               wb1000 = new SSBrmgr1000WB();
               wb1000.selectBoqtypcondDetailList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2077_s.jsp";
               break;

           /*case SSBrmgrWBMapping.BRMGR_2078:
        	   System.out.println("2078servlet");
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratio(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2078_l.jsp";
               break;
           */
           case SSBrmgrWBMapping.BRMGR_2078:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratio(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2079_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2080:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAbcworkchg(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2080_l.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2081:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratiodtl(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2081_l.jsp";
               break;


           case SSBrmgrWBMapping.BRMGR_2082:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAuthratio(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2082_p.jsp";
               break;

           case SSBrmgrWBMapping.BRMGR_2083:
               wb2000 = new SSBrmgr2000WB();
               wb2000.selectAbcworkchg(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2082_p.jsp";
               break;

            // �������μ���Ȳ
           case SSBrmgrWBMapping.BRMGR_2100: //��������-������������-�ʱ�ȭ��
               wb2100 = new SSBrmgr2100WB();
               wb2100.initBoProxy(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2100_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2110: //��������-������������-��
               wb2100 = new SSBrmgr2100WB();
               wb2100.selectBoProxyList(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2110_l.jsp";
               break;

           //�������ͱ��� ����
           case SSBrmgrWBMapping.BRMGR_2200:
               wb2200 = new SSBrmgr2200WB();
               wb2200.initBrmgr2200(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2200_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2210:
               wb2200 = new SSBrmgr2200WB();
               wb2200.selectBrmgr2210(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2210_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2220:
               wb2200 = new SSBrmgr2200WB();
               wb2200.saveBrmgr2220(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2220_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2230:
               wb2200 = new SSBrmgr2200WB();
               wb2200.createBrmgr2230(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2230_u.jsp";
               break;

           //�򰡱��� ����
           case SSBrmgrWBMapping.BRMGR_2300:
               wb2300 = new SSBrmgr2300WB();
               wb2300.initBrmgr2300(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2300_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2310:
               wb2300 = new SSBrmgr2300WB();
               wb2300.selectBrmgr2310(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2310_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2320:
               wb2300 = new SSBrmgr2300WB();
               wb2300.saveBrmgr2320(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2320_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2330:
               wb2300 = new SSBrmgr2300WB();
               wb2300.createBrmgr2330(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2330_u.jsp";
               break;

           //���׼��� ��� �� ��ȸ
           case SSBrmgrWBMapping.BRMGR_2400:
               wb2400 = new SSBrmgr2400WB();
               wb2400.initBrmgr2400(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2400_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2410:
               wb2400 = new SSBrmgr2400WB();
               wb2400.selectBrmgr2410(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2410_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2420:
               wb2400 = new SSBrmgr2400WB();
               wb2400.saveBrmgr2420(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2420_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2430:
               wb2400 = new SSBrmgr2400WB();
               wb2400.createBrmgr2430(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2430_u.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2440:
               wb2400 = new SSBrmgr2400WB();
               wb2400.selectBrmgr2440(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2440_l.jsp";
               break;
           //���� ������������
           case SSBrmgrWBMapping.BRMGR_2500:
               wb2500 = new SSBrmgr2500WB();
               wb2500.initBrmgr2500(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2500_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2510:
               wb2500 = new SSBrmgr2500WB();
               wb2500.selectBrmgr2510(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2510_l.jsp";
               break;
           //���� ��� ����
           case SSBrmgrWBMapping.BRMGR_2600:
               wb2600 = new SSBrmgr2600WB();
               wb2600.initBrmgr2600(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2600_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2610:
               wb2600 = new SSBrmgr2600WB();
               wb2600.selectBrmgr2610(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2610_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2620:
               wb2600 = new SSBrmgr2600WB();
               wb2600.saveBrmgr2620(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2620_u.jsp";
               break;
             //����������
           case SSBrmgrWBMapping.BRMGR_2700:
               wb2700 = new SSBrmgr2700WB();
               wb2700.initBrmgr2700(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2700_a.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2710:
               wb2700 = new SSBrmgr2700WB();
               wb2700.selectBrmgr2710(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2710_l.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2720:
               wb2700 = new SSBrmgr2700WB();
               wb2700.selectBrmgr2720(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2720_s.jsp";
               break;
           case SSBrmgrWBMapping.BRMGR_2730:
               wb2700 = new SSBrmgr2700WB();
               wb2700.updateBrmgr2730(req, res);
               nextPage = "/jsp/ss/brmgr/ss_brmgr_2730_u.jsp";
               break;

           //���Ͱ�������
           case SSBrmgrWBMapping.BRMGR_2850:
        	   	wb2800 = new SSBrmgr2800WB();
        	   	wb2800.ss_sls_brmgr_2850_m(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_2850_m.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_2851:
				wb2800 = new SSBrmgr2800WB();
				wb2800.ss_sls_brmgr_2851_l(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_2851_l.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_2852:
				wb2800 = new SSBrmgr2800WB();
				wb2800.ss_sls_brmgr_2852_s(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_2852_s.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3000:
				wb3000 = new SSBrmgr3000WB();
				wb3000.initBrmgr3000(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3000_m.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3010:
				wb3000 = new SSBrmgr3000WB();
				wb3000.selectBrmgr3010(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3010_l.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3020:
				wb3000 = new SSBrmgr3000WB();
				wb3000.createBrmgr3020(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3020_i.jsp";
				break;
			case SSBrmgrWBMapping.BRMGR_3030:
				wb3000 = new SSBrmgr3000WB();
				wb3000.updateBrmgr3030(req, res);
				nextPage = "/jsp/ss/brmgr/ss_brmgr_3030_u.jsp";
				break;


/*******************************************����Ͽ�******************************************************************/
           //���Ͱ���-���Է�����-��Ȳ���
           case SSBrmgrWBMapping.BRMGR_11810: //����Ʈ�ּ��ڵ帮��Ʈ =commun_12600(agency)_����Ͽ�
             wb11800 = new SSBrmgr11800WB();
             wb11800.mo_selectThrwList(req, res);
             nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11810_a.jsp";
             break;
           case SSBrmgrWBMapping.BRMGR_11820: //����Ʈ������Ʈ =basic_11430(agency)_����Ͽ�
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectDtladdrList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11820_l.jsp";
        	   break;
           case SSBrmgrWBMapping.BRMGR_11830: //���ī��(�ش缾���� ����Ʈ ������Ȳ ��ȸ) =commun_12635(agency)_����Ͽ�
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectAptdlvList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11830_l.jsp";
        	   break;

        	 //���Է�����
           case SSBrmgrWBMapping.BRMGR_11850: //����Ʈ���¸���Ʈ �� ���Է�����Ʈ =commun_12631(agency)_����Ͽ�
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectAptrchList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11850_l.jsp";
        	   break;
           case SSBrmgrWBMapping.BRMGR_11870: //���Է����� ���� =commun_12651(agency)_����Ͽ�
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_accessThrw(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11870_i.jsp";
        	   break;

           case SSBrmgrWBMapping.BRMGR_11880: //����Ʈ���� �� ��ü,����Ʈ =commun_12632(agency)_����Ͽ�
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectAptinfoList(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11880_l.jsp";
        	   break;
           case SSBrmgrWBMapping.BRMGR_11890: //���Ͱ���-���Է�����-��Ȳ�˻�_����Ͽ�
        	   wb11800 = new SSBrmgr11800WB();
        	   wb11800.mo_selectThrwResult(req, res);
        	   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_11890_l.jsp";
        	   break;


               //���� ������������
               case SSBrmgrWBMapping.BRMGR_12510: //Ȯ��μ�_����Ͽ�
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2510(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12510_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12511: //�μ���Ȳ_����Ͽ�
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2511(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12511_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12512: //����_����Ͽ�
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2512(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12512_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12513: //���������_����Ͽ�
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2513(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12513_l.jsp";
                   break;
               case SSBrmgrWBMapping.BRMGR_12514: //���ܸ����Ÿ_����Ͽ�
                   wb12500 = new SSBrmgr12500WB();
                   wb12500.mo_selectBrmgr2514(req, res);
                   nextPage = "/jsp/ss/brmgr/mo_ss_brmgr_12514_l.jsp";
                   break;


            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
