package chosun.ciis.hd.insr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.hd.insr.wb.HD_INSR_1000WB;


import chosun.ciis.hd.info.wb.HD_INFO_1000WB;


public class HDInsrServlet extends BaseServlet {
	boolean debugmode = true;

    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
     *
     * @param req request
     * @param res response
     * @throws IOException
     * @throws ServletException
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/insr/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("HDInsrServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDInsrServlet : process : nextPage : " + nextPage);
        } 
        catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/hd/insr/app_error.jsp";
        }
        catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        System.out.println("------------executeWorker--------------------");
        HD_INSR_1000WB wb = new HD_INSR_1000WB();
        HD_INFO_1000WB wbs = new HD_INFO_1000WB();
		switch (pid) {
        	case HDInsrWBMapping.HD_INSR_1000_L:
				((HD_INSR_1000WB)wb).hd_insr_1000_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1000_l.jsp";
				break;
        	case HDInsrWBMapping.HD_INSR_1001_U:
				((HD_INSR_1000WB)wb).hd_insr_1001_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInsrWBMapping.HD_INSR_1002_S:
        		wbs.hd_info_1002(req, res);
        		nextPage = "/jsp/hd/insr/hd_insr_1002_s.jsp";
        		break;
        	case HDInsrWBMapping.HD_INSR_1500:
				((HD_INSR_1000WB)wb).hd_insr_1500_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1500_l.jsp";
				break;
        	case HDInsrWBMapping.HD_INSR_1510:
				((HD_INSR_1000WB)wb).hd_insr_1510_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1510_l.jsp";
				break;
        	case HDInsrWBMapping.HD_INSR_1511:
				((HD_INSR_1000WB)wb).hd_insr_1511_A(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInsrWBMapping.HD_INSR_1520:
				((HD_INSR_1000WB)wb).hd_insr_1520_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1520_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1600:
				((HD_INSR_1000WB)wb).hd_insr_1600_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1600_l.jsp";
				break; 
			case HDInsrWBMapping.HD_INSR_1100_L:
				((HD_INSR_1000WB)wb).hd_insr_1100_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1100_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1101_A:
				((HD_INSR_1000WB)wb).hd_insr_1101_A(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1200_L:
				((HD_INSR_1000WB)wb).hd_insr_1200_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1200_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1202_S:
        		//wb.hd_insr_1002(req, res);
				wbs.hd_info_1002(req, res);
        		nextPage = "/jsp/hd/insr/hd_insr_1002_s.jsp";
        		break;
			case HDInsrWBMapping.HD_INSR_1201_U:
				((HD_INSR_1000WB)wb).hd_insr_1201_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1300_L:
				((HD_INSR_1000WB)wb).hd_insr_1300_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1300_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1301_A:
				((HD_INSR_1000WB)wb).hd_insr_1301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1400_L:
				((HD_INSR_1000WB)wb).hd_insr_1400_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1400_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1711_L:
				((HD_INSR_1000WB)wb).hd_insr_1711_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1711_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1712_A:
				((HD_INSR_1000WB)wb).hd_insr_1712_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1721_L:
				((HD_INSR_1000WB)wb).hd_insr_1721_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1721_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1722_L:
				((HD_INSR_1000WB)wb).hd_insr_1722_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1722_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1723_A:
				((HD_INSR_1000WB)wb).hd_insr_1723_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_2000:
				wb = new HD_INSR_1000WB();
				((HD_INSR_1000WB)wb).hd_insr_2000_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_2000_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_2001:
				wb = new HD_INSR_1000WB();
				((HD_INSR_1000WB)wb).hd_insr_2001_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_2001_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_2002:
				wb = new HD_INSR_1000WB();
				((HD_INSR_1000WB)wb).hd_insr_2002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1102_L:
				wb = new HD_INSR_1000WB();
				((HD_INSR_1000WB)wb).hd_insr_1102_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1102_l.jsp";
				break;
			case HDInsrWBMapping.HD_INSR_1302_L:
				wb = new HD_INSR_1000WB();
				((HD_INSR_1000WB)wb).hd_insr_1302_l(req, res);
				nextPage = "/jsp/hd/insr/hd_insr_1302_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
       
        return nextPage;
    }
}
