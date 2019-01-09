/***************************************************************************************************
 * ���ϸ� : SSExtn2800WB.java
 * ��� : ���ͺ��ڰ��� Worker Bean
 * �ۼ����� : 2013-06-27
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ss.sls.brinfo.dao.SSBrinfo1000DAO;
import chosun.ciis.ss.sls.brinfo.dm.SS_L_BO_SRCH_INITDM;
import chosun.ciis.ss.sls.brinfo.ds.SS_L_BO_SRCH_INITDataSet;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * Ȯ����Ȳ-���ͺ��ڰ����� ���� WB
 */

public class SSExtn2800WB {

    /**
     * Ȯ����Ȳ-���ͺ��ڰ���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_TEAM_SRCH_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_TEAM_SRCH_INITDM dm = new SS_L_TEAM_SRCH_INITDM();
        
        SSExtn2800DAO dao = new SSExtn2800DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
    }
    
	/**
	 * Ȯ����Ȳ-���ͺ��ڰ���(��ȸ) ��ȸ�� request���� set�Ѵ�.
	 * 
	 * @param HttpServletRequest 	req
	 * @param HttpServletResponse	res
	 * @throws AppException
	 * 
	 * @return void
	 */
	public void selectRdrareaList(HttpServletRequest req, HttpServletResponse res) throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting //ó�� FLAG(I:���, U:����, D:����,
		// E:Ȯ��)
		String deptcd = Util.checkString(req.getParameter("deptcd")); //���ڵ�
		String partcd = Util.checkString(req.getParameter("partcd")); //��Ʈ�ڵ�
		String areacd = Util.checkString(req.getParameter("areacd")); //�����ڵ�
		String bocd = Util.checkString(req.getParameter("bocd")); //�����ڵ�
//		String pageno = Util.checkString(req.getParameter("pageno")); // ��������ȣ
//		String pagesize = Util.checkString(req.getParameter("pagesize")); // ������������
		String rdr_regdt1 = Util.checkString(req.getParameter("rdr_regdt1")); // �˻��Ⱓ1
		String rdr_regdt2 = Util.checkString(req.getParameter("rdr_regdt2")); // �˻��Ⱓ2
		String search_flg = Util.checkString(req.getParameter("search_flg")); // �˻�����
		String medicd = Util.checkString(req.getParameter("medicd")); // ��ü�ڵ�
		String search_nm = Util.Uni2Ksc(Util.checkString(req
				.getParameter("search_nm"))); // �˻���

		SS_L_RDR_RDRAREADM dm = new SS_L_RDR_RDRAREADM();

		System.out.println("===========================");
		System.out.println("deptcd: " + deptcd);
		System.out.println("partcd: " + partcd);
		System.out.println("areacd: " + areacd);
		System.out.println("bocd: " + bocd);
		System.out.println("===========================");
		
//		pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'�� Null�ϰ�� 1��
		// ��ȯ
//		pagesize = ("".equals(pagesize)) ? "20" : pagesize; // 'pagesize'��
		// Null�ϰ�� 20�� ��ȯ

		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
//		dm.setPageno(Long.parseLong(pageno));
//		dm.setPagesize(Long.parseLong(pagesize));
		dm.setRdr_regdt1(rdr_regdt1);
		dm.setRdr_regdt2(rdr_regdt2);
		dm.setSearch_flg(search_flg);
		dm.setMedicd(medicd);
		dm.setSearch_nm(search_nm);
		
		SSExtn2800DAO dao = new SSExtn2800DAO();
	    // DAO ��ü�� init ȣ��
		SS_L_RDR_RDRAREADataSet ds = null;
	    ds = dao.selectRdrareaList(dm);
	    req.setAttribute("ds", ds);

	}
	
	/**
	 * Ȯ����Ȳ-���ͺ��ڰ���(����ȸ) ��ȸ�� request���� set�Ѵ�.
	 * 
	 * @param HttpServletRequest 	req
	 * @param HttpServletResponse	res
	 * @throws AppException
	 * 
	 * @return void
	 */	
	public void selectRdrareaDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = Util.checkString(req.getParameter("bocd")); // ���������ڵ�
		String areardr_no = Util.checkString(req.getParameter("areardr_no")); // �������ڹ�ȣ

		SS_S_RDR_RDRAREADM dm = new SS_S_RDR_RDRAREADM();

		dm.setBocd(bocd);
		dm.setAreardr_no(areardr_no);

		SSExtn2800DAO dao = new SSExtn2800DAO();
		// DAO ��ü�� init ȣ��
		SS_S_RDR_RDRAREADataSet ds = null;
	    ds = dao.selectRdrareaDetail(dm);
	    req.setAttribute("ds", ds);
	}
	
}

