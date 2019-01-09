package chosun.ciis.mt.outsdelmt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.outsdelmt.wb.*;

public class MtOutsdelmtServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/mt/outsdelmt/";
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
     * SEBasWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
        String nextPage = null;
        MT_OUTSDELMT_1000WB wb = null;

        switch (pid) {
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_1000:
				    System.out.println("MT_OUTSDELMT_1000:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_1000(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_1000_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_1001:
				    System.out.println("MT_OUTSDELMT_1001:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_1001(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_1001_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_1002:
				    System.out.println("MT_OUTSDELMT_1002:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_1002(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_1002_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_1003:
				    System.out.println("MT_OUTSDELMT_1003:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_1003(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_1003_a.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_1004:
				    System.out.println("MT_OUTSDELMT_1004:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_1004(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_1004_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_1005:
				    System.out.println("MT_OUTSDELMT_1005:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_1005(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_1005_a.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_2000:
				    System.out.println("MT_OUTSDELMT_2000:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_2000(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_2000_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_2001:
				    System.out.println("MT_OUTSDELMT_2001:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_2001(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_2001_a.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_2002:
				    System.out.println("MT_OUTSDELMT_2002:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_2002(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_2002_a.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_3000:
				    System.out.println("MT_OUTSDELMT_3000:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_3000(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_3000_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_3001:
				    System.out.println("MT_OUTSDELMT_3001:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_3001(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_3001_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_3002:
				    System.out.println("MT_OUTSDELMT_3002:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_3002(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_3002_a.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_3003:
				    System.out.println("MT_OUTSDELMT_3003:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_3003(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_3003_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_3004:
				    System.out.println("MT_OUTSDELMT_3004:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_3004(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_3004_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_4000:
				    System.out.println("MT_OUTSDELMT_4000:::::::::::::::");
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_4000_l.jsp";
				    break;
		        case MtOutsdelmtWBMapping.MT_OUTSDELMT_5000:
				    System.out.println("MT_OUTSDELMT_5000:::::::::::::::");
				    wb = new MT_OUTSDELMT_1000WB();
				    wb.getMt_outsdelmt_5000(req, res);
				    nextPage = "/jsp/mt/outsdelmt/mt_outsdelmt_5000_l.jsp";
				    break;
	           default:
	                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
}