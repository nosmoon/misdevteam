/***************************************************************************************************
* 파일명 : PS_P_SEND_BNSBK_STICKER.java
* 기능 : 출판 보너스북 발송 출력(Excel)
* 작성일자 : 2005-12-08
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 출판국- 출판 보너스북 발송 출력(Excel)
 *
 */

public class PS_P_SEND_BNSBK_STICKERDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String senddt;
	public String asinbocd;
	public String sendmthd;

	public PS_P_SEND_BNSBK_STICKERDM(){}
	public PS_P_SEND_BNSBK_STICKERDM(String cmpycd, String incmgpers, String senddt, String asinbocd, String sendmthd){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.senddt = senddt;
		this.asinbocd = asinbocd;
		this.sendmthd = sendmthd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setAsinbocd(String asinbocd){
		this.asinbocd = asinbocd;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getAsinbocd(){
		return this.asinbocd;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getSQL(){
		 return "{ call SP_PS_P_SEND_BNSBK_STICKER( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_P_SEND_BNSBK_STICKERDM dm = (PS_P_SEND_BNSBK_STICKERDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.senddt);
		cstmt.setString(6, dm.asinbocd);
		cstmt.setString(7, dm.sendmthd);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_P_SEND_BNSBK_STICKERDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String asinbocd = req.getParameter("asinbocd");
if( asinbocd == null){
	System.out.println(this.toString+" : asinbocd is null" );
}else{
	System.out.println(this.toString+" : asinbocd is "+asinbocd );
}
String sendmthd = req.getParameter("sendmthd");
if( sendmthd == null){
	System.out.println(this.toString+" : sendmthd is null" );
}else{
	System.out.println(this.toString+" : sendmthd is "+sendmthd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String senddt = Util.checkString(req.getParameter("senddt"));
String asinbocd = Util.checkString(req.getParameter("asinbocd"));
String sendmthd = Util.checkString(req.getParameter("sendmthd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));
String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendmthd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setSenddt(senddt);
dm.setAsinbocd(asinbocd);
dm.setSendmthd(sendmthd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 09 10:59:05 KST 2005 */