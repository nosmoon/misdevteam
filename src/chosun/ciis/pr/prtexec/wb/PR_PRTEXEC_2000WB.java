package chosun.ciis.pr.prtexec.wb;

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

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

public class PR_PRTEXEC_2000WB extends BaseWB {

	/**
	 * 멀티레코드처리 row 구분자
	 */
	public final String ROW_SEPARATOR = "|";
	/**
	 * 멀티레코드처리 column 구분자
	 */
	public final String COL_SEPARATOR = "#";


	/**
	 * 주간발행기준정보 조회
	 */
	public void pr_prtexec_2000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_2000_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_2000_LDM dm = new PR_PRTEXEC_2000_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setOccr_yymm(Util.checkString(req.getParameter("occr_yymm")));
		dm.print();
		
		ds = (PR_PRTEXEC_2000_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
	/**
	 * 광고면수단수정보 조회
	 */
	public void pr_prtexec_2001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_2001_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_2001_LDM dm = new PR_PRTEXEC_2001_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
		dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
		dm.print();
		
		ds = (PR_PRTEXEC_2001_LDataSet) manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
    	req.setAttribute("ds", ds);
	}
    
	/**
	 * 주간발행기준정보 조회
	 */
	public void pr_prtexec_2002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_2002_LDataSet ds = null;

