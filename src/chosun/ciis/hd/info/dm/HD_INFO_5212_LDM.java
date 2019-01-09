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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5212_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String faml_seq;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String seq;
	public String proc_stat;

	public HD_INFO_5212_LDM(){}
	public HD_INFO_5212_LDM(String cmpy_cd, String emp_no, String faml_seq, String occr_dt_fr, String occr_dt_to, String seq, String proc_stat){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.faml_seq = faml_seq;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.seq = seq;
		this.proc_stat = proc_stat;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_5212_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_5212_LDM dm = (HD_INFO_5212_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.faml_seq);
		cstmt.setString(6, dm.occr_dt_fr);
		cstmt.setString(7, dm.occr_dt_to);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.proc_stat);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_5212_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("occr_dt_fr = [" + getOccr_dt_fr() + "]");
		System.out.println("occr_dt_to = [" + getOccr_dt_to() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String faml_seq = req.getParameter("faml_seq");
if( faml_seq == null){
	System.out.println(this.toString+" : faml_seq is null" );
}else{
	System.out.println(this.toString+" : faml_seq is "+faml_seq );
}
String occr_dt_fr = req.getParameter("occr_dt_fr");
if( occr_dt_fr == null){
	System.out.println(this.toString+" : occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr is "+occr_dt_fr );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String seq = Util.checkString(req.getParameter("seq"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFaml_seq(faml_seq);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setSeq(seq);
dm.setProc_stat(proc_stat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 16:56:56 KST 2009 */