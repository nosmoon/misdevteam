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


package chosun.ciis.is.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.ds.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1720_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String amt_clsf1;
	public String amt_clsf2;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_RPT_1720_LDM(){}
	public IS_RPT_1720_LDM(String cmpy_cd, String amt_clsf1, String amt_clsf2, String sale_clsf, String spc_sale_clsf, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.amt_clsf1 = amt_clsf1;
		this.amt_clsf2 = amt_clsf2;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAmt_clsf1(String amt_clsf1){
		this.amt_clsf1 = amt_clsf1;
	}

	public void setAmt_clsf2(String amt_clsf2){
		this.amt_clsf2 = amt_clsf2;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAmt_clsf1(){
		return this.amt_clsf1;
	}

	public String getAmt_clsf2(){
		return this.amt_clsf2;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_RPT_1720_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_RPT_1720_LDM dm = (IS_RPT_1720_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.amt_clsf1);
		cstmt.setString(5, dm.amt_clsf2);
		cstmt.setString(6, dm.sale_clsf);
		cstmt.setString(7, dm.spc_sale_clsf);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.rpt.ds.IS_RPT_1720_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("amt_clsf1 = [" + getAmt_clsf1() + "]");
		System.out.println("amt_clsf2 = [" + getAmt_clsf2() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String amt_clsf1 = req.getParameter("amt_clsf1");
if( amt_clsf1 == null){
	System.out.println(this.toString+" : amt_clsf1 is null" );
}else{
	System.out.println(this.toString+" : amt_clsf1 is "+amt_clsf1 );
}
String amt_clsf2 = req.getParameter("amt_clsf2");
if( amt_clsf2 == null){
	System.out.println(this.toString+" : amt_clsf2 is null" );
}else{
	System.out.println(this.toString+" : amt_clsf2 is "+amt_clsf2 );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spc_sale_clsf = req.getParameter("spc_sale_clsf");
if( spc_sale_clsf == null){
	System.out.println(this.toString+" : spc_sale_clsf is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf is "+spc_sale_clsf );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String amt_clsf1 = Util.checkString(req.getParameter("amt_clsf1"));
String amt_clsf2 = Util.checkString(req.getParameter("amt_clsf2"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String amt_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt_clsf1")));
String amt_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("amt_clsf2")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAmt_clsf1(amt_clsf1);
dm.setAmt_clsf2(amt_clsf2);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 31 16:39:14 KST 2012 */