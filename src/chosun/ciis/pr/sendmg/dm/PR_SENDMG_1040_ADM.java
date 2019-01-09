/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pr.sendmg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String pr_dt;
	public String cmpy_cd;
	public String issu_dt;
	public String medi_cd;
	public String ecnt;
	public String ledt_cd;
	public String prt_seq;
	public String fld_no;
	public String medi_nm;
	public String ledt_nm;
	public String issu_pcnt;
	public String prt_ex_tm;
	public String prt_end_tm;
	public String qty;
	public String chg_qty;
	public String prt_qty;
	public String bad_nwsp_qty;
	public String card_qty;
	public String dqty;
	public String prt_plac_clsf;
	public String nwsp_side_trsm_tm;
	public String dt_tm_stop_tms;
	public String dt_tm_stop_resn;
	public String fail_tms;
	public String fail_resn;
	public String chrg_pers_nm;
	public String cs1_clas_rslt;
	public String cs1_cnt_rslt;
	public String cs2_clas_rslt;
	public String cs2_cnt_rslt;
	public String remk;

	public PR_SENDMG_1040_ADM(){}
	public PR_SENDMG_1040_ADM(String pr_dt, String cmpy_cd, String issu_dt, String medi_cd, String ecnt, String ledt_cd, String prt_seq, String fld_no, String medi_nm, String ledt_nm, String issu_pcnt, String prt_ex_tm, String prt_end_tm, String qty, String chg_qty, String prt_qty, String bad_nwsp_qty, String card_qty, String dqty, String prt_plac_clsf, String nwsp_side_trsm_tm, String dt_tm_stop_tms, String dt_tm_stop_resn, String fail_tms, String fail_resn, String chrg_pers_nm, String cs1_clas_rslt, String cs1_cnt_rslt, String cs2_clas_rslt, String cs2_cnt_rslt, String remk){
		this.pr_dt = pr_dt;
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.medi_cd = medi_cd;
		this.ecnt = ecnt;
		this.ledt_cd = ledt_cd;
		this.prt_seq = prt_seq;
		this.fld_no = fld_no;
		this.medi_nm = medi_nm;
		this.ledt_nm = ledt_nm;
		this.issu_pcnt = issu_pcnt;
		this.prt_ex_tm = prt_ex_tm;
		this.prt_end_tm = prt_end_tm;
		this.qty = qty;
		this.chg_qty = chg_qty;
		this.prt_qty = prt_qty;
		this.bad_nwsp_qty = bad_nwsp_qty;
		this.card_qty = card_qty;
		this.dqty = dqty;
		this.prt_plac_clsf = prt_plac_clsf;
		this.nwsp_side_trsm_tm = nwsp_side_trsm_tm;
		this.dt_tm_stop_tms = dt_tm_stop_tms;
		this.dt_tm_stop_resn = dt_tm_stop_resn;
		this.fail_tms = fail_tms;
		this.fail_resn = fail_resn;
		this.chrg_pers_nm = chrg_pers_nm;
		this.cs1_clas_rslt = cs1_clas_rslt;
		this.cs1_cnt_rslt = cs1_cnt_rslt;
		this.cs2_clas_rslt = cs2_clas_rslt;
		this.cs2_cnt_rslt = cs2_cnt_rslt;
		this.remk = remk;
	}

	public void setPr_dt(String pr_dt){
		this.pr_dt = pr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setPrt_seq(String prt_seq){
		this.prt_seq = prt_seq;
	}

	public void setFld_no(String fld_no){
		this.fld_no = fld_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setLedt_nm(String ledt_nm){
		this.ledt_nm = ledt_nm;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setPrt_ex_tm(String prt_ex_tm){
		this.prt_ex_tm = prt_ex_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setChg_qty(String chg_qty){
		this.chg_qty = chg_qty;
	}

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
	}

	public void setBad_nwsp_qty(String bad_nwsp_qty){
		this.bad_nwsp_qty = bad_nwsp_qty;
	}

	public void setCard_qty(String card_qty){
		this.card_qty = card_qty;
	}

	public void setDqty(String dqty){
		this.dqty = dqty;
	}

	public void setPrt_plac_clsf(String prt_plac_clsf){
		this.prt_plac_clsf = prt_plac_clsf;
	}

	public void setNwsp_side_trsm_tm(String nwsp_side_trsm_tm){
		this.nwsp_side_trsm_tm = nwsp_side_trsm_tm;
	}

	public void setDt_tm_stop_tms(String dt_tm_stop_tms){
		this.dt_tm_stop_tms = dt_tm_stop_tms;
	}

	public void setDt_tm_stop_resn(String dt_tm_stop_resn){
		this.dt_tm_stop_resn = dt_tm_stop_resn;
	}

	public void setFail_tms(String fail_tms){
		this.fail_tms = fail_tms;
	}

	public void setFail_resn(String fail_resn){
		this.fail_resn = fail_resn;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setCs1_clas_rslt(String cs1_clas_rslt){
		this.cs1_clas_rslt = cs1_clas_rslt;
	}

	public void setCs1_cnt_rslt(String cs1_cnt_rslt){
		this.cs1_cnt_rslt = cs1_cnt_rslt;
	}

	public void setCs2_clas_rslt(String cs2_clas_rslt){
		this.cs2_clas_rslt = cs2_clas_rslt;
	}

	public void setCs2_cnt_rslt(String cs2_cnt_rslt){
		this.cs2_cnt_rslt = cs2_cnt_rslt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getPr_dt(){
		return this.pr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getPrt_seq(){
		return this.prt_seq;
	}

	public String getFld_no(){
		return this.fld_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getLedt_nm(){
		return this.ledt_nm;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getPrt_ex_tm(){
		return this.prt_ex_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getChg_qty(){
		return this.chg_qty;
	}

	public String getPrt_qty(){
		return this.prt_qty;
	}

	public String getBad_nwsp_qty(){
		return this.bad_nwsp_qty;
	}

	public String getCard_qty(){
		return this.card_qty;
	}

	public String getDqty(){
		return this.dqty;
	}

	public String getPrt_plac_clsf(){
		return this.prt_plac_clsf;
	}

	public String getNwsp_side_trsm_tm(){
		return this.nwsp_side_trsm_tm;
	}

	public String getDt_tm_stop_tms(){
		return this.dt_tm_stop_tms;
	}

	public String getDt_tm_stop_resn(){
		return this.dt_tm_stop_resn;
	}

	public String getFail_tms(){
		return this.fail_tms;
	}

	public String getFail_resn(){
		return this.fail_resn;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getCs1_clas_rslt(){
		return this.cs1_clas_rslt;
	}

	public String getCs1_cnt_rslt(){
		return this.cs1_cnt_rslt;
	}

	public String getCs2_clas_rslt(){
		return this.cs2_clas_rslt;
	}

	public String getCs2_cnt_rslt(){
		return this.cs2_cnt_rslt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_PR_SENDMG_1040_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_SENDMG_1040_ADM dm = (PR_SENDMG_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.pr_dt);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.ecnt);
		cstmt.setString(8, dm.ledt_cd);
		cstmt.setString(9, dm.prt_seq);
		cstmt.setString(10, dm.fld_no);
		cstmt.setString(11, dm.medi_nm);
		cstmt.setString(12, dm.ledt_nm);
		cstmt.setString(13, dm.issu_pcnt);
		cstmt.setString(14, dm.prt_ex_tm);
		cstmt.setString(15, dm.prt_end_tm);
		cstmt.setString(16, dm.qty);
		cstmt.setString(17, dm.chg_qty);
		cstmt.setString(18, dm.prt_qty);
		cstmt.setString(19, dm.bad_nwsp_qty);
		cstmt.setString(20, dm.card_qty);
		cstmt.setString(21, dm.dqty);
		cstmt.setString(22, dm.prt_plac_clsf);
		cstmt.setString(23, dm.nwsp_side_trsm_tm);
		cstmt.setString(24, dm.dt_tm_stop_tms);
		cstmt.setString(25, dm.dt_tm_stop_resn);
		cstmt.setString(26, dm.fail_tms);
		cstmt.setString(27, dm.fail_resn);
		cstmt.setString(28, dm.chrg_pers_nm);
		cstmt.setString(29, dm.cs1_clas_rslt);
		cstmt.setString(30, dm.cs1_cnt_rslt);
		cstmt.setString(31, dm.cs2_clas_rslt);
		cstmt.setString(32, dm.cs2_cnt_rslt);
		cstmt.setString(33, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.sendmg.ds.PR_SENDMG_1040_ADataSet();
	}



    public void print(){
        System.out.println("pr_dt = " + getPr_dt());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("ecnt = " + getEcnt());
        System.out.println("ledt_cd = " + getLedt_cd());
        System.out.println("prt_seq = " + getPrt_seq());
        System.out.println("fld_no = " + getFld_no());
        System.out.println("medi_nm = " + getMedi_nm());
        System.out.println("ledt_nm = " + getLedt_nm());
        System.out.println("issu_pcnt = " + getIssu_pcnt());
        System.out.println("prt_ex_tm = " + getPrt_ex_tm());
        System.out.println("prt_end_tm = " + getPrt_end_tm());
        System.out.println("qty = " + getQty());
        System.out.println("chg_qty = " + getChg_qty());
        System.out.println("prt_qty = " + getPrt_qty());
        System.out.println("bad_nwsp_qty = " + getBad_nwsp_qty());
        System.out.println("card_qty = " + getCard_qty());
        System.out.println("dqty = " + getDqty());
        System.out.println("prt_plac_clsf = " + getPrt_plac_clsf());
        System.out.println("nwsp_side_trsm_tm = " + getNwsp_side_trsm_tm());
        System.out.println("dt_tm_stop_tms = " + getDt_tm_stop_tms());
        System.out.println("dt_tm_stop_resn = " + getDt_tm_stop_resn());
        System.out.println("fail_tms = " + getFail_tms());
        System.out.println("fail_resn = " + getFail_resn());
        System.out.println("chrg_pers_nm = " + getChrg_pers_nm());
        System.out.println("cs1_clas_rslt = " + getCs1_clas_rslt());
        System.out.println("cs1_cnt_rslt = " + getCs1_cnt_rslt());
        System.out.println("cs2_clas_rslt = " + getCs2_clas_rslt());
        System.out.println("cs2_cnt_rslt = " + getCs2_cnt_rslt());
        System.out.println("remk = " + getRemk());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String pr_dt = req.getParameter("pr_dt");
if( pr_dt == null){
	System.out.println(this.toString+" : pr_dt is null" );
}else{
	System.out.println(this.toString+" : pr_dt is "+pr_dt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String ledt_cd = req.getParameter("ledt_cd");
if( ledt_cd == null){
	System.out.println(this.toString+" : ledt_cd is null" );
}else{
	System.out.println(this.toString+" : ledt_cd is "+ledt_cd );
}
String prt_seq = req.getParameter("prt_seq");
if( prt_seq == null){
	System.out.println(this.toString+" : prt_seq is null" );
}else{
	System.out.println(this.toString+" : prt_seq is "+prt_seq );
}
String fld_no = req.getParameter("fld_no");
if( fld_no == null){
	System.out.println(this.toString+" : fld_no is null" );
}else{
	System.out.println(this.toString+" : fld_no is "+fld_no );
}
String medi_nm = req.getParameter("medi_nm");
if( medi_nm == null){
	System.out.println(this.toString+" : medi_nm is null" );
}else{
	System.out.println(this.toString+" : medi_nm is "+medi_nm );
}
String ledt_nm = req.getParameter("ledt_nm");
if( ledt_nm == null){
	System.out.println(this.toString+" : ledt_nm is null" );
}else{
	System.out.println(this.toString+" : ledt_nm is "+ledt_nm );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String prt_ex_tm = req.getParameter("prt_ex_tm");
if( prt_ex_tm == null){
	System.out.println(this.toString+" : prt_ex_tm is null" );
}else{
	System.out.println(this.toString+" : prt_ex_tm is "+prt_ex_tm );
}
String prt_end_tm = req.getParameter("prt_end_tm");
if( prt_end_tm == null){
	System.out.println(this.toString+" : prt_end_tm is null" );
}else{
	System.out.println(this.toString+" : prt_end_tm is "+prt_end_tm );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String chg_qty = req.getParameter("chg_qty");
if( chg_qty == null){
	System.out.println(this.toString+" : chg_qty is null" );
}else{
	System.out.println(this.toString+" : chg_qty is "+chg_qty );
}
String prt_qty = req.getParameter("prt_qty");
if( prt_qty == null){
	System.out.println(this.toString+" : prt_qty is null" );
}else{
	System.out.println(this.toString+" : prt_qty is "+prt_qty );
}
String bad_nwsp_qty = req.getParameter("bad_nwsp_qty");
if( bad_nwsp_qty == null){
	System.out.println(this.toString+" : bad_nwsp_qty is null" );
}else{
	System.out.println(this.toString+" : bad_nwsp_qty is "+bad_nwsp_qty );
}
String card_qty = req.getParameter("card_qty");
if( card_qty == null){
	System.out.println(this.toString+" : card_qty is null" );
}else{
	System.out.println(this.toString+" : card_qty is "+card_qty );
}
String dqty = req.getParameter("dqty");
if( dqty == null){
	System.out.println(this.toString+" : dqty is null" );
}else{
	System.out.println(this.toString+" : dqty is "+dqty );
}
String prt_plac_clsf = req.getParameter("prt_plac_clsf");
if( prt_plac_clsf == null){
	System.out.println(this.toString+" : prt_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : prt_plac_clsf is "+prt_plac_clsf );
}
String nwsp_side_trsm_tm = req.getParameter("nwsp_side_trsm_tm");
if( nwsp_side_trsm_tm == null){
	System.out.println(this.toString+" : nwsp_side_trsm_tm is null" );
}else{
	System.out.println(this.toString+" : nwsp_side_trsm_tm is "+nwsp_side_trsm_tm );
}
String dt_tm_stop_tms = req.getParameter("dt_tm_stop_tms");
if( dt_tm_stop_tms == null){
	System.out.println(this.toString+" : dt_tm_stop_tms is null" );
}else{
	System.out.println(this.toString+" : dt_tm_stop_tms is "+dt_tm_stop_tms );
}
String dt_tm_stop_resn = req.getParameter("dt_tm_stop_resn");
if( dt_tm_stop_resn == null){
	System.out.println(this.toString+" : dt_tm_stop_resn is null" );
}else{
	System.out.println(this.toString+" : dt_tm_stop_resn is "+dt_tm_stop_resn );
}
String fail_tms = req.getParameter("fail_tms");
if( fail_tms == null){
	System.out.println(this.toString+" : fail_tms is null" );
}else{
	System.out.println(this.toString+" : fail_tms is "+fail_tms );
}
String fail_resn = req.getParameter("fail_resn");
if( fail_resn == null){
	System.out.println(this.toString+" : fail_resn is null" );
}else{
	System.out.println(this.toString+" : fail_resn is "+fail_resn );
}
String chrg_pers_nm = req.getParameter("chrg_pers_nm");
if( chrg_pers_nm == null){
	System.out.println(this.toString+" : chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_nm is "+chrg_pers_nm );
}
String cs1_clas_rslt = req.getParameter("cs1_clas_rslt");
if( cs1_clas_rslt == null){
	System.out.println(this.toString+" : cs1_clas_rslt is null" );
}else{
	System.out.println(this.toString+" : cs1_clas_rslt is "+cs1_clas_rslt );
}
String cs1_cnt_rslt = req.getParameter("cs1_cnt_rslt");
if( cs1_cnt_rslt == null){
	System.out.println(this.toString+" : cs1_cnt_rslt is null" );
}else{
	System.out.println(this.toString+" : cs1_cnt_rslt is "+cs1_cnt_rslt );
}
String cs2_clas_rslt = req.getParameter("cs2_clas_rslt");
if( cs2_clas_rslt == null){
	System.out.println(this.toString+" : cs2_clas_rslt is null" );
}else{
	System.out.println(this.toString+" : cs2_clas_rslt is "+cs2_clas_rslt );
}
String cs2_cnt_rslt = req.getParameter("cs2_cnt_rslt");
if( cs2_cnt_rslt == null){
	System.out.println(this.toString+" : cs2_cnt_rslt is null" );
}else{
	System.out.println(this.toString+" : cs2_cnt_rslt is "+cs2_cnt_rslt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String pr_dt = Util.checkString(req.getParameter("pr_dt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String ledt_cd = Util.checkString(req.getParameter("ledt_cd"));
String prt_seq = Util.checkString(req.getParameter("prt_seq"));
String fld_no = Util.checkString(req.getParameter("fld_no"));
String medi_nm = Util.checkString(req.getParameter("medi_nm"));
String ledt_nm = Util.checkString(req.getParameter("ledt_nm"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String prt_ex_tm = Util.checkString(req.getParameter("prt_ex_tm"));
String prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
String qty = Util.checkString(req.getParameter("qty"));
String chg_qty = Util.checkString(req.getParameter("chg_qty"));
String prt_qty = Util.checkString(req.getParameter("prt_qty"));
String bad_nwsp_qty = Util.checkString(req.getParameter("bad_nwsp_qty"));
String card_qty = Util.checkString(req.getParameter("card_qty"));
String dqty = Util.checkString(req.getParameter("dqty"));
String prt_plac_clsf = Util.checkString(req.getParameter("prt_plac_clsf"));
String nwsp_side_trsm_tm = Util.checkString(req.getParameter("nwsp_side_trsm_tm"));
String dt_tm_stop_tms = Util.checkString(req.getParameter("dt_tm_stop_tms"));
String dt_tm_stop_resn = Util.checkString(req.getParameter("dt_tm_stop_resn"));
String fail_tms = Util.checkString(req.getParameter("fail_tms"));
String fail_resn = Util.checkString(req.getParameter("fail_resn"));
String chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
String cs1_clas_rslt = Util.checkString(req.getParameter("cs1_clas_rslt"));
String cs1_cnt_rslt = Util.checkString(req.getParameter("cs1_cnt_rslt"));
String cs2_clas_rslt = Util.checkString(req.getParameter("cs2_clas_rslt"));
String cs2_cnt_rslt = Util.checkString(req.getParameter("cs2_cnt_rslt"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String pr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pr_dt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String ledt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ledt_cd")));
String prt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_seq")));
String fld_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fld_no")));
String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));
String ledt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("ledt_nm")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String prt_ex_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_ex_tm")));
String prt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_end_tm")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String chg_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_qty")));
String prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_qty")));
String bad_nwsp_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("bad_nwsp_qty")));
String card_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("card_qty")));
String dqty = Util.Uni2Ksc(Util.checkString(req.getParameter("dqty")));
String prt_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_clsf")));
String nwsp_side_trsm_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_side_trsm_tm")));
String dt_tm_stop_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_tm_stop_tms")));
String dt_tm_stop_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_tm_stop_resn")));
String fail_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("fail_tms")));
String fail_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("fail_resn")));
String chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_nm")));
String cs1_clas_rslt = Util.Uni2Ksc(Util.checkString(req.getParameter("cs1_clas_rslt")));
String cs1_cnt_rslt = Util.Uni2Ksc(Util.checkString(req.getParameter("cs1_cnt_rslt")));
String cs2_clas_rslt = Util.Uni2Ksc(Util.checkString(req.getParameter("cs2_clas_rslt")));
String cs2_cnt_rslt = Util.Uni2Ksc(Util.checkString(req.getParameter("cs2_cnt_rslt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setPr_dt(pr_dt);
dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setMedi_cd(medi_cd);
dm.setEcnt(ecnt);
dm.setLedt_cd(ledt_cd);
dm.setPrt_seq(prt_seq);
dm.setFld_no(fld_no);
dm.setMedi_nm(medi_nm);
dm.setLedt_nm(ledt_nm);
dm.setIssu_pcnt(issu_pcnt);
dm.setPrt_ex_tm(prt_ex_tm);
dm.setPrt_end_tm(prt_end_tm);
dm.setQty(qty);
dm.setChg_qty(chg_qty);
dm.setPrt_qty(prt_qty);
dm.setBad_nwsp_qty(bad_nwsp_qty);
dm.setCard_qty(card_qty);
dm.setDqty(dqty);
dm.setPrt_plac_clsf(prt_plac_clsf);
dm.setNwsp_side_trsm_tm(nwsp_side_trsm_tm);
dm.setDt_tm_stop_tms(dt_tm_stop_tms);
dm.setDt_tm_stop_resn(dt_tm_stop_resn);
dm.setFail_tms(fail_tms);
dm.setFail_resn(fail_resn);
dm.setChrg_pers_nm(chrg_pers_nm);
dm.setCs1_clas_rslt(cs1_clas_rslt);
dm.setCs1_cnt_rslt(cs1_cnt_rslt);
dm.setCs2_clas_rslt(cs2_clas_rslt);
dm.setCs2_cnt_rslt(cs2_cnt_rslt);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 12:43:02 KST 2009 */