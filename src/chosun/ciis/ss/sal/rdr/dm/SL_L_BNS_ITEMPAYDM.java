/***************************************************************************************************
* 파일명 : SL_L_BNS_ITEMPAYDM.java
* 기능 : 독자정보관리(판촉물내역팝업-목록조회)
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
 * 독자정보관리(판촉물내역팝업-목록조회)
 *
 */

public class SL_L_BNS_ITEMPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String frpaydt;
	public String topaydt;
	public String search_order;
	public String search_ad;
	public String search_cond;
	public String search_word;
	public long pageno;
	public long pagesize;

	public SL_L_BNS_ITEMPAYDM(){}
	public SL_L_BNS_ITEMPAYDM(String rdr_no, String frpaydt, String topaydt, String search_order, String search_ad, String search_cond, String search_word, long pageno, long pagesize){
		this.rdr_no = rdr_no;
		this.frpaydt = frpaydt;
		this.topaydt = topaydt;
		this.search_order = search_order;
		this.search_ad = search_ad;
		this.search_cond = search_cond;
		this.search_word = search_word;
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

	public void setSearch_order(String search_order){
		this.search_order = search_order;
	}

	public void setSearch_ad(String search_ad){
		this.search_ad = search_ad;
	}

	public void setSearch_cond(String search_cond){
		this.search_cond = search_cond;
	}

	public void setSearch_word(String search_word){
		this.search_word = search_word;
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

	public String getSearch_order(){
		return this.search_order;
	}

	public String getSearch_ad(){
		return this.search_ad;
	}

	public String getSearch_cond(){
		return this.search_cond;
	}

	public String getSearch_word(){
		return this.search_word;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_BNS_ITEMPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_BNS_ITEMPAYDM dm = (SL_L_BNS_ITEMPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.frpaydt);
		cstmt.setString(5, dm.topaydt);
		cstmt.setString(6, dm.search_order);
		cstmt.setString(7, dm.search_ad);
		cstmt.setString(8, dm.search_cond);
		cstmt.setString(9, dm.search_word);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_BNS_ITEMPAYDataSet();
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
String search_order = req.getParameter("search_order");
if( search_order == null){
	System.out.println(this.toString+" : search_order is null" );
}else{
	System.out.println(this.toString+" : search_order is "+search_order );
}
String search_ad = req.getParameter("search_ad");
if( search_ad == null){
	System.out.println(this.toString+" : search_ad is null" );
}else{
	System.out.println(this.toString+" : search_ad is "+search_ad );
}
String search_cond = req.getParameter("search_cond");
if( search_cond == null){
	System.out.println(this.toString+" : search_cond is null" );
}else{
	System.out.println(this.toString+" : search_cond is "+search_cond );
}
String search_word = req.getParameter("search_word");
if( search_word == null){
	System.out.println(this.toString+" : search_word is null" );
}else{
	System.out.println(this.toString+" : search_word is "+search_word );
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
String search_order = Util.checkString(req.getParameter("search_order"));
String search_ad = Util.checkString(req.getParameter("search_ad"));
String search_cond = Util.checkString(req.getParameter("search_cond"));
String search_word = Util.checkString(req.getParameter("search_word"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String frpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("frpaydt")));
String topaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("topaydt")));
String search_order = Util.Uni2Ksc(Util.checkString(req.getParameter("search_order")));
String search_ad = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ad")));
String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));
String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no(rdr_no);
dm.setFrpaydt(frpaydt);
dm.setTopaydt(topaydt);
dm.setSearch_order(search_order);
dm.setSearch_ad(search_ad);
dm.setSearch_cond(search_cond);
dm.setSearch_word(search_word);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 04 11:40:03 KST 2004 */