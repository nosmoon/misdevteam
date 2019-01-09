/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.26
* 작성자 : KBS
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

public class AD_BAS_3601_LDM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String cust_seq;
	public String cust_name;
	public String chrg_pers;
	public String slcrg_pers;
	public String mchrg_pers;
	public String cust_item;
	public String grp_cmpy;

	public AD_BAS_3601_LDM(){}
	
	public AD_BAS_3601_LDM(String cmpy_cd, String medi_clsf, String dlco_no, String dlco_nm, String cust_seq, String cust_name, String chrg_pers, String slcrg_pers, String mchrg_pers, String cust_item) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.cust_seq = cust_seq;
		this.cust_name = cust_name;
		this.chrg_pers = chrg_pers;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.cust_item = cust_item;
	}

	public String getChrg_pers() {
		return chrg_pers;
	}
	public void setChrg_pers(String chrg_pers) {
		this.chrg_pers = chrg_pers;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getCust_item() {
		return cust_item;
	}
	public void setCust_item(String cust_item) {
		this.cust_item = cust_item;
	}

	public String getCust_seq() {
		return cust_seq;
	}
	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getDlco_no() {
		return dlco_no;
	}
	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}
	
	public String getDlco_nm() {
		return dlco_nm;
	}
	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}

	public String getMchrg_pers() {
		return mchrg_pers;
	}
	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}
	
	public String getMedi_clsf() {
		return medi_clsf;
	}
	public void setMedi_clsf(String medi_clsf) {
		this.medi_clsf = medi_clsf;
	}

	public String getSlcrg_pers() {
		return slcrg_pers;
	}
	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}
	
	public String getGrp_cmpy() {
		return grp_cmpy;
	}
	public void setGrp_cmpy(String grp_cmpy) {
		this.grp_cmpy = grp_cmpy;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3601_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_BAS_3601_LDM dm = (AD_BAS_3601_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.dlco_nm);
		cstmt.setString(7, dm.cust_seq);
		cstmt.setString(8, dm.cust_name);
		cstmt.setString(9, dm.grp_cmpy);
		cstmt.setString(10, dm.slcrg_pers);
		cstmt.setString(11, dm.mchrg_pers);
		cstmt.setString(12, dm.chrg_pers);
		cstmt.setString(13, dm.cust_item);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3601_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("cust_seq = [" + getCust_seq() + "]");
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
String oth_clsf = req.getParameter("oth_clsf");
if( oth_clsf == null){
	System.out.println(this.toString+" : oth_clsf is null" );
}else{
	System.out.println(this.toString+" : oth_clsf is "+oth_clsf );
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
String advcs = req.getParameter("advcs");
if( advcs == null){
	System.out.println(this.toString+" : advcs is null" );
}else{
	System.out.println(this.toString+" : advcs is "+advcs );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String indt_nm = req.getParameter("indt_nm");
if( indt_nm == null){
	System.out.println(this.toString+" : indt_nm is null" );
}else{
	System.out.println(this.toString+" : indt_nm is "+indt_nm );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String advcs = Util.checkString(req.getParameter("advcs"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String indt_nm = Util.checkString(req.getParameter("indt_nm"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String oth_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String advcs = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String indt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_nm")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOth_clsf(oth_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setAdvcs(advcs);
dm.setAdvt_cont(advt_cont);
dm.setIndt_nm(indt_nm);
dm.setSlcrg_pers(slcrg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 18:21:44 KST 2009 */