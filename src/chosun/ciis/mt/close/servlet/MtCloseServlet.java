package chosun.ciis.mt.close.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.close.wb.MT_CLOSE_1000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_2000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_4000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_5000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_6000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_6100WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_7000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_8000WB;
import chosun.ciis.mt.close.wb.MT_CLOSE_9000WB;
import chosun.ciis.mt.close.servlet.MtCloseWBMapping;
 
 

public class MtCloseServlet extends BaseServlet {

 
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
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;

        try {
            String servletMappedUrl = "/mt/close/";
            iPid = extractPid(req, servletMappedUrl);

            nextPage = executeWorker(req, res, iPid);
            System.out.println("MtpapinoutSevlet : iPid : " + iPid);
            System.out.println("MtpapinoutSevlet : nextPage : " + nextPage);
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
        MT_CLOSE_1000WB wb  = null;
        MT_CLOSE_2000WB wb2 = null;
        MT_CLOSE_4000WB wb4 = null;
        MT_CLOSE_5000WB wb5  = null;
        MT_CLOSE_6000WB wb6 = null;
        MT_CLOSE_6100WB wb1 = null;
        MT_CLOSE_7000WB wb7 = null;
        MT_CLOSE_8000WB wb8 = null;
        MT_CLOSE_9000WB wb9 = null;
         
        switch (pid) {
        	case MtCloseWBMapping.MT_CLOSE_1000:
				wb = new MT_CLOSE_1000WB();
				((MT_CLOSE_1000WB)wb).mt_close_1000_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_1000_l.jsp";
				break;

        	case MtCloseWBMapping.MT_CLOSE_1001:
				wb = new MT_CLOSE_1000WB();
				((MT_CLOSE_1000WB)wb).mt_close_1001_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_1001_l.jsp";
				break;
    		
        	case MtCloseWBMapping.MT_CLOSE_1002:
				wb = new MT_CLOSE_1000WB();
				((MT_CLOSE_1000WB)wb).mt_close_1002_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_1002_a.jsp";
				break;
    
    		/******************************************************************/
    		/* 필름사용비율조회 MT_CLOSE_2000                                    */
    		/******************************************************************/
        	case MtCloseWBMapping.MT_CLOSE_2000:
				wb2 = new MT_CLOSE_2000WB();
				wb2.mt_close_2000_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_2000_l.jsp";
				break;

            case MtCloseWBMapping.MT_CLOSE_2001:
				wb2 = new MT_CLOSE_2000WB();
				wb2.mt_close_2001_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_2001_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_2002:
				wb2 = new MT_CLOSE_2000WB();
				wb2.mt_close_2002_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_2002_l.jsp";
				break;

            case MtCloseWBMapping.MT_CLOSE_4000:

    		    System.out.println("MT_CLOSE_4000:::::::::::::::");

    		    wb4 = new MT_CLOSE_4000WB();
    		    wb4.mt_close_4000(req, res);

    		    System.out.println("화면페이지로 가기...");
    		    nextPage = "/jsp/mt/close/mt_close_4000_l.jsp";
    		    break;

            case MtCloseWBMapping.MT_CLOSE_4001:

    		    System.out.println("MT_CLOSE_4001:::::::::::::::");

    		    wb4 = new MT_CLOSE_4000WB();
    		    wb4.mt_close_4001(req, res);

    		    nextPage = "/jsp/mt/close/mt_close_4001_a.jsp";
    		    break;
    		    
            case MtCloseWBMapping.MT_CLOSE_5001:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5001_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_5001_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5002:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5002_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_5002_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5003:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5003_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_5003_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5004:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5004_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_5004_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5005:
            	
            	wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5005_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_5005_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5006:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5006_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_5006_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5007:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5007_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_5007_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5008:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5008_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_5008_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5009:
            	wb5 = new MT_CLOSE_5000WB();
            	wb5.mt_close_5009_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_5009_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5011:
            	wb5 = new MT_CLOSE_5000WB();
            	wb5.mt_close_5011_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_5011_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_5101:
				wb5 = new MT_CLOSE_5000WB();
				wb5.mt_close_5101_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_5101_l.jsp";
				break;
						
			/******************************************************************/
    		/* 제작비 MT_CLOSE_6000                                             */
    		/******************************************************************/
            case MtCloseWBMapping.MT_CLOSE_6010:
				wb6 = new MT_CLOSE_6000WB();
				wb6.mt_close_6010_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_6010_l.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_6020:
				wb6 = new MT_CLOSE_6000WB();
				wb6.mt_close_6020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			/******************************************************************/
    		/* 원가 MT_CLOSE_6100                                             */
    		/******************************************************************/
            case MtCloseWBMapping.MT_CLOSE_6100:
				wb1 = new MT_CLOSE_6100WB(); 
				wb1.mt_close_6100_m(req, res);
				nextPage = "/jsp/mt/close/mt_close_6100_m.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_6110:
				wb1 = new MT_CLOSE_6100WB(); 
				wb1.mt_close_6110_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_6110_l.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_6120:
				wb1 = new MT_CLOSE_6100WB(); 
				wb1.mt_close_6120_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_6120_l.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_6130:
				wb1 = new MT_CLOSE_6100WB(); 
				wb1.mt_close_6130_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_6130_l.jsp";
				break;
    		/******************************************************************/
    		/* 배부비결과조회 MT_CLOSE_7000                                      */
    		/******************************************************************/
            case MtCloseWBMapping.MT_CLOSE_7000:
				wb7 = new MT_CLOSE_7000WB();
				wb7.mt_close_7000_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_7000_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_7001:
				wb7 = new MT_CLOSE_7000WB();
				wb7.mt_close_7001_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_7001_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_7002:
				wb7 = new MT_CLOSE_7000WB();
				wb7.mt_close_7002_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_7002_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_7003:
				wb7 = new MT_CLOSE_7000WB();
				wb7.mt_close_7003_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_7003_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_7004:
				wb7 = new MT_CLOSE_7000WB();
				wb7.mt_close_7004_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_7004_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_7005:
            	wb7 = new MT_CLOSE_7000WB();
            	wb7.mt_close_7005_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_7005_l.jsp";
				break;
				
    		/******************************************************************/
    		/* 예산코드결과조회 MT_CLOSE_8000                                      */
    		/******************************************************************/
            
            case MtCloseWBMapping.MT_CLOSE_8000:
				wb8 = new MT_CLOSE_8000WB();
				wb8.mt_close_8000_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_8000_l.jsp";
				break;
            
            case MtCloseWBMapping.MT_CLOSE_8001:
				wb8 = new MT_CLOSE_8000WB();
				wb8.mt_close_8001_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_8001_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_8002:
				wb8 = new MT_CLOSE_8000WB();
				wb8.mt_close_8002_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_8002_l.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_8003:
            	wb8 = new MT_CLOSE_8000WB();
            	wb8.mt_close_8003_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_8003_l.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_8004:
            	wb8 = new MT_CLOSE_8000WB();
            	wb8.mt_close_8004_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_8004_l.jsp";
				break;
            case MtCloseWBMapping.MT_CLOSE_8005:
            	wb8 = new MT_CLOSE_8000WB();
            	wb8.mt_close_8005_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_8005_l.jsp";
				break;
				
				
            case MtCloseWBMapping.MT_CLOSE_9001:
            	wb9 = new MT_CLOSE_9000WB();
            	wb9.mt_close_9001_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_9001_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_9002:
				wb9 = new MT_CLOSE_9000WB();
				wb9.mt_close_9002_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_9002_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_9003:
				wb9 = new MT_CLOSE_9000WB();
				wb9.mt_close_9003_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_9003_a.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_9004:
				wb9 = new MT_CLOSE_9000WB();
				wb9.mt_close_9004_l(req, res);
				nextPage = "/jsp/mt/close/mt_close_9004_l.jsp";
				break;
				
            case MtCloseWBMapping.MT_CLOSE_9005:
            	wb9 = new MT_CLOSE_9000WB();
            	wb9.mt_close_9005_a(req, res);
				nextPage = "/jsp/mt/close/mt_close_9005_a.jsp";
				break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}