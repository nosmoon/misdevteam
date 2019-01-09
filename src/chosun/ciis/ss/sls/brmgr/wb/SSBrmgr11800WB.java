/***************************************************************************************************
* ���ϸ� : SSBrmgr11800WB.java_����Ͽ�
* ��� : ���Ͱ���-���Է�����-����Ʈ���Է��� ���� Worker Bean
* �ۼ����� : 2017-01-13
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;				//�߰�
import java.lang.*;				//�߰�
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �����濵-����Ʈ���Է��� ���� WB
 */

public class SSBrmgr11800WB{

    /**
     * ����Ʈ������Ȳ_�ּ��ڵ帮��Ʈ����_����Ͽ�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void mo_selectThrwList(HttpServletRequest req, HttpServletResponse res) throws AppException{

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = req.getParameter("bocd"); // ���������ڵ�
		String pageno = Util.checkString(req.getParameter("curr_page_no")); // ��������ȣ
		String pagesize = Util.checkString(req.getParameter("records_per_page")); // ������������
		String invsgdt1 = Util.checkString(req.getParameter("invsgdt1")); // ��������1
		String invsgdt2 = Util.checkString(req.getParameter("invsgdt2")); // ��������2
		String addrcd = Util.checkString(req.getParameter("addrcd")); // �ּ��ڵ�

		SL_MO_L_COMM_APT_THRWDM dm = new SL_MO_L_COMM_APT_THRWDM();

		pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'�� Null�ϰ�� 1��
		// ��ȯ
		pagesize = ("".equals(pagesize)) ? "100" : pagesize; // 'pagesize'��
		// Null�ϰ�� 20�� ��ȯ

		dm.setBocd(bocd);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));
		dm.setInvsgdt1(invsgdt1);
		dm.setInvsgdt2(invsgdt2);
		dm.setAddrcd(addrcd);

		dm.print();

    	SL_MO_L_COMM_APT_THRWDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_selectThrwList(dm);
		req.setAttribute("ds", ds);

    }


    /**
     * ����Ʈ������Ȳ_�ּ��ڵ忡 �ش��ϴ� �� ����Ʈ����_����Ͽ�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void mo_selectDtladdrList(HttpServletRequest req,   //����Ͽ�
			HttpServletResponse res) throws AppException, SysException {


		String bocd = req.getParameter("bocd"); // ���������ڵ�
		String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd"))); // �ּ��ڵ�
		String sPageNo = req.getParameter("curr_page_no"); // ����������
		String records_per_page = req.getParameter("records_per_page"); //�ּ�ó����. 20160826

		SL_L_DTLSADDRDM dm = new SL_L_DTLSADDRDM();

		int iPageSize = 100; //������Ʈ�� ��ΰ������� ���� 100���� �����س���. 20161121
		int iPageNo = 1; // ���� ������ 1�� ����
		if (sPageNo != null && !sPageNo.equals("")) { // ������ ���� ������ �缳��
			iPageNo = Integer.parseInt(sPageNo);
		}

		// dm�� ���� Setting�Ѵ�.
		dm.setBocd(bocd); // ���������ڵ�
		dm.setAddrcd(addrcd); // �ּ��ڵ�
		dm.setPageno(iPageNo); // ����������
		dm.setPagesize(iPageSize); // �������� Row��

		SL_L_DTLSADDRDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_selectDtladdrList(dm);
		req.setAttribute("ds", ds);
	}

	/**
	 * ���ī��(�ش缾���� ����Ʈ ������Ȳ ��ȸ)_����Ͽ�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void mo_selectAptdlvList(HttpServletRequest req, HttpServletResponse res) //����Ͽ�_����ϸ�������.
			throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = Util.checkString(req.getParameter("bocd")); // ���������ڵ�
		String medicd = Util.checkString(req.getParameter("medicd")); // ��ü�ڵ�  ��� ����
		String addrcd = Util.checkString(req.getParameter("addrcd")); // �ּ��ڵ�
		String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno"))); // ����ȣ
		String stho = Util.checkString(req.getParameter("stho"));//����ȣ��
		String edho = Util.checkString(req.getParameter("edho"));//��ȣ��

		stho = ("".equals(stho))?"0":stho;
		edho = ("".equals(edho))?"0":edho;

		SS_L_APTDLV_LISTDM dm = new SS_L_APTDLV_LISTDM();

		dm.setBocd(bocd);
		dm.setMedicd(medicd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setStho(Long.parseLong(stho));
		dm.setEdho(Long.parseLong(edho));

		//dm.print();

		SS_L_APTDLV_LISTDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_selectAptdlvList(dm);
		req.setAttribute("ds", ds);
	}


	/**
	 * //����Ʈ���Է���ȸ(����Ʈ���¸���Ʈ or ���Է���ϸ���Ʈ)_����ϸ�����
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_selectAptrchList(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = Util.checkString(req.getParameter("bocd"));
		String addrcd = Util.checkString(req.getParameter("addrcd"));
		String dongno = Util.checkString(req.getParameter("dongno"));
		String ivstdt = Util.checkString(req.getParameter("ivstdt"));
		String ivstpers = Util.checkString(req.getParameter("ivstpers"));

		SS_MO_L_APTINPIVSTDM dm = new SS_MO_L_APTINPIVSTDM();

		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setIvstdt(ivstdt);
		dm.setIvstpers(ivstpers);

		dm.print();

		SS_MO_L_APTINPIVSTDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_selectAptrchList(dm);
		req.setAttribute("ds", ds);
	}


	/**
	 * //����Ʈ�� ����, ���Է����翡 �ʿ��� ��ü����Ʈ_����ϸ�����
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_selectAptinfoList(HttpServletRequest req, HttpServletResponse res) //����Ͽ�
			throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
		String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
		String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));

		SL_MO_L_INPIVSTINFODM dm = new SL_MO_L_INPIVSTINFODM();

		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);

		dm.print();

		SL_MO_L_INPIVSTINFODataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_selectAptinfoList(dm);
		req.setAttribute("ds", ds);
	}

	/**
	 * ����Ʈ������Ȳ(�󼼺���) ��ȸ�� request���� set�Ѵ�.
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_accessThrw(HttpServletRequest req, HttpServletResponse res) //����Ͽ�
			throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String accflag = Util.checkString(req.getParameter("accflag"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String addrcd = Util.checkString(req.getParameter("addrcd"));
		String dongno = Util.checkString(req.getParameter("dongno"));
		String pyong1 = Util.checkString(req.getParameter("pyong1"));
		String hoscnt1 = Util.checkString(req.getParameter("hoscnt1"));
		String pyong2 = Util.checkString(req.getParameter("pyong2"));
		String hoscnt2 = Util.checkString(req.getParameter("hoscnt2"));
		String pyong3 = Util.checkString(req.getParameter("pyong3"));
		String hoscnt3 = Util.checkString(req.getParameter("hoscnt3"));
		String invsgdt = Util.checkString(req.getParameter("invsgdt"));
		String invsgno = Util.checkString(req.getParameter("invsgno"));
		String incmgpers = Util.checkString(req.getParameter("incmgpers"));
		String housval = Util.checkString(req.getParameter("housval"));
		String regtype1 = Util.checkString(req.getParameter("regtype1"));
		String regtype2 = Util.checkString(req.getParameter("regtype2"));
		String aptfloor = Util.checkString(req.getParameter("aptfloor"));
		String aptho = Util.checkString(req.getParameter("aptho"));

		SL_MO_A_COMM_APT_THRWDM dm = new SL_MO_A_COMM_APT_THRWDM();

		dm.setAccflag(accflag);
		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setPyong1(Long.parseLong(Util.convertNull(pyong1, "0")));
		dm.setHoscnt1(Long.parseLong(Util.convertNull(hoscnt1, "0")));
		dm.setPyong2(Long.parseLong(Util.convertNull(pyong2, "0")));
		dm.setHoscnt2(Long.parseLong(Util.convertNull(hoscnt2, "0")));
		dm.setPyong3(Long.parseLong(Util.convertNull(pyong3, "0")));
		dm.setHoscnt3(Long.parseLong(Util.convertNull(hoscnt3, "0")));
		dm.setInvsgdt(invsgdt);
		dm.setInvsgno(invsgno);
		dm.setIncmgpers(incmgpers);
		dm.setHousval(housval);
		dm.setRegtype1(regtype1);
		dm.setRegtype2(regtype2);
		dm.setAptfloor(aptfloor);
		dm.setAptho(aptho);
		dm.print();

		SL_MO_A_COMM_APT_THRWDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_accessThrw(dm);
		req.setAttribute("ds", ds);
	}

	/**
	 * ���Ͱ���-���Է�����-��Ȳ�˻�
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_selectThrwResult(HttpServletRequest req, HttpServletResponse res) //����Ͽ�
			throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));
		String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
		String deptcd = Util.checkString(req.getParameter("deptcd"));
		String partcd = Util.checkString(req.getParameter("partcd"));
		String areacd = Util.checkString(req.getParameter("areacd"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String addrcd = Util.checkString(req.getParameter("addrcd"));
		String dongno = Util.checkString(req.getParameter("dongno"));
		String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));

		SS_MO_L_COMM_APT_RESULTDM dm = new SS_MO_L_COMM_APT_RESULTDM();

		dm.setInvsgdt1(invsgdt1);
		dm.setInvsgdt2(invsgdt2);
		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setIncmg_pers(incmg_pers);
		dm.print();

		SS_MO_L_COMM_APT_RESULTDataSet ds = null;

		SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO ��ü�� initApt ȣ��
		ds = dao.mo_selectThrwResult(dm);
		req.setAttribute("ds", ds);
	}


}
