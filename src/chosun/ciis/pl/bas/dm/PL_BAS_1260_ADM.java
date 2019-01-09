/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1260_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode_arr;
	public String dlco_cd_arr;
	public String dlco_seq_arr;
	public String colt_seq_arr;
	public String colt_clsf_arr;
	public String setup_stat_arr;
	public String colt_obj_nm_arr;
	public String prty_rank_arr;
	public String acqr_dt_arr;
	public String colt_setup_amt_arr;
	public String pub_ann_amt_arr;
	public String plcw_arr;
	public String gurt_strt_dd_arr;
	public String gurt_end_dd_arr;
	public String insr_stock_no_arr;
	public String remk_arr;

	public PL_BAS_1260_ADM(){}
	public PL_BAS_1260_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String mode_arr, String dlco_cd_arr, String dlco_seq_arr, String colt_seq_arr, String colt_clsf_arr, String setup_stat_arr, String colt_obj_nm_arr, String prty_rank_arr, String acqr_dt_arr, String colt_setup_amt_arr, String pub_ann_amt_arr, String plcw_arr, String gurt_strt_dd_arr, String gurt_end_dd_arr, String insr_stock_no_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode_arr = mode_arr;
		this.dlco_cd_arr = dlco_cd_arr;
		this.dlco_seq_arr = dlco_seq_arr;
		this.colt_seq_arr = colt_seq_arr;
		this.colt_clsf_arr = colt_clsf_arr;
		this.setup_stat_arr = setup_stat_arr;
		this.colt_obj_nm_arr = colt_obj_nm_arr;
		this.prty_rank_arr = prty_rank_arr;
		this.acqr_dt_arr = acqr_dt_arr;
		this.colt_setup_amt_arr = colt_setup_amt_arr;
		this.pub_ann_amt_arr = pub_ann_amt_arr;
		this.plcw_arr = plcw_arr;
		this.gurt_strt_dd_arr = gurt_strt_dd_arr;
		this.gurt_end_dd_arr = gurt_end_dd_arr;
		this.insr_stock_no_arr = insr_stock_no_arr;
		this.remk_arr = remk_arr;
	}

	public void setAcc_flag(String acc_flag){
		this.acc_flag = acc_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMode_arr(String mode_arr){
		this.mode_arr = mode_arr;
	}

	public void setDlco_cd_arr(String dlco_cd_arr){
		this.dlco_cd_arr = dlco_cd_arr;
	}

	public void setDlco_seq_arr(String dlco_seq_arr){
		this.dlco_seq_arr = dlco_seq_arr;
	}

	public void setColt_seq_arr(String colt_seq_arr){
		this.colt_seq_arr = colt_seq_arr;
	}

	public void setColt_clsf_arr(String colt_clsf_arr){
		this.colt_clsf_arr = colt_clsf_arr;
	}

	public void setSetup_stat_arr(String setup_stat_arr){
		this.setup_stat_arr = setup_stat_arr;
	}

	public void setColt_obj_nm_arr(String colt_obj_nm_arr){
		this.colt_obj_nm_arr = colt_obj_nm_arr;
	}

	public void setPrty_rank_arr(String prty_rank_arr){
		this.prty_rank_arr = prty_rank_arr;
	}

	public void setAcqr_dt_arr(String acqr_dt_arr){
		this.acqr_dt_arr = acqr_dt_arr;
	}

	public void setColt_setup_amt_arr(String colt_setup_amt_arr){
		this.colt_setup_amt_arr = colt_setup_amt_arr;
	}

	public void setPub_ann_amt_arr(String pub_ann_amt_arr){
		this.pub_ann_amt_arr = pub_ann_amt_arr;
	}

	public void setPlcw_arr(String plcw_arr){
		this.plcw_arr = plcw_arr;
	}

	public void setGurt_strt_dd_arr(String gurt_strt_dd_arr){
		this.gurt_strt_dd_arr = gurt_strt_dd_arr;
	}

	public void setGurt_end_dd_arr(String gurt_end_dd_arr){
		this.gurt_end_dd_arr = gurt_end_dd_arr;
	}

	public void setInsr_stock_no_arr(String insr_stock_no_arr){
		this.insr_stock_no_arr = insr_stock_no_arr;
	}

	public void setRemk_arr(String remk_arr){
		this.remk_arr = remk_arr;
	}

	public String getAcc_flag(){
		return this.acc_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMode_arr(){
		return this.mode_arr;
	}

	public String getDlco_cd_arr(){
		return this.dlco_cd_arr;
	}

	public String getDlco_seq_arr(){
		return this.dlco_seq_arr;
	}

	public String getColt_seq_arr(){
		return this.colt_seq_arr;
	}

	public String getColt_clsf_arr(){
		return this.colt_clsf_arr;
	}

	public String getSetup_stat_arr(){
		return this.setup_stat_arr;
	}

	public String getColt_obj_nm_arr(){
		return this.colt_obj_nm_arr;
	}

	public String getPrty_rank_arr(){
		return this.prty_rank_arr;
	}

	public String getAcqr_dt_arr(){
		return this.acqr_dt_arr;
	}

	public String getColt_setup_amt_arr(){
		return this.colt_setup_amt_arr;
	}

	public String getPub_ann_amt_arr(){
		return this.pub_ann_amt_arr;
	}

	public String getPlcw_arr(){
		return this.plcw_arr;
	}

	public String getGurt_strt_dd_arr(){
		return this.gurt_strt_dd_arr;
	}

	public String getGurt_end_dd_arr(){
		return this.gurt_end_dd_arr;
	}

	public String getInsr_stock_no_arr(){
		return this.insr_stock_no_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1260_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1260_ADM dm = (PL_BAS_1260_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.mode_arr);
		cstmt.setString(8, dm.dlco_cd_arr);
		cstmt.setString(9, dm.dlco_seq_arr);
		cstmt.setString(10, dm.colt_seq_arr);
		cstmt.setString(11, dm.colt_clsf_arr);
		cstmt.setString(12, dm.setup_stat_arr);
		cstmt.setString(13, dm.colt_obj_nm_arr);
		cstmt.setString(14, dm.prty_rank_arr);
		cstmt.setString(15, dm.acqr_dt_arr);
		cstmt.setString(16, dm.colt_setup_amt_arr);
		cstmt.setString(17, dm.pub_ann_amt_arr);
		cstmt.setString(18, dm.plcw_arr);
		cstmt.setString(19, dm.gurt_strt_dd_arr);
		cstmt.setString(20, dm.gurt_end_dd_arr);
		cstmt.setString(21, dm.insr_stock_no_arr);
		cstmt.setString(22, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1260_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("mode_arr = [" + getMode_arr() + "]");
		System.out.println("dlco_cd_arr = [" + getDlco_cd_arr() + "]");
		System.out.println("dlco_seq_arr = [" + getDlco_seq_arr() + "]");
		System.out.println("colt_seq_arr = [" + getColt_seq_arr() + "]");
		System.out.println("colt_clsf_arr = [" + getColt_clsf_arr() + "]");
		System.out.println("setup_stat_arr = [" + getSetup_stat_arr() + "]");
		System.out.println("colt_obj_nm_arr = [" + getColt_obj_nm_arr() + "]");
		System.out.println("prty_rank_arr = [" + getPrty_rank_arr() + "]");
		System.out.println("acqr_dt_arr = [" + getAcqr_dt_arr() + "]");
		System.out.println("colt_setup_amt_arr = [" + getColt_setup_amt_arr() + "]");
		System.out.println("pub_ann_amt_arr = [" + getPub_ann_amt_arr() + "]");
		System.out.println("plcw_arr = [" + getPlcw_arr() + "]");
		System.out.println("gurt_strt_dd_arr = [" + getGurt_strt_dd_arr() + "]");
		System.out.println("gurt_end_dd_arr = [" + getGurt_end_dd_arr() + "]");
		System.out.println("insr_stock_no_arr = [" + getInsr_stock_no_arr() + "]");
		System.out.println("remk_arr = [" + getRemk_arr() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acc_flag = req.getParameter("acc_flag");
if( acc_flag == null){
	System.out.println(this.toString+" : acc_flag is null" );
}else{
	System.out.println(this.toString+" : acc_flag is "+acc_flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String mode_arr = req.getParameter("mode_arr");
if( mode_arr == null){
	System.out.println(this.toString+" : mode_arr is null" );
}else{
	System.out.println(this.toString+" : mode_arr is "+mode_arr );
}
String dlco_cd_arr = req.getParameter("dlco_cd_arr");
if( dlco_cd_arr == null){
	System.out.println(this.toString+" : dlco_cd_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_arr is "+dlco_cd_arr );
}
String dlco_seq_arr = req.getParameter("dlco_seq_arr");
if( dlco_seq_arr == null){
	System.out.println(this.toString+" : dlco_seq_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_seq_arr is "+dlco_seq_arr );
}
String colt_seq_arr = req.getParameter("colt_seq_arr");
if( colt_seq_arr == null){
	System.out.println(this.toString+" : colt_seq_arr is null" );
}else{
	System.out.println(this.toString+" : colt_seq_arr is "+colt_seq_arr );
}
String colt_clsf_arr = req.getParameter("colt_clsf_arr");
if( colt_clsf_arr == null){
	System.out.println(this.toString+" : colt_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : colt_clsf_arr is "+colt_clsf_arr );
}
String setup_stat_arr = req.getParameter("setup_stat_arr");
if( setup_stat_arr == null){
	System.out.println(this.toString+" : setup_stat_arr is null" );
}else{
	System.out.println(this.toString+" : setup_stat_arr is "+setup_stat_arr );
}
String colt_obj_nm_arr = req.getParameter("colt_obj_nm_arr");
if( colt_obj_nm_arr == null){
	System.out.println(this.toString+" : colt_obj_nm_arr is null" );
}else{
	System.out.println(this.toString+" : colt_obj_nm_arr is "+colt_obj_nm_arr );
}
String prty_rank_arr = req.getParameter("prty_rank_arr");
if( prty_rank_arr == null){
	System.out.println(this.toString+" : prty_rank_arr is null" );
}else{
	System.out.println(this.toString+" : prty_rank_arr is "+prty_rank_arr );
}
String acqr_dt_arr = req.getParameter("acqr_dt_arr");
if( acqr_dt_arr == null){
	System.out.println(this.toString+" : acqr_dt_arr is null" );
}else{
	System.out.println(this.toString+" : acqr_dt_arr is "+acqr_dt_arr );
}
String colt_setup_amt_arr = req.getParameter("colt_setup_amt_arr");
if( colt_setup_amt_arr == null){
	System.out.println(this.toString+" : colt_setup_amt_arr is null" );
}else{
	System.out.println(this.toString+" : colt_setup_amt_arr is "+colt_setup_amt_arr );
}
String pub_ann_amt_arr = req.getParameter("pub_ann_amt_arr");
if( pub_ann_amt_arr == null){
	System.out.println(this.toString+" : pub_ann_amt_arr is null" );
}else{
	System.out.println(this.toString+" : pub_ann_amt_arr is "+pub_ann_amt_arr );
}
String plcw_arr = req.getParameter("plcw_arr");
if( plcw_arr == null){
	System.out.println(this.toString+" : plcw_arr is null" );
}else{
	System.out.println(this.toString+" : plcw_arr is "+plcw_arr );
}
String gurt_strt_dd_arr = req.getParameter("gurt_strt_dd_arr");
if( gurt_strt_dd_arr == null){
	System.out.println(this.toString+" : gurt_strt_dd_arr is null" );
}else{
	System.out.println(this.toString+" : gurt_strt_dd_arr is "+gurt_strt_dd_arr );
}
String gurt_end_dd_arr = req.getParameter("gurt_end_dd_arr");
if( gurt_end_dd_arr == null){
	System.out.println(this.toString+" : gurt_end_dd_arr is null" );
}else{
	System.out.println(this.toString+" : gurt_end_dd_arr is "+gurt_end_dd_arr );
}
String insr_stock_no_arr = req.getParameter("insr_stock_no_arr");
if( insr_stock_no_arr == null){
	System.out.println(this.toString+" : insr_stock_no_arr is null" );
}else{
	System.out.println(this.toString+" : insr_stock_no_arr is "+insr_stock_no_arr );
}
String remk_arr = req.getParameter("remk_arr");
if( remk_arr == null){
	System.out.println(this.toString+" : remk_arr is null" );
}else{
	System.out.println(this.toString+" : remk_arr is "+remk_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String dlco_cd_arr = Util.checkString(req.getParameter("dlco_cd_arr"));
String dlco_seq_arr = Util.checkString(req.getParameter("dlco_seq_arr"));
String colt_seq_arr = Util.checkString(req.getParameter("colt_seq_arr"));
String colt_clsf_arr = Util.checkString(req.getParameter("colt_clsf_arr"));
String setup_stat_arr = Util.checkString(req.getParameter("setup_stat_arr"));
String colt_obj_nm_arr = Util.checkString(req.getParameter("colt_obj_nm_arr"));
String prty_rank_arr = Util.checkString(req.getParameter("prty_rank_arr"));
String acqr_dt_arr = Util.checkString(req.getParameter("acqr_dt_arr"));
String colt_setup_amt_arr = Util.checkString(req.getParameter("colt_setup_amt_arr"));
String pub_ann_amt_arr = Util.checkString(req.getParameter("pub_ann_amt_arr"));
String plcw_arr = Util.checkString(req.getParameter("plcw_arr"));
String gurt_strt_dd_arr = Util.checkString(req.getParameter("gurt_strt_dd_arr"));
String gurt_end_dd_arr = Util.checkString(req.getParameter("gurt_end_dd_arr"));
String insr_stock_no_arr = Util.checkString(req.getParameter("insr_stock_no_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_arr")));
String dlco_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq_arr")));
String colt_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_seq_arr")));
String colt_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_clsf_arr")));
String setup_stat_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("setup_stat_arr")));
String colt_obj_nm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_obj_nm_arr")));
String prty_rank_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("prty_rank_arr")));
String acqr_dt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_dt_arr")));
String colt_setup_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_setup_amt_arr")));
String pub_ann_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("pub_ann_amt_arr")));
String plcw_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("plcw_arr")));
String gurt_strt_dd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_strt_dd_arr")));
String gurt_end_dd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_end_dd_arr")));
String insr_stock_no_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_stock_no_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode_arr(mode_arr);
dm.setDlco_cd_arr(dlco_cd_arr);
dm.setDlco_seq_arr(dlco_seq_arr);
dm.setColt_seq_arr(colt_seq_arr);
dm.setColt_clsf_arr(colt_clsf_arr);
dm.setSetup_stat_arr(setup_stat_arr);
dm.setColt_obj_nm_arr(colt_obj_nm_arr);
dm.setPrty_rank_arr(prty_rank_arr);
dm.setAcqr_dt_arr(acqr_dt_arr);
dm.setColt_setup_amt_arr(colt_setup_amt_arr);
dm.setPub_ann_amt_arr(pub_ann_amt_arr);
dm.setPlcw_arr(plcw_arr);
dm.setGurt_strt_dd_arr(gurt_strt_dd_arr);
dm.setGurt_end_dd_arr(gurt_end_dd_arr);
dm.setInsr_stock_no_arr(insr_stock_no_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */