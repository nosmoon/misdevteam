/***************************************************************************************************
* 파일명 : SP_PS_A_ALONPRSNT.java
* 수당-수당관리 출근수당 처리
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-수당관리 출근수당 저장처리
 *
 */ 

  

public class PS_A_ALONPRSNTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String aloncd;
	public String boemp_no;
	public String yymm;
	public String realprsntdds;
	public String ddprsntalon;
	public String amt;

	public PS_A_ALONPRSNTDM(){}
	public PS_A_ALONPRSNTDM(String cmpycd, String incmgpers, String bocd, String aloncd, String boemp_no, String yymm, String realprsntdds, String ddprsntalon, String amt){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.aloncd = aloncd;
		this.boemp_no = boemp_no;
		this.yymm = yymm;
		this.realprsntdds = realprsntdds;
		this.ddprsntalon = ddprsntalon;
		this.amt = amt;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAloncd(String aloncd){
		this.aloncd = aloncd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setRealprsntdds(String realprsntdds){
		this.realprsntdds = realprsntdds;
	}

	public void setDdprsntalon(String ddprsntalon){
		this.ddprsntalon = ddprsntalon;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAloncd(){
		return this.aloncd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getRealprsntdds(){
		return this.realprsntdds;
	}

	public String getDdprsntalon(){
		return this.ddprsntalon;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_ALONPRSNT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_ALONPRSNTDM dm = (PS_A_ALONPRSNTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.aloncd);
		cstmt.setString(7, dm.boemp_no);
		cstmt.setString(8, dm.yymm);
		cstmt.setString(9, dm.realprsntdds);
		cstmt.setString(10, dm.ddprsntalon);
		cstmt.setString(11, dm.amt);
		cstmt.registerOutParameter(12, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_A_ALONPRSNTDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String aloncd = req.getParameter("aloncd");
if( aloncd == null){
	System.out.println(this.toString+" : aloncd is null" );
}else{
	System.out.println(this.toString+" : aloncd is "+aloncd );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String realprsntdds = req.getParameter("realprsntdds");
if( realprsntdds == null){
	System.out.println(this.toString+" : realprsntdds is null" );
}else{
	System.out.println(this.toString+" : realprsntdds is "+realprsntdds );
}
String ddprsntalon = req.getParameter("ddprsntalon");
if( ddprsntalon == null){
	System.out.println(this.toString+" : ddprsntalon is null" );
}else{
	System.out.println(this.toString+" : ddprsntalon is "+ddprsntalon );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String aloncd = Util.checkString(req.getParameter("aloncd"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String yymm = Util.checkString(req.getParameter("yymm"));
String realprsntdds = Util.checkString(req.getParameter("realprsntdds"));
String ddprsntalon = Util.checkString(req.getParameter("ddprsntalon"));
String amt = Util.checkString(req.getParameter("amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aloncd = Util.Uni2Ksc(Util.checkString(req.getParameter("aloncd")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String realprsntdds = Util.Uni2Ksc(Util.checkString(req.getParameter("realprsntdds")));
String ddprsntalon = Util.Uni2Ksc(Util.checkString(req.getParameter("ddprsntalon")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setAloncd(aloncd);
dm.setBoemp_no(boemp_no);
dm.setYymm(yymm);
dm.setRealprsntdds(realprsntdds);
dm.setDdprsntalon(ddprsntalon);
dm.setAmt(amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 10 14:20:40 KST 2004 */