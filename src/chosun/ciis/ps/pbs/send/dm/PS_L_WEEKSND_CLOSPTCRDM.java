/***************************************************************************************************
* 파일명 : SP_PS_L_WEEKSND_CLOSPTCR.java  
* 기능 :   출판업무지원시스템 정산마감 조회화면
* 작성일자 : 2007-11-02
* 작성자 : 김재일
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
 *  출판업무지원시스템 정산마감 조회화면
 *
 **/

public class PS_L_WEEKSND_CLOSPTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String fryymm;
	public String toyymm;
	public String etc1;
	public String etc2;
	public String etc3;
	public long pageno;
	public long pagesize;

	public PS_L_WEEKSND_CLOSPTCRDM(){}
	public PS_L_WEEKSND_CLOSPTCRDM(String cmpycd, String medicd, String fryymm, String toyymm, String etc1, String etc2, String etc3, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.fryymm = fryymm;
		this.toyymm = toyymm;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setFryymm(String fryymm){
		this.fryymm = fryymm;
	}

	public void setToyymm(String toyymm){
		this.toyymm = toyymm;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getFryymm(){
		return this.fryymm;
	}

	public String getToyymm(){
		return this.toyymm;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_WEEKSND_CLOSPTCR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_WEEKSND_CLOSPTCRDM dm = (PS_L_WEEKSND_CLOSPTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.fryymm);
		cstmt.setString(6, dm.toyymm);
		cstmt.setString(7, dm.etc1);
		cstmt.setString(8, dm.etc2);
		cstmt.setString(9, dm.etc3);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_WEEKSND_CLOSPTCRDataSet();
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String fryymm = req.getParameter("fryymm");
if( fryymm == null){
	System.out.println(this.toString+" : fryymm is null" );
}else{
	System.out.println(this.toString+" : fryymm is "+fryymm );
}
String toyymm = req.getParameter("toyymm");
if( toyymm == null){
	System.out.println(this.toString+" : toyymm is null" );
}else{
	System.out.println(this.toString+" : toyymm is "+toyymm );
}
String etc1 = req.getParameter("etc1");
if( etc1 == null){
	System.out.println(this.toString+" : etc1 is null" );
}else{
	System.out.println(this.toString+" : etc1 is "+etc1 );
}
String etc2 = req.getParameter("etc2");
if( etc2 == null){
	System.out.println(this.toString+" : etc2 is null" );
}else{
	System.out.println(this.toString+" : etc2 is "+etc2 );
}
String etc3 = req.getParameter("etc3");
if( etc3 == null){
	System.out.println(this.toString+" : etc3 is null" );
}else{
	System.out.println(this.toString+" : etc3 is "+etc3 );
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
String medicd = Util.checkString(req.getParameter("medicd"));
String fryymm = Util.checkString(req.getParameter("fryymm"));
String toyymm = Util.checkString(req.getParameter("toyymm"));
String etc1 = Util.checkString(req.getParameter("etc1"));
String etc2 = Util.checkString(req.getParameter("etc2"));
String etc3 = Util.checkString(req.getParameter("etc3"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String fryymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fryymm")));
String toyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("toyymm")));
String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setFryymm(fryymm);
dm.setToyymm(toyymm);
dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 02 11:18:09 KST 2007 */