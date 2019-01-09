/***************************************************************************************************
* 파일명 : SL_A_MILGPAYDM.java
* 기능 : 독자정보관리(마일리지지급내역팝업-등록,수정,삭제)
* 작성일자 : 2004-06-03
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
 * 독자정보관리(마일리지지급내역팝업-등록,수정,삭제)
 *
 */

public class SL_A_MILGPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String accflag;
	public String rdr_no;
	public String milgpaydt;
	public String milgpayno;
	public String cmpycd;
	public String medicd;
	public String paybasicd;
	public String payclsfcd;
	public long pont;

	public SL_A_MILGPAYDM(){}
	public SL_A_MILGPAYDM(String bocd, String incmgpers, String accflag, String rdr_no, String milgpaydt, String milgpayno, String cmpycd, String medicd, String paybasicd, String payclsfcd, long pont){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.rdr_no = rdr_no;
		this.milgpaydt = milgpaydt;
		this.milgpayno = milgpayno;
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.paybasicd = paybasicd;
		this.payclsfcd = payclsfcd;
		this.pont = pont;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMilgpaydt(String milgpaydt){
		this.milgpaydt = milgpaydt;
	}

	public void setMilgpayno(String milgpayno){
		this.milgpayno = milgpayno;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPont(long pont){
		this.pont = pont;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMilgpaydt(){
		return this.milgpaydt;
	}

	public String getMilgpayno(){
		return this.milgpayno;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public long getPont(){
		return this.pont;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_MILGPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_MILGPAYDM dm = (SL_A_MILGPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.milgpaydt);
		cstmt.setString(8, dm.milgpayno);
		cstmt.setString(9, dm.cmpycd);
		cstmt.setString(10, dm.medicd);
		cstmt.setString(11, dm.paybasicd);
		cstmt.setString(12, dm.payclsfcd);
		cstmt.setLong(13, dm.pont);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_MILGPAYDataSet();
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String milgpaydt = req.getParameter("milgpaydt");
if( milgpaydt == null){
	System.out.println(this.toString+" : milgpaydt is null" );
}else{
	System.out.println(this.toString+" : milgpaydt is "+milgpaydt );
}
String milgpayno = req.getParameter("milgpayno");
if( milgpayno == null){
	System.out.println(this.toString+" : milgpayno is null" );
}else{
	System.out.println(this.toString+" : milgpayno is "+milgpayno );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String paybasicd = req.getParameter("paybasicd");
if( paybasicd == null){
	System.out.println(this.toString+" : paybasicd is null" );
}else{
	System.out.println(this.toString+" : paybasicd is "+paybasicd );
}
String payclsfcd = req.getParameter("payclsfcd");
if( payclsfcd == null){
	System.out.println(this.toString+" : payclsfcd is null" );
}else{
	System.out.println(this.toString+" : payclsfcd is "+payclsfcd );
}
String pont = req.getParameter("pont");
if( pont == null){
	System.out.println(this.toString+" : pont is null" );
}else{
	System.out.println(this.toString+" : pont is "+pont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String milgpaydt = Util.checkString(req.getParameter("milgpaydt"));
String milgpayno = Util.checkString(req.getParameter("milgpayno"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String paybasicd = Util.checkString(req.getParameter("paybasicd"));
String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
String pont = Util.checkString(req.getParameter("pont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String milgpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("milgpaydt")));
String milgpayno = Util.Uni2Ksc(Util.checkString(req.getParameter("milgpayno")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String paybasicd = Util.Uni2Ksc(Util.checkString(req.getParameter("paybasicd")));
String payclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("payclsfcd")));
String pont = Util.Uni2Ksc(Util.checkString(req.getParameter("pont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setRdr_no(rdr_no);
dm.setMilgpaydt(milgpaydt);
dm.setMilgpayno(milgpayno);
dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setPaybasicd(paybasicd);
dm.setPayclsfcd(payclsfcd);
dm.setPont(pont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 06 16:19:57 KST 2004 */