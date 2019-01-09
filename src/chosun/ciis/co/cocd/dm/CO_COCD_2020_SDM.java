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


public class CO_COCD_2020_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String addr11;
	public String addr22;
	public String addr33;
	public String largedlvnm;
	public String pageno;
	public String pagesize;

	public CO_COCD_2020_SDM(){}
	public CO_COCD_2020_SDM(String addr11, String addr22, String addr33, String largedlvnm, String pageno, String pagesize){
		this.addr11 = addr11;
		this.addr22 = addr22;
		this.addr33 = addr33;
		this.largedlvnm = largedlvnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAddr11(String addr11){
		this.addr11 = addr11;
	}

	public void setAddr22(String addr22){
		this.addr22 = addr22;
	}

	public void setAddr33(String addr33){
		this.addr33 = addr33;
	}

	public void setLargedlvnm(String largedlvnm){
		this.largedlvnm = largedlvnm;
	}

	public void setPageno(String pageno){
		this.pageno = pageno;
	}

	public void setPagesize(String pagesize){
		this.pagesize = pagesize;
	}

	public String getAddr11(){
		return this.addr11;
	}

	public String getAddr22(){
		return this.addr22;
	}

	public String getAddr33(){
		return this.addr33;
	}

	public String getLargedlvnm(){
		return this.largedlvnm;
	}

	public String getPageno(){
		return this.pageno;
	}

	public String getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_2020_S(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_2020_SDM dm = (CO_COCD_2020_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.addr11);
		cstmt.setString(4, dm.addr22);
		cstmt.setString(5, dm.addr33);
		cstmt.setString(6, dm.largedlvnm);
		cstmt.setString(7, dm.pageno);
		cstmt.setString(8, dm.pagesize);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_2020_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("addr11 = [" + getAddr11() + "]");
		System.out.println("addr22 = [" + getAddr22() + "]");
		System.out.println("addr33 = [" + getAddr33() + "]");
		System.out.println("largedlvnm = [" + getLargedlvnm() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String addr11 = req.getParameter("addr11");
if( addr11 == null){
	System.out.println(this.toString+" : addr11 is null" );
}else{
	System.out.println(this.toString+" : addr11 is "+addr11 );
}
String addr22 = req.getParameter("addr22");
if( addr22 == null){
	System.out.println(this.toString+" : addr22 is null" );
}else{
	System.out.println(this.toString+" : addr22 is "+addr22 );
}
String addr33 = req.getParameter("addr33");
if( addr33 == null){
	System.out.println(this.toString+" : addr33 is null" );
}else{
	System.out.println(this.toString+" : addr33 is "+addr33 );
}
String largedlvnm = req.getParameter("largedlvnm");
if( largedlvnm == null){
	System.out.println(this.toString+" : largedlvnm is null" );
}else{
	System.out.println(this.toString+" : largedlvnm is "+largedlvnm );
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

String addr11 = Util.checkString(req.getParameter("addr11"));
String addr22 = Util.checkString(req.getParameter("addr22"));
String addr33 = Util.checkString(req.getParameter("addr33"));
String largedlvnm = Util.checkString(req.getParameter("largedlvnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String addr11 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr11")));
String addr22 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr22")));
String addr33 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr33")));
String largedlvnm = Util.Uni2Ksc(Util.checkString(req.getParameter("largedlvnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAddr11(addr11);
dm.setAddr22(addr22);
dm.setAddr33(addr33);
dm.setLargedlvnm(largedlvnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 06 10:09:08 KST 2012 */