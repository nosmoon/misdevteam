/***************************************************************************************************
* ���ϸ� : SSReader1100WB.java
* ��� : ������Ȳ-���ں��� ó���� ���� Worker Bean
* �ۼ����� : 2004-01-12
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.move.dao.SSMove1000DAO;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDRDM;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDR_INITDM;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_INITDataSet;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dao.SSCommon1100DAO;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-���ں��� ���� WB
 */

public class SSReader11100WB{

    /**
     * ������Ȳ-���ں���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //�����
        SS_L_RDR_DSCT_INITDataSet ds = null;
        SS_L_RDR_DSCT_INITDM dm = new SS_L_RDR_DSCT_INITDM();

        SSReader11100DAO dao = new SSReader11100DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.mo_selectInitList(dm);
		req.setAttribute("ds", ds);

    }

    /**
     * ������Ȳ-���ں��� ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectRdrDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //�����

        SS_MO_L_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String bonm = Util.checkString(req.getParameter("bonm"));      //���͸�
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));  //����ڵ�
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //�Ⱓ��������
        String frdt = Util.checkString(req.getParameter("frdt")); //������
        String todt = Util.checkString(req.getParameter("todt")); //������
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm"))); //���ڸ�
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //���ڹ�ȣ
        String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl"))); //����
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont"))); //����
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //��������Ȯ�λ���
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));  //��������ó������ (Y:ó��, N:��ó��)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));  //�����Ҹ����� �ڵ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
        String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));

        // DM Setting

        SS_MO_L_RDR_DSCTDM dm = new SS_MO_L_RDR_DSCTDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setBonm(bonm);	//���͸�
        dm.setFromtogb(fromtogb);  //�Ⱓ����
        dm.setFrdt(frdt);   //������
        dm.setTodt(todt);   //������
        dm.setRdrnm(rdrnm); //���ڸ�
        dm.setRdr_no(rdr_no); //���ڹ�ȣ
        dm.setTitl(titl); //����
        dm.setCont(cont); //����
        dm.setBocnfmyn(bocnfmyn);  //��������Ȯ�λ���
        dm.setBoprocyn(boprocyn);  //��������ó������ (Y:ó��, N:��ó��)
        dm.setAcpnpathcd(acpnpathcd);  //����ڵ�
        dm.setDscttypecd(dscttypecd);  //�����Ҹ����� �ڵ�
        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        dm.setCns_empnm(cns_empnm);
        dm.setProcpers(procpers);

        dm.print();

        SSReader11100DAO dao = new SSReader11100DAO();
		// DAO ��ü�� selectRdrDsctList ȣ��
		ds = dao.mo_selectRdrDsctList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);

    }

    /**
     * ������Ȳ-���ں���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void mo_selectRdrDsctDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{ //����Ͽ�
        SS_S_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_RDR_DSCTDM dm = new SS_S_RDR_DSCTDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSReader11100DAO dao = new SSReader11100DAO();
		// DAO ��ü�� selectRdrDsctDetail ȣ��
		ds = dao.mo_selectRdrDsctDetail(dm);
		req.setAttribute("ds", ds);

    }

}
