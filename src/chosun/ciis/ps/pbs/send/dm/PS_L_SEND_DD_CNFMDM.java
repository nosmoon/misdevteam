/***************************************************************************************************
* 파일명 : PS_L_SEND_DD_CNFM.java
* 기능 :  발송-일일발송 확인처리 
* 작성일자 : 2004-03-02
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
 * 발송-일일발송 확인처리
 *
 */

public class PS_L_SEND_DD_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String senddt;
	public String bocd;
	public String cmpycd;
	public String mediser_no;
	public String medicd;

	public PS_L_SEND_DD_CNFMDM(){}
	public PS_L_SEND_DD_CNFMDM(String senddt, String bocd, String cmpycd, String mediser_no, String medicd){
		this.senddt = senddt;
		this.bocd = bocd;
		this.cmpycd = cmpycd;
		this.mediser_no = mediser_no;
		this.medicd = medicd;
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

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_DD_CNFM( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_DD_CNFMDM dm = (PS_L_SEND_DD_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.senddt);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.cmpycd);
		cstmt.setString(6, dm.mediser_no);
		cstmt.setString(7, dm.medicd);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_DD_CNFMDataSet();
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String senddt = Util.checkString(req.getParameter("senddt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSenddt(senddt);
dm.setBocd(bocd);
dm.setCmpycd(cmpycd);
dm.setMediser_no(mediser_no);
dm.setMedicd(medicd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 07 21:28:36 KST 2005 */