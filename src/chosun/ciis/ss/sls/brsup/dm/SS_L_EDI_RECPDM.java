/***************************************************************************************************
* 파일명 : SS_L_EDI_RECPDM.java
* 기능 : 지로EDI 수납결과현황 목록조회
* 작성일자 : 2004-03-06
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지로EDI 수납결과현황 목록조회
 *
 */


public class SS_L_EDI_RECPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acqdt;
	public String areacd;
	public String bocd;
	public String girono;
    public String rcpmrflendyn;
	public long pageno;
	public long pagesize;

	public SS_L_EDI_RECPDM(){}
	public SS_L_EDI_RECPDM(String acqdt, String areacd, String bocd, String girono,String rcpmrflendyn, long pageno, long pagesize){
		this.acqdt = acqdt;
		this.areacd = areacd;
		this.bocd = bocd;
		this.girono = girono;
        this.rcpmrflendyn = rcpmrflendyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

    public void setGirono(String girono){
        this.girono = girono;
	}

    public void setRcpmrflendyn(String rcpmrflendyn){
        this.rcpmrflendyn = rcpmrflendyn;
    }

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getGirono(){
		return this.girono;
	}

    public String getRcpmrflendyn(){
        return this.rcpmrflendyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EDI_RECP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EDI_RECPDM dm = (SS_L_EDI_RECPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acqdt);
		cstmt.setString(4, dm.areacd);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.girono);
		cstmt.setString(7, dm.rcpmrflendyn);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_EDI_RECPDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
}
String girono = req.getParameter("rcpmrflendyn");
    if( rcpmrflendyn == null){
        System.out.println(this.toString+" : rcpmrflendyn is null" );
    }else{
        System.out.println(this.toString+" : rcpmrflendyn is "+rcpmrflendyn );
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

String acqdt = Util.checkString(req.getParameter("acqdt"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String girono = Util.checkString(req.getParameter("girono"));
String rcpmrflendyn = Util.checkString(req.getParameter("rcpmrflendyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String rcpmrflendyn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmrflendyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcqdt(acqdt);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setGirono(girono);
dm.setRcpmrflendyn(rcpmrflendyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 08 22:06:16 KST 2004 */
