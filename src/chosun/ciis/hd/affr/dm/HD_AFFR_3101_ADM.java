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


public class HD_AFFR_3101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sply_clsf_cd;
	public String frdt;
	public String todt;
	public String obcl_child_sply_amt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_3101_ADM(){}
	public HD_AFFR_3101_ADM(String mode, String cmpy_cd, String occr_dt, String seq, String sply_clsf_cd, String frdt, String todt, String obcl_child_sply_amt, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sply_clsf_cd = sply_clsf_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.obcl_child_sply_amt = obcl_child_sply_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
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

	public void setSply_clsf_cd(String sply_clsf_cd){
		this.sply_clsf_cd = sply_clsf_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setObcl_child_sply_amt(String obcl_child_sply_amt){
		this.obcl_child_sply_amt = obcl_child_sply_amt;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSply_clsf_cd(){
		return this.sply_clsf_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getObcl_child_sply_amt(){
		return this.obcl_child_sply_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3101_ADM dm = (HD_AFFR_3101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.sply_clsf_cd);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.obcl_child_sply_amt);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sply_clsf_cd = [" + getSply_clsf_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("obcl_child_sply_amt = [" + getObcl_child_sply_amt() + "]");
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
String sply_clsf_cd = req.getParameter("sply_clsf_cd");
if( sply_clsf_cd == null){
	System.out.println(this.toString+" : sply_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sply_clsf_cd is "+sply_clsf_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String obcl_child_sply_amt = req.getParameter("obcl_child_sply_amt");
if( obcl_child_sply_amt == null){
	System.out.println(this.toString+" : obcl_child_sply_amt is null" );
}else{
	System.out.println(this.toString+" : obcl_child_sply_amt is "+obcl_child_sply_amt );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sply_clsf_cd = Util.checkString(req.getParameter("sply_clsf_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String obcl_child_sply_amt = Util.checkString(req.getParameter("obcl_child_sply_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sply_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_clsf_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String obcl_child_sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_child_sply_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSply_clsf_cd(sply_clsf_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setObcl_child_sply_amt(obcl_child_sply_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 08:58:29 KST 2009 */