/***************************************************************************************************
 * 파일명   : PS_L_MOVM_RDR.java
 * 기능     : 이사신청 리스트
 * 작성일자 : 2005-02-07
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 이사신청 리스트
 */

public class PS_L_MOVM_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String rdrnm;
	public String regdt_fr;
	public String regdt_to;
	public String boprocyn;
	public String acptbocnfmyn;
	public long pageno;
	public long pagesize;

	public PS_L_MOVM_RDRDM(){}
	public PS_L_MOVM_RDRDM(String cmpycd, String rdrnm, String regdt_fr, String regdt_to, String boprocyn, String acptbocnfmyn, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.rdrnm = rdrnm;
		this.regdt_fr = regdt_fr;
		this.regdt_to = regdt_to;
		this.boprocyn = boprocyn;
		this.acptbocnfmyn = acptbocnfmyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRegdt_fr(String regdt_fr){
		this.regdt_fr = regdt_fr;
	}

	public void setRegdt_to(String regdt_to){
		this.regdt_to = regdt_to;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setAcptbocnfmyn(String acptbocnfmyn){
		this.acptbocnfmyn = acptbocnfmyn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRegdt_fr(){
		return this.regdt_fr;
	}

	public String getRegdt_to(){
		return this.regdt_to;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getAcptbocnfmyn(){
		return this.acptbocnfmyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_MOVM_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_MOVM_RDRDM dm = (PS_L_MOVM_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.rdrnm);
		cstmt.setString(5, dm.regdt_fr);
		cstmt.setString(6, dm.regdt_to);
		cstmt.setString(7, dm.boprocyn);
		cstmt.setString(8, dm.acptbocnfmyn);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_L_MOVM_RDRDataSet();
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
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String regdt_fr = req.getParameter("regdt_fr");
if( regdt_fr == null){
	System.out.println(this.toString+" : regdt_fr is null" );
}else{
	System.out.println(this.toString+" : regdt_fr is "+regdt_fr );
}
String regdt_to = req.getParameter("regdt_to");
if( regdt_to == null){
	System.out.println(this.toString+" : regdt_to is null" );
}else{
	System.out.println(this.toString+" : regdt_to is "+regdt_to );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String acptbocnfmyn = req.getParameter("acptbocnfmyn");
if( acptbocnfmyn == null){
	System.out.println(this.toString+" : acptbocnfmyn is null" );
}else{
	System.out.println(this.toString+" : acptbocnfmyn is "+acptbocnfmyn );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String regdt_fr = Util.checkString(req.getParameter("regdt_fr"));
String regdt_to = Util.checkString(req.getParameter("regdt_to"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String acptbocnfmyn = Util.checkString(req.getParameter("acptbocnfmyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String regdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt_fr")));
String regdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt_to")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String acptbocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("acptbocnfmyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setRdrnm(rdrnm);
dm.setRegdt_fr(regdt_fr);
dm.setRegdt_to(regdt_to);
dm.setBoprocyn(boprocyn);
dm.setAcptbocnfmyn(acptbocnfmyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 15 09:37:34 KST 2005 */