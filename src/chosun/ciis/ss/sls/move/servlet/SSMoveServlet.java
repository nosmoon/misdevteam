/***************************************************************************************************
 * 파일명 : SSMoveServlet.java
 * 기능 : 이사독자 서블릿
 * 작성일자 : 2004-01-05
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.move.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.wb.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * 판매국 업무지원 이사독자 Servlet
 */

public class SSMoveServlet extends ChosunServlet {

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
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
            String servletMappedUrl = "/ss/move/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSMoveServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSMoveServlet : process : nextPage : " + nextPage);
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
     * SSMoveWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {

        String nextPage = null;
        SSMove1000WB wb1000 = null; //이사독자-신청
        SSMove1100WB wb1100 = null; //이사독자-마감
        SSMove1200WB wb1200 = null; //이사독자-비용
        SSMove1300WB wb1300 = null; //이사독자-송금

        switch (pid) {
            // 이사독자-신청
            case SSMoveWBMapping.MOVE_1000: //이사독자-신청현황 초기화면
                wb1000 = new SSMove1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/move/ss_move_1000_a.jsp";
                break;
            case SSMoveWBMapping.MOVE_1010: //이사독자-신청현황 목록
                wb1000 = new SSMove1000WB();
                wb1000.selectMoveList(req, res);
                nextPage = "/jsp/ss/move/ss_move_1010_l.jsp";
                break;
            case SSMoveWBMapping.MOVE_1020: //이사독자-신청현황 상세
                wb1000 = new SSMove1000WB();
                wb1000.selectMoveDetail(req, res);
                nextPage = "/jsp/ss/move/ss_move_1020_s.jsp";
                break;
            case SSMoveWBMapping.MOVE_1030: //이사독자-신청현황 취소
                wb1000 = new SSMove1000WB();
                wb1000.selectMoveCancel(req, res);
                nextPage = "/jsp/ss/move/ss_move_1030_s.jsp";
                break;
            case SSMoveWBMapping.MOVE_1040: //이사독자-신청현황 취소
                wb1000 = new SSMove1000WB();
                wb1000.updateMoveRdr(req, res);
                nextPage = "/jsp/ss/move/ss_move_1040_u.jsp";
                break;
            case SSMoveWBMapping.MOVE_1050: //이사독자-신청현황 엑셀다운
                wb1000 = new SSMove1000WB();
                wb1000.printMoveRdr(req, res);
                nextPage = "/jsp/ss/move/ss_move_1050_p.jsp";
                break;


            // 이사독자-마감
            case SSMoveWBMapping.MOVE_1100: //이사독자-마감 초기화면
            	wb1000 = new SSMove1000WB();
                wb1000.init(req, res);	//재활용
                nextPage = "/jsp/ss/move/ss_move_1100_a.jsp";
                break;
            case SSMoveWBMapping.MOVE_1110: //이사독자-마감 목록
                wb1100 = new SSMove1100WB();
                wb1100.selectMoveClosList(req, res);
                nextPage = "/jsp/ss/move/ss_move_1110_l.jsp";
                break;
            case SSMoveWBMapping.MOVE_1120: //이사독자-마감 상세
                wb1100 = new SSMove1100WB();
                wb1100.selectMoveClosDetail(req, res);
                nextPage = "/jsp/ss/move/ss_move_1120_s.jsp";
                break;
            case SSMoveWBMapping.MOVE_1130: //이사독자-가마감
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1130_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1140: //이사독자-최종마감
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1140_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1150: //이사독자-개별 저장
                wb1100 = new SSMove1100WB();
                wb1100.saveMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1150_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1160: //이사독자-개별 가마감
                wb1100 = new SSMove1100WB();
                wb1100.saveMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1160_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1170: //이사독자-개별 가마감 취소
                wb1100 = new SSMove1100WB();
                wb1100.saveMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1170_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1180: //이사독자-가마감 취소
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1180_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1190: //이사독자-최종마감 취소
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1190_i.jsp";
                break;    

            // 이사독자-비용
            case SSMoveWBMapping.MOVE_1200: //이전비용
            	wb1000 = new SSMove1000WB();
                wb1000.init(req, res);	//재활용
                nextPage = "/jsp/ss/move/ss_move_1200_a.jsp";
                break;
            case SSMoveWBMapping.MOVE_1210: //이사독자-비용(영업담당)-목록
                wb1200 = new SSMove1200WB();
                wb1200.selectMoveCostList(req, res);
                nextPage = "/jsp/ss/move/ss_move_1210_l.jsp";
                break;
            case SSMoveWBMapping.MOVE_1220: //이사독자-비용(영업담당)-상세목록
                wb1200 = new SSMove1200WB();
                wb1200.rebuildMoveCost(req, res);
                nextPage = "/jsp/ss/move/ss_move_1220_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1230: //이사독자
                wb1200 = new SSMove1200WB();
                wb1200.detailMoveCost(req, res);
                nextPage = "/jsp/ss/move/ss_move_1230_s.jsp";
                break;  
            case SSMoveWBMapping.MOVE_1240: //이사독자
                wb1200 = new SSMove1200WB();
                wb1200.saveMoveBoacct(req, res);
                nextPage = "/jsp/ss/move/ss_move_1240_i.jsp";
                break;      
            
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
