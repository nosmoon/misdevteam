/***************************************************************************************************
 * ���ϸ� : PLSalServlet.java
 * ��� :  �躻��������
 * �ۼ����� : 2009.03.18
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.sal.wb.PL_SAL_1000WB;
import chosun.ciis.pl.sal.wb.PL_SAL_1100WB;
import chosun.ciis.pl.sal.wb.PL_SAL_1200WB;
import chosun.ciis.pl.sal.wb.PL_SAL_1300WB;
import chosun.ciis.pl.sal.wb.PL_SAL_1400WB;
import chosun.ciis.pl.sal.wb.PL_SAL_3000WB;
import chosun.ciis.pl.sal.wb.PL_SAL_3100WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLSalServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/sal/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLSalServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLSalServlet : process : nextPage : " + nextPage);
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
     * PLSalWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_SAL_1000WB wb1000 = null;
        PL_SAL_1100WB wb1100 = null;
        PL_SAL_1200WB wb1200 = null;
        PL_SAL_1300WB wb1300 = null;
        PL_SAL_1400WB wb1400 = null;
        PL_SAL_3000WB wb3000 = null;
        PL_SAL_3100WB wb3100 = null;
        
        switch (pid) {
            //����������ǥ�躻 ����
        	case PLSalWBMapping.PL_SAL_1000:
        		wb1000 = new PL_SAL_1000WB();
                System.out.println("PL_SAL_1000:::::::::::::::");
        		wb1000.pl_sal_1000_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1000_m.jsp";
        		break;        
            //����������ǥ�躻 ������ȸ
        	case PLSalWBMapping.PL_SAL_1010:
        		wb1000 = new PL_SAL_1000WB();
                System.out.println("PL_SAL_1010:::::::::::::::");
        		wb1000.pl_sal_1010_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1010_l.jsp";
        		break;        
            //����������ǥ�躻 �躻��ȸ
        	case PLSalWBMapping.PL_SAL_1020:
        		wb1000 = new PL_SAL_1000WB();
                System.out.println("PL_SAL_1020:::::::::::::::");
        		wb1000.pl_sal_1020_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1020_l.jsp";
        		break;        
            //����������ǥ�躻 ���/����/����
        	case PLSalWBMapping.PL_SAL_1030:
        		wb1000 = new PL_SAL_1000WB();
                System.out.println("PL_SAL_1030:::::::::::::::");
        		wb1000.pl_sal_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //���ົ����ǥ�躻 ����
        	case PLSalWBMapping.PL_SAL_1100:
        		wb1100 = new PL_SAL_1100WB();
                System.out.println("PL_SAL_1100:::::::::::::::");
        		wb1100.pl_sal_1100_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1100_m.jsp";
        		break;        
            //���ົ����ǥ�躻 ������ȸ
        	case PLSalWBMapping.PL_SAL_1110:
        		wb1100 = new PL_SAL_1100WB();
                System.out.println("PL_SAL_1110:::::::::::::::");
        		wb1100.pl_sal_1110_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1110_l.jsp";
        		break;        
            //���ົ����ǥ�躻 �躻��ȸ
        	case PLSalWBMapping.PL_SAL_1120:
        		wb1100 = new PL_SAL_1100WB();
                System.out.println("PL_SAL_1120:::::::::::::::");
        		wb1100.pl_sal_1120_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1120_l.jsp";
        		break;        
            //���ົ����ǥ�躻 ���/����/����
        	case PLSalWBMapping.PL_SAL_1130:
        		wb1100 = new PL_SAL_1100WB();
                System.out.println("PL_SAL_1130:::::::::::::::");
        		wb1100.pl_sal_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //�ŷ�ó���躻 ����
        	case PLSalWBMapping.PL_SAL_1200:
        		wb1200 = new PL_SAL_1200WB();
                System.out.println("PL_SAL_1200:::::::::::::::");
        		wb1200.pl_sal_1200_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1200_m.jsp";
        		break;        
            //�ŷ�ó���躻 ��ȸ
        	case PLSalWBMapping.PL_SAL_1210:
        		wb1200 = new PL_SAL_1200WB();
                System.out.println("PL_SAL_1210:::::::::::::::");
        		wb1200.pl_sal_1210_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1210_l.jsp";
        		break;        
            //�ŷ�ó���躻 ����ȸ
        	case PLSalWBMapping.PL_SAL_1220:
        		wb1200 = new PL_SAL_1200WB();
                System.out.println("PL_SAL_1220:::::::::::::::");
        		wb1200.pl_sal_1220_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1220_l.jsp";
        		break;        
            //�ŷ�ó���躻 ����/����
        	case PLSalWBMapping.PL_SAL_1230:
        		wb1200 = new PL_SAL_1200WB();
                System.out.println("PL_SAL_1230:::::::::::::::");
        		wb1200.pl_sal_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //��ü���躻 ����
        	case PLSalWBMapping.PL_SAL_1300:
        		wb1300 = new PL_SAL_1300WB();
                System.out.println("PL_SAL_1300:::::::::::::::");
        		wb1300.pl_sal_1300_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1300_m.jsp";
        		break;        
            //��ü���躻 ��ȸ
        	case PLSalWBMapping.PL_SAL_1310:
        		wb1300 = new PL_SAL_1300WB();
                System.out.println("PL_SAL_1310:::::::::::::::");
        		wb1300.pl_sal_1310_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1310_l.jsp";
        		break;        
            //��ü���躻 ����ȸ
        	case PLSalWBMapping.PL_SAL_1320:
        		wb1300 = new PL_SAL_1300WB();
                System.out.println("PL_SAL_1320:::::::::::::::");
        		wb1300.pl_sal_1320_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1320_l.jsp";
        		break;        
            //��ü���躻 ����/����
        	case PLSalWBMapping.PL_SAL_1330:
        		wb1300 = new PL_SAL_1300WB();
                System.out.println("PL_SAL_1330:::::::::::::::");
        		wb1300.pl_sal_1330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //�系�Ǹ� ����
        	case PLSalWBMapping.PL_SAL_1400:
        		wb1400 = new PL_SAL_1400WB();
                System.out.println("PL_SAL_1400:::::::::::::::");
        		wb1400.pl_sal_1400_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1400_m.jsp";
        		break;        
            //�系�Ǹ� ��ȸ
        	case PLSalWBMapping.PL_SAL_1410:
        		wb1400 = new PL_SAL_1400WB();
                System.out.println("PL_SAL_1410:::::::::::::::");
        		wb1400.pl_sal_1410_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1410_l.jsp";
        		break;        
            //�系�Ǹ� ����ȸ
        	case PLSalWBMapping.PL_SAL_1420:
        		wb1400 = new PL_SAL_1400WB();
                System.out.println("PL_SAL_1420:::::::::::::::");
        		wb1400.pl_sal_1420_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_1420_l.jsp";
        		break;        
            //�系�Ǹ� ����/����
        	case PLSalWBMapping.PL_SAL_1430:
        		wb1400 = new PL_SAL_1400WB();
                System.out.println("PL_SAL_1430:::::::::::::::");
        		wb1400.pl_sal_1430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //�߼۰�꼭(�ϰ�) ����
        	case PLSalWBMapping.PL_SAL_3000:
        		wb3000 = new PL_SAL_3000WB();
                System.out.println("PL_SAL_3000:::::::::::::::");
        		wb3000.pl_sal_3000_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_3000_m.jsp";
        		break;        
            //�߼۰�꼭(�ϰ�) ��ȸ
        	case PLSalWBMapping.PL_SAL_3010:
        		wb3000 = new PL_SAL_3000WB();
                System.out.println("PL_SAL_3010:::::::::::::::");
        		wb3000.pl_sal_3010_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_3010_l.jsp";
        		break;        

            //�߼۰�꼭(�߰�) ����
        	case PLSalWBMapping.PL_SAL_3100:
        		wb3100 = new PL_SAL_3100WB();
                System.out.println("PL_SAL_3100:::::::::::::::");
        		wb3100.pl_sal_3100_m(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_3100_m.jsp";
        		break;        
            //�߼۰�꼭(�߰�) ��ȸ
        	case PLSalWBMapping.PL_SAL_3110:
        		wb3100 = new PL_SAL_3100WB();
                System.out.println("PL_SAL_3110:::::::::::::::");
        		wb3100.pl_sal_3110_l(req, res);
        		nextPage = "/jsp/pl/sal/pl_sal_3110_l.jsp";
        		break;        

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
