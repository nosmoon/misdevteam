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


public class FC_FUNC_3060_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_yymm;
	public String to_yymm;
	public String newsp_advert_amt;
	public String newsp_rate_cash;
	public String newsp_rate_90;
	public String newsp_rate_120;
	public String newsp_rate_125;
	public String publis_advert_amt;
	public String publis_rate_cash;
	public String publis_rate_90;
	public String publis_rate_120;
	public String publis_rate_125;
	public String newsp_sale_amt;
	public String newsp_sale_dd;
	public String publis_sale_amt;
	public String publis_sale_dd;
	public String lent_proceeds_amt;
	public String lent_proceeds_dd;
	public String etc_even_amt;
	public String etc_odd_amt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_3060_IDM(){}
	public FC_FUNC_3060_IDM(String cmpy_cd, String from_yymm, String to_yymm, String newsp_advert_amt, String newsp_rate_cash, String newsp_rate_90, String newsp_rate_120, String newsp_rate_125, String publis_advert_amt, String publis_rate_cash, String publis_rate_90, String publis_rate_120, String publis_rate_125, String newsp_sale_amt, String newsp_sale_dd, String publis_sale_amt, String publis_sale_dd, String lent_proceeds_amt, String lent_proceeds_dd, String etc_even_amt, String etc_odd_amt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.from_yymm = from_yymm;
		this.to_yymm = to_yymm;
		this.newsp_advert_amt = newsp_advert_amt;
		this.newsp_rate_cash = newsp_rate_cash;
		this.newsp_rate_90 = newsp_rate_90;
		this.newsp_rate_120 = newsp_rate_120;
		this.newsp_rate_125 = newsp_rate_125;
		this.publis_advert_amt = publis_advert_amt;
		this.publis_rate_cash = publis_rate_cash;
		this.publis_rate_90 = publis_rate_90;
		this.publis_rate_120 = publis_rate_120;
		this.publis_rate_125 = publis_rate_125;
		this.newsp_sale_amt = newsp_sale_amt;
		this.newsp_sale_dd = newsp_sale_dd;
		this.publis_sale_amt = publis_sale_amt;
		this.publis_sale_dd = publis_sale_dd;
		this.lent_proceeds_amt = lent_proceeds_amt;
		this.lent_proceeds_dd = lent_proceeds_dd;
		this.etc_even_amt = etc_even_amt;
		this.etc_odd_amt = etc_odd_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_yymm(String from_yymm){
		this.from_yymm = from_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setNewsp_advert_amt(String newsp_advert_amt){
		this.newsp_advert_amt = newsp_advert_amt;
	}

	public void setNewsp_rate_cash(String newsp_rate_cash){
		this.newsp_rate_cash = newsp_rate_cash;
	}

	public void setNewsp_rate_90(String newsp_rate_90){
		this.newsp_rate_90 = newsp_rate_90;
	}

	public void setNewsp_rate_120(String newsp_rate_120){
		this.newsp_rate_120 = newsp_rate_120;
	}

	public void setNewsp_rate_125(String newsp_rate_125){
		this.newsp_rate_125 = newsp_rate_125;
	}

	public void setPublis_advert_amt(String publis_advert_amt){
		this.publis_advert_amt = publis_advert_amt;
	}

	public void setPublis_rate_cash(String publis_rate_cash){
		this.publis_rate_cash = publis_rate_cash;
	}

	public void setPublis_rate_90(String publis_rate_90){
		this.publis_rate_90 = publis_rate_90;
	}

	public void setPublis_rate_120(String publis_rate_120){
		this.publis_rate_120 = publis_rate_120;
	}

	public void setPublis_rate_125(String publis_rate_125){
		this.publis_rate_125 = publis_rate_125;
	}

	public void setNewsp_sale_amt(String newsp_sale_amt){
		this.newsp_sale_amt = newsp_sale_amt;
	}

	public void setNewsp_sale_dd(String newsp_sale_dd){
		this.newsp_sale_dd = newsp_sale_dd;
	}

	public void setPublis_sale_amt(String publis_sale_amt){
		this.publis_sale_amt = publis_sale_amt;
	}

	public void setPublis_sale_dd(String publis_sale_dd){
		this.publis_sale_dd = publis_sale_dd;
	}

	public void setLent_proceeds_amt(String lent_proceeds_amt){
		this.lent_proceeds_amt = lent_proceeds_amt;
	}

	public void setLent_proceeds_dd(String lent_proceeds_dd){
		this.lent_proceeds_dd = lent_proceeds_dd;
	}

	public void setEtc_even_amt(String etc_even_amt){
		this.etc_even_amt = etc_even_amt;
	}

	public void setEtc_odd_amt(String etc_odd_amt){
		this.etc_odd_amt = etc_odd_amt;
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

	public String getFrom_yymm(){
		return this.from_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getNewsp_advert_amt(){
		return this.newsp_advert_amt;
	}

	public String getNewsp_rate_cash(){
		return this.newsp_rate_cash;
	}

	public String getNewsp_rate_90(){
		return this.newsp_rate_90;
	}

	public String getNewsp_rate_120(){
		return this.newsp_rate_120;
	}

	public String getNewsp_rate_125(){
		return this.newsp_rate_125;
	}

	public String getPublis_advert_amt(){
		return this.publis_advert_amt;
	}

	public String getPublis_rate_cash(){
		return this.publis_rate_cash;
	}

	public String getPublis_rate_90(){
		return this.publis_rate_90;
	}

	public String getPublis_rate_120(){
		return this.publis_rate_120;
	}

	public String getPublis_rate_125(){
		return this.publis_rate_125;
	}

	public String getNewsp_sale_amt(){
		return this.newsp_sale_amt;
	}

	public String getNewsp_sale_dd(){
		return this.newsp_sale_dd;
	}

	public String getPublis_sale_amt(){
		return this.publis_sale_amt;
	}

	public String getPublis_sale_dd(){
		return this.publis_sale_dd;
	}

	public String getLent_proceeds_amt(){
		return this.lent_proceeds_amt;
	}

	public String getLent_proceeds_dd(){
		return this.lent_proceeds_dd;
	}

	public String getEtc_even_amt(){
		return this.etc_even_amt;
	}

	public String getEtc_odd_amt(){
		return this.etc_odd_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3060_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3060_IDM dm = (FC_FUNC_3060_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_yymm);
		cstmt.setString(5, dm.to_yymm);
		cstmt.setString(6, dm.newsp_advert_amt);
		cstmt.setString(7, dm.newsp_rate_cash);
		cstmt.setString(8, dm.newsp_rate_90);
		cstmt.setString(9, dm.newsp_rate_120);
		cstmt.setString(10, dm.newsp_rate_125);
		cstmt.setString(11, dm.publis_advert_amt);
		cstmt.setString(12, dm.publis_rate_cash);
		cstmt.setString(13, dm.publis_rate_90);
		cstmt.setString(14, dm.publis_rate_120);
		cstmt.setString(15, dm.publis_rate_125);
		cstmt.setString(16, dm.newsp_sale_amt);
		cstmt.setString(17, dm.newsp_sale_dd);
		cstmt.setString(18, dm.publis_sale_amt);
		cstmt.setString(19, dm.publis_sale_dd);
		cstmt.setString(20, dm.lent_proceeds_amt);
		cstmt.setString(21, dm.lent_proceeds_dd);
		cstmt.setString(22, dm.etc_even_amt);
		cstmt.setString(23, dm.etc_odd_amt);
		cstmt.setString(24, dm.incmg_pers);
		cstmt.setString(25, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3060_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_yymm = [" + getFrom_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("newsp_advert_amt = [" + getNewsp_advert_amt() + "]");
		System.out.println("newsp_rate_cash = [" + getNewsp_rate_cash() + "]");
		System.out.println("newsp_rate_90 = [" + getNewsp_rate_90() + "]");
		System.out.println("newsp_rate_120 = [" + getNewsp_rate_120() + "]");
		System.out.println("newsp_rate_125 = [" + getNewsp_rate_125() + "]");
		System.out.println("publis_advert_amt = [" + getPublis_advert_amt() + "]");
		System.out.println("publis_rate_cash = [" + getPublis_rate_cash() + "]");
		System.out.println("publis_rate_90 = [" + getPublis_rate_90() + "]");
		System.out.println("publis_rate_120 = [" + getPublis_rate_120() + "]");
		System.out.println("publis_rate_125 = [" + getPublis_rate_125() + "]");
		System.out.println("newsp_sale_amt = [" + getNewsp_sale_amt() + "]");
		System.out.println("newsp_sale_dd = [" + getNewsp_sale_dd() + "]");
		System.out.println("publis_sale_amt = [" + getPublis_sale_amt() + "]");
		System.out.println("publis_sale_dd = [" + getPublis_sale_dd() + "]");
		System.out.println("lent_proceeds_amt = [" + getLent_proceeds_amt() + "]");
		System.out.println("lent_proceeds_dd = [" + getLent_proceeds_dd() + "]");
		System.out.println("etc_even_amt = [" + getEtc_even_amt() + "]");
		System.out.println("etc_odd_amt = [" + getEtc_odd_amt() + "]");
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
String from_yymm = req.getParameter("from_yymm");
if( from_yymm == null){
	System.out.println(this.toString+" : from_yymm is null" );
}else{
	System.out.println(this.toString+" : from_yymm is "+from_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String newsp_advert_amt = req.getParameter("newsp_advert_amt");
if( newsp_advert_amt == null){
	System.out.println(this.toString+" : newsp_advert_amt is null" );
}else{
	System.out.println(this.toString+" : newsp_advert_amt is "+newsp_advert_amt );
}
String newsp_rate_cash = req.getParameter("newsp_rate_cash");
if( newsp_rate_cash == null){
	System.out.println(this.toString+" : newsp_rate_cash is null" );
}else{
	System.out.println(this.toString+" : newsp_rate_cash is "+newsp_rate_cash );
}
String newsp_rate_90 = req.getParameter("newsp_rate_90");
if( newsp_rate_90 == null){
	System.out.println(this.toString+" : newsp_rate_90 is null" );
}else{
	System.out.println(this.toString+" : newsp_rate_90 is "+newsp_rate_90 );
}
String newsp_rate_120 = req.getParameter("newsp_rate_120");
if( newsp_rate_120 == null){
	System.out.println(this.toString+" : newsp_rate_120 is null" );
}else{
	System.out.println(this.toString+" : newsp_rate_120 is "+newsp_rate_120 );
}
String newsp_rate_125 = req.getParameter("newsp_rate_125");
if( newsp_rate_125 == null){
	System.out.println(this.toString+" : newsp_rate_125 is null" );
}else{
	System.out.println(this.toString+" : newsp_rate_125 is "+newsp_rate_125 );
}
String publis_advert_amt = req.getParameter("publis_advert_amt");
if( publis_advert_amt == null){
	System.out.println(this.toString+" : publis_advert_amt is null" );
}else{
	System.out.println(this.toString+" : publis_advert_amt is "+publis_advert_amt );
}
String publis_rate_cash = req.getParameter("publis_rate_cash");
if( publis_rate_cash == null){
	System.out.println(this.toString+" : publis_rate_cash is null" );
}else{
	System.out.println(this.toString+" : publis_rate_cash is "+publis_rate_cash );
}
String publis_rate_90 = req.getParameter("publis_rate_90");
if( publis_rate_90 == null){
	System.out.println(this.toString+" : publis_rate_90 is null" );
}else{
	System.out.println(this.toString+" : publis_rate_90 is "+publis_rate_90 );
}
String publis_rate_120 = req.getParameter("publis_rate_120");
if( publis_rate_120 == null){
	System.out.println(this.toString+" : publis_rate_120 is null" );
}else{
	System.out.println(this.toString+" : publis_rate_120 is "+publis_rate_120 );
}
String publis_rate_125 = req.getParameter("publis_rate_125");
if( publis_rate_125 == null){
	System.out.println(this.toString+" : publis_rate_125 is null" );
}else{
	System.out.println(this.toString+" : publis_rate_125 is "+publis_rate_125 );
}
String newsp_sale_amt = req.getParameter("newsp_sale_amt");
if( newsp_sale_amt == null){
	System.out.println(this.toString+" : newsp_sale_amt is null" );
}else{
	System.out.println(this.toString+" : newsp_sale_amt is "+newsp_sale_amt );
}
String newsp_sale_dd = req.getParameter("newsp_sale_dd");
if( newsp_sale_dd == null){
	System.out.println(this.toString+" : newsp_sale_dd is null" );
}else{
	System.out.println(this.toString+" : newsp_sale_dd is "+newsp_sale_dd );
}
String publis_sale_amt = req.getParameter("publis_sale_amt");
if( publis_sale_amt == null){
	System.out.println(this.toString+" : publis_sale_amt is null" );
}else{
	System.out.println(this.toString+" : publis_sale_amt is "+publis_sale_amt );
}
String publis_sale_dd = req.getParameter("publis_sale_dd");
if( publis_sale_dd == null){
	System.out.println(this.toString+" : publis_sale_dd is null" );
}else{
	System.out.println(this.toString+" : publis_sale_dd is "+publis_sale_dd );
}
String lent_proceeds_amt = req.getParameter("lent_proceeds_amt");
if( lent_proceeds_amt == null){
	System.out.println(this.toString+" : lent_proceeds_amt is null" );
}else{
	System.out.println(this.toString+" : lent_proceeds_amt is "+lent_proceeds_amt );
}
String lent_proceeds_dd = req.getParameter("lent_proceeds_dd");
if( lent_proceeds_dd == null){
	System.out.println(this.toString+" : lent_proceeds_dd is null" );
}else{
	System.out.println(this.toString+" : lent_proceeds_dd is "+lent_proceeds_dd );
}
String etc_even_amt = req.getParameter("etc_even_amt");
if( etc_even_amt == null){
	System.out.println(this.toString+" : etc_even_amt is null" );
}else{
	System.out.println(this.toString+" : etc_even_amt is "+etc_even_amt );
}
String etc_odd_amt = req.getParameter("etc_odd_amt");
if( etc_odd_amt == null){
	System.out.println(this.toString+" : etc_odd_amt is null" );
}else{
	System.out.println(this.toString+" : etc_odd_amt is "+etc_odd_amt );
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
String from_yymm = Util.checkString(req.getParameter("from_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String newsp_advert_amt = Util.checkString(req.getParameter("newsp_advert_amt"));
String newsp_rate_cash = Util.checkString(req.getParameter("newsp_rate_cash"));
String newsp_rate_90 = Util.checkString(req.getParameter("newsp_rate_90"));
String newsp_rate_120 = Util.checkString(req.getParameter("newsp_rate_120"));
String newsp_rate_125 = Util.checkString(req.getParameter("newsp_rate_125"));
String publis_advert_amt = Util.checkString(req.getParameter("publis_advert_amt"));
String publis_rate_cash = Util.checkString(req.getParameter("publis_rate_cash"));
String publis_rate_90 = Util.checkString(req.getParameter("publis_rate_90"));
String publis_rate_120 = Util.checkString(req.getParameter("publis_rate_120"));
String publis_rate_125 = Util.checkString(req.getParameter("publis_rate_125"));
String newsp_sale_amt = Util.checkString(req.getParameter("newsp_sale_amt"));
String newsp_sale_dd = Util.checkString(req.getParameter("newsp_sale_dd"));
String publis_sale_amt = Util.checkString(req.getParameter("publis_sale_amt"));
String publis_sale_dd = Util.checkString(req.getParameter("publis_sale_dd"));
String lent_proceeds_amt = Util.checkString(req.getParameter("lent_proceeds_amt"));
String lent_proceeds_dd = Util.checkString(req.getParameter("lent_proceeds_dd"));
String etc_even_amt = Util.checkString(req.getParameter("etc_even_amt"));
String etc_odd_amt = Util.checkString(req.getParameter("etc_odd_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("from_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String newsp_advert_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_advert_amt")));
String newsp_rate_cash = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_rate_cash")));
String newsp_rate_90 = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_rate_90")));
String newsp_rate_120 = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_rate_120")));
String newsp_rate_125 = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_rate_125")));
String publis_advert_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_advert_amt")));
String publis_rate_cash = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_rate_cash")));
String publis_rate_90 = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_rate_90")));
String publis_rate_120 = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_rate_120")));
String publis_rate_125 = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_rate_125")));
String newsp_sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_sale_amt")));
String newsp_sale_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("newsp_sale_dd")));
String publis_sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_sale_amt")));
String publis_sale_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("publis_sale_dd")));
String lent_proceeds_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("lent_proceeds_amt")));
String lent_proceeds_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("lent_proceeds_dd")));
String etc_even_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_even_amt")));
String etc_odd_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_odd_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_yymm(from_yymm);
dm.setTo_yymm(to_yymm);
dm.setNewsp_advert_amt(newsp_advert_amt);
dm.setNewsp_rate_cash(newsp_rate_cash);
dm.setNewsp_rate_90(newsp_rate_90);
dm.setNewsp_rate_120(newsp_rate_120);
dm.setNewsp_rate_125(newsp_rate_125);
dm.setPublis_advert_amt(publis_advert_amt);
dm.setPublis_rate_cash(publis_rate_cash);
dm.setPublis_rate_90(publis_rate_90);
dm.setPublis_rate_120(publis_rate_120);
dm.setPublis_rate_125(publis_rate_125);
dm.setNewsp_sale_amt(newsp_sale_amt);
dm.setNewsp_sale_dd(newsp_sale_dd);
dm.setPublis_sale_amt(publis_sale_amt);
dm.setPublis_sale_dd(publis_sale_dd);
dm.setLent_proceeds_amt(lent_proceeds_amt);
dm.setLent_proceeds_dd(lent_proceeds_dd);
dm.setEtc_even_amt(etc_even_amt);
dm.setEtc_odd_amt(etc_odd_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 19:19:03 KST 2009 */