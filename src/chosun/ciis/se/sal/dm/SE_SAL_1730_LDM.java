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


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1730_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String gubun;
	public String vat_gubun;
	public String correct_gubun;
	public String elec_yn;
	public String incmg_pers;

	public SE_SAL_1730_LDM(){}
	public SE_SAL_1730_LDM(String cmpy_cd, String yymm, String gubun, String vat_gubun, String correct_gubun, String elec_yn, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.gubun = gubun;
		this.vat_gubun = vat_gubun;
		this.correct_gubun = correct_gubun;
		this.elec_yn = elec_yn;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setVat_gubun(String vat_gubun){
		this.vat_gubun = vat_gubun;
	}

	public void setCorrect_gubun(String correct_gubun){
		this.correct_gubun = correct_gubun;
	}

	public void setElec_yn(String elec_yn){
		this.elec_yn = elec_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getVat_gubun(){
		return this.vat_gubun;
	}

	public String getCorrect_gubun(){
		return this.correct_gubun;
	}

	public String getElec_yn(){
		return this.elec_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_1730_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1730_LDM dm = (SE_SAL_1730_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.gubun);
		cstmt.setString(6, dm.vat_gubun);
		cstmt.setString(7, dm.correct_gubun);
		cstmt.setString(8, dm.elec_yn);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1730_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("vat_gubun = [" + getVat_gubun() + "]");
		System.out.println("correct_gubun = [" + getCorrect_gubun() + "]");
		System.out.println("elec_yn = [" + getElec_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String vat_gubun = req.getParameter("vat_gubun");
if( vat_gubun == null){
	System.out.println(this.toString+" : vat_gubun is null" );
}else{
	System.out.println(this.toString+" : vat_gubun is "+vat_gubun );
}
String correct_gubun = req.getParameter("correct_gubun");
if( correct_gubun == null){
	System.out.println(this.toString+" : correct_gubun is null" );
}else{
	System.out.println(this.toString+" : correct_gubun is "+correct_gubun );
}
String elec_yn = req.getParameter("elec_yn");
if( elec_yn == null){
	System.out.println(this.toString+" : elec_yn is null" );
}else{
	System.out.println(this.toString+" : elec_yn is "+elec_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String gubun = Util.checkString(req.getParameter("gubun"));
String vat_gubun = Util.checkString(req.getParameter("vat_gubun"));
String correct_gubun = Util.checkString(req.getParameter("correct_gubun"));
String elec_yn = Util.checkString(req.getParameter("elec_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String vat_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_gubun")));
String correct_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("correct_gubun")));
String elec_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setGubun(gubun);
dm.setVat_gubun(vat_gubun);
dm.setCorrect_gubun(correct_gubun);
dm.setElec_yn(elec_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 09:44:11 KST 2009 */