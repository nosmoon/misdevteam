/***************************************************************************************************
 * 파일명 : PLComServlet.java
 * 기능 :  공통서블릿
 * 작성일자 : 2009.02.17
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.com.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.com.wb.PL_COM_1000WB;
import chosun.ciis.pl.com.wb.PL_COM_1100WB;
import chosun.ciis.pl.com.wb.PL_COM_1200WB;
import chosun.ciis.pl.com.wb.PL_COM_1300WB;
import chosun.ciis.pl.com.wb.PL_COM_1400WB;
import chosun.ciis.pl.com.wb.PL_COM_1500WB;
import chosun.ciis.pl.com.wb.PL_COM_1600WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLComServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/com/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLComServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLComServlet : process : nextPage : " + nextPage);
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
     * PLComWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PL_COM_1000WB wb1000 = null;
        PL_COM_1100WB wb1100 = null;
        PL_COM_1200WB wb1200 = null;
        PL_COM_1300WB wb1300 = null;
        PL_COM_1400WB wb1400 = null;
        PL_COM_1500WB wb1500 = null;
        PL_COM_1600WB wb1600 = null;
        
        switch (pid) {
            //거래처검색팝업 메인
        	case PLComWBMapping.PL_COM_1000:
        		wb1000 = new PL_COM_1000WB();
                System.out.println("PL_COM_1000:::::::::::::::");
        		wb1000.pl_com_1000_m(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1000_m.jsp";
        		break;        
        	//거래처검색팝업 조회
        	case PLComWBMapping.PL_COM_1010:
        		wb1000 = new PL_COM_1000WB();
                System.out.println("PL_COM_1010:::::::::::::::");
                wb1000.pl_com_1010_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1010_l.jsp";
				break;
        	//거래처검색팝업 1건조회
        	case PLComWBMapping.PL_COM_1020:
        		wb1000 = new PL_COM_1000WB();
                System.out.println("PL_COM_1020:::::::::::::::");
                wb1000.pl_com_1020_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1020_s.jsp";
				break;

            //매체검색팝업 메인
        	case PLComWBMapping.PL_COM_1100:
        		wb1100 = new PL_COM_1100WB();
                System.out.println("PL_COM_1100:::::::::::::::");
        		wb1100.pl_com_1100_m(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1100_m.jsp";
        		break;        
        	//매체검색팝업 조회
        	case PLComWBMapping.PL_COM_1110:
        		wb1100 = new PL_COM_1100WB();
                System.out.println("PL_COM_1110:::::::::::::::");
                wb1100.pl_com_1110_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1110_l.jsp";
				break;
        	//매체검색팝업 1건조회
        	case PLComWBMapping.PL_COM_1120:
        		wb1100 = new PL_COM_1100WB();
                System.out.println("PL_COM_1120:::::::::::::::");
                wb1100.pl_com_1120_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1120_s.jsp";
				break;

        	//사내판매출고처리 조회
        	case PLComWBMapping.PL_COM_1210:
        		wb1200 = new PL_COM_1200WB();
                System.out.println("PL_COM_1210:::::::::::::::");
                wb1200.pl_com_1210_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1210_s.jsp";
				break;
        	//사내판매출고처리 저장/삭제
        	case PLComWBMapping.PL_COM_1220:
        		wb1200 = new PL_COM_1200WB();
                System.out.println("PL_COM_1220:::::::::::::::");
                wb1200.pl_com_1220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//사내판매입금처리 메인
        	case PLComWBMapping.PL_COM_1300:
        		wb1300 = new PL_COM_1300WB();
                System.out.println("PL_COM_1300:::::::::::::::");
                wb1300.pl_com_1300_m(req, res);
				nextPage = "/jsp/pl/com/pl_com_1300_m.jsp";
				break;
        	//사내판매입금처리 상세조회
        	case PLComWBMapping.PL_COM_1310:
        		wb1300 = new PL_COM_1300WB();
                System.out.println("PL_COM_1310:::::::::::::::");
                wb1300.pl_com_1310_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1310_l.jsp";
				break;
        	//사내판매출고처리 저장/삭제
        	case PLComWBMapping.PL_COM_1320:
        		wb1300 = new PL_COM_1300WB();
                System.out.println("PL_COM_1320:::::::::::::::");
                wb1300.pl_com_1320_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

            //거래처발송처검색팝업 메인
        	case PLComWBMapping.PL_COM_1400:
        		wb1400 = new PL_COM_1400WB();
                System.out.println("PL_COM_1400:::::::::::::::");
        		wb1400.pl_com_1400_m(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1400_m.jsp";
        		break;        
        	//거래처발송처검색팝업 조회
        	case PLComWBMapping.PL_COM_1410:
        		wb1400 = new PL_COM_1400WB();
                System.out.println("PL_COM_1410:::::::::::::::");
                wb1400.pl_com_1410_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1410_l.jsp";
				break;
        	//거래처발송처검색팝업 1건조회
        	case PLComWBMapping.PL_COM_1420:
        		wb1400 = new PL_COM_1400WB();
                System.out.println("PL_COM_1420:::::::::::::::");
                wb1400.pl_com_1420_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1420_s.jsp";
				break;

            //할제리턴
        	case PLComWBMapping.PL_COM_1510:
        		wb1500 = new PL_COM_1500WB();
                System.out.println("PL_COM_1510:::::::::::::::");
        		wb1500.pl_com_1510_s(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1510_s.jsp";
        		break;        

        	//은행코드검색팝업 조회
        	case PLComWBMapping.PL_COM_1610:
        		wb1600 = new PL_COM_1600WB();
                System.out.println("PL_COM_1610:::::::::::::::");
                wb1600.pl_com_1610_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1610_l.jsp";
				break;
        	//은행코드검색팝업 1건조회
        	case PLComWBMapping.PL_COM_1620:
        		wb1600 = new PL_COM_1600WB();
                System.out.println("PL_COM_1620:::::::::::::::");
                wb1600.pl_com_1620_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1620_s.jsp";
				break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
