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


public class FC_ACCT_5364_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String budg_cd;
	public String dr_amt;
	public String medi_cd;
	public String dtls_medi_cd;
	public String clam_dept_cd;
	public String use_dept_cd;
	public String pch_dept_nm;
	public String rmks1;
	public String rmks2;
	public String fisc_dt;
	public String occr_dt;
	public String incmg_emp_no;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String in_sicsgb;
	public String qunt;

	public FC_ACCT_5364_IDM(){}
	public FC_ACCT_5364_IDM(String cmpy_cd, String acct_cd, String budg_cd, String dr_amt, String medi_cd, String dtls_medi_cd, String clam_dept_cd, String use_dept_cd, String pch_dept_nm, String rmks1, String rmks2, String fisc_dt, String occr_dt, String incmg_emp_no, String incmg_pers, String incmg_pers_ipadd, String in_sicsgb, String qunt){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.budg_cd = budg_cd;
		this.dr_amt = dr_amt;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.clam_dept_cd = clam_dept_cd;
		this.use_dept_cd = use_dept_cd;
		this.pch_dept_nm = pch_dept_nm;
		this.rmks1 = rmks1;
		this.rmks2 = rmks2;
		this.fisc_dt = fisc_dt;
		this.occr_dt = occr_dt;
		this.incmg_emp_no = incmg_emp_no;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.in_sicsgb = in_sicsgb;
		this.qunt = qunt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setPch_dept_nm(String pch_dept_nm){
		this.pch_dept_nm = pch_dept_nm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIn_sicsgb(String in_sicsgb){
		this.in_sicsgb = in_sicsgb;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getPch_dept_nm(){
		return this.pch_dept_nm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIn_sicsgb(){
		return this.in_sicsgb;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5364_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5364_IDM dm = (FC_ACCT_5364_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.dr_amt);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.dtls_medi_cd);
		cstmt.setString(9, dm.clam_dept_cd);
		cstmt.setString(10, dm.use_dept_cd);
		cstmt.setString(11, dm.pch_dept_nm);
		cstmt.setString(12, dm.rmks1);
		cstmt.setString(13, dm.rmks2);
		cstmt.setString(14, dm.fisc_dt);
		cstmt.setString(15, dm.occr_dt);
		cstmt.setString(16, dm.incmg_emp_no);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipadd);
		cstmt.setString(19, dm.in_sicsgb);
		cstmt.setString(20, dm.qunt);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5364_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("acct_cd = " + getAcct_cd());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("dr_amt = " + getDr_amt());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("dtls_medi_cd = " + getDtls_medi_cd());
        System.out.println("clam_dept_cd = " + getClam_dept_cd());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
        System.out.println("pch_dept_nm = " + getPch_dept_nm());
        System.out.println("rmks1 = " + getRmks1());
        System.out.println("rmks2 = " + getRmks2());
        System.out.println("fisc_dt = " + getFisc_dt());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("incmg_emp_no = " + getIncmg_emp_no());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("in_sicsgb = " + getIn_sicsgb());
        System.out.println("qunt = " + getQunt());
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
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String pch_dept_nm = req.getParameter("pch_dept_nm");
if( pch_dept_nm == null){
	System.out.println(this.toString+" : pch_dept_nm is null" );
}else{
	System.out.println(this.toString+" : pch_dept_nm is "+pch_dept_nm );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
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
String in_sicsgb = req.getParameter("in_sicsgb");
if( in_sicsgb == null){
	System.out.println(this.toString+" : in_sicsgb is null" );
}else{
	System.out.println(this.toString+" : in_sicsgb is "+in_sicsgb );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String pch_dept_nm = Util.checkString(req.getParameter("pch_dept_nm"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
String qunt = Util.checkString(req.getParameter("qunt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String pch_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_dept_nm")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String in_sicsgb = Util.Uni2Ksc(Util.checkString(req.getParameter("in_sicsgb")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setBudg_cd(budg_cd);
dm.setDr_amt(dr_amt);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setClam_dept_cd(clam_dept_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setPch_dept_nm(pch_dept_nm);
dm.setRmks1(rmks1);
dm.setRmks2(rmks2);
dm.setFisc_dt(fisc_dt);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIn_sicsgb(in_sicsgb);
dm.setQunt(qunt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 10:05:19 KST 2009 */