/***************************************************************************************************
 * ���ϸ� : SSCNSServlet.java
 * ��� : ���� ����
 * �ۼ����� : 2004-01-05
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.cns.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.wb.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.wb.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.wb.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.wb.*;
import chosun.ciis.ss.sal.rdr.ds.*;

import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.wb.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * �Ǹű� �������� ���� Servlet
 */

public class SSCNSServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/cns/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSCNSServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSCNSServlet : process : nextPage : " + nextPage);
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
     * SSCNSWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        SSExtn1000WB wbextn = null; //Ȯ����Ȳ
        SSMove1000WB wbmove = null; //�̻絶��
        SSReader1100WB wbdsct = null; //���ں���
        SSReader1200WB wbvs = null; //VacationStop
        SLReader2400WB wbvs2 = null; //VacationStop(����)
        SSCNS1000WB wbcns = null;

        switch (pid) {
            // ����-Ȯ��
            case SSCNSWBMapping.CNS_1000: //����-Ȯ�� �ʱ�ȭ��
                wbextn = new SSExtn1000WB();
                wbextn.init(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1000_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1010: //����-Ȯ�� Ȯ���ڼҼ� ���
                wbextn = new SSExtn1000WB();
                wbextn.selectExtnBlngCodeList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1010_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1020: //����-Ȯ�� ��ü ���
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1020_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1030: //����-Ȯ�� ����������û ���
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1030_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1040: //����-Ȯ�� ���Ȯ�� ���
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1040_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1050: //����-Ȯ�� ǰ����Ȯ�� ���
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1050_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1060: //����-Ȯ�� ������üȮ�� ���
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1060_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1070: //����-Ȯ�� ��
                wbextn = new SSExtn1000WB();
                wbextn.selectRdrExtnDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1070_s.jsp";
                break;


            // ����-�̻�
            case SSCNSWBMapping.CNS_1100: //����-�̻� �ʱ�ȭ��
                wbmove = new SSMove1000WB();
                wbmove.init(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1100_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1110: //����-�̻� ���
                wbmove = new SSMove1000WB();
                wbmove.selectMoveList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1110_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1120: //����-�̻� ��
                wbmove = new SSMove1000WB();
                wbmove.selectMoveDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1120_s.jsp";
                break;


            // ����-����
            case SSCNSWBMapping.CNS_1200: //����-���� �ʱ�ȭ��
                wbdsct = new SSReader1100WB();
                wbdsct.selectInitList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1200_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1210: //����-���� ���
                wbdsct = new SSReader1100WB();
                wbdsct.selectRdrDsctList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1210_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1220: //����-���� ��
                wbdsct = new SSReader1100WB();
                wbdsct.selectRdrDsctDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1220_s.jsp";
                break;
            case SSCNSWBMapping.CNS_1230: //����-���� ��� �ʱ�ȭ��
                nextPage = "/jsp/ss/cns/ss_cns_1230_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1240: //����-���� ��� ���
                wbcns = new SSCNS1000WB();
                wbcns.selectDsctStatDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1240_l.jsp";
                break;

            // ����-VacationStop
            case SSCNSWBMapping.CNS_1300: //����-VacationStop �ʱ�ȭ��
                wbvs = new SSReader1200WB();
                wbvs.selectInitList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1300_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1305: //����-VacationStop �ް����ڵ�
                wbvs2 = new SLReader2400WB();
                wbvs2.selectVSAreaRegn(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1305_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1307: //����-VacationStop �ް�����������
                wbvs2 = new SLReader2400WB();
                wbvs2.selectVSBODetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1307_s.jsp";
                break;
            case SSCNSWBMapping.CNS_1310: //����-VacationStop ���
                wbvs = new SSReader1200WB();
                wbvs.selectVsList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1310_l.jsp";
                break;
            case SSCNSWBMapping.CNS_1320: //����-VacationStop ��
                wbvs = new SSReader1200WB();
                wbvs.selectVsDetail(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1320_s.jsp";
                break;

            // ����-�ڵ���ü
            case SSCNSWBMapping.CNS_1400: //����-�����ڵ���ü��û-�ʱ�ȭ��
                wbcns = new SSCNS1000WB();
                wbcns.initCNSShftAplc(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1400_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1410: //����-ī���ڵ���ü��û-�ʱ�ȭ��
                wbcns = new SSCNS1000WB();
                wbcns.initCNSShftAplc(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1410_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1420: //����-ī������
                nextPage = "/jsp/ss/cns/ss_cns_1420_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1430: //����-�����ڵ���ü��û-���
                wbcns = new SSCNS1000WB();
                wbcns.insertCNSShftAplc(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1430_i.jsp";
                break;
                
            // ����-�˻�,��Ÿ
            case SSCNSWBMapping.CNS_1500: //����-���ڰ˻� �ʱ�ȭ��
                nextPage = "/jsp/ss/cns/ss_cns_1500_a.jsp";
                break;
            case SSCNSWBMapping.CNS_1510: //����-���ڰ˻� ���
                wbcns = new SSCNS1000WB();
                wbcns.selectRdrSrchList(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1510_l.jsp";
                break;

            case SSCNSWBMapping.CNS_1550: //����-���
                wbcns = new SSCNS1000WB();
                wbcns.accessCNS(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1550_i.jsp";
                break;
            case SSCNSWBMapping.CNS_1560: //����-����
                wbcns = new SSCNS1000WB();
                wbcns.accessCNS(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1560_u.jsp";
                break;
            case SSCNSWBMapping.CNS_1570: //����-����
                wbcns = new SSCNS1000WB();
                wbcns.accessCNS(req, res);
                nextPage = "/jsp/ss/cns/ss_cns_1570_d.jsp";
                break;

           default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
