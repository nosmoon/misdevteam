package chosun.ciis.mt.papinout.wb;

import java.rmi.RemoteException;

import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

public class MT_PAPINOUT_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
	 * 공장, 현상, 매체, 관련부서, 원인(대), 원인(중) COMBO 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_3001(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3001_LDataSet ds = null;

		MT_PAPINOUT_3001_LDM dm = new MT_PAPINOUT_3001_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
		dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_PAPINOUT_3001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3002(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3002_LDataSet ds = null;

		MT_PAPINOUT_3002_LDM dm = new MT_PAPINOUT_3002_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();

		ds = (MT_PAPINOUT_3002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3003(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3003_LDataSet ds = null;

		MT_PAPINOUT_3003_LDM dm = new MT_PAPINOUT_3003_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();

		ds = (MT_PAPINOUT_3003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3004(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3004_DDataSet ds = null;

		MT_PAPINOUT_3004_DDM dm = new MT_PAPINOUT_3004_DDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setPers_ipaddr(req.getRemoteAddr());
		dm.print();

		ds = (MT_PAPINOUT_3004_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3005(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3005_IDataSet ds = null;

		MT_PAPINOUT_3005_IDM dm = new MT_PAPINOUT_3005_IDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setPers(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPers_ipaddr(req.getRemoteAddr());

		String multiUpdateData1 = Util.checkString(req.getParameter("mutiupdate1"));
		//System.out.println(multiUpdateData1);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData1);

    	dm.paper_clsf_head = (String)hash.get("paper_clsf_head");
    	dm.issu_pcnt_head  = (String)hash.get("issu_pcnt_head");
    	dm.slip_qty_head   = (String)hash.get("slip_qty_head");
    	dm.somo_paji_head  = (String)hash.get("somo_paji_head");
    	dm.somo_wgt_head   = (String)hash.get("somo_wgt_head");
    	dm.avgynag_head    = (String)hash.get("avgynag_head");
    	dm.medi_cd_head    = (String)hash.get("medi_cd_head");
    	dm.sect_cd_head    = (String)hash.get("sect_cd_head");
    	dm.prt_clsf_head   = (String)hash.get("prt_clsf");
    	dm.prt_dt          = (String)hash.get("prt_dt");

    	String multiUpdateData2 = Util.checkString(req.getParameter("mutiupdate2"));
		//System.out.println(multiUpdateData2);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	dm.pj_kind_dtls    = (String)hash2.get("pj_kind");
    	dm.paper_clsf_dtls = (String)hash2.get("hdqt_paper_clsf");
    	dm.medi_cd_dtls    = (String)hash2.get("medi_cd");
    	dm.sect_cd_dtls    = (String)hash2.get("sect_cd");
    	dm.m_pj_qunt_dtls  = (String)hash2.get("pj_cnt");
    	dm.m_pj_wgt_dtls   = (String)hash2.get("pj_wgt");
    	dm.prt_clsf_dtls   = (String)hash2.get("prt_clsf");
    	dm.m_pj_prt_dt_dtls   = (String)hash2.get("prt_dt");

    	dm.setGita_pj_wgt(Util.checkString(req.getParameter("gita_pj_wgt")));
    	dm.setEtc_pj_resn_cd(Util.checkString(req.getParameter("etc_pj_resn_cd")));
    	dm.setRemk(Util.checkString(req.getParameter("remk")));
    	dm.totprtwgt   =      Util.checkString(req.getParameter("totprtwgt"));
		dm.print();

		ds = (MT_PAPINOUT_3005_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3006(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3006_LDataSet ds = null;

		MT_PAPINOUT_3006_LDM dm = new MT_PAPINOUT_3006_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();

		ds = (MT_PAPINOUT_3006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3007(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3007_UDataSet ds = null;

		MT_PAPINOUT_3007_UDM dm = new MT_PAPINOUT_3007_UDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.pers_ipaddr = req.getRemoteAddr();
		dm.pers_id = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (MT_PAPINOUT_3007_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3008(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3008_LDataSet ds = null;

		MT_PAPINOUT_3008_LDM dm = new MT_PAPINOUT_3008_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();

		ds = (MT_PAPINOUT_3008_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3010(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_3010_LDataSet ds = null;

		MT_PAPINOUT_3010_LDM dm = new MT_PAPINOUT_3010_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (MT_PAPINOUT_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3012(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3012_UDataSet ds = null;

		MT_PAPINOUT_3012_UDM dm = new MT_PAPINOUT_3012_UDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setPers_ipaddr(req.getRemoteAddr());
		dm.print();

		ds = (MT_PAPINOUT_3012_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3013(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3013_UDataSet ds = null;

		MT_PAPINOUT_3013_UDM dm = new MT_PAPINOUT_3013_UDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setPers_ipaddr(req.getRemoteAddr());
		dm.print();

		ds = (MT_PAPINOUT_3013_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3014(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3014_UDataSet ds = null;

		MT_PAPINOUT_3014_UDM dm = new MT_PAPINOUT_3014_UDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setPers_ipaddr(req.getRemoteAddr());
		dm.print();

		ds = (MT_PAPINOUT_3014_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3017(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3017_LDataSet ds = null;

		MT_PAPINOUT_3017_LDM dm = new MT_PAPINOUT_3017_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.fac_clsf  = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt   = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PAPINOUT_3017_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    
    public void mt_papinout_3018(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3018_LDataSet ds = null;

		MT_PAPINOUT_3018_LDM dm = new MT_PAPINOUT_3018_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.fac_clsf  = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt   = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PAPINOUT_3018_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3100(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3100_LDataSet ds = null;

		MT_PAPINOUT_3100_LDM dm = new MT_PAPINOUT_3100_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
		dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_PAPINOUT_3100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3101(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3101_LDataSet ds = null;

		MT_PAPINOUT_3101_LDM dm = new MT_PAPINOUT_3101_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();

		ds = (MT_PAPINOUT_3101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3102(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3102_IDataSet ds = null;

		MT_PAPINOUT_3102_IDM dm = new MT_PAPINOUT_3102_IDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPers_ipaddr(req.getRemoteAddr());

		String multiUpdateData1  = Util.checkString(req.getParameter("muiltUpdate1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

		String multiUpdateData2  = Util.checkString(req.getParameter("muiltUpdate2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.coll_yn_ar = (String)hash1.get("coll_yn");
		dm.medi_cd_ar = (String)hash1.get("medi_cd");
    	dm.sect_cd_ar  = (String)hash1.get("sect_cd");
    	dm.papcmpy_cd_ar   = (String)hash1.get("papcmpy_cd");
    	dm.a_wgt_ar   = (String)hash1.get("a_wgt");
    	dm.b_wgt_ar   = (String)hash1.get("b_wgt");
    	dm.c_wgt_ar   = (String)hash1.get("c_wgt");
    	dm.a_wgt_l_ar   = (String)hash1.get("a_wgt_l");
    	dm.b_wgt_l_ar   = (String)hash1.get("b_wgt_l");
    	dm.c_wgt_l_ar   = (String)hash1.get("c_wgt_l");
    	dm.a_roll_ar   = (String)hash1.get("a_roll");
    	dm.b_roll_ar   = (String)hash1.get("b_roll");
    	dm.c_roll_ar   = (String)hash1.get("c_roll");
    	dm.prt_clsf_ar   = (String)hash1.get("prt_clsf");

    	dm.medi_cd2_ar = (String)hash2.get("medi_cd");
    	dm.sect_cd2_ar  = (String)hash2.get("sect_cd");
    	dm.papcmpy_cd2_ar   = (String)hash2.get("papcmpy_cd");
    	dm.a_wgt2_ar   = (String)hash2.get("a_wgt");
    	dm.b_wgt2_ar   = (String)hash2.get("b_wgt");
    	dm.c_wgt2_ar   = (String)hash2.get("c_wgt");
    	dm.prt_clsf2_ar   = (String)hash2.get("prt_clsf");
    	dm.occr_dt2_ar		= (String)hash2.get("occr_dt");
    	dm.seq2_ar		= (String)hash2.get("seq");
    	dm.sub_seq2_ar		= (String)hash2.get("sub_seq");
		dm.print();

		ds = (MT_PAPINOUT_3102_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papinout_3103(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPINOUT_3103_DDataSet ds = null;

		MT_PAPINOUT_3103_DDM dm = new MT_PAPINOUT_3103_DDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
		dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
		dm.print();

		ds = (MT_PAPINOUT_3103_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
}