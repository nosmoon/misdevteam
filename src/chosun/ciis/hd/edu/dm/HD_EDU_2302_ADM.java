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


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_2302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String lang_aprv_tms_chk;
	public String edu_clsf;

	public HD_EDU_2302_ADM(){}
	public HD_EDU_2302_ADM(String cmpy_cd, String emp_no, String occr_dt, String seq, String lang_aprv_tms_chk, String edu_clsf){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.lang_aprv_tms_chk = lang_aprv_tms_chk;
		this.edu_clsf = edu_clsf;
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

	public void setLang_aprv_tms_chk(String lang_aprv_tms_chk){
		this.lang_aprv_tms_chk = lang_aprv_tms_chk;
	}

	public void setEdu_clsf(String edu_clsf){
		this.edu_clsf = edu_clsf;
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

	public String getLang_aprv_tms_chk(){
		return this.lang_aprv_tms_chk;
	}

	public String getEdu_clsf(){
		return this.edu_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_2302_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_2302_ADM dm = (HD_EDU_2302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.lang_aprv_tms_chk);
		cstmt.setString(8, dm.edu_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_2302_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("lang_aprv_tms_chk = [" + getLang_aprv_tms_chk() + "]");
		System.out.println("edu_clsf = [" + getEdu_clsf() + "]");
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
String lang_aprv_tms_chk = req.getParameter("lang_aprv_tms_chk");
if( lang_aprv_tms_chk == null){
	System.out.println(this.toString+" : lang_aprv_tms_chk is null" );
}else{
	System.out.println(this.toString+" : lang_aprv_tms_chk is "+lang_aprv_tms_chk );
}
String edu_clsf = req.getParameter("edu_clsf");
if( edu_clsf == null){
	System.out.println(this.toString+" : edu_clsf is null" );
}else{
	System.out.println(this.toString+" : edu_clsf is "+edu_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String lang_aprv_tms_chk = Util.checkString(req.getParameter("lang_aprv_tms_chk"));
String edu_clsf = Util.checkString(req.getParameter("edu_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String lang_aprv_tms_chk = Util.Uni2Ksc(Util.checkString(req.getParameter("lang_aprv_tms_chk")));
String edu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setLang_aprv_tms_chk(lang_aprv_tms_chk);
dm.setEdu_clsf(edu_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 13 18:07:57 KST 2018 */