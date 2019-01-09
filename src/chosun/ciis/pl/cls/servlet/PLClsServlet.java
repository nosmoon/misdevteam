/***************************************************************************************************
 * 파일명 : PLClsServlet.java
 * 기능 :  마감관리서블릿
 * 작성일자 : 2009.05.11
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.cls.wb.*;

import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLClsServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/cls/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLClsServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLClsServlet : process : nextPage : " + nextPage);
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
     * PLClsWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PL_CLS_1000WB wb1000 = null;
        PL_CLS_1100WB wb1100 = null;
        PL_CLS_1200WB wb1200 = null;
        PL_CLS_1300WB wb1300 = null;
        PL_CLS_1400WB wb1400 = null;
        PL_CLS_1500WB wb1500 = null;
        PL_CLS_1600WB wb1600 = null;
        PL_CLS_1700WB wb1700 = null;
        PL_CLS_1800WB wb1800 = null;
        PL_CLS_2100WB wb2100 = null;
        PL_CLS_2200WB wb2200 = null;
        PL_CLS_2300WB wb2300 = null;
        
        switch (pid) {
        	//입금일마감 조회
        	case PLClsWBMapping.PL_CLS_1010:
        		wb1000 = new PL_CLS_1000WB();
                System.out.println("PL_CLS_1010:::::::::::::::");
                wb1000.pl_cls_1010_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1010_l.jsp";
				break;
        	//입금일마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_1020:
        		wb1000 = new PL_CLS_1000WB();
                System.out.println("PL_CLS_1020:::::::::::::::");
                wb1000.pl_cls_1020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//사내판매일마감 메인
        	case PLClsWBMapping.PL_CLS_1100:
        		wb1100 = new PL_CLS_1100WB();
                System.out.println("PL_CLS_1100:::::::::::::::");
                wb1100.pl_cls_1100_m(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1100_m.jsp";
				break;
        	//사내판매일마감 조회
        	case PLClsWBMapping.PL_CLS_1110:
        		wb1100 = new PL_CLS_1100WB();
                System.out.println("PL_CLS_1110:::::::::::::::");
                wb1100.pl_cls_1110_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1110_l.jsp";
				break;
        	//사내판매일마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_1120:
        		wb1100 = new PL_CLS_1100WB();
                System.out.println("PL_CLS_1120:::::::::::::::");
                wb1100.pl_cls_1120_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//매출월마감 메인
        	case PLClsWBMapping.PL_CLS_1200:
        		wb1200 = new PL_CLS_1200WB();
                System.out.println("PL_CLS_1200:::::::::::::::");
                wb1200.pl_cls_1200_m(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1200_m.jsp";
				break;
        	//매출월마감 조회
        	case PLClsWBMapping.PL_CLS_1210:
        		wb1200 = new PL_CLS_1200WB();
                System.out.println("PL_CLS_1210:::::::::::::::");
                wb1200.pl_cls_1210_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1210_l.jsp";
				break;
        	//매출월마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_1220:
        		wb1200 = new PL_CLS_1200WB();
                System.out.println("PL_CLS_1220:::::::::::::::");
                wb1200.pl_cls_1220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//입금월마감 메인
        	case PLClsWBMapping.PL_CLS_1300:
        		wb1300 = new PL_CLS_1300WB();
                System.out.println("PL_CLS_1300:::::::::::::::");
                wb1300.pl_cls_1300_m(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1300_m.jsp";
				break;
        	//입금월마감 조회
        	case PLClsWBMapping.PL_CLS_1310:
        		wb1300 = new PL_CLS_1300WB();
                System.out.println("PL_CLS_1310:::::::::::::::");
                wb1300.pl_cls_1310_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1310_l.jsp";
				break;
        	//입금월마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_1320:
        		wb1300 = new PL_CLS_1300WB();
                System.out.println("PL_CLS_1320:::::::::::::::");
                wb1300.pl_cls_1320_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//매출월가마감 메인
        	case PLClsWBMapping.PL_CLS_1400:
        		wb1400 = new PL_CLS_1400WB();
                System.out.println("PL_CLS_1400:::::::::::::::");
                wb1400.pl_cls_1400_m(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1400_m.jsp";
				break;
        	//매출월가마감 조회
        	case PLClsWBMapping.PL_CLS_1410:
        		wb1400 = new PL_CLS_1400WB();
                System.out.println("PL_CLS_1410:::::::::::::::");
                wb1400.pl_cls_1410_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1410_l.jsp";
				break;
        	//매출월가마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_1420:
        		wb1400 = new PL_CLS_1400WB();
                System.out.println("PL_CLS_1420:::::::::::::::");
                wb1400.pl_cls_1420_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//입금월가마감 메인
        	case PLClsWBMapping.PL_CLS_1500:
        		wb1500 = new PL_CLS_1500WB();
                System.out.println("PL_CLS_1500:::::::::::::::");
                wb1500.pl_cls_1500_m(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1500_m.jsp";
				break;
        	//입금월가마감 조회
        	case PLClsWBMapping.PL_CLS_1510:
        		wb1500 = new PL_CLS_1500WB();
                System.out.println("PL_CLS_1510:::::::::::::::");
                wb1500.pl_cls_1510_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1510_l.jsp";
				break;
        	//입금월가마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_1520:
        		wb1500 = new PL_CLS_1500WB();
                System.out.println("PL_CLS_1520:::::::::::::::");
                wb1500.pl_cls_1520_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//회계제출마감 조회
        	case PLClsWBMapping.PL_CLS_1610:
            	wb1600 = new PL_CLS_1600WB();
                System.out.println("PL_CLS_1610:::::::::::::::");
                wb1600.pl_cls_1610_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1610_l.jsp";
				break;
			//회계제출마감
        	case PLClsWBMapping.PL_CLS_1620:
        		wb1600 = new PL_CLS_1600WB();
                System.out.println("PL_CLS_1620:::::::::::::::");
                wb1600.pl_cls_1620_a(req, res); 
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

			//지국계산서
        	case PLClsWBMapping.PL_CLS_1710:
        		wb1700 = new PL_CLS_1700WB();
                System.out.println("PL_CLS_1710:::::::::::::::");
                wb1700.pl_cls_1710_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1710_l.jsp";
				break;
			//지국계산서
        	case PLClsWBMapping.PL_CLS_1720:
        		wb1700 = new PL_CLS_1700WB();
                System.out.println("PL_CLS_1720:::::::::::::::");
                wb1700.pl_cls_1720_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//지국계산서
        	case PLClsWBMapping.PL_CLS_1730:
        		wb1700 = new PL_CLS_1700WB();
                System.out.println("PL_CLS_1730:::::::::::::::");
                wb1700.pl_cls_1730_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//				지국계산서
        	case PLClsWBMapping.PL_CLS_1740:
        		wb1700 = new PL_CLS_1700WB();
                System.out.println("PL_CLS_1740:::::::::::::::");
                wb1700.pl_cls_1740_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1740_l.jsp";
				break;
			case PLClsWBMapping.PL_CLS_1810:
            	wb1800 = new PL_CLS_1800WB();
                System.out.println("PL_CLS_1810:::::::::::::::");
                wb1800.pl_cls_1810_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1810_l.jsp";
				break;		
			case PLClsWBMapping.PL_CLS_1815:
            	wb1800 = new PL_CLS_1800WB();
                System.out.println("PL_CLS_1815:::::::::::::::");
                wb1800.pl_cls_1815_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_1815_l.jsp";
				break;						
        	case PLClsWBMapping.PL_CLS_1820:
        		wb1800 = new PL_CLS_1800WB();
                System.out.println("PL_CLS_1820:::::::::::::::");
                wb1800.pl_cls_1820_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case PLClsWBMapping.PL_CLS_1830:
        		wb1800 = new PL_CLS_1800WB();
                System.out.println("PL_CLS_1830:::::::::::::::");
                wb1800.pl_cls_1830_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;			
           	case PLClsWBMapping.PL_CLS_1840:
        		wb1800 = new PL_CLS_1800WB();
                System.out.println("PL_CLS_18430:::::::::::::::");
                wb1800.pl_cls_1840_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	//매출월마감 조회
        	case PLClsWBMapping.PL_CLS_2110:
        		wb2100 = new PL_CLS_2100WB();
                System.out.println("PL_CLS_2110:::::::::::::::");
                wb2100.pl_cls_2110_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_2110_l.jsp";
				break;
        	//매출월마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_2120:
        		wb2100 = new PL_CLS_2100WB();
                System.out.println("PL_CLS_2120:::::::::::::::");
                wb2100.pl_cls_2120_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	//매출월마감 조회
        	case PLClsWBMapping.PL_CLS_2210:
        		wb2200 = new PL_CLS_2200WB();
                System.out.println("PL_CLS_2210:::::::::::::::");
                wb2200.pl_cls_2210_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_2210_l.jsp";
				break;
        	//매출월마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_2220:
        		wb2200 = new PL_CLS_2200WB();
                System.out.println("PL_CLS_2220:::::::::::::::");
                wb2200.pl_cls_2220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	        //단행본매출월마감 조회
	        case PLClsWBMapping.PL_CLS_2310:
        		wb2300 = new PL_CLS_2300WB();
                System.out.println("PL_CLS_2310:::::::::::::::");
                wb2300.pl_cls_2310_l(req, res);
				nextPage = "/jsp/pl/cls/pl_cls_2310_l.jsp";
				break;
	        	//매출월마감 마감/마감취소
        	case PLClsWBMapping.PL_CLS_2320:
        		wb2300 = new PL_CLS_2300WB();
                System.out.println("PL_CLS_2320:::::::::::::::");
                wb2300.pl_cls_2320_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
           	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
