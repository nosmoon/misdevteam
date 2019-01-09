/***************************************************************************************************
* 파일명 : PS_L_BNSBK.java
* 기능 :   코드관리-보너스북 조회화면
* 작성일자 : 2007-05-21
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드관리-보너스북내역 조회화면
 *
 */

public class PS_L_BNSBKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String bnsbknm;
	public String bgnvdtydt;
	public String endvdtydt;
	public long pageno;
	public long pagesize;

	public PS_L_BNSBKDM(){}
	public PS_L_BNSBKDM(String cmpycd, String medicd, String bnsbknm, String bgnvdtydt, String endvdtydt, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.bnsbknm = bnsbknm;
		this.bgnvdtydt = bgnvdtydt;
		this.endvdtydt = endvdtydt;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBnsbknm(String bnsbknm){
		this.bnsbknm = bnsbknm;
	}

	public void setBgnvdtydt(String bgnvdtydt){
		this.bgnvdtydt = bgnvdtydt;
	}

	public void setEndvdtydt(String endvdtydt){
		this.endvdtydt = endvdtydt;
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

	public String getBnsbknm(){
		return this.bnsbknm;
	}

	public String getBgnvdtydt(){
		return this.bgnvdtydt;
	}

	public String getEndvdtydt(){
		return this.endvdtydt;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_BNSBK( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_BNSBKDM dm = (PS_L_BNSBKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.bnsbknm);
		cstmt.setString(6, dm.bgnvdtydt);
		cstmt.setString(7, dm.endvdtydt);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_L_BNSBKDataSet();
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
String bnsbknm = req.getParameter("bnsbknm");
if( bnsbknm == null){
	System.out.println(this.toString+" : bnsbknm is null" );
}else{
	System.out.println(this.toString+" : bnsbknm is "+bnsbknm );
}
String bgnvdtydt = req.getParameter("bgnvdtydt");
if( bgnvdtydt == null){
	System.out.println(this.toString+" : bgnvdtydt is null" );
}else{
	System.out.println(this.toString+" : bgnvdtydt is "+bgnvdtydt );
}
String endvdtydt = req.getParameter("endvdtydt");
if( endvdtydt == null){
	System.out.println(this.toString+" : endvdtydt is null" );
}else{
	System.out.println(this.toString+" : endvdtydt is "+endvdtydt );
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
String bnsbknm = Util.checkString(req.getParameter("bnsbknm"));
String bgnvdtydt = Util.checkString(req.getParameter("bgnvdtydt"));
String endvdtydt = Util.checkString(req.getParameter("endvdtydt"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String bnsbknm = Util.Uni2Ksc(Util.checkString(req.getParameter("bnsbknm")));
String bgnvdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnvdtydt")));
String endvdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("endvdtydt")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setBnsbknm(bnsbknm);
dm.setBgnvdtydt(bgnvdtydt);
dm.setEndvdtydt(endvdtydt);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 17:36:18 KST 2007 */