/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-일일발송 발송처리
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
 * 발송-일일발송 발송처리
 *
 */

public class PS_L_SEND_DD_PROC_DTLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String senddt;
	public String bocd;
	public String mediser_no;
	public String medicd;
	public String sendkindcd;
	public String sendmthdcd;
	public long pageno;
	public long pagesize;

	public PS_L_SEND_DD_PROC_DTLSDM(){}
	public PS_L_SEND_DD_PROC_DTLSDM(String senddt, String bocd, String mediser_no, String medicd, String sendkindcd, String sendmthdcd, long pageno, long pagesize){
		this.senddt = senddt;
		this.bocd = bocd;
		this.mediser_no = mediser_no;
		this.medicd = medicd;
		this.sendkindcd = sendkindcd;
		this.sendmthdcd = sendmthdcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getBocd(){
		return this.bocd;
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

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_DD_PROC_DTLS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_DD_PROC_DTLSDM dm = (PS_L_SEND_DD_PROC_DTLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.senddt);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.mediser_no);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.sendkindcd);
		cstmt.setString(8, dm.sendmthdcd);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_DD_PROC_DTLSDataSet();
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
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String senddt = Util.checkString(req.getParameter("senddt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String sendkindcd = Util.checkString(req.getParameter("sendkindcd"));
String sendmthdcd = Util.checkString(req.getParameter("sendmthdcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String sendkindcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendkindcd")));
String sendmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendmthdcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSenddt(senddt);
dm.setBocd(bocd);
dm.setMediser_no(mediser_no);
dm.setMedicd(medicd);
dm.setSendkindcd(sendkindcd);
dm.setSendmthdcd(sendmthdcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 23 13:52:36 KST 2004 */