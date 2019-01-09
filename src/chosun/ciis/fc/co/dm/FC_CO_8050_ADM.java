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


package chosun.ciis.fc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_8050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String draft_doc_no;
	public String draft_doc_dept_cd;
	public String draft_expn_amt;
	public String draft_impt_amt;
	public String chg_pers;

	public FC_CO_8050_ADM(){}
	public FC_CO_8050_ADM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String draft_doc_no, String draft_doc_dept_cd, String draft_expn_amt, String draft_impt_amt, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.draft_doc_no = draft_doc_no;
		this.draft_doc_dept_cd = draft_doc_dept_cd;
		this.draft_expn_amt = draft_expn_amt;
		this.draft_impt_amt = draft_impt_amt;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setDraft_impt_amt(String draft_impt_amt){
		this.draft_impt_amt = draft_impt_amt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getDraft_impt_amt(){
		return this.draft_impt_amt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_CO_8050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_8050_ADM dm = (FC_CO_8050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.slip_sub_seq);
		cstmt.setString(8, dm.draft_doc_no);
		cstmt.setString(9, dm.draft_doc_dept_cd);
		cstmt.setString(10, dm.draft_expn_amt);
		cstmt.setString(11, dm.draft_impt_amt);
		cstmt.setString(12, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_8050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("draft_doc_dept_cd = [" + getDraft_doc_dept_cd() + "]");
		System.out.println("draft_expn_amt = [" + getDraft_expn_amt() + "]");
		System.out.println("draft_impt_amt = [" + getDraft_impt_amt() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String draft_doc_dept_cd = req.getParameter("draft_doc_dept_cd");
if( draft_doc_dept_cd == null){
	System.out.println(this.toString+" : draft_doc_dept_cd is null" );
}else{
	System.out.println(this.toString+" : draft_doc_dept_cd is "+draft_doc_dept_cd );
}
String draft_expn_amt = req.getParameter("draft_expn_amt");
if( draft_expn_amt == null){
	System.out.println(this.toString+" : draft_expn_amt is null" );
}else{
	System.out.println(this.toString+" : draft_expn_amt is "+draft_expn_amt );
}
String draft_impt_amt = req.getParameter("draft_impt_amt");
if( draft_impt_amt == null){
	System.out.println(this.toString+" : draft_impt_amt is null" );
}else{
	System.out.println(this.toString+" : draft_impt_amt is "+draft_impt_amt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String draft_doc_dept_cd = Util.checkString(req.getParameter("draft_doc_dept_cd"));
String draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
String draft_impt_amt = Util.checkString(req.getParameter("draft_impt_amt"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String draft_doc_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_dept_cd")));
String draft_expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_expn_amt")));
String draft_impt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_impt_amt")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setDraft_doc_no(draft_doc_no);
dm.setDraft_doc_dept_cd(draft_doc_dept_cd);
dm.setDraft_expn_amt(draft_expn_amt);
dm.setDraft_impt_amt(draft_impt_amt);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 15:15:40 KST 2009 */