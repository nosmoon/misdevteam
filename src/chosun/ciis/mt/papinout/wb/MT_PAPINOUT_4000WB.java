package chosun.ciis.mt.papinout.wb;

import java.rmi.RemoteException;

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

public class MT_PAPINOUT_4000WB extends BaseWB {

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
    public void mt_papinout_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4000_MDataSet ds = null;
		
		MT_PAPINOUT_4000_MDM dm = new MT_PAPINOUT_4000_MDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
		dm.print();

		ds = (MT_PAPINOUT_4000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 공장, 제지회사, 지절시점, 지절원인(대), 지절원인(중) COMBO 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4001_MDataSet ds = null;
		
		MT_PAPINOUT_4001_MDM dm = new MT_PAPINOUT_4001_MDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (MT_PAPINOUT_4001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 제작이상건 저장, 수정, 삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4100_ADataSet ds = null;
		
		MT_PAPINOUT_4100_ADM dm = new MT_PAPINOUT_4100_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode                  = converted[0];          //구분
		String make_un_norm_occr_dt  = converted[2];          //제작이상발생일자
		String fac_clsf              = converted[3];          //공장구분
		String now_trad_cd           = converted[4];          //현상코드
		String medi_cd               = converted[5];          //매체코드
		String pj_rate               = converted[6];          //파지율
		String rela_dept             = converted[7];          //관련부서
		String caus_prd              = converted[8];          //원인대
		String caus_midl             = converted[9];          //원인중
		String caus_dtls             = converted[10];         //원인상세
		String remk                  = converted[11];         //비고
		String seq                   = converted[12];         //일련번호
		String occr_dt               = converted[13];         //발생일자

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setMake_un_norm_occr_dt(make_un_norm_occr_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setNow_trad_cd(now_trad_cd);
		dm.setMedi_cd(medi_cd);
		dm.setPj_rate(pj_rate);
		dm.setRela_dept(rela_dept);
		dm.setCaus_prd(caus_prd);
		dm.setCaus_midl(caus_midl);
		dm.setCaus_dtls(caus_dtls);
		dm.setRemk(remk);
		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);
		dm.print();

		ds = (MT_PAPINOUT_4100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 제작이상건 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4101_LDataSet ds = null;
		
		MT_PAPINOUT_4101_LDM dm = new MT_PAPINOUT_4101_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.make_un_norm_occr_dt = Util.checkString(req.getParameter("make_un_norm_occr_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPINOUT_4101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    
    /**
	 * 제작이상건 조회 - 상세조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4200_LDataSet ds = null;
		
		MT_PAPINOUT_4200_LDM dm = new MT_PAPINOUT_4200_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.make_un_norm_occr_dt_fr = Util.checkString(req.getParameter("make_un_norm_occr_dt_fr"));
		dm.make_un_norm_occr_dt_to = Util.checkString(req.getParameter("make_un_norm_occr_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.rela_dept = Util.checkString(req.getParameter("rela_dept"));
		dm.now_trad_cd = Util.checkString(req.getParameter("now_trad_cd"));
		dm.caus_prd = Util.checkString(req.getParameter("caus_prd"));
		dm.caus_midl = Util.checkString(req.getParameter("caus_midl"));
		dm.order_cd = Util.checkString(req.getParameter("order_cd"));
		dm.occr_dt_gubun = Util.checkString(req.getParameter("occr_dt_gubun"));
		dm.print();

		ds = (MT_PAPINOUT_4200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 지절입력 저장, 수정, 삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4300_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4300_ADataSet ds = null;
		
		MT_PAPINOUT_4300_ADM dm = new MT_PAPINOUT_4300_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode                   = converted[0];
		String cut_err_occr_dt        = converted[2];
		String fac_clsf               = converted[3];
		String papcmpy_cd             = converted[4];
		String cut_err_tms            = converted[5];
		String cut_err_point          = converted[6];
		String cut_err_caus_prd       = converted[7];
		String cut_err_caus_midl      = converted[8];
		String cut_err_caus_plac      = converted[9];
		String remk                   = converted[10];
		String seq                    = converted[11];
		String occr_dt                = converted[12];

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setCut_err_occr_dt(cut_err_occr_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setPapcmpy_cd(papcmpy_cd);
		dm.setCut_err_tms(cut_err_tms);
		dm.setCut_err_point(cut_err_point);
		dm.setCut_err_caus_prd(cut_err_caus_prd);
		dm.setCut_err_caus_midl(cut_err_caus_midl);
		dm.setCut_err_caus_plac(cut_err_caus_plac);
		dm.setRemk(remk);
		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);
		dm.print();

		ds = (MT_PAPINOUT_4300_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 지절입력 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4301_LDataSet ds = null;
		
		MT_PAPINOUT_4301_LDM dm = new MT_PAPINOUT_4301_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.cut_err_occr_dt = Util.checkString(req.getParameter("cut_err_occr_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPINOUT_4301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 지절조회1 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4400_LDataSet ds = null;
		
		MT_PAPINOUT_4400_LDM dm = new MT_PAPINOUT_4400_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.cut_err_occr_dt_fr = Util.checkString(req.getParameter("cut_err_occr_dt_fr"));
		dm.cut_err_occr_dt_to = Util.checkString(req.getParameter("cut_err_occr_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.cut_err_point = Util.checkString(req.getParameter("cut_err_point"));
		dm.cut_err_caus_prd = Util.checkString(req.getParameter("cut_err_caus_prd"));
		dm.order_cd = Util.checkString(req.getParameter("order_cd"));
		dm.occr_dt_gubun = Util.checkString(req.getParameter("occr_dt_gubun"));
		dm.print();

		ds = (MT_PAPINOUT_4400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 지절조회2 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_4500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4500_LDataSet ds = null;
		
		MT_PAPINOUT_4500_LDM dm = new MT_PAPINOUT_4500_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.cut_err_occr_dt_fr = Util.checkString(req.getParameter("cut_err_occr_dt_fr"));
		dm.cut_err_occr_dt_to = Util.checkString(req.getParameter("cut_err_occr_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.cut_err_point = Util.checkString(req.getParameter("cut_err_point"));
		dm.cut_err_caus_prd = Util.checkString(req.getParameter("cut_err_caus_prd"));
		dm.order_cd = Util.checkString(req.getParameter("order_cd"));
		dm.occr_dt_gubun = Util.checkString(req.getParameter("occr_dt_gubun"));
		dm.print();

		ds = (MT_PAPINOUT_4500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}