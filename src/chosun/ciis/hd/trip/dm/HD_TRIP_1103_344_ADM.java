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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1103_344_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String emp_no;
	public String busi_trip_fee_stot;
	public String dd_fee;
	public String food_fee;
	public String dd_stay_fee;
	public String trff_fee;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String mode_tm;
	public String emp_no_tm;
	public String busi_trip_dt_tm;
	public String start_area_tm;
	public String via_area_tm;
	public String ariv_area_tm;
	public String stay_area_tm;
	public String path_clsf_tm;
	public String dd_fee_tm;
	public String food_fee_tm;
	public String stay_clsf_tm;
	public String stay_fee_tm;
	public String trff_fee_tm;
	public String occr_dt_tm;
	public String seq_tm;
	public String sub_seq_tm;
	public String cmpy_cd_tm;
	public String trff_means_cd_tm;
	public String trff_means_etc_tm;
	public String incmg_pers;

	public HD_TRIP_1103_344_ADM(){}
	public HD_TRIP_1103_344_ADM(String mode, String emp_no, String busi_trip_fee_stot, String dd_fee, String food_fee, String dd_stay_fee, String trff_fee, String cmpy_cd, String occr_dt, String seq, String mode_tm, String emp_no_tm, String busi_trip_dt_tm, String start_area_tm, String via_area_tm, String ariv_area_tm, String stay_area_tm, String path_clsf_tm, String dd_fee_tm, String food_fee_tm, String stay_clsf_tm, String stay_fee_tm, String trff_fee_tm, String occr_dt_tm, String seq_tm, String sub_seq_tm, String cmpy_cd_tm, String trff_means_cd_tm, String trff_means_etc_tm, String incmg_pers){
		this.mode = mode;
		this.emp_no = emp_no;
		this.busi_trip_fee_stot = busi_trip_fee_stot;
		this.dd_fee = dd_fee;
		this.food_fee = food_fee;
		this.dd_stay_fee = dd_stay_fee;
		this.trff_fee = trff_fee;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.mode_tm = mode_tm;
		this.emp_no_tm = emp_no_tm;
		this.busi_trip_dt_tm = busi_trip_dt_tm;
		this.start_area_tm = start_area_tm;
		this.via_area_tm = via_area_tm;
		this.ariv_area_tm = ariv_area_tm;
		this.stay_area_tm = stay_area_tm;
		this.path_clsf_tm = path_clsf_tm;
		this.dd_fee_tm = dd_fee_tm;
		this.food_fee_tm = food_fee_tm;
		this.stay_clsf_tm = stay_clsf_tm;
		this.stay_fee_tm = stay_fee_tm;
		this.trff_fee_tm = trff_fee_tm;
		this.occr_dt_tm = occr_dt_tm;
		this.seq_tm = seq_tm;
		this.sub_seq_tm = sub_seq_tm;
		this.cmpy_cd_tm = cmpy_cd_tm;
		this.trff_means_cd_tm = trff_means_cd_tm;
		this.trff_means_etc_tm = trff_means_etc_tm;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setFood_fee(String food_fee){
		this.food_fee = food_fee;
	}

	public void setDd_stay_fee(String dd_stay_fee){
		this.dd_stay_fee = dd_stay_fee;
	}

	public void setTrff_fee(String trff_fee){
		this.trff_fee = trff_fee;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMode_tm(String mode_tm){
		this.mode_tm = mode_tm;
	}

	public void setEmp_no_tm(String emp_no_tm){
		this.emp_no_tm = emp_no_tm;
	}

	public void setBusi_trip_dt_tm(String busi_trip_dt_tm){
		this.busi_trip_dt_tm = busi_trip_dt_tm;
	}

	public void setStart_area_tm(String start_area_tm){
		this.start_area_tm = start_area_tm;
	}

	public void setVia_area_tm(String via_area_tm){
		this.via_area_tm = via_area_tm;
	}

	public void setAriv_area_tm(String ariv_area_tm){
		this.ariv_area_tm = ariv_area_tm;
	}

	public void setStay_area_tm(String stay_area_tm){
		this.stay_area_tm = stay_area_tm;
	}

	public void setPath_clsf_tm(String path_clsf_tm){
		this.path_clsf_tm = path_clsf_tm;
	}

	public void setDd_fee_tm(String dd_fee_tm){
		this.dd_fee_tm = dd_fee_tm;
	}

	public void setFood_fee_tm(String food_fee_tm){
		this.food_fee_tm = food_fee_tm;
	}

	public void setStay_clsf_tm(String stay_clsf_tm){
		this.stay_clsf_tm = stay_clsf_tm;
	}

	public void setStay_fee_tm(String stay_fee_tm){
		this.stay_fee_tm = stay_fee_tm;
	}

	public void setTrff_fee_tm(String trff_fee_tm){
		this.trff_fee_tm = trff_fee_tm;
	}

	public void setOccr_dt_tm(String occr_dt_tm){
		this.occr_dt_tm = occr_dt_tm;
	}

	public void setSeq_tm(String seq_tm){
		this.seq_tm = seq_tm;
	}

	public void setSub_seq_tm(String sub_seq_tm){
		this.sub_seq_tm = sub_seq_tm;
	}

	public void setCmpy_cd_tm(String cmpy_cd_tm){
		this.cmpy_cd_tm = cmpy_cd_tm;
	}

	public void setTrff_means_cd_tm(String trff_means_cd_tm){
		this.trff_means_cd_tm = trff_means_cd_tm;
	}

	public void setTrff_means_etc_tm(String trff_means_etc_tm){
		this.trff_means_etc_tm = trff_means_etc_tm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getFood_fee(){
		return this.food_fee;
	}

	public String getDd_stay_fee(){
		return this.dd_stay_fee;
	}

	public String getTrff_fee(){
		return this.trff_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMode_tm(){
		return this.mode_tm;
	}

	public String getEmp_no_tm(){
		return this.emp_no_tm;
	}

	public String getBusi_trip_dt_tm(){
		return this.busi_trip_dt_tm;
	}

	public String getStart_area_tm(){
		return this.start_area_tm;
	}

	public String getVia_area_tm(){
		return this.via_area_tm;
	}

	public String getAriv_area_tm(){
		return this.ariv_area_tm;
	}

	public String getStay_area_tm(){
		return this.stay_area_tm;
	}

	public String getPath_clsf_tm(){
		return this.path_clsf_tm;
	}

	public String getDd_fee_tm(){
		return this.dd_fee_tm;
	}

	public String getFood_fee_tm(){
		return this.food_fee_tm;
	}

	public String getStay_clsf_tm(){
		return this.stay_clsf_tm;
	}

	public String getStay_fee_tm(){
		return this.stay_fee_tm;
	}

	public String getTrff_fee_tm(){
		return this.trff_fee_tm;
	}

	public String getOccr_dt_tm(){
		return this.occr_dt_tm;
	}

	public String getSeq_tm(){
		return this.seq_tm;
	}

	public String getSub_seq_tm(){
		return this.sub_seq_tm;
	}

	public String getCmpy_cd_tm(){
		return this.cmpy_cd_tm;
	}

	public String getTrff_means_cd_tm(){
		return this.trff_means_cd_tm;
	}

	public String getTrff_means_etc_tm(){
		return this.trff_means_etc_tm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1103_344_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1103_344_ADM dm = (HD_TRIP_1103_344_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.busi_trip_fee_stot);
		cstmt.setString(6, dm.dd_fee);
		cstmt.setString(7, dm.food_fee);
		cstmt.setString(8, dm.dd_stay_fee);
		cstmt.setString(9, dm.trff_fee);
		cstmt.setString(10, dm.cmpy_cd);
		cstmt.setString(11, dm.occr_dt);
		cstmt.setString(12, dm.seq);
		cstmt.setString(13, dm.mode_tm);
		cstmt.setString(14, dm.emp_no_tm);
		cstmt.setString(15, dm.busi_trip_dt_tm);
		cstmt.setString(16, dm.start_area_tm);
		cstmt.setString(17, dm.via_area_tm);
		cstmt.setString(18, dm.ariv_area_tm);
		cstmt.setString(19, dm.stay_area_tm);
		cstmt.setString(20, dm.path_clsf_tm);
		cstmt.setString(21, dm.dd_fee_tm);
		cstmt.setString(22, dm.food_fee_tm);
		cstmt.setString(23, dm.stay_clsf_tm);
		cstmt.setString(24, dm.stay_fee_tm);
		cstmt.setString(25, dm.trff_fee_tm);
		cstmt.setString(26, dm.occr_dt_tm);
		cstmt.setString(27, dm.seq_tm);
		cstmt.setString(28, dm.sub_seq_tm);
		cstmt.setString(29, dm.cmpy_cd_tm);
		cstmt.setString(30, dm.trff_means_cd_tm);
		cstmt.setString(31, dm.trff_means_etc_tm);
		cstmt.setString(32, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1103_344_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("busi_trip_fee_stot = [" + getBusi_trip_fee_stot() + "]");
		System.out.println("dd_fee = [" + getDd_fee() + "]");
		System.out.println("food_fee = [" + getFood_fee() + "]");
		System.out.println("dd_stay_fee = [" + getDd_stay_fee() + "]");
		System.out.println("trff_fee = [" + getTrff_fee() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("mode_tm = [" + getMode_tm() + "]");
		System.out.println("emp_no_tm = [" + getEmp_no_tm() + "]");
		System.out.println("busi_trip_dt_tm = [" + getBusi_trip_dt_tm() + "]");
		System.out.println("start_area_tm = [" + getStart_area_tm() + "]");
		System.out.println("via_area_tm = [" + getVia_area_tm() + "]");
		System.out.println("ariv_area_tm = [" + getAriv_area_tm() + "]");
		System.out.println("stay_area_tm = [" + getStay_area_tm() + "]");
		System.out.println("path_clsf_tm = [" + getPath_clsf_tm() + "]");
		System.out.println("dd_fee_tm = [" + getDd_fee_tm() + "]");
		System.out.println("food_fee_tm = [" + getFood_fee_tm() + "]");
		System.out.println("stay_clsf_tm = [" + getStay_clsf_tm() + "]");
		System.out.println("stay_fee_tm = [" + getStay_fee_tm() + "]");
		System.out.println("trff_fee_tm = [" + getTrff_fee_tm() + "]");
		System.out.println("occr_dt_tm = [" + getOccr_dt_tm() + "]");
		System.out.println("seq_tm = [" + getSeq_tm() + "]");
		System.out.println("sub_seq_tm = [" + getSub_seq_tm() + "]");
		System.out.println("cmpy_cd_tm = [" + getCmpy_cd_tm() + "]");
		System.out.println("trff_means_cd_tm = [" + getTrff_means_cd_tm() + "]");
		System.out.println("trff_means_etc_tm = [" + getTrff_means_etc_tm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String busi_trip_fee_stot = req.getParameter("busi_trip_fee_stot");
if( busi_trip_fee_stot == null){
	System.out.println(this.toString+" : busi_trip_fee_stot is null" );
}else{
	System.out.println(this.toString+" : busi_trip_fee_stot is "+busi_trip_fee_stot );
}
String dd_fee = req.getParameter("dd_fee");
if( dd_fee == null){
	System.out.println(this.toString+" : dd_fee is null" );
}else{
	System.out.println(this.toString+" : dd_fee is "+dd_fee );
}
String food_fee = req.getParameter("food_fee");
if( food_fee == null){
	System.out.println(this.toString+" : food_fee is null" );
}else{
	System.out.println(this.toString+" : food_fee is "+food_fee );
}
String dd_stay_fee = req.getParameter("dd_stay_fee");
if( dd_stay_fee == null){
	System.out.println(this.toString+" : dd_stay_fee is null" );
}else{
	System.out.println(this.toString+" : dd_stay_fee is "+dd_stay_fee );
}
String trff_fee = req.getParameter("trff_fee");
if( trff_fee == null){
	System.out.println(this.toString+" : trff_fee is null" );
}else{
	System.out.println(this.toString+" : trff_fee is "+trff_fee );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String mode_tm = req.getParameter("mode_tm");
if( mode_tm == null){
	System.out.println(this.toString+" : mode_tm is null" );
}else{
	System.out.println(this.toString+" : mode_tm is "+mode_tm );
}
String emp_no_tm = req.getParameter("emp_no_tm");
if( emp_no_tm == null){
	System.out.println(this.toString+" : emp_no_tm is null" );
}else{
	System.out.println(this.toString+" : emp_no_tm is "+emp_no_tm );
}
String busi_trip_dt_tm = req.getParameter("busi_trip_dt_tm");
if( busi_trip_dt_tm == null){
	System.out.println(this.toString+" : busi_trip_dt_tm is null" );
}else{
	System.out.println(this.toString+" : busi_trip_dt_tm is "+busi_trip_dt_tm );
}
String start_area_tm = req.getParameter("start_area_tm");
if( start_area_tm == null){
	System.out.println(this.toString+" : start_area_tm is null" );
}else{
	System.out.println(this.toString+" : start_area_tm is "+start_area_tm );
}
String via_area_tm = req.getParameter("via_area_tm");
if( via_area_tm == null){
	System.out.println(this.toString+" : via_area_tm is null" );
}else{
	System.out.println(this.toString+" : via_area_tm is "+via_area_tm );
}
String ariv_area_tm = req.getParameter("ariv_area_tm");
if( ariv_area_tm == null){
	System.out.println(this.toString+" : ariv_area_tm is null" );
}else{
	System.out.println(this.toString+" : ariv_area_tm is "+ariv_area_tm );
}
String stay_area_tm = req.getParameter("stay_area_tm");
if( stay_area_tm == null){
	System.out.println(this.toString+" : stay_area_tm is null" );
}else{
	System.out.println(this.toString+" : stay_area_tm is "+stay_area_tm );
}
String path_clsf_tm = req.getParameter("path_clsf_tm");
if( path_clsf_tm == null){
	System.out.println(this.toString+" : path_clsf_tm is null" );
}else{
	System.out.println(this.toString+" : path_clsf_tm is "+path_clsf_tm );
}
String dd_fee_tm = req.getParameter("dd_fee_tm");
if( dd_fee_tm == null){
	System.out.println(this.toString+" : dd_fee_tm is null" );
}else{
	System.out.println(this.toString+" : dd_fee_tm is "+dd_fee_tm );
}
String food_fee_tm = req.getParameter("food_fee_tm");
if( food_fee_tm == null){
	System.out.println(this.toString+" : food_fee_tm is null" );
}else{
	System.out.println(this.toString+" : food_fee_tm is "+food_fee_tm );
}
String stay_clsf_tm = req.getParameter("stay_clsf_tm");
if( stay_clsf_tm == null){
	System.out.println(this.toString+" : stay_clsf_tm is null" );
}else{
	System.out.println(this.toString+" : stay_clsf_tm is "+stay_clsf_tm );
}
String stay_fee_tm = req.getParameter("stay_fee_tm");
if( stay_fee_tm == null){
	System.out.println(this.toString+" : stay_fee_tm is null" );
}else{
	System.out.println(this.toString+" : stay_fee_tm is "+stay_fee_tm );
}
String trff_fee_tm = req.getParameter("trff_fee_tm");
if( trff_fee_tm == null){
	System.out.println(this.toString+" : trff_fee_tm is null" );
}else{
	System.out.println(this.toString+" : trff_fee_tm is "+trff_fee_tm );
}
String occr_dt_tm = req.getParameter("occr_dt_tm");
if( occr_dt_tm == null){
	System.out.println(this.toString+" : occr_dt_tm is null" );
}else{
	System.out.println(this.toString+" : occr_dt_tm is "+occr_dt_tm );
}
String seq_tm = req.getParameter("seq_tm");
if( seq_tm == null){
	System.out.println(this.toString+" : seq_tm is null" );
}else{
	System.out.println(this.toString+" : seq_tm is "+seq_tm );
}
String sub_seq_tm = req.getParameter("sub_seq_tm");
if( sub_seq_tm == null){
	System.out.println(this.toString+" : sub_seq_tm is null" );
}else{
	System.out.println(this.toString+" : sub_seq_tm is "+sub_seq_tm );
}
String cmpy_cd_tm = req.getParameter("cmpy_cd_tm");
if( cmpy_cd_tm == null){
	System.out.println(this.toString+" : cmpy_cd_tm is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd_tm is "+cmpy_cd_tm );
}
String trff_means_cd_tm = req.getParameter("trff_means_cd_tm");
if( trff_means_cd_tm == null){
	System.out.println(this.toString+" : trff_means_cd_tm is null" );
}else{
	System.out.println(this.toString+" : trff_means_cd_tm is "+trff_means_cd_tm );
}
String trff_means_etc_tm = req.getParameter("trff_means_etc_tm");
if( trff_means_etc_tm == null){
	System.out.println(this.toString+" : trff_means_etc_tm is null" );
}else{
	System.out.println(this.toString+" : trff_means_etc_tm is "+trff_means_etc_tm );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
String dd_fee = Util.checkString(req.getParameter("dd_fee"));
String food_fee = Util.checkString(req.getParameter("food_fee"));
String dd_stay_fee = Util.checkString(req.getParameter("dd_stay_fee"));
String trff_fee = Util.checkString(req.getParameter("trff_fee"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String mode_tm = Util.checkString(req.getParameter("mode_tm"));
String emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
String busi_trip_dt_tm = Util.checkString(req.getParameter("busi_trip_dt_tm"));
String start_area_tm = Util.checkString(req.getParameter("start_area_tm"));
String via_area_tm = Util.checkString(req.getParameter("via_area_tm"));
String ariv_area_tm = Util.checkString(req.getParameter("ariv_area_tm"));
String stay_area_tm = Util.checkString(req.getParameter("stay_area_tm"));
String path_clsf_tm = Util.checkString(req.getParameter("path_clsf_tm"));
String dd_fee_tm = Util.checkString(req.getParameter("dd_fee_tm"));
String food_fee_tm = Util.checkString(req.getParameter("food_fee_tm"));
String stay_clsf_tm = Util.checkString(req.getParameter("stay_clsf_tm"));
String stay_fee_tm = Util.checkString(req.getParameter("stay_fee_tm"));
String trff_fee_tm = Util.checkString(req.getParameter("trff_fee_tm"));
String occr_dt_tm = Util.checkString(req.getParameter("occr_dt_tm"));
String seq_tm = Util.checkString(req.getParameter("seq_tm"));
String sub_seq_tm = Util.checkString(req.getParameter("sub_seq_tm"));
String cmpy_cd_tm = Util.checkString(req.getParameter("cmpy_cd_tm"));
String trff_means_cd_tm = Util.checkString(req.getParameter("trff_means_cd_tm"));
String trff_means_etc_tm = Util.checkString(req.getParameter("trff_means_etc_tm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String busi_trip_fee_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_fee_stot")));
String dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fee")));
String food_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("food_fee")));
String dd_stay_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_stay_fee")));
String trff_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_fee")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mode_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_tm")));
String emp_no_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_tm")));
String busi_trip_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_dt_tm")));
String start_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_area_tm")));
String via_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("via_area_tm")));
String ariv_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_area_tm")));
String stay_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_area_tm")));
String path_clsf_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("path_clsf_tm")));
String dd_fee_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fee_tm")));
String food_fee_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("food_fee_tm")));
String stay_clsf_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_clsf_tm")));
String stay_fee_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_fee_tm")));
String trff_fee_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_fee_tm")));
String occr_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_tm")));
String seq_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_tm")));
String sub_seq_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq_tm")));
String cmpy_cd_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd_tm")));
String trff_means_cd_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_means_cd_tm")));
String trff_means_etc_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_means_etc_tm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setBusi_trip_fee_stot(busi_trip_fee_stot);
dm.setDd_fee(dd_fee);
dm.setFood_fee(food_fee);
dm.setDd_stay_fee(dd_stay_fee);
dm.setTrff_fee(trff_fee);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setMode_tm(mode_tm);
dm.setEmp_no_tm(emp_no_tm);
dm.setBusi_trip_dt_tm(busi_trip_dt_tm);
dm.setStart_area_tm(start_area_tm);
dm.setVia_area_tm(via_area_tm);
dm.setAriv_area_tm(ariv_area_tm);
dm.setStay_area_tm(stay_area_tm);
dm.setPath_clsf_tm(path_clsf_tm);
dm.setDd_fee_tm(dd_fee_tm);
dm.setFood_fee_tm(food_fee_tm);
dm.setStay_clsf_tm(stay_clsf_tm);
dm.setStay_fee_tm(stay_fee_tm);
dm.setTrff_fee_tm(trff_fee_tm);
dm.setOccr_dt_tm(occr_dt_tm);
dm.setSeq_tm(seq_tm);
dm.setSub_seq_tm(sub_seq_tm);
dm.setCmpy_cd_tm(cmpy_cd_tm);
dm.setTrff_means_cd_tm(trff_means_cd_tm);
dm.setTrff_means_etc_tm(trff_means_etc_tm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 18:39:49 KST 2012 */