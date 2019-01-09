/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-연말정산관리
* 작성일자 : 2014-12-30
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 신규컬럼 추가( 주택유형, 주택계약면적)
* 수정자 : 이태식
* 수정일자 :2014-12-30
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_5401_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String seq;
	public String leas_flnm;
	public String leas_prn;
	public String addr;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String month_rent_amt;
	public String resi_clsf_cd;
	public String hous_cntr_sqr;
	public String incmg_pers;

	public HD_YADJM_5401_ADM(){}
	public HD_YADJM_5401_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String seq, String leas_flnm, String leas_prn, String addr, String leas_fr_dt, String leas_to_dt, String month_rent_amt, String resi_clsf_cd, String hous_cntr_sqr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.seq = seq;
		this.leas_flnm = leas_flnm;
		this.leas_prn = leas_prn;
		this.addr = addr;
		this.leas_fr_dt = leas_fr_dt;
		this.leas_to_dt = leas_to_dt;
		this.month_rent_amt = month_rent_amt;
		this.resi_clsf_cd = resi_clsf_cd;
		this.hous_cntr_sqr = hous_cntr_sqr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_flnm(String leas_flnm){
		this.leas_flnm = leas_flnm;
	}

	public void setLeas_prn(String leas_prn){
		this.leas_prn = leas_prn;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setMonth_rent_amt(String month_rent_amt){
		this.month_rent_amt = month_rent_amt;
	}

	public void setResi_clsf_cd(String resi_clsf_cd){
		this.resi_clsf_cd = resi_clsf_cd;
	}

	public void setHous_cntr_sqr(String hous_cntr_sqr){
		this.hous_cntr_sqr = hous_cntr_sqr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_flnm(){
		return this.leas_flnm;
	}

	public String getLeas_prn(){
		return this.leas_prn;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getMonth_rent_amt(){
		return this.month_rent_amt;
	}

	public String getResi_clsf_cd(){
		return this.resi_clsf_cd;
	}

	public String getHous_cntr_sqr(){
		return this.hous_cntr_sqr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_5401_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_5401_ADM dm = (HD_YADJM_5401_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.leas_flnm);
		cstmt.setString(8, dm.leas_prn);
		cstmt.setString(9, dm.addr);
		cstmt.setString(10, dm.leas_fr_dt);
		cstmt.setString(11, dm.leas_to_dt);
		cstmt.setString(12, dm.month_rent_amt);
		cstmt.setString(13, dm.resi_clsf_cd);
		cstmt.setString(14, dm.hous_cntr_sqr);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_5401_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("leas_flnm = [" + getLeas_flnm() + "]");
		System.out.println("leas_prn = [" + getLeas_prn() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("leas_fr_dt = [" + getLeas_fr_dt() + "]");
		System.out.println("leas_to_dt = [" + getLeas_to_dt() + "]");
		System.out.println("month_rent_amt = [" + getMonth_rent_amt() + "]");
		System.out.println("resi_clsf_cd = [" + getResi_clsf_cd() + "]");
		System.out.println("hous_cntr_sqr = [" + getHous_cntr_sqr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String leas_flnm = req.getParameter("leas_flnm");
if( leas_flnm == null){
	System.out.println(this.toString+" : leas_flnm is null" );
}else{
	System.out.println(this.toString+" : leas_flnm is "+leas_flnm );
}
String leas_prn = req.getParameter("leas_prn");
if( leas_prn == null){
	System.out.println(this.toString+" : leas_prn is null" );
}else{
	System.out.println(this.toString+" : leas_prn is "+leas_prn );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String leas_fr_dt = req.getParameter("leas_fr_dt");
if( leas_fr_dt == null){
	System.out.println(this.toString+" : leas_fr_dt is null" );
}else{
	System.out.println(this.toString+" : leas_fr_dt is "+leas_fr_dt );
}
String leas_to_dt = req.getParameter("leas_to_dt");
if( leas_to_dt == null){
	System.out.println(this.toString+" : leas_to_dt is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt is "+leas_to_dt );
}
String month_rent_amt = req.getParameter("month_rent_amt");
if( month_rent_amt == null){
	System.out.println(this.toString+" : month_rent_amt is null" );
}else{
	System.out.println(this.toString+" : month_rent_amt is "+month_rent_amt );
}
String resi_clsf_cd = req.getParameter("resi_clsf_cd");
if( resi_clsf_cd == null){
	System.out.println(this.toString+" : resi_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : resi_clsf_cd is "+resi_clsf_cd );
}
String hous_cntr_sqr = req.getParameter("hous_cntr_sqr");
if( hous_cntr_sqr == null){
	System.out.println(this.toString+" : hous_cntr_sqr is null" );
}else{
	System.out.println(this.toString+" : hous_cntr_sqr is "+hous_cntr_sqr );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String seq = Util.checkString(req.getParameter("seq"));
String leas_flnm = Util.checkString(req.getParameter("leas_flnm"));
String leas_prn = Util.checkString(req.getParameter("leas_prn"));
String addr = Util.checkString(req.getParameter("addr"));
String leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
String leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
String month_rent_amt = Util.checkString(req.getParameter("month_rent_amt"));
String resi_clsf_cd = Util.checkString(req.getParameter("resi_clsf_cd"));
String hous_cntr_sqr = Util.checkString(req.getParameter("hous_cntr_sqr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String leas_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_flnm")));
String leas_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_prn")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String leas_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_fr_dt")));
String leas_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt")));
String month_rent_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("month_rent_amt")));
String resi_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("resi_clsf_cd")));
String hous_cntr_sqr = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_cntr_sqr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setSeq(seq);
dm.setLeas_flnm(leas_flnm);
dm.setLeas_prn(leas_prn);
dm.setAddr(addr);
dm.setLeas_fr_dt(leas_fr_dt);
dm.setLeas_to_dt(leas_to_dt);
dm.setMonth_rent_amt(month_rent_amt);
dm.setResi_clsf_cd(resi_clsf_cd);
dm.setHous_cntr_sqr(hous_cntr_sqr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 30 11:19:41 KST 2014 */