/***************************************************************************************************
* 파일명		: HD_EVLU_1000WB.java
* 기능		: 인사시스템 평가자 관리를 위한 Work Bean
 * 작성일자	: 
 * 작성자	: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	:
* 수정자		:
* 수정일자	:
* 백업		:
***************************************************************************************************/

package chosun.ciis.hd.evlu.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.hd.affr.ds.HD_AFFR_2010_LDataSet;
import chosun.ciis.hd.affr.ds.HD_AFFR_2011_LDataSet;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */
public class HD_EVLU_1000WB extends BaseWB {
	
	public void hd_evlu_9999_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_9999_SDataSet ds = null;
		HD_EVLU_9999_SDM dm = new HD_EVLU_9999_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EVLU_9999_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void initTahds_Evlubasi(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1000_MDataSet ds = null;
    	HD_EVLU_1000_MDM dm = new HD_EVLU_1000_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

		ds = (HD_EVLU_1000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evlubasi(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1002_ADataSet ds = null;
    	HD_EVLU_1002_ADM dm = new HD_EVLU_1002_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_yy			= (String)hash.get("evlu_yy");
        String tms_clsf			= (String)hash.get("tms_clsf");
        String evlu_obj_bgn_dd	= (String)hash.get("evlu_obj_bgn_dd");
        String evlu_obj_end_dd	= (String)hash.get("evlu_obj_end_dd");
        String evlu_excl_dd		= (String)hash.get("evlu_excl_dd");
        String evlu_excl_daycnt	= (String)hash.get("evlu_excl_daycnt");
        String remk				= (String)hash.get("remk");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_obj_bgn_dd(evlu_obj_bgn_dd);
        dm.setEvlu_obj_end_dd(evlu_obj_end_dd);
        dm.setEvlu_excl_dd(evlu_excl_dd);
        dm.setEvlu_excl_daycnt(evlu_excl_daycnt);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlubasi(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1001_LDataSet ds = null;
        HD_EVLU_1001_LDM dm = new HD_EVLU_1001_LDM();
        
        //세션정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String search_dt_fr		= Util.checkString(req.getParameter("search_dt_fr"));
        String search_dt_to		= Util.checkString(req.getParameter("search_dt_to"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setSearch_dt_fr(search_dt_fr);
        dm.setSearch_dt_to(search_dt_to);

		ds = (HD_EVLU_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlusche(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1003_LDataSet ds = null;
        HD_EVLU_1003_LDM dm = new HD_EVLU_1003_LDM();
        
        //세션정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy		= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf		= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Evlusche(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1004_ADataSet ds = null;
    	HD_EVLU_1004_ADM dm = new HD_EVLU_1004_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_yy			= (String)hash.get("evlu_yy");
        String tms_clsf			= (String)hash.get("tms_clsf");
        String evlu_step_clsf	= (String)hash.get("evlu_step_clsf");
        String frdt				= (String)hash.get("frdt");
        String todt				= (String)hash.get("todt");
        String remk				= (String)hash.get("remk");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_step_clsf(evlu_step_clsf);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void initTahds_Evlubasiitem(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_1100_MDataSet ds = null;
		HD_EVLU_1100_MDM dm = new HD_EVLU_1100_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void getListTahds_Evlubasiitem(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1101_LDataSet ds = null;
        HD_EVLU_1101_LDM dm = new HD_EVLU_1101_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Evlubasiitem(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1102_ADataSet ds = null;
    	HD_EVLU_1102_ADM dm = new HD_EVLU_1102_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy			= (String)Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= (String)Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String dtls_item_cd		= (String)hash.get("dtls_item_cd");
        String remk				= (String)hash.get("remk");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setDtls_item_cd(dtls_item_cd);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void copyTahds_Evlubasiitem(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1103_ADataSet ds = null;
    	HD_EVLU_1103_ADM dm = new HD_EVLU_1103_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy_src		= Util.checkString(req.getParameter("evlu_yy_src"));
        String tms_clsf_src		= Util.checkString(req.getParameter("tms_clsf_src"));
        String evlu_yy_dest		= Util.checkString(req.getParameter("evlu_yy_dest"));
        String tms_clsf_dest	= Util.checkString(req.getParameter("tms_clsf_dest"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy_src(evlu_yy_src);
        dm.setTms_clsf_src(tms_clsf_src);
        dm.setEvlu_yy_dest(evlu_yy_dest);
        dm.setTms_clsf_dest(tms_clsf_dest);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evlugrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1200_MDataSet ds = null;
    	HD_EVLU_1200_MDM dm = new HD_EVLU_1200_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        
        System.out.println("===============================");
        System.out.println("evlu_yy" + evlu_yy);
        System.out.println("tms_clsf" + tms_clsf);
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1200_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1201_LDataSet ds = null;
        HD_EVLU_1201_LDM dm = new HD_EVLU_1201_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd	= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));
        String evlu_grp_cd_2tms	= Util.checkString(req.getParameter("evlu_grp_cd_2tms"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        dm.setEvlu_grp_cd_2tms(evlu_grp_cd_2tms);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Evlugrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1202_ADataSet ds = null;
    	HD_EVLU_1202_ADM dm = new HD_EVLU_1202_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_grp_cd		= (String)hash.get("evlu_grp_cd");
        String evlu_grp_nm		= (String)hash.get("evlu_grp_nm");
        String evlu_lcls_grp_cd		= (String)hash.get("evlu_lcls_grp_cd");
        String evlu_grp_cd_2tms		= (String)hash.get("evlu_grp_cd_2tms");
        String asst_clsf		= (String)hash.get("asst_clsf");
        String spcl_plus_point	= (String)hash.get("spcl_plus_point");
        String spcl_minus_point	= (String)hash.get("spcl_minus_point");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setEvlu_grp_nm(evlu_grp_nm);
        dm.setEvlu_grp_cd_2tms(evlu_grp_cd_2tms);
        dm.setAsst_clsf(asst_clsf);
        dm.setSpcl_plus_point(spcl_plus_point);
        dm.setSpcl_minus_point(spcl_minus_point);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void initTahds_Evlupart(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1300_MDataSet ds = null;
    	HD_EVLU_1300_MDM dm = new HD_EVLU_1300_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1300_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlupart(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1301_LDataSet ds = null;
        HD_EVLU_1301_LDM dm = new HD_EVLU_1301_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evlupart(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1302_ADataSet ds = null;
    	HD_EVLU_1302_ADM dm = new HD_EVLU_1302_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_part_cd	= (String)hash.get("evlu_part_cd");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_part_cd(evlu_part_cd);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Evlugrprflratio(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1402_ADataSet ds = null;
    	HD_EVLU_1402_ADM dm = new HD_EVLU_1402_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String evlu_lcls_grp_cd	= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_grp_cd		= (String)hash.get("evlu_grp_cd");
        String ratio_10			= (String)hash.get("ratio_10");
        String ratio_20			= (String)hash.get("ratio_20");
        String ratio_30			= (String)hash.get("ratio_30");
        String ratio_40			= (String)hash.get("ratio_40");
        String ratio_50			= (String)hash.get("ratio_50");
        String ratio_60			= (String)hash.get("ratio_60");
        String asst_clsf		= (String)hash.get("asst_clsf");
        String spcl_plus_point	= (String)hash.get("spcl_plus_point");
        String spcl_minus_point = (String)hash.get("spcl_minus_point");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setRatio_10(ratio_10);
        dm.setRatio_20(ratio_20);
        dm.setRatio_30(ratio_30);
        dm.setRatio_40(ratio_40);
        dm.setRatio_50(ratio_50);
        dm.setRatio_60(ratio_60);
        dm.setAsst_clsf(asst_clsf);
        dm.setSpcl_plus_point(spcl_plus_point);
        dm.setSpcl_minus_point(spcl_minus_point);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evlugrprflratio(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1400_MDataSet ds = null;
    	HD_EVLU_1400_MDM dm = new HD_EVLU_1400_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1400_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugrprflratio(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1401_LDataSet ds = null;
        HD_EVLU_1401_LDM dm = new HD_EVLU_1401_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd	= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evluindx(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1500_MDataSet ds = null;
    	HD_EVLU_1500_MDM dm = new HD_EVLU_1500_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1500_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlupart2(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1501_LDataSet ds = null;
        HD_EVLU_1501_LDM dm = new HD_EVLU_1501_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evluindx(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1502_LDataSet ds = null;
        HD_EVLU_1502_LDM dm = new HD_EVLU_1502_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_part_cd		= Util.checkString(req.getParameter("evlu_part_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_part_cd(evlu_part_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evluindx(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1503_ADataSet ds = null;
    	HD_EVLU_1503_ADM dm = new HD_EVLU_1503_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String evlu_part_cd		= Util.checkString(req.getParameter("evlu_part_cd"));
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_indx_cd		= (String)hash.get("evlu_indx_cd");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_part_cd(evlu_part_cd);
        dm.setEvlu_indx_cd(evlu_indx_cd);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1503_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Actindx(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1504_LDataSet ds = null;
        HD_EVLU_1504_LDM dm = new HD_EVLU_1504_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_part_cd			= Util.checkString(req.getParameter("evlu_part_cd"));
        String evlu_indx_cd			= Util.checkString(req.getParameter("evlu_indx_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_part_cd(evlu_part_cd);
        dm.setEvlu_indx_cd(evlu_indx_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1504_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Actindx(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1505_ADataSet ds = null;
    	HD_EVLU_1505_ADM dm = new HD_EVLU_1505_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_part_cd			= Util.checkString(req.getParameter("evlu_part_cd"));
        String evlu_indx_cd			= Util.checkString(req.getParameter("evlu_indx_cd"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String act_indx_cd			= (String)hash.get("act_indx_cd");
        String act_indx_def			= (String)hash.get("act_indx_def");
        String flag					= (String)hash.get("m");
        String gub_note				= (String)hash.get("gub_note");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_part_cd(evlu_part_cd);
        dm.setEvlu_indx_cd(evlu_indx_cd);
        dm.setAct_indx_cd(act_indx_cd);
        dm.setAct_indx_def(act_indx_def);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        dm.setGub_note(gub_note);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1505_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evlugrpdeptmbrmap(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1600_MDataSet ds = null;
    	HD_EVLU_1600_MDM dm = new HD_EVLU_1600_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1600_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugrpcombo(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1601_LDataSet ds = null;
        HD_EVLU_1601_LDM dm = new HD_EVLU_1601_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugrpdeptmbrmapnon(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1603_LDataSet ds = null;
        HD_EVLU_1603_LDM dm = new HD_EVLU_1603_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_grp_cd			= Util.checkString(req.getParameter("evlu_grp_cd"));
        String dept_nos				= Util.checkString(req.getParameter("dept_nos"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setDept_nos(dept_nos);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1603_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugrpdeptmbrmap(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1604_LDataSet ds = null;
        HD_EVLU_1604_LDM dm = new HD_EVLU_1604_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_grp_cd			= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1604_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evlugrpdeptmbrmap(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1605_ADataSet ds = null;
    	HD_EVLU_1605_ADM dm = new HD_EVLU_1605_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));
        String evlu_grp_cd			= Util.checkString(req.getParameter("evlu_grp_cd"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String dept_cd				= (String)hash.get("dept_cd");
        String emp_no				= (String)hash.get("emp_no");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setDept_cd(dept_cd);
        dm.setEmp_no(emp_no);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1605_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlutotalgrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1602_LDataSet ds = null;
        HD_EVLU_1602_LDM dm = new HD_EVLU_1602_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1602_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evlugraddivnrate(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1700_MDataSet ds = null;
    	HD_EVLU_1700_MDM dm = new HD_EVLU_1700_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1700_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugraddivnrate(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1701_LDataSet ds = null;
        HD_EVLU_1701_LDM dm = new HD_EVLU_1701_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evlugraddivnrate(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1702_ADataSet ds = null;
    	HD_EVLU_1702_ADM dm = new HD_EVLU_1702_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String grad_cd				= (String)hash.get("grad_cd");
        String divn_ratio			= (String)hash.get("divn_ratio");
        String remk					= (String)hash.get("remk");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setGrad_cd(grad_cd);
        dm.setDivn_ratio(divn_ratio);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1702_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evlugrpactindxmap(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1800_MDataSet ds = null;
    	HD_EVLU_1800_MDM dm = new HD_EVLU_1800_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1800_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_EvlugrpactindxmapCombo(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1801_LDataSet ds = null;
        HD_EVLU_1801_LDM dm = new HD_EVLU_1801_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_EvlugrpactindxmapEvlugrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1802_LDataSet ds = null;
        HD_EVLU_1802_LDM dm = new HD_EVLU_1802_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1802_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_EvlugrpactindxmapActindx(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1803_LDataSet ds = null;
        HD_EVLU_1803_LDM dm = new HD_EVLU_1803_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_part_cd		= Util.checkString(req.getParameter("evlu_part_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_part_cd(evlu_part_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1803_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evlugrpactindxmap(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1804_LDataSet ds = null;
        HD_EVLU_1804_LDM dm = new HD_EVLU_1804_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1804_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evlugrpactindxmap(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1805_ADataSet ds = null;
    	HD_EVLU_1805_ADM dm = new HD_EVLU_1805_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String evlu_grp_cd			= (String)hash.get("evlu_grp_cd");
        String evlu_part_cd			= (String)hash.get("evlu_part_cd");
        String evlu_indx_cd			= (String)hash.get("evlu_indx_cd");
        String act_indx_cd			= (String)hash.get("act_indx_cd");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setEvlu_part_cd(evlu_part_cd);
        dm.setEvlu_indx_cd(evlu_indx_cd);
        dm.setAct_indx_cd(act_indx_cd);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1805_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evluitemgradsetup(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1900_MDataSet ds = null;
    	HD_EVLU_1900_MDM dm = new HD_EVLU_1900_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1900_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evluitemgradsetup(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1901_LDataSet ds = null;
        HD_EVLU_1901_LDM dm = new HD_EVLU_1901_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evluitemgradsetup(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_1902_ADataSet ds = null;
    	HD_EVLU_1902_ADM dm = new HD_EVLU_1902_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String evlu_item_grad_cd	= (String)hash.get("evlu_item_grad_cd");
        String grad_clsi_scor		= (String)hash.get("grad_clsi_scor");
        String mean					= (String)hash.get("mean");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_item_grad_cd(evlu_item_grad_cd);
        dm.setGrad_clsi_scor(grad_clsi_scor);
        dm.setMean(mean);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_1902_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Spcaddsbtbasireg(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2000_MDataSet ds = null;
    	HD_EVLU_2000_MDM dm = new HD_EVLU_2000_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void getListTahds_Spcaddsbtbasireg(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2001_LDataSet ds = null;
        HD_EVLU_2001_LDM dm = new HD_EVLU_2001_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Spcaddsbtbasireg(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2002_ADataSet ds = null;
    	HD_EVLU_2002_ADM dm = new HD_EVLU_2002_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String prz_pnsh_clsf_cd		= (String)hash.get("prz_pnsh_clsf_cd");
        String dtls_clsf_cd			= (String)hash.get("dtls_clsf_cd");
        String scor					= (String)hash.get("scor");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setPrz_pnsh_clsf_cd(prz_pnsh_clsf_cd);
        dm.setDtls_clsf_cd(dtls_clsf_cd);
        dm.setScor(scor);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void getListTahds_Evlugraddivnnops(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2101_LDataSet ds = null;
        HD_EVLU_2101_LDM dm = new HD_EVLU_2101_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Evlugraddivnnops(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2102_ADataSet ds = null;
    	HD_EVLU_2102_ADM dm = new HD_EVLU_2102_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String evlu_pers_nops		= (String)hash.get("evlu_pers_nops");
        String s_nops_1tms			= (String)hash.get("s_nops_1tms");
        String a_pls_nops_1tms      = (String)hash.get("a_pls_nops_1tms");
        String a_nops_1tms			= (String)hash.get("a_nops_1tms");
        String s_nops_2tms			= (String)hash.get("s_nops_2tms");
        String a_pls_nops_2tms      = (String)hash.get("a_pls_nops_2tms");
        String s_a_nops_2tms_sum	= (String)hash.get("s_a_nops_2tms_sum");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_nops(evlu_pers_nops);
        dm.setS_nops_1tms(s_nops_1tms);
        dm.setA_pls_nops_1tms(a_pls_nops_1tms);
        dm.setA_nops_1tms(a_nops_1tms);
        dm.setS_nops_2tms(s_nops_2tms);
        dm.setA_pls_nops_2tms(a_pls_nops_2tms);
        dm.setS_a_nops_2tms_sum(s_a_nops_2tms_sum);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Evluexclchce(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2200_MDataSet ds = null;
    	HD_EVLU_2200_MDM dm = new HD_EVLU_2200_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2200_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getTahds_Evluexcldd(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2201_SDataSet ds = null;
        HD_EVLU_2201_SDM dm = new HD_EVLU_2201_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2201_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evluexclchceappmt(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2202_LDataSet ds = null;
        HD_EVLU_2202_LDM dm = new HD_EVLU_2202_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_Evluexclchcevaca(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2203_LDataSet ds = null;
        HD_EVLU_2203_LDM dm = new HD_EVLU_2203_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evluexclchceappmt(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2204_ADataSet ds = null;
    	HD_EVLU_2204_ADM dm = new HD_EVLU_2204_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String appmt_cd				= (String)hash.get("appmt_cd");
        String remk					= (String)hash.get("remk");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setAppmt_cd(appmt_cd);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2204_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahds_Evluexclchcevaca(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2205_ADataSet ds = null;
    	HD_EVLU_2205_ADM dm = new HD_EVLU_2205_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String vaca_cd				= (String)hash.get("vaca_cd");
        String remk					= (String)hash.get("remk");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setVaca_cd(vaca_cd);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2205_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 평가제외자관리 기준일자,제외자목록,인원비율 조회
     * @param req
     * @param res
     * @throws AppException
     */
    public void getListTahdm_Evluexcl(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2301_LDataSet ds = null;
        HD_EVLU_2301_LDM dm = new HD_EVLU_2301_LDM();
        
        //세션정보
    	String cmpy_cd				= Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahdm_Evluexcl(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2302_ADataSet ds = null;
    	HD_EVLU_2302_ADM dm = new HD_EVLU_2302_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String emp_no				= (String)hash.get("emp_no");
        String dept_cd				= (String)hash.get("dept_cd");
        String fee_duty_dd			= (String)hash.get("fee_duty_dd");
        String remk					= (String)hash.get("remk");
        String flag					= (String)hash.get("m");
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setDept_cd(dept_cd);
        dm.setFee_duty_dd(fee_duty_dd);
        dm.setRemk(remk);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void batchTahdm_Evlupersnexcl(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2303_ADataSet ds = null;
    	HD_EVLU_2303_ADM dm = new HD_EVLU_2303_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2303_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahdm_Evluobj(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2400_MDataSet ds = null;
    	HD_EVLU_2400_MDM dm = new HD_EVLU_2400_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2400_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahdm_Evluobj(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2401_LDataSet ds = null;
        HD_EVLU_2401_LDM dm = new HD_EVLU_2401_LDM();
        
        //세션정보
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
   	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_grp_cd			= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahdm_Evluobj(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2402_ADataSet ds = null;
    	HD_EVLU_2402_ADM dm = new HD_EVLU_2402_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String evlu_yy				= (String)hash.get("evlu_yy");
        String tms_clsf				= (String)hash.get("tms_clsf");
        String emp_no				= (String)hash.get("emp_no");
        String evlu_grp_cd			= (String)hash.get("evlu_grp_cd");
        String dept_cd				= (String)hash.get("dept_cd");
        String emp_no1				= (String)hash.get("emp_no1");
        String emp_no2				= (String)hash.get("emp_no2");
        String emp_no3				= (String)hash.get("emp_no3");
        String flag					= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setDept_cd(dept_cd);
        dm.setEvlu_pers_emp_no_1tms(emp_no1);
        dm.setEvlu_pers_emp_no_2tms(emp_no2);
        dm.setAsst_evlu_pers_emp_no(emp_no3);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahdm_Evluobjmapping(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2403_ADataSet ds = null;
    	HD_EVLU_2403_ADM dm = new HD_EVLU_2403_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2403_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahdm_Evluobjscorupload(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2404_ADataSet ds = null;
    	HD_EVLU_2404_ADM dm = new HD_EVLU_2404_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String emp_no				= (String)hash.get("emp_no");
        String evlu_grp_cd			= (String)hash.get("evlu_grp_cd");
        String busn_rslt_scor		= (String)hash.get("busn_rslt_scor");
        String flag					= (String)hash.get("m");
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setBusn_rslt_scor(busn_rslt_scor);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2404_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void updateTahdm_Evluobjspcpnt(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2405_ADataSet ds = null;
    	HD_EVLU_2405_ADM dm = new HD_EVLU_2405_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setChg_pers(chg_pers);

        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2405_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_evlu_2451_l(HttpServletRequest req, HttpServletResponse res) throws AppException
    {
      DBManager manager = new DBManager("MISHDL");
      HD_EVLU_2451_LDataSet ds = null;
      HD_EVLU_2451_LDM dm = new HD_EVLU_2451_LDM();

      String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

      String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
      String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
      String emp_no = Util.checkString(req.getParameter("emp_no"));

      dm.setCmpy_cd(cmpy_cd);
      dm.setEvlu_yy(evlu_yy);
      dm.setTms_clsf(tms_clsf);
      dm.setEmp_no(emp_no);

      System.out.println("===============================");
      dm.print();
      System.out.println("===============================");

      ds = (HD_EVLU_2451_LDataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }

    public void hd_evlu_2452_l(HttpServletRequest req, HttpServletResponse res) throws AppException
    {
      DBManager manager = new DBManager("MISHDL");
      HD_EVLU_2452_LDataSet ds = null;
      HD_EVLU_2452_LDM dm = new HD_EVLU_2452_LDM();

      String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

      String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
      String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
      String emp_no = Util.checkString(req.getParameter("emp_no"));

      dm.setCmpy_cd(cmpy_cd);
      dm.setEvlu_yy(evlu_yy);
      dm.setTms_clsf(tms_clsf);
      dm.setEmp_no(emp_no);

      System.out.println("===============================");
      dm.print();
      System.out.println("===============================");

      ds = (HD_EVLU_2452_LDataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }

    public void hd_evlu_2453_a(HttpServletRequest req, HttpServletResponse res)
      throws AppException
    {
      DBManager manager = new DBManager("MISHDL");
      HD_EVLU_2453_ADataSet ds = null;
      HD_EVLU_2453_ADM dm = new HD_EVLU_2453_ADM();

      String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      String incmg_pers_ipadd = req.getRemoteAddr();
      String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
      String chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

      String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
      String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
      String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
      Hashtable hash = getHashMultiUpdateData(multiUpDate);
      String emp_no = (String)hash.get("emp_no");
      String prz_pnsh_cd = (String)hash.get("prz_pnsh_cd");
      String prz_pnsh_nm = (String)hash.get("prz_pnsh_nm");
      String case_nm = (String)hash.get("case_nm");
      String point = (String)hash.get("point");

      dm.setCmpy_cd(cmpy_cd);
      dm.setEvlu_yy(evlu_yy);
      dm.setTms_clsf(tms_clsf);
      dm.setEmp_no(emp_no);
      dm.setPrz_pnsh_cd(prz_pnsh_cd);
      dm.setPrz_pnsh_nm(prz_pnsh_nm);
      dm.setCase_nm(case_nm);
      dm.setPoint(point);
      dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
      dm.setIncmg_pers(incmg_pers);
      dm.setChg_pers(chg_pers);

      System.out.println("===============================");
      dm.print();
      System.out.println("===============================");

      ds = (HD_EVLU_2453_ADataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }
    
    public void initTahdm_PgmregEvlupers(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2500_MDataSet ds = null;
    	HD_EVLU_2500_MDM dm = new HD_EVLU_2500_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2500_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahdm_PgmregEvlupers(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2501_LDataSet ds = null;
        HD_EVLU_2501_LDM dm = new HD_EVLU_2501_LDM();
        
        //세션정보
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String sel_pgm_id			= Util.checkString(req.getParameter("sel_pgm_id"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setSel_pgm_id(sel_pgm_id);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void insertTahdm_Prsnannc(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2502_IDataSet ds = null;
    	HD_EVLU_2502_IDM dm = new HD_EVLU_2502_IDM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String emp_no				= (String)hash.get("emp_no");
        String nm_korn				= (String)hash.get("nm_korn");
        String dept_cd				= (String)hash.get("dept_cd");
        String dty_cd				= (String)hash.get("dty_cd");
        String posi_cd				= (String)hash.get("posi_cd");
        String flag					= (String)hash.get("m");
        String pgm_id				= Util.checkString(req.getParameter("pgm_id"));
        String pgm_nm				= Util.checkString(req.getParameter("pgm_nm"));
        String pgm_url				= Util.checkString(req.getParameter("pgm_url"));
        String job_clsf				= Util.checkString(req.getParameter("job_clsf"));
        String annc_frdt			= Util.checkString(req.getParameter("annc_frdt"));
        String annc_todt			= Util.checkString(req.getParameter("annc_todt"));
        String annc_clsf			= Util.checkString(req.getParameter("annc_clsf"));
        String annc_cont			= Util.checkString(req.getParameter("annc_cont"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEmp_no(emp_no);
        dm.setNm_korn(nm_korn);
        dm.setDept_cd(dept_cd);
        dm.setDty_cd(dty_cd);
        dm.setPosi_cd(posi_cd);
        dm.setPgm_id(pgm_id);
        dm.setPgm_nm(pgm_nm);
        dm.setPgm_url(pgm_url);
        dm.setJob_clsf(job_clsf);
        dm.setAnnc_frdt(annc_frdt);
        dm.setAnnc_todt(annc_todt);
        dm.setAnnc_clsf(annc_clsf);
        dm.setAnnc_cont(annc_cont);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2502_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    /**
     * 피평가자 자기평가 초기화면 (EP포탈용)
     * @param req
     * @param res
     * @throws AppException
     */
    public void initTahds_Tgtevlupersevlu(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2600_SDataSet ds = null;
    	HD_EVLU_2600_SDM dm = new HD_EVLU_2600_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String emp_no           =  "";
    
    	 
    	if( Util.checkString(req.getParameter("emp_no")).equals(null) || Util.checkString(req.getParameter("emp_no")).equals("") )
    	{
        	 emp_no			= Util.getSessionParameterValue(req,"emp_no",true);  		
    	}
    	else 
    	{
    		 emp_no           = Util.checkString(req.getParameter("emp_no"));
    	}
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2600_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void accessTahdd_Evluindxachvdesc(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2601_ADataSet ds = null;
    	HD_EVLU_2601_ADM dm = new HD_EVLU_2601_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String emp_no			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	//String emp_no			= Util.checkString(req.getParameter("emp_no"));
    	String slf_achv_desc1	= Util.checkString(req.getParameter("slf_achv_desc1"));
    	String slf_achv_desc2	= Util.checkString(req.getParameter("slf_achv_desc2"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setSlf_achv_desc1(slf_achv_desc1);
        dm.setSlf_achv_desc2(slf_achv_desc2);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2601_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void updateTahds_Selfevluprocstat(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2602_UDataSet ds = null;
    	HD_EVLU_2602_UDM dm = new HD_EVLU_2602_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
        String emp_no			= Util.getSessionParameterValue(req,"emp_no",true);
        
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String slf_achv_desc1	= Util.checkString(req.getParameter("slf_achv_desc1"));
    	String slf_achv_desc2	= Util.checkString(req.getParameter("slf_achv_desc2"));
        String self_evlu_proc_stat	= Util.checkString(req.getParameter("self_evlu_proc_stat"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setSlf_achv_desc1(slf_achv_desc1);
        dm.setSlf_achv_desc2(slf_achv_desc2);
        dm.setSelf_evlu_proc_stat(self_evlu_proc_stat);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setChg_pers(chg_pers);
        
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2602_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void initTahds_Prevevluindxachvdesc(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2700_SDataSet ds = null;
    	HD_EVLU_2700_SDM dm = new HD_EVLU_2700_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String emp_no			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2700_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 개인별 특별가감내역 보기(POPUP)
    public void accessTahds_SpcaddsbtbasiregPop(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2801_LDataSet ds = null;
    	HD_EVLU_2801_LDM dm = new HD_EVLU_2801_LDM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 보조평가자 평가하기 초기화면
    public void initTahdm_Asstevlupersevlu(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2900_MDataSet ds = null;
    	HD_EVLU_2900_MDM dm = new HD_EVLU_2900_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2900_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 보조평가자 평가하기 목록조회
    public void getListTahdm_Asstevlupersevlu(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2901_LDataSet ds = null;
        HD_EVLU_2901_LDM dm = new HD_EVLU_2901_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        String asst_evlu_pers_emp_no 	= Util.getSessionParameterValue(req,"emp_no",true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setAsst_evlu_pers_emp_no(asst_evlu_pers_emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 보조평가자 평가하기 임시저장
    public void updateTahdm_Asstevlupersevlu(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2902_UDataSet ds = null;
    	HD_EVLU_2902_UDM dm = new HD_EVLU_2902_UDM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String asst_evlu_pers_emp_no = Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	String asst_evlu_proc_stat		= Util.checkString(req.getParameter("asst_evlu_proc_stat"));
    	String multiUpDate				= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash					= getHashMultiUpdateData(multiUpDate);
        String tgt_evlu_pers_emp_no		= (String)hash.get("tgt_evlu_pers_emp_no");
        String evlu_grad_cd				= (String)hash.get("evlu_grad_cd");
        String evlu_opn					= (String)hash.get("evlu_opn");
        String flag						= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setAsst_evlu_proc_stat(asst_evlu_proc_stat);
        dm.setAsst_evlu_pers_emp_no(asst_evlu_pers_emp_no);
        dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
        dm.setEvlu_grad_cd(evlu_grad_cd);
        dm.setEvlu_opn(evlu_opn);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2902_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
  //EP포탈,인사부 : 보조평가자 등록, 삭제
    public void accessTahdm_Asstevlupersevlu(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2903_ADataSet ds = null;
    	HD_EVLU_2903_ADM dm = new HD_EVLU_2903_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	String tgt_evlu_pers_emp_no		= Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
    	String multiUpDate				= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash					= getHashMultiUpdateData(multiUpDate);
        String asst_evlu_pers_emp_no	= (String)hash.get("asst_evlu_pers_emp_no");
        String flag						= (String)hash.get("m");
    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
        dm.setAsst_evlu_pers_emp_no(asst_evlu_pers_emp_no);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2903_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 보조평가자 평가하기 제출
    public void updateTahdm_AsstevlupersevluDone(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_2904_UDataSet ds = null;
    	HD_EVLU_2904_UDM dm = new HD_EVLU_2904_UDM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String asst_evlu_pers_emp_no = Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	String asst_evlu_proc_stat		= Util.checkString(req.getParameter("asst_evlu_proc_stat"));
    	String multiUpDate				= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash					= getHashMultiUpdateData(multiUpDate);
        String tgt_evlu_pers_emp_no		= (String)hash.get("tgt_evlu_pers_emp_no");
        String evlu_grad_cd				= (String)hash.get("evlu_grad_cd");
        String evlu_opn					= (String)hash.get("evlu_opn");
        String flag						= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setAsst_evlu_pers_emp_no(asst_evlu_pers_emp_no);
        dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
        dm.setEvlu_grad_cd(evlu_grad_cd);
        dm.setEvlu_opn(evlu_opn);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2904_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 보조평가자 평가하기 초기화면(조선일보용) 
    public void HD_EVLU_2905_L(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_2905_LDataSet ds = null;
		HD_EVLU_2905_LDM dm = new HD_EVLU_2905_LDM();
        
    	//session 정보
    	
    	dm.cmpy_cd          	= Util.getSessionParameterValue(req,"cmpycd",true);
        dm.evlu_yy				= Util.checkString(req.getParameter("evlu_yy")); 
        dm.tms_clsf         	= Util.checkString(req.getParameter("tms_clsf"));
        dm.emp_no           	= Util.checkString(req.getParameter("emp_no"));
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_2905_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    /**
     * 보조평가자 피평가자 자기평가조회 (EP포탈용)
     * @param req
     * @param res
     * @throws AppException
     */
    public void initTahds_TgtevlupersevluPop(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3000_SDataSet ds = null;
    	HD_EVLU_3000_SDM dm = new HD_EVLU_3000_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3000_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자  평가화면 초기화면
    public void initTahdm_Evlupersgrpper1tms(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3100_MDataSet ds = null;
    	HD_EVLU_3100_MDM dm = new HD_EVLU_3100_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

//        System.out.println("===============================");
        dm.print();
//        System.out.println("===============================");

		ds = (HD_EVLU_3100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 피평가자 그룹목록 조회
    public void getListTahdm_Evlupersgrpper1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3101_LDataSet ds = null;
        HD_EVLU_3101_LDM dm = new HD_EVLU_3101_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자평가화면 그룹별 피평가자 목록 조회(tv조선용)  
    public void hd_evlu_3102_500_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3102_500_LDataSet ds = null;
        HD_EVLU_3102_500_LDM dm = new HD_EVLU_3102_500_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
        String evlu_grp_cd				= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3102_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자평가화면 그룹별 피평가자 목록 조회
    public void getListTahdm_Evluobjgrpper1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3102_LDataSet ds = null;
        HD_EVLU_3102_LDM dm = new HD_EVLU_3102_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
        String evlu_grp_cd				= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 피평가자 자기평가보기(3000과동일)
    public void getTahds_Tgtevlupersevluper1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3103_SDataSet ds = null;
    	HD_EVLU_3103_SDM dm = new HD_EVLU_3103_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3103_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    

    //EP포탈 : 1차평가자 평가화면 피평가자 자기평가보기(3000과동일)(TV조선용) 
    public void hd_evlu_3103_500_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3103_500_SDataSet ds = null;
    	HD_EVLU_3103_500_SDM dm = new HD_EVLU_3103_500_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3103_500_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 1차평가자 평가화면 임시저장
    public void updateTahds_Evluobjevlugradper1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3104_UDataSet ds = null;
    	HD_EVLU_3104_UDM dm = new HD_EVLU_3104_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
    	String emp_no					= Util.checkString(req.getParameter("emp_no"));
    	String busn_rslt_scor			= Util.checkString(req.getParameter("busn_rslt_scor"));
    	String evlu_part_cd1			= Util.checkString(req.getParameter("evlu_part_cd1"));
    	String evlu_part_cd2			= Util.checkString(req.getParameter("evlu_part_cd2"));
    	String evlu_part_cd3			= Util.checkString(req.getParameter("evlu_part_cd3"));
    	String evlu_part_cd4			= Util.checkString(req.getParameter("evlu_part_cd4"));
    	String evlu_part_cd5			= Util.checkString(req.getParameter("evlu_part_cd5"));
    	String evlu_cmpt_opn_1tms		= Util.checkString(req.getParameter("evlu_cmpt_opn_1tms"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEmp_no(emp_no);
        dm.setBusn_rslt_scor(busn_rslt_scor);
        dm.setEvlu_part_cd1(evlu_part_cd1);
        dm.setEvlu_part_cd2(evlu_part_cd2);
        dm.setEvlu_part_cd3(evlu_part_cd3);
        dm.setEvlu_part_cd4(evlu_part_cd4);
        dm.setEvlu_part_cd5(evlu_part_cd5);
        dm.setEvlu_cmpt_opn_1tms(evlu_cmpt_opn_1tms);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3104_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 1차평가자 평가화면 임시저장(tv조선용) 
    public void hd_evlu_3104_500_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3104_500_UDataSet ds = null;
    	HD_EVLU_3104_500_UDM dm = new HD_EVLU_3104_500_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
    	String emp_no					= Util.checkString(req.getParameter("emp_no"));
    	String busn_rslt_scor			= Util.checkString(req.getParameter("busn_rslt_scor"));
    	String evlu_part_cd1			= Util.checkString(req.getParameter("evlu_part_cd1"));
    	String evlu_part_cd2			= Util.checkString(req.getParameter("evlu_part_cd2"));
    	String evlu_part_cd3			= Util.checkString(req.getParameter("evlu_part_cd3"));
    	String evlu_part_cd4			= Util.checkString(req.getParameter("evlu_part_cd4"));
    	String evlu_part_cd5			= Util.checkString(req.getParameter("evlu_part_cd5"));
    	String evlu_part_cd6			= Util.checkString(req.getParameter("evlu_part_cd6"));
    	String evlu_cmpt_opn_1tms		= Util.checkString(req.getParameter("evlu_cmpt_opn_1tms"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEmp_no(emp_no);
        dm.setBusn_rslt_scor(busn_rslt_scor);
        dm.setEvlu_part_cd1(evlu_part_cd1);
        dm.setEvlu_part_cd2(evlu_part_cd2);
        dm.setEvlu_part_cd3(evlu_part_cd3);
        dm.setEvlu_part_cd4(evlu_part_cd4);
        dm.setEvlu_part_cd5(evlu_part_cd5);
        dm.setEvlu_part_cd6(evlu_part_cd6);
        dm.setEvlu_cmpt_opn_1tms(evlu_cmpt_opn_1tms);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3104_500_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 1차평가자 평가화면 반려
    public void updateTahds_Evluobjgivingback1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3105_UDataSet ds = null;
    	HD_EVLU_3105_UDM dm = new HD_EVLU_3105_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
    	String emp_no					= Util.checkString(req.getParameter("emp_no"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEmp_no(emp_no);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3105_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 제출(평가완료)
    public void updateTahds_Evluobjdoneevlu1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3106_UDataSet ds = null;
    	HD_EVLU_3106_UDM dm = new HD_EVLU_3106_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
    	String emp_no					= Util.checkString(req.getParameter("emp_no"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEmp_no(emp_no);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3106_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 잠정등급집계
    public void updateTahds_Evluobjcaltmpgrad1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3107_UDataSet ds = null;
    	HD_EVLU_3107_UDM dm = new HD_EVLU_3107_UDM();
        
    	//session 정보
    	String cmpy_cd				 	= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_1tms 	= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
    	String evlu_grp_cd				= Util.checkString(req.getParameter("evlu_grp_cd"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3107_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 그룹평가완료
    public void updateTahds_Evluobjdoneevlugrp1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3108_UDataSet ds = null;
    	HD_EVLU_3108_UDM dm = new HD_EVLU_3108_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String evlu_pers_emp_no_1tms = Util.getSessionParameterValue(req,"emp_no",true);
     	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_1tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
    	String evlu_grp_cd				= Util.checkString(req.getParameter("evlu_grp_cd"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3108_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 > 조정건의등급 팝업 > 조정건의조회
    public void getTahds_Evluobjmedainfoper1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3201_SDataSet ds = null;
    	HD_EVLU_3201_SDM dm = new HD_EVLU_3201_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3201_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 1차평가자 평가화면 > 조정건의등급 팝업 > 조정건의등록
    public void updateTahds_Evluobjmedainfoper1tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3202_UDataSet ds = null;
    	HD_EVLU_3202_UDM dm = new HD_EVLU_3202_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));
    	String evlu_pers_meda_opn_1tms	= Util.checkString(req.getParameter("evlu_pers_meda_opn_1tms"));
    	String evlu_pers_meda_grad_1tms	= Util.checkString(req.getParameter("evlu_pers_meda_grad_1tms"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setEvlu_pers_meda_opn_1tms(evlu_pers_meda_opn_1tms);
        dm.setEvlu_pers_meda_grad_1tms(evlu_pers_meda_grad_1tms);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3202_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 2차평가자  평가화면 초기화면
    public void initTahdm_Evlupersgrpper2tms(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3300_MDataSet ds = null;
    	HD_EVLU_3300_MDM dm = new HD_EVLU_3300_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3300_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 2차평가자 평가화면 피평가자 그룹목록 조회
    public void getListTahdm_Evlupersgrpper2tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3301_LDataSet ds = null;
        HD_EVLU_3301_LDM dm = new HD_EVLU_3301_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_2tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
//  EP포탈 : 2차평가자 평가화면 피평가자 그룹목록 조회
    public void HD_EVLU_3301_100_L(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3301_100_LDataSet ds = null;
        HD_EVLU_3301_100_LDM dm = new HD_EVLU_3301_100_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_2tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3301_100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    //EP포탈 : 2차평가자평가화면 그룹별 피평가자 목록 조회
    public void hd_evlu_3302_500_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3302_500_LDataSet ds = null;
        HD_EVLU_3302_500_LDM dm = new HD_EVLU_3302_500_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_2tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));
        String evlu_grp_cd				= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3302_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 2차평가자평가화면 그룹별 피평가자 목록 조회
    public void getListTahdm_Evluobjgrpper2tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3302_LDataSet ds = null;
        HD_EVLU_3302_LDM dm = new HD_EVLU_3302_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_2tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));
        String evlu_grp_cd				= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 2차평가자 평가화면 피평가자 자기평가보기
    public void getTahds_Tgtevlupersevluper2tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3303_SDataSet ds = null;
    	HD_EVLU_3303_SDM dm = new HD_EVLU_3303_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3303_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 2차평가자 평가화면 피평가자 자기평가보기
    public void hd_evlu_3303_500_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3303_500_SDataSet ds = null;
    	HD_EVLU_3303_500_SDM dm = new HD_EVLU_3303_500_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3303_500_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //EP포탈 : 2차평가자 평가화면 그룹별 평가완료
    public void updateTahds_Evluobjdoneevlu2tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3304_UDataSet ds = null;
    	HD_EVLU_3304_UDM dm = new HD_EVLU_3304_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	String evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_pers_emp_no_2tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));
    	String evlu_grp_cd					= Util.checkString(req.getParameter("evlu_grp_cd"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3304_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_evlu_3305_l(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3305_LDataSet ds = null;
    	HD_EVLU_3305_LDM dm = new HD_EVLU_3305_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    //	String evlu_pers_emp_no_2tms     = Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));
    	String evlu_grp_cd			     = Util.checkString(req.getParameter("evlu_grp_cd"));
    	String evlu_pers_deci_grad_2tms	 = Util.checkString(req.getParameter("evlu_pers_deci_grad_2tms"));
    	String evlu_pers_emp_no	 	     = Util.checkString(req.getParameter("evlu_pers_emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
       // dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setEvlu_pers_emp_no(evlu_pers_emp_no);
        dm.setEvlu_pers_deci_grad_2tms(evlu_pers_deci_grad_2tms);

        dm.evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3305_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
 
    //EP포탈 : 2차평가자 평가화면 > 조정의견 팝업 > 조정의견조회
    public void getTahds_Evluobjmedainfoper2tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3401_SDataSet ds = null;
    	HD_EVLU_3401_SDM dm = new HD_EVLU_3401_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3401_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //EP포탈 : 2차평가자 평가화면 > 조정의견 팝업 > 조정의견등록
    public void updateTahds_Evluobjmedainfoper2tms(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3402_UDataSet ds = null;
    	HD_EVLU_3402_UDM dm = new HD_EVLU_3402_UDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));
    	String evlu_pers_meda_opn_2tms	= Util.checkString(req.getParameter("evlu_pers_meda_opn_2tms"));
    	String evlu_pers_deci_grad_2tms	= Util.checkString(req.getParameter("evlu_pers_deci_grad_2tms"));
        dm.setChg_pers(chg_pers);

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setEvlu_pers_meda_opn_2tms(evlu_pers_meda_opn_2tms);
        dm.setEvlu_pers_deci_grad_2tms(evlu_pers_deci_grad_2tms);

        //System.out.println("===============================");
        dm.print();
        //System.out.println("===============================");

		ds = (HD_EVLU_3402_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가진행상태 관리 초기화면
    public void initTahdm_Evluobjmanagestat(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3500_MDataSet ds = null;
    	HD_EVLU_3500_MDM dm = new HD_EVLU_3500_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
        
        //System.out.println("===============================");
        dm.print();
        //System.out.println("===============================");

		ds = (HD_EVLU_3500_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가진행상태 관리 조회
    public void getListTahdm_Evluobjmanagestat(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3501_LDataSet ds = null;
    	HD_EVLU_3501_LDM dm = new HD_EVLU_3501_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String evlu_grp_cd		= Util.checkString(req.getParameter("evlu_grp_cd"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setEmp_no(emp_no);

        //System.out.println("===============================");
        dm.print();
        //System.out.println("===============================");

		ds = (HD_EVLU_3501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가진행상태 관리 등록,수정,삭제
    public void accessTahdm_Evluobjmanagestat(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3502_ADataSet ds = null;
    	HD_EVLU_3502_ADM dm = new HD_EVLU_3502_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate				= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash					= getHashMultiUpdateData(multiUpDate);
        String emp_no					= (String)hash.get("emp_no");
        String self_evlu_proc_stat		= (String)hash.get("self_evlu_proc_stat");
        String asst_evlu_proc_stat		= (String)hash.get("asst_evlu_proc_stat");
        String evlu_proc_stat_1tms		= (String)hash.get("evlu_proc_stat_1tms");
        String evlu_proc_stat_2tms		= (String)hash.get("evlu_proc_stat_2tms");
        String flag						= (String)hash.get("m");
    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setSelf_evlu_proc_stat(self_evlu_proc_stat);
        dm.setAsst_evlu_proc_stat(asst_evlu_proc_stat);
        dm.setEvlu_proc_stat_1tms(evlu_proc_stat_1tms);
        dm.setEvlu_proc_stat_2tms(evlu_proc_stat_2tms);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3502_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가진행상태 관리 일괄수정
    public void accessTahdm_Evluobjbatchstat(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3503_ADataSet ds = null;
    	HD_EVLU_3503_ADM dm = new HD_EVLU_3503_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String evlu_step		= Util.checkString(req.getParameter("evlu_step"));
    	String evlu_stat		= Util.checkString(req.getParameter("evlu_stat"));
    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_step(evlu_step);
        dm.setEvlu_stat(evlu_stat);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3503_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //평가진행상태 : EIS에 결과 자료 전송
    public void hd_evlu_3504_l(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    DBManager manager = new DBManager("MISHDL");
    HD_EVLU_3504_LDataSet ds = null;
    HD_EVLU_3504_LDM dm = new HD_EVLU_3504_LDM();

    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
    String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
 
    dm.setCmpy_cd(cmpy_cd);
    dm.setEvlu_yy(evlu_yy);
    dm.setTms_clsf(tms_clsf);
    
    System.out.println("===============================");
    dm.print();
    System.out.println("===============================");

    ds = (HD_EVLU_3504_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
    
    //평가진행상태 : EIS에 결과 자료 전송
    public void hd_evlu_3505_a(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    DBManager manager = new DBManager("MISHDL");
    HD_EVLU_3505_ADataSet ds = null;
    HD_EVLU_3505_ADM dm = new HD_EVLU_3505_ADM();

    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String incmg_pers_ipadd = req.getRemoteAddr();
    String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
    String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
 
    dm.setCmpy_cd(cmpy_cd);
    dm.setEvlu_yy(evlu_yy);
    dm.setTms_clsf(tms_clsf);
    dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
    dm.setIncmg_pers(incmg_pers);
    
    System.out.println("===============================");
    dm.print();
    System.out.println("===============================");

    ds = (HD_EVLU_3505_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
    
  
    //평가진행상태 조회 초기화면
    public void initTahdm_Evluobjreportstat(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3600_MDataSet ds = null;
    	HD_EVLU_3600_MDM dm = new HD_EVLU_3600_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3600_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가진행상태 조회 목록조회
    public void getListTahdm_Evluobjreportstat(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3601_LDataSet ds = null;
    	HD_EVLU_3601_LDM dm = new HD_EVLU_3601_LDM();
        
    	//session 정보
    	
    	
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
        String evlu_done_yn = Util.checkString(req.getParameter("evlu_done_yn"));
        String evlu_done_stat = Util.checkString(req.getParameter("evlu_done_stat"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
       // dm.setEvlu_grp_cd(evlu_grp_cd);
        dm.setEvlu_done_yn(evlu_done_yn);
        dm.setEvlu_done_stat(evlu_done_stat);
    	
    	//String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	//String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	//String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	//String evlu_done_yn		= Util.checkString(req.getParameter("evlu_done_yn"));
    	//String evlu_done_stat		= Util.checkString(req.getParameter("evlu_done_stat"));

        //dm.setCmpy_cd(cmpy_cd);
        //dm.setEvlu_yy(evlu_yy);
        //dm.setTms_clsf(tms_clsf);
        //dm.setEvlu_done_yn(evlu_done_yn);
        //dm.setEvlu_done_stat(evlu_done_stat);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가결과조회(인사팀) 초기화면
    public void initTahdm_Evluobjsearchresult(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3700_MDataSet ds = null;
    	HD_EVLU_3700_MDM dm = new HD_EVLU_3700_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);
        
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

        //System.out.println("===============================");
        dm.print();
        //System.out.println("===============================");

		ds = (HD_EVLU_3700_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가결과조회(인사팀) 피평가자 목록조회
    public void getListTahdm_Evluobjsearchresult(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3701_LDataSet ds = null;
    	HD_EVLU_3701_LDM dm = new HD_EVLU_3701_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String evlu_grp_cd		= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    //평가결과조회(인사팀) 피평가자 상세조회
    public void getTahdm_Evluobjsearchresult(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3702_SDataSet ds = null;
    	HD_EVLU_3702_SDM dm = new HD_EVLU_3702_SDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String emp_no			= Util.checkString(req.getParameter("emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3702_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void getListTahds_2tmsevlugrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3801_LDataSet ds = null;
        HD_EVLU_3801_LDM dm = new HD_EVLU_3801_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	
    	//입력값
        String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_2tmsevlugrp(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3802_ADataSet ds = null;
    	HD_EVLU_3802_ADM dm = new HD_EVLU_3802_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash			= getHashMultiUpdateData(multiUpDate);
        String evlu_grp_cd_2tms	= (String)hash.get("evlu_grp_cd_2tms");
        String evlu_grp_nm_2tms	= (String)hash.get("evlu_grp_nm_2tms");
        String flag				= (String)hash.get("m");

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd_2tms(evlu_grp_cd_2tms);
        dm.setEvlu_grp_nm_2tms(evlu_grp_nm_2tms);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3802_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    
    public void hd_evlu_3901_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		System.out.print("dddd");
		HD_EVLU_3901_LDataSet ds = null;
		HD_EVLU_3901_LDM dm = new HD_EVLU_3901_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	//	dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_EVLU_3901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_3902_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EVLU_3902_LDataSet ds = null;
		HD_EVLU_3902_LDM dm = new HD_EVLU_3902_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));

		dm.print();

		ds = (HD_EVLU_3902_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
//  ----------------------- 근무평가 --------------------------------------------------//
//  ***********************************************************************************************//

      public void hd_evlu_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
  		DBManager manager = new DBManager("MISHDL");
  		HD_EVLU_4000_MDataSet ds = null;
  		HD_EVLU_4000_MDM dm = new HD_EVLU_4000_MDM();

  		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
  		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
  		
  		dm.print();
  		
  		ds = (HD_EVLU_4000_MDataSet)manager.executeCall(dm);
  		
  		if (!"".equals(ds.errcode)) {
          	System.out.println("DAO..error.");
              throw new AppException(ds.errcode, ds.errmsg);
          }
  		
  		req.setAttribute("ds", ds);
  	}
      
//----------------------- 파 견 직 --------------------------------------------------//
//***********************************************************************************************//

    public void hd_evlu_5000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5000_MDataSet ds = null;
		HD_EVLU_5000_MDM dm = new HD_EVLU_5000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EVLU_5000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5001_LDataSet ds = null;
		HD_EVLU_5001_LDM dm = new HD_EVLU_5001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));

		dm.print();

		ds = (HD_EVLU_5001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5002_ADataSet ds = null;
		HD_EVLU_5002_ADM dm = new HD_EVLU_5002_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = (String)hash.get("evlu_yy");
		dm.tms_clsf = (String)hash.get("tms_clsf");
		dm.evlu_obj_frdt = (String)hash.get("evlu_obj_frdt");
		dm.evlu_obj_todt = (String)hash.get("evlu_obj_todt");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5003_LDataSet ds = null;
		HD_EVLU_5003_LDM dm = new HD_EVLU_5003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5004_ADataSet ds = null;
		HD_EVLU_5004_ADM dm = new HD_EVLU_5004_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = (String)hash.get("evlu_yy");
		dm.tms_clsf = (String)hash.get("tms_clsf");
		dm.evlu_step_clsf = (String)hash.get("evlu_step_clsf");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5100_MDataSet ds = null;
		HD_EVLU_5100_MDM dm = new HD_EVLU_5100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_EVLU_5100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5101_LDataSet ds = null;
		HD_EVLU_5101_LDM dm = new HD_EVLU_5101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5102_ADataSet ds = null;
		HD_EVLU_5102_ADM dm = new HD_EVLU_5102_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.dtls_item_cd = (String)hash.get("dtls_item_cd");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5103_ADataSet ds = null;
		HD_EVLU_5103_ADM dm = new HD_EVLU_5103_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
    	
    	//입력값
        String evlu_yy_src		= Util.checkString(req.getParameter("evlu_yy_src"));
        String tms_clsf_src		= Util.checkString(req.getParameter("tms_clsf_src"));
        String evlu_yy_dest		= Util.checkString(req.getParameter("evlu_yy_dest"));
        String tms_clsf_dest	= Util.checkString(req.getParameter("tms_clsf_dest"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy_src(evlu_yy_src);
        dm.setTms_clsf_src(tms_clsf_src);
        dm.setEvlu_yy_dest(evlu_yy_dest);
        dm.setTms_clsf_dest(tms_clsf_dest);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

		dm.print();

		ds = (HD_EVLU_5103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5200_MDataSet ds = null;
		HD_EVLU_5200_MDM dm = new HD_EVLU_5200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EVLU_5200_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5201_LDataSet ds = null;
		HD_EVLU_5201_LDM dm = new HD_EVLU_5201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5202_ADataSet ds = null;
		HD_EVLU_5202_ADM dm = new HD_EVLU_5202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = (String)hash.get("evlu_grp_cd");
		dm.evlu_grp_nm = (String)hash.get("evlu_grp_nm");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5300_MDataSet ds = null;
		HD_EVLU_5300_MDM dm = new HD_EVLU_5300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));

		dm.print();

		ds = (HD_EVLU_5300_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5301_LDataSet ds = null;
		HD_EVLU_5301_LDM dm = new HD_EVLU_5301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));

		dm.print();

		ds = (HD_EVLU_5301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5302_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5302_UDataSet ds = null;
		HD_EVLU_5302_UDM dm = new HD_EVLU_5302_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5302_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5400_MDataSet ds = null;
		HD_EVLU_5400_MDM dm = new HD_EVLU_5400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EVLU_5400_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5401_LDataSet ds = null;
		HD_EVLU_5401_LDM dm = new HD_EVLU_5401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_evlu_5402_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5402_LDataSet ds = null;
		HD_EVLU_5402_LDM dm = new HD_EVLU_5402_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_subj_cd = Util.checkString(req.getParameter("evlu_subj_cd"));

		dm.print();

		ds = (HD_EVLU_5402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5403_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5403_ADataSet ds = null;
		HD_EVLU_5403_ADM dm = new HD_EVLU_5403_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_subj_cd = Util.checkString(req.getParameter("evlu_subj_cd"));
		dm.evlu_item_cd = (String)hash.get("evlu_item_cd");
		dm.evlu_clon_cd = (String)hash.get("evlu_clon_cd");
		dm.viewpoint = (String)hash.get("viewpoint");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5403_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5404_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5404_ADataSet ds = null;
		HD_EVLU_5404_ADM dm = new HD_EVLU_5404_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_subj_cd = (String)hash.get("evlu_subj_cd");
		dm.evlu_clon_cd = (String)hash.get("evlu_clon_cd");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5404_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5501_LDataSet ds = null;
		HD_EVLU_5501_LDM dm = new HD_EVLU_5501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5502_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5502_ADataSet ds = null;
		HD_EVLU_5502_ADM dm = new HD_EVLU_5502_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.cd = (String)hash.get("cd");
		dm.t1 = (String)hash.get("t1");
		dm.t2 = (String)hash.get("t2");
		dm.t3 = (String)hash.get("t3");
		dm.t4 = (String)hash.get("t4");
		dm.t5 = (String)hash.get("t5");
		dm.t6 = (String)hash.get("t6");
		dm.t7 = (String)hash.get("t7");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5502_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5600_MDataSet ds = null;
		HD_EVLU_5600_MDM dm = new HD_EVLU_5600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EVLU_5600_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5601_LDataSet ds = null;
		HD_EVLU_5601_LDM dm = new HD_EVLU_5601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5602_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5602_ADataSet ds = null;
		HD_EVLU_5602_ADM dm = new HD_EVLU_5602_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_step_clsf = (String)hash.get("evlu_step_clsf");
		dm.rfl_ratio = (String)hash.get("rfl_ratio");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5602_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5700_MDataSet ds = null;
		HD_EVLU_5700_MDM dm = new HD_EVLU_5700_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EVLU_5700_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5701_LDataSet ds = null;
		HD_EVLU_5701_LDM dm = new HD_EVLU_5701_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5702_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5702_LDataSet ds = null;
		HD_EVLU_5702_LDM dm = new HD_EVLU_5702_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_EVLU_5702_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5703_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5703_ADataSet ds = null;
		HD_EVLU_5703_ADM dm = new HD_EVLU_5703_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = (String)hash.get("evlu_grp_cd");
		dm.emp_no = (String)hash.get("emp_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.obj_excl_clsf = (String)hash.get("obj_excl_clsf");
		dm.up_emp_no1 = (String)hash.get("up_emp_no1");
		dm.up_emp_no2 = (String)hash.get("up_emp_no2");
		dm.in_cmpy_dt = (String)hash.get("in_cmpy_dt");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5703_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5704_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5704_LDataSet ds = null;
		HD_EVLU_5704_LDM dm = new HD_EVLU_5704_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
		dm.evlu_gbn_cd = Util.checkString(req.getParameter("evlu_gbn_cd"));

		dm.print();

		ds = (HD_EVLU_5704_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5705_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5705_ADataSet ds = null;
		HD_EVLU_5705_ADM dm = new HD_EVLU_5705_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = (String)hash.get("evlu_grp_cd");
		dm.emp_no = (String)hash.get("emp_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.obj_excl_clsf = (String)hash.get("obj_excl_clsf");
		dm.up_emp_no1 = (String)hash.get("up_emp_no1");
		dm.up_emp_no2 = (String)hash.get("up_emp_no2");
		dm.in_cmpy_dt = (String)hash.get("in_cmpy_dt");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_5705_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5706_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5706_LDataSet ds = null;
		HD_EVLU_5706_LDM dm = new HD_EVLU_5706_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));

		dm.print();

		ds = (HD_EVLU_5706_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    

    public void hd_evlu_5900_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5900_LDataSet ds = null;
		HD_EVLU_5900_LDM dm = new HD_EVLU_5900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.evlu_pers_emp_no_tms = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.evlu_pers_emp_no_tms ="204021";//(2차평가테스트용)

		dm.print();

		ds = (HD_EVLU_5900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5901_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5901_LDataSet ds = null;
		HD_EVLU_5901_LDM dm = new HD_EVLU_5901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.evlu_pers_emp_no_tms = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.evlu_pers_emp_no_tms ="204021";//(2차평가테스트용)
		dm.evlu_pers_gbn = Util.checkString(req.getParameter("evlu_pers_gbn"));

		dm.print();

		ds = (HD_EVLU_5901_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5902_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5902_MDataSet ds = null;
		HD_EVLU_5902_MDM dm = new HD_EVLU_5902_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

		dm.print();

		ds = (HD_EVLU_5902_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5903_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5903_LDataSet ds = null;
		HD_EVLU_5903_LDM dm = new HD_EVLU_5903_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.tgt_evlu_pers_emp_no = Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
		//dm.evlu_pers_emp_no ="204021";//(2차평가테스트용)
		dm.evlu_pers_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.evlu_pers_gbn = Util.checkString(req.getParameter("evlu_pers_gbn"));

		dm.print();

		ds = (HD_EVLU_5903_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5904_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5904_ADataSet ds = null;
		HD_EVLU_5904_ADM dm = new HD_EVLU_5904_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_pers_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.evlu_pers_emp_no ="204021";//(2차평가테스트용)
		dm.evlu_pers_gbn = Util.checkString(req.getParameter("evlu_pers_gbn"));
		dm.tgt_evlu_pers_emp_no = Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
		dm.item_cd = (String)hash.get("evlu_item_cd");
		dm.grad_cd = (String)hash.get("scr_cd");
		dm.scor = (String)hash.get("scr");
		dm.evlu_opn = (String)hash.get("t_opn");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");
		dm.tot_evlu  = Util.checkString(req.getParameter("tot_evlu")); //2015.09.25 추가  총평가 

		dm.print();

		ds = (HD_EVLU_5904_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5905_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5905_ADataSet ds = null;
		HD_EVLU_5905_ADM dm = new HD_EVLU_5905_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_pers_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.evlu_pers_emp_no ="204021";//(2차평가테스트용)
		dm.evlu_pers_gbn = Util.checkString(req.getParameter("evlu_pers_gbn"));
		dm.tgt_evlu_pers_emp_no = Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
		dm.item_cd = (String)hash.get("evlu_item_cd");
		dm.grad_cd = (String)hash.get("scr_cd");
		dm.scor = (String)hash.get("scr");
		dm.evlu_opn = (String)hash.get("t_opn");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");
		dm.tot_evlu  = Util.checkString(req.getParameter("tot_evlu")); //2015.09.25 추가  총평가 

		dm.print();

		ds = (HD_EVLU_5905_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6200_LDataSet ds = null;
		HD_EVLU_6200_LDM dm = new HD_EVLU_6200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));

		dm.print();

		ds = (HD_EVLU_6200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6201_ADataSet ds = null;
		HD_EVLU_6201_ADM dm = new HD_EVLU_6201_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.tgt_emp_no = (String)hash.get("emp_no");
		dm.rvis_ratio = (String)hash.get("rvis_ratio");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_6201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6202_ADataSet ds = null;
		HD_EVLU_6202_ADM dm = new HD_EVLU_6202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.tgt_emp_no = (String)hash.get("emp_no");
		dm.dept_avg_1tms = (String)hash.get("dept_avg_1tms");
		dm.dept_avg_2tms = (String)hash.get("dept_avg_2tms");
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //최초입력자
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.flag = (String)hash.get("m");

		dm.print();

		ds = (HD_EVLU_6202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6203_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6203_ADataSet ds = null;
		HD_EVLU_6203_ADM dm = new HD_EVLU_6203_ADM();
		

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr(); //ip주소
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자
		dm.fix_flag =  Util.checkString(req.getParameter("fix_flag"));

		dm.print();

		ds = (HD_EVLU_6203_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    public void hd_evlu_6204_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6204_ADataSet ds = null;
		HD_EVLU_6204_ADM dm = new HD_EVLU_6204_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //수정자

		dm.print();

		ds = (HD_EVLU_6204_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    
    
    public void hd_evlu_6300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5903_LDataSet ds = null;
		HD_EVLU_5903_LDM dm = new HD_EVLU_5903_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.tgt_evlu_pers_emp_no = Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
		dm.evlu_pers_emp_no = Util.checkString(req.getParameter("evlu_pers_emp_no"));

		dm.print();

		ds = (HD_EVLU_5903_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    

	//2009-06-08 : 문종호작업
    public void hd_evlu_5800_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5800_MDataSet ds = null;
		HD_EVLU_5800_MDM dm = new HD_EVLU_5800_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		
		dm.print();

		ds = (HD_EVLU_5800_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_5801_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5801_LDataSet ds = null;
		HD_EVLU_5801_LDM dm = new HD_EVLU_5801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.sel_pgm_id = Util.checkString(req.getParameter("sel_pgm_id"));
		
		dm.print();

		ds = (HD_EVLU_5801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    
    public void hd_evlu_5802_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5802_IDataSet ds = null;
		HD_EVLU_5802_IDM dm = new HD_EVLU_5802_IDM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String multiUpDate			= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= getHashMultiUpdateData(multiUpDate);
        String emp_no				= (String)hash.get("emp_no");
        String nm_korn				= (String)hash.get("nm_korn");
        String dept_cd				= (String)hash.get("dept_cd");
        String dty_cd				= (String)hash.get("dty_cd");
        String posi_cd				= (String)hash.get("posi_cd");
        String flag					= (String)hash.get("m");
        String pgm_id				= Util.checkString(req.getParameter("pgm_id"));
        String pgm_nm				= Util.checkString(req.getParameter("pgm_nm"));
        String pgm_url				= Util.checkString(req.getParameter("pgm_url"));
        String job_clsf				= Util.checkString(req.getParameter("job_clsf"));
        String annc_frdt			= Util.checkString(req.getParameter("annc_frdt"));
        String annc_todt			= Util.checkString(req.getParameter("annc_todt"));
        String annc_clsf			= Util.checkString(req.getParameter("annc_clsf"));
        String annc_cont			= Util.checkString(req.getParameter("annc_cont"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEmp_no(emp_no);
        dm.setNm_korn(nm_korn);
        dm.setDept_cd(dept_cd);
        dm.setDty_cd(dty_cd);
        dm.setPosi_cd(posi_cd);
        dm.setPgm_id(pgm_id);
        dm.setPgm_nm(pgm_nm);
        dm.setPgm_url(pgm_url);
        dm.setJob_clsf(job_clsf);
        dm.setAnnc_frdt(annc_frdt);
        dm.setAnnc_todt(annc_todt);
        dm.setAnnc_clsf(annc_clsf);
        dm.setAnnc_cont(annc_cont);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);
		
		
		dm.print();

		ds = (HD_EVLU_5802_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6000_MDataSet ds = null;
		HD_EVLU_6000_MDM dm = new HD_EVLU_6000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();

		ds = (HD_EVLU_6000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6001_LDataSet ds = null;
		HD_EVLU_6001_LDM dm = new HD_EVLU_6001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();

		ds = (HD_EVLU_6001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	HD_EVLU_6002_ADataSet ds = null;

    	HD_EVLU_6002_ADM dm = new HD_EVLU_6002_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
    	String multiUpDate				= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash					= getHashMultiUpdateData(multiUpDate);
        String emp_no					= (String)hash.get("emp_no");
        String evlu_proc_stat_1tms		= (String)hash.get("evlu_proc_stat_1tms");
        String evlu_proc_stat_2tms		= (String)hash.get("evlu_proc_stat_2tms");
        String flag						= (String)hash.get("m");
    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setEvlu_proc_stat_1tms(evlu_proc_stat_1tms);
        dm.setEvlu_proc_stat_2tms(evlu_proc_stat_2tms);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);
        dm.setFlag(flag);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_6002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_evlu_6003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	HD_EVLU_6003_ADataSet ds = null;

    	HD_EVLU_6003_ADM dm = new HD_EVLU_6003_ADM();

    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String incmg_pers_ipadd	= req.getRemoteAddr();
    	String incmg_pers		= Util.getSessionParameterValue(req,"emp_no",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
    	String evlu_yy			= Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf			= Util.checkString(req.getParameter("tms_clsf"));
    	String evlu_step		= Util.checkString(req.getParameter("evlu_step"));
    	String evlu_stat		= Util.checkString(req.getParameter("evlu_stat"));
    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_step(evlu_step);
        dm.setEvlu_stat(evlu_stat);
        dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
        dm.setIncmg_pers(incmg_pers);
        dm.setChg_pers(chg_pers);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_6003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_evlu_6101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6101_LDataSet ds = null;
		HD_EVLU_6101_LDM dm = new HD_EVLU_6101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
		
		dm.print();

		ds = (HD_EVLU_6101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6401_LDataSet ds = null;
		HD_EVLU_6401_LDM dm = new HD_EVLU_6401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		//dm.evlu_pers_emp_no_2tms = Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));
		
		dm.print();

		ds = (HD_EVLU_6401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    //2009-06-08 : 문종호작업
    
    
    public void hd_evlu_8000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_8000_LDataSet ds = null;
		HD_EVLU_8000_LDM dm = new HD_EVLU_8000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EVLU_8000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_8001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_8001_MDataSet ds = null;
		HD_EVLU_8001_MDM dm = new HD_EVLU_8001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));

		dm.print();

		ds = (HD_EVLU_8001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
//***********************************************************************************************//    
//----------------------- 파 견 직  끝--------------------------------------------------//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void getListTahds_EvlucdCombo(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	HD_EVLU_9000_LDataSet ds = null;

    	HD_EVLU_9000_LDM dm = new HD_EVLU_9000_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

		ds = (HD_EVLU_9000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_EvlugrpcdCombo(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_9001_LDataSet ds = null;

    	HD_EVLU_9001_LDM dm = new HD_EVLU_9001_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_9001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_EvlugrpcdPopup(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_9002_LDataSet ds = null;

    	HD_EVLU_9002_LDM dm = new HD_EVLU_9002_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_lcls_grp_cd		= Util.checkString(req.getParameter("evlu_lcls_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_9002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void getListTahds_AsstevlupersevluPopup(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_9003_LDataSet ds = null;

    	HD_EVLU_9003_LDM dm = new HD_EVLU_9003_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String tgt_evlu_pers_emp_no	= Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_9003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void accessTahds_Evluobjevlustat(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_9004_ADataSet ds = null;

    	HD_EVLU_9004_ADM dm = new HD_EVLU_9004_ADM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String chg_pers			= Util.getSessionParameterValue(req,"emp_no",true);

    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String emp_no				= Util.checkString(req.getParameter("emp_no"));
        String evlu_stat			= Util.checkString(req.getParameter("evlu_stat"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);
        dm.setEvlu_stat(evlu_stat);
        dm.setChg_pers(chg_pers);
        
        
        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_9004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_evlu_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_4001_LDataSet ds = null;
		HD_EVLU_4001_LDM dm = new HD_EVLU_4001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.evlu_step_clsf = Util.checkString(req.getParameter("evlu_step_clsf"));

		dm.print();
		
		ds = (HD_EVLU_4001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    public void hd_evlu_3751_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_3751_LDataSet ds = null;
		HD_EVLU_3751_LDM dm = new HD_EVLU_3751_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));


		dm.print();
		
		ds = (HD_EVLU_3751_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_evlu_6500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
    	HD_EVLU_6500_MDataSet ds = null;
    	HD_EVLU_6500_MDM dm = new HD_EVLU_6500_MDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);

        dm.setCmpy_cd(cmpy_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_6500_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_evlu_6410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_6410_LDataSet ds = null;
        HD_EVLU_6410_LDM dm = new HD_EVLU_6410_LDM();
        
        //세션정보
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String tgt_evlu_pers_emp_no	= Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
        String evlu_pers_emp_no		= Util.checkString(req.getParameter("evlu_pers_emp_no"));
        String item_cd				= Util.checkString(req.getParameter("item_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
        dm.setEvlu_pers_emp_no(evlu_pers_emp_no);
        dm.setItem_cd(item_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_6410_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //파견사원 평가기술 팝업   
    public void hd_evlu_6420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_6420_LDataSet ds = null;
        HD_EVLU_6420_LDM dm = new HD_EVLU_6420_LDM();
        
        //세션정보
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String tgt_evlu_pers_emp_no	= Util.checkString(req.getParameter("tgt_evlu_pers_emp_no"));
        String evlu_pers_num		= Util.checkString(req.getParameter("evlu_pers_num"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setTgt_evlu_pers_emp_no(tgt_evlu_pers_emp_no);
        dm.setEvlu_pers_num(evlu_pers_num);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_6420_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    public void hd_evlu_6501_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_6501_LDataSet ds = null;
        HD_EVLU_6501_LDM dm = new HD_EVLU_6501_LDM();
        
        //세션정보
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
   	
    	//입력값
        String evlu_yy				= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf				= Util.checkString(req.getParameter("tms_clsf"));
        String evlu_grp_cd			= Util.checkString(req.getParameter("evlu_grp_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_grp_cd(evlu_grp_cd);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_6501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //조선일보_평가업로드_국실별가점_업로드_20160712
    public void hd_evlu_2454_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_2454_ADataSet ds = null;
		HD_EVLU_2454_ADM dm = new HD_EVLU_2454_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.emp_no = (String)hash.get("emp_no"); //사번(해쉬)
		dm.flnm = (String)hash.get("flnm"); //성명(해쉬)
		dm.evlu_dp_nm = (String)hash.get("evlu_dp_nm"); //가점내용(해쉬)
		dm.evlu_dp_scor = (String)hash.get("evlu_dp_scor"); //점수(해쉬)
		dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP 주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //입력자
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //변경자

		dm.print();

		ds = (HD_EVLU_2454_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    //조선일보_평가업로드_국실별가점_조회_20160712
    public void hd_evlu_2455_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
      DBManager manager = new DBManager("MISHDL");
      HD_EVLU_2455_LDataSet ds = null;
      HD_EVLU_2455_LDM dm = new HD_EVLU_2455_LDM();
      
      dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
      dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

      dm.print();

      ds = (HD_EVLU_2455_LDataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }
    
    //조선일보_평가업로드_평가자_업로드_2017.11.09
    
    public void hd_evlu_2456_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_2456_ADataSet ds = null;
		HD_EVLU_2456_ADM dm = new HD_EVLU_2456_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
		dm.emp_no = (String)hash.get("emp_no"); //사번(해쉬)
		dm.evlu_grp_cd = (String)hash.get("evlu_grp_cd"); //
		dm.evlu_pers_emp_no_1tms = (String)hash.get("evlu_pers_emp_no_1tms"); //평가자 (해쉬)
		dm.evlu_pers_emp_no_2tms = (String)hash.get("evlu_pers_emp_no_2tms"); //평가자 (해쉬)
		dm.asst_evlu_pers_emp_no = (String)hash.get("asst_evlu_pers_emp_no"); //평가자 (해쉬)
		dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP 주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //입력자
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true); //변경자

		dm.print();

		ds = (HD_EVLU_2456_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    //조선일보_평가업로드_평가자_조회_2017.11.09
    public void hd_evlu_2457_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
      DBManager manager = new DBManager("MISHDL");
      HD_EVLU_2457_LDataSet ds = null;
      HD_EVLU_2457_LDM dm = new HD_EVLU_2457_LDM();
      
      dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
      dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));

      dm.print();

      ds = (HD_EVLU_2457_LDataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }
    
    //조선일보_본인업적기술(자기평가) 초기화면
    public void hd_evlu_2600_s_100(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_2600_S_100DataSet ds = null;    	
    	HD_EVLU_2600_S_100DM dm = new HD_EVLU_2600_S_100DM();
        
    	//session 정보
    	String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	String emp_no = "";
    
    	if(Util.checkString(req.getParameter("emp_no")).equals(null) || Util.checkString(req.getParameter("emp_no")).equals("")){
        	 emp_no = Util.getSessionParameterValue(req,"emp_no",true);  		
    	}else {
    		 emp_no = Util.checkString(req.getParameter("emp_no"));
    	}
    	
    	String evlu_yy  = Util.checkString(req.getParameter("evlu_yy"));
    	String tms_clsf	 = Util.checkString(req.getParameter("tms_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEmp_no(emp_no);

        dm.print();

		ds = (HD_EVLU_2600_S_100DataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    //조선일보_평가업로드_국실별가점_조회_20160712
    public void hd_evlu_2850_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
      DBManager manager = new DBManager("MISHDL");
      HD_EVLU_2850_LDataSet ds = null;
      HD_EVLU_2850_LDM dm = new HD_EVLU_2850_LDM();
      
      dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
      dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
      dm.emp_no = Util.checkString(req.getParameter("emp_no"));

      dm.print();

      ds = (HD_EVLU_2850_LDataSet)manager.executeCall(dm);

      if (!"".equals(ds.errcode)) {
        System.out.println("DAO..error.");
        throw new AppException(ds.errcode, ds.errmsg);
      }

      req.setAttribute("ds", ds);
    }
    
    //조선일보_1차평가_피평가자기본정보조회_20160726
	public void hd_evlu_3103_s_100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_3103_S_100DataSet ds = null;
		HD_EVLU_3103_S_100DM dm = new HD_EVLU_3103_S_100DM();
	    
		//session 정보
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
	    dm.emp_no = Util.checkString(req.getParameter("emp_no"));
				
	    dm.print();
	
		ds = (HD_EVLU_3103_S_100DataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
	    	System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
	    }
		
		req.setAttribute("ds", ds);
	}
	
	//조선일보_1차평가_피평가자기본정보조회_20160726
	public void hd_evlu_3303_s_100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_3303_S_100DataSet ds = null;
		HD_EVLU_3303_S_100DM dm = new HD_EVLU_3303_S_100DM();
	    
		//session 정보
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
	    dm.emp_no = Util.checkString(req.getParameter("emp_no"));
				
	    dm.print();
	
		ds = (HD_EVLU_3303_S_100DataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
	    	System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
	    }
		
		req.setAttribute("ds", ds);
	}
	
//  TV조선 2차평가자 평가화면 피평가자 그룹목록 조회
    public void hd_evlu_3301_500_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

		DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3301_500_LDataSet ds = null;
        HD_EVLU_3301_500_LDM dm = new HD_EVLU_3301_500_LDM();
        
    	//session 정보
    	String cmpy_cd			= Util.getSessionParameterValue(req,"cmpycd",true);
    	String evlu_pers_emp_no_2tms = Util.getSessionParameterValue(req,"emp_no",true);
    	//입력값
        String evlu_yy					= Util.checkString(req.getParameter("evlu_yy"));
        String tms_clsf					= Util.checkString(req.getParameter("tms_clsf"));
        //String evlu_pers_emp_no_2tms	= Util.checkString(req.getParameter("evlu_pers_emp_no_2tms"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEvlu_yy(evlu_yy);
        dm.setTms_clsf(tms_clsf);
        dm.setEvlu_pers_emp_no_2tms(evlu_pers_emp_no_2tms);

        System.out.println("===============================");
        dm.print();
        System.out.println("===============================");

		ds = (HD_EVLU_3301_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }	
    

	//TV조선_2차평가_피평가자기본정보조회_20180620
	public void hd_evlu_3303_500_S(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_3303_500_SDataSet ds = null;
		HD_EVLU_3303_500_SDM dm = new HD_EVLU_3303_500_SDM();
	    
		//session 정보
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
		dm.tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
	    dm.emp_no = Util.checkString(req.getParameter("emp_no"));
				
	    dm.print();
	
		ds = (HD_EVLU_3303_500_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
	    	System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
	    }
		
		req.setAttribute("ds", ds);
	}
	
    
}
