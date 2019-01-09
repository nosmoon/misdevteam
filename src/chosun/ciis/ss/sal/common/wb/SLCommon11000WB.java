/**************************************************************************************************
* ���ϸ�    : SLCommon11000WB.java
* ���      : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
*             EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
* �ۼ�����  : 2003-11-19
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;

/**
 * Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ� EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 */
public class SLCommon11000WB {


	/**
	 * �����ȣ�˻�(�����ȸ)
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 * @throws SysException
	 */
	public void mo_selectNewAddrList(HttpServletRequest req, HttpServletResponse res) //����Ͽ�
		throws AppException, SysException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = req.getParameter("bocd"); // ���������ڵ�
		String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido"))); //
		String gugun = Util.Uni2Ksc(Util.checkString(req.getParameter("gugun"))); //
		String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm"))); //
		String bldgnn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnn1"))); //
		String bldgnn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnn2"))); //
		String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong"))); //
		String localnn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("localnn1"))); //
		String localnn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("localnn2"))); //
		String bldgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnm"))); //
		String job_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("job_flag"))); //
		String orderby = Util.Uni2Ksc(Util.checkString(req.getParameter("orderby"))); //
		String pageno = Util.checkString(req.getParameter("pageno")); // ���� ������
		String pagesize = Util.checkString(req.getParameter("pagesize")); // ������������

		CO_MO_L_NEW_ADDRDM dm = new CO_MO_L_NEW_ADDRDM();
		dm.setBocd(bocd); // ���������ڵ�
		dm.setSido(sido);
		dm.setGugun(gugun);
		dm.setRdnm(rdnm);
		dm.setBldgnn1(bldgnn1);
		dm.setBldgnn2(bldgnn2);
		dm.setDong(dong);
		dm.setBnji1(localnn1);
		dm.setBnji2(localnn2);
		dm.setBldgnm(bldgnm);
		dm.setJob_flag(job_flag);
		dm.setOrderby(orderby);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));

		dm.print();

		CO_MO_L_NEW_ADDRDataSet ds = null;

		SLCommon11000DAO dao = new SLCommon11000DAO();
		ds = dao.mo_selectNewAddrList(dm);
		req.setAttribute("ds", ds);

	}
	
	

	/**
	 * �����ȣ�˻�(�������)
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 * @throws SysException
	 */
	public void mo_selectNewGugunList(HttpServletRequest req, HttpServletResponse res) //����Ͽ�
		throws AppException, SysException {
	// parameter requesting �ϰ� DM�� ���� Setting

		String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido"))); // ��/��


		CO_L_NEWGUGUNDM dm = new CO_L_NEWGUGUNDM();
		dm.setSearchgb("2");
		dm.setSearchnm(sido);

		dm.print();

		CO_L_NEWGUGUNDataSet ds = null;

		SLCommon11000DAO dao = new SLCommon11000DAO();
	    ds = dao.mo_selectNewGugunList(dm);
	    req.setAttribute("ds", ds);

	}

	
}

