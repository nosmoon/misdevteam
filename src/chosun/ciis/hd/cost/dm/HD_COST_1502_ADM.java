/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1502_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String s_mode;
	public String tmp_dr_amt;
	public String flnm;
	public String card_mang_no;
	public String dept_cd;
	public String card_type;
	public String tmp_crdt_amt;
	public String titl;
	public String titl2;
	public String medi_cd;
	public String dtls_medi_cd;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String use_type;

	public HD_COST_1502_ADM(){}
	public HD_COST_1502_ADM(String mode, String cmpy_cd, String slip_proc_mang_dt, String slip_proc_mang_seq, String s_mode, String tmp_dr_amt, String flnm, String card_mang_no, String dept_cd, String card_type, String tmp_crdt_amt, String titl, String titl2, String medi_cd, String dtls_medi_cd, String incmg_pers_ipadd, String ss_emp_no, String use_type){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.s_mode = s_mode;
		this.tmp_dr_amt = tmp_dr_amt;
		this.flnm = flnm;
		this.card_mang_no = card_mang_no;
		this.dept_cd = dept_cd;
		this.card_type = card_type;
		this.tmp_crdt_amt = tmp_crdt_amt;
		this.titl = titl;
		this.titl2 = titl2;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.use_type = use_type;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setTmp_dr_amt(String tmp_dr_amt){
		this.tmp_dr_amt = tmp_dr_amt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCard_mang_no(String card_mang_no){
		this.card_mang_no = card_mang_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCard_type(String card_type){
		this.card_type = card_type;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setUse_type(String use_type){
		this.use_type = use_type;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getTmp_dr_amt(){
		return this.tmp_dr_amt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getCard_mang_no(){
		return this.card_mang_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCard_type(){
		return this.card_type;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getUse_type(){
		return this.use_type;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1502_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1502_ADM dm = (HD_COST_1502_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.slip_proc_mang_dt);
		cstmt.setString(6, dm.slip_proc_mang_seq);
		cstmt.setString(7, dm.s_mode);
		cstmt.setString(8, dm.tmp_dr_amt);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.card_mang_no);
		cstmt.setString(11, dm.dept_cd);
		cstmt.setString(12, dm.card_type);
		cstmt.setString(13, dm.tmp_crdt_amt);
		cstmt.setString(14, dm.titl);
		cstmt.setString(15, dm.titl2);
		cstmt.setString(16, dm.medi_cd);
		cstmt.setString(17, dm.dtls_medi_cd);
		cstmt.setString(18, dm.incmg_pers_ipadd);
		cstmt.setString(19, dm.ss_emp_no);
		cstmt.setString(20, dm.use_type);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1502_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("s_mode = [" + getS_mode() + "]");
		System.out.println("tmp_dr_amt = [" + getTmp_dr_amt() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("card_mang_no = [" + getCard_mang_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("card_type = [" + getCard_type() + "]");
		System.out.println("tmp_crdt_amt = [" + getTmp_crdt_amt() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("titl2 = [" + getTitl2() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("use_type = [" + getUse_type() + "]");
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
String tmp_dr_amt = req.getParameter("tmp_dr_amt");
if( tmp_dr_amt == null){
	System.out.println(this.toString+" : tmp_dr_amt is null" );
}else{
	System.out.println(this.toString+" : tmp_dr_amt is "+tmp_dr_amt );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String card_mang_no = req.getParameter("card_mang_no");
if( card_mang_no == null){
	System.out.println(this.toString+" : card_mang_no is null" );
}else{
	System.out.println(this.toString+" : card_mang_no is "+card_mang_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String card_type = req.getParameter("card_type");
if( card_type == null){
	System.out.println(this.toString+" : card_type is null" );
}else{
	System.out.println(this.toString+" : card_type is "+card_type );
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
String use_type = req.getParameter("use_type");
if( use_type == null){
	System.out.println(this.toString+" : use_type is null" );
}else{
	System.out.println(this.toString+" : use_type is "+use_type );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String s_mode = Util.checkString(req.getParameter("s_mode"));
String tmp_dr_amt = Util.checkString(req.getParameter("tmp_dr_amt"));
String flnm = Util.checkString(req.getParameter("flnm"));
String card_mang_no = Util.checkString(req.getParameter("card_mang_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String card_type = Util.checkString(req.getParameter("card_type"));
String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
String titl = Util.checkString(req.getParameter("titl"));
String titl2 = Util.checkString(req.getParameter("titl2"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String use_type = Util.checkString(req.getParameter("use_type"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String s_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("s_mode")));
String tmp_dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_dr_amt")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String card_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_mang_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String card_type = Util.Uni2Ksc(Util.checkString(req.getParameter("card_type")));
String tmp_crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_crdt_amt")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String titl2 = Util.Uni2Ksc(Util.checkString(req.getParameter("titl2")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String use_type = Util.Uni2Ksc(Util.checkString(req.getParameter("use_type")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setS_mode(s_mode);
dm.setTmp_dr_amt(tmp_dr_amt);
dm.setFlnm(flnm);
dm.setCard_mang_no(card_mang_no);
dm.setDept_cd(dept_cd);
dm.setCard_type(card_type);
dm.setTmp_crdt_amt(tmp_crdt_amt);
dm.setTitl(titl);
dm.setTitl2(titl2);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setUse_type(use_type);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 26 16:05:27 KST 2017 */