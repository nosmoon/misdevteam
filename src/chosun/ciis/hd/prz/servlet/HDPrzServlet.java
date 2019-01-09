
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


package chosun.ciis.hd.prz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.prz.wb.HD_PRZ_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDPrzServlet extends BaseServlet {

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
            String servletMappprzrl = "/hd/prz/";
            iPid = extractPid(req, servletMappprzrl);
            
            System.out.println("HDPrzServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDPrzServlet : process : nextPage : " + nextPage);
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
        HD_PRZ_1000WB wb = null;
		switch(pid) {
			case HDPrzWBMapping.HD_PRZ_1000:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1000(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1000_l.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1001:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1001(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1001_l.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1002:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1002(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1002_l.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1003:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1003(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1003_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1004:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1004(req, res);
				//nextPage = "/jsp/hd/prz/hd_prz_1004_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1005:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1005_m(req, res);
				//nextPage = "/jsp/hd/prz/hd_prz_1004_a.jsp";
				nextPage = "/jsp/hd/prz/hd_prz_1005_m.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1100:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1100(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1100_l.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1101:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1101(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1101_l.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1103:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1103(req, res);
				//nextPage = "/jsp/hd/prz/hd_prz_1103_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1104:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1104_l(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1104_l.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1106:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1106_m(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1106_m.jsp";
				break;
			case HDPrzWBMapping.HD_PRZ_1200:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1200(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1200_l.jsp";
				break;			
			case HDPrzWBMapping.HD_PRZ_1201:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1201(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1201_l.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1202:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1202(req, res);
				//nextPage = "/jsp/hd/prz/hd_prz_1202_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case HDPrzWBMapping.HD_PRZ_1300:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1300(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1300_l.jsp";
				break;		
			case HDPrzWBMapping.HD_PRZ_1301_L:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1301_l(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1301_l.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1302:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1302_m(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1302_m.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1400:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1400(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1400_l.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1401:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1401(req, res);
				nextPage = "/jsp/hd/prz/hd_prz_1401_l.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1402:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1402(req, res);
				//nextPage = "/jsp/hd/prz/hd_prz_1402_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDPrzWBMapping.HD_PRZ_1105_D:
				wb = new HD_PRZ_1000WB();
				((HD_PRZ_1000WB)wb).hd_prz_1105_d(req, res); 
				nextPage = "/jsp/hd/prz/hd_prz_1105_d.jsp";
				break;
			default:
				throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
			}
		return nextPage;
	}    
}
