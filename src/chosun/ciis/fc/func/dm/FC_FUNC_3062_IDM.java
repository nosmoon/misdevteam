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


public class FC_FUNC_3062_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_dd;
	public String newspap_cash;
	public String newspap_bill_90;
	public String newspap_bill_120;
	public String newspap_bill_125;
	public String publis_cash;
	public String publis_bill_90;
	public String publis_bill_120;
	public String publis_bill_125;
	public String newspap_sale;
	public String publis_sale;
	public String lent_amt;
	public String etc_amt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_3062_IDM(){}
	public FC_FUNC_3062_IDM(String cmpy_cd, String rcpm_dd, String newspap_cash, String newspap_bill_90, String newspap_bill_120, String newspap_bill_125, String publis_cash, String publis_bill_90, String publis_bill_120, String publis_bill_125, String newspap_sale, String publis_sale, String lent_amt, String etc_amt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_dd = rcpm_dd;
		this.newspap_cash = newspap_cash;
		this.newspap_bill_90 = newspap_bill_90;
		this.newspap_bill_120 = newspap_bill_120;
		this.newspap_bill_125 = newspap_bill_125;
		this.publis_cash = publis_cash;
		this.publis_bill_90 = publis_bill_90;
		this.publis_bill_120 = publis_bill_120;
		this.publis_bill_125 = publis_bill_125;
		this.newspap_sale = newspap_sale;
		this.publis_sale = publis_sale;
		this.lent_amt = lent_amt;
		this.etc_amt = etc_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_dd(String rcpm_dd){
		this.rcpm_dd = rcpm_dd;
	}

	public void setNewspap_cash(String newspap_cash){
		this.newspap_cash = newspap_cash;
	}

	public void setNewspap_bill_90(String newspap_bill_90){
		this.newspap_bill_90 = newspap_bill_90;
	}

	public void setNewspap_bill_120(String newspap_bill_120){
		this.newspap_bill_120 = newspap_bill_120;
	}

	public void setNewspap_bill_125(String newspap_bill_125){
		this.newspap_bill_125 = newspap_bill_125;
	}

	public void setPublis_cash(String publis_cash){
		this.publis_cash = publis_cash;
	}

	public void setPublis_bill_90(String publis_bill_90){
		this.publis_bill_90 = publis_bill_90;
	}

	public void setPublis_bill_120(String publis_bill_120){
		this.publis_bill_120 = publis_bill_120;
	}

	public void setPublis_bill_125(String publis_bill_125){
		this.publis_bill_125 = publis_bill_125;
	}

	public void setNewspap_sale(String newspap_sale){
		this.newspap_sale = newspap_sale;
	}

	public void setPublis_sale(String publis_sale){
		this.publis_sale = publis_sale;
	}

	public void setLent_amt(String lent_amt){
		this.lent_amt = lent_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_dd(){
		return this.rcpm_dd;
	}

	public String getNewspap_cash(){
		return this.newspap_cash;
	}

	public String getNewspap_bill_90(){
		return this.newspap_bill_90;
	}

	public String getNewspap_bill_120(){
		return this.newspap_bill_120;
	}

	public String getNewspap_bill_125(){
		return this.newspap_bill_125;
	}

	public String getPublis_cash(){
		return this.publis_cash;
	}

	public String getPublis_bill_90(){
		return this.publis_bill_90;
	}

	public String getPublis_bill_120(){
		return this.publis_bill_120;
	}

	public String getPublis_bill_125(){
		return this.publis_bill_125;
	}

	public String getNewspap_sale(){
		return this.newspap_sale;
	}

	public String getPublis_sale(){
		return this.publis_sale;
	}

	public String getLent_amt(){
		return this.lent_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3062_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3062_IDM dm = (FC_FUNC_3062_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_dd);
		cstmt.setString(5, dm.newspap_cash);
		cstmt.setString(6, dm.newspap_bill_90);
		cstmt.setString(7, dm.newspap_bill_120);
		cstmt.setString(8, dm.newspap_bill_125);
		cstmt.setString(9, dm.publis_cash);
		cstmt.setString(10, dm.publis_bill_90);
		cstmt.setString(11, dm.publis_bill_120);
		cstmt.setString(12, dm.publis_bill_125);
		cstmt.setString(13, dm.newspap_sale);
		cstmt.setString(14, dm.publis_sale);
		cstmt.setString(15, dm.lent_amt);
		cstmt.setString(16, dm.etc_amt);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3062_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_dd = [" + getRcpm_dd() + "]");
		System.out.println("newspap_cash = [" + getNewspap_cash() + "]");
		System.out.println("newspap_bill_90 = [" + getNewspap_bill_90() + "]");
		System.out.println("newspap_bill_120 = [" + getNewspap_bill_120() + "]");
		System.out.println("newspap_bill_125 = [" + getNewspap_bill_125() + "]");
		System.out.println("publis_cash = [" + getPublis_cash() + "]");
		System.out.println("publis_bill_90 = [" + getPublis_bill_90() + "]");
		System.out.println("publis_bill_120 = [" + getPublis_bill_120() + "]");
		System.out.println("publis_bill_125 = [" + getPublis_bill_125() + "]");
		System.out.println("newspap_sale = [" + getNewspap_sale() + "]");
		System.out.println("publis_sale = [" + getPublis_sale() + "]");
		System.out.println("lent_amt = [" + getLent_amt() + "]");
		System.out.println("etc_amt = [" + getEtc_amt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String rcpm_dd = req.getParameter("rcpm_dd");
if( rcpm_dd == null){
	System.out.println(this.toString+" : rcpm_dd is null" );
}else{
	System.out.println(this.toString+" : rcpm_dd is "+rcpm_dd );
}
String newspap_cash = req.getParameter("newspap_cash");
if( newspap_cash == null){
	System.out.println(this.toString+" : newspap_cash is null" );
}else{
	System.out.println(this.toString+" : newspap_cash is "+newspap_cash );
}
String newspap_bill_90 = req.getParameter("newspap_bill_90");
if( newspap_bill_90 == null){
	System.out.println(this.toString+" : newspap_bill_90 is null" );
}else{
	System.out.println(this.toString+" : newspap_bill_90 is "+newspap_bill_90 );
}
String newspap_bill_120 = req.getParameter("newspap_bill_120");
if( newspap_bill_120 == null){
	System.out.println(this.toString+" : newspap_bill_120 is null" );
}else{
	System.out.println(this.toString+" : newspap_bill_120 is "+newspap_bill_120 );
}
String newspap_bill_125 = req.getParameter("newspap_bill_125");
if( newspap_bill_125 == null){
	System.out.println(this.toString+" : newspap_bill_125 is null" );
}else{
	System.out.println(this.toString+" : newspap_bill_125 is "+newspap_bill_125 );
}
String publis_cash = req.getParameter("publis_cash");
if( publis_cash == null){
	System.out.println(this.toString+" : publis_cash is null" );
}else{
	System.out.println(this.toString+" : publis_cash is "+publis_cash );
}
String publis_bill_90 = req.getParameter("publis_bill_90");
if( publis_bill_90 == null){
	System.out.println(this.toString+" : publis_bill_90 is null" );
}else{
	System.out.println(this.toString+" : publis_bill_90 is "+publis_bill_90 );
}
String publis_bill_120 = req.getParameter("publis_bill_120");
if( publis_bill_120 == null){
	System.out.println(this.toString+" : publis_bill_120 is null" );
}else{
	System.out.println(this.toString+" : publis_bill_120 is "+publis_bill_120 );
}
String publis_bill_125 = req.getParameter("publis_bill_125");
if( publis_bill_125 == null){
	System.out.println(this.toString+" : publis_bill_125 is null" );
}else{
	System.out.println(this.toString+" : publis_bill_125 is "+publis_bill_125 );
}
String newspap_sale = req.getParameter("newspap_sale");
if( newspap_sale == null){
	System.out.println(this.toString+" : newspap_sale is null" );
}else{
	System.out.println(this.toString+" : newspap_sale is "+newspap_sale );
}
String publis_sale = req.getParameter("publis_sale");
if( publis_sale == null){
	System.out.println(this.toString+" : publis_sale is null" );
}else{
	System.out.println(this.toString+" : publis_sale is "+publis_sale );
}
String lent_amt = req.getParameter("lent_amt");
if( lent_amt == null){
	System.out.println(this.toString+" : lent_amt is null" );
}else{
	System.out.println(this.toString+" : lent_amt is "+lent_amt );
}
String etc_amt = req.getParameter("etc_amt");
if( etc_amt == null){
	System.out.println(this.toString+" : etc_amt is null" );
}else{
	System.out.println(this.toString+" : etc_amt is "+etc_amt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_dd = Util.checkString(req.getParameter("rcpm_dd"));
String newspap_cash = Util.checkString(req.getParameter("newspap_cash"));
String newspap_bill_90 = Util.checkString(req.getParameter("newspap_bill_90"));
String newspap_bill_120 = Util.checkString(req.getParameter("newspap_bill_120"));
String newspap_bill_125 = Util.checkString(req.getParameter("newspap_bill_125"));
String publis_cash = Util.checkString(req.getParameter("publis_cash"));
String publis_bill_90 = Util.checkString(req.getParameter("publis_bill_90"));
String publis_bill_120 = Util.checkString(req.getParameter("publis_bill_120"));
String publis_bill_125 = Util.checkString(req.getParameter("publis_bill_125"));
String newspap_sale = Util.checkString(req.getParameter("newspap_sale"));
String publis_sale = Util.checkString(req.getParameter("publis_sale"));
String lent_amt = Util.checkString(req.getParameter("lent_amt"));
String etc_amt = Util.checkString(req.getParameter("etc_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dd")));
String newspap_cash = Util.Uni2Ksc(Util.checkString(req.getParameter("newspap_cash")));
String newspap_bill_90 = Util.Uni2Ksc(Util.checkString(req.getParameter("newspap_bill_90")));
String newspap_bill_120 = Util.Uni2Ksc(Util.checkString(req.getParameter("newspap_bill_120")));
String newspap_bill_125 = Util.Uni2Ksc(Util.checkString(req.getParameter("newspap_bill_125")));
String publis_cash = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_cash")));
String publis_bill_90 = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_bill_90")));
String publis_bill_120 = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_bill_120")));
String publis_bill_125 = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_bill_125")));
String newspap_sale = Util.Uni2Ksc(Util.checkString(req.getParameter("newspap_sale")));
String publis_sale = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_sale")));
String lent_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("lent_amt")));
String etc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_dd(rcpm_dd);
dm.setNewspap_cash(newspap_cash);
dm.setNewspap_bill_90(newspap_bill_90);
dm.setNewspap_bill_120(newspap_bill_120);
dm.setNewspap_bill_125(newspap_bill_125);
dm.setPublis_cash(publis_cash);
dm.setPublis_bill_90(publis_bill_90);
dm.setPublis_bill_120(publis_bill_120);
dm.setPublis_bill_125(publis_bill_125);
dm.setNewspap_sale(newspap_sale);
dm.setPublis_sale(publis_sale);
dm.setLent_amt(lent_amt);
dm.setEtc_amt(etc_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 14:49:42 KST 2009 */