/***************************************************************************************************
* ���ϸ� : SSBrinfo1600WB.java
* ��� : ����Info-�߼۳뼱�� ���� Worker Bean
 * �ۼ����� : 2004-04-01
 * �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-�߼۳뼱�� ���� Worker Bean
 */

public class SSBrinfo11600WB{


    /**
     * ����Info-�߼۳뼱(�����뼱��ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectBsnsList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //����Ͽ�
    	SS_MO_L_BSNSDataSet ds = null;

         // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));    					    //���������ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));	     		//�����ڵ�
		String sendplacnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sendplacnm")));			//�뼱��
		String route_clsf = Util.checkString(req.getParameter("route_clsf"));
		String fromdate = Util.checkString(req.getParameter("fromdate"));			//��ȸ ��������
        String todate = Util.checkString(req.getParameter("todate"));				//��ȸ ��������

        SS_MO_L_BSNSDM dm = new SS_MO_L_BSNSDM();

        dm.setBocd(bocd);
        dm.setAreacd(areacd);
        dm.setSendplacnm(sendplacnm);
        dm.setRoute_clsf(route_clsf);
        dm.setFromdate(fromdate);
        dm.setTodate(todate);

        SSBrinfo11600DAO dao = new SSBrinfo11600DAO();
        // DAO ��ü�� selectBsnsList ȣ��
        ds = dao.mo_selectBsnsList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

    }

    /**
     * ����Info-�߼۳뼱(�����뼱��ȸ_���ͺ���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectBsnsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{ //����Ͽ�
    	SS_MO_S_BSNSDataSet ds = null;

         // parameter requesting �ϰ�  DM�� ���� Setting
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String route_clsf = Util.checkString(req.getParameter("route_clsf"));
    	String fromdate = Util.checkString(req.getParameter("fromdate"));
    	String todate = Util.checkString(req.getParameter("todate"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));

        SS_MO_S_BSNSDM dm = new SS_MO_S_BSNSDM();

        dm.setAreacd(areacd);
        dm.setRoute_clsf(route_clsf);
        dm.setFromdate(fromdate);
        dm.setTodate(todate);
        dm.setBocd(bocd);
        dm.setSend_plac_seq(send_plac_seq);

        SSBrinfo11600DAO dao = new SSBrinfo11600DAO();
        // DAO ��ü�� selectBsnsList ȣ��
        ds = dao.mo_selectBsnsDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

    }


}
