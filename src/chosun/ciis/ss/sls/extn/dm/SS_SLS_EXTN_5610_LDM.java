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


public class SS_SLS_EXTN_5610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dt_gb;
	public String fr_dt;
	public String to_dt;
	public String subscrpt_cd;
	public String subscrpt_gb;
	public String buyer_nm;
	public String outyn;

	public SS_SLS_EXTN_5610_LDM(){}
	public SS_SLS_EXTN_5610_LDM(String dt_gb, String fr_dt, String to_dt, String subscrpt_cd, String subscrpt_gb, String buyer_nm, String outyn){
		this.dt_gb = dt_gb;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.subscrpt_cd = subscrpt_cd;
		this.subscrpt_gb = subscrpt_gb;
		this.buyer_nm = buyer_nm;
		this.outyn = outyn;
	}

	public void setDt_gb(String dt_gb){
		this.dt_gb = dt_gb;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setSubscrpt_gb(String subscrpt_gb){
		this.subscrpt_gb = subscrpt_gb;
	}

	public void setBuyer_nm(String buyer_nm){
		this.buyer_nm = buyer_nm;
	}

	public void setOutyn(String outyn){
		this.outyn = outyn;
	}

	public String getDt_gb(){
		return this.dt_gb;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getSubscrpt_cd(){
		return this.subscrpt_cd;
	}

	public String getSubscrpt_gb(){
		return this.subscrpt_gb;
	}

	public String getBuyer_nm(){
		return this.buyer_nm;
	}

	public String getOutyn(){
		return this.outyn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5610_LDM dm = (SS_SLS_EXTN_5610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dt_gb);
		cstmt.setString(4, dm.fr_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.subscrpt_cd);
		cstmt.setString(7, dm.subscrpt_gb);
		cstmt.setString(8, dm.buyer_nm);
		cstmt.setString(9, dm.outyn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dt_gb = [" + getDt_gb() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("subscrpt_cd = [" + getSubscrpt_cd() + "]");
		System.out.println("subscrpt_gb = [" + getSubscrpt_gb() + "]");
		System.out.println("buyer_nm = [" + getBuyer_nm() + "]");
		System.out.println("outyn = [" + getOutyn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String dt_gb = req.getParameter("dt_gb");
if( dt_gb == null){
	System.out.println(this.toString+" : dt_gb is null" );
}else{
	System.out.println(this.toString+" : dt_gb is "+dt_gb );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
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
String buyer_nm = req.getParameter("buyer_nm");
if( buyer_nm == null){
	System.out.println(this.toString+" : buyer_nm is null" );
}else{
	System.out.println(this.toString+" : buyer_nm is "+buyer_nm );
}
String outyn = req.getParameter("outyn");
if( outyn == null){
	System.out.println(this.toString+" : outyn is null" );
}else{
	System.out.println(this.toString+" : outyn is "+outyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String dt_gb = Util.checkString(req.getParameter("dt_gb"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String subscrpt_cd = Util.checkString(req.getParameter("subscrpt_cd"));
String subscrpt_gb = Util.checkString(req.getParameter("subscrpt_gb"));
String buyer_nm = Util.checkString(req.getParameter("buyer_nm"));
String outyn = Util.checkString(req.getParameter("outyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String dt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_gb")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
String subscrpt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_gb")));
String buyer_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_nm")));
String outyn = Util.Uni2Ksc(Util.checkString(req.getParameter("outyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDt_gb(dt_gb);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setSubscrpt_cd(subscrpt_cd);
dm.setSubscrpt_gb(subscrpt_gb);
dm.setBuyer_nm(buyer_nm);
dm.setOutyn(outyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 08 10:03:16 KST 2018 */