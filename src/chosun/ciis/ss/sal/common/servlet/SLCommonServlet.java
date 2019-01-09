/**************************************************************************************************
* ���ϸ�    : CommonServlet.java
* ���      : �Ǹ����� �ý��� ����κ� ó�� ����
* �ۼ�����  : 2003-11-30
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/

package chosun.ciis.ss.sal.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.common.servlet.*;

import chosun.ciis.ss.sal.common.wb.*;

/**
 * ���� ó�� ����
 */
public class SLCommonServlet extends ChosunServlet{

    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";
    //Initialize global variables
    public void init() throws ServletException{
    }

    //Clean up resources
    public void destroy(){
    }

    public void checkAuthority(){
    //System.out.println("PilotSystem Output : checkAuthority() called.");
    }

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
        IOException, ServletException{

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try{
            String servletMappedUrl = "/ss/slcommon/";
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch(AppException ae){
            ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/slcomm_jsp/app_error.jsp";
        } catch(SysException se){
            se.printStackTrace();
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/slcomm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/slcomm_jsp/sys_error.jsp";
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
System.out.println("SLCommonServlet : nextPage : " + nextPage);
        rd.forward(req, res);
    }

    /**
     * SLCommon1000WBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws SysException, AppException{
        String nextPage = null;
        SLCommon1000WB wb = new SLCommon1000WB();
        SLCommon11000WB wb11000 = new SLCommon11000WB();

        switch(pid){
            case SLCommonWBMapping.COMMON_1000: //�����ȣ�˻�(�ʱ�ȭ��)
                nextPage = "/jsp/ss/slcommon/sl_common_1000_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1005: //�����ȣ�˻�(�����ȣ,��/��/�� �Է� - ����Ű)
                wb.selectZipList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1005_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1010: //�����ȣ�˻�(�����ȸ)
                wb.selectZipList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1010_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1100: //���ڻ���ȸ�˾�(������)(�ʱ�ȭ��)
                wb.selectDsctList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1100_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1105: //���ڻ���ȸ�˾�(������)(�����ȸ)
                wb.selectReaderDetailList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1105_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1110: //���ڰ˻��˾�(�⺻��)(�ʱ�ȭ��)
                nextPage = "/jsp/ss/slcommon/sl_common_1110_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1115: //���ڰ˻��˾�(�⺻��)(���ڸ�/��ȣ/����+��� - ����Ű)
                wb.selectReaderList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1115_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1120: //���ڰ˻��˾�(�⺻��)(�����ȸ)
                wb.selectReaderList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1120_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1200: //Ȯ���ڰ˻�(�ʱ�ȭ��))
                wb.selectExtnBlngCdList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1200_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1205: //Ȯ���ڰ˻�(Ȯ���ڸ� �Է� - ����Ű)
                wb.selectExtnPersList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1205_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1210: //Ȯ���ڰ˻�(�����ȸ)
                wb.selectExtnPersList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1210_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1300: //�����ڵ� �����ڵ� ����
                wb.selectClsfCodeList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1300_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1310: // ���� ȸ�� ���� ��ȸ
                wb.selectRDR_SERVICE(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1310_s.jsp";
                break;
            case SLCommonWBMapping.COMMON_1400: //�����˻�(�ʱ�ȭ��)
                nextPage = "/jsp/ss/slcommon/sl_common_1400_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1405: //�����˻�(������ �Է� - ����Ű)
                wb.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1405_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1410: //�����˻�(�����ȸ)
                wb.selectBranchOfficeList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1410_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1500: //���˹��˻�(�ʱ�ȭ��)
                nextPage = "/jsp/ss/slcommon/sl_common_1500_p.jsp";
                break;
            case SLCommonWBMapping.COMMON_1505: //���˹��˻�(���˹��� �Է� - ����Ű)
                wb.selectBnsItemCdList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1505_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1510: //���˹��˻�(�����ȸ)
                wb.selectBnsItemCdList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1510_l.jsp";
                break;
            case SLCommonWBMapping.COMMON_1600: //����������޸�ü(�����ȸ)
                wb.selectBoHndlMediList(req, res);
                nextPage = "/jsp/ss/slcommon/sl_common_1600_l.jsp";
                break;

               //�����ȣ ���� 2017-02-17 �弱�� �߰�.
    		case SLCommonWBMapping.COMMON_12710: // �������ȣ�˻�(�����ȸ)_����Ͽ�_agency�� ����
    			wb11000 = new SLCommon11000WB();
    			wb11000.mo_selectNewAddrList(req, res);
    			nextPage = "/jsp/ss/common/mo_sl_common_12710_l.jsp";
    			break;
    		case SLCommonWBMapping.COMMON_12720: // �������ȣ�˻�(�������)_����Ͽ�_agency�� ����
    			wb11000.mo_selectNewGugunList(req, res);
    			nextPage = "/jsp/ss/common/mo_sl_common_12720_l.jsp";
    			break;


            default:
                nextPage = "/";
                throw new AppException("AE003", "�ش� PID�� �����ϴ�.");
        }
        return nextPage;
    }
}
