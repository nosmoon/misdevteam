/***************************************************************************************************
* 파일명 : SP_PS_L_TODAYINPUT_RDR.java
* 기능 :   독자-입력일자별 독자 조회화면
* 작성일자 : 2004-11-30
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-입력일자별 독자 조회화면
 *
 */

public class PS_L_TODAYINPUT_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String input_fromdt;
	public String input_todt;
	public String medicd;
	public String asinbocd;
	public long pageno;
	public long pagesize;

	public PS_L_TODAYINPUT_RDRDM(){}
	public PS_L_TODAYINPUT_RDRDM(String cmpycd, String input_fromdt, String input_todt, String medicd, String asinbocd, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.input_fromdt = input_fromdt;
		this.input_todt = input_todt;
		this.medicd = medicd;
		this.asinbocd = asinbocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setInput_fromdt(String input_fromdt){
		this.input_fromdt = input_fromdt;
	}

	public void setInput_todt(String input_todt){
		this.input_todt = input_todt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAsinbocd(String asinbocd){
		this.asinbocd = asinbocd;
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

	public String getInput_fromdt(){
		return this.input_fromdt;
	}

	public String getInput_todt(){
		return this.input_todt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAsinbocd(){
		return this.asinbocd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_TODAYINPUT_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_TODAYINPUT_RDRDM dm = (PS_L_TODAYINPUT_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.input_fromdt);
		cstmt.setString(5, dm.input_todt);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.asinbocd);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_TODAYINPUT_RDRDataSet();
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
String input_fromdt = req.getParameter("input_fromdt");
if( input_fromdt == null){
	System.out.println(this.toString+" : input_fromdt is null" );
}else{
	System.out.println(this.toString+" : input_fromdt is "+input_fromdt );
}
String input_todt = req.getParameter("input_todt");
if( input_todt == null){
	System.out.println(this.toString+" : input_todt is null" );
}else{
	System.out.println(this.toString+" : input_todt is "+input_todt );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String asinbocd = req.getParameter("asinbocd");
if( asinbocd == null){
	System.out.println(this.toString+" : asinbocd is null" );
}else{
	System.out.println(this.toString+" : asinbocd is "+asinbocd );
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
String input_fromdt = Util.checkString(req.getParameter("input_fromdt"));
String input_todt = Util.checkString(req.getParameter("input_todt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String asinbocd = Util.checkString(req.getParameter("asinbocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String input_fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("input_fromdt")));
String input_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("input_todt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setInput_fromdt(input_fromdt);
dm.setInput_todt(input_todt);
dm.setMedicd(medicd);
dm.setAsinbocd(asinbocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 21 16:19:56 KST 2005 */