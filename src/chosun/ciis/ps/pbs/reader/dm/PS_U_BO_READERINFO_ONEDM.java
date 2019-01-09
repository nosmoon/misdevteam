/***************************************************************************************************
* 파일명 : PS_U_BO_READERINFO_ONE.java
* 기능 :   독자 - 지국 출판 독자 수정
* 작성일자 : 2007-03-28
* 작성자 : 전현표 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자 - 지국 출판 수정
 *
 */

public class PS_U_BO_READERINFO_ONEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String acq_bocd;
	public String sendmthd;
	public String dstccd;
	public String dlvno;
	public String bo_rdr_no;

	public PS_U_BO_READERINFO_ONEDM(){}
	public PS_U_BO_READERINFO_ONEDM(String incmgpers, String rdr_no, String medicd, String termsubsno, String acq_bocd, String sendmthd, String dstccd, String dlvno, String bo_rdr_no){
		this.incmgpers = incmgpers;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.acq_bocd = acq_bocd;
		this.sendmthd = sendmthd;
		this.dstccd = dstccd;
		this.dlvno = dlvno;
		this.bo_rdr_no = bo_rdr_no;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setAcq_bocd(String acq_bocd){
		this.acq_bocd = acq_bocd;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setBo_rdr_no(String bo_rdr_no){
		this.bo_rdr_no = bo_rdr_no;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getAcq_bocd(){
		return this.acq_bocd;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getBo_rdr_no(){
		return this.bo_rdr_no;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_BO_READERINFO_ONE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_BO_READERINFO_ONEDM dm = (PS_U_BO_READERINFO_ONEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.termsubsno);
		cstmt.setString(7, dm.acq_bocd);
		cstmt.setString(8, dm.sendmthd);
		cstmt.setString(9, dm.dstccd);
		cstmt.setString(10, dm.dlvno);
		cstmt.setString(11, dm.bo_rdr_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_U_BO_READERINFO_ONEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
String acq_bocd = req.getParameter("acq_bocd");
if( acq_bocd == null){
	System.out.println(this.toString+" : acq_bocd is null" );
}else{
	System.out.println(this.toString+" : acq_bocd is "+acq_bocd );
}
String sendmthd = req.getParameter("sendmthd");
if( sendmthd == null){
	System.out.println(this.toString+" : sendmthd is null" );
}else{
	System.out.println(this.toString+" : sendmthd is "+sendmthd );
}
String dstccd = req.getParameter("dstccd");
if( dstccd == null){
	System.out.println(this.toString+" : dstccd is null" );
}else{
	System.out.println(this.toString+" : dstccd is "+dstccd );
}
String dlvno = req.getParameter("dlvno");
if( dlvno == null){
	System.out.println(this.toString+" : dlvno is null" );
}else{
	System.out.println(this.toString+" : dlvno is "+dlvno );
}
String bo_rdr_no = req.getParameter("bo_rdr_no");
if( bo_rdr_no == null){
	System.out.println(this.toString+" : bo_rdr_no is null" );
}else{
	System.out.println(this.toString+" : bo_rdr_no is "+bo_rdr_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String acq_bocd = Util.checkString(req.getParameter("acq_bocd"));
String sendmthd = Util.checkString(req.getParameter("sendmthd"));
String dstccd = Util.checkString(req.getParameter("dstccd"));
String dlvno = Util.checkString(req.getParameter("dlvno"));
String bo_rdr_no = Util.checkString(req.getParameter("bo_rdr_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String acq_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("acq_bocd")));
String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendmthd")));
String dstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstccd")));
String dlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvno")));
String bo_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_rdr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setAcq_bocd(acq_bocd);
dm.setSendmthd(sendmthd);
dm.setDstccd(dstccd);
dm.setDlvno(dlvno);
dm.setBo_rdr_no(bo_rdr_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 30 14:47:54 KST 2007 */