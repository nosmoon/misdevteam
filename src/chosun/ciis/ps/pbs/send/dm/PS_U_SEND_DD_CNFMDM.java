/***************************************************************************************************
* 파일명 : PS_U_SEND_DD_CNFM.java
* 기능 :  발송-일일발송 확인처리 
* 작성일자 : 2007-04-05
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
 * 발송-일일발송 확인처리
 *
 */

public class PS_U_SEND_DD_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd_cnfm;
	public String senddt_cnfm;
	public String medicd_cnfm;
	public String chkcnfm_cnfm;
	public String sendroutedd;
	public String incmgpers;

	public PS_U_SEND_DD_CNFMDM(){}
	public PS_U_SEND_DD_CNFMDM(String bocd_cnfm, String senddt_cnfm, String medicd_cnfm, String chkcnfm_cnfm, String sendroutedd, String incmgpers){
		this.bocd_cnfm = bocd_cnfm;
		this.senddt_cnfm = senddt_cnfm;
		this.medicd_cnfm = medicd_cnfm;
		this.chkcnfm_cnfm = chkcnfm_cnfm;
		this.sendroutedd = sendroutedd;
		this.incmgpers = incmgpers;
	}

	public void setBocd_cnfm(String bocd_cnfm){
		this.bocd_cnfm = bocd_cnfm;
	}

	public void setSenddt_cnfm(String senddt_cnfm){
		this.senddt_cnfm = senddt_cnfm;
	}

	public void setMedicd_cnfm(String medicd_cnfm){
		this.medicd_cnfm = medicd_cnfm;
	}

	public void setChkcnfm_cnfm(String chkcnfm_cnfm){
		this.chkcnfm_cnfm = chkcnfm_cnfm;
	}

	public void setSendroutedd(String sendroutedd){
		this.sendroutedd = sendroutedd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd_cnfm(){
		return this.bocd_cnfm;
	}

	public String getSenddt_cnfm(){
		return this.senddt_cnfm;
	}

	public String getMedicd_cnfm(){
		return this.medicd_cnfm;
	}

	public String getChkcnfm_cnfm(){
		return this.chkcnfm_cnfm;
	}

	public String getSendroutedd(){
		return this.sendroutedd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_SEND_DD_CNFM( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_SEND_DD_CNFMDM dm = (PS_U_SEND_DD_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd_cnfm);
		cstmt.setString(4, dm.senddt_cnfm);
		cstmt.setString(5, dm.medicd_cnfm);
		cstmt.setString(6, dm.chkcnfm_cnfm);
		cstmt.setString(7, dm.sendroutedd);
		cstmt.setString(8, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_U_SEND_DD_CNFMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd_cnfm = req.getParameter("bocd_cnfm");
if( bocd_cnfm == null){
	System.out.println(this.toString+" : bocd_cnfm is null" );
}else{
	System.out.println(this.toString+" : bocd_cnfm is "+bocd_cnfm );
}
String senddt_cnfm = req.getParameter("senddt_cnfm");
if( senddt_cnfm == null){
	System.out.println(this.toString+" : senddt_cnfm is null" );
}else{
	System.out.println(this.toString+" : senddt_cnfm is "+senddt_cnfm );
}
String medicd_cnfm = req.getParameter("medicd_cnfm");
if( medicd_cnfm == null){
	System.out.println(this.toString+" : medicd_cnfm is null" );
}else{
	System.out.println(this.toString+" : medicd_cnfm is "+medicd_cnfm );
}
String chkcnfm_cnfm = req.getParameter("chkcnfm_cnfm");
if( chkcnfm_cnfm == null){
	System.out.println(this.toString+" : chkcnfm_cnfm is null" );
}else{
	System.out.println(this.toString+" : chkcnfm_cnfm is "+chkcnfm_cnfm );
}
String sendroutedd = req.getParameter("sendroutedd");
if( sendroutedd == null){
	System.out.println(this.toString+" : sendroutedd is null" );
}else{
	System.out.println(this.toString+" : sendroutedd is "+sendroutedd );
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

String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
String senddt_cnfm = Util.checkString(req.getParameter("senddt_cnfm"));
String medicd_cnfm = Util.checkString(req.getParameter("medicd_cnfm"));
String chkcnfm_cnfm = Util.checkString(req.getParameter("chkcnfm_cnfm"));
String sendroutedd = Util.checkString(req.getParameter("sendroutedd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd_cnfm")));
String senddt_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt_cnfm")));
String medicd_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd_cnfm")));
String chkcnfm_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("chkcnfm_cnfm")));
String sendroutedd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendroutedd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd_cnfm(bocd_cnfm);
dm.setSenddt_cnfm(senddt_cnfm);
dm.setMedicd_cnfm(medicd_cnfm);
dm.setChkcnfm_cnfm(chkcnfm_cnfm);
dm.setSendroutedd(sendroutedd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 05 19:16:27 KST 2007 */