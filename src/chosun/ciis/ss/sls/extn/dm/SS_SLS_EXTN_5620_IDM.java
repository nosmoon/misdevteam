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


public class SS_SLS_EXTN_5620_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String subscrpt_cd;
	public String in_dt;
	public String pub_dt;
	public String gb;

	public SS_SLS_EXTN_5620_IDM(){}
	public SS_SLS_EXTN_5620_IDM(String incmgpers, String subscrpt_cd, String in_dt, String pub_dt, String gb){
		this.incmgpers = incmgpers;
		this.subscrpt_cd = subscrpt_cd;
		this.in_dt = in_dt;
		this.pub_dt = pub_dt;
		this.gb = gb;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setIn_dt(String in_dt){
		this.in_dt = in_dt;
	}

	public void setPub_dt(String pub_dt){
		this.pub_dt = pub_dt;
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

	public String getIn_dt(){
		return this.in_dt;
	}

	public String getPub_dt(){
		return this.pub_dt;
	}

	public String getGb(){
		return this.gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5620_I(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5620_IDM dm = (SS_SLS_EXTN_5620_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.subscrpt_cd);
		cstmt.setString(5, dm.in_dt);
		cstmt.setString(6, dm.pub_dt);
		cstmt.setString(7, dm.gb);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5620_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("subscrpt_cd = [" + getSubscrpt_cd() + "]");
		System.out.println("in_dt = [" + getIn_dt() + "]");
		System.out.println("pub_dt = [" + getPub_dt() + "]");
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
String in_dt = req.getParameter("in_dt");
if( in_dt == null){
	System.out.println(this.toString+" : in_dt is null" );
}else{
	System.out.println(this.toString+" : in_dt is "+in_dt );
}
String pub_dt = req.getParameter("pub_dt");
if( pub_dt == null){
	System.out.println(this.toString+" : pub_dt is null" );
}else{
	System.out.println(this.toString+" : pub_dt is "+pub_dt );
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
String in_dt = Util.checkString(req.getParameter("in_dt"));
String pub_dt = Util.checkString(req.getParameter("pub_dt"));
String gb = Util.checkString(req.getParameter("gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
String in_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_dt")));
String pub_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pub_dt")));
String gb = Util.Uni2Ksc(Util.checkString(req.getParameter("gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setSubscrpt_cd(subscrpt_cd);
dm.setIn_dt(in_dt);
dm.setPub_dt(pub_dt);
dm.setGb(gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 08 17:42:21 KST 2018 */