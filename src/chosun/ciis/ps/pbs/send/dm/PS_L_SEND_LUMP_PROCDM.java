/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-일괄발송 발송처리
* 작성일자 : 2004-03-08
* 작성자 : 장수환
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
 * 발송-일괄발송 발송처리
 *
 */

public class PS_L_SEND_LUMP_PROCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String senddt;
	public String bocd;
	public String cmpycd;
	public String mediser_no;
	public String medicd;
	public String sendkindcd;
	public String sendmthdcd;

	public PS_L_SEND_LUMP_PROCDM(){}
	public PS_L_SEND_LUMP_PROCDM(String senddt, String bocd, String cmpycd, String mediser_no, String medicd, String sendkindcd, String sendmthdcd){
		this.senddt = senddt;
		this.bocd = bocd;
		this.cmpycd = cmpycd;
		this.mediser_no = mediser_no;
		this.medicd = medicd;
		this.sendkindcd = sendkindcd;
		this.sendmthdcd = sendmthdcd;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSendkindcd(String sendkindcd){
		this.sendkindcd = sendkindcd;
	}

	public void setSendmthdcd(String sendmthdcd){
		this.sendmthdcd = sendmthdcd;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSendkindcd(){
		return this.sendkindcd;
	}

	public String getSendmthdcd(){
		return this.sendmthdcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_LUMP_PROC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_LUMP_PROCDM dm = (PS_L_SEND_LUMP_PROCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.senddt);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.cmpycd);
		cstmt.setString(6, dm.mediser_no);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.sendkindcd);
		cstmt.setString(9, dm.sendmthdcd);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_LUMP_PROCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String sendkindcd = req.getParameter("sendkindcd");
if( sendkindcd == null){
	System.out.println(this.toString+" : sendkindcd is null" );
}else{
	System.out.println(this.toString+" : sendkindcd is "+sendkindcd );
}
String sendmthdcd = req.getParameter("sendmthdcd");
if( sendmthdcd == null){
	System.out.println(this.toString+" : sendmthdcd is null" );
}else{
	System.out.println(this.toString+" : sendmthdcd is "+sendmthdcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String senddt = Util.checkString(req.getParameter("senddt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String sendkindcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendkindcd")));
String sendmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendmthdcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSenddt(senddt);
dm.setBocd(bocd);
dm.setCmpycd(cmpycd);
dm.setMediser_no(mediser_no);
dm.setMedicd(medicd);
dm.setSendkindcd(sendkindcd);
dm.setSendmthdcd(sendmthdcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 15:27:08 KST 2004 */