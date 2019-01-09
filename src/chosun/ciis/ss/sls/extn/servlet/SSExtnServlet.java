/***************************************************************************************************
 * ���ϸ� : SSExtnServlet.java
 * ��� : Ȯ����Ȳ ����
 * �ۼ����� : 2003-11-15
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.wb.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;
import chosun.ciis.ss.sls.brinfo.wb.SSBrinfo1000WB;
import chosun.ciis.ss.sls.brinfo.wb.SSBrinfo1100WB;
 
/*
import chosun.ciis.ss.sls.rdr.ejb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
*/

/**
 * �Ǹű� �������� Ȯ����Ȳ Servlet
 */

public class SSExtnServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/extn/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSExtnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSExtnServlet : process : nextPage : " + nextPage);
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
     * SSExtnWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        SSExtn1000WB wb1000 = null; //Ȯ����Ȳ
        SSExtn1100WB wb1100 = null; //ǰ����Ȯ��
        SSExtn1200WB wb1200 = null; //���Ȯ��(��ȸ, ���)
        SSExtn1300WB wb1300 = null; //���Ȯ��(����, �۱�)
        SSExtn1400WB wb1400 = null; //Ȯ���������
        SSExtn1500WB wb1500 = null; //Ȯ��뿪���
        SSExtn1600WB wb1600 = null; //Ȯ����Ȳ-���̹�Ȯ��-�������,����,������ȸ
        SSExtn1700WB wb1700 = null; //Ȯ����Ȳ-���̹�Ȯ��-��ȸ����,��븶��
        SSExtn1800WB wb1800 = null; //�����濵-���־���Ʈ��Ȳ
        SSExtn1900WB wb1900 = null; //Ȯ����Ȳ-Ȯ������
        SSExtn2000WB wb2000 = null; //Ȯ����Ȳ-������Ȳ  �߰� 2009.05.14 ������ 
        SSExtn2100WB wb2100 = null; //Ȯ����Ȳ-����Ȯ��  �߰� 2009.05.20 ������
        SSExtn2200WB wb2200 = null; //Ȯ����Ȳ-����Ȯ�帶�� 2009.07.09 ���� 
        SSExtn2280WB wb2280 = null; //Ȯ����Ȳ-�ϰ�Ȯ�� ��� ������ 
        SSExtn2300WB wb2300 = null; //Ȯ����Ȳ-Ȯ����� ������ 2012.2.10
        SSExtn2400WB wb2400 = null; //Ȯ����Ȳ-���л�Ȯ��ķ����
        SSExtn2500WB wb2500 = null; //Ȯ����Ȳ-��üȮ�� ������ 2012.5.18 
        SSReader1700WB wb1700rdr = null;
        SSBrinfo1100WB wb1100brinfo = null;        
        SSExtn2600WB wb2600 = null;
        SSExtn2700WB wb2700 = null;
        SSExtn2800WB wb2800 = null;	//���ͺ��ڰ��� 2013.06.27 ����
        SSExtn2900WB wb2900 = null;
        SSExtn3000WB wb3000 = null;
        SSExtn3100WB wb3100 = null;   
        SSExtn3200WB wb3200 = null;   
        SSExtn3400WB wb3400 = null;   
        SSExtn3500WB wb3500 = null;   
        SSExtn3600WB wb3600 = null;   
        SSExtn3700WB wb3700 = null;   
        SSExtn3800WB wb3800 = null;
        SSExtn3900WB wb3900 = null;   
        SSExtn4000WB wb4000 = null;   
        SSExtn4100WB wb4100 = null;   
        SSExtn4200WB wb4200 = null;
        SSExtn3300WB wb3300 = null;   
        SSExtn4300WB wb4300 = null; 
        SSExtn4400WB wb4400 = null;
        SSExtn4500WB wb4500 = null;
        SSExtn4600WB wb4600 = null;
        SSExtn4700WB wb4700 = null;
        SSExtn4800WB wb4800 = null;
        SSExtn4900WB wb4900 = null;
        SSExtn5000WB wb5000 = null;
        SSExtn5100WB wb5100 = null;
        SSExtn5200WB wb5200 = null;
        SSExtn5300WB wb5300 = null;
        SSExtn5400WB wb5400 = null;
        SSExtn5500WB wb5500 = null;
        SSExtn5600WB wb5600 = null;
        SSExtn5700WB wb5700 = null;
        SSExtn5800WB wb5800 = null;
       
        switch (pid) {
            // Ȯ����Ȳ-��û��Ȳ
            case SSExtnWBMapping.EXTN_1000: //Ȯ����Ȳ-��û��Ȳ �ʱ�ȭ��
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1000_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1010: //Ȯ����Ȳ-��û��Ȳ Ȯ���ڼҼ� ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectExtnBlngCodeList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1010_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1020: //Ȯ����Ȳ-��û��Ȳ ��ü ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1020_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1030: //Ȯ����Ȳ-��û��Ȳ ����������û ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1030_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1040: //Ȯ����Ȳ-��û��Ȳ ���Ȯ�� ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1040_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1050: //Ȯ����Ȳ-��û��Ȳ ǰ����Ȯ�� ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1050_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1060: //Ȯ����Ȳ-��û��Ȳ ������üȮ�� ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1060_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1090: //Ȯ����Ȳ-��û��Ȳ ��
                wb1000 = new SSExtn1000WB();
                wb1000.selectRdrExtnDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1090_s.jsp";
                break;

            //Ȯ����Ȳ-�¶���Ȯ�� ��û��Ȳ
            case SSExtnWBMapping.EXTN_1070: //Ȯ����Ȳ-�¶���Ȯ��-��û��Ȳ �ʱ�ȭ��
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1070_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1075: //Ȯ����Ȳ-�¶���Ȯ��-��û��Ȳ ���
                wb1000 = new SSExtn1000WB();
                wb1000.selectOnlineExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1075_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1077: //Ȯ����Ȳ-�¶���Ȯ��-��û��Ȳ ��
                wb1000 = new SSExtn1000WB();
                wb1000.selectOnlineExtnDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1077_s.jsp";
                break;

            //Ȯ����Ȳ-����Ȯ�� ��û��Ȳ
            case SSExtnWBMapping.EXTN_1080: //Ȯ����Ȳ-����Ȯ��-��û��Ȳ �ʱ�ȭ��
                wb1000 = new SSExtn1000WB();
                wb1000.jminit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1080_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1082: //Ȯ����Ȳ-����Ȯ��-��û��Ȳ ���
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1082_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1085: //Ȯ����Ȳ-����Ȯ��-��û��Ȳ ��
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1085_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1087: //Ȯ����Ȳ-����Ȯ��-��û��Ȳ ��������
                wb1000 = new SSExtn1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1087_a.jsp";
                break;


            // Ȯ����Ȳ-ǰ����Ȯ��-��ȸ
            case SSExtnWBMapping.EXTN_1100: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-�ʱ�ȭ��
                wb1100 = new SSExtn1100WB();
                wb1100.exgCampInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1100_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1105: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-���
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCampList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1105_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1110: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-��
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCampDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1110_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1115: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-���
                wb1100 = new SSExtn1100WB();
                wb1100.insertExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1115_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1120: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-����
                wb1100 = new SSExtn1100WB();
                wb1100.updateExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1120_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1125: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-����
                wb1100 = new SSExtn1100WB();
                wb1100.deleteExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1125_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1130: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-����
                wb1100 = new SSExtn1100WB();
                wb1100.closeExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1130_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1135: //Ȯ����Ȳ-ǰ����Ȯ��-��ȸ-�������
                wb1100 = new SSExtn1100WB();
                wb1100.closeCancelExgCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1135_a.jsp";
                break;

                // Ȯ����Ȳ-ǰ����Ȯ��-���
            case SSExtnWBMapping.EXTN_1140: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-�ʱ�ȭ��
                wb1100 = new SSExtn1100WB();
                wb1100.exgCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1140_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1145: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-���
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1145_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1150: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-��
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1150_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1155: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-����
                wb1100 = new SSExtn1100WB();
                wb1100.updateExgCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1155_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1160: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-�ʱ�ȭ��
                wb1100 = new SSExtn1100WB();
                wb1100.exgCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1160_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1165: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-���
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1165_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1170: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-��
                wb1100 = new SSExtn1100WB();
                wb1100.selectExgCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1170_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1175: //Ȯ����Ȳ-ǰ����Ȯ��-���(����)-����
                wb1100 = new SSExtn1100WB();
                wb1100.updateExgCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1175_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1180: //Ȯ����Ȳ-ǰ����Ȯ��-�۱�-�μ�
                wb1100 = new SSExtn1100WB();
                wb1100.printExgCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1180_p.jsp";
                break;

                // Ȯ����Ȳ-���Ȯ��-��ȸ
            case SSExtnWBMapping.EXTN_1200: //Ȯ����Ȳ-���Ȯ��-��ȸ-�ʱ�ȭ��
                wb1200 = new SSExtn1200WB();
                wb1200.empCampInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1200_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1205: //Ȯ����Ȳ-���Ȯ��-��ȸ-���
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1205_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1210: //Ȯ����Ȳ-���Ȯ��-��ȸ-��
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1210_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1215: //Ȯ����Ȳ-���Ȯ��-��ȸ-���
                wb1200 = new SSExtn1200WB();
                wb1200.insertEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1215_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1220: //Ȯ����Ȳ-���Ȯ��-��ȸ-����
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1220_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1225: //Ȯ����Ȳ-���Ȯ��-��ȸ-����
                wb1200 = new SSExtn1200WB();
                wb1200.deleteEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1225_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1230: //Ȯ����Ȳ-���Ȯ��-��ȸ-����
                wb1200 = new SSExtn1200WB();
                wb1200.closeEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1230_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1235: //Ȯ����Ȳ-���Ȯ��-��ȸ-�������
                wb1200 = new SSExtn1200WB();
                wb1200.closeCancelEmpCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1235_a.jsp";
                break;

                // Ȯ����Ȳ-���Ȯ��-��븶��
            case SSExtnWBMapping.EXTN_1240: //Ȯ����Ȳ-���Ȯ��-��븶��-�ʱ�ȭ��

                // ���Ȯ�� ������ �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/extn/ss_extn_1240_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1245: //Ȯ����Ȳ-���Ȯ��-��븶��-���
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1245_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1250: //Ȯ����Ȳ-���Ȯ��-��븶��-��
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCampCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1250_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1255: //Ȯ����Ȳ-���Ȯ��-��븶��-���
                wb1200 = new SSExtn1200WB();
                wb1200.insertEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1255_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1260: //Ȯ����Ȳ-���Ȯ��-��븶��-����
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1260_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1265: //Ȯ����Ȳ-���Ȯ��-��븶��-����
                wb1200 = new SSExtn1200WB();
                wb1200.deleteEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1265_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1270: //Ȯ����Ȳ-���Ȯ��-��븶��-����
                wb1200 = new SSExtn1200WB();
                wb1200.closeEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1270_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1275: //Ȯ����Ȳ-���Ȯ��-��븶��-�������
                wb1200 = new SSExtn1200WB();
                wb1200.closeCancelEmpCampCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1275_a.jsp";
                break;

                // Ȯ����Ȳ-���Ȯ��-���
            case SSExtnWBMapping.EXTN_1280: //Ȯ����Ȳ-���Ȯ��-���(����)-�ʱ�ȭ��
                wb1200 = new SSExtn1200WB();
                wb1200.empCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1280_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1282: //Ȯ����Ȳ-���Ȯ��-���(����)-���
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1282_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1284: //Ȯ����Ȳ-���Ȯ��-���(����)-��
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1284_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1286: //Ȯ����Ȳ-���Ȯ��-���(����)-����
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1286_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1288: //Ȯ����Ȳ-���Ȯ��-���(����)-�ʱ�ȭ��
                wb1200 = new SSExtn1200WB();
                wb1200.empCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1288_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1290: //Ȯ����Ȳ-���Ȯ��-���(����)-���
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1290_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1292: //Ȯ����Ȳ-���Ȯ��-���(����)-��
                wb1200 = new SSExtn1200WB();
                wb1200.selectEmpCostDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1292_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1294: //Ȯ����Ȳ-���Ȯ��-���(����)-����
                wb1200 = new SSExtn1200WB();
                wb1200.updateEmpCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1294_u.jsp";
                break;

                // Ȯ����Ȳ-���Ȯ��-����
            case SSExtnWBMapping.EXTN_1300: //Ȯ����Ȳ-���Ȯ��-����-�ʱ�ȭ��
                wb1300 = new SSExtn1300WB();
                wb1300.empAlonInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1300_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1310: //Ȯ����Ȳ-���Ȯ��-����-���
                wb1300 = new SSExtn1300WB();
                wb1300.selectEmpAlonList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1310_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1320: //Ȯ����Ȳ-���Ȯ��-����-��
                wb1300 = new SSExtn1300WB();
                wb1300.selectEmpAlonDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1320_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1330: //Ȯ����Ȳ-���Ȯ��-����-����
                wb1300 = new SSExtn1300WB();
                wb1300.updateEmpAlon(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1330_u.jsp";
                break;

                // Ȯ����Ȳ-���Ȯ��-�۱�
            case SSExtnWBMapping.EXTN_1340: //Ȯ����Ȳ-���Ȯ��-�۱�-�ʱ�ȭ��
                wb1300 = new SSExtn1300WB();
                wb1300.empRmttInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1340_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1350: //Ȯ����Ȳ-���Ȯ��-�۱�-���
                wb1300 = new SSExtn1300WB();
                wb1300.selectEmpRmttList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1350_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1360: //Ȯ����Ȳ-���Ȯ��-�۱�-�μ�
                wb1300 = new SSExtn1300WB();
                wb1300.printEmpAlonList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1360_p.jsp";
                break;

                // Ȯ����Ȳ-Ȯ���������-����
            case SSExtnWBMapping.EXTN_1400: //Ȯ����Ȳ-Ȯ���������-����-�ʱ�ȭ��

                // Ȯ��������� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/extn/ss_extn_1400_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1405: //Ȯ����Ȳ-Ȯ���������-����-���
                wb1400 = new SSExtn1400WB();
                wb1400.selectSlsCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1405_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1410: //Ȯ����Ȳ-Ȯ���������-����-��
                wb1400 = new SSExtn1400WB();
                wb1400.selectSlsCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1410_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1415: //Ȯ����Ȳ-Ȯ���������-����-���
                wb1400 = new SSExtn1400WB();
                wb1400.insertSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1415_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1420: //Ȯ����Ȳ-Ȯ���������-����-����
                wb1400 = new SSExtn1400WB();
                wb1400.updateSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1420_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1425: //Ȯ����Ȳ-Ȯ���������-����-����
                wb1400 = new SSExtn1400WB();
                wb1400.deleteSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1425_d.jsp";
                break;
            case SSExtnWBMapping.EXTN_1430: //Ȯ����Ȳ-Ȯ���������-����-����
                wb1400 = new SSExtn1400WB();
                wb1400.closeSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1430_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1435: //Ȯ����Ȳ-Ȯ���������-����-�������
                wb1400 = new SSExtn1400WB();
                wb1400.closeCancelSlsCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1435_a.jsp";
                break;

                // Ȯ����Ȳ-Ȯ���������-���/��ȸ
            case SSExtnWBMapping.EXTN_1440: //Ȯ����Ȳ-Ȯ��������� ���/��ȸ �ʱ�ȭ��
                wb1400 = new SSExtn1400WB();
                wb1400.slsAmtInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1440_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1445: //Ȯ����Ȳ-Ȯ��������� ���/��ȸ ���
                wb1400 = new SSExtn1400WB();
                wb1400.selectSlsAmtList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1445_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1450: //Ȯ����Ȳ-Ȯ��������� ���/��ȸ ����
                wb1400 = new SSExtn1400WB();
                wb1400.updateSlsAmt(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1450_u.jsp";
                break;

                // Ȯ����Ȳ-Ȯ��뿪���-����(����IS)
                // ����IS, ��������� request ó���� ������ WB, EJB, DAO, SP�� ����Ѵ�.
                // URL �� ó�� �� ����� �����ִ� JSP�� �����Ѵ�.
            case SSExtnWBMapping.EXTN_1500: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-�ʱ�ȭ��
                wb1500 = new SSExtn1500WB();
                wb1500.servCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1500_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1505: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-���
                wb1500 = new SSExtn1500WB();
                wb1500.selectServCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1505_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1510: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-��
                wb1500 = new SSExtn1500WB();
                wb1500.selectServCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1510_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1515: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-���
                wb1500 = new SSExtn1500WB();
                wb1500.insertServCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1515_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1520: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-����
                wb1500 = new SSExtn1500WB();
                wb1500.updateServCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1520_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1525: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-����
                wb1500 = new SSExtn1500WB();
                wb1500.deleteServCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1525_d.jsp";
                break;

            /* 20050219 ��뼷 �߰�(MC) */
            case SSExtnWBMapping.EXTN_1530: //Ȯ����Ȳ-Ȯ��뿪���-����(MC)-�ʱ�ȭ��
                wb1500 = new SSExtn1500WB();
                wb1500.MCCostInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1530_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1535: //Ȯ����Ȳ-Ȯ��뿪���-����(MC)-���
                wb1500 = new SSExtn1500WB();
                wb1500.selectMCCostList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1535_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1540: //Ȯ����Ȳ-Ȯ��뿪���-����(MC)-��
                wb1500 = new SSExtn1500WB();
                wb1500.selectMCCostDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1540_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1545: //Ȯ����Ȳ-Ȯ��뿪���-����(MC)-���
                wb1500 = new SSExtn1500WB();
                wb1500.insertMCCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1545_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1550: //Ȯ����Ȳ-Ȯ��뿪���-����(MC)-����
                wb1500 = new SSExtn1500WB();
                wb1500.updateMCCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1550_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1555: //Ȯ����Ȳ-Ȯ��뿪���-����(MC)-����
                wb1500 = new SSExtn1500WB();
                wb1500.deleteMCCost(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1555_d.jsp";
                break;

                /* 20050219 ��뼷 ����(������� ����) */
                /*
                            case SSExtnWBMapping.EXTN_1530: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-����
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1530_a.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1535: //Ȯ����Ȳ-Ȯ��뿪���-����(����IS)-�������
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeCancelServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1535_a.jsp";
                                break;
                            // Ȯ����Ȳ-Ȯ��뿪���-����(����)
                            case SSExtnWBMapping.EXTN_1540: //Ȯ����Ȳ-Ȯ��뿪���-����(����)-�ʱ�ȭ��
                                wb1500 = new SSExtn1500WB();
                                wb1500.servCostInit(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1540_a.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1545: //Ȯ����Ȳ-Ȯ��뿪���-����(����)-���
                                wb1500 = new SSExtn1500WB();
                                wb1500.selectServCostList(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1545_l.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1550: //Ȯ����Ȳ-Ȯ��뿪���-����(����)-��
                                wb1500 = new SSExtn1500WB();
                                wb1500.selectServCostDetail(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1550_s.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1555: //Ȯ����Ȳ-Ȯ��뿪���-����(����)-����
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1555_u.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1560: //Ȯ����Ȳ-Ȯ��뿪���-����(����)-�������
                                wb1500 = new SSExtn1500WB();
                                wb1500.closeCancelServCost(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1560_u.jsp";
                                break;
                 */
                // Ȯ����Ȳ-Ȯ��뿪���-�����
            case SSExtnWBMapping.EXTN_1590: //Ȯ����Ȳ-Ȯ��뿪���-�����-�ʱ�ȭ��
                // Ȯ��뿪��븶�� ���곻�� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/extn/ss_extn_1590_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1592: //Ȯ����Ȳ-Ȯ��뿪���-�����-���
                wb1500 = new SSExtn1500WB();
                wb1500.selectServAdjmList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1592_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1594: //Ȯ����Ȳ-Ȯ��뿪���-�����-��
                wb1500 = new SSExtn1500WB();
                wb1500.selectServAdjmDetailList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1594_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1575: //Ȯ����Ȳ-Ȯ��뿪���-�����-�μ�
                wb1500 = new SSExtn1500WB();
                wb1500.printBoRsltList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1575_p.jsp";
                break;

                // Ȯ����Ȳ-Ȯ��뿪���-������
            case SSExtnWBMapping.EXTN_1565: //Ȯ����Ȳ-Ȯ��뿪���-������-�ʱ�ȭ��
                wb1500 = new SSExtn1500WB();
                wb1500.rsltInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1565_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1570: //Ȯ����Ȳ-Ȯ��뿪���-������-���
                wb1500 = new SSExtn1500WB();
                wb1500.selectBoRsltList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1570_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1595: //Ȯ����Ȳ-Ȯ��뿪���-������-�μ�
                wb1500 = new SSExtn1500WB();
                wb1500.printServAdjmList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1595_p.jsp";
                break;

                // Ȯ����Ȳ-����Ȯ���̻����
            case SSExtnWBMapping.EXTN_1596: //Ȯ����Ȳ-����Ȯ���̻����-�ʱ�ȭ��
                wb1500 = new SSExtn1500WB();
                wb1500.extnMovmInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1596_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1598: //Ȯ����Ȳ-����Ȯ���̻����-���
                wb1500 = new SSExtn1500WB();
                wb1500.selectExtnMovmList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1598_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1599: //Ȯ����Ȳ-����Ȯ���̻����-����μ�
                nextPage = "/jsp/ss/extn/ss_extn_1599_p.jsp";
                break;

                // Ȯ����Ȳ-���̹�Ȯ��-�������
            case SSExtnWBMapping.EXTN_1600: //Ȯ����Ȳ-���̹�Ȯ��-���-�ʱ�ȭ��
                wb1600 = new SSExtn1600WB();
                wb1600.initPromStafCYEXTN(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1600_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1605: //Ȯ����Ȳ-���̹�Ȯ��-���-���
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXTNList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1605_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1610: //Ȯ����Ȳ-���̹�Ȯ��-���-��
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXTNDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1610_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1615: //Ȯ����Ȳ-���̹�Ȯ��-���-�μ�
                wb1600 = new SSExtn1600WB();
                wb1600.printPromStafCYEXTNList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1615_p.jsp";
                break;

                // Ȯ����Ȳ-���̹�Ȯ��-����
            case SSExtnWBMapping.EXTN_1650: //Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ��
                wb1600 = new SSExtn1600WB();
                wb1600.initPromStafCYEXPay(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1650_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1655: //Ȯ����Ȳ-���̹�Ȯ��-����-���
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXPayList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1655_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1660: //Ȯ����Ȳ-���̹�Ȯ��-����-����
                wb1600 = new SSExtn1600WB();
                wb1600.updatePromStafCYEXpay(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1660_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1665: //Ȯ����Ȳ-���̹�Ȯ��-����-�μ�
                wb1600 = new SSExtn1600WB();
                wb1600.selectPromStafCYEXPayList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1665_p.jsp";
                break;

                // Ȯ����Ȳ-���̹�Ȯ��-����
            case SSExtnWBMapping.EXTN_1700: //Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ��
                wb1700 = new SSExtn1700WB();
                wb1700.cybCampInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1700_a.jsp";
                break;
            case SSExtnWBMapping.EXTN_1705: //Ȯ����Ȳ-���̹�Ȯ��-����-���
                wb1700 = new SSExtn1700WB();
                wb1700.selectCybCampList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1705_l.jsp";
                break;
            case SSExtnWBMapping.EXTN_1710: //Ȯ����Ȳ-���̹�Ȯ��-����-��
                wb1700 = new SSExtn1700WB();
                wb1700.selectCybCampDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1710_s.jsp";
                break;
            case SSExtnWBMapping.EXTN_1715: //Ȯ����Ȳ-���̹�Ȯ��-����-���
                wb1700 = new SSExtn1700WB();
                wb1700.insertCybCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1715_i.jsp";
                break;
            case SSExtnWBMapping.EXTN_1720: //Ȯ����Ȳ-���̹�Ȯ��-����-����
                wb1700 = new SSExtn1700WB();
                wb1700.updateCybCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1720_u.jsp";
                break;
            case SSExtnWBMapping.EXTN_1725: //Ȯ����Ȳ-���̹�Ȯ��-����-����
                wb1700 = new SSExtn1700WB();
                wb1700.deleteCybCamp(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1725_d.jsp";
                break;
                /*
                            case SSExtnWBMapping.EXTN_1730: //Ȯ����Ȳ-���̹�Ȯ��-����-����
                                wb1700 = new SSExtn1700WB();
                                wb1700.closeCybCamp(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1730_a.jsp";
                                break;
                            case SSExtnWBMapping.EXTN_1735: //Ȯ����Ȳ-���̹�Ȯ��-����-�������
                                wb1700 = new SSExtn1700WB();
                                wb1700.closeCancelCybCamp(req, res);
                                nextPage = "/jsp/ss/extn/ss_extn_1735_a.jsp";
                                break;
            */

           // ���־���Ʈ��Ȳ
           case SSExtnWBMapping.EXTN_1800: //�����濵-���־���Ʈ��Ȳ-����Ȯ����ȸ �ʱ�ȭ��
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1800_a.jsp";
                break;
           case SSExtnWBMapping.EXTN_1810: //�����濵-���־���Ʈ��Ȳ-����Ȯ����
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinExtnList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1810_l.jsp";
                break;
           case SSExtnWBMapping.EXTN_1815: //�����濵-���־���Ʈ��Ȳ-����Ȯ����-��������
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinExtnListPrint(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1815_p.jsp";
                break;
           // ���־���Ʈ �ʱ�ȭ��
           case SSExtnWBMapping.EXTN_1820: //�����濵-���־���Ʈ��Ȳ-���־���Ʈ-�ʱ�ȭ��
                wb1700rdr = new SSReader1700WB();
                wb1700rdr.selectInitList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1820_a.jsp";
                break;
           // ���־���Ʈ �����ȸ
           case SSExtnWBMapping.EXTN_1830: //�����濵-���־���Ʈ��Ȳ-���־���Ʈ��ȸ
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinAptList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1830_l.jsp";
                break;
           // ���־���Ʈ ��� ��������
           case SSExtnWBMapping.EXTN_1835: //�����濵-���־���Ʈ��Ȳ-���־���Ʈ ��������
                wb1800 = new SSExtn1800WB();
                wb1800.selectMoveinAptPrint(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1835_p.jsp";
                break;            
           case SSExtnWBMapping.EXTN_1840: //Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �ʱ�ȭ��
                wb1800 = new SSExtn1800WB();
                wb1800.selectInitList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1840_a.jsp";
                break;
           case SSExtnWBMapping.EXTN_1845: //Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ���� ���� �ϰ� ���ε�
               wb1800 = new SSExtn1800WB();
               wb1800.uploadExcel(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1845_i.jsp";
               break;
           case SSExtnWBMapping.EXTN_1850: //Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ��ȸ
               wb1800 = new SSExtn1800WB();
               wb1800.selectList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1850_l.jsp";
               break; 
           case SSExtnWBMapping.EXTN_1855: //Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ����
               wb1800 = new SSExtn1800WB();
               wb1800.apprList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1855_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_1860: //Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �������
               wb1800 = new SSExtn1800WB();
               wb1800.cancelList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1860_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_1865: //Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ����(����)
               wb1800 = new SSExtn1800WB();
               wb1800.updateList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_1865_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_1900:
                wb1900 = new SSExtn1900WB();
                wb1900.selectExtnResInit(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1900_a.jsp";
                break;
           case SSExtnWBMapping.EXTN_1910:
                wb1900 = new SSExtn1900WB();
                wb1900.selectExtnResList(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1910_l.jsp";
                break;
           case SSExtnWBMapping.EXTN_1920:
                wb1900 = new SSExtn1900WB();
                wb1900.selectExtnResDetail(req, res);
                nextPage = "/jsp/ss/extn/ss_extn_1920_s.jsp";
                break;
	       case SSExtnWBMapping.EXTN_1930:
	            wb1900 = new SSExtn1900WB();
	            wb1900.selectExtnResUpdate(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_1930_u.jsp";
	            break;

	       // ������Ȳ �߰� 2009.05.14 ������ 
	       case SSExtnWBMapping.EXTN_2000:
	            wb2000 = new SSExtn2000WB();
	            wb2000.suspInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2000_a.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2010:
	            wb2000 = new SSExtn2000WB();
	            wb2000.selectSuspList(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2010_l.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2015:
	            wb2000 = new SSExtn2000WB();
	            wb2000.selectSuspPerList(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2015_l.jsp";
	            break;
	       
	       // ����Ȯ�� �߰� 2009.05.21  ������ 
	       case SSExtnWBMapping.EXTN_2100:
	            wb2100 = new SSExtn2100WB();
	            wb2100.hdqtInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2100_a.jsp";
	            break;	            
	       case SSExtnWBMapping.EXTN_2105:
	            wb2100 = new SSExtn2100WB();
	            wb2100.selecthdqt(req, res);
	            String type = req.getParameter("type");
	            nextPage = "/jsp/ss/extn/ss_extn_2105_l.jsp";
	            break;	            
	       case SSExtnWBMapping.EXTN_2110:
	            wb2100 = new SSExtn2100WB();
	            wb2100.detailhdqt(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2110_l.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2120:
	            wb2100 = new SSExtn2100WB();
	            wb2100.updatehdqt(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2120_u.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2130:
	            wb2100 = new SSExtn2100WB();
	            wb2100.alerthdqt(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2130_i.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2135:
	            wb2100 = new SSExtn2100WB();
	            wb2100.showAlert(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2135_l.jsp";
	            break;
	       
           // ����/���� Ȯ�� �߰� 2009.05.26  ������
	       case SSExtnWBMapping.EXTN_2150:
	            wb2100 = new SSExtn2100WB();
	            wb2100.eduInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2150_a.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2155:
	            wb2100 = new SSExtn2100WB();
	            wb2100.selectEdu(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2155_l.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2160:
	            wb2100 = new SSExtn2100WB();
	            wb2100.detailEdu(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2160_s.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2162:
	            wb2100 = new SSExtn2100WB();
	            wb2100.updateEdu(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2162_u.jsp";
	            break;
	       case SSExtnWBMapping.EXTN_2163:
	            wb2100 = new SSExtn2100WB();
	            wb2100.eduRdrInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2163_a.jsp";
	            break;	           
	       case SSExtnWBMapping.EXTN_2165:
	            wb2100 = new SSExtn2100WB();
	            wb2100.insertRdr(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2165_i.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2170:
	            wb2100 = new SSExtn2100WB();
	            wb2100.insertInst(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2170_i.jsp";
	            break;
	            
	       // ���Ȯ��� ���� �߰� 2009.05.26  ������     
           case SSExtnWBMapping.EXTN_2180:
	            wb2100 = new SSExtn2100WB();
	            wb2100.costInit(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2180_a.jsp";
	            break;	       
           case SSExtnWBMapping.EXTN_2182:
	            wb2100 = new SSExtn2100WB();
	            wb2100.selectCost(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2182_l.jsp";
	            break; 
           case SSExtnWBMapping.EXTN_2183:
	            wb2100 = new SSExtn2100WB();
	            wb2100.insertCost(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2183_i.jsp";
	            break;
	       
	       // ��üȮ��(�볳����) �߰� 2009.06.02 
           case SSExtnWBMapping.EXTN_2190:               
               nextPage = "/jsp/ss/extn/ss_extn_2190_a.jsp"; //WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
               break;
           case SSExtnWBMapping.EXTN_2191:
	            wb2100 = new SSExtn2100WB();
	            wb2100.uploadExtn(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2191_i.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2192:
	            wb2100 = new SSExtn2100WB();
	            wb2100.getUserInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2192_l.jsp";
	            break;
	            
           // Ȯ����Ȳ-����Ȯ�帶�� 2009.07.09 ����
           case SSExtnWBMapping.EXTN_2200: //Ȯ����Ȳ-����Ȯ�� ����-�ʱ�ȭ��
        	   String frdt = req.getParameter("frdt");
               wb2200 = new SSExtn2200WB();
               wb2200.extnExtnclosInit(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2200_a.jsp?frdt="+frdt;
               break;
           case SSExtnWBMapping.EXTN_2210: //Ȯ����Ȳ-����Ȯ�� ����-�����ȸ
               wb2200 = new SSExtn2200WB();
               wb2200.extnExtnclosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2210_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2220: //Ȯ����Ȳ-����Ȯ�� ����-����
               wb2200 = new SSExtn2200WB();
               wb2200.extnExtnclosUpdate(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2220_u.jsp";
               break;
               
            // Ȯ����Ȳ-������������ 2009.07.10 ����
           case SSExtnWBMapping.EXTN_2250: //Ȯ����Ȳ-����Ȯ�� ���� -�ʱ�ȭ��
        	   String frdt1 = req.getParameter("frdt");
               wb2200 = new SSExtn2200WB();
               wb2200.extnBosuspclosInit(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2250_a.jsp?frdt="+frdt1;
               break;
           case SSExtnWBMapping.EXTN_2253: //Ȯ����Ȳ-����Ȯ�� ���� -�ʱ�ȭ��
               wb2200 = new SSExtn2200WB();
               wb2200.boclosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2254_p.jsp";
               break;
           case SSExtnWBMapping.EXTN_2260: //Ȯ����Ȳ-�������� ���� -�����ȸ
               wb2200 = new SSExtn2200WB();
               wb2200.extnBosuspclosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2260_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2270: //Ȯ����Ȳ-�������� ���� -����
               wb2200 = new SSExtn2200WB();
               wb2200.extnBosuspclosUpdate(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2270_u.jsp";
               break;

           //Ȯ����Ȳ-�ϰ�Ȯ����
           case SSExtnWBMapping.EXTN_2280: //Ȯ����Ȳ-�ϰ�Ȯ����
               wb2280 = new SSExtn2280WB();
               wb2280.batchExtnJob(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2280_a.jsp";
               break;

           //Ȯ����Ȳ-�ϰ�Ȯ�帮��Ʈ
           case SSExtnWBMapping.EXTN_2290: //Ȯ����Ȳ-�ϰ�Ȯ����
               wb2280 = new SSExtn2280WB();
               wb2280.listBatchExtnJob(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2290_l.jsp";
               break;                              
           //�̸�TM�ڷ�
           case SSExtnWBMapping.EXTN_2295: //Ȯ����Ȳ-�ϰ�Ȯ����
               wb2280 = new SSExtn2280WB();
               wb2280.listIMTM(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2295_l.jsp";
               break;

           case SSExtnWBMapping.EXTN_2230: //Ȯ��ν�����-���˸����ȸ-�ʱ�ȭ��
        	   wb2200 = new SSExtn2200WB();
               wb2200.initExtnClos(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2230_a.jsp";
               break;

           case SSExtnWBMapping.EXTN_2231: //Ȯ��ν�����-���˸����ȸ
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2231_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2232: //Ȯ��ν�����-����ȸ
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosDtls(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2232_s.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2233: //Ȯ��ν�����-���Ȯ�θ������
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosUpdate(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2233_i.jsp";
               break;

           case SSExtnWBMapping.EXTN_2234: //Ȯ��ν�����-����IS�����ݿ�
               wb2200 = new SSExtn2200WB();
               wb2200.updateExtnclosIssup(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2234_i.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2235: //Ȯ��ν�����-��ǥ��ȸ
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnclosReport(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2235_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2236: //Ȯ��ν�����-���˸���
               wb2200 = new SSExtn2200WB();
               wb2200.updateExtnClosClose(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2236_i.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2237: //Ȯ��ν�����-���˸���������ȸ
               wb2200 = new SSExtn2200WB();
               wb2200.selectExtnClosInfo(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2237_i.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2240: //�������� �ʱ�ȭ��
               wb2200 = new SSExtn2200WB();
               nextPage = "/jsp/ss/extn/ss_extn_2240_a.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2245: //�������� ��ȸ/��������
               wb2200 = new SSExtn2200WB();
               wb2200.selectClosReport(req, res);
               //if(req.getParameter("jobcd").equals("0")) {
               //	   nextPage = "/jsp/ss/extn/ss_extn_2245_l.jsp";
               //} else {
            	   nextPage = "/jsp/ss/extn/ss_extn_2245_p.jsp";
               //}
               break;
            
           case SSExtnWBMapping.EXTN_2300: // ���Ȯ�� ��� �ʱ�ȭ��        	   
               wb2300 = new SSExtn2300WB();
               wb2300.init(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2300_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2305: // ���Ȯ�� ��� ���
               wb2300 = new SSExtn2300WB();
               wb2300.selectRdrExtnStatList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2305_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2400: // ���л� ķ����Ȯ�� �ʱ�ȭ��
               //wb2400 = new SSExtn2400WB();
               //wb2400.init(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2400_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2401: // ���л� ķ����Ȯ�� �����ȸ        	   
               wb2400 = new SSExtn2400WB();
               wb2400.selectCampExtnUniList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2401_l.jsp";
               break;
           
            // ��üȮ��(�볳����) �߰� 2009.06.02 
           case SSExtnWBMapping.EXTN_2500:               
               nextPage = "/jsp/ss/extn/ss_extn_2500_a.jsp"; //WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
               break;
           case SSExtnWBMapping.EXTN_2501:
	            wb2500 = new SSExtn2500WB();
	            wb2500.uploadExtn(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2501_i.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2502:
	            wb2500 = new SSExtn2500WB();
	            wb2500.getUserInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_2502_l.jsp";
	            break;
           case SSExtnWBMapping.EXTN_2600: // 
               nextPage = "/jsp/ss/extn/ss_extn_2600_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2610: // 
               wb2600 = new SSExtn2600WB();
               wb2600.selectYearlySubsList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2610_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2620: // 
               wb2600 = new SSExtn2600WB();
               wb2600.selectYearlySubsDetail(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2620_s.jsp";
               break;
           case SSExtnWBMapping.EXTN_2630: // 
               wb2600 = new SSExtn2600WB();
               wb2600.getUserInfo(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2630_l.jsp";
               break;
           case SSExtnWBMapping.EXTN_2640: // 
               wb2600 = new SSExtn2600WB();
               wb2600.insertYearlySubs(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2640_i.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2650: // 
               wb2600 = new SSExtn2600WB();
               wb2600.getDlvaddr(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2650_l.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2700: // 
               wb2700 = new SSExtn2700WB();
               wb2700.init(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2700_a.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2710: // 
               wb2700 = new SSExtn2700WB();
               wb2700.selectEmpNwsprdrList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2710_l.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2720: // 
               wb2700 = new SSExtn2700WB();
               wb2700.selectEmpNwsprdrListRdr(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2720_l.jsp";
               break;
           
           case SSExtnWBMapping.EXTN_2730: // 
               wb2700 = new SSExtn2700WB();
               wb2700.updateEmpNwsprdr(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2730_u.jsp";
               break;
              
           case SSExtnWBMapping.EXTN_2800: //Ȯ����Ȳ-���ͺ��ڰ��� �ʱ�ȭ��
        	   wb2800 = new SSExtn2800WB();
        	   wb2800.selectInitList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2800_a.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2810: //Ȯ����Ȳ-���ͺ��ڰ��� ��ȸ
               wb2800 = new SSExtn2800WB();
               wb2800.selectRdrareaList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2810_l.jsp";
               break;

           case SSExtnWBMapping.EXTN_2820: //Ȯ����Ȳ-���ͺ��ڰ��� ��ȭ��
               wb2800 = new SSExtn2800WB();
               wb2800.selectRdrareaDetail(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2820_s.jsp";
               break;
               
           case SSExtnWBMapping.EXTN_2900: 
               nextPage = "/jsp/ss/extn/ss_extn_2900_a.jsp";
               break;
           case SSExtnWBMapping.EXTN_2901:        	   
               wb2900 = new SSExtn2900WB();
               wb2900.selectKyoboEventList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2901_l.jsp";
               break;   
           case SSExtnWBMapping.EXTN_2902: 	   
               wb2900 = new SSExtn2900WB();
               wb2900.updateKyoboEventDeli(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_2902_u.jsp";
               break;
           case SSExtnWBMapping.EXTN_2903:
               wb2100 = new SSExtn2100WB();
	           wb2100.detailhdqt(req, res);
	           nextPage = "/jsp/ss/extn/ss_extn_2903_s.jsp";
	           break;
          
          case SSExtnWBMapping.EXTN_3000:
               wb3000 = new SSExtn3000WB();
               wb3000.selectSuspDefInit(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_3000_a.jsp";
               break;
          case SSExtnWBMapping.EXTN_3010:
        	   wb3000 = new SSExtn3000WB();
        	   wb3000.selectSuspDefList(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_3010_l.jsp";
               break;
          case SSExtnWBMapping.EXTN_3020:
        	   wb3000 = new SSExtn3000WB();
        	   wb3000.selectSuspDefDetail(req, res);
               nextPage = "/jsp/ss/extn/ss_extn_3020_s.jsp";
               break;  
          case SSExtnWBMapping.EXTN_3030:
	       	   wb3000 = new SSExtn3000WB();
	       	   wb3000.selectSuspDefPrint(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3030_p.jsp";
              break;       
              
          case SSExtnWBMapping.EXTN_3100: //Ȯ��ν�����-���˸����ȸ-�ʱ�ȭ��
        	  wb3100 = new SSExtn3100WB();
              wb3100.initExtnClos(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3100_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_3101: //Ȯ��ν�����-���˸����ȸ
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosList(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3101_l.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3102: //Ȯ��ν�����-����ȸ
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosDtls(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3102_s.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3103: //Ȯ��ν�����-���Ȯ�θ������
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosUpdate(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3103_i.jsp";
              break;
          case SSExtnWBMapping.EXTN_3104: //Ȯ��ν�����-����IS�����ݿ�
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.updateExtnclosIssup(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3104_i.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3105: //Ȯ��ν�����-��ǥ��ȸ
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnclosReport(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3105_l.jsp";
              break;              
          case SSExtnWBMapping.EXTN_3106: //Ȯ��ν�����-���˸���
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.updateExtnClosClose(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3106_i.jsp";
              break;              
          /*case SSExtnWBMapping.EXTN_3107: //Ȯ��ν�����-���˸���������ȸ
        	  wb3100 = new SSExtn3100WB();
        	  wb3100.selectExtnClosInfo(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3107_i.jsp";
              break;     	*/
          case SSExtnWBMapping.EXTN_3200: //Ȯ������-�ʱ�
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.selectExtnCondInit(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3200_a.jsp";
              break;   
          case SSExtnWBMapping.EXTN_3210: //Ȯ������-����Ʈ
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.selectExtnCondList(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3210_l.jsp";
              break;   
          case SSExtnWBMapping.EXTN_3220: //Ȯ������-����
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.apprExtnCond(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3220_u.jsp";
              break;   
          case SSExtnWBMapping.EXTN_3230: //Ȯ������-���ΰ���
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.apprRejExtnCond(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3230_u.jsp";
              break; 
          case SSExtnWBMapping.EXTN_3240: //Ȯ������-����
        	  wb3200 = new SSExtn3200WB();
        	  wb3200.delExtnCond(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3240_u.jsp";
              break;
          //�̼��������� ��ȸ    
          case SSExtnWBMapping.EXTN_3400: 
        	  wb3400 = new SSExtn3400WB();
        	  wb3400.initExtn3400(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3400_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3410: 
        	  wb3400 = new SSExtn3400WB();
        	  wb3400.selectExtn3410(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3410_l.jsp";
              break;
          //�繫���� ���ļ��� ��ȸ    
          case SSExtnWBMapping.EXTN_3500: 
        	  wb3500 = new SSExtn3500WB();
        	  wb3500.initExtn3500(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3500_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3510: 
        	  wb3500 = new SSExtn3500WB();
        	  wb3500.selectExtn3510(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3510_l.jsp";
              break;               
          //������ �������� ��ȸ    
          case SSExtnWBMapping.EXTN_3600: 
        	  wb3600 = new SSExtn3600WB();
        	  wb3600.initExtn3600(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3600_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3610: 
        	  wb3600 = new SSExtn3600WB();
        	  wb3600.selectExtn3610(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3610_l.jsp";
              break;              
          //1��̸����� ���� ��ȸ    
          case SSExtnWBMapping.EXTN_3700: 
        	  wb3700 = new SSExtn3700WB();
        	  wb3700.initExtn3700(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3700_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3710: 
        	  wb3700 = new SSExtn3700WB();
        	  wb3700.selectExtn3710(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3710_l.jsp";
              break;               
          //������ ������� ��ȸ  
          case SSExtnWBMapping.EXTN_3800: 
        	  wb3800 = new SSExtn3800WB();
        	  wb3800.initExtn3800(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3800_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3810: 
        	  wb3800 = new SSExtn3800WB();
        	  wb3800.selectExtn3810(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3810_l.jsp";
              break;   
          //����ó�̻� ���� ��ȸ
          case SSExtnWBMapping.EXTN_3900: 
        	  wb3900 = new SSExtn3900WB();
        	  wb3900.initExtn3900(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3900_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_3910: 
        	  wb3900 = new SSExtn3900WB();
        	  wb3900.selectExtn3910(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_3910_l.jsp";
              break; 
          //�ٺμ� �Է� ���� ��ȸ
          case SSExtnWBMapping.EXTN_4000: 
        	  wb4000 = new SSExtn4000WB();
        	  wb4000.initExtn4000(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4000_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4010: 
        	  wb4000 = new SSExtn4000WB();
        	  wb4000.selectExtn4010(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4010_l.jsp";
              break; 
          //�ܰ��̻� ���� ��ȸ
          case SSExtnWBMapping.EXTN_4100: 
        	  wb4100 = new SSExtn4100WB();
        	  wb4100.initExtn4100(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4100_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4110: 
        	  wb4100 = new SSExtn4100WB();
        	  wb4100.selectExtn4110(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4110_l.jsp";
              break; 
          //Ȯ�����Ǻ� ���� ��ȸ
          case SSExtnWBMapping.EXTN_4200: 
        	  wb4200 = new SSExtn4200WB();
        	  wb4200.initExtn4200(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4200_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4210: 
        	  wb4200 = new SSExtn4200WB();
        	  wb4200.selectExtn4210(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4210_l.jsp";
              break;
          case SSExtnWBMapping.EXTN_3300: //�������˵��ڰ���-�������  20151111 �弱��
              nextPage = "/jsp/ss/extn/ss_extn_3300_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_3310: //�������˵��ڰ���-��������Ʈ
        	  wb3300 = new SSExtn3300WB();
        	  wb3300.selectMoSvyList(req, res);
        	  System.out.println("------SSExtnServlet3310------");
        	  nextPage = "/jsp/ss/extn/ss_extn_3310_l.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_3320: //�������˵��ڰ���-������
        	  wb3300 = new SSExtn3300WB();
        	  wb3300.selectMoSvyDetail(req, res);
        	  System.out.println("------SSExtnServlet3320------");
        	  nextPage = "/jsp/ss/extn/ss_extn_3320_s.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_3330: //�������˵��ڰ���-�����߰�,����
        	  wb3300 = new SSExtn3300WB();
        	  wb3300.MoSvyUpdate(req, res);
        	  System.out.println("------SSExtnServlet3330------");
        	  nextPage = "/jsp/ss/extn/ss_extn_3330_u.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_3340: //�������˵��ڰ���-�������-������ι����ϰ�����
              wb3300 = new SSExtn3300WB();
              wb3300.MoDelete(req, res);
              System.out.println("------SSExtnServlet3340------");
              nextPage = "/jsp/ss/extn/ss_extn_3340_u.jsp";
              break;	  
          case SSExtnWBMapping.EXTN_4300: //�������˵��ڰ���-��������-�ʱ�ȭ�� 20151127 �弱��
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyRdrInit(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4300_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_4310: //�������˵��ڰ���-��������-���ڸ���Ʈ
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyRdrList(req, res);
        	  System.out.println("------SSExtnServlet4310------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4310_l.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_4320: //�������˵��ڰ���-��������-���ڻ� �� ���丮��Ʈ
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyRdrDetail(req, res);
        	  System.out.println("------SSExtnServlet4320------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4320_s.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_4330: //�������˵��ڰ���-��������-��������, �ν�Ȯ��, ��ü����
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyBsComp(req, res);
        	  System.out.println("------SSExtnServlet4330------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4330_u.jsp";
        	  break;
          case SSExtnWBMapping.EXTN_4340: //�������˵��ڰ���-��������-�������,ķ������������ ��������Ʈ
        	  wb4300 = new SSExtn4300WB();
        	  wb4300.svyList(req, res);
        	  System.out.println("------SSExtnServlet4340------");
        	  nextPage = "/jsp/ss/extn/ss_extn_4340_l.jsp";
        	  break;	  
          //����ó �ߺ�����
          case SSExtnWBMapping.EXTN_4400: 
        	  wb4400 = new SSExtn4400WB();
        	  wb4400.initExtn4400(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4400_a.jsp";
              break;      
          case SSExtnWBMapping.EXTN_4410: 
        	  wb4400 = new SSExtn4400WB();
        	  wb4400.selectExtn4410(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4410_l.jsp";
              break;
/*          case SSExtnWBMapping.EXTN_4500:  //����������-�ʱ�
        	  wb4500 = new SSExtn4500WB();
        	  wb4500.freeNwspInit(req, res);
        	  nextPage = "/jsp/ss/extn/ss_extn_4500_l.jsp";
        	  break;
*/
          case SSExtnWBMapping.EXTN_4510:  //����������-��ȸ
        	  wb4500 = new SSExtn4500WB();
        	  wb4500.freeNwspList(req, res);
        	  nextPage = "/jsp/ss/extn/ss_extn_4510_l.jsp";
        	  break;
          //����Ŀ�Ȯ��-��Ϲ���ȸ
          case SSExtnWBMapping.EXTN_4600: 
        	  wb4600 = new SSExtn4600WB();
        	  wb4600.initExtn4600(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4600_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_4601:
	            wb4600 = new SSExtn4600WB();
	            wb4600.getUserInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4601_l.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4602:
	            wb4600 = new SSExtn4600WB();
	            wb4600.getDncompInfo(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4602_l.jsp";
	            break;     
          case SSExtnWBMapping.EXTN_4610:
	            wb4600 = new SSExtn4600WB();
	            wb4600.uploadExtn4610(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4620:
	            wb4600 = new SSExtn4600WB();
	            wb4600.selectExtn4620(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4620_l.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4630:
	            wb4600 = new SSExtn4600WB();
	            wb4600.saveExtn4630(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4640:
	            wb4600 = new SSExtn4600WB();
	            wb4600.closExtn4640(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4650:
	            wb4600 = new SSExtn4600WB();
	            wb4600.selectExtn4650(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4650_l.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_4660:
	            wb4600 = new SSExtn4600WB();
	            wb4600.stopExtn4660(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_4610_i.jsp";
	            break;  
          case SSExtnWBMapping.EXTN_4700:
              nextPage = "/jsp/ss/extn/ss_extn_4700_a.jsp";
              break;
          case SSExtnWBMapping.EXTN_4710: 
        	  wb4700 = new SSExtn4700WB();
        	  wb4700.selectExtn4710(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4710_l.jsp";
              break; 
          case SSExtnWBMapping.EXTN_4720: 
        	  wb4700 = new SSExtn4700WB();
        	  wb4700.selectExtn4720(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4720_l.jsp";
              break;
          case SSExtnWBMapping.EXTN_4730: 
        	  wb4700 = new SSExtn4700WB();
        	  wb4700.updateExtn4730(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4730_u.jsp";
              break;
          case SSExtnWBMapping.EXTN_4800: 
        	  wb4800 = new SSExtn4800WB();
        	  wb4800.initExtn4800(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_4800_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_4810:
	          wb4800 = new SSExtn4800WB();
	          wb4800.selectExtn4810(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4810_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4820:
	          wb4800 = new SSExtn4800WB();
	          wb4800.updateExtn4820(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4820_u.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4830:
	          wb4800 = new SSExtn4800WB();
	          wb4800.selectExtn4830(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4830_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_4840:
	          wb4800 = new SSExtn4800WB();
	          wb4800.updateExtn4840(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4820_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_4850:
	          wb4800 = new SSExtn4800WB();
	          wb4800.updateExtn4850(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4820_u.jsp";
	          break;    
          case SSExtnWBMapping.EXTN_4900:
	          wb4900 = new SSExtn4900WB();
	          wb4900.initExtn4900(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4900_a.jsp";
	          break; 
          case SSExtnWBMapping.EXTN_4901:
	          wb4900 = new SSExtn4900WB();
	          wb4900.selectExtn4901(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4901_l.jsp";
	          break;      
          case SSExtnWBMapping.EXTN_4910:
	          wb4900 = new SSExtn4900WB();
	          wb4900.selectExtn4910(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4910_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4920:
	          wb4900 = new SSExtn4900WB();
	          wb4900.updateExtn4920(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4920_i.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_4930:
	          wb4900 = new SSExtn4900WB();
	          wb4900.selectExtn4930(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_4930_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5000:
	          wb5000 = new SSExtn5000WB();
	          wb5000.initExtn5000(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5000_a.jsp";
	          break;     
          case SSExtnWBMapping.EXTN_5010:
	          wb5000 = new SSExtn5000WB();
	          wb5000.selectExtn5010(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5010_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5020:
	          wb5000 = new SSExtn5000WB();
	          wb5000.selectExtn5020(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5020_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5030:
	          wb5000 = new SSExtn5000WB();
	          wb5000.updateExtn5030(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5030_i.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5040:
	          wb5000 = new SSExtn5000WB();
	          wb5000.excelExtn5040(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5040_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5110:
	          wb5100 = new SSExtn5100WB();
	          wb5100.selectExtn5110(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5110_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5120:
	          wb5100 = new SSExtn5100WB();
	          wb5100.selectExtn5120(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5120_l.jsp";
	          break;      
          case SSExtnWBMapping.EXTN_5130:
	          wb5100 = new SSExtn5100WB();
	          wb5100.updateExtn5130(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5130_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5210:
	          wb5200 = new SSExtn5200WB();
	          wb5200.selectExtn5210(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5210_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5220:
	          wb5200 = new SSExtn5200WB();
	          wb5200.updateExtn5220(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5220_u.jsp";
	          break; 
          case SSExtnWBMapping.EXTN_5230:
	          wb5200 = new SSExtn5200WB();
	          wb5200.updateExtn5230(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5220_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5300: 
        	  wb5300 = new SSExtn5300WB();
        	  wb5300.initExtn5300(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_5300_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_5310:
	          wb5300 = new SSExtn5300WB();
	          wb5300.selectExtn5310(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5310_l.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5320:
	          wb5300 = new SSExtn5300WB();
	          wb5300.updateExtn5320(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5320_u.jsp";
	          break;  
          case SSExtnWBMapping.EXTN_5330:
	          wb5300 = new SSExtn5300WB();
	          wb5300.selectExtn5330(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5330_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5340:
	          wb5300 = new SSExtn5300WB();
	          wb5300.updateExtn5340(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5320_u.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5400: 
        	  wb5400 = new SSExtn5400WB();
        	  wb5400.initExtn5400(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_5400_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_5410:
	          wb5400 = new SSExtn5400WB();
	          wb5400.selectExtn5410(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5410_l.jsp";
	          break;          
          case SSExtnWBMapping.EXTN_5420:
	          wb5400 = new SSExtn5400WB();
	          wb5400.selectExtn5420(req, res);
	          nextPage = "/jsp/ss/extn/ss_extn_5420_l.jsp";
	          break;
          case SSExtnWBMapping.EXTN_5500: 
        	  wb5500 = new SSExtn5500WB();
        	  wb5500.initExtn5500(req, res);
              nextPage = "/jsp/ss/extn/ss_extn_5500_a.jsp";
              break;  
          case SSExtnWBMapping.EXTN_5510:
	            wb5500 = new SSExtn5500WB();
	            wb5500.uploadExtn5510(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5510_i.jsp";
	            break; 
          case SSExtnWBMapping.EXTN_5520:
	            wb5500 = new SSExtn5500WB();
	            wb5500.selectExtn5520(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5520_l.jsp";
	            break;     
          case SSExtnWBMapping.EXTN_5530:
	            wb5500 = new SSExtn5500WB();
	            wb5500.deleteExtn5530(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5510_i.jsp";
	            break;
          case SSExtnWBMapping.EXTN_5601:
	            wb5600 = new SSExtn5600WB();
	            wb5600.selectExtn5601(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5601_l.jsp";
	            break;       
          case SSExtnWBMapping.EXTN_5610:
	            wb5600 = new SSExtn5600WB();
	            wb5600.selectExtn5610(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5610_l.jsp";
	            break; 
	      case SSExtnWBMapping.EXTN_5620:
		        wb5600 = new SSExtn5600WB();		        
	            wb5600.insertExtn5620(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5620_i.jsp";
	            break;	    	    
	      case SSExtnWBMapping.EXTN_5630:
	            wb5600 = new SSExtn5600WB();
	            wb5600.updateExtn5630(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5620_i.jsp";
	            break;         
	      case SSExtnWBMapping.EXTN_5700:
	            wb5700 = new SSExtn5700WB();
	            wb5700.initExtn5700(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5700_a.jsp";
	            break;       
          case SSExtnWBMapping.EXTN_5710:
	            wb5700 = new SSExtn5700WB();
	            wb5700.selectExtn5710(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5710_l.jsp";
	            break; 
	      case SSExtnWBMapping.EXTN_5720:
		        wb5700 = new SSExtn5700WB();		        
	            wb5700.insertExtn5720(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5720_i.jsp";
	            break;	    	    
	      case SSExtnWBMapping.EXTN_5730:
	            wb5700 = new SSExtn5700WB();
	            wb5700.selectExtn5730(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5730_l.jsp";
	            break;       
	      case SSExtnWBMapping.EXTN_5800:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.ininExtn5800(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5800_a.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5810:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.selectExtn5800WB(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5810_l.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5820:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.updateExtn5800(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5820_u.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5830:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.dlvComplete(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5830_u.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5840:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.isDlvChg(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5840_u.jsp";
	            break;   
	      case SSExtnWBMapping.EXTN_5850:
	    	  	wb5800 = new SSExtn5800WB();
	    	  	wb5800.isPayCanc(req, res);
	            nextPage = "/jsp/ss/extn/ss_extn_5840_u.jsp";
	            break;         
	      default:	
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
