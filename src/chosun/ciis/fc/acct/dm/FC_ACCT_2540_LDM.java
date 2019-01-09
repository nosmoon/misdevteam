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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2540_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String fr_fisc_dt;
	public String to_fisc_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String medi_cd;
	public String mang_clsf_cd;
	public String evnt_cd;
	public String clam_dept_cd;
	public String setoff_slip_clsf_cd;
	public String dr_amt;
	public String crdt_amt;
	public String incmg_emp_no;
	public String drcr_clsf_1;
	public String drcr_clsf_2;
	public String pch_x;

	public FC_ACCT_2540_LDM(){}
	public FC_ACCT_2540_LDM(String cmpy_cd, String acct_cd, String fr_fisc_dt, String to_fisc_dt, String dlco_clsf_cd, String dlco_cd, String medi_cd, String mang_clsf_cd, String evnt_cd, String clam_dept_cd, String setoff_slip_clsf_cd, String dr_amt, String crdt_amt, String incmg_emp_no, String drcr_clsf_1, String drcr_clsf_2, String pch_x){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.fr_fisc_dt = fr_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.medi_cd = medi_cd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.evnt_cd = evnt_cd;
		this.clam_dept_cd = clam_dept_cd;
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
		this.dr_amt = dr_amt;
		this.crdt_amt = crdt_amt;
		this.incmg_emp_no = incmg_emp_no;
		this.drcr_clsf_1 = drcr_clsf_1;
		this.drcr_clsf_2 = drcr_clsf_2;
		this.pch_x = pch_x;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setFr_fisc_dt(String fr_fisc_dt){
		this.fr_fisc_dt = fr_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setSetoff_slip_clsf_cd(String setoff_slip_clsf_cd){
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setDrcr_clsf_1(String drcr_clsf_1){
		this.drcr_clsf_1 = drcr_clsf_1;
	}

	public void setDrcr_clsf_2(String drcr_clsf_2){
		this.drcr_clsf_2 = drcr_clsf_2;
	}

	public void setPch_x(String pch_x){
		this.pch_x = pch_x;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getFr_fisc_dt(){
		return this.fr_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getSetoff_slip_clsf_cd(){
		return this.setoff_slip_clsf_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getDrcr_clsf_1(){
		return this.drcr_clsf_1;
	}

	public String getDrcr_clsf_2(){
		return this.drcr_clsf_2;
	}

	public String getPch_x(){
		return this.pch_x;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2540_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2540_LDM dm = (FC_ACCT_2540_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.fr_fisc_dt);
		cstmt.setString(6, dm.to_fisc_dt);
		cstmt.setString(7, dm.dlco_clsf_cd);
		cstmt.setString(8, dm.dlco_cd);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.mang_clsf_cd);
		cstmt.setString(11, dm.evnt_cd);
		cstmt.setString(12, dm.clam_dept_cd);
		cstmt.setString(13, dm.setoff_slip_clsf_cd);
		cstmt.setString(14, dm.dr_amt);
		cstmt.setString(15, dm.crdt_amt);
		cstmt.setString(16, dm.incmg_emp_no);
		cstmt.setString(17, dm.drcr_clsf_1);
		cstmt.setString(18, dm.drcr_clsf_2);
		cstmt.setString(19, dm.pch_x);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2540_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("fr_fisc_dt = [" + getFr_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("setoff_slip_clsf_cd = [" + getSetoff_slip_clsf_cd() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("crdt_amt = [" + getCrdt_amt() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("drcr_clsf_1 = [" + getDrcr_clsf_1() + "]");
		System.out.println("drcr_clsf_2 = [" + getDrcr_clsf_2() + "]");
		System.out.println("pch_x = [" + getPch_x() + "]");
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String fr_fisc_dt = req.getParameter("fr_fisc_dt");
if( fr_fisc_dt == null){
	System.out.println(this.toString+" : fr_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fr_fisc_dt is "+fr_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String setoff_slip_clsf_cd = req.getParameter("setoff_slip_clsf_cd");
if( setoff_slip_clsf_cd == null){
	System.out.println(this.toString+" : setoff_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_clsf_cd is "+setoff_slip_clsf_cd );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String crdt_amt = req.getParameter("crdt_amt");
if( crdt_amt == null){
	System.out.println(this.toString+" : crdt_amt is null" );
}else{
	System.out.println(this.toString+" : crdt_amt is "+crdt_amt );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String drcr_clsf_1 = req.getParameter("drcr_clsf_1");
if( drcr_clsf_1 == null){
	System.out.println(this.toString+" : drcr_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf_1 is "+drcr_clsf_1 );
}
String drcr_clsf_2 = req.getParameter("drcr_clsf_2");
if( drcr_clsf_2 == null){
	System.out.println(this.toString+" : drcr_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf_2 is "+drcr_clsf_2 );
}
String pch_x = req.getParameter("pch_x");
if( pch_x == null){
	System.out.println(this.toString+" : pch_x is null" );
}else{
	System.out.println(this.toString+" : pch_x is "+pch_x );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String setoff_slip_clsf_cd = Util.checkString(req.getParameter("setoff_slip_clsf_cd"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String drcr_clsf_1 = Util.checkString(req.getParameter("drcr_clsf_1"));
String drcr_clsf_2 = Util.checkString(req.getParameter("drcr_clsf_2"));
String pch_x = Util.checkString(req.getParameter("pch_x"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String fr_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String setoff_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_clsf_cd")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String drcr_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf_1")));
String drcr_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf_2")));
String pch_x = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_x")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setFr_fisc_dt(fr_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setMedi_cd(medi_cd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setEvnt_cd(evnt_cd);
dm.setClam_dept_cd(clam_dept_cd);
dm.setSetoff_slip_clsf_cd(setoff_slip_clsf_cd);
dm.setDr_amt(dr_amt);
dm.setCrdt_amt(crdt_amt);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setDrcr_clsf_1(drcr_clsf_1);
dm.setDrcr_clsf_2(drcr_clsf_2);
dm.setPch_x(pch_x);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 18:02:12 KST 2009 */