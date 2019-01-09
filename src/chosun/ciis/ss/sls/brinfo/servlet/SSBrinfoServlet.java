/***************************************************************************************************
 * ���ϸ� : SSBrinfoServlet.java
 * ��� : ����Info ����
 * �ۼ����� : 2004-01-26
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.wb.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSBrinfoServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/brinfo/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSBrinfoServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSBrinfoServlet : process : nextPage : " + nextPage);
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
     * SSBrinfoWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        SSBrinfo1000WB wb1000 = null; //����Info-����ã��
        SSBrinfo1100WB wb1100 = null; //����Info-������Ȳ
        SSBrinfo1200WB wb1200 = null; //����Info-����������
        SSBrinfo1300WB wb1300 = null; //����Info-����������Ȳ
        SSBrinfo1400WB wb1400 = null; //����Info-������ǰ��Ȳ
        SSBrinfo1500WB wb1500 = null; //����Info-����������
        SSBrinfo1600WB wb1600 = null; //����Info-�߼۳뼱
        SSReader1700WB wb1700rdr = null;

		/* ����ϰ��� wb ���� �и� �弱�� */
        SSBrinfo11600WB wb11600 = null; //����Info-�߼۳뼱_����Ͽ�


        switch (pid) {
            // ����ã��
            case SSBrinfoWBMapping.BRINFO_1000: //����Info-����ã��-�ʱ�ȭ��
                wb1000 = new SSBrinfo1000WB();
                wb1000.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1000_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1010: //����Info-����ã��-���
                wb1000 = new SSBrinfo1000WB();
                wb1000.selectBoSrchList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1010_l.jsp";
                break;
            // ����ã��
            case SSBrinfoWBMapping.BRINFO_1050: //����Info-���������ȣ-�ʱ�ȭ��
                wb1000 = new SSBrinfo1000WB();
                wb1000.initBoZip(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1050_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1055: //����Info-���������ȣ-���
                wb1000 = new SSBrinfo1000WB();
                wb1000.selectBoZipList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1055_l.jsp";
                break;
            // ������Ȳ
            case SSBrinfoWBMapping.BRINFO_1100: //����Info-������Ȳ-�ʱ�ȭ��
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoinfoInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1100_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1110: //����Info-������Ȳ-���
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoinfoList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1110_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1120: //����Info-������Ȳ-��
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoinfoDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1120_s.jsp";
                break;

                // �������°���(�ǽð�������ü)
            case SSBrinfoWBMapping.BRINFO_1150: //�����濵-
            	wb1100 = new SSBrinfo1100WB();
            	wb1100.selectBoAcctInit(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1150_a.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1155: //�����濵-�����׸�(�ǽð�������ü) ��ȸ
                wb1100 = new SSBrinfo1100WB();
                wb1100.selectBoAcctList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1155_a.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1160: //�����濵-�����׸�(�ǽð�������ü) ����
                wb1100 = new SSBrinfo1100WB();
                wb1100.updateBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1170: //�����濵-�����׸�(�ǽð�������ü) ����
                wb1100 = new SSBrinfo1100WB();
                wb1100.deleteBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1180: //�����濵-�����׸�(�ǽð�������ü) ���
                wb1100 = new SSBrinfo1100WB();
                wb1100.insertBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_1190: //�����濵-�����׸�(�ǽð�������ü) �����丮��ȸ 20150922 �弱��
                System.out.println("1190");
            	wb1100 = new SSBrinfo1100WB();
                wb1100.histBoAcctList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1190_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1195: //�����濵-�����׸�(�ǽð�������ü) ����
                wb1100 = new SSBrinfo1100WB();
                wb1100.cnfmBoAcctItem(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1160_i.jsp";
                break;

            // ����������
            case SSBrinfoWBMapping.BRINFO_1200: //����Info-����������-�ʱ�ȭ��
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1200_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1210: //����Info-����������-���
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectBoheadList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1210_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1220: //����Info-����������-��
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectBoheadDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1220_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1225: //����Info-����������-����
                wb1200 = new SSBrinfo1200WB();
                wb1200.selectBoheadSajin(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1225_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1230: //����Info-����������-����(����)
                wb1200 = new SSBrinfo1200WB();
                wb1200.updateBohead(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1230_u.jsp";
                break;
            // ����������-�Ұ�
           case SSBrinfoWBMapping.BRINFO_1240: //����Info-����������-������Ұ�-���
               wb1200 = new SSBrinfo1200WB();
               wb1200.selectBoheadIdeaList(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1240_l.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1250: //����Info-����������-������Ұ�-��
               wb1200 = new SSBrinfo1200WB();
               wb1200.selectBoheadIdeaDetail(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1250_s.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1260: //����Info-����������-������Ұ�-���
               wb1200 = new SSBrinfo1200WB();
               wb1200.accessBoheadIdea(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1260_i.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1270: //����Info-����������-������Ұ�-����
               wb1200 = new SSBrinfo1200WB();
               wb1200.accessBoheadIdea(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1270_u.jsp";
               break;
           case SSBrinfoWBMapping.BRINFO_1280: //����Info-����������-������Ұ�-����
               wb1200 = new SSBrinfo1200WB();
               wb1200.accessBoheadIdea(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1280_d.jsp";
               break;

            // ����������Ȳ
            case SSBrinfoWBMapping.BRINFO_1300: //����Info-����������Ȳ-�ʱ�ȭ��
                wb1300 = new SSBrinfo1300WB();
                wb1300.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1300_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1310: //����Info-����������Ȳ-���
                wb1300 = new SSBrinfo1300WB();
                wb1300.selectBoempList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1310_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1315: //����Info-����������Ȳ-�󼼸��
                wb1300 = new SSBrinfo1300WB();
                wb1300.selectBoempDetailList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1315_p.jsp";
                break;

            // ������ǰ��Ȳ
            case SSBrinfoWBMapping.BRINFO_1400: //����Info-������ǰ��Ȳ-��Ȳ-�ʱ�ȭ��
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1400_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1410: //����Info-������ǰ��Ȳ-��Ȳ-���
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectAsetList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1410_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1420: //����Info-������ǰ��Ȳ-��-�ʱ�ȭ��
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1420_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1425: //����Info-������ǰ��Ȳ-��-���
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectAsetDetailList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1425_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1430: //����Info-������ǰ��Ȳ-��-��
                wb1400 = new SSBrinfo1400WB();
                wb1400.selectAsetDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1430_s.jsp";
                break;

            // ������������Ȳ
            case SSBrinfoWBMapping.BRINFO_1500: //����Info-������������Ȳ
               wb1500 = new SSBrinfo1500WB();
               wb1500.selectBuseoList(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1500_a.jsp";
               break;
            case SSBrinfoWBMapping.BRINFO_1510: //����Info-������������Ȳ-���
               wb1500 = new SSBrinfo1500WB();
               wb1500.selectLeasamtList(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1510_l.jsp";
               break;
            case SSBrinfoWBMapping.BRINFO_1520: //����Info-������������Ȳ-��
               wb1500 = new SSBrinfo1500WB();
               wb1500.selectDetailView(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1520_s.jsp";
               break;
            case SSBrinfoWBMapping.BRINFO_1530: //����Info-������������Ȳ ��������
               wb1500 = new SSBrinfo1500WB();
               wb1500.updateDetailView(req, res);
               nextPage = "/jsp/ss/brinfo/ss_brinfo_1530_i.jsp";
               break;

            // �߼۳뼱
            case SSBrinfoWBMapping.BRINFO_1600: //����Info-�߼۳뼱
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectAreaList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1600_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1610: //����Info-�߼۳뼱(����Ʈ)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectBsnsList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1610_l.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1650: //����Info-�߼۳뼱 SMS(�ʱ�)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectAreaList(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1650_a.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1660: //����Info-�߼۳뼱 SMS(���)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectSmsDetail(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1660_s.jsp";
                break;
            case SSBrinfoWBMapping.BRINFO_1670: //����Info-�߼۳뼱 SMS(����)
                wb1600 = new SSBrinfo1600WB();
                wb1600.selectSmsUpdate(req, res);
                nextPage = "/jsp/ss/brinfo/ss_brinfo_1670_u.jsp";
                break;

/*******************************************����Ͽ�******************************************************************/

            case SSBrinfoWBMapping.BRINFO_11610: //����Info-�߼۳뼱(����Ʈ)_����Ͽ�
                wb11600 = new SSBrinfo11600WB();
                wb11600.mo_selectBsnsList(req, res);
                nextPage = "/jsp/ss/brinfo/mo_ss_brinfo_11610_l.jsp";
                break;

            case SSBrinfoWBMapping.BRINFO_11615: //����Info-�߼۳뼱(���ͺ� ��)_����Ͽ�
                wb11600 = new SSBrinfo11600WB();
                wb11600.mo_selectBsnsDetail(req, res);
                nextPage = "/jsp/ss/brinfo/mo_ss_brinfo_11615_s.jsp";
                break;

           default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
