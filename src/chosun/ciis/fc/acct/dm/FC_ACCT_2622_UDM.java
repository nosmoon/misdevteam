/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-확정대상연결 연결저자
* 작성일자 : 2014.12.22
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2622_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_fisc_dt;
	public String to_fisc_dt;
	public String conn_cmpy_cd1;
	public String data_list1;
	public String conn_cmpy_cd2;
	public String data_list2;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_2622_UDM(){}
	public FC_ACCT_2622_UDM(String cmpy_cd, String fr_fisc_dt, String to_fisc_dt, String conn_cmpy_cd1, String data_list1, String conn_cmpy_cd2, String data_list2, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fr_fisc_dt = fr_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.conn_cmpy_cd1 = conn_cmpy_cd1;
		this.data_list1 = data_list1;
		this.conn_cmpy_cd2 = conn_cmpy_cd2;
		this.data_list2 = data_list2;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_fisc_dt(String fr_fisc_dt){
		this.fr_fisc_dt = fr_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setConn_cmpy_cd1(String conn_cmpy_cd1){
		this.conn_cmpy_cd1 = conn_cmpy_cd1;
	}

	public void setData_list1(String data_list1){
		this.data_list1 = data_list1;
	}

	public void setConn_cmpy_cd2(String conn_cmpy_cd2){
		this.conn_cmpy_cd2 = conn_cmpy_cd2;
	}

	public void setData_list2(String data_list2){
		this.data_list2 = data_list2;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_fisc_dt(){
		return this.fr_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getConn_cmpy_cd1(){
		return this.conn_cmpy_cd1;
	}

	public String getData_list1(){
		return this.data_list1;
	}

	public String getConn_cmpy_cd2(){
		return this.conn_cmpy_cd2;
	}

	public String getData_list2(){
		return this.data_list2;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2622_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2622_UDM dm = (FC_ACCT_2622_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_fisc_dt);
		cstmt.setString(5, dm.to_fisc_dt);
		cstmt.setString(6, dm.conn_cmpy_cd1);
		cstmt.setString(7, dm.data_list1);
		cstmt.setString(8, dm.conn_cmpy_cd2);
		cstmt.setString(9, dm.data_list2);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2622_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_fisc_dt = [" + getFr_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("conn_cmpy_cd1 = [" + getConn_cmpy_cd1() + "]");
		System.out.println("data_list1 = [" + getData_list1() + "]");
		System.out.println("conn_cmpy_cd2 = [" + getConn_cmpy_cd2() + "]");
		System.out.println("data_list2 = [" + getData_list2() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String fr_fisc_dt = req.getParameter("fr_fisc_dt");
if( fr_fisc_dt == null){
	System.out.println(this.toString+" : fr_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fr_fisc_dt is "+fr_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
}
String conn_cmpy_cd1 = req.getParameter("conn_cmpy_cd1");
if( conn_cmpy_cd1 == null){
	System.out.println(this.toString+" : conn_cmpy_cd1 is null" );
}else{
	System.out.println(this.toString+" : conn_cmpy_cd1 is "+conn_cmpy_cd1 );
}
String data_list1 = req.getParameter("data_list1");
if( data_list1 == null){
	System.out.println(this.toString+" : data_list1 is null" );
}else{
	System.out.println(this.toString+" : data_list1 is "+data_list1 );
}
String conn_cmpy_cd2 = req.getParameter("conn_cmpy_cd2");
if( conn_cmpy_cd2 == null){
	System.out.println(this.toString+" : conn_cmpy_cd2 is null" );
}else{
	System.out.println(this.toString+" : conn_cmpy_cd2 is "+conn_cmpy_cd2 );
}
String data_list2 = req.getParameter("data_list2");
if( data_list2 == null){
	System.out.println(this.toString+" : data_list2 is null" );
}else{
	System.out.println(this.toString+" : data_list2 is "+data_list2 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String conn_cmpy_cd1 = Util.checkString(req.getParameter("conn_cmpy_cd1"));
String data_list1 = Util.checkString(req.getParameter("data_list1"));
String conn_cmpy_cd2 = Util.checkString(req.getParameter("conn_cmpy_cd2"));
String data_list2 = Util.checkString(req.getParameter("data_list2"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String conn_cmpy_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_cmpy_cd1")));
String data_list1 = Util.Uni2Ksc(Util.checkString(req.getParameter("data_list1")));
String conn_cmpy_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_cmpy_cd2")));
String data_list2 = Util.Uni2Ksc(Util.checkString(req.getParameter("data_list2")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_fisc_dt(fr_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setConn_cmpy_cd1(conn_cmpy_cd1);
dm.setData_list1(data_list1);
dm.setConn_cmpy_cd2(conn_cmpy_cd2);
dm.setData_list2(data_list2);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 22 16:15:59 KST 2014 */