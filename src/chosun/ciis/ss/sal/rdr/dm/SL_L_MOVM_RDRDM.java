/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDRDM.java
* 기능 : 독자-이사독자관리-목록을 위한 DM
* 작성일자 : 2004-01-14
* 작성자 : 김대섭
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
 * 독자-이사독자관리-목록을 위한 DM
 */

public class SL_L_MOVM_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String bocd;
	public String rdrnm;
	public String cnfmstat;
	public String proccd;
	public String aplcpathcd;
	public long pageno;
	public long pagesize;

	public SL_L_MOVM_RDRDM(){}
	public SL_L_MOVM_RDRDM(String accflag, String bocd, String rdrnm, String cnfmstat, String proccd, String aplcpathcd, long pageno, long pagesize){
		this.accflag = accflag;
		this.bocd = bocd;
		this.rdrnm = rdrnm;
		this.cnfmstat = cnfmstat;
		this.proccd = proccd;
		this.aplcpathcd = aplcpathcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setCnfmstat(String cnfmstat){
		this.cnfmstat = cnfmstat;
	}

	public void setProccd(String proccd){
		this.proccd = proccd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getCnfmstat(){
		return this.cnfmstat;
	}

	public String getProccd(){
		return this.proccd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_MOVM_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_MOVM_RDRDM dm = (SL_L_MOVM_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.rdrnm);
		cstmt.setString(6, dm.cnfmstat);
		cstmt.setString(7, dm.proccd);
		cstmt.setString(8, dm.aplcpathcd);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_MOVM_RDRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String cnfmstat = req.getParameter("cnfmstat");
if( cnfmstat == null){
	System.out.println(this.toString+" : cnfmstat is null" );
}else{
	System.out.println(this.toString+" : cnfmstat is "+cnfmstat );
}
String proccd = req.getParameter("proccd");
if( proccd == null){
	System.out.println(this.toString+" : proccd is null" );
}else{
	System.out.println(this.toString+" : proccd is "+proccd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String cnfmstat = Util.checkString(req.getParameter("cnfmstat"));
String proccd = Util.checkString(req.getParameter("proccd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String cnfmstat = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfmstat")));
String proccd = Util.Uni2Ksc(Util.checkString(req.getParameter("proccd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setRdrnm(rdrnm);
dm.setCnfmstat(cnfmstat);
dm.setProccd(proccd);
dm.setAplcpathcd(aplcpathcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 15 21:17:22 KST 2004 */