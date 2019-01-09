/***************************************************************************************************
 * 파일명 : AdEisServlet.java
 * 기능 : 세금계산서관리  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ad.eis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.eis.wb.AdEis1000WB;
import chosun.ciis.ad.eis.wb.AdEis1100WB;
import chosun.ciis.ad.eis.wb.AdEis1200WB;
import chosun.ciis.ad.eis.wb.AdEis1300WB;
import chosun.ciis.ad.eis.wb.AdEis1400WB;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class AdEisServlet extends BaseServlet {

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
            String servletMappedUrl = "/ad/eis/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("AdEisServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("AdEisServlet : process : nextPage : " + nextPage);
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
     * AdEisWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        BaseWB workbean = null;

        switch (pid) { 
//			본지50대광고주광고실적        
        	case AdEisWBMapping.AD_EIS_1010:
        		workbean = new AdEis1000WB();
        		((AdEis1000WB)workbean).ad_eis_1010_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1010_l.jsp";
        		break;
        	case AdEisWBMapping.AD_EIS_1020:
        		workbean = new AdEis1000WB();
        		((AdEis1000WB)workbean).ad_eis_1020_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1020_l.jsp";
        		break;
        		
//			본지50대광고주방송광고입력
        	case AdEisWBMapping.AD_EIS_1110:
        		workbean = new AdEis1100WB();
        		((AdEis1100WB)workbean).ad_eis_1110_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1110_l.jsp";
        		break;
        	case AdEisWBMapping.AD_EIS_1120:
        		workbean = new AdEis1100WB();
        		((AdEis1100WB)workbean).ad_eis_1120_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;

//    		본판섹션별 일일게재액및발행면수
        	case AdEisWBMapping.AD_EIS_1200:
        		workbean = new AdEis1200WB();
        		((AdEis1200WB)workbean).ad_eis_1200_m(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1200_m.jsp";
        		break;        		
        	case AdEisWBMapping.AD_EIS_1210:
        		workbean = new AdEis1200WB();
        		((AdEis1200WB)workbean).ad_eis_1210_l(req, res);
        		nextPage = "/jsp/ad/eis/ad_eis_1210_l.jsp";
        		break;   

//        		게재액 및 발행면수 - 월별 
            case AdEisWBMapping.AD_EIS_1310:
            	workbean = new AdEis1300WB();
            	((AdEis1300WB)workbean).ad_eis_1310_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1310_l.jsp";
            	break;
//        		게재액 및 발행면수 - 년별 
            case AdEisWBMapping.AD_EIS_1320:
            	workbean = new AdEis1300WB();
            	((AdEis1300WB)workbean).ad_eis_1320_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1320_l.jsp";
            	break;
        		
//    		광고매출분석
            case AdEisWBMapping.AD_EIS_1400:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1400_m(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1400_m.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1410:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1410_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1410_l.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1420:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1420_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1420_l.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1425:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1425_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1425_l.jsp";
            	break;      		
            case AdEisWBMapping.AD_EIS_1430:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1430_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1430_l.jsp";
            	break;        		
            case AdEisWBMapping.AD_EIS_1440:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1440_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1440_l.jsp";
            	break;       		
            case AdEisWBMapping.AD_EIS_1450:
            	workbean = new AdEis1400WB();
            	((AdEis1400WB)workbean).ad_eis_1450_l(req, res);
            	nextPage = "/jsp/ad/eis/ad_eis_1450_l.jsp";
            	break;  
            	
            case AdEisWBMapping.AD_EIS_1600:
            	String pubc_dt	=	Util.checkString(req.getParameter("pubc_dt"));
            	nextPage = "/xrw/ad/eis/ad_eis_1600.jsp?pubc_dt="+pubc_dt;
            	break;        		            	

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
