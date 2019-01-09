/***************************************************************************************************
* 파일명 : SL_L_MILGPAYDM.java
* 기능 : 독자정보관리(마일리지지급내역팝업-목록조회)
* 작성일자 : 2004-06-03
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
 * 독자정보관리(마일리지지급내역팝업-목록조회)
 *
 */

public class SL_L_MILGPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String frpaydt;
	public String topaydt;
	public String paybasicd;
	public String medicd;
	public long pageno;
	public long pagesize;

	public SL_L_MILGPAYDM(){}
	public SL_L_MILGPAYDM(String rdr_no, String frpaydt, String topaydt, String paybasicd, String medicd, long pageno, long pagesize){
		this.rdr_no = rdr_no;
		this.frpaydt = frpaydt;
		this.topaydt = topaydt;
		this.paybasicd = paybasicd;
		this.medicd = medicd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setFrpaydt(String frpaydt){
		this.frpaydt = frpaydt;
	}

	public void setTopaydt(String topaydt){
		this.topaydt = topaydt;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getFrpaydt(){
		return this.frpaydt;
	}

	public String getTopaydt(){
		return this.topaydt;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_MILGPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_MILGPAYDM dm = (SL_L_MILGPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.frpaydt);
		cstmt.setString(5, dm.topaydt);
		cstmt.setString(6, dm.paybasicd);
		cstmt.setString(7, dm.medicd);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_MILGPAYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String frpaydt = req.getParameter("frpaydt");
if( frpaydt == null){
	System.out.println(this.toString+" : frpaydt is null" );
}else{
	System.out.println(this.toString+" : frpaydt is "+frpaydt );
}
String topaydt = req.getParameter("topaydt");
if( topaydt == null){
	System.out.println(this.toString+" : topaydt is null" );
}else{
	System.out.println(this.toString+" : topaydt is "+topaydt );
}
String paybasicd = req.getParameter("paybasicd");
if( paybasicd == null){
	System.out.println(this.toString+" : paybasicd is null" );
}else{
	System.out.println(this.toString+" : paybasicd is "+paybasicd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String frpaydt = Util.checkString(req.getParameter("frpaydt"));
String topaydt = Util.checkString(req.getParameter("topaydt"));
String paybasicd = Util.checkString(req.getParameter("paybasicd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String frpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("frpaydt")));
String topaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("topaydt")));
String paybasicd = Util.Uni2Ksc(Util.checkString(req.getParameter("paybasicd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no(rdr_no);
dm.setFrpaydt(frpaydt);
dm.setTopaydt(topaydt);
dm.setPaybasicd(paybasicd);
dm.setMedicd(medicd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 06 16:17:42 KST 2004 */