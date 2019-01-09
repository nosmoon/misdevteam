/***************************************************************************************************
* 파일명 : SL_L_VSDM.java
* 기능 : 독자-VacationStop관리-목록
* 작성일자 : 2004-04-01
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
 * 독자-VacationStop관리-목록
 *
 */

public class SL_L_VSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String workflag;
	public String clsfcd;
	public String bocnfmyn;
	public String ing;
	public long pageno;
	public long pagesize;

	public SL_L_VSDM(){}
	public SL_L_VSDM(String bocd, String workflag, String clsfcd, String bocnfmyn, String ing, long pageno, long pagesize){
		this.bocd = bocd;
		this.workflag = workflag;
		this.clsfcd = clsfcd;
		this.bocnfmyn = bocnfmyn;
		this.ing = ing;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setWorkflag(String workflag){
		this.workflag = workflag;
	}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setIng(String ing){
		this.ing = ing;
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

	public String getWorkflag(){
		return this.workflag;
	}

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getIng(){
		return this.ing;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_VS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_VSDM dm = (SL_L_VSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.workflag);
		cstmt.setString(5, dm.clsfcd);
		cstmt.setString(6, dm.bocnfmyn);
		cstmt.setString(7, dm.ing);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_VSDataSet();
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
String workflag = req.getParameter("workflag");
if( workflag == null){
	System.out.println(this.toString+" : workflag is null" );
}else{
	System.out.println(this.toString+" : workflag is "+workflag );
}
String clsfcd = req.getParameter("clsfcd");
if( clsfcd == null){
	System.out.println(this.toString+" : clsfcd is null" );
}else{
	System.out.println(this.toString+" : clsfcd is "+clsfcd );
}
String bocnfmyn = req.getParameter("bocnfmyn");
if( bocnfmyn == null){
	System.out.println(this.toString+" : bocnfmyn is null" );
}else{
	System.out.println(this.toString+" : bocnfmyn is "+bocnfmyn );
}
String ing = req.getParameter("ing");
if( ing == null){
	System.out.println(this.toString+" : ing is null" );
}else{
	System.out.println(this.toString+" : ing is "+ing );
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
String workflag = Util.checkString(req.getParameter("workflag"));
String clsfcd = Util.checkString(req.getParameter("clsfcd"));
String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));
String ing = Util.checkString(req.getParameter("ing"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String workflag = Util.Uni2Ksc(Util.checkString(req.getParameter("workflag")));
String clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfcd")));
String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
String ing = Util.Uni2Ksc(Util.checkString(req.getParameter("ing")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setWorkflag(workflag);
dm.setClsfcd(clsfcd);
dm.setBocnfmyn(bocnfmyn);
dm.setIng(ing);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 01 22:20:38 KST 2004 */