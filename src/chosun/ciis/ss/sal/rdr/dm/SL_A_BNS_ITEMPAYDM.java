/***************************************************************************************************
* 파일명 : SL_A_BNS_ITEMPAYDM.java
* 기능 : 독자정보관리(판촉물내역팝업-등록,수정,삭제)
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
 * 독자정보관리(판촉물내역팝업-등록,수정,삭제)
 *
 */

public class SL_A_BNS_ITEMPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String accflag;
	public String rdr_no;
	public String payno;
	public String paydt;
	public String bns_itemcd;
	public long qunt;
	public long amt;
	public String rdr_extndt;
	public String rdr_extnno;

	public SL_A_BNS_ITEMPAYDM(){}
	public SL_A_BNS_ITEMPAYDM(String bocd, String incmgpers, String accflag, String rdr_no, String payno, String paydt, String bns_itemcd, long qunt, long amt, String rdr_extndt, String rdr_extnno){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.rdr_no = rdr_no;
		this.payno = payno;
		this.paydt = paydt;
		this.bns_itemcd = bns_itemcd;
		this.qunt = qunt;
		this.amt = amt;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
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

	public void setPayno(String payno){
		this.payno = payno;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setQunt(long qunt){
		this.qunt = qunt;
	}

	public void setAmt(long amt){
		this.amt = amt;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
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

	public String getPayno(){
		return this.payno;
	}

	public String getPaydt(){
		return this.paydt;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public long getQunt(){
		return this.qunt;
	}

	public long getAmt(){
		return this.amt;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_BNS_ITEMPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_BNS_ITEMPAYDM dm = (SL_A_BNS_ITEMPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.payno);
		cstmt.setString(8, dm.paydt);
		cstmt.setString(9, dm.bns_itemcd);
		cstmt.setLong(10, dm.qunt);
		cstmt.setLong(11, dm.amt);
		cstmt.setString(12, dm.rdr_extndt);
		cstmt.setString(13, dm.rdr_extnno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_BNS_ITEMPAYDataSet();
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
String payno = req.getParameter("payno");
if( payno == null){
	System.out.println(this.toString+" : payno is null" );
}else{
	System.out.println(this.toString+" : payno is "+payno );
}
String paydt = req.getParameter("paydt");
if( paydt == null){
	System.out.println(this.toString+" : paydt is null" );
}else{
	System.out.println(this.toString+" : paydt is "+paydt );
}
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String payno = Util.checkString(req.getParameter("payno"));
String paydt = Util.checkString(req.getParameter("paydt"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String qunt = Util.checkString(req.getParameter("qunt"));
String amt = Util.checkString(req.getParameter("amt"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String payno = Util.Uni2Ksc(Util.checkString(req.getParameter("payno")));
String paydt = Util.Uni2Ksc(Util.checkString(req.getParameter("paydt")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setRdr_no(rdr_no);
dm.setPayno(payno);
dm.setPaydt(paydt);
dm.setBns_itemcd(bns_itemcd);
dm.setQunt(qunt);
dm.setAmt(amt);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 03 20:18:17 KST 2004 */