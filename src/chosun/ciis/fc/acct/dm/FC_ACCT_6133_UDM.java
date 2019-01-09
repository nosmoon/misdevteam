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


public class FC_ACCT_6133_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_yn;
	public String vat_decl_yymm;
	public String chg_pers;
	public String erplace_cd;

	public FC_ACCT_6133_UDM(){}
	public FC_ACCT_6133_UDM(String cmpy_cd, String clos_yn, String vat_decl_yymm, String chg_pers, String erplace_cd){
		this.cmpy_cd = cmpy_cd;
		this.clos_yn = clos_yn;
		this.vat_decl_yymm = vat_decl_yymm;
		this.chg_pers = chg_pers;
		this.erplace_cd = erplace_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setVat_decl_yymm(String vat_decl_yymm){
		this.vat_decl_yymm = vat_decl_yymm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getVat_decl_yymm(){
		return this.vat_decl_yymm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6133_U(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6133_UDM dm = (FC_ACCT_6133_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_yn);
		cstmt.setString(5, dm.vat_decl_yymm);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.erplace_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6133_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("vat_decl_yymm = [" + getVat_decl_yymm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String vat_decl_yymm = req.getParameter("vat_decl_yymm");
if( vat_decl_yymm == null){
	System.out.println(this.toString+" : vat_decl_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_decl_yymm is "+vat_decl_yymm );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
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
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String vat_decl_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_decl_yymm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setVat_decl_yymm(vat_decl_yymm);
dm.setChg_pers(chg_pers);
dm.setErplace_cd(erplace_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 19:43:14 KST 2009 */