/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_CAMP_TM_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String date_flag;
	public String search_frdt;
	public String search_todt;
	public String db_gubun;
	public String agentnm;
	public String rdrnm;
	public String conn_gubun;
	public String bocnfm;
	public String subscnfmstat;
	public String campid;

	public SS_L_CAMP_TM_EXTNDM(){}
	public SS_L_CAMP_TM_EXTNDM(String deptcd, String partcd, String areacd, String bocd, String date_flag, String search_frdt, String search_todt, String db_gubun, String agentnm, String rdrnm, String conn_gubun, String bocnfm, String subscnfmstat, String campid){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.date_flag = date_flag;
		this.search_frdt = search_frdt;
		this.search_todt = search_todt;
		this.db_gubun = db_gubun;
		this.agentnm = agentnm;
		this.rdrnm = rdrnm;
		this.conn_gubun = conn_gubun;
		this.bocnfm = bocnfm;
		this.subscnfmstat = subscnfmstat;
		this.campid = campid;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDate_flag(String date_flag){
		this.date_flag = date_flag;
	}

	public void setSearch_frdt(String search_frdt){
		this.search_frdt = search_frdt;
	}

	public void setSearch_todt(String search_todt){
		this.search_todt = search_todt;
	}

	public void setDb_gubun(String db_gubun){
		this.db_gubun = db_gubun;
	}

	public void setAgentnm(String agentnm){
		this.agentnm = agentnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setConn_gubun(String conn_gubun){
		this.conn_gubun = conn_gubun;
	}

	public void setBocnfm(String bocnfm){
		this.bocnfm = bocnfm;
	}

	public void setSubscnfmstat(String subscnfmstat){
		this.subscnfmstat = subscnfmstat;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}
	
	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDate_flag(){
		return this.date_flag;
	}

	public String getSearch_frdt(){
		return this.search_frdt;
	}

	public String getSearch_todt(){
		return this.search_todt;
	}

	public String getDb_gubun(){
		return this.db_gubun;
	}

	public String getAgentnm(){
		return this.agentnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getConn_gubun(){
		return this.conn_gubun;
	}

	public String getBocnfm(){
		return this.bocnfm;
	}

	public String getSubscnfmstat(){
		return this.subscnfmstat;
	}
	
	public String getCampid(){
		return this.campid;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CAMP_TM_EXTN(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CAMP_TM_EXTNDM dm = (SS_L_CAMP_TM_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.date_flag);
		cstmt.setString(8, dm.search_frdt);
		cstmt.setString(9, dm.search_todt);
		cstmt.setString(10, dm.db_gubun);
		cstmt.setString(11, dm.agentnm);
		cstmt.setString(12, dm.rdrnm);
		cstmt.setString(13, dm.conn_gubun);
		cstmt.setString(14, dm.bocnfm);
		cstmt.setString(15, dm.subscnfmstat);
		cstmt.setString(16, dm.campid);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_CAMP_TM_EXTNDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("date_flag = [" + getDate_flag() + "]");
		System.out.println("search_frdt = [" + getSearch_frdt() + "]");
		System.out.println("search_todt = [" + getSearch_todt() + "]");
		System.out.println("db_gubun = [" + getDb_gubun() + "]");
		System.out.println("agentnm = [" + getAgentnm() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("conn_gubun = [" + getConn_gubun() + "]");
		System.out.println("bocnfm = [" + getBocnfm() + "]");
		System.out.println("subscnfmstat = [" + getSubscnfmstat() + "]");
		System.out.println("campid = [" + getCampid() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
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
String date_flag = req.getParameter("date_flag");
if( date_flag == null){
	System.out.println(this.toString+" : date_flag is null" );
}else{
	System.out.println(this.toString+" : date_flag is "+date_flag );
}
String search_frdt = req.getParameter("search_frdt");
if( search_frdt == null){
	System.out.println(this.toString+" : search_frdt is null" );
}else{
	System.out.println(this.toString+" : search_frdt is "+search_frdt );
}
String search_todt = req.getParameter("search_todt");
if( search_todt == null){
	System.out.println(this.toString+" : search_todt is null" );
}else{
	System.out.println(this.toString+" : search_todt is "+search_todt );
}
String db_gubun = req.getParameter("db_gubun");
if( db_gubun == null){
	System.out.println(this.toString+" : db_gubun is null" );
}else{
	System.out.println(this.toString+" : db_gubun is "+db_gubun );
}
String agentnm = req.getParameter("agentnm");
if( agentnm == null){
	System.out.println(this.toString+" : agentnm is null" );
}else{
	System.out.println(this.toString+" : agentnm is "+agentnm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String conn_gubun = req.getParameter("conn_gubun");
if( conn_gubun == null){
	System.out.println(this.toString+" : conn_gubun is null" );
}else{
	System.out.println(this.toString+" : conn_gubun is "+conn_gubun );
}
String bocnfm = req.getParameter("bocnfm");
if( bocnfm == null){
	System.out.println(this.toString+" : bocnfm is null" );
}else{
	System.out.println(this.toString+" : bocnfm is "+bocnfm );
}
String subscnfmstat = req.getParameter("subscnfmstat");
if( subscnfmstat == null){
	System.out.println(this.toString+" : subscnfmstat is null" );
}else{
	System.out.println(this.toString+" : subscnfmstat is "+subscnfmstat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String date_flag = Util.checkString(req.getParameter("date_flag"));
String search_frdt = Util.checkString(req.getParameter("search_frdt"));
String search_todt = Util.checkString(req.getParameter("search_todt"));
String db_gubun = Util.checkString(req.getParameter("db_gubun"));
String agentnm = Util.checkString(req.getParameter("agentnm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String conn_gubun = Util.checkString(req.getParameter("conn_gubun"));
String bocnfm = Util.checkString(req.getParameter("bocnfm"));
String subscnfmstat = Util.checkString(req.getParameter("subscnfmstat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String date_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("date_flag")));
String search_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_frdt")));
String search_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_todt")));
String db_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("db_gubun")));
String agentnm = Util.Uni2Ksc(Util.checkString(req.getParameter("agentnm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String conn_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("conn_gubun")));
String bocnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfm")));
String subscnfmstat = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setDate_flag(date_flag);
dm.setSearch_frdt(search_frdt);
dm.setSearch_todt(search_todt);
dm.setDb_gubun(db_gubun);
dm.setAgentnm(agentnm);
dm.setRdrnm(rdrnm);
dm.setConn_gubun(conn_gubun);
dm.setBocnfm(bocnfm);
dm.setSubscnfmstat(subscnfmstat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 27 10:14:51 GMT 2014 */