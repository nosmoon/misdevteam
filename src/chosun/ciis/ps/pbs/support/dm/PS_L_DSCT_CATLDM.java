/***************************************************************************************************
* 파일명 : PS_L_DSCT_CATL.java
* 기능   :  불편접수 - 조회리스트 
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편접수 - 조회 리스트
 *
 */

public class PS_L_DSCT_CATLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String kubun;
	public String datefrom;
	public String dateto;
	public String dscttypecd;
	public String boprocyn;
	public long pageno;
	public long pagesize;

	public PS_L_DSCT_CATLDM(){}
	public PS_L_DSCT_CATLDM(String cmpycd, String kubun, String datefrom, String dateto, String dscttypecd, String boprocyn, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.kubun = kubun;
		this.datefrom = datefrom;
		this.dateto = dateto;
		this.dscttypecd = dscttypecd;
		this.boprocyn = boprocyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setKubun(String kubun){
		this.kubun = kubun;
	}

	public void setDatefrom(String datefrom){
		this.datefrom = datefrom;
	}

	public void setDateto(String dateto){
		this.dateto = dateto;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
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

	public String getKubun(){
		return this.kubun;
	}

	public String getDatefrom(){
		return this.datefrom;
	}

	public String getDateto(){
		return this.dateto;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_DSCT_CATL( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_DSCT_CATLDM dm = (PS_L_DSCT_CATLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.kubun);
		cstmt.setString(5, dm.datefrom);
		cstmt.setString(6, dm.dateto);
		cstmt.setString(7, dm.dscttypecd);
		cstmt.setString(8, dm.boprocyn);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_L_DSCT_CATLDataSet();
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
String kubun = req.getParameter("kubun");
if( kubun == null){
	System.out.println(this.toString+" : kubun is null" );
}else{
	System.out.println(this.toString+" : kubun is "+kubun );
}
String datefrom = req.getParameter("datefrom");
if( datefrom == null){
	System.out.println(this.toString+" : datefrom is null" );
}else{
	System.out.println(this.toString+" : datefrom is "+datefrom );
}
String dateto = req.getParameter("dateto");
if( dateto == null){
	System.out.println(this.toString+" : dateto is null" );
}else{
	System.out.println(this.toString+" : dateto is "+dateto );
}
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
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
String kubun = Util.checkString(req.getParameter("kubun"));
String datefrom = Util.checkString(req.getParameter("datefrom"));
String dateto = Util.checkString(req.getParameter("dateto"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String kubun = Util.Uni2Ksc(Util.checkString(req.getParameter("kubun")));
String datefrom = Util.Uni2Ksc(Util.checkString(req.getParameter("datefrom")));
String dateto = Util.Uni2Ksc(Util.checkString(req.getParameter("dateto")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setKubun(kubun);
dm.setDatefrom(datefrom);
dm.setDateto(dateto);
dm.setDscttypecd(dscttypecd);
dm.setBoprocyn(boprocyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 11 20:48:34 KST 2005 */