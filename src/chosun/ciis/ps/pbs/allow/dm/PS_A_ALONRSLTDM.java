/***************************************************************************************************
* 파일명 : SP_PS_A_ALONRSLT.java
* 수당-수당관리 수당처리
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
 * 수당-수당관리 수당처리
 *
 */ 

 

public class PS_A_ALONRSLTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String aloncd;
	public String boemp_no;
	public String trgtnoit;
	public String fix_rateclsf;
	public String ratiocalcclsf;
	public String amt;
	public String ratio;

	public PS_A_ALONRSLTDM(){}
	public PS_A_ALONRSLTDM(String cmpycd, String incmgpers, String bocd, String aloncd, String boemp_no, String trgtnoit, String fix_rateclsf, String ratiocalcclsf, String amt, String ratio){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.aloncd = aloncd;
		this.boemp_no = boemp_no;
		this.trgtnoit = trgtnoit;
		this.fix_rateclsf = fix_rateclsf;
		this.ratiocalcclsf = ratiocalcclsf;
		this.amt = amt;
		this.ratio = ratio;
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

	public void setTrgtnoit(String trgtnoit){
		this.trgtnoit = trgtnoit;
	}

	public void setFix_rateclsf(String fix_rateclsf){
		this.fix_rateclsf = fix_rateclsf;
	}

	public void setRatiocalcclsf(String ratiocalcclsf){
		this.ratiocalcclsf = ratiocalcclsf;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRatio(String ratio){
		this.ratio = ratio;
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

	public String getTrgtnoit(){
		return this.trgtnoit;
	}

	public String getFix_rateclsf(){
		return this.fix_rateclsf;
	}

	public String getRatiocalcclsf(){
		return this.ratiocalcclsf;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRatio(){
		return this.ratio;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_ALONRSLT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_ALONRSLTDM dm = (PS_A_ALONRSLTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.aloncd);
		cstmt.setString(7, dm.boemp_no);
		cstmt.setString(8, dm.trgtnoit);
		cstmt.setString(9, dm.fix_rateclsf);
		cstmt.setString(10, dm.ratiocalcclsf);
		cstmt.setString(11, dm.amt);
		cstmt.setString(12, dm.ratio);
		cstmt.registerOutParameter(13, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_A_ALONRSLTDataSet();
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
String trgtnoit = req.getParameter("trgtnoit");
if( trgtnoit == null){
	System.out.println(this.toString+" : trgtnoit is null" );
}else{
	System.out.println(this.toString+" : trgtnoit is "+trgtnoit );
}
String fix_rateclsf = req.getParameter("fix_rateclsf");
if( fix_rateclsf == null){
	System.out.println(this.toString+" : fix_rateclsf is null" );
}else{
	System.out.println(this.toString+" : fix_rateclsf is "+fix_rateclsf );
}
String ratiocalcclsf = req.getParameter("ratiocalcclsf");
if( ratiocalcclsf == null){
	System.out.println(this.toString+" : ratiocalcclsf is null" );
}else{
	System.out.println(this.toString+" : ratiocalcclsf is "+ratiocalcclsf );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String ratio = req.getParameter("ratio");
if( ratio == null){
	System.out.println(this.toString+" : ratio is null" );
}else{
	System.out.println(this.toString+" : ratio is "+ratio );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String aloncd = Util.checkString(req.getParameter("aloncd"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String trgtnoit = Util.checkString(req.getParameter("trgtnoit"));
String fix_rateclsf = Util.checkString(req.getParameter("fix_rateclsf"));
String ratiocalcclsf = Util.checkString(req.getParameter("ratiocalcclsf"));
String amt = Util.checkString(req.getParameter("amt"));
String ratio = Util.checkString(req.getParameter("ratio"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aloncd = Util.Uni2Ksc(Util.checkString(req.getParameter("aloncd")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String trgtnoit = Util.Uni2Ksc(Util.checkString(req.getParameter("trgtnoit")));
String fix_rateclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_rateclsf")));
String ratiocalcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ratiocalcclsf")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setAloncd(aloncd);
dm.setBoemp_no(boemp_no);
dm.setTrgtnoit(trgtnoit);
dm.setFix_rateclsf(fix_rateclsf);
dm.setRatiocalcclsf(ratiocalcclsf);
dm.setAmt(amt);
dm.setRatio(ratio);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 10:21:05 KST 2004 */