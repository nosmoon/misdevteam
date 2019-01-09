/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무 확정대상연결 (목록조회)
* 작성일자 : 2015.01.05
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


public class FC_ACCT_2641_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_dt;
	public String to_dt;
	public String grp_cd;
	public String conn_cmpy_cd1;
	public String fr_budg_cd1;
	public String to_budg_cd1;
	public String slip_clsf_cd1;
	public String budg_clsf_cd1;
	public String conn_clsf_cd1;
	public String conn_cmpy_cd2;
	public String fr_budg_cd2;
	public String to_budg_cd2;
	public String slip_clsf_cd2;
	public String budg_clsf_cd2;
	public String conn_clsf_cd2;

	public FC_ACCT_2641_LDM(){}
	public FC_ACCT_2641_LDM(String cmpy_cd, String fr_dt, String to_dt, String grp_cd, String conn_cmpy_cd1, String fr_budg_cd1, String to_budg_cd1, String slip_clsf_cd1, String budg_clsf_cd1, String conn_clsf_cd1, String conn_cmpy_cd2, String fr_budg_cd2, String to_budg_cd2, String slip_clsf_cd2, String budg_clsf_cd2, String conn_clsf_cd2){
		this.cmpy_cd = cmpy_cd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.grp_cd = grp_cd;
		this.conn_cmpy_cd1 = conn_cmpy_cd1;
		this.fr_budg_cd1 = fr_budg_cd1;
		this.to_budg_cd1 = to_budg_cd1;
		this.slip_clsf_cd1 = slip_clsf_cd1;
		this.budg_clsf_cd1 = budg_clsf_cd1;
		this.conn_clsf_cd1 = conn_clsf_cd1;
		this.conn_cmpy_cd2 = conn_cmpy_cd2;
		this.fr_budg_cd2 = fr_budg_cd2;
		this.to_budg_cd2 = to_budg_cd2;
		this.slip_clsf_cd2 = slip_clsf_cd2;
		this.budg_clsf_cd2 = budg_clsf_cd2;
		this.conn_clsf_cd2 = conn_clsf_cd2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setGrp_cd(String grp_cd){
		this.grp_cd = grp_cd;
	}

	public void setConn_cmpy_cd1(String conn_cmpy_cd1){
		this.conn_cmpy_cd1 = conn_cmpy_cd1;
	}

	public void setFr_budg_cd1(String fr_budg_cd1){
		this.fr_budg_cd1 = fr_budg_cd1;
	}

	public void setTo_budg_cd1(String to_budg_cd1){
		this.to_budg_cd1 = to_budg_cd1;
	}

	public void setSlip_clsf_cd1(String slip_clsf_cd1){
		this.slip_clsf_cd1 = slip_clsf_cd1;
	}

	public void setBudg_clsf_cd1(String budg_clsf_cd1){
		this.budg_clsf_cd1 = budg_clsf_cd1;
	}

	public void setConn_clsf_cd1(String conn_clsf_cd1){
		this.conn_clsf_cd1 = conn_clsf_cd1;
	}

	public void setConn_cmpy_cd2(String conn_cmpy_cd2){
		this.conn_cmpy_cd2 = conn_cmpy_cd2;
	}

	public void setFr_budg_cd2(String fr_budg_cd2){
		this.fr_budg_cd2 = fr_budg_cd2;
	}

	public void setTo_budg_cd2(String to_budg_cd2){
		this.to_budg_cd2 = to_budg_cd2;
	}

	public void setSlip_clsf_cd2(String slip_clsf_cd2){
		this.slip_clsf_cd2 = slip_clsf_cd2;
	}

	public void setBudg_clsf_cd2(String budg_clsf_cd2){
		this.budg_clsf_cd2 = budg_clsf_cd2;
	}

	public void setConn_clsf_cd2(String conn_clsf_cd2){
		this.conn_clsf_cd2 = conn_clsf_cd2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getGrp_cd(){
		return this.grp_cd;
	}

	public String getConn_cmpy_cd1(){
		return this.conn_cmpy_cd1;
	}

	public String getFr_budg_cd1(){
		return this.fr_budg_cd1;
	}

	public String getTo_budg_cd1(){
		return this.to_budg_cd1;
	}

	public String getSlip_clsf_cd1(){
		return this.slip_clsf_cd1;
	}

	public String getBudg_clsf_cd1(){
		return this.budg_clsf_cd1;
	}

	public String getConn_clsf_cd1(){
		return this.conn_clsf_cd1;
	}

	public String getConn_cmpy_cd2(){
		return this.conn_cmpy_cd2;
	}

	public String getFr_budg_cd2(){
		return this.fr_budg_cd2;
	}

	public String getTo_budg_cd2(){
		return this.to_budg_cd2;
	}

	public String getSlip_clsf_cd2(){
		return this.slip_clsf_cd2;
	}

	public String getBudg_clsf_cd2(){
		return this.budg_clsf_cd2;
	}

	public String getConn_clsf_cd2(){
		return this.conn_clsf_cd2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2641_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2641_LDM dm = (FC_ACCT_2641_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.grp_cd);
		cstmt.setString(7, dm.conn_cmpy_cd1);
		cstmt.setString(8, dm.fr_budg_cd1);
		cstmt.setString(9, dm.to_budg_cd1);
		cstmt.setString(10, dm.slip_clsf_cd1);
		cstmt.setString(11, dm.budg_clsf_cd1);
		cstmt.setString(12, dm.conn_clsf_cd1);
		cstmt.setString(13, dm.conn_cmpy_cd2);
		cstmt.setString(14, dm.fr_budg_cd2);
		cstmt.setString(15, dm.to_budg_cd2);
		cstmt.setString(16, dm.slip_clsf_cd2);
		cstmt.setString(17, dm.budg_clsf_cd2);
		cstmt.setString(18, dm.conn_clsf_cd2);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2641_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("grp_cd = [" + getGrp_cd() + "]");
		System.out.println("conn_cmpy_cd1 = [" + getConn_cmpy_cd1() + "]");
		System.out.println("fr_budg_cd1 = [" + getFr_budg_cd1() + "]");
		System.out.println("to_budg_cd1 = [" + getTo_budg_cd1() + "]");
		System.out.println("slip_clsf_cd1 = [" + getSlip_clsf_cd1() + "]");
		System.out.println("budg_clsf_cd1 = [" + getBudg_clsf_cd1() + "]");
		System.out.println("conn_clsf_cd1 = [" + getConn_clsf_cd1() + "]");
		System.out.println("conn_cmpy_cd2 = [" + getConn_cmpy_cd2() + "]");
		System.out.println("fr_budg_cd2 = [" + getFr_budg_cd2() + "]");
		System.out.println("to_budg_cd2 = [" + getTo_budg_cd2() + "]");
		System.out.println("slip_clsf_cd2 = [" + getSlip_clsf_cd2() + "]");
		System.out.println("budg_clsf_cd2 = [" + getBudg_clsf_cd2() + "]");
		System.out.println("conn_clsf_cd2 = [" + getConn_clsf_cd2() + "]");
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
String grp_cd = req.getParameter("grp_cd");
if( grp_cd == null){
	System.out.println(this.toString+" : grp_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cd is "+grp_cd );
}
String conn_cmpy_cd1 = req.getParameter("conn_cmpy_cd1");
if( conn_cmpy_cd1 == null){
	System.out.println(this.toString+" : conn_cmpy_cd1 is null" );
}else{
	System.out.println(this.toString+" : conn_cmpy_cd1 is "+conn_cmpy_cd1 );
}
String fr_budg_cd1 = req.getParameter("fr_budg_cd1");
if( fr_budg_cd1 == null){
	System.out.println(this.toString+" : fr_budg_cd1 is null" );
}else{
	System.out.println(this.toString+" : fr_budg_cd1 is "+fr_budg_cd1 );
}
String to_budg_cd1 = req.getParameter("to_budg_cd1");
if( to_budg_cd1 == null){
	System.out.println(this.toString+" : to_budg_cd1 is null" );
}else{
	System.out.println(this.toString+" : to_budg_cd1 is "+to_budg_cd1 );
}
String slip_clsf_cd1 = req.getParameter("slip_clsf_cd1");
if( slip_clsf_cd1 == null){
	System.out.println(this.toString+" : slip_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd1 is "+slip_clsf_cd1 );
}
String budg_clsf_cd1 = req.getParameter("budg_clsf_cd1");
if( budg_clsf_cd1 == null){
	System.out.println(this.toString+" : budg_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : budg_clsf_cd1 is "+budg_clsf_cd1 );
}
String conn_clsf_cd1 = req.getParameter("conn_clsf_cd1");
if( conn_clsf_cd1 == null){
	System.out.println(this.toString+" : conn_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : conn_clsf_cd1 is "+conn_clsf_cd1 );
}
String conn_cmpy_cd2 = req.getParameter("conn_cmpy_cd2");
if( conn_cmpy_cd2 == null){
	System.out.println(this.toString+" : conn_cmpy_cd2 is null" );
}else{
	System.out.println(this.toString+" : conn_cmpy_cd2 is "+conn_cmpy_cd2 );
}
String fr_budg_cd2 = req.getParameter("fr_budg_cd2");
if( fr_budg_cd2 == null){
	System.out.println(this.toString+" : fr_budg_cd2 is null" );
}else{
	System.out.println(this.toString+" : fr_budg_cd2 is "+fr_budg_cd2 );
}
String to_budg_cd2 = req.getParameter("to_budg_cd2");
if( to_budg_cd2 == null){
	System.out.println(this.toString+" : to_budg_cd2 is null" );
}else{
	System.out.println(this.toString+" : to_budg_cd2 is "+to_budg_cd2 );
}
String slip_clsf_cd2 = req.getParameter("slip_clsf_cd2");
if( slip_clsf_cd2 == null){
	System.out.println(this.toString+" : slip_clsf_cd2 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd2 is "+slip_clsf_cd2 );
}
String budg_clsf_cd2 = req.getParameter("budg_clsf_cd2");
if( budg_clsf_cd2 == null){
	System.out.println(this.toString+" : budg_clsf_cd2 is null" );
}else{
	System.out.println(this.toString+" : budg_clsf_cd2 is "+budg_clsf_cd2 );
}
String conn_clsf_cd2 = req.getParameter("conn_clsf_cd2");
if( conn_clsf_cd2 == null){
	System.out.println(this.toString+" : conn_clsf_cd2 is null" );
}else{
	System.out.println(this.toString+" : conn_clsf_cd2 is "+conn_clsf_cd2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String grp_cd = Util.checkString(req.getParameter("grp_cd"));
String conn_cmpy_cd1 = Util.checkString(req.getParameter("conn_cmpy_cd1"));
String fr_budg_cd1 = Util.checkString(req.getParameter("fr_budg_cd1"));
String to_budg_cd1 = Util.checkString(req.getParameter("to_budg_cd1"));
String slip_clsf_cd1 = Util.checkString(req.getParameter("slip_clsf_cd1"));
String budg_clsf_cd1 = Util.checkString(req.getParameter("budg_clsf_cd1"));
String conn_clsf_cd1 = Util.checkString(req.getParameter("conn_clsf_cd1"));
String conn_cmpy_cd2 = Util.checkString(req.getParameter("conn_cmpy_cd2"));
String fr_budg_cd2 = Util.checkString(req.getParameter("fr_budg_cd2"));
String to_budg_cd2 = Util.checkString(req.getParameter("to_budg_cd2"));
String slip_clsf_cd2 = Util.checkString(req.getParameter("slip_clsf_cd2"));
String budg_clsf_cd2 = Util.checkString(req.getParameter("budg_clsf_cd2"));
String conn_clsf_cd2 = Util.checkString(req.getParameter("conn_clsf_cd2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String grp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cd")));
String conn_cmpy_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_cmpy_cd1")));
String fr_budg_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_budg_cd1")));
String to_budg_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("to_budg_cd1")));
String slip_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd1")));
String budg_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clsf_cd1")));
String conn_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_clsf_cd1")));
String conn_cmpy_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_cmpy_cd2")));
String fr_budg_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_budg_cd2")));
String to_budg_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("to_budg_cd2")));
String slip_clsf_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd2")));
String budg_clsf_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clsf_cd2")));
String conn_clsf_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_clsf_cd2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setGrp_cd(grp_cd);
dm.setConn_cmpy_cd1(conn_cmpy_cd1);
dm.setFr_budg_cd1(fr_budg_cd1);
dm.setTo_budg_cd1(to_budg_cd1);
dm.setSlip_clsf_cd1(slip_clsf_cd1);
dm.setBudg_clsf_cd1(budg_clsf_cd1);
dm.setConn_clsf_cd1(conn_clsf_cd1);
dm.setConn_cmpy_cd2(conn_cmpy_cd2);
dm.setFr_budg_cd2(fr_budg_cd2);
dm.setTo_budg_cd2(to_budg_cd2);
dm.setSlip_clsf_cd2(slip_clsf_cd2);
dm.setBudg_clsf_cd2(budg_clsf_cd2);
dm.setConn_clsf_cd2(conn_clsf_cd2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 05 17:39:06 KST 2015 */