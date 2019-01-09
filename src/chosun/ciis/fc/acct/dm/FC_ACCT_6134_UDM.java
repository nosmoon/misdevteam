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


public class FC_ACCT_6134_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String decl_amt1;
	public String incmg_pers;
	public String vat_decl_yymm;
	public String purc_sale_clsf_cd;
	public String erplace_cd;

	public FC_ACCT_6134_UDM(){}
	public FC_ACCT_6134_UDM(String cmpy_cd, String decl_amt1, String incmg_pers, String vat_decl_yymm, String purc_sale_clsf_cd, String erplace_cd){
		this.cmpy_cd = cmpy_cd;
		this.decl_amt1 = decl_amt1;
		this.incmg_pers = incmg_pers;
		this.vat_decl_yymm = vat_decl_yymm;
		this.purc_sale_clsf_cd = purc_sale_clsf_cd;
		this.erplace_cd = erplace_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDecl_amt1(String decl_amt1){
		this.decl_amt1 = decl_amt1;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setVat_decl_yymm(String vat_decl_yymm){
		this.vat_decl_yymm = vat_decl_yymm;
	}

	public void setPurc_sale_clsf_cd(String purc_sale_clsf_cd){
		this.purc_sale_clsf_cd = purc_sale_clsf_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDecl_amt1(){
		return this.decl_amt1;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getVat_decl_yymm(){
		return this.vat_decl_yymm;
	}

	public String getPurc_sale_clsf_cd(){
		return this.purc_sale_clsf_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6134_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6134_UDM dm = (FC_ACCT_6134_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.decl_amt1);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.vat_decl_yymm);
		cstmt.setString(7, dm.purc_sale_clsf_cd);
		cstmt.setString(8, dm.erplace_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6134_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("decl_amt1 = [" + getDecl_amt1() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("vat_decl_yymm = [" + getVat_decl_yymm() + "]");
		System.out.println("purc_sale_clsf_cd = [" + getPurc_sale_clsf_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
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
String decl_amt1 = req.getParameter("decl_amt1");
if( decl_amt1 == null){
	System.out.println(this.toString+" : decl_amt1 is null" );
}else{
	System.out.println(this.toString+" : decl_amt1 is "+decl_amt1 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String vat_decl_yymm = req.getParameter("vat_decl_yymm");
if( vat_decl_yymm == null){
	System.out.println(this.toString+" : vat_decl_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_decl_yymm is "+vat_decl_yymm );
}
String purc_sale_clsf_cd = req.getParameter("purc_sale_clsf_cd");
if( purc_sale_clsf_cd == null){
	System.out.println(this.toString+" : purc_sale_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : purc_sale_clsf_cd is "+purc_sale_clsf_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String decl_amt1 = Util.checkString(req.getParameter("decl_amt1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
String purc_sale_clsf_cd = Util.checkString(req.getParameter("purc_sale_clsf_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String decl_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("decl_amt1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String vat_decl_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_decl_yymm")));
String purc_sale_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_sale_clsf_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDecl_amt1(decl_amt1);
dm.setIncmg_pers(incmg_pers);
dm.setVat_decl_yymm(vat_decl_yymm);
dm.setPurc_sale_clsf_cd(purc_sale_clsf_cd);
dm.setErplace_cd(erplace_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 19:43:14 KST 2009 */