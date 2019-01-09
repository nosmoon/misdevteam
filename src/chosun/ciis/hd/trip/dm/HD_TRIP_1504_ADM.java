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


public class HD_TRIP_1504_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String with_seq;
	public String invit_dds;
	public String busi_trip_dds;
	public String adpay_no;
	public String adpay_amt;
	public String expn_reso_no;
	public String ceph_use_yn;
	public String aviat_fee;
	public String fix_aviat_fee;
	public String adjm_aviat_fee;
	public String stay_fee;
	public String fix_stay_fee;
	public String adjm_stay_fee;
	public String dd_fee;
	public String fix_dd_fee;
	public String adjm_dd_fee;
	public String e_mode;
	public String e_cmpy_cd;
	public String e_occr_dt;
	public String e_seq;
	public String e_with_seq;
	public String e_etc_cost_ptcr;
	public String e_etc_cost;
	public String e_fix_etc_cost;
	public String e_adjm_etc_cost;
	public String e_etc_cost_neces;
	public String e_sub_seq;
	public String d_mode;
	public String d_cmpy_cd;
	public String d_occr_dt;
	public String d_seq;
	public String d_with_seq;
	public String d_start_area;
	public String d_dest;
	public String d_busi_trip_cont;
	public String d_sub_seq;
	public String u_ipadd;
	public String u_id;

	public HD_TRIP_1504_ADM(){}
	public HD_TRIP_1504_ADM(String mode, String cmpy_cd, String occr_dt, String seq, String with_seq, String invit_dds, String busi_trip_dds, String adpay_no, String adpay_amt, String expn_reso_no, String ceph_use_yn, String aviat_fee, String fix_aviat_fee, String adjm_aviat_fee, String stay_fee, String fix_stay_fee, String adjm_stay_fee, String dd_fee, String fix_dd_fee, String adjm_dd_fee, String e_mode, String e_cmpy_cd, String e_occr_dt, String e_seq, String e_with_seq, String e_etc_cost_ptcr, String e_etc_cost, String e_fix_etc_cost, String e_adjm_etc_cost, String e_etc_cost_neces, String e_sub_seq, String d_mode, String d_cmpy_cd, String d_occr_dt, String d_seq, String d_with_seq, String d_start_area, String d_dest, String d_busi_trip_cont, String d_sub_seq, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.with_seq = with_seq;
		this.invit_dds = invit_dds;
		this.busi_trip_dds = busi_trip_dds;
		this.adpay_no = adpay_no;
		this.adpay_amt = adpay_amt;
		this.expn_reso_no = expn_reso_no;
		this.ceph_use_yn = ceph_use_yn;
		this.aviat_fee = aviat_fee;
		this.fix_aviat_fee = fix_aviat_fee;
		this.adjm_aviat_fee = adjm_aviat_fee;
		this.stay_fee = stay_fee;
		this.fix_stay_fee = fix_stay_fee;
		this.adjm_stay_fee = adjm_stay_fee;
		this.dd_fee = dd_fee;
		this.fix_dd_fee = fix_dd_fee;
		this.adjm_dd_fee = adjm_dd_fee;
		this.e_mode = e_mode;
		this.e_cmpy_cd = e_cmpy_cd;
		this.e_occr_dt = e_occr_dt;
		this.e_seq = e_seq;
		this.e_with_seq = e_with_seq;
		this.e_etc_cost_ptcr = e_etc_cost_ptcr;
		this.e_etc_cost = e_etc_cost;
		this.e_fix_etc_cost = e_fix_etc_cost;
		this.e_adjm_etc_cost = e_adjm_etc_cost;
		this.e_etc_cost_neces = e_etc_cost_neces;
		this.e_sub_seq = e_sub_seq;
		this.d_mode = d_mode;
		this.d_cmpy_cd = d_cmpy_cd;
		this.d_occr_dt = d_occr_dt;
		this.d_seq = d_seq;
		this.d_with_seq = d_with_seq;
		this.d_start_area = d_start_area;
		this.d_dest = d_dest;
		this.d_busi_trip_cont = d_busi_trip_cont;
		this.d_sub_seq = d_sub_seq;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setWith_seq(String with_seq){
		this.with_seq = with_seq;
	}

	public void setInvit_dds(String invit_dds){
		this.invit_dds = invit_dds;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setAdpay_no(String adpay_no){
		this.adpay_no = adpay_no;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setExpn_reso_no(String expn_reso_no){
		this.expn_reso_no = expn_reso_no;
	}

	public void setCeph_use_yn(String ceph_use_yn){
		this.ceph_use_yn = ceph_use_yn;
	}

	public void setAviat_fee(String aviat_fee){
		this.aviat_fee = aviat_fee;
	}

	public void setFix_aviat_fee(String fix_aviat_fee){
		this.fix_aviat_fee = fix_aviat_fee;
	}

	public void setAdjm_aviat_fee(String adjm_aviat_fee){
		this.adjm_aviat_fee = adjm_aviat_fee;
	}

	public void setStay_fee(String stay_fee){
		this.stay_fee = stay_fee;
	}

	public void setFix_stay_fee(String fix_stay_fee){
		this.fix_stay_fee = fix_stay_fee;
	}

	public void setAdjm_stay_fee(String adjm_stay_fee){
		this.adjm_stay_fee = adjm_stay_fee;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setFix_dd_fee(String fix_dd_fee){
		this.fix_dd_fee = fix_dd_fee;
	}

	public void setAdjm_dd_fee(String adjm_dd_fee){
		this.adjm_dd_fee = adjm_dd_fee;
	}

	public void setE_mode(String e_mode){
		this.e_mode = e_mode;
	}

	public void setE_cmpy_cd(String e_cmpy_cd){
		this.e_cmpy_cd = e_cmpy_cd;
	}

	public void setE_occr_dt(String e_occr_dt){
		this.e_occr_dt = e_occr_dt;
	}

	public void setE_seq(String e_seq){
		this.e_seq = e_seq;
	}

	public void setE_with_seq(String e_with_seq){
		this.e_with_seq = e_with_seq;
	}

	public void setE_etc_cost_ptcr(String e_etc_cost_ptcr){
		this.e_etc_cost_ptcr = e_etc_cost_ptcr;
	}

	public void setE_etc_cost(String e_etc_cost){
		this.e_etc_cost = e_etc_cost;
	}

	public void setE_fix_etc_cost(String e_fix_etc_cost){
		this.e_fix_etc_cost = e_fix_etc_cost;
	}

	public void setE_adjm_etc_cost(String e_adjm_etc_cost){
		this.e_adjm_etc_cost = e_adjm_etc_cost;
	}

	public void setE_etc_cost_neces(String e_etc_cost_neces){
		this.e_etc_cost_neces = e_etc_cost_neces;
	}

	public void setE_sub_seq(String e_sub_seq){
		this.e_sub_seq = e_sub_seq;
	}

	public void setD_mode(String d_mode){
		this.d_mode = d_mode;
	}

	public void setD_cmpy_cd(String d_cmpy_cd){
		this.d_cmpy_cd = d_cmpy_cd;
	}

	public void setD_occr_dt(String d_occr_dt){
		this.d_occr_dt = d_occr_dt;
	}

	public void setD_seq(String d_seq){
		this.d_seq = d_seq;
	}

	public void setD_with_seq(String d_with_seq){
		this.d_with_seq = d_with_seq;
	}

	public void setD_start_area(String d_start_area){
		this.d_start_area = d_start_area;
	}

	public void setD_dest(String d_dest){
		this.d_dest = d_dest;
	}

	public void setD_busi_trip_cont(String d_busi_trip_cont){
		this.d_busi_trip_cont = d_busi_trip_cont;
	}

	public void setD_sub_seq(String d_sub_seq){
		this.d_sub_seq = d_sub_seq;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
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

	public String getWith_seq(){
		return this.with_seq;
	}

	public String getInvit_dds(){
		return this.invit_dds;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getAdpay_no(){
		return this.adpay_no;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getExpn_reso_no(){
		return this.expn_reso_no;
	}

	public String getCeph_use_yn(){
		return this.ceph_use_yn;
	}

	public String getAviat_fee(){
		return this.aviat_fee;
	}

	public String getFix_aviat_fee(){
		return this.fix_aviat_fee;
	}

	public String getAdjm_aviat_fee(){
		return this.adjm_aviat_fee;
	}

	public String getStay_fee(){
		return this.stay_fee;
	}

	public String getFix_stay_fee(){
		return this.fix_stay_fee;
	}

	public String getAdjm_stay_fee(){
		return this.adjm_stay_fee;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getFix_dd_fee(){
		return this.fix_dd_fee;
	}

	public String getAdjm_dd_fee(){
		return this.adjm_dd_fee;
	}

	public String getE_mode(){
		return this.e_mode;
	}

	public String getE_cmpy_cd(){
		return this.e_cmpy_cd;
	}

	public String getE_occr_dt(){
		return this.e_occr_dt;
	}

	public String getE_seq(){
		return this.e_seq;
	}

	public String getE_with_seq(){
		return this.e_with_seq;
	}

	public String getE_etc_cost_ptcr(){
		return this.e_etc_cost_ptcr;
	}

	public String getE_etc_cost(){
		return this.e_etc_cost;
	}

	public String getE_fix_etc_cost(){
		return this.e_fix_etc_cost;
	}

	public String getE_adjm_etc_cost(){
		return this.e_adjm_etc_cost;
	}

	public String getE_etc_cost_neces(){
		return this.e_etc_cost_neces;
	}

	public String getE_sub_seq(){
		return this.e_sub_seq;
	}

	public String getD_mode(){
		return this.d_mode;
	}

	public String getD_cmpy_cd(){
		return this.d_cmpy_cd;
	}

	public String getD_occr_dt(){
		return this.d_occr_dt;
	}

	public String getD_seq(){
		return this.d_seq;
	}

	public String getD_with_seq(){
		return this.d_with_seq;
	}

	public String getD_start_area(){
		return this.d_start_area;
	}

	public String getD_dest(){
		return this.d_dest;
	}

	public String getD_busi_trip_cont(){
		return this.d_busi_trip_cont;
	}

	public String getD_sub_seq(){
		return this.d_sub_seq;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1504_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1504_ADM dm = (HD_TRIP_1504_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.with_seq);
		cstmt.setString(8, dm.invit_dds);
		cstmt.setString(9, dm.busi_trip_dds);
		cstmt.setString(10, dm.adpay_no);
		cstmt.setString(11, dm.adpay_amt);
		cstmt.setString(12, dm.expn_reso_no);
		cstmt.setString(13, dm.ceph_use_yn);
		cstmt.setString(14, dm.aviat_fee);
		cstmt.setString(15, dm.fix_aviat_fee);
		cstmt.setString(16, dm.adjm_aviat_fee);
		cstmt.setString(17, dm.stay_fee);
		cstmt.setString(18, dm.fix_stay_fee);
		cstmt.setString(19, dm.adjm_stay_fee);
		cstmt.setString(20, dm.dd_fee);
		cstmt.setString(21, dm.fix_dd_fee);
		cstmt.setString(22, dm.adjm_dd_fee);
		cstmt.setString(23, dm.e_mode);
		cstmt.setString(24, dm.e_cmpy_cd);
		cstmt.setString(25, dm.e_occr_dt);
		cstmt.setString(26, dm.e_seq);
		cstmt.setString(27, dm.e_with_seq);
		cstmt.setString(28, dm.e_etc_cost_ptcr);
		cstmt.setString(29, dm.e_etc_cost);
		cstmt.setString(30, dm.e_fix_etc_cost);
		cstmt.setString(31, dm.e_adjm_etc_cost);
		cstmt.setString(32, dm.e_etc_cost_neces);
		cstmt.setString(33, dm.e_sub_seq);
		cstmt.setString(34, dm.d_mode);
		cstmt.setString(35, dm.d_cmpy_cd);
		cstmt.setString(36, dm.d_occr_dt);
		cstmt.setString(37, dm.d_seq);
		cstmt.setString(38, dm.d_with_seq);
		cstmt.setString(39, dm.d_start_area);
		cstmt.setString(40, dm.d_dest);
		cstmt.setString(41, dm.d_busi_trip_cont);
		cstmt.setString(42, dm.d_sub_seq);
		cstmt.setString(43, dm.u_ipadd);
		cstmt.setString(44, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1504_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("with_seq = [" + getWith_seq() + "]");
		System.out.println("invit_dds = [" + getInvit_dds() + "]");
		System.out.println("busi_trip_dds = [" + getBusi_trip_dds() + "]");
		System.out.println("adpay_no = [" + getAdpay_no() + "]");
		System.out.println("adpay_amt = [" + getAdpay_amt() + "]");
		System.out.println("expn_reso_no = [" + getExpn_reso_no() + "]");
		System.out.println("ceph_use_yn = [" + getCeph_use_yn() + "]");
		System.out.println("aviat_fee = [" + getAviat_fee() + "]");
		System.out.println("fix_aviat_fee = [" + getFix_aviat_fee() + "]");
		System.out.println("adjm_aviat_fee = [" + getAdjm_aviat_fee() + "]");
		System.out.println("stay_fee = [" + getStay_fee() + "]");
		System.out.println("fix_stay_fee = [" + getFix_stay_fee() + "]");
		System.out.println("adjm_stay_fee = [" + getAdjm_stay_fee() + "]");
		System.out.println("dd_fee = [" + getDd_fee() + "]");
		System.out.println("fix_dd_fee = [" + getFix_dd_fee() + "]");
		System.out.println("adjm_dd_fee = [" + getAdjm_dd_fee() + "]");
		System.out.println("e_mode = [" + getE_mode() + "]");
		System.out.println("e_cmpy_cd = [" + getE_cmpy_cd() + "]");
		System.out.println("e_occr_dt = [" + getE_occr_dt() + "]");
		System.out.println("e_seq = [" + getE_seq() + "]");
		System.out.println("e_with_seq = [" + getE_with_seq() + "]");
		System.out.println("e_etc_cost_ptcr = [" + getE_etc_cost_ptcr() + "]");
		System.out.println("e_etc_cost = [" + getE_etc_cost() + "]");
		System.out.println("e_fix_etc_cost = [" + getE_fix_etc_cost() + "]");
		System.out.println("e_adjm_etc_cost = [" + getE_adjm_etc_cost() + "]");
		System.out.println("e_etc_cost_neces = [" + getE_etc_cost_neces() + "]");
		System.out.println("e_sub_seq = [" + getE_sub_seq() + "]");
		System.out.println("d_mode = [" + getD_mode() + "]");
		System.out.println("d_cmpy_cd = [" + getD_cmpy_cd() + "]");
		System.out.println("d_occr_dt = [" + getD_occr_dt() + "]");
		System.out.println("d_seq = [" + getD_seq() + "]");
		System.out.println("d_with_seq = [" + getD_with_seq() + "]");
		System.out.println("d_start_area = [" + getD_start_area() + "]");
		System.out.println("d_dest = [" + getD_dest() + "]");
		System.out.println("d_busi_trip_cont = [" + getD_busi_trip_cont() + "]");
		System.out.println("d_sub_seq = [" + getD_sub_seq() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String with_seq = req.getParameter("with_seq");
if( with_seq == null){
	System.out.println(this.toString+" : with_seq is null" );
}else{
	System.out.println(this.toString+" : with_seq is "+with_seq );
}
String invit_dds = req.getParameter("invit_dds");
if( invit_dds == null){
	System.out.println(this.toString+" : invit_dds is null" );
}else{
	System.out.println(this.toString+" : invit_dds is "+invit_dds );
}
String busi_trip_dds = req.getParameter("busi_trip_dds");
if( busi_trip_dds == null){
	System.out.println(this.toString+" : busi_trip_dds is null" );
}else{
	System.out.println(this.toString+" : busi_trip_dds is "+busi_trip_dds );
}
String adpay_no = req.getParameter("adpay_no");
if( adpay_no == null){
	System.out.println(this.toString+" : adpay_no is null" );
}else{
	System.out.println(this.toString+" : adpay_no is "+adpay_no );
}
String adpay_amt = req.getParameter("adpay_amt");
if( adpay_amt == null){
	System.out.println(this.toString+" : adpay_amt is null" );
}else{
	System.out.println(this.toString+" : adpay_amt is "+adpay_amt );
}
String expn_reso_no = req.getParameter("expn_reso_no");
if( expn_reso_no == null){
	System.out.println(this.toString+" : expn_reso_no is null" );
}else{
	System.out.println(this.toString+" : expn_reso_no is "+expn_reso_no );
}
String ceph_use_yn = req.getParameter("ceph_use_yn");
if( ceph_use_yn == null){
	System.out.println(this.toString+" : ceph_use_yn is null" );
}else{
	System.out.println(this.toString+" : ceph_use_yn is "+ceph_use_yn );
}
String aviat_fee = req.getParameter("aviat_fee");
if( aviat_fee == null){
	System.out.println(this.toString+" : aviat_fee is null" );
}else{
	System.out.println(this.toString+" : aviat_fee is "+aviat_fee );
}
String fix_aviat_fee = req.getParameter("fix_aviat_fee");
if( fix_aviat_fee == null){
	System.out.println(this.toString+" : fix_aviat_fee is null" );
}else{
	System.out.println(this.toString+" : fix_aviat_fee is "+fix_aviat_fee );
}
String adjm_aviat_fee = req.getParameter("adjm_aviat_fee");
if( adjm_aviat_fee == null){
	System.out.println(this.toString+" : adjm_aviat_fee is null" );
}else{
	System.out.println(this.toString+" : adjm_aviat_fee is "+adjm_aviat_fee );
}
String stay_fee = req.getParameter("stay_fee");
if( stay_fee == null){
	System.out.println(this.toString+" : stay_fee is null" );
}else{
	System.out.println(this.toString+" : stay_fee is "+stay_fee );
}
String fix_stay_fee = req.getParameter("fix_stay_fee");
if( fix_stay_fee == null){
	System.out.println(this.toString+" : fix_stay_fee is null" );
}else{
	System.out.println(this.toString+" : fix_stay_fee is "+fix_stay_fee );
}
String adjm_stay_fee = req.getParameter("adjm_stay_fee");
if( adjm_stay_fee == null){
	System.out.println(this.toString+" : adjm_stay_fee is null" );
}else{
	System.out.println(this.toString+" : adjm_stay_fee is "+adjm_stay_fee );
}
String dd_fee = req.getParameter("dd_fee");
if( dd_fee == null){
	System.out.println(this.toString+" : dd_fee is null" );
}else{
	System.out.println(this.toString+" : dd_fee is "+dd_fee );
}
String fix_dd_fee = req.getParameter("fix_dd_fee");
if( fix_dd_fee == null){
	System.out.println(this.toString+" : fix_dd_fee is null" );
}else{
	System.out.println(this.toString+" : fix_dd_fee is "+fix_dd_fee );
}
String adjm_dd_fee = req.getParameter("adjm_dd_fee");
if( adjm_dd_fee == null){
	System.out.println(this.toString+" : adjm_dd_fee is null" );
}else{
	System.out.println(this.toString+" : adjm_dd_fee is "+adjm_dd_fee );
}
String e_mode = req.getParameter("e_mode");
if( e_mode == null){
	System.out.println(this.toString+" : e_mode is null" );
}else{
	System.out.println(this.toString+" : e_mode is "+e_mode );
}
String e_cmpy_cd = req.getParameter("e_cmpy_cd");
if( e_cmpy_cd == null){
	System.out.println(this.toString+" : e_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : e_cmpy_cd is "+e_cmpy_cd );
}
String e_occr_dt = req.getParameter("e_occr_dt");
if( e_occr_dt == null){
	System.out.println(this.toString+" : e_occr_dt is null" );
}else{
	System.out.println(this.toString+" : e_occr_dt is "+e_occr_dt );
}
String e_seq = req.getParameter("e_seq");
if( e_seq == null){
	System.out.println(this.toString+" : e_seq is null" );
}else{
	System.out.println(this.toString+" : e_seq is "+e_seq );
}
String e_with_seq = req.getParameter("e_with_seq");
if( e_with_seq == null){
	System.out.println(this.toString+" : e_with_seq is null" );
}else{
	System.out.println(this.toString+" : e_with_seq is "+e_with_seq );
}
String e_etc_cost_ptcr = req.getParameter("e_etc_cost_ptcr");
if( e_etc_cost_ptcr == null){
	System.out.println(this.toString+" : e_etc_cost_ptcr is null" );
}else{
	System.out.println(this.toString+" : e_etc_cost_ptcr is "+e_etc_cost_ptcr );
}
String e_etc_cost = req.getParameter("e_etc_cost");
if( e_etc_cost == null){
	System.out.println(this.toString+" : e_etc_cost is null" );
}else{
	System.out.println(this.toString+" : e_etc_cost is "+e_etc_cost );
}
String e_fix_etc_cost = req.getParameter("e_fix_etc_cost");
if( e_fix_etc_cost == null){
	System.out.println(this.toString+" : e_fix_etc_cost is null" );
}else{
	System.out.println(this.toString+" : e_fix_etc_cost is "+e_fix_etc_cost );
}
String e_adjm_etc_cost = req.getParameter("e_adjm_etc_cost");
if( e_adjm_etc_cost == null){
	System.out.println(this.toString+" : e_adjm_etc_cost is null" );
}else{
	System.out.println(this.toString+" : e_adjm_etc_cost is "+e_adjm_etc_cost );
}
String e_etc_cost_neces = req.getParameter("e_etc_cost_neces");
if( e_etc_cost_neces == null){
	System.out.println(this.toString+" : e_etc_cost_neces is null" );
}else{
	System.out.println(this.toString+" : e_etc_cost_neces is "+e_etc_cost_neces );
}
String e_sub_seq = req.getParameter("e_sub_seq");
if( e_sub_seq == null){
	System.out.println(this.toString+" : e_sub_seq is null" );
}else{
	System.out.println(this.toString+" : e_sub_seq is "+e_sub_seq );
}
String d_mode = req.getParameter("d_mode");
if( d_mode == null){
	System.out.println(this.toString+" : d_mode is null" );
}else{
	System.out.println(this.toString+" : d_mode is "+d_mode );
}
String d_cmpy_cd = req.getParameter("d_cmpy_cd");
if( d_cmpy_cd == null){
	System.out.println(this.toString+" : d_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : d_cmpy_cd is "+d_cmpy_cd );
}
String d_occr_dt = req.getParameter("d_occr_dt");
if( d_occr_dt == null){
	System.out.println(this.toString+" : d_occr_dt is null" );
}else{
	System.out.println(this.toString+" : d_occr_dt is "+d_occr_dt );
}
String d_seq = req.getParameter("d_seq");
if( d_seq == null){
	System.out.println(this.toString+" : d_seq is null" );
}else{
	System.out.println(this.toString+" : d_seq is "+d_seq );
}
String d_with_seq = req.getParameter("d_with_seq");
if( d_with_seq == null){
	System.out.println(this.toString+" : d_with_seq is null" );
}else{
	System.out.println(this.toString+" : d_with_seq is "+d_with_seq );
}
String d_start_area = req.getParameter("d_start_area");
if( d_start_area == null){
	System.out.println(this.toString+" : d_start_area is null" );
}else{
	System.out.println(this.toString+" : d_start_area is "+d_start_area );
}
String d_dest = req.getParameter("d_dest");
if( d_dest == null){
	System.out.println(this.toString+" : d_dest is null" );
}else{
	System.out.println(this.toString+" : d_dest is "+d_dest );
}
String d_busi_trip_cont = req.getParameter("d_busi_trip_cont");
if( d_busi_trip_cont == null){
	System.out.println(this.toString+" : d_busi_trip_cont is null" );
}else{
	System.out.println(this.toString+" : d_busi_trip_cont is "+d_busi_trip_cont );
}
String d_sub_seq = req.getParameter("d_sub_seq");
if( d_sub_seq == null){
	System.out.println(this.toString+" : d_sub_seq is null" );
}else{
	System.out.println(this.toString+" : d_sub_seq is "+d_sub_seq );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String with_seq = Util.checkString(req.getParameter("with_seq"));
String invit_dds = Util.checkString(req.getParameter("invit_dds"));
String busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
String adpay_no = Util.checkString(req.getParameter("adpay_no"));
String adpay_amt = Util.checkString(req.getParameter("adpay_amt"));
String expn_reso_no = Util.checkString(req.getParameter("expn_reso_no"));
String ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
String aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
String fix_aviat_fee = Util.checkString(req.getParameter("fix_aviat_fee"));
String adjm_aviat_fee = Util.checkString(req.getParameter("adjm_aviat_fee"));
String stay_fee = Util.checkString(req.getParameter("stay_fee"));
String fix_stay_fee = Util.checkString(req.getParameter("fix_stay_fee"));
String adjm_stay_fee = Util.checkString(req.getParameter("adjm_stay_fee"));
String dd_fee = Util.checkString(req.getParameter("dd_fee"));
String fix_dd_fee = Util.checkString(req.getParameter("fix_dd_fee"));
String adjm_dd_fee = Util.checkString(req.getParameter("adjm_dd_fee"));
String e_mode = Util.checkString(req.getParameter("e_mode"));
String e_cmpy_cd = Util.checkString(req.getParameter("e_cmpy_cd"));
String e_occr_dt = Util.checkString(req.getParameter("e_occr_dt"));
String e_seq = Util.checkString(req.getParameter("e_seq"));
String e_with_seq = Util.checkString(req.getParameter("e_with_seq"));
String e_etc_cost_ptcr = Util.checkString(req.getParameter("e_etc_cost_ptcr"));
String e_etc_cost = Util.checkString(req.getParameter("e_etc_cost"));
String e_fix_etc_cost = Util.checkString(req.getParameter("e_fix_etc_cost"));
String e_adjm_etc_cost = Util.checkString(req.getParameter("e_adjm_etc_cost"));
String e_etc_cost_neces = Util.checkString(req.getParameter("e_etc_cost_neces"));
String e_sub_seq = Util.checkString(req.getParameter("e_sub_seq"));
String d_mode = Util.checkString(req.getParameter("d_mode"));
String d_cmpy_cd = Util.checkString(req.getParameter("d_cmpy_cd"));
String d_occr_dt = Util.checkString(req.getParameter("d_occr_dt"));
String d_seq = Util.checkString(req.getParameter("d_seq"));
String d_with_seq = Util.checkString(req.getParameter("d_with_seq"));
String d_start_area = Util.checkString(req.getParameter("d_start_area"));
String d_dest = Util.checkString(req.getParameter("d_dest"));
String d_busi_trip_cont = Util.checkString(req.getParameter("d_busi_trip_cont"));
String d_sub_seq = Util.checkString(req.getParameter("d_sub_seq"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("with_seq")));
String invit_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("invit_dds")));
String busi_trip_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_dds")));
String adpay_no = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_no")));
String adpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_amt")));
String expn_reso_no = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_reso_no")));
String ceph_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("ceph_use_yn")));
String aviat_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("aviat_fee")));
String fix_aviat_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_aviat_fee")));
String adjm_aviat_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_aviat_fee")));
String stay_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_fee")));
String fix_stay_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_stay_fee")));
String adjm_stay_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_stay_fee")));
String dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fee")));
String fix_dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_dd_fee")));
String adjm_dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_dd_fee")));
String e_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("e_mode")));
String e_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("e_cmpy_cd")));
String e_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("e_occr_dt")));
String e_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("e_seq")));
String e_with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("e_with_seq")));
String e_etc_cost_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("e_etc_cost_ptcr")));
String e_etc_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("e_etc_cost")));
String e_fix_etc_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("e_fix_etc_cost")));
String e_adjm_etc_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("e_adjm_etc_cost")));
String e_etc_cost_neces = Util.Uni2Ksc(Util.checkString(req.getParameter("e_etc_cost_neces")));
String e_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("e_sub_seq")));
String d_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("d_mode")));
String d_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("d_cmpy_cd")));
String d_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("d_occr_dt")));
String d_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_seq")));
String d_with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_with_seq")));
String d_start_area = Util.Uni2Ksc(Util.checkString(req.getParameter("d_start_area")));
String d_dest = Util.Uni2Ksc(Util.checkString(req.getParameter("d_dest")));
String d_busi_trip_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("d_busi_trip_cont")));
String d_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_sub_seq")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setWith_seq(with_seq);
dm.setInvit_dds(invit_dds);
dm.setBusi_trip_dds(busi_trip_dds);
dm.setAdpay_no(adpay_no);
dm.setAdpay_amt(adpay_amt);
dm.setExpn_reso_no(expn_reso_no);
dm.setCeph_use_yn(ceph_use_yn);
dm.setAviat_fee(aviat_fee);
dm.setFix_aviat_fee(fix_aviat_fee);
dm.setAdjm_aviat_fee(adjm_aviat_fee);
dm.setStay_fee(stay_fee);
dm.setFix_stay_fee(fix_stay_fee);
dm.setAdjm_stay_fee(adjm_stay_fee);
dm.setDd_fee(dd_fee);
dm.setFix_dd_fee(fix_dd_fee);
dm.setAdjm_dd_fee(adjm_dd_fee);
dm.setE_mode(e_mode);
dm.setE_cmpy_cd(e_cmpy_cd);
dm.setE_occr_dt(e_occr_dt);
dm.setE_seq(e_seq);
dm.setE_with_seq(e_with_seq);
dm.setE_etc_cost_ptcr(e_etc_cost_ptcr);
dm.setE_etc_cost(e_etc_cost);
dm.setE_fix_etc_cost(e_fix_etc_cost);
dm.setE_adjm_etc_cost(e_adjm_etc_cost);
dm.setE_etc_cost_neces(e_etc_cost_neces);
dm.setE_sub_seq(e_sub_seq);
dm.setD_mode(d_mode);
dm.setD_cmpy_cd(d_cmpy_cd);
dm.setD_occr_dt(d_occr_dt);
dm.setD_seq(d_seq);
dm.setD_with_seq(d_with_seq);
dm.setD_start_area(d_start_area);
dm.setD_dest(d_dest);
dm.setD_busi_trip_cont(d_busi_trip_cont);
dm.setD_sub_seq(d_sub_seq);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 13:45:47 KST 2009 */