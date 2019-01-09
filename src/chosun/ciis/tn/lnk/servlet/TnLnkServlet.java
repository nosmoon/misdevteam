/***************************************************************************************************
 * 파일명 : TnLnkServlet.java
 * 기능 : 기초자료관리를  위한 이벤트 분기
 * 작성일자 : 2009-01-02
 * 작성자 : 김태길
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.tn.lnk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.tn.lnk.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class TnLnkServlet extends BaseServlet {

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
            String servletMappedUrl = "/tn/lnk/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("TnLnkServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("TnLnkServlet : process : nextPage : " + nextPage);
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

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PilotWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
                                int pid) throws Exception{
        String nextPage = null;
        BaseWB workbean = null;
        switch (pid) {
    	case TnLnkWBMapping.TN_LNK_1000:
    		workbean = new TnLnk1000WB();
    		((TnLnk1000WB)workbean).tn_lnk_1000_m(req, res);
    		nextPage = "/jsp/tn/lnk/tn_lnk_1000_m.jsp";
    		break;
        	case TnLnkWBMapping.TN_LNK_1010:
        		workbean = new TnLnk1000WB();
        		((TnLnk1000WB)workbean).tn_lnk_1010_l(req, res);
        		nextPage = "/jsp/tn/lnk/tn_lnk_1010_l.jsp";
        		break;
        	case TnLnkWBMapping.TN_LNK_1020:
        		workbean = new TnLnk1000WB();
        		((TnLnk1000WB)workbean).tn_lnk_1020_s(req, res);
        		nextPage = "/jsp/tn/lnk/tn_lnk_1020_s.jsp";
        		break;         
        	case TnLnkWBMapping.TN_LNK_1030:
        		workbean = new TnLnk1000WB();
        		((TnLnk1000WB)workbean).tn_lnk_1030_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
        		break;     
        	case TnLnkWBMapping.TN_LNK_1040:
        		workbean = new TnLnk1000WB();
        		((TnLnk1000WB)workbean).tn_lnk_1040_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
        		break; 
        	case TnLnkWBMapping.TN_LNK_1110:
        		workbean = new TnLnk1100WB();
        		((TnLnk1100WB)workbean).tn_lnk_1110_l(req, res);
        		nextPage = "/jsp/tn/lnk/tn_lnk_1110_l.jsp";
        		break;
        	case TnLnkWBMapping.TN_LNK_1151:
        		workbean = new TnLnk1100WB();
        		((TnLnk1100WB)workbean).tn_lnk_1151_l(req, res);
        		nextPage = "/jsp/tn/lnk/tn_lnk_1151_l.jsp";
        		break;  
			case TnLnkWBMapping.TN_LNK_1152:
				workbean = new TnLnk1100WB();
				((TnLnk1100WB)workbean).tn_lnk_1152_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1152_a_rm.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1153:
				workbean = new TnLnk1100WB();
				((TnLnk1100WB)workbean).tn_lnk_1153_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1153_a_rm.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1154:
				workbean = new TnLnk1100WB();
				((TnLnk1100WB)workbean).tn_lnk_1154_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1154_a.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1155:
				workbean = new TnLnk1100WB();
				((TnLnk1100WB)workbean).tn_lnk_1155_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1156:
				workbean = new TnLnk1100WB();
				((TnLnk1100WB)workbean).tn_lnk_1156_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1210:
				workbean = new TnLnk1200WB();
				((TnLnk1200WB)workbean).tn_lnk_1210_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1210_l.jsp";
				break;	
			case TnLnkWBMapping.TN_LNK_1220:
				workbean = new TnLnk1200WB();
				((TnLnk1200WB)workbean).tn_lnk_1220_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case TnLnkWBMapping.TN_LNK_1250:
				workbean = new TnLnk1200WB();
				((TnLnk1200WB)workbean).tn_lnk_1250_s(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1250_s.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1251:
				workbean = new TnLnk1200WB();
				((TnLnk1200WB)workbean).tn_lnk_1251_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1251_l.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1252:
				workbean = new TnLnk1200WB();
				((TnLnk1200WB)workbean).tn_lnk_1252_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1252_a.jsp";
				break;
			case TnLnkWBMapping.TN_LNK_1253:
				workbean = new TnLnk1200WB();
				((TnLnk1200WB)workbean).tn_lnk_1253_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_1253_a.jsp";
				break;
			//CMS승인관리-승인의뢰
			case TnLnkWBMapping.TN_LNK_2000:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2000_m(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2000_m.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_2010:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2010_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2010_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2020:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2020_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2020_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2030:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2030_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2030_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_2100:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2100_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2100_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2110:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2110_s(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2110_s.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2033:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2033_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2033_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2035:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2035_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2035_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2040:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2040_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2040_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_2051:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2051_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2051_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_2052:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2052_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2052_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2065:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2065_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2065_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_2067:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2067_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2067_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_2070:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2070_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2070_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_2071:
				workbean = new TnLnk2000WB();
				((TnLnk2000WB)workbean).tn_lnk_2071_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_2071_a.jsp";
				break;
				
			//CMS출금관리-출금의뢰
			case TnLnkWBMapping.TN_LNK_3000:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3000_m(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3000_m.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_3010:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3010_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3010_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_3020:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3020_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3020_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_3030:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3030_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3030_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_3035:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3035_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3035_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_3040:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3040_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3040_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_3051:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3051_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3051_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_3052:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3052_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3052_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_3065:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3065_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3065_a.jsp";
				break;
			
			case TnLnkWBMapping.TN_LNK_3070:
				workbean = new TnLnk3000WB();
				((TnLnk3000WB)workbean).tn_lnk_3070_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_3070_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_4010:
				workbean = new TnLnk4000WB();
				((TnLnk4000WB)workbean).tn_lnk_4010_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_4010_l.jsp";
				break;
			
			case TnLnkWBMapping.TN_LNK_4020:
				workbean = new TnLnk4000WB();
				((TnLnk4000WB)workbean).tn_lnk_4020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			
			case TnLnkWBMapping.TN_LNK_4110:
				workbean = new TnLnk4000WB();
				((TnLnk4000WB)workbean).tn_lnk_4110_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_4110_l.jsp";
				break;
			
			case TnLnkWBMapping.TN_LNK_4120:
				workbean = new TnLnk4000WB();
				((TnLnk4000WB)workbean).tn_lnk_4120_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_4120_l.jsp";
				break;
		
			case TnLnkWBMapping.TN_LNK_5000:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5000_m(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5000_m.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_5005:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5005_m(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5005_m.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_5010:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5010_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5010_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_5020:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5020_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5020_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_5030:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5030_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5030_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_5035:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5035_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5035_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_5040:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5040_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5040_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_5050:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5050_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5050_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_5060:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5060_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5060_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_5070:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5070_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5070_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_5080:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5080_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5080_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_5090:
				workbean = new TnLnk5000WB();
				((TnLnk5000WB)workbean).tn_lnk_5090_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_5090_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6000:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6000_m(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6000_m.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6005:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6005_m(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6005_m.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6010:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6010_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6010_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6020:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6020_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6020_l.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6030:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6030_l(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6030_l.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6035:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6035_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6035_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6040:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6040_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6040_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6050:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6050_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6050_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6052:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6052_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6052_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6060:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6060_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6060_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6070:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6070_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6070_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6072:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6072_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6072_a.jsp";
				break;

			case TnLnkWBMapping.TN_LNK_6080:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6080_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6080_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6087:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6087_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6087_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6090:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6090_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6090_a.jsp";
				break;
				
			case TnLnkWBMapping.TN_LNK_6096:
				workbean = new TnLnk6000WB();
				((TnLnk6000WB)workbean).tn_lnk_6096_a(req, res);
				nextPage = "/jsp/tn/lnk/tn_lnk_6096_a.jsp";
				break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
	        
        return nextPage;
    }
 
}

