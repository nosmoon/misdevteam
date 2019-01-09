/***************************************************************************************************
 * 파일명   : CoJobServlet.java
 * 기능     : 광고관리 - 업무연락 서블릿
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/
package chosun.ciis.co.job.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.job.wb.CoJob1000WB;
import chosun.ciis.co.job.wb.CoJob2000WB;
import chosun.ciis.co.job.wb.CoJob3000WB;

public class CoJobServlet extends BaseServlet {

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
    	String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/co/job/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("CoJobServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CoJobServlet : process : nextPage : " + nextPage);
        }
        catch (AppException ae) {
        	ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/app_error.jsp";
        }
        catch (SysException se) {
        	se.printStackTrace();
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
        	e.printStackTrace();
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * CoJobWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        
        BaseWB workbean = null;
                
        switch (pid) {
            case CoJobWBMapping.CO_JOB_1000:		//업무지시
	    		workbean = new CoJob1000WB();
	    		((CoJob1000WB)workbean).co_job_1000_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_1000_m.jsp";
	    		break;
            case CoJobWBMapping.CO_JOB_1002:		//업무지시
	    		workbean = new CoJob1000WB();
	    		((CoJob1000WB)workbean).co_job_1002_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_1002_m.jsp";
	    		break;
            case CoJobWBMapping.CO_JOB_1001:		//업무지시
	    		workbean = new CoJob1000WB();
	    		((CoJob1000WB)workbean).co_job_1001_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_1001_m.jsp";
	    		break;
        	case CoJobWBMapping.CO_JOB_1010:		//업무지시 목록조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1010_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1010_l.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1015:		//업무지시 내용조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1015_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1015_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1016:		//업무지시 내용조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1016_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1016_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1020:		//업무지시 상세조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1020_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1020_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1025:		//업무지시 답변목록
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1025_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1025_l.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1030:		//업무지시답변 조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1030_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1030_l.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1040:		//업무지시답변  입력, 수정, 삭제
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
    		case CoJobWBMapping.CO_JOB_1050:		//업무지시  입력, 수정, 삭제
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1060:		//업무지시답변 상세조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1060_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1060_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1070:		//업무지시 첨부파일 다운로드
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1070_a(req, res);
        		nextPage = "/jsp/co/job/co_job_1070_a.jsp";
        		break;  
    		case CoJobWBMapping.CO_JOB_1080:		//업무지시 수신처 목록조회
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1080_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1080_l.jsp";
        		break;   
    		case CoJobWBMapping.CO_JOB_1081:		//업무지시 수신처 목록삭제
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1081_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1081_l.jsp";
        		break;    

	    	case CoJobWBMapping.CO_JOB_2000:		//즐겨찾기
	    		workbean = new CoJob2000WB();
	    		((CoJob2000WB)workbean).co_job_2000_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_2000_m.jsp";
	    		break;     
	    	case CoJobWBMapping.CO_JOB_2010:		//즐겨찾기
	    		workbean = new CoJob2000WB();
	    		((CoJob2000WB)workbean).co_job_2010_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;    

//      경영정보보고
            case CoJobWBMapping.CO_JOB_3000:
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3000_m(req, res);
            	nextPage = "/jsp/co/job/co_job_3000_m.jsp";
            	break;                
            case CoJobWBMapping.CO_JOB_3010:
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3010_l(req, res);
            	nextPage = "/jsp/co/job/co_job_3010_l.jsp";
            	break;                
            case CoJobWBMapping.CO_JOB_3020:
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3020_a(req, res);
            	nextPage = "/common/jsp/resultMsg.jsp";
            	break;               
            case CoJobWBMapping.CO_JOB_3030:  
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3030_s(req, res);
            	nextPage = "/jsp/co/job/co_job_3030_s.jsp";
            	break;               
            case CoJobWBMapping.CO_JOB_3040:  
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3040_u(req, res);
            	nextPage =  "/jsp/co/job/co_job_3040_u.jsp";
            	break;                	
        		
            	
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
