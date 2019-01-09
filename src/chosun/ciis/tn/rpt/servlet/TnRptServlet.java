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


package chosun.ciis.tn.rpt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.tn.rpt.wb.TN_RPT_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class TnRptServlet extends BaseServlet {
 
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
            String servletMappedUrl = "/tn/rpt/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("TnReportServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("TnReportServlet : process : nextPage : " + nextPage);
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
     * TnRptWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
        TN_RPT_1000WB wb1 = null;      
        
        switch (pid) {
	    	case TnRptWBMapping.TN_RRT_1010_M:  //���ϳ���_������ �߱޴��� ��ݺμ� �޺�����Ʈ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_report_1010_m(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1010_m.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1020_L:  //���ϳ���_������ �߱޴���_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1020_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1020_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1021_L:  //���ϳ���_������ �߱޴���_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1020_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1021_l.jsp";
				break;				
				
	    	case TnRptWBMapping.TN_RPT_1050_L:  //���ϳ���_���峻����ȸ_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1050_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1050_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1400_L:  //���ϳ���_����������Ȳ_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1400_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1400_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1500_L:  //���ϳ���_�����Ͱ���_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1500_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1500_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1510_L:  //���ϳ���_�����Ͱ��� ��(ȸ��)_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1510_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1510_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1520_L:  //���ϳ���_�����Ͱ��� ��(����)_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1520_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1520_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1600_L:  //���ϳ���_�������_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1600_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1600_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1610_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1650_L:  //���ϳ���_�������_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1600_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1600_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1650_l.jsp";
				break;	
	    	case TnRptWBMapping.TN_RPT_1800_L:  //���ϳ���_���Ը��_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1800_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1800_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1810_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1850_L:  //���ϳ���_���Ը��_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1800_l(req, res);
				//nextPage = "/jsp/tn/rpt/tn_rpt_1800_l.jsp";
				nextPage = "/jsp/tn/rpt/tn_rpt_1850_l.jsp";
				break;				
	    	case TnRptWBMapping.TN_RPT_1101_L:  //���ϳ���_���¹�ȣ����_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1101_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1101_l.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1102_A:  //���ϳ���_���¹�ȣ����_����
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case TnRptWBMapping.TN_RPT_1131_L:  //���ϳ���_���⿹����ȸ_��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1131_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1131_l.jsp";
				break;
				
	    	case TnRptWBMapping.TN_RPT_1140_M:  //SMS���۳�����ȸ �ʱ�ȭ��
	    		wb1 = new TN_RPT_1000WB();
				//((TN_RPT_1000WB)wb1).tn_rpt_1140_m(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1140_m.jsp";
				break;

	    	case TnRptWBMapping.TN_RPT_1141_L:  //SMS���۳��� ��ȸ
	    		wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1141_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1141_l.jsp";
				break;
				
			case TnRptWBMapping.TN_RPT_1301_L:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1301_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1301_l.jsp";
				break;			
			case TnRptWBMapping.TN_RPT_1302_I:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1302_i(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1302_i.jsp";
				break;	
			case TnRptWBMapping.TN_RPT_1700_M:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1700_m(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1700_m.jsp";
				break;					
			case TnRptWBMapping.TN_RPT_1701_L:
				wb1 = new TN_RPT_1000WB();
				((TN_RPT_1000WB)wb1).tn_rpt_1701_l(req, res);
				nextPage = "/jsp/tn/rpt/tn_rpt_1701_l.jsp";
				break;				
								
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
}
