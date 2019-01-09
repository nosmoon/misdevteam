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


public class SS_L_KYOBO_EVENTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fr_dt;
	public String to_dt;
	public String bocd;
	public String rdrnm;
	public String subscnfmstat;

	public SS_L_KYOBO_EVENTDM(){}
	public SS_L_KYOBO_EVENTDM(String fr_dt, String to_dt, String bocd, String rdrnm, String subscnfmstat){
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.bocd = bocd;
		this.rdrnm = rdrnm;
		this.subscnfmstat = subscnfmstat;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setSubscnfmstat(String subscnfmstat){
		this.subscnfmstat = subscnfmstat;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getSubscnfmstat(){
		return this.subscnfmstat;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_KYOBO_EVENT(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_KYOBO_EVENTDM dm = (SS_L_KYOBO_EVENTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fr_dt);
		cstmt.setString(4, dm.to_dt);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.rdrnm);
		cstmt.setString(7, dm.subscnfmstat);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_KYOBO_EVENTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("subscnfmstat = [" + getSubscnfmstat() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String subscnfmstat = req.getParameter("subscnfmstat");
if( subscnfmstat == null){
	System.out.println(this.toString+" : subscnfmstat is null" );
}else{
	System.out.println(this.toString+" : subscnfmstat is "+subscnfmstat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String subscnfmstat = Util.checkString(req.getParameter("subscnfmstat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String subscnfmstat = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setBocd(bocd);
dm.setRdrnm(rdrnm);
dm.setSubscnfmstat(subscnfmstat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 13 06:49:49 GMT 2014 */