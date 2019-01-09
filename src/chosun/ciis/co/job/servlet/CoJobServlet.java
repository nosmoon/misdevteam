/***************************************************************************************************
 * ���ϸ�   : CoJobServlet.java
 * ���     : ������� - �������� ����
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/
package chosun.ciis.co.job.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.job.wb.CoJob1000WB;
import chosun.ciis.co.job.wb.CoJob2000WB;
import chosun.ciis.co.job.wb.CoJob3000WB;

public class CoJobServlet extends BaseServlet {

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
            String servletMappedUrl = "/co/job/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("CoJobServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CoJobServlet : process : nextPage : " + nextPage);
        }
        catch (AppException ae) {
        	ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/common/jsp/app_error.jsp";
        }
        catch (SysException se) {
        	se.printStackTrace();
            req.setAttribute("sysException", se);
            nextPage = "/common/jsp/sys_error.jsp";
        }
        catch (Exception e) {
        	e.printStackTrace();
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/common/jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
            nextPage);
        rd.forward(req, res);
    }

    /**
     * CoJobWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
                                int pid) throws AppException, IOException, SQLException {
        String nextPage = null;
        
        BaseWB workbean = null;
                
        switch (pid) {
            case CoJobWBMapping.CO_JOB_1000:		//��������
	    		workbean = new CoJob1000WB();
	    		((CoJob1000WB)workbean).co_job_1000_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_1000_m.jsp";
	    		break;
            case CoJobWBMapping.CO_JOB_1002:		//��������
	    		workbean = new CoJob1000WB();
	    		((CoJob1000WB)workbean).co_job_1002_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_1002_m.jsp";
	    		break;
            case CoJobWBMapping.CO_JOB_1001:		//��������
	    		workbean = new CoJob1000WB();
	    		((CoJob1000WB)workbean).co_job_1001_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_1001_m.jsp";
	    		break;
        	case CoJobWBMapping.CO_JOB_1010:		//�������� �����ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1010_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1010_l.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1015:		//�������� ������ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1015_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1015_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1016:		//�������� ������ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1016_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1016_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1020:		//�������� ����ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1020_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1020_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1025:		//�������� �亯���
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1025_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1025_l.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1030:		//�������ô亯 ��ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1030_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1030_l.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1040:		//�������ô亯  �Է�, ����, ����
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;	
    		case CoJobWBMapping.CO_JOB_1050:		//��������  �Է�, ����, ����
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1060:		//�������ô亯 ����ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1060_s(req, res);
        		nextPage = "/jsp/co/job/co_job_1060_s.jsp";
        		break;
    		case CoJobWBMapping.CO_JOB_1070:		//�������� ÷������ �ٿ�ε�
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1070_a(req, res);
        		nextPage = "/jsp/co/job/co_job_1070_a.jsp";
        		break;  
    		case CoJobWBMapping.CO_JOB_1080:		//�������� ����ó �����ȸ
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1080_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1080_l.jsp";
        		break;   
    		case CoJobWBMapping.CO_JOB_1081:		//�������� ����ó ��ϻ���
        		workbean = new CoJob1000WB();
        		((CoJob1000WB)workbean).co_job_1081_l(req, res);
        		nextPage = "/jsp/co/job/co_job_1081_l.jsp";
        		break;    

	    	case CoJobWBMapping.CO_JOB_2000:		//���ã��
	    		workbean = new CoJob2000WB();
	    		((CoJob2000WB)workbean).co_job_2000_m(req, res);
	    		nextPage = "/jsp/co/job/co_job_2000_m.jsp";
	    		break;     
	    	case CoJobWBMapping.CO_JOB_2010:		//���ã��
	    		workbean = new CoJob2000WB();
	    		((CoJob2000WB)workbean).co_job_2010_a(req, res);
	    		nextPage = "/common/jsp/resultMsg.jsp";
	    		break;    

//      �濵��������
            case CoJobWBMapping.CO_JOB_3000:
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3000_m(req, res);
            	nextPage = "/jsp/co/job/co_job_3000_m.jsp";
            	break;                
            case CoJobWBMapping.CO_JOB_3010:
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3010_l(req, res);
            	nextPage = "/jsp/co/job/co_job_3010_l.jsp";
            	break;                
            case CoJobWBMapping.CO_JOB_3020:
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3020_a(req, res);
            	nextPage = "/common/jsp/resultMsg.jsp";
            	break;               
            case CoJobWBMapping.CO_JOB_3030:  
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3030_s(req, res);
            	nextPage = "/jsp/co/job/co_job_3030_s.jsp";
            	break;               
            case CoJobWBMapping.CO_JOB_3040:  
            	workbean = new CoJob3000WB();
            	((CoJob3000WB)workbean).co_job_3040_u(req, res);
            	nextPage =  "/jsp/co/job/co_job_3040_u.jsp";
            	break;                	
        		
            	
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
