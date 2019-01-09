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


package chosun.ciis.hd.emsy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.hd.emsy.wb.HD_EMSY_1000WB;

public class HDEmsyServlet extends BaseServlet {

 
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
            String servletMappedUrl = "/hd/emsy/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDEduServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDEduServlet : process : nextPage : " + nextPage);
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
		HD_EMSY_1000WB wb = null;

		switch(pid) {
			case HDEmsyWBMapping.HD_EMSY_1000_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_1000_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_1000_l.jsp";
			break;
			case HDEmsyWBMapping.HD_EMSY_1100_A:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_1100_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_1200_A:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_1200_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2000_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2000_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2000_l.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2002_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2002_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2002_l.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2004_A:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2004_a(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2004_a.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2006_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2006_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2006_l.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2007_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2007_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2007_l.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2009_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2009_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2009_l.jsp";
				break;
			case HDEmsyWBMapping.HD_EMSY_2010_L:
				wb = new HD_EMSY_1000WB();
				((HD_EMSY_1000WB)wb).hd_emsy_2010_l(req, res);
				nextPage = "/jsp/hd/emsy/hd_emsy_2010_l.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}    
}
