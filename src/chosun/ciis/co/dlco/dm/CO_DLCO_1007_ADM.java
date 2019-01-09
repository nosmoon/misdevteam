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


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1007_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cd_cust;
	public String nm_cust;
	public String no_tax;
	public String nm_president;
	public String nm_businesscond;
	public String nm_item;
	public String no_post;
	public String nm_address;
	public String nm_addrdtl;
	public String nm_cust_full;
	public String use_yn;
	public String custype;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_pers_cmpy_cd;

	public CO_DLCO_1007_ADM(){}
	public CO_DLCO_1007_ADM(String mode, String cd_cust, String nm_cust, String no_tax, String nm_president, String nm_businesscond, String nm_item, String no_post, String nm_address, String nm_addrdtl, String nm_cust_full, String use_yn, String custype, String incmg_pers_ipadd, String incmg_pers, String incmg_pers_cmpy_cd){
		this.mode = mode;
		this.cd_cust = cd_cust;
		this.nm_cust = nm_cust;
		this.no_tax = no_tax;
		this.nm_president = nm_president;
		this.nm_businesscond = nm_businesscond;
		this.nm_item = nm_item;
		this.no_post = no_post;
		this.nm_address = nm_address;
		this.nm_addrdtl = nm_addrdtl;
		this.nm_cust_full = nm_cust_full;
		this.use_yn = use_yn;
		this.custype = custype;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_cmpy_cd = incmg_pers_cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCd_cust(String cd_cust){
		this.cd_cust = cd_cust;
	}

	public void setNm_cust(String nm_cust){
		this.nm_cust = nm_cust;
	}

	public void setNo_tax(String no_tax){
		this.no_tax = no_tax;
	}

	public void setNm_president(String nm_president){
		this.nm_president = nm_president;
	}

	public void setNm_businesscond(String nm_businesscond){
		this.nm_businesscond = nm_businesscond;
	}

	public void setNm_item(String nm_item){
		this.nm_item = nm_item;
	}

	public void setNo_post(String no_post){
		this.no_post = no_post;
	}

	public void setNm_address(String nm_address){
		this.nm_address = nm_address;
	}

	public void setNm_addrdtl(String nm_addrdtl){
		this.nm_addrdtl = nm_addrdtl;
	}

	public void setNm_cust_full(String nm_cust_full){
		this.nm_cust_full = nm_cust_full;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setCustype(String custype){
		this.custype = custype;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_cmpy_cd(String incmg_pers_cmpy_cd){
		this.incmg_pers_cmpy_cd = incmg_pers_cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCd_cust(){
		return this.cd_cust;
	}

	public String getNm_cust(){
		return this.nm_cust;
	}

	public String getNo_tax(){
		return this.no_tax;
	}

	public String getNm_president(){
		return this.nm_president;
	}

	public String getNm_businesscond(){
		return this.nm_businesscond;
	}

	public String getNm_item(){
		return this.nm_item;
	}

	public String getNo_post(){
		return this.no_post;
	}

	public String getNm_address(){
		return this.nm_address;
	}

	public String getNm_addrdtl(){
		return this.nm_addrdtl;
	}

	public String getNm_cust_full(){
		return this.nm_cust_full;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getCustype(){
		return this.custype;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_cmpy_cd(){
		return this.incmg_pers_cmpy_cd;
	}

	public String getSQL(){ /*BIS DBMS에 존재하는 프로시져임 MISCOM의 프로시져는 테스트 작업*/
		 return "{ call SP_CO_DLCO_1007_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1007_ADM dm = (CO_DLCO_1007_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cd_cust);
		cstmt.setString(5, dm.nm_cust);
		cstmt.setString(6, dm.no_tax);
		cstmt.setString(7, dm.nm_president);
		cstmt.setString(8, dm.nm_businesscond);
		cstmt.setString(9, dm.nm_item);
		cstmt.setString(10, dm.no_post);
		cstmt.setString(11, dm.nm_address);
		cstmt.setString(12, dm.nm_addrdtl);
		cstmt.setString(13, dm.nm_cust_full);
		cstmt.setString(14, dm.use_yn);
		cstmt.setString(15, dm.custype);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_cmpy_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1007_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cd_cust = [" + getCd_cust() + "]");
		System.out.println("nm_cust = [" + getNm_cust() + "]");
		System.out.println("no_tax = [" + getNo_tax() + "]");
		System.out.println("nm_president = [" + getNm_president() + "]");
		System.out.println("nm_businesscond = [" + getNm_businesscond() + "]");
		System.out.println("nm_item = [" + getNm_item() + "]");
		System.out.println("no_post = [" + getNo_post() + "]");
		System.out.println("nm_address = [" + getNm_address() + "]");
		System.out.println("nm_addrdtl = [" + getNm_addrdtl() + "]");
		System.out.println("nm_cust_full = [" + getNm_cust_full() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("custype = [" + getCustype() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_cmpy_cd = [" + getIncmg_pers_cmpy_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cd_cust = req.getParameter("cd_cust");
if( cd_cust == null){
	System.out.println(this.toString+" : cd_cust is null" );
}else{
	System.out.println(this.toString+" : cd_cust is "+cd_cust );
}
String nm_cust = req.getParameter("nm_cust");
if( nm_cust == null){
	System.out.println(this.toString+" : nm_cust is null" );
}else{
	System.out.println(this.toString+" : nm_cust is "+nm_cust );
}
String no_tax = req.getParameter("no_tax");
if( no_tax == null){
	System.out.println(this.toString+" : no_tax is null" );
}else{
	System.out.println(this.toString+" : no_tax is "+no_tax );
}
String nm_president = req.getParameter("nm_president");
if( nm_president == null){
	System.out.println(this.toString+" : nm_president is null" );
}else{
	System.out.println(this.toString+" : nm_president is "+nm_president );
}
String nm_businesscond = req.getParameter("nm_businesscond");
if( nm_businesscond == null){
	System.out.println(this.toString+" : nm_businesscond is null" );
}else{
	System.out.println(this.toString+" : nm_businesscond is "+nm_businesscond );
}
String nm_item = req.getParameter("nm_item");
if( nm_item == null){
	System.out.println(this.toString+" : nm_item is null" );
}else{
	System.out.println(this.toString+" : nm_item is "+nm_item );
}
String no_post = req.getParameter("no_post");
if( no_post == null){
	System.out.println(this.toString+" : no_post is null" );
}else{
	System.out.println(this.toString+" : no_post is "+no_post );
}
String nm_address = req.getParameter("nm_address");
if( nm_address == null){
	System.out.println(this.toString+" : nm_address is null" );
}else{
	System.out.println(this.toString+" : nm_address is "+nm_address );
}
String nm_addrdtl = req.getParameter("nm_addrdtl");
if( nm_addrdtl == null){
	System.out.println(this.toString+" : nm_addrdtl is null" );
}else{
	System.out.println(this.toString+" : nm_addrdtl is "+nm_addrdtl );
}
String nm_cust_full = req.getParameter("nm_cust_full");
if( nm_cust_full == null){
	System.out.println(this.toString+" : nm_cust_full is null" );
}else{
	System.out.println(this.toString+" : nm_cust_full is "+nm_cust_full );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String custype = req.getParameter("custype");
if( custype == null){
	System.out.println(this.toString+" : custype is null" );
}else{
	System.out.println(this.toString+" : custype is "+custype );
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
String incmg_pers_cmpy_cd = req.getParameter("incmg_pers_cmpy_cd");
if( incmg_pers_cmpy_cd == null){
	System.out.println(this.toString+" : incmg_pers_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_cmpy_cd is "+incmg_pers_cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cd_cust = Util.checkString(req.getParameter("cd_cust"));
String nm_cust = Util.checkString(req.getParameter("nm_cust"));
String no_tax = Util.checkString(req.getParameter("no_tax"));
String nm_president = Util.checkString(req.getParameter("nm_president"));
String nm_businesscond = Util.checkString(req.getParameter("nm_businesscond"));
String nm_item = Util.checkString(req.getParameter("nm_item"));
String no_post = Util.checkString(req.getParameter("no_post"));
String nm_address = Util.checkString(req.getParameter("nm_address"));
String nm_addrdtl = Util.checkString(req.getParameter("nm_addrdtl"));
String nm_cust_full = Util.checkString(req.getParameter("nm_cust_full"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String custype = Util.checkString(req.getParameter("custype"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_cmpy_cd = Util.checkString(req.getParameter("incmg_pers_cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cd_cust = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_cust")));
String nm_cust = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_cust")));
String no_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("no_tax")));
String nm_president = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_president")));
String nm_businesscond = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_businesscond")));
String nm_item = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_item")));
String no_post = Util.Uni2Ksc(Util.checkString(req.getParameter("no_post")));
String nm_address = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_address")));
String nm_addrdtl = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_addrdtl")));
String nm_cust_full = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_cust_full")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String custype = Util.Uni2Ksc(Util.checkString(req.getParameter("custype")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCd_cust(cd_cust);
dm.setNm_cust(nm_cust);
dm.setNo_tax(no_tax);
dm.setNm_president(nm_president);
dm.setNm_businesscond(nm_businesscond);
dm.setNm_item(nm_item);
dm.setNo_post(no_post);
dm.setNm_address(nm_address);
dm.setNm_addrdtl(nm_addrdtl);
dm.setNm_cust_full(nm_cust_full);
dm.setUse_yn(use_yn);
dm.setCustype(custype);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_cmpy_cd(incmg_pers_cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 14:24:33 KST 2012 */