/***************************************************************************************************
 * ���ϸ� : SETrgServlet.java
 * ��� : �Ǹ� - ��ǥ����
 * �ۼ����� : 2009-03-20
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.se.trg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.se.trg.wb.*;

public class SETrgServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/trg/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SEBoiServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SEBoiServlet : process : nextPage : " + nextPage);
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
        String nextPage = null;
        BaseWB workbean = null;
        
        switch (pid) {
        	//������ ��ǥ���
        	case SETrgWBMapping.SE_TRG_1000:
         		workbean = new SE_TRG_1000WB();
         		((SE_TRG_1000WB)workbean).se_trg_1000_m(req, res);
        		nextPage = "/jsp/se/trg/se_trg_1000_m.jsp";
        		break;        
        	case SETrgWBMapping.SE_TRG_1010:
        		workbean = new SE_TRG_1000WB();
        		((SE_TRG_1000WB)workbean).se_trg_1010_l(req, res);
        		nextPage = "/jsp/se/trg/se_trg_1010_l.jsp";
        		break;  
        	case SETrgWBMapping.SE_TRG_1020:
        		workbean = new SE_TRG_1000WB();
        		((SE_TRG_1000WB)workbean).se_trg_1020_l(req, res);
        		nextPage = "/jsp/se/trg/se_trg_1020_l.jsp";
        		break;
        	case SETrgWBMapping.SE_TRG_1025:
        		workbean = new SE_TRG_1000WB();
        		((SE_TRG_1000WB)workbean).se_trg_1025_l(req, res);
        		nextPage = "/jsp/se/trg/se_trg_1025_l.jsp";
        		break;
        	case SETrgWBMapping.SE_TRG_1030:
        		workbean = new SE_TRG_1000WB();
        		((SE_TRG_1000WB)workbean).se_trg_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;  
			case SETrgWBMapping.SE_TRG_1040:
				workbean = new SE_TRG_1000WB();
				((SE_TRG_1000WB)workbean).se_trg_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case SETrgWBMapping.SE_TRG_1050:
        		workbean = new SE_TRG_1000WB();
        		((SE_TRG_1000WB)workbean).se_trg_1050_s(req, res);
        		nextPage = "/jsp/se/trg/se_trg_1050_s.jsp";
        		break;   
			case SETrgWBMapping.SE_TRG_1060:
				workbean = new SE_TRG_1000WB();
				((SE_TRG_1000WB)workbean).se_trg_1060_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//��������ǥ���
			case SETrgWBMapping.SE_TRG_1100:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1100_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1100_m.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1110:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1110_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1110_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1120:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1120_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1120_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1130:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1140:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1150:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1150_s(req, res);
        		nextPage = "/jsp/se/trg/se_trg_1150_s.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1160:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1160_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case SETrgWBMapping.SE_TRG_1170:
				workbean = new SE_TRG_1100WB();
				((SE_TRG_1100WB)workbean).se_trg_1170_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//��ǥ�����ȸ
			case SETrgWBMapping.SE_TRG_1200:
				workbean = new SE_TRG_1200WB();
				((SE_TRG_1200WB)workbean).se_trg_1200_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1200_m.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1210:
				workbean = new SE_TRG_1200WB();
				((SE_TRG_1200WB)workbean).se_trg_1210_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1210_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1220:
				workbean = new SE_TRG_1200WB();
				((SE_TRG_1200WB)workbean).se_trg_1220_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1220_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1250:
				workbean = new SE_TRG_1200WB();
				((SE_TRG_1200WB)workbean).se_trg_1250_s(req, res);
				nextPage = "/jsp/se/trg/se_trg_1250_s.jsp";
				break;	
			//����Ȯ��׼������
			case SETrgWBMapping.SE_TRG_1300:
				workbean = new SE_TRG_1300WB();
				((SE_TRG_1300WB)workbean).se_trg_1300_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1300_m.jsp";
				break;	
			case SETrgWBMapping.SE_TRG_1310:
				workbean = new SE_TRG_1300WB();
				((SE_TRG_1300WB)workbean).se_trg_1310_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1310_l.jsp";
				break;	
			case SETrgWBMapping.SE_TRG_1320:
				workbean = new SE_TRG_1300WB();
				((SE_TRG_1300WB)workbean).se_trg_1320_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//�����򰡱��ذ���
			case SETrgWBMapping.SE_TRG_1400:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1400_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1400_m.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1410:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1410_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1410_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1415:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1410_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1415_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1420:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1420_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1420_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1430:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1440:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1440_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1450:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1450_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1460:
				workbean = new SE_TRG_1400WB();
				((SE_TRG_1400WB)workbean).se_trg_1460_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//�����򰡰������
			case SETrgWBMapping.SE_TRG_1500:
				workbean = new SE_TRG_1500WB();
				((SE_TRG_1500WB)workbean).se_trg_1500_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1500_m.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1510:
				workbean = new SE_TRG_1500WB();
				((SE_TRG_1500WB)workbean).se_trg_1510_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1510_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1520:
				workbean = new SE_TRG_1500WB();
				((SE_TRG_1500WB)workbean).se_trg_1520_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1540:
				workbean = new SE_TRG_1500WB();
				((SE_TRG_1500WB)workbean).se_trg_1540_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case SETrgWBMapping.SE_TRG_1550:
				workbean = new SE_TRG_1500WB();
				((SE_TRG_1500WB)workbean).se_trg_1550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1560:
				workbean = new SE_TRG_1500WB();
				((SE_TRG_1500WB)workbean).se_trg_1560_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//�����򰡰����ȸ
			case SETrgWBMapping.SE_TRG_1600:
				workbean = new SE_TRG_1600WB();
				((SE_TRG_1600WB)workbean).se_trg_1600_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1600_m.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1610:
				workbean = new SE_TRG_1600WB();
				((SE_TRG_1600WB)workbean).se_trg_1610_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1610_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1620:
				workbean = new SE_TRG_1600WB();
				((SE_TRG_1600WB)workbean).se_trg_1620_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1620_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1630:
				workbean = new SE_TRG_1600WB();
				((SE_TRG_1600WB)workbean).se_trg_1630_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1630_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1640:
				workbean = new SE_TRG_1600WB();
				((SE_TRG_1600WB)workbean).se_trg_1640_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1640_l.jsp";
				break;
			//����򰡱��ذ���
			case SETrgWBMapping.SE_TRG_1710:
				workbean = new SE_TRG_1700WB();
				((SE_TRG_1700WB)workbean).se_trg_1710_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1710_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1720:
				workbean = new SE_TRG_1700WB();
				((SE_TRG_1700WB)workbean).se_trg_1720_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1720_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1730:
				workbean = new SE_TRG_1700WB();
				((SE_TRG_1700WB)workbean).se_trg_1730_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1740:
				workbean = new SE_TRG_1700WB();
				((SE_TRG_1700WB)workbean).se_trg_1740_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1750:
				workbean = new SE_TRG_1700WB();
				((SE_TRG_1700WB)workbean).se_trg_1750_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//����򰡴���ڼ���
			case SETrgWBMapping.SE_TRG_1810:
				workbean = new SE_TRG_1800WB();
				((SE_TRG_1800WB)workbean).se_trg_1810_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1810_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1820:
				workbean = new SE_TRG_1800WB();
				((SE_TRG_1800WB)workbean).se_trg_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//�ν�Ȯ����
			case SETrgWBMapping.SE_TRG_1900:
				workbean = new SE_TRG_1900WB();
				((SE_TRG_1900WB)workbean).se_trg_1900_m(req, res);
				nextPage = "/jsp/se/trg/se_trg_1900_m.jsp";
				break;	
			case SETrgWBMapping.SE_TRG_1910:
				workbean = new SE_TRG_1900WB();
				((SE_TRG_1900WB)workbean).se_trg_1910_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_1910_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1915:
				workbean = new SE_TRG_1900WB();
				((SE_TRG_1900WB)workbean).se_trg_1915_s(req, res);
				nextPage = "/jsp/se/trg/se_trg_1915_s.jsp";
				break;
			case SETrgWBMapping.SE_TRG_1920:
				workbean = new SE_TRG_1900WB();
				((SE_TRG_1900WB)workbean).se_trg_1920_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//����򰡰�� ��ȸ	
			case SETrgWBMapping.SE_TRG_2010:
				workbean = new SE_TRG_2000WB();
				((SE_TRG_2000WB)workbean).se_trg_2010_l(req, res);
				nextPage = "/jsp/se/trg/se_trg_2010_l.jsp";
				break;
			case SETrgWBMapping.SE_TRG_2020:
				workbean = new SE_TRG_2000WB();
				((SE_TRG_2000WB)workbean).se_trg_2020_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
					
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