		// DM Setting
		PR_PRTEXEC_2002_LDM dm = new PR_PRTEXEC_2002_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2002_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
	}
    
	/**
	 * 주간발행기준정보 조회
	 */
	public void pr_prtexec_2003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2003_ADataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2003_ADM dm = new PR_PRTEXEC_2003_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFrdt(Util.checkString(req.getParameter("frdt")));
   	    dm.setTodt(Util.checkString(req.getParameter("todt")));
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2003_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장별 주간발행정보 저장
     */
    public void pr_prtexec_2005(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2005_ADataSet ds = null;
    	
    	// DM Setting
    	PR_PRTEXEC_2005_ADM dm = new PR_PRTEXEC_2005_ADM();
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun				= converted[0];

		String pcnt					= converted[5];
		String clr_pcnt				= converted[7];
		String std					= converted[8];
		String add_prt_seq			= converted[9];
		String prt_dt				= converted[10];
		String prt_tm				= converted[11];
		String tm_in_yn				= converted[12];
		String dual_out_clsf		= converted[13];
		String remk					= converted[14];
		String medi_cd				= converted[15];
		String sect_cd				= converted[16];
		String occr_dt				= converted[18];
		String seq					= converted[19];
		
		dm.setMode(gubun.toUpperCase());
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
   	    dm.setOccr_yy(Util.checkString(req.getParameter("occr_yy")));
   	    dm.setOccr_seq(Util.checkString(req.getParameter("occr_seq")));
   	    dm.setOccr_dt(occr_dt);
   	    dm.setSeq(seq);
   	    dm.setMedi_cd(medi_cd);
   	    dm.setSect_cd(sect_cd);
   	    dm.setPrt_dt(prt_dt);
   	    dm.setPrt_tm(prt_tm);
   	    dm.setStd(std);
   	    dm.setTm_in_yn(tm_in_yn);
   	    dm.setAdd_prt_seq(add_prt_seq);
   	    dm.setPcnt(pcnt);
   	    dm.setClr_pcnt(clr_pcnt);
   	    dm.setDual_out_clsf(dual_out_clsf);
   	    dm.setRemk(remk);
   	    dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
   	    dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (PR_PRTEXEC_2005_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장별 주간발행정보에서 완료/완료취소
     */
    public void pr_prtexec_2006(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2006_UDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2006_UDM dm = new PR_PRTEXEC_2006_UDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
   	    dm.setEnd_clsf(Util.checkString(req.getParameter("end_clsf")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2006_UDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행기준정보에서 판촉지 삭제
     */
    public void pr_prtexec_2007(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2007_ADataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2007_ADM dm = new PR_PRTEXEC_2007_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
   	    dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
   	    dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2007_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장별 주간발행계획 진행상태 조회
     */
    public void pr_prtexec_2008(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2008_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2008_LDM dm = new PR_PRTEXEC_2008_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
   	    dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2008_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장별 주간발행계획 조회
     */
    public void pr_prtexec_2009(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2009_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2009_LDM dm = new PR_PRTEXEC_2009_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2009_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장별 주간발행계획 공통코드 조회
     */
    public void pr_prtexec_2010(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2010_LDataSet ds = null;	

    	// DM Setting
    	PR_PRTEXEC_2010_LDM dm = new PR_PRTEXEC_2010_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2010_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획 매체코드에 따른 섹션코드 조회
     */
    public void pr_prtexec_2011(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2011_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2011_LDM dm = new PR_PRTEXEC_2011_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2011_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획에 매체코드, 섹션코드 추가
     */
    public void pr_prtexec_2012(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2012_ADataSet ds = null;
    	
        // DM Setting
    	PR_PRTEXEC_2012_ADM dm = new PR_PRTEXEC_2012_ADM();
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun				= converted[0];
		String medi_cd				= converted[3];
		String sect_cd				= converted[5];
		String issu_dt				= converted[4];
		String pcnt					= converted[6];
		String clr_pcnt				= converted[7];
		
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOccr_yy(Util.checkString(req.getParameter("occr_yy")));
    	dm.setOccr_seq(Util.checkString(req.getParameter("occr_seq")));
    	dm.setGubun(gubun.toUpperCase());
    	dm.setMedi_cd(medi_cd);
    	dm.setSect_cd(sect_cd);
    	dm.setIssu_dt(issu_dt);
    	dm.setPcnt(pcnt);
    	dm.setClr_pcnt(clr_pcnt);
    	dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
        dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2012_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획에 확정여부를 업데이트
     */
    public void pr_prtexec_2013(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2013_UDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2013_UDM dm = new PR_PRTEXEC_2013_UDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOccr_yy(Util.checkString(req.getParameter("occr_yy")));
    	dm.setOccr_seq(Util.checkString(req.getParameter("occr_seq")));
    	dm.setFix_clsf(Util.checkString(req.getParameter("fix_clsf")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2013_UDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획에 광고데이터와 일치하지 않는 발행면수, 칼라면수를 일치
     */
    public void pr_prtexec_2014(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2014_UDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_2014_UDM dm = new PR_PRTEXEC_2014_UDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
        dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2014_UDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획에 매체코드, 섹션코드 추가
     */
    public void pr_prtexec_2015(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2015_ADataSet ds = null;		
        // DM Setting
    	PR_PRTEXEC_2015_ADM dm = new PR_PRTEXEC_2015_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.setSect_cd(Util.checkString(req.getParameter("sect_cd")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setPcnt(Util.checkString(req.getParameter("pcnt")));
    	dm.setClr_pcnt(Util.checkString(req.getParameter("clr_pcnt")));
    	dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
        dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2015_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획에 매체코드, 섹션코드 추가
     */
    public void pr_prtexec_2016(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_2016_ADataSet ds = null;		
        // DM Setting
    	PR_PRTEXEC_2016_ADM dm = new PR_PRTEXEC_2016_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
        dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_2016_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획 복사
     */
    public void pr_prtexec_3000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_3000_ADataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_3000_ADM dm = new PR_PRTEXEC_3000_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setSr_issu_dt_fr(Util.checkString(req.getParameter("sr_issu_dt_fr")));
    	dm.setSr_issu_dt_to(Util.checkString(req.getParameter("sr_issu_dt_to")));
    	dm.setTg_issu_dt_fr(Util.checkString(req.getParameter("tg_issu_dt_fr")));
    	dm.setTg_issu_dt_to(Util.checkString(req.getParameter("tg_issu_dt_to")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_3000_ADataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 주간발행계획을 위한 공통의 공장코드 조회
     */
    public void pr_prtexec_4000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_4000_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_4000_LDM dm = new PR_PRTEXEC_4000_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_4000_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장별 날짜별 매체별 주간발행계획정보 조회
     */
    public void pr_prtexec_4001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_4001_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_4001_LDM dm = new PR_PRTEXEC_4001_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_4001_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장의 주간발행기간 동안의 합쇄, 비합쇄 정보 조회
     */
    public void pr_prtexec_4002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_4002_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_4002_LDM dm = new PR_PRTEXEC_4002_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_4002_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * PM실의 최종 완료처리된 주간발행정보를 조회
     */
    public void pr_prtexec_4003(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_4003_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_4003_LDM dm = new PR_PRTEXEC_4003_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOccr_yymm(Util.checkString(req.getParameter("occr_yymm")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_4003_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
    
    /**
     * 공장에서 조회하는 합쇄, 비합쇄 정보 조회
     */
    public void pr_prtexec_4004(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	PR_PRTEXEC_4004_LDataSet ds = null;

        // DM Setting
    	PR_PRTEXEC_4004_LDM dm = new PR_PRTEXEC_4004_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setIssu_dt_fr(Util.checkString(req.getParameter("issu_dt_fr")));
    	dm.setIssu_dt_to(Util.checkString(req.getParameter("issu_dt_to")));
    	dm.print();
    	
    	ds = (PR_PRTEXEC_4004_LDataSet) manager.executeCall(dm);
    	
    	if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
    	
    	req.setAttribute("ds", ds);
    }
}