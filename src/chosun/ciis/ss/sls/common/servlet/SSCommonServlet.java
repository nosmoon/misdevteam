/***************************************************************************************************
* ���ϸ� : SSCommonServlet.java
 * ��� : �μ�,���� �� ���� ����
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.wb.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;
import chosun.ciis.ss.sls.rdr.servlet.SSReaderWBMapping;
import chosun.ciis.ss.sls.rdr.wb.SSReader11000WB;

public class SSCommonServlet extends ChosunServlet {
    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";
    //Initialize global variables
    public void init() throws ServletException {
    }

    //Clean up resources
    public void destroy() {
    }

    public void checkAuthority() {
    }

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws IOException
     * @throws ServletException
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

      String requestURI = null;
      String strPid = null;
      int iPid = 0;
      String nextPage = null;
      try {
        String servletMappedUrl = "/ss/common/";
        iPid = extractPid(req, servletMappedUrl);
System.out.println("SSCommonServlet : process : iPid : "+iPid);
        nextPage = executeWorker(req, res, iPid);
System.out.println("SSCommonServlet : process : nextPage : "+nextPage);
      } catch (AppException ae) {
        req.setAttribute("appException", ae);
        nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
      } catch (SysException se) {
        req.setAttribute("sysException", se);
        nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
      }

      RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
         rd.forward(req, res);
    }

    /**
     * PilotWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {
      String nextPage = null;
      SSCommon1100WB wb = null;

		/* ����ϰ��� wb ���� �и� 20161207 �弱�� */
      SSCommon11100WB wb11100 = null; //����Ͽ�


      switch (pid) {
        case SSCommonWBMapping.COMMON_1000:         // ����-�����˻�(�Ϲ�����)
              wb = new SSCommon1100WB();
              wb.selectDeptList(req, res);
              nextPage = "/jsp/ss/common/ss_common_1100_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1100:         // ����-�����˻�(�Ϲ�����)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1100_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1101:         // ����-�����˻�(�����ڵ�,������)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1101_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1102:         // ����-�����˻�(enctype="multipart/form-data")
            wb = new SSCommon1100WB();
            wb.selectAreaList2(req, res);
            nextPage = "/jsp/ss/common/ss_common_1102_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1103:         // ����-���������˻�(�Ϲ�����)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1102_l.jsp";
            break;

        case SSCommonWBMapping.COMMON_1105:         // ����-ǰ����Ȯ�� �������� �˻�-�����˻�
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1105_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1106:         // ����-��������-�Ź�������ǰ-���-������� �����˻�
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1106_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1107:         // ����-�����濵-�����������-�����˻�
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1107_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1110:         // ����-���� �˻� �ʱ�ȭ��(�˾�)
            nextPage = "/jsp/ss/common/ss_common_1110_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1113:         // ����-���� �˻� ���
            wb = new SSCommon1100WB();
            wb.selectBOList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1113_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1115:         // ����-���� �˻� ���
            wb = new SSCommon1100WB();
            wb.selectBOList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1115_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1116:         // ����-�������(LIST)
            wb = new SSCommon1100WB();
            wb.selectBoinfoList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1116_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1117:         // ����-�������(LIST)
            wb = new SSCommon1100WB();
            wb.selectGugunList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1117_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1118:         // ����-�������(LIST)
            wb = new SSCommon1100WB();
            wb.selectNewZipList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1118_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1150: //�����ȣ�˻�(�ʱ�ȭ��)
            nextPage = "/jsp/ss/common/ss_common_1150_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1152: //�����ȣ�˻�(�����ȣ,��/��/�� �Է� - ����Ű)
            wb = new SSCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1152_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1154: //�����ȣ�˻�(�����ȸ)
            wb = new SSCommon1100WB();
            wb.selectZipList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1154_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1160: //��ü�ڵ�˻�(ȸ�纰)-�˻���
            wb = new SSCommon1100WB();
            wb.selectCmpyMedicdList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1160_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1161: //��ü�ڵ�˻�(ȸ�纰)-����
            wb = new SSCommon1100WB();
            wb.selectCmpyMedicdList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1161_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1162: //����-���ޱ����ڵ�˻�(���ޱ��к�-���ϸ���)-�˻���
            wb = new SSCommon1100WB();
            wb.selectClsfBasiList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1162_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1163: //����-���ޱ����ڵ�˻�(���ޱ��к�-���ϸ���)-����
            wb = new SSCommon1100WB();
            wb.selectClsfBasiList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1163_l.jsp";
            break;

            // ���ڰ˻� �˾�
        case SSCommonWBMapping.COMMON_1170: //����-���ڻ���ȸ�˾�(������)(�ʱ�ȭ��)
            nextPage = "/jsp/ss/common/ss_common_1170_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1171: //����-���ڻ���ȸ�˾�(������)(�����ȸ)
            wb = new SSCommon1100WB();
            wb.selectReaderDetailList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1171_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1172: //����-���ڰ˻��˾�(�⺻��)(�ʱ�ȭ��)
            nextPage = "/jsp/ss/common/ss_common_1172_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1173: //����-���ڰ˻��˾�(�⺻��)(���ڸ�/��ȣ/����+��� - ����Ű)
            wb = new SSCommon1100WB();
            wb.selectReaderList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1173_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1174: //����-���ڰ˻��˾�(�⺻��)(�����ȸ)
            wb = new SSCommon1100WB();
            wb.selectReaderList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1174_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1176: //���ڰ˻�(�ʱ�ȭ��)
            nextPage = "/jsp/ss/common/ss_common_1176_p.jsp";
            break;
        case SSCommonWBMapping.COMMON_1178: //���ڰ˻�(���ڸ� �Է���ȸ - ����Ű)
            wb = new SSCommon1100WB();
            wb.selectRDRList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1178_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1180: //���ڰ˻�(�����ȸ)
            wb = new SSCommon1100WB();
            wb.selectRDRList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1180_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1190:         // ����-�����˻�(�Ϲ�����)
            wb = new SSCommon1100WB();
            wb.selectAreaList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1190_l.jsp";
            break;

        case SSCommonWBMapping.COMMON_1201:
            wb = new SSCommon1100WB();
            wb.selectNewGugunList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1201_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_1202:
            wb = new SSCommon1100WB();
            wb.selectNewAddrList(req, res);
            nextPage = "/jsp/ss/common/ss_common_1202_l.jsp";
            break;

/*******************************************����Ͽ�******************************************************************/
        case SSCommonWBMapping.COMMON_11108: //����-�����˻�(��������Ʈ)_����Ͽ�
        	wb11100 = new SSCommon11100WB();
        	wb11100.mo_selectAreaList(req, res);
            nextPage = "/jsp/ss/common/mo_ss_common_11108_l.jsp";
            break;
        case SSCommonWBMapping.COMMON_11180: //����-���͸���Ʈ_����Ͽ�
        	wb11100 = new SSCommon11100WB();
        	wb11100.mo_selectBoList(req, res);
            nextPage = "/jsp/ss/common/mo_ss_common_11180_l.jsp";
            break;


        default:
          throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
      }
      return nextPage;
    }
}
