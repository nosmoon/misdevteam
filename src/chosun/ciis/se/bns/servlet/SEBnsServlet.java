/***************************************************************************************************
 * ���ϸ� : SEBnsServlet.java
 * ��� :  ���˹���������
 * �ۼ����� : 2009.03.11
 * �ۼ��� :   �̹�ȿ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.se.bns.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.se.bns.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;

public class SEBnsServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/se/bns/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("SEBnsServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEBnsServlet : process : nextPage : " + nextPage);
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
     * SEBasWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
    	
        BaseWB workbean = null;
        String nextPage = null;
        SE_BNS_1100WB wb1100 = null;
        
        switch (pid) {
        	//���˹��̼�����Ȳ
			case SEBnsWBMapping.SE_BNS_1000:
				workbean = new SE_BNS_1000WB();
				((SE_BNS_1000WB)workbean).se_bns_1000_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_1000_m.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1010:
				workbean = new SE_BNS_1000WB();
				((SE_BNS_1000WB)workbean).se_bns_1010_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1010_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_1020:
				workbean = new SE_BNS_1000WB();
				((SE_BNS_1000WB)workbean).se_bns_1020_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1020_l.jsp";
				break; 			
        	case SEBnsWBMapping.SE_BNS_1100:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1100_m(req, res);
        		nextPage = "/jsp/se/bns/se_bns_1100_m.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1110:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1110_l(req, res);
        		nextPage = "/jsp/se/bns/se_bns_1110_l.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1120:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1120_s(req, res);
        		nextPage = "/jsp/se/bns/se_bns_1120_s.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1130:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1130_l(req, res);
        		nextPage = "/jsp/se/bns/se_bns_1130_l.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1140:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1140_l(req, res);
        		nextPage = "/jsp/se/bns/se_bns_1140_l.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1160:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1160_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1170:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1170_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		
        		break;
        	case SEBnsWBMapping.SE_BNS_1180:
        		wb1100 = new SE_BNS_1100WB();
        		wb1100.se_bns_1180_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		
        		break;
        	//���˹��߼����ڰ���
			case SEBnsWBMapping.SE_BNS_1400:
				workbean = new SE_BNS_1400WB();
				((SE_BNS_1400WB)workbean).se_bns_1400_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_1400_m.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1410:
				workbean = new SE_BNS_1400WB();
				((SE_BNS_1400WB)workbean).se_bns_1410_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1410_l.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1420:
				workbean = new SE_BNS_1400WB();
				((SE_BNS_1400WB)workbean).se_bns_1420_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1430:
				workbean = new SE_BNS_1400WB();
				((SE_BNS_1400WB)workbean).se_bns_1430_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
			//���˹��߼����ڰ���
			case SEBnsWBMapping.SE_BNS_1510:
				workbean = new SE_BNS_1500WB();
				((SE_BNS_1500WB)workbean).se_bns_1510_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1510_l.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1520:
				workbean = new SE_BNS_1500WB();
				((SE_BNS_1500WB)workbean).se_bns_1520_s(req, res);
				nextPage = "/jsp/se/bns/se_bns_1520_s.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1530:
				workbean = new SE_BNS_1500WB();
				((SE_BNS_1500WB)workbean).se_bns_1530_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
			//���˹�����ó��
			case SEBnsWBMapping.SE_BNS_1600:
				workbean = new SE_BNS_1600WB();
				((SE_BNS_1600WB)workbean).se_bns_1600_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_1600_m.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1610:
				workbean = new SE_BNS_1600WB();
				((SE_BNS_1600WB)workbean).se_bns_1610_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1610_l.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1620:
				workbean = new SE_BNS_1600WB();
				((SE_BNS_1600WB)workbean).se_bns_1620_s(req, res);
				nextPage = "/jsp/se/bns/se_bns_1620_s.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1630:
				workbean = new SE_BNS_1600WB();
				((SE_BNS_1600WB)workbean).se_bns_1630_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break; 
			//���˹������Ȳ��ȸ
			case SEBnsWBMapping.SE_BNS_1700:
				workbean = new SE_BNS_1700WB();
				((SE_BNS_1700WB)workbean).se_bns_1700_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_1700_m.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1710:
				workbean = new SE_BNS_1700WB();
				((SE_BNS_1700WB)workbean).se_bns_1710_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1710_l.jsp";
				break; 
			//���˹�����Ʈ
			case SEBnsWBMapping.SE_BNS_1800:
				workbean = new SE_BNS_1800WB();
				((SE_BNS_1800WB)workbean).se_bns_1800_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_1800_m.jsp";
				break; 
			case SEBnsWBMapping.SE_BNS_1810:
				nextPage = "/jsp/se/bns/se_bns_1810_p.jsp";
				break; 
			//���˹�(����)��꼭 ����
			case SEBnsWBMapping.SE_BNS_1900:
				nextPage = "/jsp/se/bns/se_bns_1900_m.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_1910:
				workbean = new SE_BNS_1900WB();
				((SE_BNS_1900WB)workbean).se_bns_1910_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_1910_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_1920:
				workbean = new SE_BNS_1900WB();
				((SE_BNS_1900WB)workbean).se_bns_1920_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//���˹����ݰ�꼭 ����
			case SEBnsWBMapping.SE_BNS_2000:
				workbean = new SE_BNS_2000WB();
				((SE_BNS_2000WB)workbean).se_bns_2000_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_2000_m.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2010:
				workbean = new SE_BNS_2000WB();
				((SE_BNS_2000WB)workbean).se_bns_2010_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_2010_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2020:
				workbean = new SE_BNS_2000WB();
				((SE_BNS_2000WB)workbean).se_bns_2020_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2030:
				workbean = new SE_BNS_2000WB();
				((SE_BNS_2000WB)workbean).se_bns_2030_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//���˹��Աݵ��
			case SEBnsWBMapping.SE_BNS_2100:
				workbean = new SE_BNS_2100WB();
				((SE_BNS_2100WB)workbean).se_bns_2100_m(req, res);
				nextPage = "/jsp/se/bns/se_bns_2100_m.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2110:
				workbean = new SE_BNS_2100WB();
				((SE_BNS_2100WB)workbean).se_bns_2110_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_2110_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2120:
				workbean = new SE_BNS_2100WB();
				((SE_BNS_2100WB)workbean).se_bns_2120_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_2120_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2130:
				workbean = new SE_BNS_2100WB();
				((SE_BNS_2100WB)workbean).se_bns_2130_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_2130_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2140:
				workbean = new SE_BNS_2100WB();
				((SE_BNS_2100WB)workbean).se_bns_2140_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2150:
				workbean = new SE_BNS_2100WB();
				((SE_BNS_2100WB)workbean).se_bns_2150_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			//���˹����⸶��
			case SEBnsWBMapping.SE_BNS_2200:
				nextPage = "/jsp/se/bns/se_bns_2200_m.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2210:
				workbean = new SE_BNS_2200WB();
				((SE_BNS_2200WB)workbean).se_bns_2210_l(req, res);
				nextPage = "/jsp/se/bns/se_bns_2210_l.jsp";
				break;
			case SEBnsWBMapping.SE_BNS_2220:
				workbean = new SE_BNS_2200WB();
				((SE_BNS_2200WB)workbean).se_bns_2220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
