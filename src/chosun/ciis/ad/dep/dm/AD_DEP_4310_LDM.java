/***************************************************************************************************
* 파일명 : .java
* 기능 : 전자어음 업로드
* 작성일자 : 2011.07.05
* 작성자 : KBS
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


public class AD_DEP_4310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String bank_cd;
	public String note_clsf_cd;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String rcpm_acct;
	public String sale_aprv_no;
	public String reg_yn;

	public AD_DEP_4310_LDM(){}
	
	public AD_DEP_4310_LDM(String cmpy_cd, String frdt, String todt, String bank_cd, String note_clsf_cd, String issu_cmpy_clsf_cd, String issu_pers_nm, String rcpm_acct, String sale_aprv_no, String reg_yn) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.bank_cd = bank_cd;
		this.note_clsf_cd = note_clsf_cd;
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.rcpm_acct = rcpm_acct;
		this.sale_aprv_no = sale_aprv_no;
		this.reg_yn = reg_yn;
	}



	public String getBank_cd() {
		return bank_cd;
	}

	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getFrdt() {
		return frdt;
	}

	public void setFrdt(String frdt) {
		this.frdt = frdt;
	}

	public String getIssu_cmpy_clsf_cd() {
		return issu_cmpy_clsf_cd;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd) {
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm() {
		return issu_pers_nm;
	}

	public void setIssu_pers_nm(String issu_pers_nm) {
		this.issu_pers_nm = issu_pers_nm;
	}

	public String getNote_clsf_cd() {
		return note_clsf_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd) {
		this.note_clsf_cd = note_clsf_cd;
	}

	public String getRcpm_acct() {
		return rcpm_acct;
	}

	public void setRcpm_acct(String rcpm_acct) {
		this.rcpm_acct = rcpm_acct;
	}

	public String getReg_yn() {
		return reg_yn;
	}

	public void setReg_yn(String reg_yn) {
		this.reg_yn = reg_yn;
	}

	public String getSale_aprv_no() {
		return sale_aprv_no;
	}

	public void setSale_aprv_no(String sale_aprv_no) {
		this.sale_aprv_no = sale_aprv_no;
	}

	public String getTodt() {
		return todt;
	}

	public void setTodt(String todt) {
		this.todt = todt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4310_LDM dm = (AD_DEP_4310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.bank_cd);
		cstmt.setString(7, dm.note_clsf_cd);
		cstmt.setString(8, dm.issu_cmpy_clsf_cd);
		cstmt.setString(9, dm.issu_pers_nm);
		cstmt.setString(10, dm.rcpm_acct);
		cstmt.setString(11, dm.sale_aprv_no);
		cstmt.setString(12, dm.reg_yn);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4310_LDataSet();
	}

	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 13:48:46 KST 2009 */