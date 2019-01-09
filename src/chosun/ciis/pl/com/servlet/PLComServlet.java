/***************************************************************************************************
 * ���ϸ� : PLComServlet.java
 * ��� :  ���뼭��
 * �ۼ����� : 2009.02.17
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.com.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.com.wb.PL_COM_1000WB;
import chosun.ciis.pl.com.wb.PL_COM_1100WB;
import chosun.ciis.pl.com.wb.PL_COM_1200WB;
import chosun.ciis.pl.com.wb.PL_COM_1300WB;
import chosun.ciis.pl.com.wb.PL_COM_1400WB;
import chosun.ciis.pl.com.wb.PL_COM_1500WB;
import chosun.ciis.pl.com.wb.PL_COM_1600WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLComServlet extends BaseServlet {


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
//        String requestURI = null;
//        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/pl/com/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLComServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLComServlet : process : nextPage : " + nextPage);
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
     * PLComWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_COM_1000WB wb1000 = null;
        PL_COM_1100WB wb1100 = null;
        PL_COM_1200WB wb1200 = null;
        PL_COM_1300WB wb1300 = null;
        PL_COM_1400WB wb1400 = null;
        PL_COM_1500WB wb1500 = null;
        PL_COM_1600WB wb1600 = null;
        
        switch (pid) {
            //�ŷ�ó�˻��˾� ����
        	case PLComWBMapping.PL_COM_1000:
        		wb1000 = new PL_COM_1000WB();
                System.out.println("PL_COM_1000:::::::::::::::");
        		wb1000.pl_com_1000_m(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1000_m.jsp";
        		break;        
        	//�ŷ�ó�˻��˾� ��ȸ
        	case PLComWBMapping.PL_COM_1010:
        		wb1000 = new PL_COM_1000WB();
                System.out.println("PL_COM_1010:::::::::::::::");
                wb1000.pl_com_1010_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1010_l.jsp";
				break;
        	//�ŷ�ó�˻��˾� 1����ȸ
        	case PLComWBMapping.PL_COM_1020:
        		wb1000 = new PL_COM_1000WB();
                System.out.println("PL_COM_1020:::::::::::::::");
                wb1000.pl_com_1020_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1020_s.jsp";
				break;

            //��ü�˻��˾� ����
        	case PLComWBMapping.PL_COM_1100:
        		wb1100 = new PL_COM_1100WB();
                System.out.println("PL_COM_1100:::::::::::::::");
        		wb1100.pl_com_1100_m(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1100_m.jsp";
        		break;        
        	//��ü�˻��˾� ��ȸ
        	case PLComWBMapping.PL_COM_1110:
        		wb1100 = new PL_COM_1100WB();
                System.out.println("PL_COM_1110:::::::::::::::");
                wb1100.pl_com_1110_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1110_l.jsp";
				break;
        	//��ü�˻��˾� 1����ȸ
        	case PLComWBMapping.PL_COM_1120:
        		wb1100 = new PL_COM_1100WB();
                System.out.println("PL_COM_1120:::::::::::::::");
                wb1100.pl_com_1120_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1120_s.jsp";
				break;

        	//�系�Ǹ����ó�� ��ȸ
        	case PLComWBMapping.PL_COM_1210:
        		wb1200 = new PL_COM_1200WB();
                System.out.println("PL_COM_1210:::::::::::::::");
                wb1200.pl_com_1210_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1210_s.jsp";
				break;
        	//�系�Ǹ����ó�� ����/����
        	case PLComWBMapping.PL_COM_1220:
        		wb1200 = new PL_COM_1200WB();
                System.out.println("PL_COM_1220:::::::::::::::");
                wb1200.pl_com_1220_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

        	//�系�Ǹ��Ա�ó�� ����
        	case PLComWBMapping.PL_COM_1300:
        		wb1300 = new PL_COM_1300WB();
                System.out.println("PL_COM_1300:::::::::::::::");
                wb1300.pl_com_1300_m(req, res);
				nextPage = "/jsp/pl/com/pl_com_1300_m.jsp";
				break;
        	//�系�Ǹ��Ա�ó�� ����ȸ
        	case PLComWBMapping.PL_COM_1310:
        		wb1300 = new PL_COM_1300WB();
                System.out.println("PL_COM_1310:::::::::::::::");
                wb1300.pl_com_1310_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1310_l.jsp";
				break;
        	//�系�Ǹ����ó�� ����/����
        	case PLComWBMapping.PL_COM_1320:
        		wb1300 = new PL_COM_1300WB();
                System.out.println("PL_COM_1320:::::::::::::::");
                wb1300.pl_com_1320_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

            //�ŷ�ó�߼�ó�˻��˾� ����
        	case PLComWBMapping.PL_COM_1400:
        		wb1400 = new PL_COM_1400WB();
                System.out.println("PL_COM_1400:::::::::::::::");
        		wb1400.pl_com_1400_m(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1400_m.jsp";
        		break;        
        	//�ŷ�ó�߼�ó�˻��˾� ��ȸ
        	case PLComWBMapping.PL_COM_1410:
        		wb1400 = new PL_COM_1400WB();
                System.out.println("PL_COM_1410:::::::::::::::");
                wb1400.pl_com_1410_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1410_l.jsp";
				break;
        	//�ŷ�ó�߼�ó�˻��˾� 1����ȸ
        	case PLComWBMapping.PL_COM_1420:
        		wb1400 = new PL_COM_1400WB();
                System.out.println("PL_COM_1420:::::::::::::::");
                wb1400.pl_com_1420_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1420_s.jsp";
				break;

            //��������
        	case PLComWBMapping.PL_COM_1510:
        		wb1500 = new PL_COM_1500WB();
                System.out.println("PL_COM_1510:::::::::::::::");
        		wb1500.pl_com_1510_s(req, res);
        		nextPage = "/jsp/pl/com/pl_com_1510_s.jsp";
        		break;        

        	//�����ڵ�˻��˾� ��ȸ
        	case PLComWBMapping.PL_COM_1610:
        		wb1600 = new PL_COM_1600WB();
                System.out.println("PL_COM_1610:::::::::::::::");
                wb1600.pl_com_1610_l(req, res);
				nextPage = "/jsp/pl/com/pl_com_1610_l.jsp";
				break;
        	//�����ڵ�˻��˾� 1����ȸ
        	case PLComWBMapping.PL_COM_1620:
        		wb1600 = new PL_COM_1600WB();
                System.out.println("PL_COM_1620:::::::::::::::");
                wb1600.pl_com_1620_s(req, res);
				nextPage = "/jsp/pl/com/pl_com_1620_s.jsp";
				break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
