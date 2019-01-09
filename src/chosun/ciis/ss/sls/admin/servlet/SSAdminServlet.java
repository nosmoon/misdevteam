/***************************************************************************************************
 * ���ϸ� : SSAdminServlet.java
 * ��� : ������ ����
 * �ۼ����� : 2004-03-12
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� : ���������� �߰�
 * ������ : �迵��
 * �������� : 2005-01-28
 * ��� : �߰�
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.wb.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * �Ǹű� �������� ������ Servlet
 */

public class SSAdminServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/admin/";
            iPid = extractPid(req, servletMappedUrl);
System.out.println("SSAdminServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
System.out.println("SSAdminServlet : process : nextPage : " + nextPage);
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
     * SSAdminWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        SSAdmin1000WB wb1000 = null; //������-�����ڵ�,�����ȣ,�����ڵ�
        SSAdmin1100WB wb1100 = null; //������-�۾�-���̱׷��̼�
        SSAdmin1200WB wb1200 = null; //������-�۾�-���̱׷��̼�-����
        SSAdmin1300WB wb1300 = null; //������-���ϸ���
        SSAdmin1400WB wb1400 = null; //������-�۾�-�۾�
        SSAdmin1500WB wb1500 = null; //������-����������
        SSAdmin1600WB wb1600 = null; //������-��纰 �����ȣ ����ó��
        SSAdmin1700WB wb1700 = null;
        SSAdmin1800WB wb1800 = null;
        SSAdmin1900WB wb1900 = null;
        SSAdmin2000WB wb2000 = null;
        SSAdmin2100WB wb2100 = null; //������-����ϰ���(�α��ν���) 20160922 �弱��

        /*******************************************����Ͽ�******************************************************************/
        SSAdmin12100WB wb12100 = null;


        switch (pid) {

	        case SSAdminWBMapping.ADMIN_10000: //������-�����ڵ�-�ʱ�ȭ��
	            wb1000 = new SSAdmin1000WB();

	            java.util.Calendar systime10 = java.util.Calendar.getInstance();
	            StringBuffer sb = new StringBuffer();
	            sb.append(systime10.get(java.util.Calendar.YEAR));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.MONTH));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.DAY_OF_MONTH));
	            sb.append(" ");
	            sb.append(systime10.get(java.util.Calendar.HOUR_OF_DAY));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.MINUTE));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.SECOND));
	            sb.append(".");
	            sb.append(systime10.get(java.util.Calendar.MILLISECOND));

	            System.out.println("=====Servlet ENTRY1 TIME======: " + sb.toString());
	            req.setAttribute("SVR Entry", "\nSVR Entry \t : " + sb.toString());
	            wb1000.initCode(req, res);

	            systime10 = java.util.Calendar.getInstance();
	            sb = new StringBuffer();
	            sb.append(systime10.get(java.util.Calendar.YEAR));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.MONTH));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.DAY_OF_MONTH));
	            sb.append(" ");
	            sb.append(systime10.get(java.util.Calendar.HOUR_OF_DAY));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.MINUTE));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.SECOND));
	            sb.append(".");
	            sb.append(systime10.get(java.util.Calendar.MILLISECOND));
	            System.out.println("=====Servlet DONE TIME======: " + sb.toString());
	            req.setAttribute("SVR Done", "\nSVR Done \t : " + sb.toString());
	            nextPage = "/jsp/ss/admin/ss_admin_10000_a.jsp";
	       break;


            // ������-�����ڵ�
	       	//������������-CRM�����ڵ�
	       	//2009�� 11�� 3�� EJB ����
            case SSAdminWBMapping.ADMIN_1000: //������-�����ڵ�-�ʱ�ȭ��
                wb1000 = new SSAdmin1000WB();

                java.util.Calendar systime = java.util.Calendar.getInstance();
                StringBuffer sb1 = new StringBuffer();
                sb1.append(systime.get(java.util.Calendar.YEAR));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.MONTH));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb1.append(" ");
                sb1.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.MINUTE));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.SECOND));
                sb1.append(".");
                sb1.append(systime.get(java.util.Calendar.MILLISECOND));

                System.out.println("=====Servlet ENTRY1 TIME======: " + sb1.toString());
                req.setAttribute("SVR Entry", "\nSVR Entry \t : " + sb1.toString());
                wb1000.initCode(req, res);

                systime = java.util.Calendar.getInstance();
                sb1 = new StringBuffer();
                sb1.append(systime.get(java.util.Calendar.YEAR));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.MONTH));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb1.append(" ");
                sb1.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.MINUTE));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.SECOND));
                sb1.append(".");
                sb1.append(systime.get(java.util.Calendar.MILLISECOND));
                System.out.println("=====Servlet DONE TIME======: " + sb1.toString());
                req.setAttribute("SVR Done", "\nSVR Done \t : " + sb1.toString());
                nextPage = "/jsp/ss/admin/ss_admin_1000_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1003: //������-�����ڵ�-�ڵ屸�� ���
                wb1000 = new SSAdmin1000WB();
                wb1000.selectCodeGBList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1003_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1005: //������-�����ڵ�-���
                wb1000 = new SSAdmin1000WB();
                wb1000.selectCodeList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1005_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1010: //������-�����ڵ�-��
                wb1000 = new SSAdmin1000WB();
                wb1000.selectCodeDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1010_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1015: //������-�����ڵ�-���
                wb1000 = new SSAdmin1000WB();
                wb1000.insertCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1015_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1020: //������-�����ڵ�-����
                wb1000 = new SSAdmin1000WB();
                wb1000.updateCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1020_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1025: //������-�����ڵ�-����
                wb1000 = new SSAdmin1000WB();
                wb1000.deleteCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1025_d.jsp";
                break;

                // ������-�����ȣ
            case SSAdminWBMapping.ADMIN_1030: //������-�����ȣ-�ʱ�ȭ��
                wb1000 = new SSAdmin1000WB();
                wb1000.initZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1030_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1035: //������-�����ȣ-���
                wb1000 = new SSAdmin1000WB();
                wb1000.selectZipList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1035_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1040: //������-�����ȣ-��
                wb1000 = new SSAdmin1000WB();
                wb1000.selectZipDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1040_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1045: //������-�����ȣ-����
                wb1000 = new SSAdmin1000WB();
                wb1000.accessZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1045_a.jsp";
                break;

                // ������-�����ڵ�
            case SSAdminWBMapping.ADMIN_1050:

                // �����ڵ� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/admin/ss_admin_1050_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1055:
                wb1000 = new SSAdmin1000WB();
                wb1000.selectBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1055_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1060:
                wb1000 = new SSAdmin1000WB();
                wb1000.detailBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1060_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1065:
                wb1000 = new SSAdmin1000WB();
                wb1000.actionBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1065_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1070:
                wb1000 = new SSAdmin1000WB();
                wb1000.actionBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1070_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1075:
                wb1000 = new SSAdmin1000WB();
                wb1000.actionBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1075_d.jsp";
                break;

                // ������-�����ڵ�
            case SSAdminWBMapping.ADMIN_1080:
                wb1000 = new SSAdmin1000WB();
                wb1000.initAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1080_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1082:
                wb1000 = new SSAdmin1000WB();
                wb1000.selectAcctcdList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1082_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1084:
                wb1000 = new SSAdmin1000WB();
                wb1000.selectAcctcdDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1084_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1086:
                wb1000 = new SSAdmin1000WB();
                wb1000.insertAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1086_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1088:
                wb1000 = new SSAdmin1000WB();
                wb1000.updateAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1088_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1090:
                wb1000 = new SSAdmin1000WB();
                wb1000.deleteAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1090_d.jsp";
                break;

                // ������-�۾�-���̱׷��̼�
            case SSAdminWBMapping.ADMIN_1100: //������-�۾�-���̱׷��̼�-�ʱ�ȭ��
                wb1100 = new SSAdmin1100WB();
                wb1100.initMig(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1100_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1105: //������-�۾�-���̱׷��̼�-���
                wb1100 = new SSAdmin1100WB();
                wb1100.selectMigList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1105_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1110: //������-�۾�-���̱׷��̼�-����DB���ε�
                wb1100 = new SSAdmin1100WB();
                //wb1100.boUpload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1110_a.jsp";
                break;
                // ���� Ȯ���� DM, DataSet ���� ó���Ѵ�.(���ν��� ȣ���� �ƴ� ���� ���� IO)
            case SSAdminWBMapping.ADMIN_1113: //������-�۾�-���̱׷��̼�-����DB���ε� ���� Ȯ��
                wb1100 = new SSAdmin1100WB();
                wb1100.showError(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1113_p.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1115: //������-�۾�-���̱׷��̼�-����DB���ε�
                wb1100 = new SSAdmin1100WB();
                wb1100.billUpload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1115_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1120: //������-�۾�-���̱׷��̼�-�����ڷ���ȯ
                wb1100 = new SSAdmin1100WB();
                wb1100.boConvert(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1120_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1125: //������-�۾�-���̱׷��̼�-�����ڷ���ȯ
                wb1100 = new SSAdmin1100WB();
                wb1100.billConvert(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1125_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1130: //������-�۾�-���̱׷��̼�-����DB���ε� �۾��̷�
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoUploadHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1130_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1135: //������-�۾�-���̱׷��̼�-����DB���ε� �۾��̷�
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillUploadHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1135_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1140: //������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾��̷�
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoConvertHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1140_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1145: //������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾��̷�
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillConvertHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1145_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1150: //������-�۾�-���̱׷��̼�-����DB���ε� �۾�����
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoUploadPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1150_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1155: //������-�۾�-���̱׷��̼�-����DB���ε� �۾�����
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillUploadPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1155_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1160: //������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾�����
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoConvertPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1160_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1165: //������-�۾�-���̱׷��̼�-�����ڷ���ȯ �۾�����
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillConvertPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1165_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1170: //������-�۾�-���̱׷��̼� ��Ȳ-�ʱ�ȭ��
                wb1100 = new SSAdmin1100WB();
                wb1100.initMigInfo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1170_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1175: //������-�۾�-���̱׷��̼� ��Ȳ-���
                wb1100 = new SSAdmin1100WB();
                wb1100.selectMigInfoList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1175_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1180: //������-�۾�-���̱׷��̼� ��Ȳ-����
                wb1100 = new SSAdmin1100WB();
                wb1100.updateMigInfo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1180_u.jsp";
                break;

                // ������-�۾�-���̱׷��̼�-����
            case SSAdminWBMapping.ADMIN_1200: //������-�۾�-���̱׷��̼�-����
                wb1200 = new SSAdmin1200WB();
                wb1200.init(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1200_a.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1205: //������-�۾�-���̱׷��̼�-����
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMigBOCDList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1205_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1210: //������-�۾�-���̱׷��̼�-����
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRMECD(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1210_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1215: //������-�۾�-���̱׷��̼�-����
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRGUYUK(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1215_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1220: //������-�۾�-���̱׷��̼�-����
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRSGBANG(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1220_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1230: //������-�۾�-���̱׷��̼�-����-����������ȸ
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRERR(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1230_l.jsp";
                break;

                // ������-���ϸ���
            case SSAdminWBMapping.ADMIN_1300: //������-���ϸ���-�ʱ�ȭ��
                wb1300 = new SSAdmin1300WB();
                wb1300.initPayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1300_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1305: //������-���ϸ���-���
                wb1300 = new SSAdmin1300WB();
                wb1300.selectPayBasiList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1305_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1310: //������-���ϸ���-��
                wb1300 = new SSAdmin1300WB();
                wb1300.selectPayBasiDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1310_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1315: //������-���ϸ���-���
                wb1300 = new SSAdmin1300WB();
                wb1300.insertPayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1315_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1320: //������-���ϸ���-����
                wb1300 = new SSAdmin1300WB();
                wb1300.updatePayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1320_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1325: //������-���ϸ���-����
                wb1300 = new SSAdmin1300WB();
                wb1300.deletePayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1325_d.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1330: //������-���ϸ���-����-�ʱ�ȭ��

                // �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/admin/ss_admin_1330_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1335: //������-���ϸ���-����-���
                wb1300 = new SSAdmin1300WB();
                wb1300.selectMigClosList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1335_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1340: //������-���ϸ���-����-��
                wb1300 = new SSAdmin1300WB();
                wb1300.selectMigClosDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1340_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1345: //������-���ϸ���-����-���
                wb1300 = new SSAdmin1300WB();
                wb1300.insertMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1345_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1350: //������-���ϸ���-����-����
                wb1300 = new SSAdmin1300WB();
                wb1300.updateMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1350_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1355: //������-���ϸ���-����-����
                wb1300 = new SSAdmin1300WB();
                wb1300.deleteMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1355_d.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1360: //������-���ϸ���-����-����
                wb1300 = new SSAdmin1300WB();
                wb1300.closeMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1360_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1365: //������-���ϸ���-����-�������
                wb1300 = new SSAdmin1300WB();
                wb1300.closeCancelMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1365_a.jsp";
                break;

                // ������-�۾�-���,�۾��̷�
            case SSAdminWBMapping.ADMIN_1400: //������-�۾�-���-�ʱ�ȭ��
                wb1400 = new SSAdmin1400WB();
                wb1400.initWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1400_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1405: //������-�۾�-���-���
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1405_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1410: //������-�۾�-���-��
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1410_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1415: //������-�۾�-���-���
                wb1400 = new SSAdmin1400WB();
                wb1400.insertWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1415_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1420: //������-�۾�-���-����
                wb1400 = new SSAdmin1400WB();
                wb1400.updateWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1420_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1425: //������-�۾�-���-����
                wb1400 = new SSAdmin1400WB();
                wb1400.deleteWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1425_d.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1427: //������-�۾�-���-�������� �˾�

                // �������� �˾��� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/admin/ss_admin_1427_p.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1430: //������-�۾�-���-��������
                wb1400 = new SSAdmin1400WB();
                wb1400.runWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1430_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1435: //������-�۾�-�̷�-�ʱ�ȭ��

                // �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                wb1400 = new SSAdmin1400WB();
                wb1400.initWrkHist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1435_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1440: //������-�۾�-�̷�-���(�̷�)
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1440_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1445: //������-�۾�-�̷�-���(����)
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1445_l.jsp";
                break;

            //2005-01-28 �迵�� �߰�
            //������-����������
            case SSAdminWBMapping.ADMIN_1500: //������-����������-�ʱ�ȭ��
                wb1500 = new SSAdmin1500WB();
                wb1500.initBoclos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1500_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1505: //������-����������-���
                wb1500 = new SSAdmin1500WB();
                wb1500.selectBoclosList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1505_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1510: //������-����������-��
                wb1500 = new SSAdmin1500WB();
                wb1500.selectBoclosDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1510_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1515: //������-����������-����
                wb1500 = new SSAdmin1500WB();
                wb1500.closeBoclos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1515_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1520: //������-����������-�������
                wb1500 = new SSAdmin1500WB();
                wb1500.closeCancelBoclos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1520_a.jsp";
                break;

            //2009-04-27 �����ȣ ���� �ű԰��� �߰� ������
            case SSAdminWBMapping.ADMIN_1600: //������-��纰 �����ȣ ����ó��-�ʱ�ȭ��
            	wb1600 = new SSAdmin1600WB();
                wb1600.initZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1600_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1601: //������-��纰 �����ȣ ����ó��-��ȸ
            	wb1600 = new SSAdmin1600WB();
            	wb1600.selectZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1601_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1607: //������-��纰 �����ȣ ����ó��-����ȸ
            	wb1600 = new SSAdmin1600WB();
            	wb1600.detailZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1607_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1602: //������-��纰 �����ȣ ����ó��-������ȸ
            	wb1600 = new SSAdmin1600WB();
            	wb1600.unionZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1602_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1603: //������-��纰 �����ȣ ����ó��-�Ǹű� ����
            	wb1600 = new SSAdmin1600WB();
            	wb1600.copyZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1603_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1604: //������-��纰 �����ȣ ����ó��-����
            	wb1600 = new SSAdmin1600WB();
            	wb1600.deleteZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1604_d.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1605: //������-��纰 �����ȣ ����ó��-���ο�û
            	wb1600 = new SSAdmin1600WB();
            	wb1600.reqZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1605_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1606: //������-��纰 �����ȣ ����ó��-����(�ϴ�
            	wb1600 = new SSAdmin1600WB();
            	wb1600.updateZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1606_u.jsp";
                break;

            //2009-05-07 �����ȣ ���� �ű԰��� �߰� ������
            case SSAdminWBMapping.ADMIN_1610: //������-������ �����ȣ ����ó��-�ʱ�ȭ��
            	wb1600 = new SSAdmin1600WB();
            	wb1600.initMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1610_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1611: //������-������ �����ȣ ����ó��-��ȸ
            	wb1600 = new SSAdmin1600WB();
            	wb1600.selectMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1611_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1612: //������-������ �����ȣ ����ó��-����
            	wb1600 = new SSAdmin1600WB();
            	wb1600.updateMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1612_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1613: //������-������ �����ȣ ����ó��-����
            	wb1600 = new SSAdmin1600WB();
            	wb1600.apprMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1613_u.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1699: //������-��纰 �����ȣ ���� �ϰ����
            	wb1600 = new SSAdmin1600WB();
            	wb1600.uploadZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1699_i.jsp";
                break;

            //2009-05-08 �����ȣ ���� �ű԰��� �߰� ������
            case SSAdminWBMapping.ADMIN_1621: //������-�ϰ� �����ȣ ����ó��-��ȸ
            	wb1600 = new SSAdmin1600WB();
            	wb1600.selectBatZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1621_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1622: //������-�ϰ� �����ȣ ����ó��-�ϰ�����
            	wb1600 = new SSAdmin1600WB();
            	wb1600.updateBatZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1622_u.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1700: //���ּ� ���� �ʱ�ȭ��
            	wb1700 = new SSAdmin1700WB();
                nextPage = "/jsp/ss/admin/ss_admin_1700_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1701: //���ּ� ���� ��ȸ
            	wb1700 = new SSAdmin1700WB();
            	wb1700.selectNewjusoAppr(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1701_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1702: //���ּ� ���� ��û
            	wb1700 = new SSAdmin1700WB();
            	wb1700.updateNewjusoApprReq(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1702_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1703: //���ּ� ����
            	wb1700 = new SSAdmin1700WB();
            	wb1700.updateNewjusoAppr(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1703_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1710: //���ּ� �����̷� �˾�
            	wb1700 = new SSAdmin1700WB();
            	wb1700.newjusoApprHistory(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1710_p.jsp";
                break;                     
            case SSAdminWBMapping.ADMIN_1801:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLwrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1801_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1802:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1802_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1803:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLDwload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1803_p.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1804:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLSample(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1804_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1805:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.selectSQLquerylist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1805_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1806:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.detailSQLquerylist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1806_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1807:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.insertSQLquerylist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1807_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1808:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLDwload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1808_p.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1811:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLTablelist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1811_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1812:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLColumnlist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1812_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1901:
            	wb1900 = new SSAdmin1900WB();
            	wb1900.selectAddrcdTrsfbo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1901_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1902:
            	wb1900 = new SSAdmin1900WB();
            	wb1900.selectAddrcdAcptbo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1902_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1903:
            	wb1900 = new SSAdmin1900WB();
            	wb1900.saveAddrcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1903_i.jsp";
                break;

            case SSAdminWBMapping.ADMIN_2010:
            	wb2000 = new SSAdmin2000WB();
            	wb2000.selectNewjusoChg(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_2010_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_2020:
            	wb2000 = new SSAdmin2000WB();
            	wb2000.updateNewjusoChg(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_2020_u.jsp";
                break;

           //����ϰ���
           case SSAdminWBMapping.ADMIN_2100:		//������-����ϰ���-�α��ν��� �ʱ�
            	wb2100 = new SSAdmin2100WB();
            	wb2100.initMoAplc(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_2100_a.jsp";
                break;
           case SSAdminWBMapping.ADMIN_2110:		//������-����ϰ���-�α��ν��� ��ȸ����Ʈ
               	wb2100 = new SSAdmin2100WB();
               	wb2100.selectMoAplc(req, res);
               	nextPage = "/jsp/ss/admin/ss_admin_2110_l.jsp";
                   break;
           case SSAdminWBMapping.ADMIN_2111:		//������-����ϰ���-�α����̷¸���Ʈ
        	   wb2100 = new SSAdmin2100WB();
        	   wb2100.selectLoginHist(req, res);
        	   nextPage = "/jsp/ss/admin/ss_admin_2111_l.jsp";
        	   break;
           case SSAdminWBMapping.ADMIN_2112:		//������-����ϰ���-��⺯��,�޴��ȣ�����̷¸���Ʈ
        	   wb2100 = new SSAdmin2100WB();
        	   wb2100.selectModiHist(req, res);
        	   nextPage = "/jsp/ss/admin/ss_admin_2112_l.jsp";
        	   break;
           case SSAdminWBMapping.ADMIN_2120:		//������-����ϰ���-�α��ν��� ��
              	wb2100 = new SSAdmin2100WB();
              	wb2100.detailMoAplc(req, res);
                  nextPage = "/jsp/ss/admin/ss_admin_2120_s.jsp";
                  break;

           case SSAdminWBMapping.ADMIN_2130:		//������-����ϰ���-�α��ν��� (1.������, 2.������, 3.��й�ȣ�ʱ�ȭ, 4.����, 5.��������, 6.��⺯�����)
             	wb2100 = new SSAdmin2100WB();
             	wb2100.updateMoAplc(req, res);
                 nextPage = "/jsp/ss/admin/ss_admin_2130_i.jsp";
                 break;

/*******************************************����Ͽ�******************************************************************/

/*                 //����ϰ���-���α��ν���
               case SSAdminWBMapping.ADMIN_12100:		//������-����ϰ���-�α��ν��� �ʱ�_����Ͽ�
                	wb12100 = new SSAdmin12100WB();
                	wb12100.mo_initMoAplc(req, res);
                    nextPage = "/jsp/ss/admin/mo_ss_admin_12100_a.jsp";
                    break;
*/
               case SSAdminWBMapping.ADMIN_12110:		//������-����ϰ���-�α��ν��� ��ȸ����Ʈ_����Ͽ�
                   	wb12100 = new SSAdmin12100WB();
                   	wb12100.mo_selectMoAplc(req, res);
                       nextPage = "/jsp/ss/admin/mo_ss_admin_12110_l.jsp";
                       break;
               case SSAdminWBMapping.ADMIN_12120:		//������-����ϰ���-�α��ν��� ��_����Ͽ�
                  	wb12100 = new SSAdmin12100WB();
                  	wb12100.mo_detailMoAplc(req, res);
                      nextPage = "/jsp/ss/admin/mo_ss_admin_12120_s.jsp";
                      break;
               case SSAdminWBMapping.ADMIN_12130:		//������-����ϰ���-�α��ν��� ������,����,��й�ȣ�ʱ�ȭ_����Ͽ�
                 	wb12100 = new SSAdmin12100WB();
                 	wb12100.mo_updateMoAplc(req, res);
                     nextPage = "/jsp/ss/admin/mo_ss_admin_12130_i.jsp";
                     break;



            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
