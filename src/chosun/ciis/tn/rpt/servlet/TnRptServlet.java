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


package chosun.ciis.tn.rpt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.tn.rpt.wb.TN_RPT_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class TnRptServlet extends BaseServlet {
 
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
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/tn/rpt/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("TnReportServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("TnReportServlet : process : nextPage : " + nextPage);
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
     * TnRptWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        TN_RPT_1000WB wb1 = null;      
        
        switch (pid) {
	    	case TnRptWBMapping.TN_RRT_1010_M:  //통일나눔_영수증 발급대장 모금부서 콤보리스트
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_report_1010_m(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1010_m.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1020_L:  //통일나눔_영수증 발급대장_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1020_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1020_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1021_L:  //통일나눔_영수증 발급대장_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1020_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1021_l.jsp";
				break;				
				
	    	case TnRptWBMapping.TN_RPT_1050_L:  //통일나눔_통장내역조회_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1050_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1050_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1400_L:  //통일나눔_약정납입현황_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1400_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1400_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1500_L:  //통일나눔_데이터감사_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1500_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1500_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1510_L:  //통일나눔_데이터감사 상세(회원)_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1510_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1510_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1520_L:  //통일나눔_데이터감사 상세(약정)_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1520_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1520_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1600_L:  //통일나눔_약정명단_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1600_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1600_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1610_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1650_L:  //통일나눔_약정명단_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1600_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1600_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1650_l.jsp";
				break;	
	    	case TnRptWBMapping.TN_RPT_1800_L:  //통일나눔_납입명단_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1800_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1800_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1810_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1850_L:  //통일나눔_납입명단_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1800_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1800_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1850_l.jsp";
				break;				
	    	case TnRptWBMapping.TN_RPT_1101_L:  //통일나눔_계좌번호관리_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1101_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1101_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1102_A:  //통일나눔_계좌번호관리_저장
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1131_L:  //통일나눔_정기예금조회_조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1131_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1131_l.jsp";
				break;
				
	    	case TnRptWBMapping.TN_RPT_1140_M:  //SMS전송내용조회 초기화면
	    		wb1 = new TN_RPT_1000WB();
				//((TN_RPT_1000WB)wb1).tn_rpt_1140_m(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1140_m.jsp";
				break;

	    	case TnRptWBMapping.TN_RPT_1141_L:  //SMS전송내용 조회
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1141_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1141_l.jsp";
				break;
				
			case TnRptWBMapping.TN_RPT_1301_L:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1301_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1301_l.jsp";
				break;			
			case TnRptWBMapping.TN_RPT_1302_I:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1302_i(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1302_i.jsp";
				break;	
			case TnRptWBMapping.TN_RPT_1700_M:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1700_m(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1700_m.jsp";
				break;					
			case TnRptWBMapping.TN_RPT_1701_L:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1701_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1701_l.jsp";
				break;				
								
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}
