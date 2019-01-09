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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8064_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String asum_yymm;
	public String libo_int_rate;
	public String pay_prd_from;
	public String pay_prd_to;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String frex_cd;
	public String exrate;

	public FC_FUNC_8064_IDM(){}
	public FC_FUNC_8064_IDM(String cmpy_cd, String asum_yymm, String libo_int_rate, String pay_prd_from, String pay_prd_to, String incmg_pers, String incmg_pers_ipadd, String frex_cd, String exrate){
		this.cmpy_cd = cmpy_cd;
		this.asum_yymm = asum_yymm;
		this.libo_int_rate = libo_int_rate;
		this.pay_prd_from = pay_prd_from;
		this.pay_prd_to = pay_prd_to;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAsum_yymm(String asum_yymm){
		this.asum_yymm = asum_yymm;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setPay_prd_from(String pay_prd_from){
		this.pay_prd_from = pay_prd_from;
	}

	public void setPay_prd_to(String pay_prd_to){
		this.pay_prd_to = pay_prd_to;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAsum_yymm(){
		return this.asum_yymm;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getPay_prd_from(){
		return this.pay_prd_from;
	}

	public String getPay_prd_to(){
		return this.pay_prd_to;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8064_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8064_IDM dm = (FC_FUNC_8064_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.asum_yymm);
		cstmt.setString(5, dm.libo_int_rate);
		cstmt.setString(6, dm.pay_prd_from);
		cstmt.setString(7, dm.pay_prd_to);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.frex_cd);
		cstmt.setString(11, dm.exrate);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8064_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("asum_yymm = [" + getAsum_yymm() + "]");
		System.out.println("libo_int_rate = [" + getLibo_int_rate() + "]");
		System.out.println("pay_prd_from = [" + getPay_prd_from() + "]");
		System.out.println("pay_prd_to = [" + getPay_prd_to() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("frex_cd = [" + getFrex_cd() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
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
String asum_yymm = req.getParameter("asum_yymm");
if( asum_yymm == null){
	System.out.println(this.toString+" : asum_yymm is null" );
}else{
	System.out.println(this.toString+" : asum_yymm is "+asum_yymm );
}
String libo_int_rate = req.getParameter("libo_int_rate");
if( libo_int_rate == null){
	System.out.println(this.toString+" : libo_int_rate is null" );
}else{
	System.out.println(this.toString+" : libo_int_rate is "+libo_int_rate );
}
String pay_prd_from = req.getParameter("pay_prd_from");
if( pay_prd_from == null){
	System.out.println(this.toString+" : pay_prd_from is null" );
}else{
	System.out.println(this.toString+" : pay_prd_from is "+pay_prd_from );
}
String pay_prd_to = req.getParameter("pay_prd_to");
if( pay_prd_to == null){
	System.out.println(this.toString+" : pay_prd_to is null" );
}else{
	System.out.println(this.toString+" : pay_prd_to is "+pay_prd_to );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String frex_cd = req.getParameter("frex_cd");
if( frex_cd == null){
	System.out.println(this.toString+" : frex_cd is null" );
}else{
	System.out.println(this.toString+" : frex_cd is "+frex_cd );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String asum_yymm = Util.checkString(req.getParameter("asum_yymm"));
String libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
String pay_prd_from = Util.checkString(req.getParameter("pay_prd_from"));
String pay_prd_to = Util.checkString(req.getParameter("pay_prd_to"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String asum_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("asum_yymm")));
String libo_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("libo_int_rate")));
String pay_prd_from = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_prd_from")));
String pay_prd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_prd_to")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAsum_yymm(asum_yymm);
dm.setLibo_int_rate(libo_int_rate);
dm.setPay_prd_from(pay_prd_from);
dm.setPay_prd_to(pay_prd_to);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 13:18:30 KST 2009 */