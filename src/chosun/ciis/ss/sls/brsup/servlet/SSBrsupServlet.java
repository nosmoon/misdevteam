/***************************************************************************************************
 * ���ϸ� : SSBrsupServlet.java
 * ��� : �������� ����
 * �ۼ����� : 2004-01-20
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.util.Util;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.SS_SLS_BRSUP_1799_LALLSTR2Record;
import chosun.ciis.ss.sls.brsup.rec.SS_U_PROCAUTOTRASALLSTRRecord;
import chosun.ciis.ss.sls.brsup.wb.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;

/**
 * �Ǹű� �������� �������� Servlet//
 */

public class SSBrsupServlet extends ChosunServlet {

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
    d * @throws ServletException;;
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/brsup/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSMoveServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSMoveServlet : process : nextPage : " + nextPage);
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

        if(nextPage != null && nextPage.length() > 0){
          RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
          rd.forward(req, res);
        }
    }

    /**
     * SSMoveWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        SSBrsup1000WB wb1000 = null; //��������-�Ź�������ǰ-���,�԰�,��û
        SSBrsup1100WB wb1100 = null; //��������-�Ź�������ǰ-�߼�,���
        SSBrsup1200WB wb1200 = null; //��������-�Ź�������ǰ-����,���
        SSBrsup1300WB wb1300 = null; //��������-���غ���-���,�űԽ�û,�����û
        SSBrsup1400WB wb1400 = null; //��������-���غ���-����,���
        SSBrsup1500WB wb1500 = null; //��������-���غ���-���,�����,������Ȳ
        SSBrsup1600WB wb1600 = null; //��������-����-����EDI��������
        SSBrsup1700WB wb1700 = null; //��������-����-�ڵ���ü-�����ڰ���
        SSBrsup2200WB wb2200 = null; //��������-����-�ڵ���ü-�����ڰ���2
        SSBrsup1800WB wb1800 = null; //��������-����-����������-����

        SSBrsup2000WB wb2000 = null; //��������-���˿��
        SSBrsup2100WB wb2100 = null; //��������-��ǻ��A/S
        SSBrsup2400WB wb2400 = null; //��������-�ְ���������
        SSBrsup2500WB wb2500 = null; //�������������ý���-���˹�������
        SSBrsup2600WB wb2600 = null; //��������_����-�ڵ���ü-��ü��û����
        SSBrsup2700WB wb2700 = null; //��������-����-����������
        SSBrsup2800WB wb2800 = null; //��������-������Ȳ-�������-13��������
        SSBrsup2900WB wb2900 = null; //��������-������Ȳ-�������-�������������,�������������
        SSBrsup3000WB wb3000 = null; //��������-����-��������̷�

        SSReader1700WB wb1700rdr = null;

        switch (pid) {
            // ��������-�Ź�������ǰ-���
            case SSBrsupWBMapping.BRSUP_1000: //��������-�Ź�������ǰ-���-�ʱ�ȭ��
                wb1000 = new SSBrsup1000WB();
                wb1000.initNwspItem(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1000_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1005: //��������-�Ź�������ǰ-��ǰ-���
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemClsfList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1005_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1010: //��������-�Ź�������ǰ-���-���
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1010_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1015: //��������-�Ź�������ǰ-���-��
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1015_s.jsp";
                break;

            // ������ ����
            case SSBrsupWBMapping.BRSUP_1016: //��������-�Ź�������ǰ-���-��
            	boolean is = false;
                wb1000 = new SSBrsup1000WB();
                wb1000.selectThunbnail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1016_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1017: //��������-�Ź�������ǰ-���-��
                wb1000 = new SSBrsup1000WB();
                wb1000.selectpopup(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1017_s.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_1020: //��������-�Ź�������ǰ-���-����
                wb1000 = new SSBrsup1000WB();
                wb1000.updateNwspItem(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1020_u.jsp";
                break;

                // ��������-�Ź�������ǰ-�԰�
            case SSBrsupWBMapping.BRSUP_1025: //��������-�Ź�������ǰ-�԰�-�ʱ�ȭ��
                wb1000 = new SSBrsup1000WB();
                wb1000.initNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1025_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1030: //��������-�Ź�������ǰ-�԰�-���
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemEwhList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1030_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1035: //��������-�Ź�������ǰ-�԰�-��
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemEwhDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1035_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1040: //��������-�Ź�������ǰ-�԰�-���
                wb1000 = new SSBrsup1000WB();
                wb1000.insertNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1040_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1045: //��������-�Ź�������ǰ-�԰�-����
                wb1000 = new SSBrsup1000WB();
                wb1000.updateNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1045_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1050: //��������-�Ź�������ǰ-�԰�-����
                wb1000 = new SSBrsup1000WB();
                wb1000.deleteNwspItemEwh(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1050_d.jsp";
                break;

                // ��������-�Ź�������ǰ-��û
            case SSBrsupWBMapping.BRSUP_1055: //��������-�Ź�������ǰ-��û-�ʱ�ȭ��
                wb1000 = new SSBrsup1000WB();
                wb1000.initNwspItemAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1055_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1060: //��������-�Ź�������ǰ-��û-���
                wb1000 = new SSBrsup1000WB();
                wb1000.selectNwspItemAplcList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1060_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1065: //��������-�Ź�������ǰ-��û-����
                wb1000 = new SSBrsup1000WB();
                wb1000.updateNwspItemAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1065_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1070: //��������-�Ź�������ǰ-��û-�μ�
                wb1000 = new SSBrsup1000WB();
                wb1000.printNwspItemList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1070_p.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1075: //��������-�Ź�������ǰ-��û-�����
                wb1000 = new SSBrsup1000WB();
                wb1000.outNwspItemList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1075_i.jsp";
                break;

                // ��������-�Ź�������ǰ-�߼�
            case SSBrsupWBMapping.BRSUP_1100: //��������-�Ź�������ǰ-�߼�-�ʱ�ȭ��
                wb1100 = new SSBrsup1100WB();
                wb1100.initNwspItemSend(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1100_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1105: //��������-�Ź�������ǰ-�߼�-���
                wb1100 = new SSBrsup1100WB();
                wb1100.selectNwspItemSendList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1105_l.jsp";
                break;

                // ��������-�Ź�������ǰ-���
            case SSBrsupWBMapping.BRSUP_1110: //��������-�Ź�������ǰ-���-�ʱ�ȭ��
                wb1100 = new SSBrsup1100WB();
                wb1100.initNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1110_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1115: //��������-�Ź�������ǰ-���-���
                wb1100 = new SSBrsup1100WB();
                wb1100.selectNwspItemAccdList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1115_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1120: //��������-�Ź�������ǰ-���-��
                wb1100 = new SSBrsup1100WB();
                wb1100.selectNwspItemAccdDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1120_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1125: //��������-�Ź�������ǰ-���-���
                wb1100 = new SSBrsup1100WB();
                wb1100.insertNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1125_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1130: //��������-�Ź�������ǰ-���-����
                wb1100 = new SSBrsup1100WB();
                wb1100.updateNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1130_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1135: //��������-�Ź�������ǰ-���-����
                wb1100 = new SSBrsup1100WB();
                wb1100.deleteNwspItemAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1135_d.jsp";
                break;

                // ��������-�Ź�������ǰ-����
            case SSBrsupWBMapping.BRSUP_1200: //��������-�Ź�������ǰ-����-�ʱ�ȭ��
                // �Ź�������ǰ ���� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/brsup/ss_brsup_1200_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1205: //��������-�Ź�������ǰ-����-���
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1205_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1210: //��������-�Ź�������ǰ-����-��
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1210_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1215: //��������-�Ź�������ǰ-����-�űԵ��
                wb1200 = new SSBrsup1200WB();
                wb1200.insertNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1215_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1220: //��������-�Ź�������ǰ-����-����
                wb1200 = new SSBrsup1200WB();
                wb1200.updateNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1220_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1225: //��������-�Ź�������ǰ-����-����
                wb1200 = new SSBrsup1200WB();
                wb1200.deleteNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1225_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1230: //��������-�Ź�������ǰ-����-����
                wb1200 = new SSBrsup1200WB();
                wb1200.closeNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1230_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1235: //��������-�Ź�������ǰ-����-���� ���
                wb1200 = new SSBrsup1200WB();
                wb1200.closeCancelNwspitemCost(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1235_a.jsp";
                break;

                // ��������-�Ź�������ǰ-���
            case SSBrsupWBMapping.BRSUP_1240: //��������-�Ź�������ǰ-���(�������)-�ʱ�ȭ��
                wb1200 = new SSBrsup1200WB();
                wb1200.nwspitemCostBusnInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1240_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1245: //��������-�Ź�������ǰ-���(�������)-���
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostBusnList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1245_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1250: //��������-�Ź�������ǰ-���(�������)-�󼼸��
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostBusnDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1250_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1255: //��������-�Ź�������ǰ-���(�������)-����(���)
                wb1200 = new SSBrsup1200WB();
                wb1200.insertNwspitemCostBusn(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1255_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1260: //��������-�Ź�������ǰ-���(�������)-�ʱ�ȭ��
                wb1200 = new SSBrsup1200WB();
                wb1200.nwspitemCostSplyInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1260_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1265: //��������-�Ź�������ǰ-���(�������)-���
                wb1200 = new SSBrsup1200WB();
                wb1200.selectNwspitemCostSplyList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1265_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1270: //��������-�Ź�������ǰ-���(�������)-����(����)
                wb1200 = new SSBrsup1200WB();
                wb1200.updateNwspitemCostSply(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1270_u.jsp";
                break;

                // ��������-���غ���-���
            case SSBrsupWBMapping.BRSUP_1300: //��������-���غ���-���-�ʱ�ȭ��

                // ���غ��� ��� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/brsup/ss_brsup_1300_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1305: //��������-���غ���-���-���
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1305_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1310: //��������-���غ���-���-��
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1310_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1315: //��������-���غ���-���-���
                wb1300 = new SSBrsup1300WB();
                wb1300.insertInsr(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1315_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1320: //��������-���غ���-���-����
                wb1300 = new SSBrsup1300WB();
                wb1300.updateInsr(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1320_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1325: //��������-���غ���-���-����
                wb1300 = new SSBrsup1300WB();
                wb1300.deleteInsr(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1325_d.jsp";
                break;

                // ��������-���غ���-��û
            case SSBrsupWBMapping.BRSUP_1330: //��������-���غ���-��û-�ʱ�ȭ��
                wb1300 = new SSBrsup1300WB();
                wb1300.initInsrAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1330_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1335: //��������-���غ���-��û-���
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrAplcList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1335_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1345: //��������-���غ���-��û-����(����)
                wb1300 = new SSBrsup1300WB();
                wb1300.updateInsrAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1345_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1350: //��������-���غ���-��û-�󼼸��`
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrAplcDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1350_l.jsp";
                break;

                // ��������-���غ���-����
            case SSBrsupWBMapping.BRSUP_1355: //��������-���غ���-����-�ʱ�ȭ��
                wb1300 = new SSBrsup1300WB();
                wb1300.initInsrChg(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1355_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1360: //��������-���غ���-����-���
                wb1300 = new SSBrsup1300WB();
                wb1300.selectInsrChgList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1360_l.jsp";
                break;

                // ��������-���غ���-����
            case SSBrsupWBMapping.BRSUP_1400: //��������-���غ���-����-�ʱ�ȭ��

                // ���غ��� ���� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/brsup/ss_brsup_1400_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1405: //��������-���غ���-����-���
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrClosList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1405_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1410: //��������-���غ���-����-��
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrClosDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1410_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1415: //��������-���غ���-����-�űԵ��
                wb1400 = new SSBrsup1400WB();
                wb1400.insertInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1415_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1420: //��������-���غ���-����-����
                wb1400 = new SSBrsup1400WB();
                wb1400.updateInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1420_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1425: //��������-���غ���-����-����
                wb1400 = new SSBrsup1400WB();
                wb1400.deleteInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1425_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1427: //��������-���غ���-����-����
                wb1400 = new SSBrsup1400WB();
                wb1400.closeInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1427_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1430: //��������-���غ���-����-���� ���
                wb1400 = new SSBrsup1400WB();
                wb1400.closeCancelInsrClos(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1430_a.jsp";
                break;

                // ��������-���غ���-���
            case SSBrsupWBMapping.BRSUP_1435: //��������-���غ���-���(�������)-�ʱ�ȭ��
                wb1400 = new SSBrsup1400WB();
                wb1400.insrCostBusnInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1435_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1440: //��������-���غ���-���(�������)-���
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrCostBusnList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1440_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1445: //��������-���غ���-���(�������)-�󼼸��
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrCostBusnDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1445_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1450: //��������-���غ���-���(�������)-����(���)
                wb1400 = new SSBrsup1400WB();
                wb1400.insertInsrCostBusn(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1450_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1455: //��������-���غ���-���(�������)-�ʱ�ȭ��
                wb1400 = new SSBrsup1400WB();
                wb1400.insrCostSplyInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1455_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1460: //��������-���غ���-���(�������)-���
                wb1400 = new SSBrsup1400WB();
                wb1400.selectInsrCostSplyList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1460_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1465: //��������-���غ���-���(�������)-����(����)
                wb1400 = new SSBrsup1400WB();
                wb1400.updateInsrCostSply(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1465_u.jsp";
                break;

                // ��������-���غ���-���
            case SSBrsupWBMapping.BRSUP_1500: //��������-���غ���-���-�ʱ�ȭ��
                wb1500 = new SSBrsup1500WB();
                wb1500.initInsrAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1500_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1505: //��������-���غ���-���-���
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAccdList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1505_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1510: //��������-���غ���-���-��
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAccdDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1510_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1515: //��������-���غ���-���-����(����)
                wb1500 = new SSBrsup1500WB();
                wb1500.updateInsrAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1515_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1520: //��������-���غ���-���-����
                wb1500 = new SSBrsup1500WB();
                wb1500.deleteInsrAccd(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1520_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1525: //��������-���غ���-���-�μ�
                // �μ�� �󼼿� ������ ó���� �����ϰ� jsp�� �ٸ��� ó���Ѵ�.
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAccdDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1525_p.jsp";
                break;

                // ��������-���غ���-�����
            case SSBrsupWBMapping.BRSUP_1530: //��������-���غ���-�����-�ʱ�ȭ��
                wb1500 = new SSBrsup1500WB();
                wb1500.initInsrAmt(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1530_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1535: //��������-���غ���-�����-���
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrAmtList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1535_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1540: //��������-���غ���-�����-����(����)
                wb1500 = new SSBrsup1500WB();
                wb1500.updateInsrAmt(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1540_u.jsp";
                break;

                // ��������-���غ���-������Ȳ
            case SSBrsupWBMapping.BRSUP_1545: //��������-���غ���-������Ȳ-�ʱ�ȭ��
                wb1500 = new SSBrsup1500WB();
                wb1500.initInsrStcs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1545_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1550: //��������-���غ���-������Ȳ-���
                wb1500 = new SSBrsup1500WB();
                wb1500.selectInsrStcsList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1550_l.jsp";
                break;

             // ��������-����-���ϼۼ���
            case SSBrsupWBMapping.BRSUP_1900: //��������-����-���ϼۼ���-����EDI-�ʱ�ȭ��
                wb1600 = new SSBrsup1600WB();
                //wb1600.selectEDIInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1900_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1901: //��������-����-���ϼۼ���-����EDI-���Ͼ��ε�
                wb1600 = new SSBrsup1600WB();
                wb1600.ediUpload(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1901_a.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_1910: //��������-����-���ϼۼ���-CD/ATM-�ʱ�ȭ��
                wb1600 = new SSBrsup1600WB();
                wb1600.selectEDIInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1910_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1920: //��������-����-���ϼۼ���-�ڵ���ü-�ʱ�ȭ��
                wb1600 = new SSBrsup1600WB();
                wb1600.selectEDIInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1920_a.jsp";
                break;

                // ��������-����-����EDI��������
              case SSBrsupWBMapping.BRSUP_1600: //��������-����-����EDI��������-�ʱ�ȭ��
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectEDIInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1600_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1605: //��������-����-����EDI��������-���������Ȳ ��ȸ
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectEDIRecp(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1605_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1610: //��������-����-����EDI��������-����EDI ������� �����ȸ
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectRecpCatl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1610_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1615: //��������-����-����EDI��������-����EDI �Ա�ó����� �����ȸ
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectRcpmCatl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1615_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1620: //��������-����-����EDI��������-����EDI Reject�����ȸ
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectRejectList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1620_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1625: //��������-����-����EDI��������-����EDI Reject����
                  wb1600 = new SSBrsup1600WB();
                  wb1600.updateEDIReject(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1625_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1630: //��������-����-����EDI��������-����EDI ����
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectGiroRecp(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1630_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1635: //��������-����-����EDI��������-����EDI �Ա�ó����� ����μ�
                  nextPage = "/jsp/ss/brsup/ss_brsup_1635_p.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1640: //��������-����-����EDI��������-����EDI �Աݹݿ�
                    wb1600 = new SSBrsup1600WB();
                  wb1600.updateRcpmrfl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1640_u.jsp";
                  break;


              case SSBrsupWBMapping.BRSUP_1645: //��������-����-����EDI��������-����EDI �Աݹݿ�
                  wb1600 = new SSBrsup1600WB();
                  wb1600.loadEDIfile(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1645_l.jsp";
                  break;

              // ��������-����_�ڵ���ü-���γ���
              case SSBrsupWBMapping.BRSUP_1700: //��������-����-�ڵ���ü-���γ��� �ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1700_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1710: //��������-����-�ڵ���ü-���γ��� �����ڸ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1710_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1720: //��������-����-�ڵ���ü-���γ��� ���ΰ����
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtCntrList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1720_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1730: //��������-����-�ڵ���ü-���γ��� ���γ������
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtPtcrList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1730_l.jsp";
                  break;

              // ��������-����_�ڵ���ü-��û����
              case SSBrsupWBMapping.BRSUP_1740: //��������-����_�ڵ���ü-��û����-�ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcMangInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1740_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1741: //��������-����_�ڵ���ü-��û����-��û���
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcSsumList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1741_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1742: //��������-����_�ڵ���ü-��û����-��û���
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1742_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1743: //��������-����_�ڵ���ü-��û����-������(����)����
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcDetail(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1743_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1744: //��������-����_�ڵ���ü-��û����-������(����)��������
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateAplcInfo(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1744_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1745: //��������-����_�ڵ���ü-��û����-���ں� ��ü����Ʈ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectMediList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1745_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1746: //��������-����_�ڵ���ü-��û����-��ûȮ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1746_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1747: //��������-����_�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  nextPage = "/jsp/ss/brsup/ss_brsup_1747_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1748: //��������-����_�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcNew(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1748_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1749: //��������-����_�ڵ���ü-��û����-��û�Է�
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertAutoShiftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1749_i.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1750: //��������-����_�ڵ���ü-��û����-�ڵ���ü������û �ʱ�ȭ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpy(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1750_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1751: //��������-����_�ڵ���ü-��û����-�ڵ���ü ������û����� �󼼺���
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcDetail2(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1751_s.jsp";
                  break;

              case SSBrsupWBMapping.BRSUP_1752: //��������-����_�ڵ���ü-��û����-�ڵ���ü��û �۽�
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertShftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1752_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1753: //��������-����_�ڵ���ü-��û����-�ڵ���ü��û ����
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateShftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1753_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1754: //��������-����_�ڵ���ü-��û����-ī������
                  nextPage = "/jsp/ss/brsup/ss_brsup_1754_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1755: //��������-����_�ڵ���ü-��û����-��ü�����ȯ �ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpy(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1755_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1756: //��������-����_�ڵ���ü-��û����-��ü�����ȯ �󼼺���
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcDetail2(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1756_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1757: //��������-����_�ڵ���ü-��û����-��ü�����ȯ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateShftMthd(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1757_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1758: //��������-����_�ڵ���ü-û�����-�Ա�ó��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.updateRcpmrfl(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1758_u.jsp";
                  break;


              // ��������-����_�ڵ���ü-�����ڰ���
              case SSBrsupWBMapping.BRSUP_1760: //�ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftPymtInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1760_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1761: //�����ڸ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftPymtList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1761_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1762: //�����ڻ�
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftPymtDetail(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1762_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1763: //��������������
                  wb1700 = new SSBrsup1700WB();
                  if("2".equals(req.getParameter("cnfm"))) {	// ��ü��û ��Ȯ�ΰǿ� ���ؼ�
                  	wb1700.updatePymtInfo2(req, res);
                  } else {
                  	wb1700.updatePymtInfo(req, res);
                  }
                  nextPage = "/jsp/ss/brsup/ss_brsup_1763_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1764: //�ڵ���ü�ű�/������û
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertPymtShftAplc(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1764_i.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1765: //���ݳ�����ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtClamtList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1765_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1766: //û��������ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtClamOcomList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1766_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1767: //���������� �α׳���
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtLogList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1767_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1768: //���ΰ�� �α׳���
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtCntrLogList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1768_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1769: //�ű�/�������� �����ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectPymtShftAplcList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1769_l.jsp";
                  break;

              // ��������-����_�ڵ���ü-û���������
              case SSBrsupWBMapping.BRSUP_1770: //�ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcMangInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1770_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1771: //������û��������
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectClamList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1771_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1772: //�ڵ���üû�������ϰ˻�
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectClamOcomList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1772_l.jsp";
                  break;

              // ��������-����_�ڵ���ü-û������
              case SSBrsupWBMapping.BRSUP_1775: //�ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  //wb1700.selectAplcMangInit(req, res);
                  wb1700.selectAplcClamInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1775_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1776: //��ü���к� û�����
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftClamSsum(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1776_s.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1777: //������ û�����
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectShftClamList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1777_l.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1778: //û������
                  wb1700 = new SSBrsup1700WB();
                  wb1700.insertShftClam(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1778_i.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1779: //û���۽�
                  wb1700 = new SSBrsup1700WB();
                  wb1700.sendShftClam(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1779_u.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1780: //û������
                  wb1700 = new SSBrsup1700WB();
                  wb1700.receiveShftClam(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1780_u.jsp";
                  break;

              // ��������-����_�ڵ���ü-��û���
              case SSBrsupWBMapping.BRSUP_1785: //�ʱ�ȭ��
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcMangInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1785_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1786: //�����ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcStcsList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1786_l.jsp";
                  break;

              // ��������-����_�ڵ���ü-��ûȮ�����
              case SSBrsupWBMapping.BRSUP_1787: //�ʱ�ȭ��
                  wb1600 = new SSBrsup1600WB();
                  wb1600.selectEDIInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1787_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1788: //�����ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcCnfmStcsList(req, res);
                  if("N".equals(req.getParameter("excelyn"))) {
                  	nextPage = "/jsp/ss/brsup/ss_brsup_1788_l.jsp";
                  } else if("Y".equals(req.getParameter("excelyn"))) {	// �����ٿ�ε��� ���
                  	nextPage = "/jsp/ss/brsup/ss_brsup_1789_l.jsp";
                  }
                  break;

              // ��������-����_�ڵ���ü-��û/�������
              case SSBrsupWBMapping.BRSUP_1790: //�ʱ�ȭ��
                    wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpyStcsInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1790_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1791: //�����ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectAplcExpyStcsList(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1791_l.jsp";
                  break;

              // ��������-����_�ڵ���ü-��������
              case SSBrsupWBMapping.BRSUP_1795: //�ʱ�ȭ��
                    wb1700 = new SSBrsup1700WB();
                  wb1700.selectExpyRdrInit(req, res);
                  nextPage = "/jsp/ss/brsup/ss_brsup_1795_a.jsp";
                  break;
              case SSBrsupWBMapping.BRSUP_1796: //�����ȸ
                  wb1700 = new SSBrsup1700WB();
                  wb1700.selectExpyRdrList(req, res);
                  if("N".equals(req.getParameter("excelyn"))) {
                    nextPage = "/jsp/ss/brsup/ss_brsup_1796_l.jsp";
                  } else if("Y".equals(req.getParameter("excelyn"))) {	// �����ٿ�ε��� ���
                    nextPage = "/jsp/ss/brsup/ss_brsup_1797_l.jsp";
                  }
                  break;

              // ��������-����_�ڵ���ü-��������
              case SSBrsupWBMapping.BRSUP_1798:

            	  String path=req.getRealPath("/aplc_upload/");    //���ε�Ǵ� ��ġ ����

            	  wb1700 = new SSBrsup1700WB();
            	  System.out.println("==========Servlet1=========");
                  wb1700.procAutoTrans(req, res);
                  //return "";

                  SS_U_PROCAUTOTRASDataSet ds = (SS_U_PROCAUTOTRASDataSet) req.getAttribute("ds");
                  StringBuffer sb = new StringBuffer();
                  System.out.println("==========Servlet2========= SB : " + sb.toString());
                  int size = ds.allstr.size();
                  System.out.println("==========Servlet2.0========= SIZE : " + size);
	          	  for(int i=0; i<size; i++){
	          		SS_U_PROCAUTOTRASALLSTRRecord rec = (SS_U_PROCAUTOTRASALLSTRRecord) ds.allstr.get(i);
	          		sb.append(rec.getAllstr());
	          	  }
	          	  System.out.println("==========Servlet2.1=========");
	              java.io.OutputStream os = null;
	              System.out.println("==========Servlet2.2=========");
	              FileWriter fw = null;
	              System.out.println("==========Servlet3=========");
	              try{
	            	  //File rfile = new File(path,"GW82903116153" + Util.getDate().substring(4));
		          	  //fw = new FileWriter(rfile);

		          	  //fw.write(sb.toString()+ "We are the ~");

		          	  //fw.flush();
		          	  //fw.close();
		          	  //fw = null;

		          	  //System.out.println("===========file.length============" + rfile.length());
		          	  //System.out.println("===========path============" + rfile.getAbsolutePath());

		          	  // make file
	            	  //res.reset();

		          	  res.setContentType("application/octet-stream");
		              res.setHeader("Content-Disposition","attachment; filename=" + "GW82903116153" + Util.getDate().substring(4));
		              //res.setHeader("Content-Length", Long.toString(sb.toString().getBytes().length));
		              res.setContentLength(sb.toString().getBytes().length);

	            	  os = res.getOutputStream();
		              os.write(sb.toString().getBytes());
		              //os.write(sb.toString().getBytes() , 0, sb.toString().getBytes().length);
		              os.flush();
		              //os.close();
		              //os = null;
	              } catch(Exception e) {
	            	  System.out.println("########"+e.toString());
	            	  e.printStackTrace();

	              } finally {
	            	  //java.io.File file = new java.io.File(path + "/" + "GW82903116153" + "0830");
            		  try{
            			  if(fw != null){
            				  fw.close();
            				  fw = null;
            			  }
            			  /*if(os != null)os.close();*/
	            		}catch(Exception e){}
	              }

                  //nextPage = "/jsp/ss/brsup/ss_brsup_1798_l.jsp";
                  break;

            case SSBrsupWBMapping.BRSUP_1799: //�ʱ�ȭ��
                wb1700 = new SSBrsup1700WB();
                wb1700.createBrsup1799(req, res);

                System.out.println("Hello Universe!");

        		try{

        			res.setContentType("application/octet-stream");
		            res.setHeader("Content-Disposition","attachment; filename=" + "GE123116153"+Util.getDate().substring(4));
		            //res.setContentLength(tot_size+1024);

        			int tot_size = 0;
        			int tot_block_cnt = 0;
        			//String resPath = "C:/work/ciis_chosun_com/applications/mainWebApp/ge12/";
        			//String resFile = resPath+"GE123116153"+Util.getDate().substring(4);

        			BufferedOutputStream fos = new BufferedOutputStream(res.getOutputStream());

        			SS_SLS_BRSUP_1799_LDataSet ds2 = (SS_SLS_BRSUP_1799_LDataSet) req.getAttribute("ds");

        			System.out.println("header length() : "+ds2.getHeaderstr().length());//+filler_header.length));

        			fos.write(ds2.getHeaderstr().getBytes());
        			/*
        			byte filler_header[] = new byte[974];
        			fos.write(filler_header);
        			*/

        			tot_size = tot_size + ds2.getHeaderstr().length(); //+filler_header.length;

        			//String dirPath = "C:/work/agency_new/www/recfile/";
        			//String dirPath = "/webstore/pub/ciis/webapps/recfile/";
        	        String dirPath = "/webstore/pub/ciis/recfile/";
        			String fileName;
        			File file;
        			FileInputStream fis = null;

        			for(int j=0; j<ds2.allstr2.size(); j++){
                		SS_SLS_BRSUP_1799_LALLSTR2Record rec = (SS_SLS_BRSUP_1799_LALLSTR2Record) ds2.allstr2.get(j);

                		fos.write(rec.datastr.getBytes());

                		fileName = dirPath+rec.recfilenm;
                		file = new File(fileName);
            			fis = new FileInputStream(file);

            			byte b[] = new byte[(int)file.length()];
            			int len = 0;

            			while((len=fis.read(b)) != -1){
            				fos.write(b,0,len);
            			}
            			/*
            			byte filler_b[] = new byte[1024-((rec.datastr.length()+b.length)%1024)];
            			fos.write(filler_b);
            			*/

            			fos.write(rec.filler.getBytes());

            			tot_size = tot_size + rec.datastr.length() + b.length + rec.filler.length();

            			System.out.println("rec.datastr.length() : "+rec.datastr.length());
            			System.out.println("b.length : "+b.length);
            			System.out.println("rec.filler.length() : "+rec.filler.length());

            			System.out.println("data length() : "+(rec.datastr.length() + b.length + rec.filler.length()));
                	}

        			tot_block_cnt = (tot_size / 1024) - 1;
        			String tot_block_cnt_S = String.valueOf(tot_block_cnt);

        			byte[] b2 = tot_block_cnt_S.getBytes();
        	        int len = b2.length;

        	        int tmp = 10 - len;

        	        for (int i=0; i < tmp ; i++){
        	        	tot_block_cnt_S = "0" + tot_block_cnt_S;
        	        }

        			fos.write(ds2.getTailstr().getBytes());
        			System.out.println("ds2.getTailstr() : "+ds2.getTailstr());
        			fos.write(tot_block_cnt_S.getBytes());
        			System.out.println("tot_block_cnt_S : "+tot_block_cnt_S);
        			fos.write(ds2.getTail_filler().getBytes());
        			System.out.println("ds2.getTail_filler() : "+ds2.getTail_filler());
        			/*
        			byte filter_tail[] = new byte[972];
        			fos.write(filler_tail);
        			*/
        			//System.out.println("tail length() : "+ds2.getTailstr().length()+tot_block_cnt_S.length()+ds2.getTail_filler().length());//+filler_tail.length));

        			fos.flush();

        			fis.close();
        			fos.close();

        		}catch(Exception e){
        			e.printStackTrace();
        			System.out.println("File create Failed!");
        		}

                break;
            // ��������-����-�������������
            case SSBrsupWBMapping.BRSUP_1800: //��������-����-����������-����-�ʱ�ȭ��
                wb1800 = new SSBrsup1800WB();
                wb1800.initRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1800_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1805: //��������-����-����������-����-���
                wb1800 = new SSBrsup1800WB();
                wb1800.selectRcpcmsbsList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1805_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1810: //��������-����-����������-����-��
                wb1800 = new SSBrsup1800WB();
                wb1800.selectRcpcmsbsDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1810_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1815: //��������-����-����������-����-���
                wb1800 = new SSBrsup1800WB();
                wb1800.insertRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1815_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1820: //��������-����-����������-����-����
                wb1800 = new SSBrsup1800WB();
                wb1800.updateRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1820_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1825: //��������-����-����������-����-����
                wb1800 = new SSBrsup1800WB();
                wb1800.deleteRcpcmsbs(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1825_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1830: //��������-����-����������-����-�ʱ�ȭ��
                nextPage = "/jsp/ss/brsup/ss_brsup_1830_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1835: //��������-����-����������-����-���
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCloseList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1835_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1840: //��������-����-����������-����-��
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCloseDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1840_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1845: //��������-����-����������-����-���
                wb1800 = new SSBrsup1800WB();
                wb1800.insertClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1845_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1850: //��������-����-����������-����-����
                wb1800 = new SSBrsup1800WB();
                wb1800.updateClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1850_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1855: //��������-����-����������-����-����
                wb1800 = new SSBrsup1800WB();
                wb1800.deleteClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1855_d.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1860: //��������-����-����������-����-����
                wb1800 = new SSBrsup1800WB();
                wb1800.executeClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1860_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1865: //��������-����-����������-����-�������
                wb1800 = new SSBrsup1800WB();
                wb1800.cancelClose(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1865_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1870: //��������-����-����������-��Ȳ-�ʱ�ȭ��
                wb1800 = new SSBrsup1800WB();
                wb1800.initRcp(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1870_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1875: //��������-����-����������-��Ȳ-���
                wb1800 = new SSBrsup1800WB();
                wb1800.selectRcpList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1875_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1880: //��������-����-���� ������Ȳ-�ʱ�ȭ��
                wb1800 = new SSBrsup1800WB();
                wb1800.selectGiroRecpInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1880_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1885: //��������-����-���� ������Ȳ-�����ȸ
                wb1800 = new SSBrsup1800WB();
                wb1800.selectGiroRecpList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1885_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1886: //��������-����-���� ������Ȳ-��Ͽ�������
                wb1800 = new SSBrsup1800WB();
                wb1800.selectGiroRecpExcel(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1886_p.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_1890: //��������-����-��������������-�ʱ�ȭ��
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCvsRecpInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1890_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1895: //��������-����-���μ�����Ȳ-�����ȸ
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCvsRecpList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1895_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_1896: //��������-����-��������������-��������
                wb1800 = new SSBrsup1800WB();
                wb1800.selectCvsRecpPrint(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_1896_p.jsp";
                break;

                // ��������-������Ȳ
            case SSBrsupWBMapping.BRSUP_2000: //��������-������Ȳ-IS���-�ʱ�ȭ��
                wb2000 = new SSBrsup2000WB();
                wb2000.initPromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2000_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2005: //��������-������Ȳ-IS���-���
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafISList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2005_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2006: //��������-������Ȳ-IS���-���
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafISPrint(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2006_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2010: //��������-������Ȳ-IS���-��
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafISDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2010_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2015: //��������-������Ȳ-IS���-���
                wb2000 = new SSBrsup2000WB();
                wb2000.insertPromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2015_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2020: //��������-������Ȳ-IS���-����
                wb2000 = new SSBrsup2000WB();
                wb2000.updatePromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2020_u.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2025: //��������-������Ȳ-IS���-����
                wb2000 = new SSBrsup2000WB();
                wb2000.deletePromStafIS(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2025_d.jsp";
                break;

            case SSBrsupWBMapping.BRSUP_2030: //��������-������Ȳ-�������-�ʱ�ȭ��
                wb2000 = new SSBrsup2000WB();
                wb2000.initPromStaf(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2030_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2035: //��������-������Ȳ-�������-���
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2035_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2040: //��������-������Ȳ-�������-��
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2040_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2050: //��������-������Ȳ-�������-Excel
                wb2000 = new SSBrsup2000WB();
                wb2000.selectPromStafListExcel(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2050_p.jsp";
                break;


            // ��������-��ǻ��A/S, ������Ȳ
            case SSBrsupWBMapping.BRSUP_2100: //��������-��ǻ��A/S-�ʱ�ȭ��
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2100_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2110: //��������-��ǻ��A/S-����Ʈ
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2110_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2120: //��������-��ǻ��A/S-��
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2120_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2130: //��������-��ǻ��A/S-���,����,����
                wb2100 = new SSBrsup2100WB();
                wb2100.accessAsreq(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2130_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2140: //��������-��ǻ��A/S-��������
                wb2100 = new SSBrsup2100WB();
                wb2100.selectAsreqList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2140_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2150: //��������-������Ȳ-�ʱ�ȭ��
                wb2100 = new SSBrsup2100WB();
                wb2100.initLeafScat(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2150_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2160: //��������-������Ȳ-����Ʈ
                wb2100 = new SSBrsup2100WB();
                wb2100.selectLeafScatList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2160_l.jsp";
                break;
            // ��������-����_�ڵ���ü-�����ڰ���
            case SSBrsupWBMapping.BRSUP_2210: //�ʱ�ȭ��
                wb2200 = new SSBrsup2200WB();
                wb2200.selectShftPymtInit(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2210_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2211: //�����ڸ��
                wb2200 = new SSBrsup2200WB();
                wb2200.selectShftPymtList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2211_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2212: //�����ڻ�
                wb2200 = new SSBrsup2200WB();
                wb2200.selectShftPymtDetail(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2212_s.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2213: //��������������
                wb2200 = new SSBrsup2200WB();
                if("2".equals(req.getParameter("cnfm"))) {	// ��ü��û ��Ȯ�ΰǿ� ���ؼ�
                    wb1700.updatePymtInfo2(req, res);
                } else {
                    wb1700.updatePymtInfo(req, res);
                }
                nextPage = "/jsp/ss/brsup/ss_brsup_2213_a.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2214: //�ڵ���ü�ű�/������û
                wb2200 = new SSBrsup2200WB();
                wb2200.insertPymtShftAplc(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2214_i.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2215: //���ݳ�����ȸ
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtClamtList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2215_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2216: //û��������ȸ
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtClamOcomList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2216_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2217: //���������� �α׳���
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtLogList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2217_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2218: //���ΰ�� �α׳���
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtCntrLogList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2218_l.jsp";
                break;
            case SSBrsupWBMapping.BRSUP_2219: //�ű�/�������� �����ȸ
                wb2200 = new SSBrsup2200WB();
                wb2200.selectPymtShftAplcList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2219_l.jsp";
                break;


            //�ְ���������-��޺����긶��
            case SSBrsupWBMapping.BRSUP_2400: //�ְ���������-��޺����긶��-�ʱ�ȭ��
                nextPage = "/jsp/ss/brsup/ss_brsup_2400_s.jsp";
                break;

            //�ְ���������-��޺����긶��
            case SSBrsupWBMapping.BRSUP_2410: //�ְ���������-��޺����긶��-���������
                wb2400 = new SSBrsup2400WB();
                wb2400.ClosandCancel(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2410_a.jsp";
                break;

            //�ְ���������-��޺����긶��
            case SSBrsupWBMapping.BRSUP_2420: //�ְ���������-��޺����긶��-��������
                wb2400 = new SSBrsup2400WB();
                wb2400.initClosList(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2420_l.jsp";
                break;

                //�ְ���������-��޺����긶��
            case SSBrsupWBMapping.BRSUP_2430: //�ְ���������-��޺����긶��-��������-��������
                    wb2400 = new SSBrsup2400WB();
                    wb2400.closListExcel(req, res);
                    nextPage = "/jsp/ss/brsup/ss_brsup_2430_p.jsp";
                break;

                //�ְ���������-��޺����긶��
            case SSBrsupWBMapping.BRSUP_2440: //�ְ���������-��޺����긶��-��������-ȣ���� ��
                    wb2400 = new SSBrsup2400WB();
                    wb2400.closSernoList(req, res);
                    nextPage = "/jsp/ss/brsup/ss_brsup_2440_s.jsp";
                break;


                // �������������ý���-���˹�������
           case SSBrsupWBMapping.BRSUP_2500: //�������������ý���-���˹�������-�ʱ�ȭ��
                wb2500 = new SSBrsup2500WB();
                wb2500.initSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2500_a.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2501: //�������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
               wb2500 = new SSBrsup2500WB();
               wb2500.popInInitSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2501_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2502: //�������������ý���-���˹������Ȳ-��ȸȭ��-����߰� �˾�
               wb2500 = new SSBrsup2500WB();
               wb2500.popOutInitSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2502_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2503: //�������������ý���-���˹������Ȳ-��ȸȭ��-�������� �˾�
               nextPage = "/jsp/ss/brsup/ss_brsup_2503_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2504: //�������������ý���-���˹������Ȳ-��ȸȭ��-����������˾�
               wb2500 = new SSBrsup2500WB();
               wb2500.popTotalOutInitSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2504_p.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2510: //�������������ý���-���˹�������-���
            	wb2500 = new SSBrsup2500WB();
                wb2500.listSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2510_l.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2511: //�������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�-���
               wb2500 = new SSBrsup2500WB();
               wb2500.popInInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2511_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2512: //�������������ý���-���˹������Ȳ-��ȸȭ��-����߰� �˾�-����
               wb2500 = new SSBrsup2500WB();
               wb2500.popOutInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2512_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2513: //��������-������Ȳ-���˹������Ȳ ���Ĺ�� �ǿ� ���� ���� ����
               wb2500 = new SSBrsup2500WB();
               wb2500.popAfterInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2513_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2514: //��������-������Ȳ-���˹������Ȳ ��������� ��ǰ�űԵ�� ����
               wb2500 = new SSBrsup2500WB();
               wb2500.popTotalOutInsertSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2514_i.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2520: //�������������ý���-���˹�������-��
            	wb2500 = new SSBrsup2500WB();
                wb2500.detailSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2520_s.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2530: //�������������ý���-���˹�������-�󼼸����ȸ
            	wb2500 = new SSBrsup2500WB();
                wb2500.detailSearchSalespromotion(req, res);
                nextPage = "/jsp/ss/brsup/ss_brsup_2530_l.jsp";
                break;
           case SSBrsupWBMapping.BRSUP_2540: //�������������ý���-���˹�������-��-����
        	   wb2500 = new SSBrsup2500WB();
               wb2500.detailDeleteSalespromotion(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2540_d.jsp";
               break;


           // ����-�ڵ���ü-��ü��û����(2005-05-20 ���� �߰�)
           case SSBrsupWBMapping.BRSUP_2600: //��������-����_�ڵ���ü-��ü��û����-�ʱ�ȭ��
               nextPage = "/jsp/ss/brsup/ss_brsup_2600_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2601: //��������-����_�ڵ���ü-��ü��û����-�ű�ȭ��
               nextPage = "/jsp/ss/brsup/ss_brsup_2601_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2610: //��������-����_�ڵ���ü-��ü��û����-���
        	   wb2600 = new SSBrsup2600WB();
               wb2600.listSearchTransfer(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2610_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2620: //��������-����_�ڵ���ü-��ü��û����-��
        	   wb2600 = new SSBrsup2600WB();
               wb2600.detailSearchTransfer(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2620_S.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2630: //��������-����_�ڵ���ü-��ü��û����-���ε�
        	   wb2600 = new SSBrsup2600WB();
               wb2600.uploadSearchTransfer(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2630_i.jsp";
               break;

           case SSBrsupWBMapping.BRSUP_2700: //��������-����-����������-�ʱ�ȭ��
        	   wb2700 = new SSBrsup2700WB();
               wb2700.initVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2700_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2701: //��������-����-����������-�ʱ�ȭ��
        	   wb2700 = new SSBrsup2700WB();
               wb2700.searchBrsup2701(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2701_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2710: //��������-����-����������-��ȸ
        	   wb2700 = new SSBrsup2700WB();
               wb2700.searchVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2710_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2720: //��������-����-����������-��ȸ
        	   wb2700 = new SSBrsup2700WB();
               wb2700.detailVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2720_l.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2730: //��������-����-����������-��ȸ
        	   wb2700 = new SSBrsup2700WB();
               wb2700.printVactStat(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2730_p.jsp";
               break;

           case SSBrsupWBMapping.BRSUP_2800: //��������-������Ȳ-�������-13��������-�ʱ�ȭ��
        	   wb2800 = new SSBrsup2800WB();
               wb2800.initBrsup2800(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2800_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2810: //��������-������Ȳ-�������-13��������-��ȸ
        	   wb2800 = new SSBrsup2800WB();
               wb2800.searchBrsup2810(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2810_l.jsp";
               break;
           // ��������-������Ȳ-�������-�������������(2016-05-02 �弱�� �߰�)
           case SSBrsupWBMapping.BRSUP_2900: //��������-������Ȳ-�������-�������������-�ʱ�ȭ��
               wb2900 = new SSBrsup2900WB();
               wb2900.initBrsup2900(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_2900_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_2910: //��������-������Ȳ-�������-�������������-����Ʈ
        	   wb2900 = new SSBrsup2900WB();
        	   wb2900.selectBrsup2910(req, res);
        	   nextPage = "/jsp/ss/brsup/ss_brsup_2910_l.jsp";
        	   break;
           case SSBrsupWBMapping.BRSUP_2920: // ��������-������Ȳ-�������-�������������-����Ʈ-�������(�˾�)
        	   wb2900 = new SSBrsup2900WB();
        	   wb2900.selectBrsup2920(req, res);
        	   nextPage = "/jsp/ss/brsup/ss_brsup_2920_s.jsp";
        	   break;
           //��������-����-��������̷� 2017-12-26 ������	   
           case SSBrsupWBMapping.BRSUP_3000: //�ʱ�ȭ��
               wb3000 = new SSBrsup3000WB();
               wb3000.initBrsup3000(req, res);
               nextPage = "/jsp/ss/brsup/ss_brsup_3000_a.jsp";
               break;
           case SSBrsupWBMapping.BRSUP_3010: //����Ʈ
        	   wb3000 = new SSBrsup3000WB();
        	   wb3000.selectBrsup3010(req, res);
        	   nextPage = "/jsp/ss/brsup/ss_brsup_3010_l.jsp";
        	   break;	   
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
