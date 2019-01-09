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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1820_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String child_flnm;
	public String child_seqo;
	public String child_bidt;
	public String prn;
	public String sply_strt_yymm;
	public String sply_amt;
	public String sply_susp_yn;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_1820_ADM(){}
	public HD_AFFR_1820_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String child_flnm, String child_seqo, String child_bidt, String prn, String sply_strt_yymm, String sply_amt, String sply_susp_yn, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.child_flnm = child_flnm;
		this.child_seqo = child_seqo;
		this.child_bidt = child_bidt;
		this.prn = prn;
		this.sply_strt_yymm = sply_strt_yymm;
		this.sply_amt = sply_amt;
		this.sply_susp_yn = sply_susp_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setChild_flnm(String child_flnm){
		this.child_flnm = child_flnm;
	}

	public void setChild_seqo(String child_seqo){
		this.child_seqo = child_seqo;
	}

	public void setChild_bidt(String child_bidt){
		this.child_bidt = child_bidt;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setSply_strt_yymm(String sply_strt_yymm){
		this.sply_strt_yymm = sply_strt_yymm;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
	}

	public void setSply_susp_yn(String sply_susp_yn){
		this.sply_susp_yn = sply_susp_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getChild_flnm(){
		return this.child_flnm;
	}

	public String getChild_seqo(){
		return this.child_seqo;
	}

	public String getChild_bidt(){
		return this.child_bidt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSply_strt_yymm(){
		return this.sply_strt_yymm;
	}

	public String getSply_amt(){
		return this.sply_amt;
	}

	public String getSply_susp_yn(){
		return this.sply_susp_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1820_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1820_ADM dm = (HD_AFFR_1820_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.child_flnm);
		cstmt.setString(10, dm.child_seqo);
		cstmt.setString(11, dm.child_bidt);
		cstmt.setString(12, dm.prn);
		cstmt.setString(13, dm.sply_strt_yymm);
		cstmt.setString(14, dm.sply_amt);
		cstmt.setString(15, dm.sply_susp_yn);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1820_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("child_flnm = [" + getChild_flnm() + "]");
		System.out.println("child_seqo = [" + getChild_seqo() + "]");
		System.out.println("child_bidt = [" + getChild_bidt() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("sply_strt_yymm = [" + getSply_strt_yymm() + "]");
		System.out.println("sply_amt = [" + getSply_amt() + "]");
		System.out.println("sply_susp_yn = [" + getSply_susp_yn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String child_flnm = req.getParameter("child_flnm");
if( child_flnm == null){
	System.out.println(this.toString+" : child_flnm is null" );
}else{
	System.out.println(this.toString+" : child_flnm is "+child_flnm );
}
String child_seqo = req.getParameter("child_seqo");
if( child_seqo == null){
	System.out.println(this.toString+" : child_seqo is null" );
}else{
	System.out.println(this.toString+" : child_seqo is "+child_seqo );
}
String child_bidt = req.getParameter("child_bidt");
if( child_bidt == null){
	System.out.println(this.toString+" : child_bidt is null" );
}else{
	System.out.println(this.toString+" : child_bidt is "+child_bidt );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String sply_strt_yymm = req.getParameter("sply_strt_yymm");
if( sply_strt_yymm == null){
	System.out.println(this.toString+" : sply_strt_yymm is null" );
}else{
	System.out.println(this.toString+" : sply_strt_yymm is "+sply_strt_yymm );
}
String sply_amt = req.getParameter("sply_amt");
if( sply_amt == null){
	System.out.println(this.toString+" : sply_amt is null" );
}else{
	System.out.println(this.toString+" : sply_amt is "+sply_amt );
}
String sply_susp_yn = req.getParameter("sply_susp_yn");
if( sply_susp_yn == null){
	System.out.println(this.toString+" : sply_susp_yn is null" );
}else{
	System.out.println(this.toString+" : sply_susp_yn is "+sply_susp_yn );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String child_flnm = Util.checkString(req.getParameter("child_flnm"));
String child_seqo = Util.checkString(req.getParameter("child_seqo"));
String child_bidt = Util.checkString(req.getParameter("child_bidt"));
String prn = Util.checkString(req.getParameter("prn"));
String sply_strt_yymm = Util.checkString(req.getParameter("sply_strt_yymm"));
String sply_amt = Util.checkString(req.getParameter("sply_amt"));
String sply_susp_yn = Util.checkString(req.getParameter("sply_susp_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String child_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("child_flnm")));
String child_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("child_seqo")));
String child_bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("child_bidt")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String sply_strt_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_strt_yymm")));
String sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_amt")));
String sply_susp_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_susp_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setChild_flnm(child_flnm);
dm.setChild_seqo(child_seqo);
dm.setChild_bidt(child_bidt);
dm.setPrn(prn);
dm.setSply_strt_yymm(sply_strt_yymm);
dm.setSply_amt(sply_amt);
dm.setSply_susp_yn(sply_susp_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 20:32:25 KST 2009 */