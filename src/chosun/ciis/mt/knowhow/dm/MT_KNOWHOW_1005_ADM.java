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


package chosun.ciis.mt.knowhow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.knowhow.ds.*;
import chosun.ciis.mt.knowhow.rec.*;

/**
 * 
 */


public class MT_KNOWHOW_1005_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ans_mode;
	public String cmpy_cd;
	public String reg_dt;
	public String lcls;
	public String reg_seq;
	public String seq;
	public String answer;
	public String dept_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public MT_KNOWHOW_1005_ADM(){}
	public MT_KNOWHOW_1005_ADM(String ans_mode, String cmpy_cd, String reg_dt, String lcls, String reg_seq, String seq, String answer, String dept_cd, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.ans_mode = ans_mode;
		this.cmpy_cd = cmpy_cd;
		this.reg_dt = reg_dt;
		this.lcls = lcls;
		this.reg_seq = reg_seq;
		this.seq = seq;
		this.answer = answer;
		this.dept_cd = dept_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setAns_mode(String ans_mode){
		this.ans_mode = ans_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setLcls(String lcls){
		this.lcls = lcls;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getAns_mode(){
		return this.ans_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getLcls(){
		return this.lcls;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAnswer(){
		return this.answer;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_KNOWHOW_1005_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_KNOWHOW_1005_ADM dm = (MT_KNOWHOW_1005_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ans_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.reg_dt);
		cstmt.setString(6, dm.lcls);
		cstmt.setString(7, dm.reg_seq);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.answer);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.knowhow.ds.MT_KNOWHOW_1005_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("ans_mode = [" + getAns_mode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("lcls = [" + getLcls() + "]");
		System.out.println("reg_seq = [" + getReg_seq() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("answer = [" + getAnswer() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String ans_mode = req.getParameter("ans_mode");
if( ans_mode == null){
	System.out.println(this.toString+" : ans_mode is null" );
}else{
	System.out.println(this.toString+" : ans_mode is "+ans_mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String lcls = req.getParameter("lcls");
if( lcls == null){
	System.out.println(this.toString+" : lcls is null" );
}else{
	System.out.println(this.toString+" : lcls is "+lcls );
}
String reg_seq = req.getParameter("reg_seq");
if( reg_seq == null){
	System.out.println(this.toString+" : reg_seq is null" );
}else{
	System.out.println(this.toString+" : reg_seq is "+reg_seq );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String answer = req.getParameter("answer");
if( answer == null){
	System.out.println(this.toString+" : answer is null" );
}else{
	System.out.println(this.toString+" : answer is "+answer );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String ans_mode = Util.checkString(req.getParameter("ans_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String lcls = Util.checkString(req.getParameter("lcls"));
String reg_seq = Util.checkString(req.getParameter("reg_seq"));
String seq = Util.checkString(req.getParameter("seq"));
String answer = Util.checkString(req.getParameter("answer"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String ans_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("ans_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String lcls = Util.Uni2Ksc(Util.checkString(req.getParameter("lcls")));
String reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String answer = Util.Uni2Ksc(Util.checkString(req.getParameter("answer")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAns_mode(ans_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setReg_dt(reg_dt);
dm.setLcls(lcls);
dm.setReg_seq(reg_seq);
dm.setSeq(seq);
dm.setAnswer(answer);
dm.setDept_cd(dept_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 10:14:46 KST 2009 */