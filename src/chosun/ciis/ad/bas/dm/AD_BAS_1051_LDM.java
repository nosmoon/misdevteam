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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_1051_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String dlco_no;
	public String dlco_nm;
	public String grp_cmpy;
	public String indt_clsf;
	public String type_clsf;
	public String slcrg_pers;
	public String mchrg_pers;
	
	public AD_BAS_1051_LDM(){}
	
	public AD_BAS_1051_LDM(String cmpy_cd, String frdt, String todt, String dlco_no, String dlco_nm, String grp_cmpy, String indt_clsf, String type_clsf, String slcrg_pers, String mchrg_pers) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.grp_cmpy = grp_cmpy;
		this.indt_clsf = indt_clsf;
		this.type_clsf = type_clsf;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
	}

	

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
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

	public String getFrdt() {
		return frdt;
	}

	public void setFrdt(String frdt) {
		this.frdt = frdt;
	}

	public String getGrp_cmpy() {
		return grp_cmpy;
	}

	public void setGrp_cmpy(String grp_cmpy) {
		this.grp_cmpy = grp_cmpy;
	}

	public String getIndt_clsf() {
		return indt_clsf;
	}

	public void setIndt_clsf(String indt_clsf) {
		this.indt_clsf = indt_clsf;
	}

	public String getMchrg_pers() {
		return mchrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}

	public String getSlcrg_pers() {
		return slcrg_pers;
	}

	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}

	public String getTodt() {
		return todt;
	}

	public void setTodt(String todt) {
		this.todt = todt;
	}

	public String getType_clsf() {
		return type_clsf;
	}

	public void setType_clsf(String type_clsf) {
		this.type_clsf = type_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1051_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1051_LDM dm = (AD_BAS_1051_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);		
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.dlco_nm);
		cstmt.setString(8, dm.grp_cmpy);
		cstmt.setString(9, dm.indt_clsf);
		cstmt.setString(10, dm.type_clsf);
		cstmt.setString(11, dm.slcrg_pers);
		cstmt.setString(12, dm.mchrg_pers);
		
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1051_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setFrdt(frdt);
dm.setTodt(todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 19:30:42 KST 2009 */