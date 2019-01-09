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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_5210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String hndl_clsf;
	public String dlco_no;
	public String prof_type_cd;
	public String pubc_frdt;
	public String pubc_todt;
	public String make_frdt;
	public String make_todt;
	public String pre_issu_yn;
	public String elec_tax_bill_yn;
	public String acct_cd;
	public String emp_no;

	public AD_NMD_5210_LDM(){}
	public AD_NMD_5210_LDM(String cmpy_cd, String medi_cd, String hndl_clsf, String dlco_no, String prof_type_cd, String pubc_frdt, String pubc_todt, String make_frdt, String make_todt, String pre_issu_yn, String elec_tax_bill_yn, String acct_cd, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.prof_type_cd = prof_type_cd;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.make_frdt = make_frdt;
		this.make_todt = make_todt;
		this.pre_issu_yn = pre_issu_yn;
		this.elec_tax_bill_yn = elec_tax_bill_yn;
		this.acct_cd = acct_cd;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setMake_frdt(String make_frdt){
		this.make_frdt = make_frdt;
	}

	public void setMake_todt(String make_todt){
		this.make_todt = make_todt;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
	}

	public void setElec_tax_bill_yn(String elec_tax_bill_yn){
		this.elec_tax_bill_yn = elec_tax_bill_yn;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getMake_frdt(){
		return this.make_frdt;
	}

	public String getMake_todt(){
		return this.make_todt;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}

	public String getElec_tax_bill_yn(){
		return this.elec_tax_bill_yn;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_5210_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_5210_LDM dm = (AD_NMD_5210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.hndl_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.prof_type_cd);
		cstmt.setString(8, dm.pubc_frdt);
		cstmt.setString(9, dm.pubc_todt);
		cstmt.setString(10, dm.make_frdt);
		cstmt.setString(11, dm.make_todt);
		cstmt.setString(12, dm.pre_issu_yn);
		cstmt.setString(13, dm.elec_tax_bill_yn);
		cstmt.setString(14, dm.acct_cd);
		cstmt.setString(15, dm.emp_no);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_5210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("pubc_frdt = [" + getPubc_frdt() + "]");
		System.out.println("pubc_todt = [" + getPubc_todt() + "]");
		System.out.println("make_frdt = [" + getMake_frdt() + "]");
		System.out.println("make_todt = [" + getMake_todt() + "]");
		System.out.println("pre_issu_yn = [" + getPre_issu_yn() + "]");
		System.out.println("elec_tax_bill_yn = [" + getElec_tax_bill_yn() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String pubc_frdt = req.getParameter("pubc_frdt");
if( pubc_frdt == null){
	System.out.println(this.toString+" : pubc_frdt is null" );
}else{
	System.out.println(this.toString+" : pubc_frdt is "+pubc_frdt );
}
String pubc_todt = req.getParameter("pubc_todt");
if( pubc_todt == null){
	System.out.println(this.toString+" : pubc_todt is null" );
}else{
	System.out.println(this.toString+" : pubc_todt is "+pubc_todt );
}
String make_frdt = req.getParameter("make_frdt");
if( make_frdt == null){
	System.out.println(this.toString+" : make_frdt is null" );
}else{
	System.out.println(this.toString+" : make_frdt is "+make_frdt );
}
String make_todt = req.getParameter("make_todt");
if( make_todt == null){
	System.out.println(this.toString+" : make_todt is null" );
}else{
	System.out.println(this.toString+" : make_todt is "+make_todt );
}
String pre_issu_yn = req.getParameter("pre_issu_yn");
if( pre_issu_yn == null){
	System.out.println(this.toString+" : pre_issu_yn is null" );
}else{
	System.out.println(this.toString+" : pre_issu_yn is "+pre_issu_yn );
}
String elec_tax_bill_yn = req.getParameter("elec_tax_bill_yn");
if( elec_tax_bill_yn == null){
	System.out.println(this.toString+" : elec_tax_bill_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_bill_yn is "+elec_tax_bill_yn );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
String make_frdt = Util.checkString(req.getParameter("make_frdt"));
String make_todt = Util.checkString(req.getParameter("make_todt"));
String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
String elec_tax_bill_yn = Util.checkString(req.getParameter("elec_tax_bill_yn"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String pubc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_frdt")));
String pubc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_todt")));
String make_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_frdt")));
String make_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_todt")));
String pre_issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_issu_yn")));
String elec_tax_bill_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_bill_yn")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setProf_type_cd(prof_type_cd);
dm.setPubc_frdt(pubc_frdt);
dm.setPubc_todt(pubc_todt);
dm.setMake_frdt(make_frdt);
dm.setMake_todt(make_todt);
dm.setPre_issu_yn(pre_issu_yn);
dm.setElec_tax_bill_yn(elec_tax_bill_yn);
dm.setAcct_cd(acct_cd);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 22 16:21:22 KST 2014 */