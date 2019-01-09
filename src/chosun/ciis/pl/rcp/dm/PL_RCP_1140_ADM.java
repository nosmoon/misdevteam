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


package chosun.ciis.pl.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.ds.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_1140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String h_rcpm_dt;
	public String h_dlco_cd;
	public String h_dlco_seq;
	public String h_occr_dt;
	public String h_slip_clsf;
	public String h_seq;
	public String h_dd_clos_yn;
	public String h_gurt_amt;
	public String c_budg_clsf_arr;
	public String c_basi_yymm_arr;
	public String c_amt_arr;
	public String c_remk_arr;
	public String c_slip_clsf_arr;
	public String c_seq_arr;
	public String c_subseq_arr;
	public String c_dd_clos_yn_arr;

	public PL_RCP_1140_ADM(){}
	public PL_RCP_1140_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String h_rcpm_dt, String h_dlco_cd, String h_dlco_seq, String h_occr_dt, String h_slip_clsf, String h_seq, String h_dd_clos_yn, String h_gurt_amt, String c_budg_clsf_arr, String c_basi_yymm_arr, String c_amt_arr, String c_remk_arr, String c_slip_clsf_arr, String c_seq_arr, String c_subseq_arr, String c_dd_clos_yn_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.h_rcpm_dt = h_rcpm_dt;
		this.h_dlco_cd = h_dlco_cd;
		this.h_dlco_seq = h_dlco_seq;
		this.h_occr_dt = h_occr_dt;
		this.h_slip_clsf = h_slip_clsf;
		this.h_seq = h_seq;
		this.h_dd_clos_yn = h_dd_clos_yn;
		this.h_gurt_amt = h_gurt_amt;
		this.c_budg_clsf_arr = c_budg_clsf_arr;
		this.c_basi_yymm_arr = c_basi_yymm_arr;
		this.c_amt_arr = c_amt_arr;
		this.c_remk_arr = c_remk_arr;
		this.c_slip_clsf_arr = c_slip_clsf_arr;
		this.c_seq_arr = c_seq_arr;
		this.c_subseq_arr = c_subseq_arr;
		this.c_dd_clos_yn_arr = c_dd_clos_yn_arr;
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

	public void setH_rcpm_dt(String h_rcpm_dt){
		this.h_rcpm_dt = h_rcpm_dt;
	}

	public void setH_dlco_cd(String h_dlco_cd){
		this.h_dlco_cd = h_dlco_cd;
	}

	public void setH_dlco_seq(String h_dlco_seq){
		this.h_dlco_seq = h_dlco_seq;
	}

	public void setH_occr_dt(String h_occr_dt){
		this.h_occr_dt = h_occr_dt;
	}

	public void setH_slip_clsf(String h_slip_clsf){
		this.h_slip_clsf = h_slip_clsf;
	}

	public void setH_seq(String h_seq){
		this.h_seq = h_seq;
	}

	public void setH_dd_clos_yn(String h_dd_clos_yn){
		this.h_dd_clos_yn = h_dd_clos_yn;
	}

	public void setH_gurt_amt(String h_gurt_amt){
		this.h_gurt_amt = h_gurt_amt;
	}

	public void setC_budg_clsf_arr(String c_budg_clsf_arr){
		this.c_budg_clsf_arr = c_budg_clsf_arr;
	}

	public void setC_basi_yymm_arr(String c_basi_yymm_arr){
		this.c_basi_yymm_arr = c_basi_yymm_arr;
	}

	public void setC_amt_arr(String c_amt_arr){
		this.c_amt_arr = c_amt_arr;
	}

	public void setC_remk_arr(String c_remk_arr){
		this.c_remk_arr = c_remk_arr;
	}

	public void setC_slip_clsf_arr(String c_slip_clsf_arr){
		this.c_slip_clsf_arr = c_slip_clsf_arr;
	}

	public void setC_seq_arr(String c_seq_arr){
		this.c_seq_arr = c_seq_arr;
	}

	public void setC_subseq_arr(String c_subseq_arr){
		this.c_subseq_arr = c_subseq_arr;
	}

	public void setC_dd_clos_yn_arr(String c_dd_clos_yn_arr){
		this.c_dd_clos_yn_arr = c_dd_clos_yn_arr;
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

	public String getH_rcpm_dt(){
		return this.h_rcpm_dt;
	}

	public String getH_dlco_cd(){
		return this.h_dlco_cd;
	}

	public String getH_dlco_seq(){
		return this.h_dlco_seq;
	}

	public String getH_occr_dt(){
		return this.h_occr_dt;
	}

	public String getH_slip_clsf(){
		return this.h_slip_clsf;
	}

	public String getH_seq(){
		return this.h_seq;
	}

	public String getH_dd_clos_yn(){
		return this.h_dd_clos_yn;
	}

	public String getH_gurt_amt(){
		return this.h_gurt_amt;
	}

	public String getC_budg_clsf_arr(){
		return this.c_budg_clsf_arr;
	}

	public String getC_basi_yymm_arr(){
		return this.c_basi_yymm_arr;
	}

	public String getC_amt_arr(){
		return this.c_amt_arr;
	}

	public String getC_remk_arr(){
		return this.c_remk_arr;
	}

	public String getC_slip_clsf_arr(){
		return this.c_slip_clsf_arr;
	}

	public String getC_seq_arr(){
		return this.c_seq_arr;
	}

	public String getC_subseq_arr(){
		return this.c_subseq_arr;
	}

	public String getC_dd_clos_yn_arr(){
		return this.c_dd_clos_yn_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_RCP_1140_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_RCP_1140_ADM dm = (PL_RCP_1140_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.h_rcpm_dt);
		cstmt.setString(8, dm.h_dlco_cd);
		cstmt.setString(9, dm.h_dlco_seq);
		cstmt.setString(10, dm.h_occr_dt);
		cstmt.setString(11, dm.h_slip_clsf);
		cstmt.setString(12, dm.h_seq);
		cstmt.setString(13, dm.h_dd_clos_yn);
		cstmt.setString(14, dm.h_gurt_amt);
		cstmt.setString(15, dm.c_budg_clsf_arr);
		cstmt.setString(16, dm.c_basi_yymm_arr);
		cstmt.setString(17, dm.c_amt_arr);
		cstmt.setString(18, dm.c_remk_arr);
		cstmt.setString(19, dm.c_slip_clsf_arr);
		cstmt.setString(20, dm.c_seq_arr);
		cstmt.setString(21, dm.c_subseq_arr);
		cstmt.setString(22, dm.c_dd_clos_yn_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.rcp.ds.PL_RCP_1140_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("h_rcpm_dt = [" + getH_rcpm_dt() + "]");
		System.out.println("h_dlco_cd = [" + getH_dlco_cd() + "]");
		System.out.println("h_dlco_seq = [" + getH_dlco_seq() + "]");
		System.out.println("h_occr_dt = [" + getH_occr_dt() + "]");
		System.out.println("h_slip_clsf = [" + getH_slip_clsf() + "]");
		System.out.println("h_seq = [" + getH_seq() + "]");
		System.out.println("h_dd_clos_yn = [" + getH_dd_clos_yn() + "]");
		System.out.println("h_gurt_amt = [" + getH_gurt_amt() + "]");
		System.out.println("c_budg_clsf_arr = [" + getC_budg_clsf_arr() + "]");
		System.out.println("c_basi_yymm_arr = [" + getC_basi_yymm_arr() + "]");
		System.out.println("c_amt_arr = [" + getC_amt_arr() + "]");
		System.out.println("c_remk_arr = [" + getC_remk_arr() + "]");
		System.out.println("c_slip_clsf_arr = [" + getC_slip_clsf_arr() + "]");
		System.out.println("c_seq_arr = [" + getC_seq_arr() + "]");
		System.out.println("c_subseq_arr = [" + getC_subseq_arr() + "]");
		System.out.println("c_dd_clos_yn_arr = [" + getC_dd_clos_yn_arr() + "]");
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
String h_rcpm_dt = req.getParameter("h_rcpm_dt");
if( h_rcpm_dt == null){
	System.out.println(this.toString+" : h_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : h_rcpm_dt is "+h_rcpm_dt );
}
String h_dlco_cd = req.getParameter("h_dlco_cd");
if( h_dlco_cd == null){
	System.out.println(this.toString+" : h_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : h_dlco_cd is "+h_dlco_cd );
}
String h_dlco_seq = req.getParameter("h_dlco_seq");
if( h_dlco_seq == null){
	System.out.println(this.toString+" : h_dlco_seq is null" );
}else{
	System.out.println(this.toString+" : h_dlco_seq is "+h_dlco_seq );
}
String h_occr_dt = req.getParameter("h_occr_dt");
if( h_occr_dt == null){
	System.out.println(this.toString+" : h_occr_dt is null" );
}else{
	System.out.println(this.toString+" : h_occr_dt is "+h_occr_dt );
}
String h_slip_clsf = req.getParameter("h_slip_clsf");
if( h_slip_clsf == null){
	System.out.println(this.toString+" : h_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : h_slip_clsf is "+h_slip_clsf );
}
String h_seq = req.getParameter("h_seq");
if( h_seq == null){
	System.out.println(this.toString+" : h_seq is null" );
}else{
	System.out.println(this.toString+" : h_seq is "+h_seq );
}
String h_dd_clos_yn = req.getParameter("h_dd_clos_yn");
if( h_dd_clos_yn == null){
	System.out.println(this.toString+" : h_dd_clos_yn is null" );
}else{
	System.out.println(this.toString+" : h_dd_clos_yn is "+h_dd_clos_yn );
}
String h_gurt_amt = req.getParameter("h_gurt_amt");
if( h_gurt_amt == null){
	System.out.println(this.toString+" : h_gurt_amt is null" );
}else{
	System.out.println(this.toString+" : h_gurt_amt is "+h_gurt_amt );
}
String c_budg_clsf_arr = req.getParameter("c_budg_clsf_arr");
if( c_budg_clsf_arr == null){
	System.out.println(this.toString+" : c_budg_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : c_budg_clsf_arr is "+c_budg_clsf_arr );
}
String c_basi_yymm_arr = req.getParameter("c_basi_yymm_arr");
if( c_basi_yymm_arr == null){
	System.out.println(this.toString+" : c_basi_yymm_arr is null" );
}else{
	System.out.println(this.toString+" : c_basi_yymm_arr is "+c_basi_yymm_arr );
}
String c_amt_arr = req.getParameter("c_amt_arr");
if( c_amt_arr == null){
	System.out.println(this.toString+" : c_amt_arr is null" );
}else{
	System.out.println(this.toString+" : c_amt_arr is "+c_amt_arr );
}
String c_remk_arr = req.getParameter("c_remk_arr");
if( c_remk_arr == null){
	System.out.println(this.toString+" : c_remk_arr is null" );
}else{
	System.out.println(this.toString+" : c_remk_arr is "+c_remk_arr );
}
String c_slip_clsf_arr = req.getParameter("c_slip_clsf_arr");
if( c_slip_clsf_arr == null){
	System.out.println(this.toString+" : c_slip_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : c_slip_clsf_arr is "+c_slip_clsf_arr );
}
String c_seq_arr = req.getParameter("c_seq_arr");
if( c_seq_arr == null){
	System.out.println(this.toString+" : c_seq_arr is null" );
}else{
	System.out.println(this.toString+" : c_seq_arr is "+c_seq_arr );
}
String c_subseq_arr = req.getParameter("c_subseq_arr");
if( c_subseq_arr == null){
	System.out.println(this.toString+" : c_subseq_arr is null" );
}else{
	System.out.println(this.toString+" : c_subseq_arr is "+c_subseq_arr );
}
String c_dd_clos_yn_arr = req.getParameter("c_dd_clos_yn_arr");
if( c_dd_clos_yn_arr == null){
	System.out.println(this.toString+" : c_dd_clos_yn_arr is null" );
}else{
	System.out.println(this.toString+" : c_dd_clos_yn_arr is "+c_dd_clos_yn_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String h_rcpm_dt = Util.checkString(req.getParameter("h_rcpm_dt"));
String h_dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));
String h_dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));
String h_occr_dt = Util.checkString(req.getParameter("h_occr_dt"));
String h_slip_clsf = Util.checkString(req.getParameter("h_slip_clsf"));
String h_seq = Util.checkString(req.getParameter("h_seq"));
String h_dd_clos_yn = Util.checkString(req.getParameter("h_dd_clos_yn"));
String h_gurt_amt = Util.checkString(req.getParameter("h_gurt_amt"));
String c_budg_clsf_arr = Util.checkString(req.getParameter("c_budg_clsf_arr"));
String c_basi_yymm_arr = Util.checkString(req.getParameter("c_basi_yymm_arr"));
String c_amt_arr = Util.checkString(req.getParameter("c_amt_arr"));
String c_remk_arr = Util.checkString(req.getParameter("c_remk_arr"));
String c_slip_clsf_arr = Util.checkString(req.getParameter("c_slip_clsf_arr"));
String c_seq_arr = Util.checkString(req.getParameter("c_seq_arr"));
String c_subseq_arr = Util.checkString(req.getParameter("c_subseq_arr"));
String c_dd_clos_yn_arr = Util.checkString(req.getParameter("c_dd_clos_yn_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String h_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("h_rcpm_dt")));
String h_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("h_dlco_cd")));
String h_dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("h_dlco_seq")));
String h_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("h_occr_dt")));
String h_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("h_slip_clsf")));
String h_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("h_seq")));
String h_dd_clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("h_dd_clos_yn")));
String h_gurt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("h_gurt_amt")));
String c_budg_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_budg_clsf_arr")));
String c_basi_yymm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_basi_yymm_arr")));
String c_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_amt_arr")));
String c_remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_remk_arr")));
String c_slip_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_slip_clsf_arr")));
String c_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_seq_arr")));
String c_subseq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_subseq_arr")));
String c_dd_clos_yn_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("c_dd_clos_yn_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setH_rcpm_dt(h_rcpm_dt);
dm.setH_dlco_cd(h_dlco_cd);
dm.setH_dlco_seq(h_dlco_seq);
dm.setH_occr_dt(h_occr_dt);
dm.setH_slip_clsf(h_slip_clsf);
dm.setH_seq(h_seq);
dm.setH_dd_clos_yn(h_dd_clos_yn);
dm.setH_gurt_amt(h_gurt_amt);
dm.setC_budg_clsf_arr(c_budg_clsf_arr);
dm.setC_basi_yymm_arr(c_basi_yymm_arr);
dm.setC_amt_arr(c_amt_arr);
dm.setC_remk_arr(c_remk_arr);
dm.setC_slip_clsf_arr(c_slip_clsf_arr);
dm.setC_seq_arr(c_seq_arr);
dm.setC_subseq_arr(c_subseq_arr);
dm.setC_dd_clos_yn_arr(c_dd_clos_yn_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 15:08:46 KST 2009 */