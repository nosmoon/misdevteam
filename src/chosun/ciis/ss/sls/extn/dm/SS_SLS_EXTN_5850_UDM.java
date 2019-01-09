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


public class SS_SLS_EXTN_5850_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String medicd;
	public String campid;
	public String subscnfmstatcd;
	public String incmgpers;

	public SS_SLS_EXTN_5850_UDM(){}
	public SS_SLS_EXTN_5850_UDM(String rdr_extndt, String rdr_extnno, String medicd, String campid, String subscnfmstatcd, String incmgpers){
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.medicd = medicd;
		this.campid = campid;
		this.subscnfmstatcd = subscnfmstatcd;
		this.incmgpers = incmgpers;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5850_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5850_UDM dm = (SS_SLS_EXTN_5850_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extndt);
		cstmt.setString(4, dm.rdr_extnno);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.campid);
		cstmt.setString(7, dm.subscnfmstatcd);
		cstmt.setString(8, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5850_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("rdr_extndt = [" + getRdr_extndt() + "]");
		System.out.println("rdr_extnno = [" + getRdr_extnno() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("campid = [" + getCampid() + "]");
		System.out.println("subscnfmstatcd = [" + getSubscnfmstatcd() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String medicd = Util.checkString(req.getParameter("medicd"));
String campid = Util.checkString(req.getParameter("campid"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setMedicd(medicd);
dm.setCampid(campid);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 07 15:52:07 KST 2018 */