/***************************************************************************************************
 * ���ϸ�   : PSReaderServlet.java
 * ���     : ����-�����û ����
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
  * �������� : �����Է¸�� �߰�
  * ������   : ������
  * �������� : 2008-07-14
 * ���     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.reader.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.wb.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-���ڸ޴� ��ǥ ����
 */
public class PSReaderServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/reader/";
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

        PSReader1101WB  wb1101 = null;
        PSReader1201WB  wb1201 = null;
        PSReader1301WB  wb1301 = null;
        PSReader1401WB  wb1401 = null;
        PSReader1501WB  wb1501 = null;
        PSReader1601WB  wb1601 = null;
        PSReader1701WB  wb1701 = null;
        PSReader1801WB  wb1801 = null;
        PSReader1901WB  wb1901 = null;

        switch (pid) {
            //Ȯ�嵶�ڰ��� �ʱ�
            case PSReaderWBMapping.PSREADER_1101:
                wb1101 = new PSReader1101WB();
                wb1101.selectRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1101_a.jsp";
                break;
            //Ȯ�嵶�ڰ��� ����ȸ �� RESET
            case PSReaderWBMapping.PSREADER_1106:
                wb1101 = new PSReader1101WB();
                wb1101.selectRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1106_s.jsp";
                break;
            //Ȯ�嵶�ڰ��� �Է�
            case PSReaderWBMapping.PSREADER_1111:
                wb1101 = new PSReader1101WB();
                wb1101.insertRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1111_i.jsp";
                break;
            //Ȯ�嵶�ڰ��� ����
            case PSReaderWBMapping.PSREADER_1116:
                wb1101 = new PSReader1101WB();
                wb1101.updateRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1116_u.jsp";
                break;
            //Ȯ�嵶�ڰ��� ����
            case PSReaderWBMapping.PSREADER_1121:
                wb1101 = new PSReader1101WB();
                wb1101.deleteRdr_ExtnINFO(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1121_d.jsp";
                break;
            //Ȯ�嵶�ڰ��� Ȯ�嵶�ڳ��� �ʱ�
            case PSReaderWBMapping.PSREADER_1126:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1126_l.jsp";
                break;
            //Ȯ�嵶�ڰ��� Ȯ�嵶�ڳ��� �˻�
            case PSReaderWBMapping.PSREADER_1131:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1131_l.jsp";
                break;

            //Ȯ�嵶�ڳ��� �ʱ�
            case PSReaderWBMapping.PSREADER_1201:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1201_l.jsp";
                break;
            //Ȯ�嵶�ڳ��� �˻�
            case PSReaderWBMapping.PSREADER_1206:
                wb1201 = new PSReader1201WB();
                wb1201.selectRdr_Extn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1206_l.jsp";
                break;
            //Ȯ�嵶�ڸ���Ʈ ���
            case PSReaderWBMapping.PSREADER_1211:
                nextPage = "/jsp/ps/reader/ps_rdr_1211_t.jsp";
                break;
            //Ȯ�嵶������ ���
            case PSReaderWBMapping.PSREADER_1216:
                nextPage = "/jsp/ps/reader/ps_rdr_1216_t.jsp";
                break;                
            //Ȯ�������� ���
            case PSReaderWBMapping.PSREADER_1221:
                nextPage = "/jsp/ps/reader/ps_rdr_1221_t.jsp";
                break;
                
            //����-�����û���� �ʱ�
            case PSReaderWBMapping.PSREADER_1301:
                wb1301 = new PSReader1301WB();
                wb1301.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1301_s.jsp";
                break;
            //����-�����û���� ��ȸ����Ʈ
            case PSReaderWBMapping.PSREADER_1306:
                wb1301 = new PSReader1301WB();
                wb1301.selectArbtList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1306_l.jsp";
                break;
            //����-�����û���� ����ó��
            case PSReaderWBMapping.PSREADER_1311:
                wb1301 = new PSReader1301WB();
                wb1301.updateArbt(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1311_u.jsp";
                break;
            //����-�񱳴���� ��ȸ
            case PSReaderWBMapping.PSREADER_1316:
                wb1301 = new PSReader1301WB();
                wb1301.selectArbtCmprobjList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1316_l.jsp";
                break;
            //����-�񱳴���� �󼼳�����ȸ
            case PSReaderWBMapping.PSREADER_1321:
                wb1301 = new PSReader1301WB();
                wb1301.selectCmprobjDetail(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1321_p.jsp";
                break;
            //����-������ȸ �ʱ�ȭ��
            case PSReaderWBMapping.PSREADER_1401:
                wb1401 = new PSReader1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1401_s.jsp";
                break;
            //����-������ȸ ��ȸȭ��
            case PSReaderWBMapping.PSREADER_1406:
                wb1401 = new PSReader1401WB();
                wb1401.selectRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1406_l.jsp";
                break;
            //����-������ȸ ���ȭ��
            case PSReaderWBMapping.PSREADER_1411:
                nextPage = "/jsp/ps/reader/ps_rdr_1411_t.jsp";
                break;
            //����-����ȸ
            case PSReaderWBMapping.PSREADER_1416:
                wb1401 = new PSReader1401WB();
                wb1401.selectDetailInfo(req,res);
                nextPage = "/jsp/ps/reader/ps_rdr_1416_p.jsp";
                break;
            //�������ó�� �ʱ�
            case PSReaderWBMapping.PSREADER_1501:
                wb1501 = new PSReader1501WB();
                wb1501.selectAsinExtn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1501_a.jsp";
                break;
            //�������ó�� �˻�
            case PSReaderWBMapping.PSREADER_1506:
                wb1501 = new PSReader1501WB();
                wb1501.selectAsinExtn_search(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1506_l.jsp";
                break;
            //�������ó�� �񱳴���ʱ�
            case PSReaderWBMapping.PSREADER_1511:
                nextPage = "/jsp/ps/reader/ps_rdr_1511_l.jsp";
                break;
            //�������ó�� �񱳴�󸮽�Ʈ
            case PSReaderWBMapping.PSREADER_1516:
                wb1501 = new PSReader1501WB();
                wb1501.selectExstRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1516_l.jsp";
                break;
            //�������ó�� ����
            case PSReaderWBMapping.PSREADER_1521:
            	wb1501 = new PSReader1501WB();
                wb1501.updateExstRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1521_u.jsp";
                break;
            //���ڵ�ް��� �ʱ�
            case PSReaderWBMapping.PSREADER_1601:
                wb1601 = new PSReader1601WB();
                wb1601.selectGradAplcList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1601_a.jsp";
                break;
            //���ڵ�ް��� �˻�
            case PSReaderWBMapping.PSREADER_1606:
                wb1601 = new PSReader1601WB();
                wb1601.selectGradAplcList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1606_l.jsp";
                break;
            //���ڵ�ް��� ����
            case PSReaderWBMapping.PSREADER_1611:
                wb1601 = new PSReader1601WB();
                wb1601.updateGradAplcGrnt(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1611_u.jsp";
                break;
            //���ڵ�ް��� �񱳴��˻� �ʱ�
            case PSReaderWBMapping.PSREADER_1616:
                wb1601 = new PSReader1601WB();
                wb1601.selectAplcCmprList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1616_l.jsp";
                break;
            //���ڵ�ް��� �񱳴�� �˻�
            case PSReaderWBMapping.PSREADER_1621:
                wb1601 = new PSReader1601WB();
                wb1601.selectAplcCmprList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1621_l.jsp";
                break;
            //���ڵ�ް��� ���ڹ�ȣ/��ü�ڵ�� ��ȸ
            case PSReaderWBMapping.PSREADER_1626:
                wb1601 = new PSReader1601WB();
                wb1601.select_mplist(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1626_p.jsp";
                break;

            //���ں�����Ʈ �ʱ�
            case PSReaderWBMapping.PSREADER_1701:
                wb1401 = new PSReader1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1701_a.jsp";
                break;
            //���ں�����Ʈ �˻�
            case PSReaderWBMapping.PSREADER_1706:
                wb1701 = new PSReader1701WB();
                wb1701.selectTodayInputList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1706_l.jsp";
                break;
            //���ں�����Ʈ ���
            case PSReaderWBMapping.PSREADER_1711:
                nextPage = "/jsp/ps/reader/ps_rdr_1711_t.jsp";
                break;

            //����-������ȸ �ʱ�ȭ��
            case PSReaderWBMapping.PSREADER_1801:
                wb1401 = new PSReader1401WB();
                wb1401.selectCodeList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1801_s.jsp";
                break;
            //����-������ȸ ��ȸȭ��
            case PSReaderWBMapping.PSREADER_1806:
                wb1801 = new PSReader1801WB();
                wb1801.selectRdrList(req, res);
                nextPage = "/jsp/ps/reader/ps_rdr_1806_l.jsp";
                break;
            //����-������ȸ ���ȭ��
            case PSReaderWBMapping.PSREADER_1811:
                nextPage = "/jsp/ps/reader/ps_rdr_1811_t.jsp";
                break;
            //����-����ȸ
            /*
            case PSReaderWBMapping.PSREADER_1816:
                wb1801 = new PSReader1801WB();
                wb1801.selectDetailInfo(req,res);
                nextPage = "/jsp/ps/reader/ps_rdr_1816_p.jsp";
                break;
            */

           //���� ���� �ʱ�
           case PSReaderWBMapping.PSREADER_1851:
               wb1401 = new PSReader1401WB();
               wb1401.selectCodeList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1851_s.jsp";
               break;
            //���� ���� ��ȸ
           case PSReaderWBMapping.PSREADER_1856:
               wb1801 = new PSReader1801WB();
               wb1801.selectBoReaderList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1856_l.jsp";
               break;
            //���� ���� �� ��ȸ
           case PSReaderWBMapping.PSREADER_1861:
               wb1801 = new PSReader1801WB();
               wb1801.selectBoReaderDetail(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1861_s.jsp";
               break;
               //������ ����(������ư)
           case PSReaderWBMapping.PSREADER_1866:
               wb1801 = new PSReader1801WB();
               wb1801.updateBoReaderInfo(req,res);
               nextPage = "/jsp/ps/reader/ps_rdr_1866_u.jsp";
               break;
           //����-������ȸ ���ȭ��
           case PSReaderWBMapping.PSREADER_1871:
               nextPage = "/jsp/ps/reader/ps_rdr_1871_t.jsp";
               break;

           //�����Է¸�� �ʱ�
           case PSReaderWBMapping.PSREADER_1901:
               wb1401 = new PSReader1401WB();
               wb1401.selectCodeList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1901_a.jsp";
               break;
           //�����Է¸�� �˻�
           case PSReaderWBMapping.PSREADER_1906:
               wb1901 = new PSReader1901WB();
               wb1901.selectClamtList(req, res);
               nextPage = "/jsp/ps/reader/ps_rdr_1906_l.jsp";
               break;
           //�����Է¸�� ���
           case PSReaderWBMapping.PSREADER_1911:
               nextPage = "/jsp/ps/reader/ps_rdr_1911_t.jsp";
               break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
