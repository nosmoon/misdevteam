/***************************************************************************************************
* 파일명 : SL_A_SUBS_CNTR_STOPDM.java
* 기능 : 독자정보관리(중지처리)
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
 * 독자정보관리(중지처리)
 *
 */

public class SL_A_SUBS_CNTR_STOPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String susptype;
	public String suspdt;
	public String remk;
	public String rdr_no;
	public String medicd;
	public String freeyn;
	public String freeclsf;
	public String qty;
	public String suspresncd;
	public String resv1;
	public String resv2;
	public String resv3;

	public SL_A_SUBS_CNTR_STOPDM(){}
	public SL_A_SUBS_CNTR_STOPDM(String bocd, String incmgpers, String susptype, String suspdt, String remk, String rdr_no, String medicd, String freeyn, String freeclsf, String qty, String suspresncd, String resv1, String resv2, String resv3){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.susptype = susptype;
		this.suspdt = suspdt;
		this.remk = remk;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.freeyn = freeyn;
		this.freeclsf = freeclsf;
		this.qty = qty;
		this.suspresncd = suspresncd;
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

	public void setSusptype(String susptype){
		this.susptype = susptype;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
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

	public String getSusptype(){
		return this.susptype;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSuspresncd(){
		return this.suspresncd;
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
		 return "{ call SP_SL_A_SUBS_CNTR_STOP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_SUBS_CNTR_STOPDM dm = (SL_A_SUBS_CNTR_STOPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.susptype);
		cstmt.setString(6, dm.suspdt);
		cstmt.setString(7, dm.remk);
		cstmt.setString(8, dm.rdr_no);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.freeyn);
		cstmt.setString(11, dm.freeclsf);
		cstmt.setString(12, dm.qty);
		cstmt.setString(13, dm.suspresncd);
		cstmt.setString(14, dm.resv1);
		cstmt.setString(15, dm.resv2);
		cstmt.setString(16, dm.resv3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_SUBS_CNTR_STOPDataSet();
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
String susptype = req.getParameter("susptype");
if( susptype == null){
	System.out.println(this.toString+" : susptype is null" );
}else{
	System.out.println(this.toString+" : susptype is "+susptype );
}
String suspdt = req.getParameter("suspdt");
if( suspdt == null){
	System.out.println(this.toString+" : suspdt is null" );
}else{
	System.out.println(this.toString+" : suspdt is "+suspdt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String freeyn = req.getParameter("freeyn");
if( freeyn == null){
	System.out.println(this.toString+" : freeyn is null" );
}else{
	System.out.println(this.toString+" : freeyn is "+freeyn );
}
String freeclsf = req.getParameter("freeclsf");
if( freeclsf == null){
	System.out.println(this.toString+" : freeclsf is null" );
}else{
	System.out.println(this.toString+" : freeclsf is "+freeclsf );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String suspresncd = req.getParameter("suspresncd");
if( suspresncd == null){
	System.out.println(this.toString+" : suspresncd is null" );
}else{
	System.out.println(this.toString+" : suspresncd is "+suspresncd );
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
String susptype = Util.checkString(req.getParameter("susptype"));
String suspdt = Util.checkString(req.getParameter("suspdt"));
String remk = Util.checkString(req.getParameter("remk"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String freeyn = Util.checkString(req.getParameter("freeyn"));
String freeclsf = Util.checkString(req.getParameter("freeclsf"));
String qty = Util.checkString(req.getParameter("qty"));
String suspresncd = Util.checkString(req.getParameter("suspresncd"));
String resv1 = Util.checkString(req.getParameter("resv1"));
String resv2 = Util.checkString(req.getParameter("resv2"));
String resv3 = Util.checkString(req.getParameter("resv3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String susptype = Util.Uni2Ksc(Util.checkString(req.getParameter("susptype")));
String suspdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspdt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));
String freeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("freeclsf")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String suspresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("suspresncd")));
String resv1 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv1")));
String resv2 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv2")));
String resv3 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setSusptype(susptype);
dm.setSuspdt(suspdt);
dm.setRemk(remk);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setFreeyn(freeyn);
dm.setFreeclsf(freeclsf);
dm.setQty(qty);
dm.setSuspresncd(suspresncd);
dm.setResv1(resv1);
dm.setResv2(resv2);
dm.setResv3(resv3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 16:33:15 KST 2004 */