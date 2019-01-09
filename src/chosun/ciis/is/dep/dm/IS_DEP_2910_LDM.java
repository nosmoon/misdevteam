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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String cmpy_cd;
	public String occr_frdt;
	public String occr_todt;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_clsf_cd_seq;
	public String erplace_cd;
	public String prof_type_cd;

	public IS_DEP_2910_LDM(){}
	public IS_DEP_2910_LDM(String clsf, String cmpy_cd, String occr_frdt, String occr_todt, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_clsf_cd_seq, String erplace_cd, String prof_type_cd){
		this.clsf = clsf;
		this.cmpy_cd = cmpy_cd;
		this.occr_frdt = occr_frdt;
		this.occr_todt = occr_todt;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.erplace_cd = erplace_cd;
		this.prof_type_cd = prof_type_cd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_frdt(String occr_frdt){
		this.occr_frdt = occr_frdt;
	}

	public void setOccr_todt(String occr_todt){
		this.occr_todt = occr_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_frdt(){
		return this.occr_frdt;
	}

	public String getOccr_todt(){
		return this.occr_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_2910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_2910_LDM dm = (IS_DEP_2910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_frdt);
		cstmt.setString(6, dm.occr_todt);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.sub_dept_cd);
		cstmt.setString(9, dm.chrg_pers);
		cstmt.setString(10, dm.dlco_clsf_cd_seq);
		cstmt.setString(11, dm.erplace_cd);
		cstmt.setString(12, dm.prof_type_cd);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_2910_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_frdt = [" + getOccr_frdt() + "]");
		System.out.println("occr_todt = [" + getOccr_todt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_frdt = req.getParameter("occr_frdt");
if( occr_frdt == null){
	System.out.println(this.toString+" : occr_frdt is null" );
}else{
	System.out.println(this.toString+" : occr_frdt is "+occr_frdt );
}
String occr_todt = req.getParameter("occr_todt");
if( occr_todt == null){
	System.out.println(this.toString+" : occr_todt is null" );
}else{
	System.out.println(this.toString+" : occr_todt is "+occr_todt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clsf = Util.checkString(req.getParameter("clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
String occr_todt = Util.checkString(req.getParameter("occr_todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_frdt")));
String occr_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_frdt(occr_frdt);
dm.setOccr_todt(occr_todt);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setErplace_cd(erplace_cd);
dm.setProf_type_cd(prof_type_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 24 09:53:05 KST 2012 */