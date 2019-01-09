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

package chosun.ciis.hd.affr.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
/**
 *
 */

public class HD_AFFR_3000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    //public final String COL_SEPARATOR = "#";

    /**
     * �߷ɰ��õ� �ڵ�
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */


	public void hd_affr_3000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3000_LDataSet ds = null;
		HD_AFFR_3000_LDM dm = new HD_AFFR_3000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_3001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3001_LDataSet ds = null;
		HD_AFFR_3001_LDM dm = new HD_AFFR_3001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_lvcmpy_dt = Util.checkString(req.getParameter("fr_lvcmpy_dt"));
		dm.to_lvcmpy_dt = Util.checkString(req.getParameter("to_lvcmpy_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		ds = (HD_AFFR_3001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_3002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3002_ADataSet ds = null;
		HD_AFFR_3002_ADM dm = new HD_AFFR_3002_ADM();

        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ipadd  = req.getRemoteAddr();
        String mode = (String)hash.get("m");

        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setSs_emp_no(ss_emp_no);
        dm.setCmpy_cd(cmpy_cd);

        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.occr_dt = (String)hash.get("occr_dt");
        dm.seq = (String)hash.get("seq");
        dm.flnm = (String)hash.get("flnm");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.dty_cd = (String)hash.get("dty_cd");
        dm.posi_cd = (String)hash.get("posi_cd");
        dm.zip_1 = (String)hash.get("zip_1");
        dm.zip_2 = (String)hash.get("zip_2");
        dm.addr = (String)hash.get("addr");
        dm.dtls_addr = (String)hash.get("dtls_addr");
        dm.tel_no = (String)hash.get("tel_no");
        dm.ptph_no = (String)hash.get("ptph_no");
        dm.cur_dty_nm = (String)hash.get("cur_dty_nm");

		dm.print();

		ds = (HD_AFFR_3002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_3100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3100_LDataSet ds = null;
		HD_AFFR_3100_LDM dm = new HD_AFFR_3100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_3101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3101_ADataSet ds = null;
		HD_AFFR_3101_ADM dm = new HD_AFFR_3101_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		String mode 				  =	converted[0];
		String occr_dt 				  = converted[6];
		String seq					  = converted[7];
		String frdt 				  = converted[4];
		String todt 			      = converted[5];
		String sply_clsf_cd	          = converted[2];
		String obcl_child_sply_amt 	  = converted[3];

		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setSply_clsf_cd(sply_clsf_cd);
		dm.setObcl_child_sply_amt(obcl_child_sply_amt);
		dm.print();

		ds = (HD_AFFR_3101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}



	public void hd_affr_3102(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3102_LDataSet ds = null;
		HD_AFFR_3102_LDM dm = new HD_AFFR_3102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_3200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3200_LDataSet ds = null;
		HD_AFFR_3200_LDM dm = new HD_AFFR_3200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3201(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3201_ADataSet ds = null;
		HD_AFFR_3201_ADM dm = new HD_AFFR_3201_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.sply_clsf_cd = (String)hash.get("sply_clsf_cd");
		dm.aply_basi_dt = (String)hash.get("aply_basi_dt");
		dm.hospz_med_exam_fee = (String)hash.get("hospz_med_exam_fee");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_AFFR_3201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_3202(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3202_LDataSet ds = null;
		HD_AFFR_3202_LDM dm = new HD_AFFR_3202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_3300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3300_LDataSet ds = null;
		HD_AFFR_3300_LDM dm = new HD_AFFR_3300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3301_ADataSet ds = null;
		HD_AFFR_3301_ADM dm = new HD_AFFR_3301_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.sply_clsf_cd = (String)hash.get("sply_clsf_cd");
		dm.aply_basi_dt = (String)hash.get("aply_basi_dt");
		dm.hlth_chk_fee = (String)hash.get("hlth_chk_fee");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_3301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	/*****
	public void hd_affr_3301(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_AFFR_3301_ADataSet ds = null;
		HD_AFFR_3301_ADM dm = new HD_AFFR_3301_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		String mode 				  =	converted[0];
		String occr_dt 				  = converted[6];
		String seq					  = converted[7];
		String aply_basi_dt 		  = converted[4];
		String sply_clsf_cd	          = converted[2];
		String hlth_chk_fee 	  	  = converted[3];

		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setAply_basi_dt(aply_basi_dt);
		dm.setSply_clsf_cd(sply_clsf_cd);
		dm.setHlth_chk_fee(hlth_chk_fee);

		dm.print();

		try {
			HD_AFFR_3000EJBHome home = (HD_AFFR_3000EJBHome)JNDIManager.getInstance().getHome("HD_AFFR_3000EJB");
			HD_AFFR_3000EJB ejb = home.create();

			ds = ejb.getHd_affr_3301(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.sply_clsf_cd = (String)hash.get("sply_clsf_cd");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.hlth_chk_fee = (String)hash.get("hlth_chk_fee");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.ss_emp_no = (String)hash.get("ss_emp_no");
		

		
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.sply_clsf_cd = Util.getSessionParameterValue(req,"sply_clsf_cd",true);
		dm.frdt = Util.getSessionParameterValue(req,"frdt",true);
		dm.todt = Util.getSessionParameterValue(req,"todt",true);
		dm.hlth_chk_fee = Util.getSessionParameterValue(req,"hlth_chk_fee",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.ss_emp_no = Util.getSessionParameterValue(req,"ss_emp_no",true);
		
	}
    *****/
    
	public void hd_affr_3302(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3302_LDataSet ds = null;
		HD_AFFR_3302_LDM dm = new HD_AFFR_3302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_3003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3003_LDataSet ds = null;
		HD_AFFR_3003_LDM dm = new HD_AFFR_3003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_3003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_3501_LDataSet ds = null;
		HD_AFFR_3501_LDM dm = new HD_AFFR_3501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.sch_yyyy = Util.checkString(req.getParameter("sch_yyyy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
		dm.sch_clsf = Util.checkString(req.getParameter("sch_clsf"));

		dm.print();

		ds = (HD_AFFR_3501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_3502_LDataSet ds = null;
		HD_AFFR_3502_LDM dm = new HD_AFFR_3502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.sch_yyyy = Util.checkString(req.getParameter("sch_yyyy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
		dm.sch_clsf = Util.checkString(req.getParameter("sch_clsf"));

		dm.print();

		ds = (HD_AFFR_3502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_3503_LDataSet ds = null;
		HD_AFFR_3503_LDM dm = new HD_AFFR_3503_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.sch_yyyy = Util.checkString(req.getParameter("sch_yyyy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
		dm.sch_clsf = Util.checkString(req.getParameter("sch_clsf"));

		dm.print();

		ds = (HD_AFFR_3503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//��ü��������ް���-������޺�_20150630
	public void hd_affr_3700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3700_MDataSet ds = null;
		HD_AFFR_3700_MDM dm = new HD_AFFR_3700_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (HD_AFFR_3700_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//�ѹ�����-��ü��������ް���-����/����/����_20150630
	public void hd_affr_3710_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3710_ADataSet ds = null;
		HD_AFFR_3710_ADM dm = new HD_AFFR_3710_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase(); //���
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
		dm.emp_no = (String)hash.get("emp_no"); //���(�ؽ�)
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm")); //����⵵+�����
		dm.flnm = (String)hash.get("flnm"); //����
		dm.prn = (String)hash.get("prn"); //�ֹι�ȣ
		dm.aplc_dt = (String)hash.get("aplc_dt"); //��û����
		dm.org_cd = (String)hash.get("org_cd"); //��ü����
		dm.cmpy_insr_cd = (String)hash.get("cmpy_insr_cd"); //������ڵ� 
		dm.pay_cd = (String)hash.get("pay_cd"); //���ޱ���
		dm.pay_dt = (String)hash.get("pay_dt"); //��������
		dm.pay_amt = (String)hash.get("pay_amt"); //�����
		dm.acpn_dt = (String)hash.get("acpn_dt"); //������ȣ
		dm.remk = (String)hash.get("remk"); //���
		dm.occr_dt = (String)hash.get("occr_dt"); //�߻�����
		dm.seq = (String)hash.get("seq"); //������
		dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP �ּ�
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //�Է���
        dm.print();
		
		ds = (HD_AFFR_3710_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3720_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_3720_LDataSet ds = null;
		HD_AFFR_3720_LDM dm = new HD_AFFR_3720_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm")); //����⵵+����� 
		dm.emp_no = Util.checkString(req.getParameter("emp_no_tm"));
		dm.cmpy_insr_cd = Util.checkString(req.getParameter("cmpy_insr_cd"));
		dm.aplc_fr_dt = Util.checkString(req.getParameter("aplc_fr_dt"));
		dm.aplc_to_dt = Util.checkString(req.getParameter("aplc_to_dt"));
		dm.pay_fr_dt = Util.checkString(req.getParameter("pay_fr_dt"));
		dm.pay_to_dt = Util.checkString(req.getParameter("pay_to_dt"));
		dm.pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
		dm.lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
		dm.acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
		dm.org_clsf = Util.checkString(req.getParameter("org_clsf"));

		dm.print();

		ds = (HD_AFFR_3720_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//�ѹ�����-��ü��������ް���-���ε�����_20150630
	public void hd_affr_3711_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3711_ADataSet ds = null;
		HD_AFFR_3711_ADM dm = new HD_AFFR_3711_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase(); //���
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm")); //����⵵+�����		
		dm.up_acpn_dt = (String)hash.get("up_acpn_dt"); //������ȣ
		dm.up_flnm = (String)hash.get("up_flnm"); //����
		dm.up_prn = (String)hash.get("up_prn"); //�ֹι�ȣ
		dm.up_cmpy_insr_cd = (String)hash.get("up_cmpy_insr_cd"); //���޺����
		dm.up_pay_amt = (String)hash.get("up_pay_amt"); //�����
		dm.up_pay_dt = (String)hash.get("up_pay_dt"); //������
		dm.up_aplc_dt = (String)hash.get("up_aplc_dt"); //��û��
		dm.up_pay_cd = (String)hash.get("up_pay_cd"); //���ޱ���
		dm.up_org_cd = (String)hash.get("up_org_cd"); //��ü����
		dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP �ּ�
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //�Է���
        dm.print();
		
		ds = (HD_AFFR_3711_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//�ѹ�����-��ü��������ް���-����/�������_20150630
	public void hd_affr_3730_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3730_ADataSet ds = null;
		HD_AFFR_3730_ADM dm = new HD_AFFR_3730_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
		dm.search_yyyymm = Util.checkString(req.getParameter("search_yyyymm")); //����⵵+�����
		dm.magam_flag  = Util.checkString(req.getParameter("magam_flag")); //����,������� ������	
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //�Է���
        dm.print();
		
		ds = (HD_AFFR_3730_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg); 
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3800_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3800_ADataSet ds = null;
		HD_AFFR_3800_ADM dm = new HD_AFFR_3800_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		String mode = (String)hash.get("m");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //�Է���
        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.aplc_dt = (String)hash.get("aplc_dt");
        dm.acq_pers = (String)hash.get("acq_pers");
        dm.start_plac = (String)hash.get("start_plac");
        dm.ariv_plac = (String)hash.get("ariv_plac");
        dm.use_purp = (String)hash.get("use_purp");
        dm.cont_item = (String)hash.get("cont_item");
        dm.remk = (String)hash.get("remk");
        dm.aplc_cnfm_yn = (String)hash.get("aplc_cnfm_yn");
        
        
        dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP �ּ�
        dm.print();
		
		ds = (HD_AFFR_3800_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg); 
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3901_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3901_ADataSet ds = null;
		HD_AFFR_3901_ADM dm = new HD_AFFR_3901_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		String mode = (String)hash.get("m");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //�Է���
        dm.mode = mode.toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.aplc_dt = (String)hash.get("aplc_dt");
        dm.acq_pers = (String)hash.get("acq_pers");
        dm.start_plac = (String)hash.get("start_plac");
        dm.ariv_plac = (String)hash.get("ariv_plac");
        dm.use_purp = (String)hash.get("use_purp");
        dm.cont_item = (String)hash.get("cont_item");
        dm.remk = (String)hash.get("remk");
        dm.aplc_cnfm_yn = (String)hash.get("aplc_cnfm_yn");
        dm.seq	= (String)hash.get("seq");
        dm.occr_dt = (String)hash.get("occr_dt");
        
        dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP �ּ�
        dm.print();
		
		ds = (HD_AFFR_3901_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg); 
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3902(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3902_LDataSet ds = null;
		HD_AFFR_3902_LDM dm = new HD_AFFR_3902_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.fr_aplc_dt = Util.checkString(req.getParameter("fr_aplc_dt"));
		dm.to_aplc_dt = Util.checkString(req.getParameter("to_aplc_dt"));
		dm.aplc_cnfm_yn = Util.checkString(req.getParameter("aplc_cnfm_yn"));

		dm.print();

		ds = (HD_AFFR_3902_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_3903(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_3903_LDataSet ds = null;
		HD_AFFR_3903_LDM dm = new HD_AFFR_3903_LDM();
		String chkEmp,chkFlnm;

		chkEmp = Util.checkString(req.getParameter("emp_no"));
		chkFlnm = Util.checkString(req.getParameter("flnm"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("grid_emp_no"));
		dm.flnm = Util.checkString(req.getParameter("grid_flnm"));
		dm.print();

		ds = (HD_AFFR_3903_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}
