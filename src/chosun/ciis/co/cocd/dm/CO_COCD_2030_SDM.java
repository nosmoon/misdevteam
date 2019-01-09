/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.cocd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_2030_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String addr1;
	public String addr2;
	public String rdnm;
	public String bldnn1;
	public String bldnn2;
	public String pageno;
	public String pagesize;

	public CO_COCD_2030_SDM(){}
	public CO_COCD_2030_SDM(String addr1, String addr2, String rdnm, String bldnn1, String bldnn2, String pageno, String pagesize){
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.rdnm = rdnm;
		this.bldnn1 = bldnn1;
		this.bldnn2 = bldnn2;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAddr1(String addr1){
		this.addr1 = addr1;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public void setRdnm(String rdnm){
		this.rdnm = rdnm;
	}

	public void setBldnn1(String bldnn1){
		this.bldnn1 = bldnn1;
	}

	public void setBldnn2(String bldnn2){
		this.bldnn2 = bldnn2;
	}

	public void setPageno(String pageno){
		this.pageno = pageno;
	}

	public void setPagesize(String pagesize){
		this.pagesize = pagesize;
	}

	public String getAddr1(){
		return this.addr1;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getRdnm(){
		return this.rdnm;
	}

	public String getBldnn1(){
		return this.bldnn1;
	}

	public String getBldnn2(){
		return this.bldnn2;
	}

	public String getPageno(){
		return this.pageno;
	}

	public String getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_2030_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_2030_SDM dm = (CO_COCD_2030_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.addr1);
		cstmt.setString(4, dm.addr2);
		cstmt.setString(5, dm.rdnm);
		cstmt.setString(6, dm.bldnn1);
		cstmt.setString(7, dm.bldnn2);
		cstmt.setString(8, dm.pageno);
		cstmt.setString(9, dm.pagesize);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_2030_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("addr1 = [" + getAddr1() + "]");
		System.out.println("addr2 = [" + getAddr2() + "]");
		System.out.println("rdnm = [" + getRdnm() + "]");
		System.out.println("bldnn1 = [" + getBldnn1() + "]");
		System.out.println("bldnn2 = [" + getBldnn2() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String addr1 = req.getParameter("addr1");
if( addr1 == null){
	System.out.println(this.toString+" : addr1 is null" );
}else{
	System.out.println(this.toString+" : addr1 is "+addr1 );
}
String addr2 = req.getParameter("addr2");
if( addr2 == null){
	System.out.println(this.toString+" : addr2 is null" );
}else{
	System.out.println(this.toString+" : addr2 is "+addr2 );
}
String rdnm = req.getParameter("rdnm");
if( rdnm == null){
	System.out.println(this.toString+" : rdnm is null" );
}else{
	System.out.println(this.toString+" : rdnm is "+rdnm );
}
String bldnn1 = req.getParameter("bldnn1");
if( bldnn1 == null){
	System.out.println(this.toString+" : bldnn1 is null" );
}else{
	System.out.println(this.toString+" : bldnn1 is "+bldnn1 );
}
String bldnn2 = req.getParameter("bldnn2");
if( bldnn2 == null){
	System.out.println(this.toString+" : bldnn2 is null" );
}else{
	System.out.println(this.toString+" : bldnn2 is "+bldnn2 );
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

String addr1 = Util.checkString(req.getParameter("addr1"));
String addr2 = Util.checkString(req.getParameter("addr2"));
String rdnm = Util.checkString(req.getParameter("rdnm"));
String bldnn1 = Util.checkString(req.getParameter("bldnn1"));
String bldnn2 = Util.checkString(req.getParameter("bldnn2"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String addr1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1")));
String addr2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2")));
String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm")));
String bldnn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldnn1")));
String bldnn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldnn2")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAddr1(addr1);
dm.setAddr2(addr2);
dm.setRdnm(rdnm);
dm.setBldnn1(bldnn1);
dm.setBldnn2(bldnn2);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 03 19:41:36 KST 2012 */