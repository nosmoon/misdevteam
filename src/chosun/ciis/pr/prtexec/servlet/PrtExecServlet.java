package chosun.ciis.pr.prtexec.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pr.prtexec.wb.*;

public class PrtExecServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
     *
     * @param req request
     * @param res response
     * @throws IOException
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;

        try {
            String servletMappedUrl = "/mt/prtexec/";
            iPid = extractPid(req, servletMappedUrl);

            nextPage = executeWorker(req, res, iPid);
            System.out.println("PrtActServlet : iPid : " + iPid);
            System.out.println("PrtActServlet : nextPage : " + nextPage);
        }
        catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/app_error.jsp";
        }
        catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
        String nextPage = null;
        PR_PRTEXEC_1000WB wb1 = null;
        PR_PRTEXEC_2000WB wb2 = null;
        PR_PRTEXEC_5000WB wb5 = null;
        PR_PRTEXEC_6000WB wb6 = null;
        PR_PRTEXEC_7000WB wb7 = null;
        
        switch (pid) {
		        case PrtExecWBMapping.PR_PRTEXEC_1100:
				    System.out.println("PR_PRTEXEC_1100:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1100(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1100_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1101:
				    System.out.println("PR_PRTEXEC_1101:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1101(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1101_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1102:
				    System.out.println("PR_PRTEXEC_1102:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1102(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1102_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1103:
				    System.out.println("PR_PRTEXEC_1103:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1103(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1103_s.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1104:
				    System.out.println("PR_PRTEXEC_1104:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1104(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1104_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1105:
				    System.out.println("PR_PRTEXEC_1105:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1105(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1105_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1200:
				    System.out.println("PR_PRTEXEC_1200:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1200(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1200_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1300:
				    System.out.println("PR_PRTEXEC_1300:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1300(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1300_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1001:
				    System.out.println("PR_PRTEXEC_1001:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1001(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1001_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1302:
				    System.out.println("PR_PRTEXEC_1302:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1302(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1302_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1301:
				    System.out.println("PR_PRTEXEC_1301:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1301(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1301_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1400:
				    System.out.println("PR_PRTEXEC_1400:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1400(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1400_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_1401:
				    System.out.println("PR_PRTEXEC_1401:::::::::::::::");
				    wb1 = new PR_PRTEXEC_1000WB();
				    wb1.pr_prtexec_1401(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_1401_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2000:
				    System.out.println("PR_PRTEXEC_2000:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2000(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2000_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2001:
				    System.out.println("PR_PRTEXEC_2001:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2001(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2001_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2002:
				    System.out.println("PR_PRTEXEC_2002:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2002(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2002_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2003:
				    System.out.println("PR_PRTEXEC_2003:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2003(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2003_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2004:
				    System.out.println("PR_PRTEXEC_2004:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2000(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2004_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2005:
				    System.out.println("PR_PRTEXEC_2005:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2005(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2005_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2006:
				    System.out.println("PR_PRTEXEC_2006:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2006(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2006_u.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2007:
				    System.out.println("PR_PRTEXEC_2007:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2007(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2007_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2008:
				    System.out.println("PR_PRTEXEC_2008:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2008(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2008_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2009:
				    System.out.println("PR_PRTEXEC_2009:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2009(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2009_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2010:
				    System.out.println("PR_PRTEXEC_2010:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2010(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2010_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2011:
				    System.out.println("PR_PRTEXEC_2011:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2011(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2011_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2012:
				    System.out.println("PR_PRTEXEC_2012:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2012(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2012_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2013:
				    System.out.println("PR_PRTEXEC_2013:::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2013(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2013_u.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2014:
				    System.out.println("PR_PRTEXEC_2014::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2014(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2014_u.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2015:
				    System.out.println("PR_PRTEXEC_2015::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2015(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2015_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_2016:
				    System.out.println("PR_PRTEXEC_2016::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_2016(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_2016_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_3000:
		        	System.out.println("PR_PRTEXEC_3000::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_3000(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_3000_a.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_4000:
				    System.out.println("PR_PRTEXEC_4000::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_4000(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_4000_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_4001:
				    System.out.println("PR_PRTEXEC_4001::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_4001(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_4001_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_4002:
				    System.out.println("PR_PRTEXEC_4002::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_4002(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_4002_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_4003:
				    System.out.println("PR_PRTEXEC_4003::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_4003(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_4003_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_4004:
				    System.out.println("PR_PRTEXEC_4004::::::::::::::");
				    wb2 = new PR_PRTEXEC_2000WB();
				    wb2.pr_prtexec_4004(req, res);
				    nextPage = "/jsp/pr/prtexec/pr_prtexec_4004_l.jsp";
				    break;
		        case PrtExecWBMapping.PR_PRTEXEC_5000:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5000_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5000_l.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5011:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5011_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5011_a.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5012:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5012_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5012_l.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5013:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5013_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5013_l.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5014:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5014_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5014_a.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5020:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5020_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5020_a.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5030:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5030_a(req, res);
					nextPage = "/common/jsp/resultMsg.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5031:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5031_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5031_a.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5032:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5032_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5032_a.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5033:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5033_s(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5033_s.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_5034:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5034_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5034_a.jsp";
					break;
		    	case PrtExecWBMapping.PR_PRTEXEC_5040:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5040_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5040_l.jsp";
					break;
		    	case PrtExecWBMapping.PR_PRTEXEC_5050:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5050_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5050_l.jsp";
					break;
		    	case PrtExecWBMapping.PR_PRTEXEC_5060:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5060_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5060_l.jsp";
					break;
		    	case PrtExecWBMapping.PR_PRTEXEC_5070:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5070_a(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5070_a.jsp";
					break;
		    	case PrtExecWBMapping.PR_PRTEXEC_5080:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5080_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_5080_l.jsp";
					break;
				case PrtExecWBMapping.PR_PRTEXEC_5090:
					wb5 = new PR_PRTEXEC_5000WB();
					((PR_PRTEXEC_5000WB)wb5).pr_prtexec_5090_a(req, res);
					nextPage = "/common/jsp/resultMsg.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_6000:
					wb6 = new PR_PRTEXEC_6000WB();
					((PR_PRTEXEC_6000WB)wb6).pr_prtexec_6000_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_6000_l.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_6010:
					wb6 = new PR_PRTEXEC_6000WB();
					((PR_PRTEXEC_6000WB)wb6).pr_prtexec_6010_m(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_6010_m.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_6020:
					wb6 = new PR_PRTEXEC_6000WB();
					((PR_PRTEXEC_6000WB)wb6).pr_prtexec_6020_a(req, res);
					nextPage = "/common/jsp/resultMsg.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_7000:
					wb7 = new PR_PRTEXEC_7000WB();
					((PR_PRTEXEC_7000WB)wb7).pr_prtexec_7000_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_7000_l.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_7001:
					wb7 = new PR_PRTEXEC_7000WB();
					((PR_PRTEXEC_7000WB)wb7).pr_prtexec_7001_l(req, res);
					nextPage = "/jsp/pr/prtexec/pr_prtexec_7001_l.jsp";
					break;
		        case PrtExecWBMapping.PR_PRTEXEC_7010:
					wb7 = new PR_PRTEXEC_7000WB();
					((PR_PRTEXEC_7000WB)wb7).pr_prtexec_7010_a(req, res);
					nextPage = "/common/jsp/resultMsg.jsp";
					break;
	           default:
	                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}