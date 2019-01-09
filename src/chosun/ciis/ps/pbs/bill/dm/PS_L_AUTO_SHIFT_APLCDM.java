/***************************************************************************************************
* 파일명 : PS_L_AUTO_SHIFT_APLC.java
* 기능   : 자동이체신청 목록조회
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체신청 목록조회
 *
 */

public class PS_L_AUTO_SHIFT_APLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public long pageno;
	public long pagesize;
	public String aplcdt;
	public String aplcclsf;
	public String aplcprocstat;
	public String shftclsf;
	public String sechcond;
	public String sechcont;
	public String sortcond;
	public String sortorder;

	public PS_L_AUTO_SHIFT_APLCDM(){}
	public PS_L_AUTO_SHIFT_APLCDM(String cmpycd, long pageno, long pagesize, String aplcdt, String aplcclsf, String aplcprocstat, String shftclsf, String sechcond, String sechcont, String sortcond, String sortorder){
		this.cmpycd = cmpycd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.aplcdt = aplcdt;
		this.aplcclsf = aplcclsf;
		this.aplcprocstat = aplcprocstat;
		this.shftclsf = shftclsf;
		this.sechcond = sechcond;
		this.sechcont = sechcont;
		this.sortcond = sortcond;
		this.sortorder = sortorder;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setAplcprocstat(String aplcprocstat){
		this.aplcprocstat = aplcprocstat;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setSechcond(String sechcond){
		this.sechcond = sechcond;
	}

	public void setSechcont(String sechcont){
		this.sechcont = sechcont;
	}

	public void setSortcond(String sortcond){
		this.sortcond = sortcond;
	}

	public void setSortorder(String sortorder){
		this.sortorder = sortorder;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getAplcprocstat(){
		return this.aplcprocstat;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getSechcond(){
		return this.sechcond;
	}

	public String getSechcont(){
		return this.sechcont;
	}

	public String getSortcond(){
		return this.sortcond;
	}

	public String getSortorder(){
		return this.sortorder;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_AUTO_SHIFT_APLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_AUTO_SHIFT_APLCDM dm = (PS_L_AUTO_SHIFT_APLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.setString(6, dm.aplcdt);
		cstmt.setString(7, dm.aplcclsf);
		cstmt.setString(8, dm.aplcprocstat);
		cstmt.setString(9, dm.shftclsf);
		cstmt.setString(10, dm.sechcond);
		cstmt.setString(11, dm.sechcont);
		cstmt.setString(12, dm.sortcond);
		cstmt.setString(13, dm.sortorder);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_L_AUTO_SHIFT_APLCDataSet();
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
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcclsf = req.getParameter("aplcclsf");
if( aplcclsf == null){
	System.out.println(this.toString+" : aplcclsf is null" );
}else{
	System.out.println(this.toString+" : aplcclsf is "+aplcclsf );
}
String aplcprocstat = req.getParameter("aplcprocstat");
if( aplcprocstat == null){
	System.out.println(this.toString+" : aplcprocstat is null" );
}else{
	System.out.println(this.toString+" : aplcprocstat is "+aplcprocstat );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String sechcond = req.getParameter("sechcond");
if( sechcond == null){
	System.out.println(this.toString+" : sechcond is null" );
}else{
	System.out.println(this.toString+" : sechcond is "+sechcond );
}
String sechcont = req.getParameter("sechcont");
if( sechcont == null){
	System.out.println(this.toString+" : sechcont is null" );
}else{
	System.out.println(this.toString+" : sechcont is "+sechcont );
}
String sortcond = req.getParameter("sortcond");
if( sortcond == null){
	System.out.println(this.toString+" : sortcond is null" );
}else{
	System.out.println(this.toString+" : sortcond is "+sortcond );
}
String sortorder = req.getParameter("sortorder");
if( sortorder == null){
	System.out.println(this.toString+" : sortorder is null" );
}else{
	System.out.println(this.toString+" : sortorder is "+sortorder );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));
String aplcprocstat = Util.checkString(req.getParameter("aplcprocstat"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String sechcond = Util.checkString(req.getParameter("sechcond"));
String sechcont = Util.checkString(req.getParameter("sechcont"));
String sortcond = Util.checkString(req.getParameter("sortcond"));
String sortorder = Util.checkString(req.getParameter("sortorder"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
String aplcprocstat = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcprocstat")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String sechcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcond")));
String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
String sortcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sortcond")));
String sortorder = Util.Uni2Ksc(Util.checkString(req.getParameter("sortorder")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setAplcdt(aplcdt);
dm.setAplcclsf(aplcclsf);
dm.setAplcprocstat(aplcprocstat);
dm.setShftclsf(shftclsf);
dm.setSechcond(sechcond);
dm.setSechcont(sechcont);
dm.setSortcond(sortcond);
dm.setSortorder(sortorder);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 08 17:36:57 KST 2006 */