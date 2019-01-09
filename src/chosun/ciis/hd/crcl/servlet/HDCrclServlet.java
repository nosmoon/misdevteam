/***************************************************************************************************
 * 파일명 : 
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.hd.crcl.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.crcl.wb.HD_CRCL_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDCrclServlet extends BaseServlet {  


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/crcl/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDCrclServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDCrclServlet : process : nextPage : " + nextPage);
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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        HD_CRCL_1000WB wb = null;

        switch (pid) {
			case HDCrclWBMapping.HD_CRCL_1000:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1000_m(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1000_m.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1001:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1001_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1001_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1002:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1100:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1100_m(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1100_m.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1101:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1101_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1101_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1102:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1103:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1103_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1103_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1200:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1200_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1200_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1201:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1201_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1201_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1202:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1203:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1203_m(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1203_m.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1300:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1300_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1300_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1301:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1400:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1400_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1400_l.jsp";
				break;
			case HDCrclWBMapping.HD_CRCL_1302:
				wb = new HD_CRCL_1000WB();
				((HD_CRCL_1000WB)wb).hd_crcl_1302_l(req, res);
				nextPage = "/jsp/hd/crcl/hd_crcl_1302_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}
