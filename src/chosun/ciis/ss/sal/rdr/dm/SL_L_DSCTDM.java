/***************************************************************************************************
* 파일명 : SL_L_DSCTDM.java
* 기능 : 불편관리(목록)
* 작성일자 : 2003-12-27
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
 * 불편관리(목록)
 *
 */


public class SL_L_DSCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String reg_fr_dt;
	public String reg_to_dt;
	public String dscttypecd;
	public String acpnpathcd;
	public String boprocyn;
	public String search_cond;
	public String search_word;
	public long pageno;
	public long pagesize;

	public SL_L_DSCTDM(){}
	public SL_L_DSCTDM(String bocd, String reg_fr_dt, String reg_to_dt, String dscttypecd, String acpnpathcd, String boprocyn, String search_cond, String search_word, long pageno, long pagesize){
		this.bocd = bocd;
		this.reg_fr_dt = reg_fr_dt;
		this.reg_to_dt = reg_to_dt;
		this.dscttypecd = dscttypecd;
		this.acpnpathcd = acpnpathcd;
		this.boprocyn = boprocyn;
		this.search_cond = search_cond;
		this.search_word = search_word;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setReg_fr_dt(String reg_fr_dt){
		this.reg_fr_dt = reg_fr_dt;
	}

	public void setReg_to_dt(String reg_to_dt){
		this.reg_to_dt = reg_to_dt;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setSearch_cond(String search_cond){
		this.search_cond = search_cond;
	}

	public void setSearch_word(String search_word){
		this.search_word = search_word;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getReg_fr_dt(){
		return this.reg_fr_dt;
	}

	public String getReg_to_dt(){
		return this.reg_to_dt;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getSearch_cond(){
		return this.search_cond;
	}

	public String getSearch_word(){
		return this.search_word;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_DSCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_DSCTDM dm = (SL_L_DSCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.reg_fr_dt);
		cstmt.setString(5, dm.reg_to_dt);
		cstmt.setString(6, dm.dscttypecd);
		cstmt.setString(7, dm.acpnpathcd);
		cstmt.setString(8, dm.boprocyn);
		cstmt.setString(9, dm.search_cond);
		cstmt.setString(10, dm.search_word);
		cstmt.setLong(11, dm.pageno);
		cstmt.setLong(12, dm.pagesize);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_DSCTDataSet();
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
String reg_fr_dt = req.getParameter("reg_fr_dt");
if( reg_fr_dt == null){
	System.out.println(this.toString+" : reg_fr_dt is null" );
}else{
	System.out.println(this.toString+" : reg_fr_dt is "+reg_fr_dt );
}
String reg_to_dt = req.getParameter("reg_to_dt");
if( reg_to_dt == null){
	System.out.println(this.toString+" : reg_to_dt is null" );
}else{
	System.out.println(this.toString+" : reg_to_dt is "+reg_to_dt );
}
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String acpnpathcd = req.getParameter("acpnpathcd");
if( acpnpathcd == null){
	System.out.println(this.toString+" : acpnpathcd is null" );
}else{
	System.out.println(this.toString+" : acpnpathcd is "+acpnpathcd );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String search_cond = req.getParameter("search_cond");
if( search_cond == null){
	System.out.println(this.toString+" : search_cond is null" );
}else{
	System.out.println(this.toString+" : search_cond is "+search_cond );
}
String search_word = req.getParameter("search_word");
if( search_word == null){
	System.out.println(this.toString+" : search_word is null" );
}else{
	System.out.println(this.toString+" : search_word is "+search_word );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String reg_fr_dt = Util.checkString(req.getParameter("reg_fr_dt"));
String reg_to_dt = Util.checkString(req.getParameter("reg_to_dt"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String search_cond = Util.checkString(req.getParameter("search_cond"));
String search_word = Util.checkString(req.getParameter("search_word"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String reg_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_fr_dt")));
String reg_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_to_dt")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String acpnpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acpnpathcd")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setReg_fr_dt(reg_fr_dt);
dm.setReg_to_dt(reg_to_dt);
dm.setDscttypecd(dscttypecd);
dm.setAcpnpathcd(acpnpathcd);
dm.setBoprocyn(boprocyn);
dm.setSearch_cond(search_cond);
dm.setSearch_word(search_word);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 01 16:57:38 KST 2004 */