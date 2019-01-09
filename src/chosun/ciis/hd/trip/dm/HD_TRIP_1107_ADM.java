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


public class HD_TRIP_1107_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String s_mode;
	public String flnm;
	public String dept_cd;
	public String tmp_dr_amt;
	public String tmp_crdt_amt;
	public String titl;
	public String titl2;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String busi_trip_clsf;
	public String medi_cd;
	public String dtls_medi_cd;

	public HD_TRIP_1107_ADM(){}
	public HD_TRIP_1107_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String slip_proc_mang_dt, String slip_proc_mang_seq, String s_mode, String flnm, String dept_cd, String tmp_dr_amt, String tmp_crdt_amt, String titl, String titl2, String incmg_pers_ipadd, String ss_emp_no, String busi_trip_clsf, String medi_cd, String dtls_medi_cd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.s_mode = s_mode;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.tmp_dr_amt = tmp_dr_amt;
		this.tmp_crdt_amt = tmp_crdt_amt;
		this.titl = titl;
		this.titl2 = titl2;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.busi_trip_clsf = busi_trip_clsf;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
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

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setS_mode(String s_mode){
		this.s_mode = s_mode;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setTmp_dr_amt(String tmp_dr_amt){
		this.tmp_dr_amt = tmp_dr_amt;
	}

	public void setTmp_crdt_amt(String tmp_crdt_amt){
		this.tmp_crdt_amt = tmp_crdt_amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setTitl2(String titl2){
		this.titl2 = titl2;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setBusi_trip_clsf(String busi_trip_clsf){
		this.busi_trip_clsf = busi_trip_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
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

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getS_mode(){
		return this.s_mode;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getTmp_dr_amt(){
		return this.tmp_dr_amt;
	}

	public String getTmp_crdt_amt(){
		return this.tmp_crdt_amt;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getTitl2(){
		return this.titl2;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getBusi_trip_clsf(){
		return this.busi_trip_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1107_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1107_ADM dm = (HD_TRIP_1107_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.slip_proc_mang_dt);
		cstmt.setString(9, dm.slip_proc_mang_seq);
		cstmt.setString(10, dm.s_mode);
		cstmt.setString(11, dm.flnm);
		cstmt.setString(12, dm.dept_cd);
		cstmt.setString(13, dm.tmp_dr_amt);
		cstmt.setString(14, dm.tmp_crdt_amt);
		cstmt.setString(15, dm.titl);
		cstmt.setString(16, dm.titl2);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.ss_emp_no);
		cstmt.setString(19, dm.busi_trip_clsf);
		cstmt.setString(20, dm.medi_cd);
		cstmt.setString(21, dm.dtls_medi_cd);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1107_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("s_mode = [" + getS_mode() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tmp_dr_amt = [" + getTmp_dr_amt() + "]");
		System.out.println("tmp_crdt_amt = [" + getTmp_crdt_amt() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("titl2 = [" + getTitl2() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("busi_trip_clsf = [" + getBusi_trip_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
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
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String s_mode = req.getParameter("s_mode");
if( s_mode == null){
	System.out.println(this.toString+" : s_mode is null" );
}else{
	System.out.println(this.toString+" : s_mode is "+s_mode );
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
String tmp_dr_amt = req.getParameter("tmp_dr_amt");
if( tmp_dr_amt == null){
	System.out.println(this.toString+" : tmp_dr_amt is null" );
}else{
	System.out.println(this.toString+" : tmp_dr_amt is "+tmp_dr_amt );
}
String tmp_crdt_amt = req.getParameter("tmp_crdt_amt");
if( tmp_crdt_amt == null){
	System.out.println(this.toString+" : tmp_crdt_amt is null" );
}else{
	System.out.println(this.toString+" : tmp_crdt_amt is "+tmp_crdt_amt );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String titl2 = req.getParameter("titl2");
if( titl2 == null){
	System.out.println(this.toString+" : titl2 is null" );
}else{
	System.out.println(this.toString+" : titl2 is "+titl2 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
String busi_trip_clsf = req.getParameter("busi_trip_clsf");
if( busi_trip_clsf == null){
	System.out.println(this.toString+" : busi_trip_clsf is null" );
}else{
	System.out.println(this.toString+" : busi_trip_clsf is "+busi_trip_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String s_mode = Util.checkString(req.getParameter("s_mode"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String tmp_dr_amt = Util.checkString(req.getParameter("tmp_dr_amt"));
String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
String titl = Util.checkString(req.getParameter("titl"));
String titl2 = Util.checkString(req.getParameter("titl2"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String busi_trip_clsf = Util.checkString(req.getParameter("busi_trip_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String s_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("s_mode")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String tmp_dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_dr_amt")));
String tmp_crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_crdt_amt")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String titl2 = Util.Uni2Ksc(Util.checkString(req.getParameter("titl2")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String busi_trip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setS_mode(s_mode);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setTmp_dr_amt(tmp_dr_amt);
dm.setTmp_crdt_amt(tmp_crdt_amt);
dm.setTitl(titl);
dm.setTitl2(titl2);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setBusi_trip_clsf(busi_trip_clsf);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 20 12:46:01 KST 2012 */