

package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_6004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String start_mm;
	public String end_mm;
	public String end2_mm;
	public String lock_use_yn;
	public String term;
	public String occr_dt;
	public String seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_SALY_6004_ADM(){}
	public HD_SALY_6004_ADM(String cmpy_cd, String emp_no, String start_mm, String end_mm, String end2_mm, String lock_use_yn, String term, String occr_dt, String seq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.start_mm = start_mm;
		this.end_mm = end_mm;
		this.end2_mm = end2_mm;
		this.lock_use_yn = lock_use_yn;
		this.term = term;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setStart_mm(String start_mm){
		this.start_mm = start_mm;
	}

	public void setEnd_mm(String end_mm){
		this.end_mm = end_mm;
	}

	public void setEnd2_mm(String end2_mm){
		this.end2_mm = end2_mm;
	}

	public void setLock_use_yn(String lock_use_yn){
		this.lock_use_yn = lock_use_yn;
	}

	public void setTerm(String term){
		this.term = term;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getStart_mm(){
		return this.start_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getEnd2_mm(){
		return this.end2_mm;
	}

	public String getLock_use_yn(){
		return this.lock_use_yn;
	}

	public String getTerm(){
		return this.term;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_6004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_6004_ADM dm = (HD_SALY_6004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.start_mm);
		cstmt.setString(7, dm.end_mm);
		cstmt.setString(8, dm.end2_mm);
		cstmt.setString(9, dm.lock_use_yn);
		cstmt.setString(10, dm.term);
		cstmt.setString(11, dm.occr_dt);
		cstmt.setString(12, dm.seq);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SALY_6004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("start_mm = [" + getStart_mm() + "]");
		System.out.println("end_mm = [" + getEnd_mm() + "]");
		System.out.println("end2_mm = [" + getEnd2_mm() + "]");
		System.out.println("lock_use_yn = [" + getLock_use_yn() + "]");
		System.out.println("term = [" + getTerm() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String start_mm = req.getParameter("start_mm");
if( start_mm == null){
	System.out.println(this.toString+" : start_mm is null" );
}else{
	System.out.println(this.toString+" : start_mm is "+start_mm );
}
String end_mm = req.getParameter("end_mm");
if( end_mm == null){
	System.out.println(this.toString+" : end_mm is null" );
}else{
	System.out.println(this.toString+" : end_mm is "+end_mm );
}
String end2_mm = req.getParameter("end2_mm");
if( end2_mm == null){
	System.out.println(this.toString+" : end2_mm is null" );
}else{
	System.out.println(this.toString+" : end2_mm is "+end2_mm );
}
String lock_use_yn = req.getParameter("lock_use_yn");
if( lock_use_yn == null){
	System.out.println(this.toString+" : lock_use_yn is null" );
}else{
	System.out.println(this.toString+" : lock_use_yn is "+lock_use_yn );
}
String term = req.getParameter("term");
if( term == null){
	System.out.println(this.toString+" : term is null" );
}else{
	System.out.println(this.toString+" : term is "+term );
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String start_mm = Util.checkString(req.getParameter("start_mm"));
String end_mm = Util.checkString(req.getParameter("end_mm"));
String end2_mm = Util.checkString(req.getParameter("end2_mm"));
String lock_use_yn = Util.checkString(req.getParameter("lock_use_yn"));
String term = Util.checkString(req.getParameter("term"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String start_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_mm")));
String end_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_mm")));
String end2_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("end2_mm")));
String lock_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lock_use_yn")));
String term = Util.Uni2Ksc(Util.checkString(req.getParameter("term")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setStart_mm(start_mm);
dm.setEnd_mm(end_mm);
dm.setEnd2_mm(end2_mm);
dm.setLock_use_yn(lock_use_yn);
dm.setTerm(term);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 19 15:23:13 KST 2010 */