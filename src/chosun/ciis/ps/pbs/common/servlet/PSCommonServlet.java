/***************************************************************************************************
 * ���ϸ�   : PSCommonServlet.java
 * ���     : ���Ǿ������� ������ ����
 * �ۼ����� : 2004-02-26
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.wb.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * ���� ��ǥ ����
 */
public class PSCommonServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ps/common/";
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
     * PSCommonWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        PSCommonWB wbCommon = null ;

        switch (pid) {
            //�����ȣ �˻� �ʱ�
            case PSCommonWBMapping.PSCOMMON_1801:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1101_p.jsp";
                break;
            //�����ȣ �˻�
            case PSCommonWBMapping.PSCOMMON_1806:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1106_l.jsp";
                break;
            //�����ȣ �˻�
            case PSCommonWBMapping.PSCOMMON_1811:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1111_l.jsp";
                break;
            //�����ȣ �˻�
            case PSCommonWBMapping.PSCOMMON_1816:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr(req, res);
                nextPage = "/jsp/ps/common/pb_common_1116_l.jsp";
                break;

            //�����ȣ �˻� �ʱ�
            case PSCommonWBMapping.PSCOMMON_1101:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr3(req, res);
                nextPage = "/jsp/ps/common/ps_common_1801_p.jsp";
                break;
            //�����ȣ �˻�
            case PSCommonWBMapping.PSCOMMON_1106:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr3(req, res);
                nextPage = "/jsp/ps/common/ps_common_1806_l.jsp";
                break;
            //�����ȣ �˻�
            case PSCommonWBMapping.PSCOMMON_1111:
                wbCommon = new PSCommonWB();
                wbCommon.selectZipAddr3(req, res);
                nextPage = "/jsp/ps/common/ps_common_1811_l.jsp";
                break;

            //�����ȣ�� �����˻�
            case PSCommonWBMapping.PSCOMMON_1201:
                wbCommon = new PSCommonWB();
                wbCommon.selectEmpDetail(req, res);
                nextPage = "/jsp/ps/common/ps_common_1201_s.jsp";
                break;
            //���纰 �μ��˻�
            case PSCommonWBMapping.PSCOMMON_1301:
            	wbCommon  =  new PSCommonWB();
                wbCommon.selectBoDept(req, res);
                nextPage = "/jsp/ps/common/ps_common_1301_l.jsp";
                break;
            //�������ڰ˻�
            case PSCommonWBMapping.PSCOMMON_1401:
                wbCommon = new PSCommonWB();
                wbCommon.selectExstRdr(req, res);
                nextPage = "/jsp/ps/common/ps_common_1401_l.jsp";
                break;
            //�����ȣ�� �����˻�
            case PSCommonWBMapping.PSCOMMON_1601:
                wbCommon = new PSCommonWB();
                wbCommon.selectReaderDetail(req, res);
                nextPage = "/jsp/ps/common/ps_common_1601_s.jsp";
                break;
            //�����ȣ�� �����˻�(�������������)
            case PSCommonWBMapping.PSCOMMON_1701:
                wbCommon = new PSCommonWB();
                wbCommon.selectReaderDetailBocd(req, res);
                nextPage = "/jsp/ps/common/ps_common_1701_s.jsp";
                break;

            //�����˻��˾�
            case PSCommonWBMapping.PSCOMMON_1901:
                wbCommon = new PSCommonWB();
                nextPage = "/jsp/ps/common/ps_common_1901_p.jsp";
                break;
            //�����˻���ȸ
            case PSCommonWBMapping.PSCOMMON_1906:
                wbCommon = new PSCommonWB();
                wbCommon.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ps/common/ps_common_1906_l.jsp";
                break;
            //�����˻���ȸ
            case PSCommonWBMapping.PSCOMMON_1911:
                wbCommon = new PSCommonWB();
                wbCommon.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ps/common/ps_common_1911_l.jsp";
                break;
            default:
              throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
