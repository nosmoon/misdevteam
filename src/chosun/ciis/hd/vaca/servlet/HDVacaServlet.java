/***************************************************************************************************
 * ���ϸ� : 
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.hd.vaca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.corr.servlet.HDCorrWBMapping;
import chosun.ciis.hd.corr.wb.HD_CORR_1000WB;
import chosun.ciis.hd.vaca.wb.*;
import java.util.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDVacaServlet extends BaseServlet {

 
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
            String servletMappedUrl = "/hd/vaca/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDvacaServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDvacaServlet : process : nextPage : " + nextPage);
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
        String nextPage = null;
        HD_VACA_1000WB wb = null;
        HD_VACA_2000WB wb_2000 = null;
        
		switch(pid) {
		case HDVacaWBMapping.HD_VACA_1804_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1804_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1804_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1805:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1805_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1805_m.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1803_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1803_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1803_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1802_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1802_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1802_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1615_D:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1615_d(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1614_A:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1614_a(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1614_a.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1613_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1613_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1613_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1612_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1612_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1612_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1611_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1611_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1611_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1611_500_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1611_500_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1611_500_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1000:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1000_a(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1000_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;		
		case HDVacaWBMapping.HD_VACA_1001:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1001_a(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1001_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1200:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1200_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1200_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1201:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1201_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1201_l.jsp";
			break;		
		case HDVacaWBMapping.HD_VACA_1202:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1202_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1202_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1203:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1203_a(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1203_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1204:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1204_u(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1204_u.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1205:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1205_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1205_m.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1300:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1300_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1300_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1301:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1301_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1301_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1302:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1302_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1302_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1303:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1303_a(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1303_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1304:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1304_u(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1304_u.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1305:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1305_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1305_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1306:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1306_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1306_m.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1400:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1400_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1400_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1401:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1401_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1401_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1402:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1402_u(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1402_u.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1403:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1403_m(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1402_u.jsp";
			nextPage = "/jsp/hd/vaca/hd_vaca_1403_m.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1500_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1500_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1500_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1501:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1501_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1501_l.jsp";
			break;		 
		case HDVacaWBMapping.HD_VACA_1502_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1502_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1502_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1503_A:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1503_a(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1503_a.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1504_A:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1504_a(req, res);
			//nextPage = "/jsp/hd/vaca/hd_vaca_1504_u.jsp";
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1505:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1505_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1505_l.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_1506:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1506_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1506_m.jsp";
			break;			
			
		case HDVacaWBMapping.HD_VACA_1600:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1600_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1600_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1601:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1601_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1601_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1602:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1602_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1603:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1603_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1603_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1604:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1604_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1605:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1605_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1605_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1609:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1609_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1609_m.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1610:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1610_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1610_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1700:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1700_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1700_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1701:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1701_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1701_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1702:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1702_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1703:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1703_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1706:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1706_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1706_m.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1800_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1800_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1800_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1801_A:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1801_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_1900_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1900_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1900_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_2000:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2000_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2000_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_2001:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2001_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2001_m.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_2100:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2100_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_2210:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2210_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2210_l.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_2201:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2201_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2201_m.jsp";
			break;	
		case HDVacaWBMapping.HD_VACA_2220_L:
			wb_2000  = new HD_VACA_2000WB();
			wb_2000.hd_vaca_2220_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2220_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_2300_L:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2300_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2300_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_2302_L:
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2302_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2302_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_2303_L: //�μ��� �ް�(��û)�� ��ȸ ȭ��� �μ��� �������� �߰�_��ȣ��
			wb_2000 = new HD_VACA_2000WB();
			((HD_VACA_2000WB)wb_2000).hd_vaca_2303_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_2303_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1606:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1606_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1606_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1607:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1607_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1607_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1608:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1608_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1608_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1850_M:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1850_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1850_m.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1851_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1851_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1851_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1852_U:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1852_u(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1853_D:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1853_d(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1861_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1861_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1861_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_9999:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_9999_s(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_9999_s.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1710_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1710_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1710_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1711_L:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1711_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1711_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1712_D:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1712_d(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1713_A:
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1713_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
			/*
		case HDVacaWBMapping.HD_VACA_3000_A: //20160311_���Ͽ�����_����ǥ ���
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3000_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;		
		case HDVacaWBMapping.HD_VACA_3002_L: //20160311_���Ͽ�����_����ǥ��ȸ 
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3002_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3002_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3003_A: //20160311_���Ͽ�����_����ǥ ����
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3003_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;	
			*/	
		case HDVacaWBMapping.HD_VACA_3110_M: //20150602_���Ͽ�����(����)_�޹���ȹ��,������� �޺��ڽ�
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3110_m(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3110_m.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3120_L: //20150602_���Ͽ�����(����)_�׸��� ���� Ÿ��Ʋ�� ����
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3120_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3120_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3130_L: //20150602_���Ͽ�����(����)_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3130_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3130_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3140_A: //20150602_���Ͽ�����(����)_����
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3140_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;			
		case HDVacaWBMapping.HD_VACA_3150_L: //���Ͽ�����(����)_�����ǥ ���ο���üũ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3150_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3150_l.jsp";
			break;		
		case HDVacaWBMapping.HD_VACA_3210_L: //20150602_���Ͽ������_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3210_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3210_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3220_A: //20150602_���Ͽ������_���� 
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3220_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3310_M: //20150602_���Ͽ������_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3310_m(req, res);
			System.out.print(" ddd"  ) ;
			nextPage = "/jsp/hd/vaca/hd_vaca_3310_m.jsp";
			System.out.print(" sss"  ) ;
			break;
		case HDVacaWBMapping.HD_VACA_3320_L: //20150602_���Ͽ������_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3320_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3320_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3410_M: //20150602_���Ͽ������_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3410_m(req, res);
			System.out.print(" ddd"  ) ;
			nextPage = "/jsp/hd/vaca/hd_vaca_3410_m.jsp";
			System.out.print(" sss"  ) ;
			break;
		case HDVacaWBMapping.HD_VACA_3420_L: //20150602_���Ͽ������_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3420_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3420_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3430_A: //20150602_���Ͽ������_���� 
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3430_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3440_A: //20150602_���Ͽ������_���� 
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3440_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3450_A: //20150831_���Ͽ������_����  
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3450_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3460_A: //20150831_���Ͽ������_����  
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3460_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3510_L: //20150805_���Ͽ������_�μ� ���� ����� ��ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3510_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_3510_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_3520_A: //20150602_���Ͽ������_���� 
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_3520_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1620_L: //20150602_���Ͽ������_�������ȸ
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1620_l(req, res);
			nextPage = "/jsp/hd/vaca/hd_vaca_1620_l.jsp";
			break;
		case HDVacaWBMapping.HD_VACA_1621_A: //20150602_���Ͽ������_���� 
			wb = new HD_VACA_1000WB();
			((HD_VACA_1000WB)wb).hd_vaca_1621_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
			break;
		default:
			throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
		}
	return nextPage;        

    }
}
