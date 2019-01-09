/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-추가발송 발송처리
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
 * 발송-추가발송 발송처리
 *
 */

public class PS_L_SEND_ADDM_MTHD_DTLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String senddt;

	public PS_L_SEND_ADDM_MTHD_DTLSDM(){}
	public PS_L_SEND_ADDM_MTHD_DTLSDM(String bocd, String medicd, String senddt){
		this.bocd = bocd;
		this.medicd = medicd;
		this.senddt = senddt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_ADDM_MTHD_DTLS( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_ADDM_MTHD_DTLSDM dm = (PS_L_SEND_ADDM_MTHD_DTLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.senddt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_ADDM_MTHD_DTLSDataSet();
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String senddt = Util.checkString(req.getParameter("senddt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setSenddt(senddt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 10:31:36 KST 2004 */