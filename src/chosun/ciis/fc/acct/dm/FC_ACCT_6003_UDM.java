/***************************************************************************************************
* 파일명 : .java
* 기능 :  부가세관리-사업장 등록
* 작성일자 : 2010-01-22
* 작성자 : 노상현
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
 *  부가세관리-사업장 등록
 */


public class FC_ACCT_6003_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String erplace_cd;
	public String ernm;
	public String ern;
	public String presi_nm;
	public String erplace_addr;
	public String erplace_bizcond;
	public String erplace_item;
	public String taxoff;
	public String corp_reg_no;
	public String intg_dlco_cd;
	public String fac_clsf;
	public String use_yn;
	public String incmg_pers;
	public String ernm_tax;
	public String erplace_cd_tax;

	public FC_ACCT_6003_UDM(){}
	public FC_ACCT_6003_UDM(String cmpy_cd, String erplace_cd, String ernm, String ern, String presi_nm, String erplace_addr, String erplace_bizcond, String erplace_item, String taxoff, String corp_reg_no, String intg_dlco_cd, String fac_clsf, String use_yn, String incmg_pers, String ernm_tax, String erplace_cd_tax){
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.ernm = ernm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.erplace_addr = erplace_addr;
		this.erplace_bizcond = erplace_bizcond;
		this.erplace_item = erplace_item;
		this.taxoff = taxoff;
		this.corp_reg_no = corp_reg_no;
		this.intg_dlco_cd = intg_dlco_cd;
		this.fac_clsf = fac_clsf;
		this.use_yn = use_yn;
		this.incmg_pers = incmg_pers;
		this.ernm_tax = ernm_tax;
		this.erplace_cd_tax = erplace_cd_tax;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setErplace_addr(String erplace_addr){
		this.erplace_addr = erplace_addr;
	}

	public void setErplace_bizcond(String erplace_bizcond){
		this.erplace_bizcond = erplace_bizcond;
	}

	public void setErplace_item(String erplace_item){
		this.erplace_item = erplace_item;
	}

	public void setTaxoff(String taxoff){
		this.taxoff = taxoff;
	}

	public void setCorp_reg_no(String corp_reg_no){
		this.corp_reg_no = corp_reg_no;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setErnm_tax(String ernm_tax){
		this.ernm_tax = ernm_tax;
	}

	public void setErplace_cd_tax(String erplace_cd_tax){
		this.erplace_cd_tax = erplace_cd_tax;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErnm(){
		return this.ernm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getErplace_addr(){
		return this.erplace_addr;
	}

	public String getErplace_bizcond(){
		return this.erplace_bizcond;
	}

	public String getErplace_item(){
		return this.erplace_item;
	}

	public String getTaxoff(){
		return this.taxoff;
	}

	public String getCorp_reg_no(){
		return this.corp_reg_no;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getErnm_tax(){
		return this.ernm_tax;
	}

	public String getErplace_cd_tax(){
		return this.erplace_cd_tax;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6003_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6003_UDM dm = (FC_ACCT_6003_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.erplace_cd);
		cstmt.setString(5, dm.ernm);
		cstmt.setString(6, dm.ern);
		cstmt.setString(7, dm.presi_nm);
		cstmt.setString(8, dm.erplace_addr);
		cstmt.setString(9, dm.erplace_bizcond);
		cstmt.setString(10, dm.erplace_item);
		cstmt.setString(11, dm.taxoff);
		cstmt.setString(12, dm.corp_reg_no);
		cstmt.setString(13, dm.intg_dlco_cd);
		cstmt.setString(14, dm.fac_clsf);
		cstmt.setString(15, dm.use_yn);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.ernm_tax);
		cstmt.setString(18, dm.erplace_cd_tax);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6003_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("ernm = [" + getErnm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("erplace_addr = [" + getErplace_addr() + "]");
		System.out.println("erplace_bizcond = [" + getErplace_bizcond() + "]");
		System.out.println("erplace_item = [" + getErplace_item() + "]");
		System.out.println("taxoff = [" + getTaxoff() + "]");
		System.out.println("corp_reg_no = [" + getCorp_reg_no() + "]");
		System.out.println("intg_dlco_cd = [" + getIntg_dlco_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("ernm_tax = [" + getErnm_tax() + "]");
		System.out.println("erplace_cd_tax = [" + getErplace_cd_tax() + "]");
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
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String ernm = req.getParameter("ernm");
if( ernm == null){
	System.out.println(this.toString+" : ernm is null" );
}else{
	System.out.println(this.toString+" : ernm is "+ernm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String erplace_addr = req.getParameter("erplace_addr");
if( erplace_addr == null){
	System.out.println(this.toString+" : erplace_addr is null" );
}else{
	System.out.println(this.toString+" : erplace_addr is "+erplace_addr );
}
String erplace_bizcond = req.getParameter("erplace_bizcond");
if( erplace_bizcond == null){
	System.out.println(this.toString+" : erplace_bizcond is null" );
}else{
	System.out.println(this.toString+" : erplace_bizcond is "+erplace_bizcond );
}
String erplace_item = req.getParameter("erplace_item");
if( erplace_item == null){
	System.out.println(this.toString+" : erplace_item is null" );
}else{
	System.out.println(this.toString+" : erplace_item is "+erplace_item );
}
String taxoff = req.getParameter("taxoff");
if( taxoff == null){
	System.out.println(this.toString+" : taxoff is null" );
}else{
	System.out.println(this.toString+" : taxoff is "+taxoff );
}
String corp_reg_no = req.getParameter("corp_reg_no");
if( corp_reg_no == null){
	System.out.println(this.toString+" : corp_reg_no is null" );
}else{
	System.out.println(this.toString+" : corp_reg_no is "+corp_reg_no );
}
String intg_dlco_cd = req.getParameter("intg_dlco_cd");
if( intg_dlco_cd == null){
	System.out.println(this.toString+" : intg_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : intg_dlco_cd is "+intg_dlco_cd );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String ernm_tax = req.getParameter("ernm_tax");
if( ernm_tax == null){
	System.out.println(this.toString+" : ernm_tax is null" );
}else{
	System.out.println(this.toString+" : ernm_tax is "+ernm_tax );
}
String erplace_cd_tax = req.getParameter("erplace_cd_tax");
if( erplace_cd_tax == null){
	System.out.println(this.toString+" : erplace_cd_tax is null" );
}else{
	System.out.println(this.toString+" : erplace_cd_tax is "+erplace_cd_tax );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String ernm = Util.checkString(req.getParameter("ernm"));
String ern = Util.checkString(req.getParameter("ern"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String erplace_addr = Util.checkString(req.getParameter("erplace_addr"));
String erplace_bizcond = Util.checkString(req.getParameter("erplace_bizcond"));
String erplace_item = Util.checkString(req.getParameter("erplace_item"));
String taxoff = Util.checkString(req.getParameter("taxoff"));
String corp_reg_no = Util.checkString(req.getParameter("corp_reg_no"));
String intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String ernm_tax = Util.checkString(req.getParameter("ernm_tax"));
String erplace_cd_tax = Util.checkString(req.getParameter("erplace_cd_tax"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String ernm = Util.Uni2Ksc(Util.checkString(req.getParameter("ernm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String erplace_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_addr")));
String erplace_bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_bizcond")));
String erplace_item = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_item")));
String taxoff = Util.Uni2Ksc(Util.checkString(req.getParameter("taxoff")));
String corp_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_reg_no")));
String intg_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("intg_dlco_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String ernm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("ernm_tax")));
String erplace_cd_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd_tax")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setErnm(ernm);
dm.setErn(ern);
dm.setPresi_nm(presi_nm);
dm.setErplace_addr(erplace_addr);
dm.setErplace_bizcond(erplace_bizcond);
dm.setErplace_item(erplace_item);
dm.setTaxoff(taxoff);
dm.setCorp_reg_no(corp_reg_no);
dm.setIntg_dlco_cd(intg_dlco_cd);
dm.setFac_clsf(fac_clsf);
dm.setUse_yn(use_yn);
dm.setIncmg_pers(incmg_pers);
dm.setErnm_tax(ernm_tax);
dm.setErplace_cd_tax(erplace_cd_tax);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 27 15:50:57 KST 2010 */