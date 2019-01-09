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


package chosun.ciis.hd.appmt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.appmt.wb.HD_APPMT_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDAppmtServlet extends BaseServlet {

 
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
     * @throws ServletException
     */
   
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
		//System.out.println(" HDJobServlet.java ");
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/appmt/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDAppmtServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDAppmtServlet : process : nextPage : " + nextPage);
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
        HD_APPMT_1000WB wb = null;

        switch (pid) {
        	case HDAppmtWBMapping.HD_APPMT_1000:
        		wb = new HD_APPMT_1000WB();
        		wb.hd_appmt_1000(req, res);
        		nextPage = "/jsp/hd/appmt/hd_appmt_1000_l.jsp";
        		break;
        	case HDAppmtWBMapping.HD_APPMT_1001:
        		wb = new HD_APPMT_1000WB();
        		wb.hd_appmt_1001(req, res);
        		nextPage = "/jsp/hd/appmt/hd_appmt_1001_l.jsp";
        		break;
        		
        	case HDAppmtWBMapping.HD_APPMT_1011:
        		wb = new HD_APPMT_1000WB();
        		wb.hd_appmt_1011(req, res);
        		nextPage = "/jsp/hd/appmt/hd_appmt_1011_l.jsp";
        		break;
        	case HDAppmtWBMapping.HD_APPMT_1002:
        		wb = new HD_APPMT_1000WB();
        		wb.hd_appmt_1002(req, res);
        		nextPage = "/jsp/hd/appmt/hd_appmt_1002_l.jsp";
        		break;
			case HDAppmtWBMapping.HD_APPMT_1003:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1003(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1013:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1013(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1004:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1004(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1005:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1005_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1005_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1006:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1006_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1006_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1007:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1007_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1007_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1008:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1008_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1008_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1009:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1009_m(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1009_m.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1016:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1016_m(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1016_m.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1100:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1100(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1100_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1101:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1101(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1102:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1102(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1103:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1103(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1104:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1104(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1200:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1200(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1200_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1201:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1201(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1201_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1202:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1202(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1203:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1203(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1204:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1204_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1204_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1205:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1205_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1205_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1206:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1206_m(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1206_m.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1300:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1300(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_1300_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1301:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1301(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1302:
				wb = new HD_APPMT_1000WB();
				wb.hd_appmt_1302(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_2000:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_2000_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_2000_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_2000_500:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_2000_500_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_2000_500_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_2001:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_2001_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_2001_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_2002:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_2002_u(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_2002_u.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_2003:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_2003_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_2003_l.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_1105:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_1105_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDAppmtWBMapping.HD_APPMT_3000:
				wb = new HD_APPMT_1000WB();
				((HD_APPMT_1000WB)wb).hd_appmt_3000_l(req, res);
				nextPage = "/jsp/hd/appmt/hd_appmt_3000_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}
