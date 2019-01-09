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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1751_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String emp_no;
	public String medi_cd;
	public String date_clsf;
	public String frdt;
	public String todt;
	public String rcpm_plac_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String rcpm_clsf;
	public String note_clsf;
	public String mchrg_pers;
	public String mchrg_pers_nm;

	public AD_DEP_1751_LDM(){}
	

	public AD_DEP_1751_LDM(String cmpy_cd, String medi_clsf, String emp_no, String medi_cd, String date_clsf, String frdt, String todt, String rcpm_plac_clsf, String dlco_no, String dlco_nm, String rcpm_clsf, String note_clsf, String mchrg_pers, String mchrg_pers_nm) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.emp_no = emp_no;
		this.medi_cd = medi_cd;
		this.date_clsf = date_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.rcpm_clsf = rcpm_clsf;
		this.note_clsf = note_clsf;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	

	public String getCmpy_cd() {
		return cmpy_cd;
	}


	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}


	public String getDate_clsf() {
		return date_clsf;
	}


	public void setDate_clsf(String date_clsf) {
		this.date_clsf = date_clsf;
	}


	public String getDlco_nm() {
		return dlco_nm;
	}


	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}


	public String getDlco_no() {
		return dlco_no;
	}


	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}


	public String getEmp_no() {
		return emp_no;
	}


	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}


	public String getFrdt() {
		return frdt;
	}


	public void setFrdt(String frdt) {
		this.frdt = frdt;
	}


	public String getMchrg_pers() {
		return mchrg_pers;
	}


	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}


	public String getMchrg_pers_nm() {
		return mchrg_pers_nm;
	}


	public void setMchrg_pers_nm(String mchrg_pers_nm) {
		this.mchrg_pers_nm = mchrg_pers_nm;
	}


	public String getMedi_cd() {
		return medi_cd;
	}


	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}


	public String getMedi_clsf() {
		return medi_clsf;
	}


	public void setMedi_clsf(String medi_clsf) {
		this.medi_clsf = medi_clsf;
	}


	public String getNote_clsf() {
		return note_clsf;
	}


	public void setNote_clsf(String note_clsf) {
		this.note_clsf = note_clsf;
	}


	public String getRcpm_clsf() {
		return rcpm_clsf;
	}


	public void setRcpm_clsf(String rcpm_clsf) {
		this.rcpm_clsf = rcpm_clsf;
	}


	public String getRcpm_plac_clsf() {
		return rcpm_plac_clsf;
	}


	public void setRcpm_plac_clsf(String rcpm_plac_clsf) {
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}


	public String getTodt() {
		return todt;
	}


	public void setTodt(String todt) {
		this.todt = todt;
	}


	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_1751_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1751_LDM dm = (AD_DEP_1751_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.date_clsf);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.rcpm_plac_clsf);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.dlco_nm);
		cstmt.setString(13, dm.rcpm_clsf);
		cstmt.setString(14, dm.note_clsf);
		cstmt.setString(15, dm.mchrg_pers);
		cstmt.setString(16, dm.mchrg_pers_nm);
		
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1751_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
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
String dealmedicd = req.getParameter("dealmedicd");
if( dealmedicd == null){
	System.out.println(this.toString+" : dealmedicd is null" );
}else{
	System.out.println(this.toString+" : dealmedicd is "+dealmedicd );
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String fr_rcpm_shet_no = req.getParameter("fr_rcpm_shet_no");
if( fr_rcpm_shet_no == null){
	System.out.println(this.toString+" : fr_rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : fr_rcpm_shet_no is "+fr_rcpm_shet_no );
}
String to_rcpm_shet_no = req.getParameter("to_rcpm_shet_no");
if( to_rcpm_shet_no == null){
	System.out.println(this.toString+" : to_rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : to_rcpm_shet_no is "+to_rcpm_shet_no );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String rmtt_dt = req.getParameter("rmtt_dt");
if( rmtt_dt == null){
	System.out.println(this.toString+" : rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt is "+rmtt_dt );
}
String rmtt_amt = req.getParameter("rmtt_amt");
if( rmtt_amt == null){
	System.out.println(this.toString+" : rmtt_amt is null" );
}else{
	System.out.println(this.toString+" : rmtt_amt is "+rmtt_amt );
}
String rmtt_plac = req.getParameter("rmtt_plac");
if( rmtt_plac == null){
	System.out.println(this.toString+" : rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac is "+rmtt_plac );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dealmedicd = Util.checkString(req.getParameter("dealmedicd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String fr_rcpm_shet_no = Util.checkString(req.getParameter("fr_rcpm_shet_no"));
String to_rcpm_shet_no = Util.checkString(req.getParameter("to_rcpm_shet_no"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
String rmtt_amt = Util.checkString(req.getParameter("rmtt_amt"));
String rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dealmedicd = Util.Uni2Ksc(Util.checkString(req.getParameter("dealmedicd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String fr_rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_rcpm_shet_no")));
String to_rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_rcpm_shet_no")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt")));
String rmtt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_amt")));
String rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDealmedicd(dealmedicd);
dm.setMedi_cd(medi_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setFr_rcpm_shet_no(fr_rcpm_shet_no);
dm.setTo_rcpm_shet_no(to_rcpm_shet_no);
dm.setAcct_cd(acct_cd);
dm.setRmtt_dt(rmtt_dt);
dm.setRmtt_amt(rmtt_amt);
dm.setRmtt_plac(rmtt_plac);
dm.setProc_clsf(proc_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 18:09:51 KST 2009 */