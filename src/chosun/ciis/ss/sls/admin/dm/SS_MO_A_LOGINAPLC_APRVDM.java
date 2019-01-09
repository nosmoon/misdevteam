/***************************************************************************************************
* 파일명 : SS_MO_A_LOGINAPLC_APRVDM.java
* 기능 : 관리자-모바일관리-로그인승인,거절,비번초기화 DM
* 작성일자 : 2017-02-15
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *
 */


public class SS_MO_A_LOGINAPLC_APRVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String boemp_no;
	public String boemp_id;
	public String ddremk;
	public String workflag;
	public String incmgpers;

	public SS_MO_A_LOGINAPLC_APRVDM(){}
	public SS_MO_A_LOGINAPLC_APRVDM(String bocd, String boemp_no, String boemp_id, String ddremk, String workflag, String incmgpers){
		this.bocd = bocd;
		this.boemp_no = boemp_no;
		this.boemp_id = boemp_id;
		this.ddremk = ddremk;
		this.workflag = workflag;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setDdremk(String ddremk){
		this.ddremk = ddremk;
	}

	public void setWorkflag(String workflag){
		this.workflag = workflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getDdremk(){
		return this.ddremk;
	}

	public String getWorkflag(){
		return this.workflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_MO_A_LOGINAPLC_APRV(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_A_LOGINAPLC_APRVDM dm = (SS_MO_A_LOGINAPLC_APRVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.boemp_no);
		cstmt.setString(5, dm.boemp_id);
		cstmt.setString(6, dm.ddremk);
		cstmt.setString(7, dm.workflag);
		cstmt.setString(8, dm.incmgpers);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_MO_A_LOGINAPLC_APRVDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("boemp_no = [" + getBoemp_no() + "]");
		System.out.println("boemp_id = [" + getBoemp_id() + "]");
		System.out.println("ddremk = [" + getDdremk() + "]");
		System.out.println("workflag = [" + getWorkflag() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String boemp_id = req.getParameter("boemp_id");
if( boemp_id == null){
	System.out.println(this.toString+" : boemp_id is null" );
}else{
	System.out.println(this.toString+" : boemp_id is "+boemp_id );
}
String ddremk = req.getParameter("ddremk");
if( ddremk == null){
	System.out.println(this.toString+" : ddremk is null" );
}else{
	System.out.println(this.toString+" : ddremk is "+ddremk );
}
String workflag = req.getParameter("workflag");
if( workflag == null){
	System.out.println(this.toString+" : workflag is null" );
}else{
	System.out.println(this.toString+" : workflag is "+workflag );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String boemp_id = Util.checkString(req.getParameter("boemp_id"));
String ddremk = Util.checkString(req.getParameter("ddremk"));
String workflag = Util.checkString(req.getParameter("workflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String boemp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_id")));
String ddremk = Util.Uni2Ksc(Util.checkString(req.getParameter("ddremk")));
String workflag = Util.Uni2Ksc(Util.checkString(req.getParameter("workflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setBoemp_no(boemp_no);
dm.setBoemp_id(boemp_id);
dm.setDdremk(ddremk);
dm.setWorkflag(workflag);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 15 16:13:46 KST 2017 */