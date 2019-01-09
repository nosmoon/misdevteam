/***************************************************************************************************
 * 파일명 : PLRtnServlet.java
 * 기능 :  반품관리서블릿
 * 작성일자 : 2009.03.30
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rtn.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.rtn.wb.PL_RTN_1000WB;
import chosun.ciis.pl.rtn.wb.PL_RTN_1100WB;
import chosun.ciis.pl.rtn.wb.PL_RTN_1200WB;
import chosun.ciis.pl.rtn.wb.PL_RTN_1300WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLRtnServlet extends BaseServlet {


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
//        String requestURI = null;
//        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/pl/rtn/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLRtnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLRtnServlet : process : nextPage : " + nextPage);
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
     * PLRtnWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PL_RTN_1000WB wb1000 = null;
        PL_RTN_1100WB wb1100 = null;
        PL_RTN_1200WB wb1200 = null;
        PL_RTN_1300WB wb1300 = null;
        
        switch (pid) {
            //정간물거래처별반품 메인
        	case PLRtnWBMapping.PL_RTN_1000:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1000:::::::::::::::");
        		wb1000.pl_rtn_1000_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1000_m.jsp";
        		break;        
            //정간물거래처별반품 조회
        	case PLRtnWBMapping.PL_RTN_1010:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1010:::::::::::::::");
        		wb1000.pl_rtn_1010_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1010_l.jsp";
        		break;        
            //정간물거래처별반품 상세조회
        	case PLRtnWBMapping.PL_RTN_1020:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1020:::::::::::::::");
        		wb1000.pl_rtn_1020_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1020_l.jsp";
        		break;        
            //정간물거래처별반품 대상조회
        	case PLRtnWBMapping.PL_RTN_1030:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1030:::::::::::::::");
        		wb1000.pl_rtn_1030_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1030_l.jsp";
        		break;        
            //정간물거래처별반품 저장/삭제
        	case PLRtnWBMapping.PL_RTN_1040:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1040:::::::::::::::");
        		wb1000.pl_rtn_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //정간물매체별반품 메인
        	case PLRtnWBMapping.PL_RTN_1100:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1100:::::::::::::::");
        		wb1100.pl_rtn_1100_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1100_m.jsp";
        		break;        
            //정간물매체별반품 조회
        	case PLRtnWBMapping.PL_RTN_1110:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1110:::::::::::::::");
        		wb1100.pl_rtn_1110_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1110_l.jsp";
        		break;        
            //정간물매체별반품 상세조회
        	case PLRtnWBMapping.PL_RTN_1120:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1120:::::::::::::::");
        		wb1100.pl_rtn_1120_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1120_l.jsp";
        		break;        
            //정간물매체별반품 저장/삭제
        	case PLRtnWBMapping.PL_RTN_1130:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1130:::::::::::::::");
        		wb1100.pl_rtn_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //단행본거래처별반품 메인
        	case PLRtnWBMapping.PL_RTN_1200:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1200:::::::::::::::");
        		wb1200.pl_rtn_1200_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1200_m.jsp";
        		break;        
            //단행본거래처별반품 조회
        	case PLRtnWBMapping.PL_RTN_1210:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1210:::::::::::::::");
        		wb1200.pl_rtn_1210_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1210_l.jsp";
        		break;        
            //단행본거래처별반품 상세조회
        	case PLRtnWBMapping.PL_RTN_1220:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1220:::::::::::::::");
        		wb1200.pl_rtn_1220_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1220_l.jsp";
        		break;        
            //단행본거래처별반품 저장/삭제
        	case PLRtnWBMapping.PL_RTN_1230:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1230:::::::::::::::");
        		wb1200.pl_rtn_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //단행본거래처별반품 대상조회
        	case PLRtnWBMapping.PL_RTN_1240:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1240:::::::::::::::");
        		wb1200.pl_rtn_1240_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1240_l.jsp";
        		break;        

            //단행본매체별반품 메인
        	case PLRtnWBMapping.PL_RTN_1300:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1300:::::::::::::::");
        		wb1300.pl_rtn_1300_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1300_m.jsp";
        		break;        
            //단행본매체별반품 조회
        	case PLRtnWBMapping.PL_RTN_1310:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1310:::::::::::::::");
        		wb1300.pl_rtn_1310_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1310_l.jsp";
        		break;        
            //단행본매체별반품 상세조회
        	case PLRtnWBMapping.PL_RTN_1320:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1320:::::::::::::::");
        		wb1300.pl_rtn_1320_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1320_l.jsp";
        		break;        
            //단행본매체별반품 저장/삭제
        	case PLRtnWBMapping.PL_RTN_1330:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1330:::::::::::::::");
        		wb1300.pl_rtn_1330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
