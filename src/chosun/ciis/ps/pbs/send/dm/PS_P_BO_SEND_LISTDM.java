/***************************************************************************************************
 * 파일명 :PS_P_BO_SEND_LIST.java
 * 기능 : 지국별발송독자 목록
 * 작성일자 : 2007-06-21
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
 * 발송-지국별발송독자 목록
 */

public class PS_P_BO_SEND_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String mediser_no;
	public String senddt;
	public String medicd;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String rdr_no;

	public PS_P_BO_SEND_LISTDM(){}
	public PS_P_BO_SEND_LISTDM(String cmpycd, String mediser_no, String senddt, String medicd, String deptcd, String areacd, String bocd, String rdr_no){
		this.cmpycd = cmpycd;
		this.mediser_no = mediser_no;
		this.senddt = senddt;
		this.medicd = medicd;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSQL(){
		 return "{ call SP_PS_P_BO_SEND_LIST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_P_BO_SEND_LISTDM dm = (PS_P_BO_SEND_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.mediser_no);
		cstmt.setString(5, dm.senddt);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.deptcd);
		cstmt.setString(8, dm.areacd);
		cstmt.setString(9, dm.bocd);
		cstmt.setString(10, dm.rdr_no);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_P_BO_SEND_LISTDataSet();
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
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String senddt = Util.checkString(req.getParameter("senddt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMediser_no(mediser_no);
dm.setSenddt(senddt);
dm.setMedicd(medicd);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 20:46:29 KST 2007 */