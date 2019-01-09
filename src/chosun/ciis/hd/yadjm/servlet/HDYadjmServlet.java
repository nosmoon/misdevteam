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


package chosun.ciis.hd.yadjm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.cost.servlet.HDCostWBMapping;
import chosun.ciis.hd.cost.wb.HD_COST_1000WB;
import chosun.ciis.hd.yadjm.wb.HD_YADJM_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDYadjmServlet extends BaseServlet {

 
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
		//System.out.println(" HDJobServlet.java ");
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappprzrl = "/hd/yadjm/";
            iPid = extractPid(req, servletMappprzrl);
            
            System.out.println("HDYadjmServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDYadjmServlet : process : nextPage : " + nextPage);
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


    
	public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
        HD_YADJM_1000WB wb = null;
		switch(pid) {
			case HDYadjmWBMapping.HD_YADJM_1000: //���������������ǥ(�׸񺰰���)����, 2014�� ��������� ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1000_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1000_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111000_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111000_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1001: //���������������ǥ(�׸񺰰���)��ȸ, 2014�� ��������� ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1001_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1001_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1100:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1100_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1100_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1101: //���������������ǥ(�ٷμҵ����/����ǥ��)��ȸ , 2014�� ��������� ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1101_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1101_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1201:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1201_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1201_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1210: //�����ٹ����ҵ���ȸ , 2014�� ��������� ��� , 2015�� ���(�۾�����)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1210(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1210_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1211: //�����ٹ����ҵ��Է� , 2014�� ��������� ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1211(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1211_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1220:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1221:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1221_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1221_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1222:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1222_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1222_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1223:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1223_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1223_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1224:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1224_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1224_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1225:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1225(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1225_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1230:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1230(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1230_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1231:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1231(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1231_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1400:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1400(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1400_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1500_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1500_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1500_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1600:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1600(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1600_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1601:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1601_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1601_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1602:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1602_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1602_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1603:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1603_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1603_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1604:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1604_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1604_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1800:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1800(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1800_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1810:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1810(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1810_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1820:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1820(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1820_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1830:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1830(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1830_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1840:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1840(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1840_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1900:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1900(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1900_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1930:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1930(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_1930_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_1940:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_1940(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_1940_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2003:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2004:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2004_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2004_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3000(req, res);
				System.out.println("-----------------------------------------");
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3001:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3001(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3001_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3002:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3002(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3002_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3003_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3003_a(req, res);
				//nextPage = "/jsp/hd/yadjm/hd_yadjm_3003_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3004:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3004_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3004_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3005_M:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3005_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3005_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3006:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3006_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_3006_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_3007_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_3007_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5100_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5100_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5101_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5101_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5101_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5102:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5102_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5102_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5200_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5200_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5200_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5201_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5201_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5201_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5202_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5202_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5202_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5203_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5203_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5203_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101230_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101230_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101230_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101214_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101251_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_101233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_101233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_101233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_106000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_106000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_106000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_106001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_106001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_106003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_106003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_106003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_102000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_102000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
			
			case HDYadjmWBMapping.HD_YADJM_111220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111230_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111230_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111230_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111214_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111251_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_111233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_111233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_111233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_115200:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_115200_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_115200_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_115600:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_115600_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_115600_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_115700:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_115700_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_115700_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_116000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_116000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_116000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_116001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_116001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_116003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_116003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_116003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_112000:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_112000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_6003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_6003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_6003_l.jsp";
				break;
			
			case HDYadjmWBMapping.HD_YADJM_2012_1210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_1251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_2000_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_6000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_6000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_6000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_6001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_6001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_127001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_127001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case HDYadjmWBMapping.HD_YADJM_2012_CONV_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_conv_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_7000_L:
				wb = new HD_YADJM_1000WB(); 
				((HD_YADJM_1000WB)wb).hd_yadjm_2012_7000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_7000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2012_7002_S: 					//�߱�����-�μ�
				wb = new HD_YADJM_1000WB();
        		((HD_YADJM_1000WB)wb).hd_yadjm_2012_7002_s(req, res);
        		nextPage = "/jsp/hd/yadjm/hd_yadjm_2012_7002_s.jsp";
        		break;	
			case HDYadjmWBMapping.HD_YADJM_5400_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5400_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5400_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5401_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5401_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5402_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5402_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1210_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1212_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1119_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1210_a(req, res); //����ID�� ������ WB�� ȣ����. ����
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1213_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1214_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1220_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1221_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1221_l(req, res);
				System.out.print("�Ƕ� �� ");
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1221_l.jsp";
				System.out.print("�� �ȵ�   ");
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1250_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1251_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1231_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1232_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1233_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_1234_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_2000_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_6000_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_6000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_6000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_6001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_6001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_6003_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_6003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_6003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_137001_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_137001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_CONV_A:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_conv_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_7000_L:
				wb = new HD_YADJM_1000WB(); 
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_7000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_7000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2013_7002_S: 					//�߱�����-�μ�
				wb = new HD_YADJM_1000WB();
        		((HD_YADJM_1000WB)wb).hd_yadjm_2013_7002_s(req, res);
        		nextPage = "/jsp/hd/yadjm/hd_yadjm_2013_7002_s.jsp";
        		break;	
			case HDYadjmWBMapping.HD_YADJM_5900_M :
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5900_m(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5900_m.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5901_L :
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5901_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5901_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_5902_A :
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_5902_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_5902_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_6003_L: //2014�� ��������-ȭ����ѿ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_6003_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_6003_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_2000_A: //2014�� ��������-�����������ϻ���-���ϻ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1119_A: //2014�� ���������ڷ��� �ӽ�����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1210_A: //2014�� ���������ڷ��� ����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1220_L: //2014�� ���������ڷ���-�������� ��ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1220_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_CONV_A: //2014�� ���������ڷ���-���Ͼ��ε�
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_conv_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1221_L: //2014�� ���������ڷ���-�������� ��ȸ(�˾���������)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_7002_S: //2014�� �����������ϴٿ�ε�-����ϴ��� �ľ��ʿ�
				wb = new HD_YADJM_1000WB();
        		((HD_YADJM_1000WB)wb).hd_yadjm_2014_7002_s(req, res);
        		nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_7002_s.jsp";
        		break;
			case HDYadjmWBMapping.HD_YADJM_2014_1250_L: //2014�� ���������ڷ���-��������ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1251_L: //2014�� ���������ڷ���-��������ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1250_l.jsp";
				break;	
			case HDYadjmWBMapping.HD_YADJM_2014_1232_A: //2014�� ���������ڷ���-�������� ����/����/����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1233_L: //��������41 ���հ�
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1233_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1233_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1231_l(req, res); //����(�˾�) ��ȸ
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1212_A: //2014�� �������� �Ƿ�� �˾� �����ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1213_A: //2014�� �������� ��α��˾������ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1214_L: //2014�� �������� ��α� READY�κ�
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_1234_L: //������ݰ��ο��� ��ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2014_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2014_7000_L: //2014�����������ϴٿ�ε�-��ȸ
				wb = new HD_YADJM_1000WB(); 
				((HD_YADJM_1000WB)wb).hd_yadjm_2013_7000_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2014_7000_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_147001_A: //2014�����������Ͼ��ε� 
				System.out.println("$$$ HD_YADJM_147001_A ���� ȣ�� ��!! $$$ ");
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_147001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1119_A: //2015�� ���������ڷ���-�ӽ�����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1210_A: //2015�� ���������ڷ���-����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1220_L: //2015�� ���������ڷ���-�������� ��ȸ(�ּ�,����,��������,���������ڵ�)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1220_l(req, res);
				System.out.println("2015jsp �Դϴ�. ");
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1220_l.jsp";
				System.out.println("��  �Դϴ�. ");
				break;
			case HDYadjmWBMapping.HD_YADJM_157001_A: //2015�����������Ͼ��ε� 
				System.out.println("$$$ HD_YADJM_157001_A ���� ȣ�� ��!! $$$ ");
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_157001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1221_L: //2015�� ���������ڷ���-�����Է��˾� ��ȸ(�˾���������)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1232_A: //2015�� ���������ڷ���-�����˾�â_����/������ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1231_l(req, res); //2015�� �������� ���ΰ����Է� �����˾�â-�������� ��ȸ
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1234_L: //2015�� �������� ���ΰ����Է� �����˾�â-�����Ϻ����� ���ο��ݺ�����ݾ� ��ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1212_A: //2015�� �������� �Ƿ�� �˾� �����ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1213_A: //2015�� �������� ��α��˾������ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1214_L: //2015�� �������� ��α� READY ��ȸ �� �޺�����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1250_L: //2015�� ���������ڷ���-��������ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_1251_L: //2015�� ���������ڷ���-��������ȸ(�Ⱦ��̴°� ����)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_2000_A: //2015�� �������� �����������ϻ���-���ϻ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_5100_L: //2015�� �������� ���ΰ����Է� ��������������ӱ� �˾� -  ��ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_5100_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2015_5100_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2015_5101_A: //2015�� �������� ��������������Ա� �˾� �����ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2015_5101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//         2016�� �������� 
			case HDYadjmWBMapping.HD_YADJM_2016_1119_A: //2016�� ���������ڷ���-�ӽ�����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1210_a(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1210_a.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1210_A: //2016�� ���������ڷ���-����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1210_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1220_L: //2016�� ���������ڷ���-�������� ��ȸ(�ּ�,����,��������,���������ڵ�)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1220_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1220_l.jsp";
				System.out.println("��  �Դϴ�. ");
				break;
			case HDYadjmWBMapping.HD_YADJM_167001_A: //2016�����������Ͼ��ε� 
				System.out.println("$$$ HD_YADJM_167001_A ���� ȣ�� ��!! $$$ ");
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_167001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1221_L: //2016�� ���������ڷ���-�����Է��˾� ��ȸ(�˾���������)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1221_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1221_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1232_A: //2016�� ���������ڷ���-�����˾�â_����/������ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1231_L:
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1231_l(req, res); //2016�� �������� ���ΰ����Է� �����˾�â-�������� ��ȸ
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1231_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1234_L: //2016�� �������� ���ΰ����Է� �����˾�â-�����Ϻ����� ���ο��ݺ�����ݾ� ��ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1234_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1234_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1212_A: //2016�� �������� �Ƿ�� �˾� �����ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1212_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1213_A: //2016�� �������� ��α��˾������ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1214_L: //2016�� �������� ��α� READY ��ȸ �� �޺�����
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1214_l  (req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1214_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1250_L: //2016�� ���������ڷ���-��������ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1250_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_1251_L: //2016�� ���������ڷ���-��������ȸ(�Ⱦ��̴°� ����)
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_1250_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_1250_l.jsp"; 
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_2000_A: //2016�� �������� �����������ϻ���-���ϻ���
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_2000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_5100_L: //2016�� �������� ���ΰ����Է� ��������������ӱ� �˾� -  ��ȸ
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_5100_l(req, res);
				nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_5100_l.jsp";
				break;
			case HDYadjmWBMapping.HD_YADJM_2016_5101_A: //2016�� �������� ��������������Ա� �˾� �����ư
				wb = new HD_YADJM_1000WB();
				((HD_YADJM_1000WB)wb).hd_yadjm_2016_5101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
//2017�� �������� 
					case HDYadjmWBMapping.HD_YADJM_2017_1119_A: //2017�� ���������ڷ���-�ӽ�����
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1210_a(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1210_a.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1210_A: //2017�� ���������ڷ���-����
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1210_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1220_L: //2017�� ���������ڷ���-�������� ��ȸ(�ּ�,����,��������,���������ڵ�)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1220_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1220_l.jsp";
						System.out.println("��  �Դϴ�. ");
						break;
					case HDYadjmWBMapping.HD_YADJM_177001_A: //2017�����������Ͼ��ε� 
						System.out.println("$$$ HD_YADJM_177001_A ���� ȣ�� ��!! $$$ ");
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_177001_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1221_L: //2017�� ���������ڷ���-�����Է��˾� ��ȸ(�˾���������)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1221_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1221_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1232_A: //2017�� ���������ڷ���-�����˾�â_����/������ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1232_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1231_L:
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1231_l(req, res); //2017�� �������� ���ΰ����Է� �����˾�â-�������� ��ȸ
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1231_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1234_L: //2017�� �������� ���ΰ����Է� �����˾�â-�����Ϻ����� ���ο��ݺ�����ݾ� ��ȸ
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1234_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1234_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1212_A: //2017�� �������� �Ƿ�� �˾� �����ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1212_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1213_A: //2017�� �������� ��α��˾������ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1213_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1214_L: //2017�� �������� ��α� READY ��ȸ �� �޺�����
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1214_l  (req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1214_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1250_L: //2017�� ���������ڷ���-��������ȸ
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1250_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_1251_L: //2017�� ���������ڷ���-��������ȸ(�Ⱦ��̴°� ����)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_1250_l.jsp"; 
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_2000_A: //2017�� �������� �����������ϻ���-���ϻ���
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_2000_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_5100_L: //2017�� �������� ���ΰ����Է� ��������������ӱ� �˾� -  ��ȸ
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_5100_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2017_5100_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2017_5101_A: //2017�� �������� ��������������Ա� �˾� �����ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2017_5101_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
						
				//2018�� �������� 
					case HDYadjmWBMapping.HD_YADJM_2018_1119_A: //2018�� ���������ڷ���-�ӽ�����
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1210_a(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1210_a.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1210_A: //2018�� ���������ڷ���-����
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1210_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1213_A: //2018�� �������� ��α��˾������ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1213_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1214_L: //2018�� �������� ��α� READY ��ȸ �� �޺�����
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1214_l  (req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1214_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1220_L: //2018�� ���������ڷ���-�������� ��ȸ(�ּ�,����,��������,���������ڵ�)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1220_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1220_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_187001_A: //2018�����������Ͼ��ε� 
						System.out.println("$$$ HD_YADJM_187001_A ���� ȣ�� ��!! $$$ ");
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_187001_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1221_L: //2018�� ���������ڷ���-�����Է��˾� ��ȸ(�˾���������)
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1221_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1221_l.jsp";
						break;		
					case HDYadjmWBMapping.HD_YADJM_2018_1231_L:
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1231_l(req, res); //2018�� �������� ���ΰ����Է� �����˾�â-�������� ��ȸ
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1231_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1232_A: //2017�� ���������ڷ���-�����˾�â_����/������ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1232_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1234_L: //2018�� �������� ���ΰ����Է� �����˾�â-�����Ϻ����� ���ο��ݺ�����ݾ� ��ȸ
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1234_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1234_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1250_L: //2018�� ���������ڷ���-��������ȸ
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1250_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_1251_L: //2018�� ���������ڷ���-��������ȸ(eip��� )
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1250_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2018_1250_l.jsp"; 
						break;	
					case HDYadjmWBMapping.HD_YADJM_2018_2000_A: //2017�� �������� �����������ϻ���-���ϻ���
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_2000_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
						
				/*  �Ʒ� ������  2018�⿡ ������ ���� �Ȱ��� ���  ���� ������ Ÿ���� ó����   */
					case HDYadjmWBMapping.HD_YADJM_2018_1212_A: //2018�� �������� �Ƿ�� �˾� �����ư
						wb = new HD_YADJM_1000WB(); 
						((HD_YADJM_1000WB)wb).hd_yadjm_2018_1212_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_5100_L: //2018�� �������� ���ΰ����Է� ��������������ӱ� �˾� -  ��ȸ
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2016_5100_l(req, res);
						nextPage = "/jsp/hd/yadjm/hd_yadjm_2016_5100_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_2018_5101_A: //2018�� �������� ��������������Ա� �˾� �����ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_2016_5101_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
				/*--------------------------------------------------------------*/		
						
					case HDYadjmWBMapping.HD_YADJM_6000_L: //2017�� �������� ��������������Ա� �˾� �����ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_6000_l(req, res);
						nextPage =  "/jsp/hd/yadjm/hd_yadjm_6000_l.jsp";
						break;
					case HDYadjmWBMapping.HD_YADJM_6001_A: //2017�� �������� ��������������Ա� �˾� �����ư
						wb = new HD_YADJM_1000WB();
						((HD_YADJM_1000WB)wb).hd_yadjm_6001_a(req, res);
						nextPage = "/common/jsp/resultMsg.jsp";
						break;
						
						
			default:
				throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
			} 
		return nextPage;
	}    
	
}
