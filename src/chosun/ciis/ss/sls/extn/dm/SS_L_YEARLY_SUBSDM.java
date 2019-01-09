/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
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


public class SS_L_YEARLY_SUBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cpnno;
	public String date_sel;
	public String fr_dt;
	public String to_dt;
	public String shftcd;
	public String shftyn;
	public String useyn;
	public String sendyn;
	public String bo_headyn;

	public SS_L_YEARLY_SUBSDM(){}
	public SS_L_YEARLY_SUBSDM(String cpnno, String date_sel, String fr_dt, String to_dt, String shftcd, String shftyn, String useyn, String sendyn, String bo_headyn){
		this.cpnno = cpnno;
		this.date_sel = date_sel;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.shftcd = shftcd;
		this.shftyn = shftyn;
		this.useyn = useyn;
		this.sendyn = sendyn;
		this.bo_headyn = bo_headyn;
	}

	public void setCpnno(String cpnno){
		this.cpnno = cpnno;
	}

	public void setDate_sel(String date_sel){
		this.date_sel = date_sel;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setShftcd(String shftcd){
		this.shftcd = shftcd;
	}

	public void setShftyn(String shftyn){
		this.shftyn = shftyn;
	}

	public void setUseyn(String useyn){
		this.useyn = useyn;
	}

	public void setSendyn(String sendyn){
		this.sendyn = sendyn;
	}

	public void setBo_headyn(String bo_headyn){
		this.bo_headyn = bo_headyn;
	}

	public String getCpnno(){
		return this.cpnno;
	}

	public String getDate_sel(){
		return this.date_sel;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getShftcd(){
		return this.shftcd;
	}

	public String getShftyn(){
		return this.shftyn;
	}

	public String getUseyn(){
		return this.useyn;
	}

	public String getSendyn(){
		return this.sendyn;
	}

	public String getBo_headyn(){
		return this.bo_headyn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_YEARLY_SUBS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_YEARLY_SUBSDM dm = (SS_L_YEARLY_SUBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cpnno);
		cstmt.setString(4, dm.date_sel);
		cstmt.setString(5, dm.fr_dt);
		cstmt.setString(6, dm.to_dt);
		cstmt.setString(7, dm.shftcd);
		cstmt.setString(8, dm.shftyn);
		cstmt.setString(9, dm.useyn);
		cstmt.setString(10, dm.sendyn);
		cstmt.setString(11, dm.bo_headyn);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_YEARLY_SUBSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cpnno = [" + getCpnno() + "]");
		System.out.println("date_sel = [" + getDate_sel() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("shftcd = [" + getShftcd() + "]");
		System.out.println("shftyn = [" + getShftyn() + "]");
		System.out.println("useyn = [" + getUseyn() + "]");
		System.out.println("sendyn = [" + getSendyn() + "]");
		System.out.println("bo_headyn = [" + getBo_headyn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cpnno = req.getParameter("cpnno");
if( cpnno == null){
	System.out.println(this.toString+" : cpnno is null" );
}else{
	System.out.println(this.toString+" : cpnno is "+cpnno );
}
String date_sel = req.getParameter("date_sel");
if( date_sel == null){
	System.out.println(this.toString+" : date_sel is null" );
}else{
	System.out.println(this.toString+" : date_sel is "+date_sel );
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
String cpntypecd = req.getParameter("cpntypecd");
if( cpntypecd == null){
	System.out.println(this.toString+" : cpntypecd is null" );
}else{
	System.out.println(this.toString+" : cpntypecd is "+cpntypecd );
}
String shftyn = req.getParameter("shftyn");
if( shftyn == null){
	System.out.println(this.toString+" : shftyn is null" );
}else{
	System.out.println(this.toString+" : shftyn is "+shftyn );
}
String useyn = req.getParameter("useyn");
if( useyn == null){
	System.out.println(this.toString+" : useyn is null" );
}else{
	System.out.println(this.toString+" : useyn is "+useyn );
}
String sendyn = req.getParameter("sendyn");
if( sendyn == null){
	System.out.println(this.toString+" : sendyn is null" );
}else{
	System.out.println(this.toString+" : sendyn is "+sendyn );
}
String bo_headyn = req.getParameter("bo_headyn");
if( bo_headyn == null){
	System.out.println(this.toString+" : bo_headyn is null" );
}else{
	System.out.println(this.toString+" : bo_headyn is "+bo_headyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cpnno = Util.checkString(req.getParameter("cpnno"));
String date_sel = Util.checkString(req.getParameter("date_sel"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String cpntypecd = Util.checkString(req.getParameter("cpntypecd"));
String shftyn = Util.checkString(req.getParameter("shftyn"));
String useyn = Util.checkString(req.getParameter("useyn"));
String sendyn = Util.checkString(req.getParameter("sendyn"));
String bo_headyn = Util.checkString(req.getParameter("bo_headyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cpnno = Util.Uni2Ksc(Util.checkString(req.getParameter("cpnno")));
String date_sel = Util.Uni2Ksc(Util.checkString(req.getParameter("date_sel")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String cpntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("cpntypecd")));
String shftyn = Util.Uni2Ksc(Util.checkString(req.getParameter("shftyn")));
String useyn = Util.Uni2Ksc(Util.checkString(req.getParameter("useyn")));
String sendyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sendyn")));
String bo_headyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCpnno(cpnno);
dm.setDate_sel(date_sel);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setCpntypecd(cpntypecd);
dm.setShftyn(shftyn);
dm.setUseyn(useyn);
dm.setSendyn(sendyn);
dm.setBo_headyn(bo_headyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 29 02:11:26 GMT 2013 */