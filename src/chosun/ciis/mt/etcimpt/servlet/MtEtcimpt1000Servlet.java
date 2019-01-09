package chosun.ciis.mt.etcimpt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.etcimpt.wb.MT_ETCIMPT_1000WB;
import chosun.ciis.mt.etcimpt.servlet.MtEtcimptWBMapping;



public class MtEtcimpt1000Servlet extends BaseServlet {

 
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
            String servletMappedUrl = "/mt/etcimpt/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("MtpapinoutSevlet : req  : " + req);
            System.out.println("MtpapinoutSevlet : res  : " + res);
            System.out.println("MtpapinoutSevlet : iPid : " + iPid);
            System.out.println("MtpapinoutSevlet : nextPage : " + nextPage);

            nextPage = executeWorker(req, res, iPid);

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
        MT_ETCIMPT_1000WB wb = null;

        switch (pid) {
        case MtEtcimptWBMapping.MT_ETCIMPT_1000:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1000_m(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1000_m.jsp";
			break;
        
        case MtEtcimptWBMapping.MT_ETCIMPT_1010:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1010_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1010_l.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1101:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1101_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1101_l.jsp";
			break;
		case MtEtcimptWBMapping.MT_ETCIMPT_1110:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1110_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1110_l.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1120:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1120_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1201:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1201_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1201_l.jsp";
			break;
		case MtEtcimptWBMapping.MT_ETCIMPT_1205:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1205_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1205_l.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1210:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1210_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1210_l.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1220:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1220_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case MtEtcimptWBMapping.MT_ETCIMPT_1221:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1221_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1230:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1230_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1230_l.jsp";
			break;
        case MtEtcimptWBMapping.MT_ETCIMPT_1300:
			wb = new MT_ETCIMPT_1000WB();
			((MT_ETCIMPT_1000WB)wb).mt_etcimpt_1300_l(req, res);
			nextPage = "/jsp/mt/etcimpt/mt_etcimpt_1300_l.jsp";
			break;
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
}