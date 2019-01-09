/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5630_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String subscrpt_cd;
	public String subscrpt_gb;
	public String buyer_cd;
	public String buyer_nm;
	public String buyer_cmpy;
	public String buyer_team;
	public String buy_amt;
	public String out_dt;
	public String gb;

	public SS_SLS_EXTN_5630_UDM(){}
	public SS_SLS_EXTN_5630_UDM(String incmgpers, String subscrpt_cd, String subscrpt_gb, String buyer_cd, String buyer_nm, String buyer_cmpy, String buyer_team, String buy_amt, String out_dt, String gb){
		this.incmgpers = incmgpers;
		this.subscrpt_cd = subscrpt_cd;
		this.subscrpt_gb = subscrpt_gb;
		this.buyer_cd = buyer_cd;
		this.buyer_nm = buyer_nm;
		this.buyer_cmpy = buyer_cmpy;
		this.buyer_team = buyer_team;
		this.buy_amt = buy_amt;
		this.out_dt = out_dt;
		this.gb = gb;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setSubscrpt_gb(String subscrpt_gb){
		this.subscrpt_gb = subscrpt_gb;
	}

	public void setBuyer_cd(String buyer_cd){
		this.buyer_cd = buyer_cd;
	}

	public void setBuyer_nm(String buyer_nm){
		this.buyer_nm = buyer_nm;
	}

	public void setBuyer_cmpy(String buyer_cmpy){
		this.buyer_cmpy = buyer_cmpy;
	}

	public void setBuyer_team(String buyer_team){
		this.buyer_team = buyer_team;
	}

	public void setBuy_amt(String buy_amt){
		this.buy_amt = buy_amt;
	}

	public void setOut_dt(String out_dt){
		this.out_dt = out_dt;
	}

	public void setGb(String gb){
		this.gb = gb;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSubscrpt_cd(){
		return this.subscrpt_cd;
	}

	public String getSubscrpt_gb(){
		return this.subscrpt_gb;
	}

	public String getBuyer_cd(){
		return this.buyer_cd;
	}

	public String getBuyer_nm(){
		return this.buyer_nm;
	}

	public String getBuyer_cmpy(){
		return this.buyer_cmpy;
	}

	public String getBuyer_team(){
		return this.buyer_team;
	}

	public String getBuy_amt(){
		return this.buy_amt;
	}

	public String getOut_dt(){
		return this.out_dt;
	}

	public String getGb(){
		return this.gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5630_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5630_UDM dm = (SS_SLS_EXTN_5630_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.subscrpt_cd);
		cstmt.setString(5, dm.subscrpt_gb);
		cstmt.setString(6, dm.buyer_cd);
		cstmt.setString(7, dm.buyer_nm);
		cstmt.setString(8, dm.buyer_cmpy);
		cstmt.setString(9, dm.buyer_team);
		cstmt.setString(10, dm.buy_amt);
		cstmt.setString(11, dm.out_dt);
		cstmt.setString(12, dm.gb);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5630_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("subscrpt_cd = [" + getSubscrpt_cd() + "]");
		System.out.println("subscrpt_gb = [" + getSubscrpt_gb() + "]");
		System.out.println("buyer_cd = [" + getBuyer_cd() + "]");
		System.out.println("buyer_nm = [" + getBuyer_nm() + "]");
		System.out.println("buyer_cmpy = [" + getBuyer_cmpy() + "]");
		System.out.println("buyer_team = [" + getBuyer_team() + "]");
		System.out.println("buy_amt = [" + getBuy_amt() + "]");
		System.out.println("out_dt = [" + getOut_dt() + "]");
		System.out.println("gb = [" + getGb() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String subscrpt_cd = req.getParameter("subscrpt_cd");
if( subscrpt_cd == null){
	System.out.println(this.toString+" : subscrpt_cd is null" );
}else{
	System.out.println(this.toString+" : subscrpt_cd is "+subscrpt_cd );
}
String subscrpt_gb = req.getParameter("subscrpt_gb");
if( subscrpt_gb == null){
	System.out.println(this.toString+" : subscrpt_gb is null" );
}else{
	System.out.println(this.toString+" : subscrpt_gb is "+subscrpt_gb );
}
String buyer_cd = req.getParameter("buyer_cd");
if( buyer_cd == null){
	System.out.println(this.toString+" : buyer_cd is null" );
}else{
	System.out.println(this.toString+" : buyer_cd is "+buyer_cd );
}
String buyer_nm = req.getParameter("buyer_nm");
if( buyer_nm == null){
	System.out.println(this.toString+" : buyer_nm is null" );
}else{
	System.out.println(this.toString+" : buyer_nm is "+buyer_nm );
}
String buyer_cmpy = req.getParameter("buyer_cmpy");
if( buyer_cmpy == null){
	System.out.println(this.toString+" : buyer_cmpy is null" );
}else{
	System.out.println(this.toString+" : buyer_cmpy is "+buyer_cmpy );
}
String buyer_team = req.getParameter("buyer_team");
if( buyer_team == null){
	System.out.println(this.toString+" : buyer_team is null" );
}else{
	System.out.println(this.toString+" : buyer_team is "+buyer_team );
}
String buy_amt = req.getParameter("buy_amt");
if( buy_amt == null){
	System.out.println(this.toString+" : buy_amt is null" );
}else{
	System.out.println(this.toString+" : buy_amt is "+buy_amt );
}
String out_dt = req.getParameter("out_dt");
if( out_dt == null){
	System.out.println(this.toString+" : out_dt is null" );
}else{
	System.out.println(this.toString+" : out_dt is "+out_dt );
}
String gb = req.getParameter("gb");
if( gb == null){
	System.out.println(this.toString+" : gb is null" );
}else{
	System.out.println(this.toString+" : gb is "+gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String subscrpt_cd = Util.checkString(req.getParameter("subscrpt_cd"));
String subscrpt_gb = Util.checkString(req.getParameter("subscrpt_gb"));
String buyer_cd = Util.checkString(req.getParameter("buyer_cd"));
String buyer_nm = Util.checkString(req.getParameter("buyer_nm"));
String buyer_cmpy = Util.checkString(req.getParameter("buyer_cmpy"));
String buyer_team = Util.checkString(req.getParameter("buyer_team"));
String buy_amt = Util.checkString(req.getParameter("buy_amt"));
String out_dt = Util.checkString(req.getParameter("out_dt"));
String gb = Util.checkString(req.getParameter("gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
String subscrpt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_gb")));
String buyer_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_cd")));
String buyer_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_nm")));
String buyer_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_cmpy")));
String buyer_team = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_team")));
String buy_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_amt")));
String out_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("out_dt")));
String gb = Util.Uni2Ksc(Util.checkString(req.getParameter("gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setSubscrpt_cd(subscrpt_cd);
dm.setSubscrpt_gb(subscrpt_gb);
dm.setBuyer_cd(buyer_cd);
dm.setBuyer_nm(buyer_nm);
dm.setBuyer_cmpy(buyer_cmpy);
dm.setBuyer_team(buyer_team);
dm.setBuy_amt(buy_amt);
dm.setOut_dt(out_dt);
dm.setGb(gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 08 11:00:13 KST 2018 */