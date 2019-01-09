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


public class HD_TRIP_1302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String with_seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String natn_cd;
	public String busi_trip_purp;
	public String busi_trip_dest;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String busi_trip_dds;
	public String invit_instt;
	public String busi_trip_fee_burd_clsf;
	public String busi_trip_neces;
	public String aviat_fee;
	public String stay_fee;
	public String dd_fee;
	public String ceph_use_yn;
	public String busi_trip_fee_stot;
	public String remk;
	public String proc_stat;
	public String genl_affrs_clsf;
	public String g_mode;
	public String g_cmpy_cd;
	public String g_emp_no;
	public String g_occr_dt;
	public String g_seq;
	public String g_with_seq;
	public String g_flnm;
	public String g_dept_cd;
	public String g_dty_cd;
	public String g_posi_cd;
	public String d_mode;
	public String d_cmpy_cd;
	public String d_emp_no;
	public String d_occr_dt;
	public String d_seq;
	public String d_sub_seq;
	public String d_with_seq;
	public String d_start_area;
	public String d_midl_start_dt;
	public String d_dest;
	public String d_busi_trip_cont;
	public String e_mode;
	public String e_cmpy_cd;
	public String e_emp_no;
	public String e_occr_dt;
	public String e_seq;
	public String e_sub_seq;
	public String e_with_seq;
	public String e_etc_cost_ptcr;
	public String e_etc_cost;
	public String e_etc_cost_neces;
	public String u_ipadd;
	public String u_id;

	public HD_TRIP_1302_ADM(){}
	public HD_TRIP_1302_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String with_seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String natn_cd, String busi_trip_purp, String busi_trip_dest, String busi_trip_frdt, String busi_trip_todt, String busi_trip_dds, String invit_instt, String busi_trip_fee_burd_clsf, String busi_trip_neces, String aviat_fee, String stay_fee, String dd_fee, String ceph_use_yn, String busi_trip_fee_stot, String remk, String proc_stat, String genl_affrs_clsf, String g_mode, String g_cmpy_cd, String g_emp_no, String g_occr_dt, String g_seq, String g_with_seq, String g_flnm, String g_dept_cd, String g_dty_cd, String g_posi_cd, String d_mode, String d_cmpy_cd, String d_emp_no, String d_occr_dt, String d_seq, String d_sub_seq, String d_with_seq, String d_start_area, String d_midl_start_dt, String d_dest, String d_busi_trip_cont, String e_mode, String e_cmpy_cd, String e_emp_no, String e_occr_dt, String e_seq, String e_sub_seq, String e_with_seq, String e_etc_cost_ptcr, String e_etc_cost, String e_etc_cost_neces, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.with_seq = with_seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.natn_cd = natn_cd;
		this.busi_trip_purp = busi_trip_purp;
		this.busi_trip_dest = busi_trip_dest;
		this.busi_trip_frdt = busi_trip_frdt;
		this.busi_trip_todt = busi_trip_todt;
		this.busi_trip_dds = busi_trip_dds;
		this.invit_instt = invit_instt;
		this.busi_trip_fee_burd_clsf = busi_trip_fee_burd_clsf;
		this.busi_trip_neces = busi_trip_neces;
		this.aviat_fee = aviat_fee;
		this.stay_fee = stay_fee;
		this.dd_fee = dd_fee;
		this.ceph_use_yn = ceph_use_yn;
		this.busi_trip_fee_stot = busi_trip_fee_stot;
		this.remk = remk;
		this.proc_stat = proc_stat;
		this.genl_affrs_clsf = genl_affrs_clsf;
		this.g_mode = g_mode;
		this.g_cmpy_cd = g_cmpy_cd;
		this.g_emp_no = g_emp_no;
		this.g_occr_dt = g_occr_dt;
		this.g_seq = g_seq;
		this.g_with_seq = g_with_seq;
		this.g_flnm = g_flnm;
		this.g_dept_cd = g_dept_cd;
		this.g_dty_cd = g_dty_cd;
		this.g_posi_cd = g_posi_cd;
		this.d_mode = d_mode;
		this.d_cmpy_cd = d_cmpy_cd;
		this.d_emp_no = d_emp_no;
		this.d_occr_dt = d_occr_dt;
		this.d_seq = d_seq;
		this.d_sub_seq = d_sub_seq;
		this.d_with_seq = d_with_seq;
		this.d_start_area = d_start_area;
		this.d_midl_start_dt = d_midl_start_dt;
		this.d_dest = d_dest;
		this.d_busi_trip_cont = d_busi_trip_cont;
		this.e_mode = e_mode;
		this.e_cmpy_cd = e_cmpy_cd;
		this.e_emp_no = e_emp_no;
		this.e_occr_dt = e_occr_dt;
		this.e_seq = e_seq;
		this.e_sub_seq = e_sub_seq;
		this.e_with_seq = e_with_seq;
		this.e_etc_cost_ptcr = e_etc_cost_ptcr;
		this.e_etc_cost = e_etc_cost;
		this.e_etc_cost_neces = e_etc_cost_neces;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setBusi_trip_dest(String busi_trip_dest){
		this.busi_trip_dest = busi_trip_dest;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setInvit_instt(String invit_instt){
		this.invit_instt = invit_instt;
	}

	public void setBusi_trip_fee_burd_clsf(String busi_trip_fee_burd_clsf){
		this.busi_trip_fee_burd_clsf = busi_trip_fee_burd_clsf;
	}

	public void setBusi_trip_neces(String busi_trip_neces){
		this.busi_trip_neces = busi_trip_neces;
	}

	public void setAviat_fee(String aviat_fee){
		this.aviat_fee = aviat_fee;
	}

	public void setStay_fee(String stay_fee){
		this.stay_fee = stay_fee;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setCeph_use_yn(String ceph_use_yn){
		this.ceph_use_yn = ceph_use_yn;
	}

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setGenl_affrs_clsf(String genl_affrs_clsf){
		this.genl_affrs_clsf = genl_affrs_clsf;
	}

	public void setG_mode(String g_mode){
		this.g_mode = g_mode;
	}

	public void setG_cmpy_cd(String g_cmpy_cd){
		this.g_cmpy_cd = g_cmpy_cd;
	}

	public void setG_emp_no(String g_emp_no){
		this.g_emp_no = g_emp_no;
	}

	public void setG_occr_dt(String g_occr_dt){
		this.g_occr_dt = g_occr_dt;
	}

	public void setG_seq(String g_seq){
		this.g_seq = g_seq;
	}

	public void setG_with_seq(String g_with_seq){
		this.g_with_seq = g_with_seq;
	}

	public void setG_flnm(String g_flnm){
		this.g_flnm = g_flnm;
	}

	public void setG_dept_cd(String g_dept_cd){
		this.g_dept_cd = g_dept_cd;
	}

	public void setG_dty_cd(String g_dty_cd){
		this.g_dty_cd = g_dty_cd;
	}

	public void setG_posi_cd(String g_posi_cd){
		this.g_posi_cd = g_posi_cd;
	}

	public void setD_mode(String d_mode){
		this.d_mode = d_mode;
	}

	public void setD_cmpy_cd(String d_cmpy_cd){
		this.d_cmpy_cd = d_cmpy_cd;
	}

	public void setD_emp_no(String d_emp_no){
		this.d_emp_no = d_emp_no;
	}

	public void setD_occr_dt(String d_occr_dt){
		this.d_occr_dt = d_occr_dt;
	}

	public void setD_seq(String d_seq){
		this.d_seq = d_seq;
	}

	public void setD_sub_seq(String d_sub_seq){
		this.d_sub_seq = d_sub_seq;
	}

	public void setD_with_seq(String d_with_seq){
		this.d_with_seq = d_with_seq;
	}

	public void setD_start_area(String d_start_area){
		this.d_start_area = d_start_area;
	}

	public void setD_midl_start_dt(String d_midl_start_dt){
		this.d_midl_start_dt = d_midl_start_dt;
	}

	public void setD_dest(String d_dest){
		this.d_dest = d_dest;
	}

	public void setD_busi_trip_cont(String d_busi_trip_cont){
		this.d_busi_trip_cont = d_busi_trip_cont;
	}

	public void setE_mode(String e_mode){
		this.e_mode = e_mode;
	}

	public void setE_cmpy_cd(String e_cmpy_cd){
		this.e_cmpy_cd = e_cmpy_cd;
	}

	public void setE_emp_no(String e_emp_no){
		this.e_emp_no = e_emp_no;
	}

	public void setE_occr_dt(String e_occr_dt){
		this.e_occr_dt = e_occr_dt;
	}

	public void setE_seq(String e_seq){
		this.e_seq = e_seq;
	}

	public void setE_sub_seq(String e_sub_seq){
		this.e_sub_seq = e_sub_seq;
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

	public void setE_etc_cost_neces(String e_etc_cost_neces){
		this.e_etc_cost_neces = e_etc_cost_neces;
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

	public String getEmp_no(){
		return this.emp_no;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getBusi_trip_dest(){
		return this.busi_trip_dest;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getInvit_instt(){
		return this.invit_instt;
	}

	public String getBusi_trip_fee_burd_clsf(){
		return this.busi_trip_fee_burd_clsf;
	}

	public String getBusi_trip_neces(){
		return this.busi_trip_neces;
	}

	public String getAviat_fee(){
		return this.aviat_fee;
	}

	public String getStay_fee(){
		return this.stay_fee;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getCeph_use_yn(){
		return this.ceph_use_yn;
	}

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getGenl_affrs_clsf(){
		return this.genl_affrs_clsf;
	}

	public String getG_mode(){
		return this.g_mode;
	}

	public String getG_cmpy_cd(){
		return this.g_cmpy_cd;
	}

	public String getG_emp_no(){
		return this.g_emp_no;
	}

	public String getG_occr_dt(){
		return this.g_occr_dt;
	}

	public String getG_seq(){
		return this.g_seq;
	}

	public String getG_with_seq(){
		return this.g_with_seq;
	}

	public String getG_flnm(){
		return this.g_flnm;
	}

	public String getG_dept_cd(){
		return this.g_dept_cd;
	}

	public String getG_dty_cd(){
		return this.g_dty_cd;
	}

	public String getG_posi_cd(){
		return this.g_posi_cd;
	}

	public String getD_mode(){
		return this.d_mode;
	}

	public String getD_cmpy_cd(){
		return this.d_cmpy_cd;
	}

	public String getD_emp_no(){
		return this.d_emp_no;
	}

	public String getD_occr_dt(){
		return this.d_occr_dt;
	}

	public String getD_seq(){
		return this.d_seq;
	}

	public String getD_sub_seq(){
		return this.d_sub_seq;
	}

	public String getD_with_seq(){
		return this.d_with_seq;
	}

	public String getD_start_area(){
		return this.d_start_area;
	}

	public String getD_midl_start_dt(){
		return this.d_midl_start_dt;
	}

	public String getD_dest(){
		return this.d_dest;
	}

	public String getD_busi_trip_cont(){
		return this.d_busi_trip_cont;
	}

	public String getE_mode(){
		return this.e_mode;
	}

	public String getE_cmpy_cd(){
		return this.e_cmpy_cd;
	}

	public String getE_emp_no(){
		return this.e_emp_no;
	}

	public String getE_occr_dt(){
		return this.e_occr_dt;
	}

	public String getE_seq(){
		return this.e_seq;
	}

	public String getE_sub_seq(){
		return this.e_sub_seq;
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

	public String getE_etc_cost_neces(){
		return this.e_etc_cost_neces;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1302_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1302_ADM dm = (HD_TRIP_1302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.with_seq);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.dty_cd);
		cstmt.setString(12, dm.posi_cd);
		cstmt.setString(13, dm.natn_cd);
		cstmt.setString(14, dm.busi_trip_purp);
		cstmt.setString(15, dm.busi_trip_dest);
		cstmt.setString(16, dm.busi_trip_frdt);
		cstmt.setString(17, dm.busi_trip_todt);
		cstmt.setString(18, dm.busi_trip_dds);
		cstmt.setString(19, dm.invit_instt);
		cstmt.setString(20, dm.busi_trip_fee_burd_clsf);
		cstmt.setString(21, dm.busi_trip_neces);
		cstmt.setString(22, dm.aviat_fee);
		cstmt.setString(23, dm.stay_fee);
		cstmt.setString(24, dm.dd_fee);
		cstmt.setString(25, dm.ceph_use_yn);
		cstmt.setString(26, dm.busi_trip_fee_stot);
		cstmt.setString(27, dm.remk);
		cstmt.setString(28, dm.proc_stat);
		cstmt.setString(29, dm.genl_affrs_clsf);
		cstmt.setString(30, dm.g_mode);
		cstmt.setString(31, dm.g_cmpy_cd);
		cstmt.setString(32, dm.g_emp_no);
		cstmt.setString(33, dm.g_occr_dt);
		cstmt.setString(34, dm.g_seq);
		cstmt.setString(35, dm.g_with_seq);
		cstmt.setString(36, dm.g_flnm);
		cstmt.setString(37, dm.g_dept_cd);
		cstmt.setString(38, dm.g_dty_cd);
		cstmt.setString(39, dm.g_posi_cd);
		cstmt.setString(40, dm.d_mode);
		cstmt.setString(41, dm.d_cmpy_cd);
		cstmt.setString(42, dm.d_emp_no);
		cstmt.setString(43, dm.d_occr_dt);
		cstmt.setString(44, dm.d_seq);
		cstmt.setString(45, dm.d_sub_seq);
		cstmt.setString(46, dm.d_with_seq);
		cstmt.setString(47, dm.d_start_area);
		cstmt.setString(48, dm.d_midl_start_dt);
		cstmt.setString(49, dm.d_dest);
		cstmt.setString(50, dm.d_busi_trip_cont);
		cstmt.setString(51, dm.e_mode);
		cstmt.setString(52, dm.e_cmpy_cd);
		cstmt.setString(53, dm.e_emp_no);
		cstmt.setString(54, dm.e_occr_dt);
		cstmt.setString(55, dm.e_seq);
		cstmt.setString(56, dm.e_sub_seq);
		cstmt.setString(57, dm.e_with_seq);
		cstmt.setString(58, dm.e_etc_cost_ptcr);
		cstmt.setString(59, dm.e_etc_cost);
		cstmt.setString(60, dm.e_etc_cost_neces);
		cstmt.setString(61, dm.u_ipadd);
		cstmt.setString(62, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1302_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("with_seq = [" + getWith_seq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("busi_trip_purp = [" + getBusi_trip_purp() + "]");
		System.out.println("busi_trip_dest = [" + getBusi_trip_dest() + "]");
		System.out.println("busi_trip_frdt = [" + getBusi_trip_frdt() + "]");
		System.out.println("busi_trip_todt = [" + getBusi_trip_todt() + "]");
		System.out.println("busi_trip_dds = [" + getBusi_trip_dds() + "]");
		System.out.println("invit_instt = [" + getInvit_instt() + "]");
		System.out.println("busi_trip_fee_burd_clsf = [" + getBusi_trip_fee_burd_clsf() + "]");
		System.out.println("busi_trip_neces = [" + getBusi_trip_neces() + "]");
		System.out.println("aviat_fee = [" + getAviat_fee() + "]");
		System.out.println("stay_fee = [" + getStay_fee() + "]");
		System.out.println("dd_fee = [" + getDd_fee() + "]");
		System.out.println("ceph_use_yn = [" + getCeph_use_yn() + "]");
		System.out.println("busi_trip_fee_stot = [" + getBusi_trip_fee_stot() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("genl_affrs_clsf = [" + getGenl_affrs_clsf() + "]");
		System.out.println("g_mode = [" + getG_mode() + "]");
		System.out.println("g_cmpy_cd = [" + getG_cmpy_cd() + "]");
		System.out.println("g_emp_no = [" + getG_emp_no() + "]");
		System.out.println("g_occr_dt = [" + getG_occr_dt() + "]");
		System.out.println("g_seq = [" + getG_seq() + "]");
		System.out.println("g_with_seq = [" + getG_with_seq() + "]");
		System.out.println("g_flnm = [" + getG_flnm() + "]");
		System.out.println("g_dept_cd = [" + getG_dept_cd() + "]");
		System.out.println("g_dty_cd = [" + getG_dty_cd() + "]");
		System.out.println("g_posi_cd = [" + getG_posi_cd() + "]");
		System.out.println("d_mode = [" + getD_mode() + "]");
		System.out.println("d_cmpy_cd = [" + getD_cmpy_cd() + "]");
		System.out.println("d_emp_no = [" + getD_emp_no() + "]");
		System.out.println("d_occr_dt = [" + getD_occr_dt() + "]");
		System.out.println("d_seq = [" + getD_seq() + "]");
		System.out.println("d_sub_seq = [" + getD_sub_seq() + "]");
		System.out.println("d_with_seq = [" + getD_with_seq() + "]");
		System.out.println("d_start_area = [" + getD_start_area() + "]");
		System.out.println("d_midl_start_dt = [" + getD_midl_start_dt() + "]");
		System.out.println("d_dest = [" + getD_dest() + "]");
		System.out.println("d_busi_trip_cont = [" + getD_busi_trip_cont() + "]");
		System.out.println("e_mode = [" + getE_mode() + "]");
		System.out.println("e_cmpy_cd = [" + getE_cmpy_cd() + "]");
		System.out.println("e_emp_no = [" + getE_emp_no() + "]");
		System.out.println("e_occr_dt = [" + getE_occr_dt() + "]");
		System.out.println("e_seq = [" + getE_seq() + "]");
		System.out.println("e_sub_seq = [" + getE_sub_seq() + "]");
		System.out.println("e_with_seq = [" + getE_with_seq() + "]");
		System.out.println("e_etc_cost_ptcr = [" + getE_etc_cost_ptcr() + "]");
		System.out.println("e_etc_cost = [" + getE_etc_cost() + "]");
		System.out.println("e_etc_cost_neces = [" + getE_etc_cost_neces() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String busi_trip_purp = req.getParameter("busi_trip_purp");
if( busi_trip_purp == null){
	System.out.println(this.toString+" : busi_trip_purp is null" );
}else{
	System.out.println(this.toString+" : busi_trip_purp is "+busi_trip_purp );
}
String busi_trip_dest = req.getParameter("busi_trip_dest");
if( busi_trip_dest == null){
	System.out.println(this.toString+" : busi_trip_dest is null" );
}else{
	System.out.println(this.toString+" : busi_trip_dest is "+busi_trip_dest );
}
String busi_trip_frdt = req.getParameter("busi_trip_frdt");
if( busi_trip_frdt == null){
	System.out.println(this.toString+" : busi_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_frdt is "+busi_trip_frdt );
}
String busi_trip_todt = req.getParameter("busi_trip_todt");
if( busi_trip_todt == null){
	System.out.println(this.toString+" : busi_trip_todt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_todt is "+busi_trip_todt );
}
String busi_trip_dds = req.getParameter("busi_trip_dds");
if( busi_trip_dds == null){
	System.out.println(this.toString+" : busi_trip_dds is null" );
}else{
	System.out.println(this.toString+" : busi_trip_dds is "+busi_trip_dds );
}
String invit_instt = req.getParameter("invit_instt");
if( invit_instt == null){
	System.out.println(this.toString+" : invit_instt is null" );
}else{
	System.out.println(this.toString+" : invit_instt is "+invit_instt );
}
String busi_trip_fee_burd_clsf = req.getParameter("busi_trip_fee_burd_clsf");
if( busi_trip_fee_burd_clsf == null){
	System.out.println(this.toString+" : busi_trip_fee_burd_clsf is null" );
}else{
	System.out.println(this.toString+" : busi_trip_fee_burd_clsf is "+busi_trip_fee_burd_clsf );
}
String busi_trip_neces = req.getParameter("busi_trip_neces");
if( busi_trip_neces == null){
	System.out.println(this.toString+" : busi_trip_neces is null" );
}else{
	System.out.println(this.toString+" : busi_trip_neces is "+busi_trip_neces );
}
String aviat_fee = req.getParameter("aviat_fee");
if( aviat_fee == null){
	System.out.println(this.toString+" : aviat_fee is null" );
}else{
	System.out.println(this.toString+" : aviat_fee is "+aviat_fee );
}
String stay_fee = req.getParameter("stay_fee");
if( stay_fee == null){
	System.out.println(this.toString+" : stay_fee is null" );
}else{
	System.out.println(this.toString+" : stay_fee is "+stay_fee );
}
String dd_fee = req.getParameter("dd_fee");
if( dd_fee == null){
	System.out.println(this.toString+" : dd_fee is null" );
}else{
	System.out.println(this.toString+" : dd_fee is "+dd_fee );
}
String ceph_use_yn = req.getParameter("ceph_use_yn");
if( ceph_use_yn == null){
	System.out.println(this.toString+" : ceph_use_yn is null" );
}else{
	System.out.println(this.toString+" : ceph_use_yn is "+ceph_use_yn );
}
String busi_trip_fee_stot = req.getParameter("busi_trip_fee_stot");
if( busi_trip_fee_stot == null){
	System.out.println(this.toString+" : busi_trip_fee_stot is null" );
}else{
	System.out.println(this.toString+" : busi_trip_fee_stot is "+busi_trip_fee_stot );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String genl_affrs_clsf = req.getParameter("genl_affrs_clsf");
if( genl_affrs_clsf == null){
	System.out.println(this.toString+" : genl_affrs_clsf is null" );
}else{
	System.out.println(this.toString+" : genl_affrs_clsf is "+genl_affrs_clsf );
}
String g_mode = req.getParameter("g_mode");
if( g_mode == null){
	System.out.println(this.toString+" : g_mode is null" );
}else{
	System.out.println(this.toString+" : g_mode is "+g_mode );
}
String g_cmpy_cd = req.getParameter("g_cmpy_cd");
if( g_cmpy_cd == null){
	System.out.println(this.toString+" : g_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : g_cmpy_cd is "+g_cmpy_cd );
}
String g_emp_no = req.getParameter("g_emp_no");
if( g_emp_no == null){
	System.out.println(this.toString+" : g_emp_no is null" );
}else{
	System.out.println(this.toString+" : g_emp_no is "+g_emp_no );
}
String g_occr_dt = req.getParameter("g_occr_dt");
if( g_occr_dt == null){
	System.out.println(this.toString+" : g_occr_dt is null" );
}else{
	System.out.println(this.toString+" : g_occr_dt is "+g_occr_dt );
}
String g_seq = req.getParameter("g_seq");
if( g_seq == null){
	System.out.println(this.toString+" : g_seq is null" );
}else{
	System.out.println(this.toString+" : g_seq is "+g_seq );
}
String g_with_seq = req.getParameter("g_with_seq");
if( g_with_seq == null){
	System.out.println(this.toString+" : g_with_seq is null" );
}else{
	System.out.println(this.toString+" : g_with_seq is "+g_with_seq );
}
String g_flnm = req.getParameter("g_flnm");
if( g_flnm == null){
	System.out.println(this.toString+" : g_flnm is null" );
}else{
	System.out.println(this.toString+" : g_flnm is "+g_flnm );
}
String g_dept_cd = req.getParameter("g_dept_cd");
if( g_dept_cd == null){
	System.out.println(this.toString+" : g_dept_cd is null" );
}else{
	System.out.println(this.toString+" : g_dept_cd is "+g_dept_cd );
}
String g_dty_cd = req.getParameter("g_dty_cd");
if( g_dty_cd == null){
	System.out.println(this.toString+" : g_dty_cd is null" );
}else{
	System.out.println(this.toString+" : g_dty_cd is "+g_dty_cd );
}
String g_posi_cd = req.getParameter("g_posi_cd");
if( g_posi_cd == null){
	System.out.println(this.toString+" : g_posi_cd is null" );
}else{
	System.out.println(this.toString+" : g_posi_cd is "+g_posi_cd );
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
String d_emp_no = req.getParameter("d_emp_no");
if( d_emp_no == null){
	System.out.println(this.toString+" : d_emp_no is null" );
}else{
	System.out.println(this.toString+" : d_emp_no is "+d_emp_no );
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
String d_sub_seq = req.getParameter("d_sub_seq");
if( d_sub_seq == null){
	System.out.println(this.toString+" : d_sub_seq is null" );
}else{
	System.out.println(this.toString+" : d_sub_seq is "+d_sub_seq );
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
String d_midl_start_dt = req.getParameter("d_midl_start_dt");
if( d_midl_start_dt == null){
	System.out.println(this.toString+" : d_midl_start_dt is null" );
}else{
	System.out.println(this.toString+" : d_midl_start_dt is "+d_midl_start_dt );
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
String e_emp_no = req.getParameter("e_emp_no");
if( e_emp_no == null){
	System.out.println(this.toString+" : e_emp_no is null" );
}else{
	System.out.println(this.toString+" : e_emp_no is "+e_emp_no );
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
String e_sub_seq = req.getParameter("e_sub_seq");
if( e_sub_seq == null){
	System.out.println(this.toString+" : e_sub_seq is null" );
}else{
	System.out.println(this.toString+" : e_sub_seq is "+e_sub_seq );
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
String e_etc_cost_neces = req.getParameter("e_etc_cost_neces");
if( e_etc_cost_neces == null){
	System.out.println(this.toString+" : e_etc_cost_neces is null" );
}else{
	System.out.println(this.toString+" : e_etc_cost_neces is "+e_etc_cost_neces );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String with_seq = Util.checkString(req.getParameter("with_seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
String busi_trip_dest = Util.checkString(req.getParameter("busi_trip_dest"));
String busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
String busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
String busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
String invit_instt = Util.checkString(req.getParameter("invit_instt"));
String busi_trip_fee_burd_clsf = Util.checkString(req.getParameter("busi_trip_fee_burd_clsf"));
String busi_trip_neces = Util.checkString(req.getParameter("busi_trip_neces"));
String aviat_fee = Util.checkString(req.getParameter("aviat_fee"));
String stay_fee = Util.checkString(req.getParameter("stay_fee"));
String dd_fee = Util.checkString(req.getParameter("dd_fee"));
String ceph_use_yn = Util.checkString(req.getParameter("ceph_use_yn"));
String busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
String remk = Util.checkString(req.getParameter("remk"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String genl_affrs_clsf = Util.checkString(req.getParameter("genl_affrs_clsf"));
String g_mode = Util.checkString(req.getParameter("g_mode"));
String g_cmpy_cd = Util.checkString(req.getParameter("g_cmpy_cd"));
String g_emp_no = Util.checkString(req.getParameter("g_emp_no"));
String g_occr_dt = Util.checkString(req.getParameter("g_occr_dt"));
String g_seq = Util.checkString(req.getParameter("g_seq"));
String g_with_seq = Util.checkString(req.getParameter("g_with_seq"));
String g_flnm = Util.checkString(req.getParameter("g_flnm"));
String g_dept_cd = Util.checkString(req.getParameter("g_dept_cd"));
String g_dty_cd = Util.checkString(req.getParameter("g_dty_cd"));
String g_posi_cd = Util.checkString(req.getParameter("g_posi_cd"));
String d_mode = Util.checkString(req.getParameter("d_mode"));
String d_cmpy_cd = Util.checkString(req.getParameter("d_cmpy_cd"));
String d_emp_no = Util.checkString(req.getParameter("d_emp_no"));
String d_occr_dt = Util.checkString(req.getParameter("d_occr_dt"));
String d_seq = Util.checkString(req.getParameter("d_seq"));
String d_sub_seq = Util.checkString(req.getParameter("d_sub_seq"));
String d_with_seq = Util.checkString(req.getParameter("d_with_seq"));
String d_start_area = Util.checkString(req.getParameter("d_start_area"));
String d_midl_start_dt = Util.checkString(req.getParameter("d_midl_start_dt"));
String d_dest = Util.checkString(req.getParameter("d_dest"));
String d_busi_trip_cont = Util.checkString(req.getParameter("d_busi_trip_cont"));
String e_mode = Util.checkString(req.getParameter("e_mode"));
String e_cmpy_cd = Util.checkString(req.getParameter("e_cmpy_cd"));
String e_emp_no = Util.checkString(req.getParameter("e_emp_no"));
String e_occr_dt = Util.checkString(req.getParameter("e_occr_dt"));
String e_seq = Util.checkString(req.getParameter("e_seq"));
String e_sub_seq = Util.checkString(req.getParameter("e_sub_seq"));
String e_with_seq = Util.checkString(req.getParameter("e_with_seq"));
String e_etc_cost_ptcr = Util.checkString(req.getParameter("e_etc_cost_ptcr"));
String e_etc_cost = Util.checkString(req.getParameter("e_etc_cost"));
String e_etc_cost_neces = Util.checkString(req.getParameter("e_etc_cost_neces"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("with_seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String busi_trip_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_purp")));
String busi_trip_dest = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_dest")));
String busi_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_frdt")));
String busi_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_todt")));
String busi_trip_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_dds")));
String invit_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("invit_instt")));
String busi_trip_fee_burd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_fee_burd_clsf")));
String busi_trip_neces = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_neces")));
String aviat_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("aviat_fee")));
String stay_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_fee")));
String dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fee")));
String ceph_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("ceph_use_yn")));
String busi_trip_fee_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_fee_stot")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String genl_affrs_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("genl_affrs_clsf")));
String g_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("g_mode")));
String g_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g_cmpy_cd")));
String g_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("g_emp_no")));
String g_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("g_occr_dt")));
String g_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("g_seq")));
String g_with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("g_with_seq")));
String g_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("g_flnm")));
String g_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g_dept_cd")));
String g_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g_dty_cd")));
String g_posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g_posi_cd")));
String d_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("d_mode")));
String d_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("d_cmpy_cd")));
String d_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("d_emp_no")));
String d_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("d_occr_dt")));
String d_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_seq")));
String d_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_sub_seq")));
String d_with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_with_seq")));
String d_start_area = Util.Uni2Ksc(Util.checkString(req.getParameter("d_start_area")));
String d_midl_start_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("d_midl_start_dt")));
String d_dest = Util.Uni2Ksc(Util.checkString(req.getParameter("d_dest")));
String d_busi_trip_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("d_busi_trip_cont")));
String e_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("e_mode")));
String e_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("e_cmpy_cd")));
String e_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("e_emp_no")));
String e_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("e_occr_dt")));
String e_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("e_seq")));
String e_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("e_sub_seq")));
String e_with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("e_with_seq")));
String e_etc_cost_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("e_etc_cost_ptcr")));
String e_etc_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("e_etc_cost")));
String e_etc_cost_neces = Util.Uni2Ksc(Util.checkString(req.getParameter("e_etc_cost_neces")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setWith_seq(with_seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setNatn_cd(natn_cd);
dm.setBusi_trip_purp(busi_trip_purp);
dm.setBusi_trip_dest(busi_trip_dest);
dm.setBusi_trip_frdt(busi_trip_frdt);
dm.setBusi_trip_todt(busi_trip_todt);
dm.setBusi_trip_dds(busi_trip_dds);
dm.setInvit_instt(invit_instt);
dm.setBusi_trip_fee_burd_clsf(busi_trip_fee_burd_clsf);
dm.setBusi_trip_neces(busi_trip_neces);
dm.setAviat_fee(aviat_fee);
dm.setStay_fee(stay_fee);
dm.setDd_fee(dd_fee);
dm.setCeph_use_yn(ceph_use_yn);
dm.setBusi_trip_fee_stot(busi_trip_fee_stot);
dm.setRemk(remk);
dm.setProc_stat(proc_stat);
dm.setGenl_affrs_clsf(genl_affrs_clsf);
dm.setG_mode(g_mode);
dm.setG_cmpy_cd(g_cmpy_cd);
dm.setG_emp_no(g_emp_no);
dm.setG_occr_dt(g_occr_dt);
dm.setG_seq(g_seq);
dm.setG_with_seq(g_with_seq);
dm.setG_flnm(g_flnm);
dm.setG_dept_cd(g_dept_cd);
dm.setG_dty_cd(g_dty_cd);
dm.setG_posi_cd(g_posi_cd);
dm.setD_mode(d_mode);
dm.setD_cmpy_cd(d_cmpy_cd);
dm.setD_emp_no(d_emp_no);
dm.setD_occr_dt(d_occr_dt);
dm.setD_seq(d_seq);
dm.setD_sub_seq(d_sub_seq);
dm.setD_with_seq(d_with_seq);
dm.setD_start_area(d_start_area);
dm.setD_midl_start_dt(d_midl_start_dt);
dm.setD_dest(d_dest);
dm.setD_busi_trip_cont(d_busi_trip_cont);
dm.setE_mode(e_mode);
dm.setE_cmpy_cd(e_cmpy_cd);
dm.setE_emp_no(e_emp_no);
dm.setE_occr_dt(e_occr_dt);
dm.setE_seq(e_seq);
dm.setE_sub_seq(e_sub_seq);
dm.setE_with_seq(e_with_seq);
dm.setE_etc_cost_ptcr(e_etc_cost_ptcr);
dm.setE_etc_cost(e_etc_cost);
dm.setE_etc_cost_neces(e_etc_cost_neces);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 10:14:18 KST 2009 */