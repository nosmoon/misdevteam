/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자정보관리(중지내역팝업)(중지취소)
* 작성일자 : 2004-04-01
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(중지내역팝업)(중지취소)
 *
 */

public class SL_A_SUBS_CNTR_STOP_CANCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String resv1;
	public String resv2;
	public String resv3;

	public SL_A_SUBS_CNTR_STOP_CANCDM(){}
	public SL_A_SUBS_CNTR_STOP_CANCDM(String bocd, String incmgpers, String rdr_no, String medicd, String cntrno, String mangno, String resv1, String resv2, String resv3){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.cntrno = cntrno;
		this.mangno = mangno;
		this.resv1 = resv1;
		this.resv2 = resv2;
		this.resv3 = resv3;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setResv1(String resv1){
		this.resv1 = resv1;
	}

	public void setResv2(String resv2){
		this.resv2 = resv2;
	}

	public void setResv3(String resv3){
		this.resv3 = resv3;
	}

	public String getBocd(){
		return this.bocd;
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

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getResv1(){
		return this.resv1;
	}

	public String getResv2(){
		return this.resv2;
	}

	public String getResv3(){
		return this.resv3;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_SUBS_CNTR_STOP_CANC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_SUBS_CNTR_STOP_CANCDM dm = (SL_A_SUBS_CNTR_STOP_CANCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.cntrno);
		cstmt.setString(8, dm.mangno);
		cstmt.setString(9, dm.resv1);
		cstmt.setString(10, dm.resv2);
		cstmt.setString(11, dm.resv3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_SUBS_CNTR_STOP_CANCDataSet();
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
String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String mangno = req.getParameter("mangno");
if( mangno == null){
	System.out.println(this.toString+" : mangno is null" );
}else{
	System.out.println(this.toString+" : mangno is "+mangno );
}
String resv1 = req.getParameter("resv1");
if( resv1 == null){
	System.out.println(this.toString+" : resv1 is null" );
}else{
	System.out.println(this.toString+" : resv1 is "+resv1 );
}
String resv2 = req.getParameter("resv2");
if( resv2 == null){
	System.out.println(this.toString+" : resv2 is null" );
}else{
	System.out.println(this.toString+" : resv2 is "+resv2 );
}
String resv3 = req.getParameter("resv3");
if( resv3 == null){
	System.out.println(this.toString+" : resv3 is null" );
}else{
	System.out.println(this.toString+" : resv3 is "+resv3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String cntrno = Util.checkString(req.getParameter("cntrno"));
String mangno = Util.checkString(req.getParameter("mangno"));
String resv1 = Util.checkString(req.getParameter("resv1"));
String resv2 = Util.checkString(req.getParameter("resv2"));
String resv3 = Util.checkString(req.getParameter("resv3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));
String resv1 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv1")));
String resv2 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv2")));
String resv3 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setCntrno(cntrno);
dm.setMangno(mangno);
dm.setResv1(resv1);
dm.setResv2(resv2);
dm.setResv3(resv3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 03 22:06:09 KST 2004 */