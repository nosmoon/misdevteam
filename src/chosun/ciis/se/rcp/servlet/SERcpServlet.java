/***************************************************************************************************
 * ���ϸ� : SERcpServlet.java
 * ��� : �Ǹ� - �Աݰ���
 * �ۼ����� : 2009-04-15
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.se.rcp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.se.rcp.wb.*;

public class SERcpServlet extends BaseServlet {


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
            String servletMappedUrl = "/se/rcp/";
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
        	//(�������)�Ա�Ȯ��
			case SERcpWBMapping.SE_RCP_1000:
				workbean = new SE_RCP_1000WB();
				((SE_RCP_1000WB)workbean).se_rcp_1000_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1000_m.jsp";
				break; 
			case SERcpWBMapping.SE_RCP_1010:
				workbean = new SE_RCP_1000WB();
				((SE_RCP_1000WB)workbean).se_rcp_1010_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1010_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1020:
				workbean = new SE_RCP_1000WB();
				((SE_RCP_1000WB)workbean).se_rcp_1020_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1020_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1030:
				workbean = new SE_RCP_1000WB();
				((SE_RCP_1000WB)workbean).se_rcp_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	//(�������)�Ա���ȯ
			case SERcpWBMapping.SE_RCP_1100:
				workbean = new SE_RCP_1100WB();
				((SE_RCP_1100WB)workbean).se_rcp_1100_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1100_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1110:
				workbean = new SE_RCP_1100WB();
				((SE_RCP_1100WB)workbean).se_rcp_1110_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1110_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1120:
				workbean = new SE_RCP_1100WB();
				((SE_RCP_1100WB)workbean).se_rcp_1120_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1120_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1130:
				workbean = new SE_RCP_1100WB();
				((SE_RCP_1100WB)workbean).se_rcp_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1140:
				workbean = new SE_RCP_1100WB();
				((SE_RCP_1100WB)workbean).se_rcp_1140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//�Աݵ��
			case SERcpWBMapping.SE_RCP_1200:
				workbean = new SE_RCP_1200WB();
				((SE_RCP_1200WB)workbean).se_rcp_1200_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1200_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1210:
				workbean = new SE_RCP_1200WB();
				((SE_RCP_1200WB)workbean).se_rcp_1210_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1210_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1220:
				workbean = new SE_RCP_1200WB();
				((SE_RCP_1200WB)workbean).se_rcp_1220_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1220_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1230:
				workbean = new SE_RCP_1200WB();
				((SE_RCP_1200WB)workbean).se_rcp_1230_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1230_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1240:
				workbean = new SE_RCP_1200WB();
				((SE_RCP_1200WB)workbean).se_rcp_1240_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1250:
				workbean = new SE_RCP_1200WB();
				((SE_RCP_1200WB)workbean).se_rcp_1250_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//��ü�Աݵ��
			case SERcpWBMapping.SE_RCP_1300:
				workbean = new SE_RCP_1300WB();
				((SE_RCP_1300WB)workbean).se_rcp_1300_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1300_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1310:
				workbean = new SE_RCP_1300WB();
				((SE_RCP_1300WB)workbean).se_rcp_1310_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1310_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1320:
				workbean = new SE_RCP_1300WB();
				((SE_RCP_1300WB)workbean).se_rcp_1320_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1320_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1330:
				workbean = new SE_RCP_1300WB();
				((SE_RCP_1300WB)workbean).se_rcp_1330_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1330_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1340:
				workbean = new SE_RCP_1300WB();
				((SE_RCP_1300WB)workbean).se_rcp_1340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1350:
				workbean = new SE_RCP_1300WB();
				((SE_RCP_1300WB)workbean).se_rcp_1350_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//��ȯ�Աݵ��
			case SERcpWBMapping.SE_RCP_1400:
				workbean = new SE_RCP_1400WB();
				((SE_RCP_1400WB)workbean).se_rcp_1400_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1400_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1410:
				workbean = new SE_RCP_1400WB();
				((SE_RCP_1400WB)workbean).se_rcp_1410_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1410_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1420:
				workbean = new SE_RCP_1400WB();
				((SE_RCP_1400WB)workbean).se_rcp_1420_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1420_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1430:
				workbean = new SE_RCP_1400WB();
				((SE_RCP_1400WB)workbean).se_rcp_1430_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1430_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1440:
				workbean = new SE_RCP_1400WB();
				((SE_RCP_1400WB)workbean).se_rcp_1440_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1450:
				workbean = new SE_RCP_1400WB();
				((SE_RCP_1400WB)workbean).se_rcp_1450_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//�Ա�����
			case SERcpWBMapping.SE_RCP_1500:
				workbean = new SE_RCP_1500WB();
				((SE_RCP_1500WB)workbean).se_rcp_1500_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1500_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1510:
				workbean = new SE_RCP_1500WB();
				((SE_RCP_1500WB)workbean).se_rcp_1510_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1510_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1520:
				workbean = new SE_RCP_1500WB();
				((SE_RCP_1500WB)workbean).se_rcp_1520_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1520_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1530:
				workbean = new SE_RCP_1500WB();
				((SE_RCP_1500WB)workbean).se_rcp_1530_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1530_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1540:
				workbean = new SE_RCP_1500WB();
				((SE_RCP_1500WB)workbean).se_rcp_1540_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1550:
				workbean = new SE_RCP_1500WB();
				((SE_RCP_1500WB)workbean).se_rcp_1550_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//������µ��
			case SERcpWBMapping.SE_RCP_1600:
				workbean = new SE_RCP_1600WB();
				((SE_RCP_1600WB)workbean).se_rcp_1600_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1600_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1610:
				workbean = new SE_RCP_1600WB();
				((SE_RCP_1600WB)workbean).se_rcp_1610_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1610_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1620:
				workbean = new SE_RCP_1600WB();
				((SE_RCP_1600WB)workbean).se_rcp_1620_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1620_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1630:
				workbean = new SE_RCP_1600WB();
				((SE_RCP_1600WB)workbean).se_rcp_1630_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//����������ȯ��
			case SERcpWBMapping.SE_RCP_1700:
				workbean = new SE_RCP_1700WB();
				((SE_RCP_1700WB)workbean).se_rcp_1700_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1700_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1710:
				workbean = new SE_RCP_1700WB();
				((SE_RCP_1700WB)workbean).se_rcp_1710_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1710_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1720:
				workbean = new SE_RCP_1700WB();
				((SE_RCP_1700WB)workbean).se_rcp_1720_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1720_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1730:
				workbean = new SE_RCP_1700WB();
				((SE_RCP_1700WB)workbean).se_rcp_1730_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_1730_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1740:
				workbean = new SE_RCP_1700WB();
				((SE_RCP_1700WB)workbean).se_rcp_1740_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_1750:
				workbean = new SE_RCP_1700WB();
				((SE_RCP_1700WB)workbean).se_rcp_1750_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			
			//�Ա���Ȳ	
			case SERcpWBMapping.SE_RCP_2000:
				workbean = new SE_RCP_2000WB();
				((SE_RCP_2000WB)workbean).se_rcp_2000_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2000_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2010:
				workbean = new SE_RCP_2000WB();
				((SE_RCP_2000WB)workbean).se_rcp_2010_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2010_l.jsp";
				break;
			//�Ա���ǥ��ȸ
			case SERcpWBMapping.SE_RCP_2100:
				workbean = new SE_RCP_2100WB();
				((SE_RCP_2100WB)workbean).se_rcp_2100_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2100_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2110:
				workbean = new SE_RCP_2100WB();
				((SE_RCP_2100WB)workbean).se_rcp_2110_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2110_l.jsp";
				break;	
			//���������Ա���Ȳ
			case SERcpWBMapping.SE_RCP_2200:
				workbean = new SE_RCP_2200WB();
				((SE_RCP_2200WB)workbean).se_rcp_2200_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2200_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2210:
				workbean = new SE_RCP_2200WB();
				((SE_RCP_2200WB)workbean).se_rcp_2210_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2210_l.jsp";
				break;
			//�Ⱓ�������Ա���Ȳ
			case SERcpWBMapping.SE_RCP_2310:
				workbean = new SE_RCP_2300WB();
				((SE_RCP_2300WB)workbean).se_rcp_2310_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2310_l.jsp";
				break;	
			//�Ⱓ����������Ա�����
			case SERcpWBMapping.SE_RCP_2400:
				workbean = new SE_RCP_2400WB();
				((SE_RCP_2400WB)workbean).se_rcp_2400_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2400_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2410:
				workbean = new SE_RCP_2400WB();
				((SE_RCP_2400WB)workbean).se_rcp_2410_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2410_l.jsp";
				break;	
			//�����Ա�����Ȳ
			case SERcpWBMapping.SE_RCP_2500:
				workbean = new SE_RCP_2500WB();
				((SE_RCP_2500WB)workbean).se_rcp_2500_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2500_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2510:
				workbean = new SE_RCP_2500WB();
				((SE_RCP_2500WB)workbean).se_rcp_2510_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2510_l.jsp";
				break;	
			//���������Ա���Ȳ
			case SERcpWBMapping.SE_RCP_2600:
				workbean = new SE_RCP_2600WB();
				((SE_RCP_2600WB)workbean).se_rcp_2600_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2600_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2610:
				workbean = new SE_RCP_2600WB();
				((SE_RCP_2600WB)workbean).se_rcp_2610_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2610_l.jsp";
				break;
			//��������Ȳ
			case SERcpWBMapping.SE_RCP_2700:
				workbean = new SE_RCP_2700WB();
				((SE_RCP_2700WB)workbean).se_rcp_2700_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2700_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2710:
				workbean = new SE_RCP_2700WB();
				((SE_RCP_2700WB)workbean).se_rcp_2710_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2710_l.jsp";
				break;
			//������ä����Ȳ
			case SERcpWBMapping.SE_RCP_2800:
				workbean = new SE_RCP_2800WB();
				((SE_RCP_2800WB)workbean).se_rcp_2800_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2800_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2810:
				workbean = new SE_RCP_2800WB();
				((SE_RCP_2800WB)workbean).se_rcp_2810_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2810_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_2820:
				workbean = new SE_RCP_2800WB();
				((SE_RCP_2800WB)workbean).se_rcp_2820_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2820_l.jsp";
				break;
				
			//����Ʈ���
			case SERcpWBMapping.SE_RCP_2900:
				workbean = new SE_RCP_2900WB();
				((SE_RCP_2900WB)workbean).se_rcp_2900_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_2900_m.jsp";
				break;
				
			//������Աݸ���Ʈ
			case SERcpWBMapping.SE_RCP_3000:
				workbean = new SE_RCP_3000WB();
				((SE_RCP_3000WB)workbean).se_rcp_3000_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_3000_m.jsp";
				break;
				
			//�Ź��Ǹ� �渮����
			case SERcpWBMapping.SE_RCP_3100:
				nextPage = "/jsp/se/rcp/se_rcp_3100_m.jsp";
				break;
				
			//�������Աݵ��
			case SERcpWBMapping.SE_RCP_4000:
				workbean = new SE_RCP_4000WB();
				((SE_RCP_4000WB)workbean).se_rcp_4000_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4000_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4010:
				workbean = new SE_RCP_4000WB();
				((SE_RCP_4000WB)workbean).se_rcp_4010_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4010_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4020:
				workbean = new SE_RCP_4000WB();
				((SE_RCP_4000WB)workbean).se_rcp_4020_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4020_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4030:
				workbean = new SE_RCP_4000WB();
				((SE_RCP_4000WB)workbean).se_rcp_4030_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4030_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4040:
				workbean = new SE_RCP_4000WB();
				((SE_RCP_4000WB)workbean).se_rcp_4040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4050:
				workbean = new SE_RCP_4000WB();
				((SE_RCP_4000WB)workbean).se_rcp_4050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//���������Ա�����Ȳ
			case SERcpWBMapping.SE_RCP_4100:
				workbean = new SE_RCP_4100WB();
				((SE_RCP_4100WB)workbean).se_rcp_4100_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4100_m.jsp";
				/*
				if(req.getParameter("dev").equals("Y")) {
					nextPage = "/jsp/se/rcp/se_rcp_4100_m_test.jsp";
				} else {
					nextPage = "/jsp/se/rcp/se_rcp_4100_m.jsp";
				}
				*/
				break;
			case SERcpWBMapping.SE_RCP_4110:
				workbean = new SE_RCP_4100WB();
				((SE_RCP_4100WB)workbean).se_rcp_4110_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4110_l.jsp";
				/*
				if(req.getParameter("dev").equals("Y")) {
					nextPage = "/jsp/se/rcp/se_rcp_4110_l_test.jsp";
				} else {
					nextPage = "/jsp/se/rcp/se_rcp_4110_l.jsp";
				}
				*/
				break;
			case SERcpWBMapping.SE_RCP_4120:
				workbean = new SE_RCP_4100WB();
				((SE_RCP_4100WB)workbean).se_rcp_4120_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4120_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4121:
				workbean = new SE_RCP_4100WB();
				((SE_RCP_4100WB)workbean).se_rcp_4121_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4121_l.jsp";
				break;				
			//���������Ա���Ȳ
			case SERcpWBMapping.SE_RCP_4200:
				workbean = new SE_RCP_4200WB();
				((SE_RCP_4200WB)workbean).se_rcp_4200_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4200_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4210:
				workbean = new SE_RCP_4200WB();
				((SE_RCP_4200WB)workbean).se_rcp_4210_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4210_l.jsp";
				break;		
			
			//���������� ����
			case SERcpWBMapping.SE_RCP_4300:
				workbean = new SE_RCP_4300WB();
				((SE_RCP_4300WB)workbean).se_rcp_4300_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4300_m.jsp";
				break;
				
			//������������(������)���	
			case SERcpWBMapping.SE_RCP_4400:
				workbean = new SE_RCP_4400WB();
				((SE_RCP_4400WB)workbean).se_rcp_4400_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4400_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4410:
				workbean = new SE_RCP_4400WB();
				((SE_RCP_4400WB)workbean).se_rcp_4410_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4410_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4420:
				workbean = new SE_RCP_4400WB();
				((SE_RCP_4400WB)workbean).se_rcp_4420_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;				
			case SERcpWBMapping.SE_RCP_4430:
				workbean = new SE_RCP_4400WB();
				((SE_RCP_4400WB)workbean).se_rcp_4430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			
