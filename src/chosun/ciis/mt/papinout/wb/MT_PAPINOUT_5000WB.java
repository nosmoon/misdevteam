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

public class MT_PAPINOUT_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
	 * 파지종류 COMBO 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5000_MDataSet ds = null;
		
		MT_PAPINOUT_5000_MDM dm = new MT_PAPINOUT_5000_MDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (MT_PAPINOUT_5000_MDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지종류 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5100_LDataSet ds = null;
		
		MT_PAPINOUT_5100_LDM dm = new MT_PAPINOUT_5100_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (MT_PAPINOUT_5100_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지종류별 금액 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5101_LDataSet ds = null;
		
		MT_PAPINOUT_5101_LDM dm = new MT_PAPINOUT_5101_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.print();

		ds = (MT_PAPINOUT_5101_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지매각대금 저장
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5102_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5102_IDataSet ds = null;
		
		MT_PAPINOUT_5102_IDM dm = new MT_PAPINOUT_5102_IDM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode         = converted[0];		//구분
		String pj_kind      = converted[3];		//파지종류
		String pj_qunt      = converted[4];		//수량
		String pj_wgt       = converted[5];		//중량
		String uprc         = converted[6];		//단가
		String amt          = converted[7];		//금액
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.setMode(Util.checkString(mode));
		dm.setPj_kind(Util.checkString(pj_kind));
		dm.setPj_qunt(Util.checkString(pj_qunt));
		dm.setPj_wgt(Util.checkString(pj_wgt));
		dm.setUprc(Util.checkString(uprc));
		dm.setAmt(Util.checkString(amt));
		
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.cnsm_frdt = Util.checkString(req.getParameter("cnsm_frdt"));
		dm.cnsm_todt = Util.checkString(req.getParameter("cnsm_todt"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.acct_no = Util.checkString(req.getParameter("rcpm_dt2"));
		dm.rcpm_nm = Util.checkString(req.getParameter("rcpm_nm"));
		dm.print();

		ds = (MT_PAPINOUT_5102_IDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지매각 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5103_LDataSet ds = null;
		
		MT_PAPINOUT_5103_LDM dm = new MT_PAPINOUT_5103_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_no"));
		dm.print();

		ds = (MT_PAPINOUT_5103_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지매각종류 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5104_LDataSet ds = null;
		
		MT_PAPINOUT_5104_LDM dm = new MT_PAPINOUT_5104_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_PAPINOUT_5104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지매각대금 수정
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5105_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5105_UDataSet ds = null;
		
		MT_PAPINOUT_5105_UDM dm = new MT_PAPINOUT_5105_UDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_PAPINOUT_5105_UDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지매각대금 삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5106_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5106_DDataSet ds = null;
		
		MT_PAPINOUT_5106_DDM dm = new MT_PAPINOUT_5106_DDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		ds = (MT_PAPINOUT_5106_DDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    /**
	 * 파지수입결의 신청
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5107_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5107_ADataSet ds = null;
		
		MT_PAPINOUT_5107_ADM dm = new MT_PAPINOUT_5107_ADM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.tax_stmt_seq = Util.checkString(req.getParameter("tax_stmt_seq"));
		dm.slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
		dm.slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
		dm.cha_amt = Util.checkString(req.getParameter("cha_amt"));
		dm.dea_amt = Util.checkString(req.getParameter("dea_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.print();

		ds = (MT_PAPINOUT_5107_ADataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 파지수입결의 취소
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5108_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5108_ADataSet ds = null;
		
		MT_PAPINOUT_5108_ADM dm = new MT_PAPINOUT_5108_ADM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
		dm.tax_stmt_seq = Util.checkString(req.getParameter("tax_stmt_seq"));
		dm.slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
		dm.print();

		ds = (MT_PAPINOUT_5108_ADataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * 파지단가관리 저장,수정,삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5200_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5200_ADataSet ds = null;
		
		MT_PAPINOUT_5200_ADM dm = new MT_PAPINOUT_5200_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode       = converted[0];	//구분
		String aply_dt    = converted[3];	//적용일자
		String pj_kind    = converted[4];	//파지종류
		String uprc       = converted[5];	//단가
		String simb_wgt   = converted[6];	//심봉중량
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setAply_dt(aply_dt);
		dm.setPj_kind(pj_kind);
		dm.setUprc(uprc);
		dm.setSimb_wgt(simb_wgt);
		dm.print();

		ds = (MT_PAPINOUT_5200_ADataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    /**
	 * 파지단가관리 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5201_LDataSet ds = null;
		
		MT_PAPINOUT_5201_LDM dm = new MT_PAPINOUT_5201_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.aply_dt_fr = Util.checkString(req.getParameter("aply_dt_fr"));
		dm.aply_dt_to = Util.checkString(req.getParameter("aply_dt_to"));
		dm.pj_kind = Util.checkString(req.getParameter("pj_kind"));
		dm.print();

		ds = (MT_PAPINOUT_5201_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    /**
	 * 파율조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5300_LDataSet ds = null;
		
		MT_PAPINOUT_5300_LDM dm = new MT_PAPINOUT_5300_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.hdqt_paper_use_yn = Util.checkString(req.getParameter("hdqt_paper_use_yn"));
		dm.issu_gubun = Util.checkString(req.getParameter("issu_gubun"));
		dm.print();

		ds = (MT_PAPINOUT_5300_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    /**
	 * 상세조회 - 동적그리드 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5400_LDataSet ds = null;
		
		MT_PAPINOUT_5400_LDM dm = new MT_PAPINOUT_5400_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (MT_PAPINOUT_5400_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    /**
	 * 상세조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papinout_5401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5401_LDataSet ds = null;
		
		MT_PAPINOUT_5401_LDM dm = new MT_PAPINOUT_5401_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.pj_kind = Util.checkString(req.getParameter("pj_kind"));
		dm.hdqt_paper_use_yn = Util.checkString(req.getParameter("hdqt_paper_use_yn"));
		dm.issu_gubun = Util.checkString(req.getParameter("issu_gubun"));
		dm.print();

		ds = (MT_PAPINOUT_5401_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}