//				�������Աݵ��(��)
			case SERcpWBMapping.SE_RCP_4600:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4600_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4600_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4610:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4610_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4610_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4620:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4620_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4620_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4630:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4630_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_4630_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4640:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4640_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4641:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4641_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case SERcpWBMapping.SE_RCP_4650:
				workbean = new SE_RCP_4600WB();
				((SE_RCP_4600WB)workbean).se_rcp_4650_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			//���Աݸ���
			case SERcpWBMapping.SE_RCP_5000:
				workbean = new SE_RCP_5000WB();
				((SE_RCP_5000WB)workbean).se_rcp_5000_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5000_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_5010:
				workbean = new SE_RCP_5000WB();
				((SE_RCP_5000WB)workbean).se_rcp_5010_s(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5010_s.jsp";
				break;
			case SERcpWBMapping.SE_RCP_5020:
				workbean = new SE_RCP_5000WB();
				((SE_RCP_5000WB)workbean).se_rcp_5020_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5020_l.jsp";
				break;
			case SERcpWBMapping.SE_RCP_5030:
				workbean = new SE_RCP_5000WB();
				((SE_RCP_5000WB)workbean).se_rcp_5030_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
			//��ǥ����
			case SERcpWBMapping.SE_RCP_5100:
				workbean = new SE_RCP_5100WB();
				((SE_RCP_5100WB)workbean).se_rcp_5100_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5100_m.jsp";
				break;
			case SERcpWBMapping.SE_RCP_5110:
				workbean = new SE_RCP_5100WB();
				((SE_RCP_5100WB)workbean).se_rcp_5110_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5110_l.jsp";
				break;	
			case SERcpWBMapping.SE_RCP_5120:
				workbean = new SE_RCP_5100WB();
				((SE_RCP_5100WB)workbean).se_rcp_5120_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			//��۷�����	
			case SERcpWBMapping.SE_RCP_5200:
				workbean = new SE_RCP_5200WB();
				((SE_RCP_5200WB)workbean).se_rcp_5200_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5200_m.jsp";
				break;	
			case SERcpWBMapping.SE_RCP_5210:
				workbean = new SE_RCP_5200WB();
				((SE_RCP_5200WB)workbean).se_rcp_5210_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5210_l.jsp";
				System.out.println("svl.bong");
				break;	
			case SERcpWBMapping.SE_RCP_5220:
				workbean = new SE_RCP_5200WB();
				((SE_RCP_5200WB)workbean).se_rcp_5220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case SERcpWBMapping.SE_RCP_5230:
				workbean = new SE_RCP_5200WB();
				((SE_RCP_5200WB)workbean).se_rcp_5230_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;		
			case SERcpWBMapping.SE_RCP_5240:
				workbean = new SE_RCP_5200WB();
				((SE_RCP_5200WB)workbean).se_rcp_5240_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case SERcpWBMapping.SE_RCP_5300:
				workbean = new SE_RCP_5300WB();
				((SE_RCP_5300WB)workbean).se_rcp_5300_m(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5300_m.jsp";
				break;	
			case SERcpWBMapping.SE_RCP_5310:
				workbean = new SE_RCP_5300WB();
				((SE_RCP_5300WB)workbean).se_rcp_5310_l(req, res);
				nextPage = "/jsp/se/rcp/se_rcp_5310_l.jsp";
				System.out.println("svl.bong");
				break;	
			case SERcpWBMapping.SE_RCP_5320:
				workbean = new SE_RCP_5300WB();
				((SE_RCP_5300WB)workbean).se_rcp_5320_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
