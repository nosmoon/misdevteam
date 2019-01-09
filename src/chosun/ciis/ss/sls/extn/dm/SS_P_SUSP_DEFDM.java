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


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_P_SUSP_DEFDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String def_type;
	public String rdrnm;
	public String agentnm;
	public String cns_stat;

	public SS_P_SUSP_DEFDM(){}
	public SS_P_SUSP_DEFDM(String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String def_type, String rdrnm, String agentnm, String cns_stat){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.def_type = def_type;
		this.rdrnm = rdrnm;
		this.agentnm = agentnm;
		this.cns_stat = cns_stat;
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

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDef_type(String def_type){
		this.def_type = def_type;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAgentnm(String agentnm){
		this.agentnm = agentnm;
	}

	public void setCns_stat(String cns_stat){
		this.cns_stat = cns_stat;
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

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDef_type(){
		return this.def_type;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getAgentnm(){
		return this.agentnm;
	}

	public String getCns_stat(){
		return this.cns_stat;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_P_SUSP_DEF(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_P_SUSP_DEFDM dm = (SS_P_SUSP_DEFDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.def_type);
		cstmt.setString(10, dm.rdrnm);
		cstmt.setString(11, dm.agentnm);
		cstmt.setString(12, dm.cns_stat);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_P_SUSP_DEFDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("def_type = [" + getDef_type() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("agentnm = [" + getAgentnm() + "]");
		System.out.println("cns_stat = [" + getCns_stat() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String def_type = req.getParameter("def_type");
if( def_type == null){
	System.out.println(this.toString+" : def_type is null" );
}else{
	System.out.println(this.toString+" : def_type is "+def_type );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String agentnm = req.getParameter("agentnm");
if( agentnm == null){
	System.out.println(this.toString+" : agentnm is null" );
}else{
	System.out.println(this.toString+" : agentnm is "+agentnm );
}
String cns_stat = req.getParameter("cns_stat");
if( cns_stat == null){
	System.out.println(this.toString+" : cns_stat is null" );
}else{
	System.out.println(this.toString+" : cns_stat is "+cns_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String def_type = Util.checkString(req.getParameter("def_type"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String agentnm = Util.checkString(req.getParameter("agentnm"));
String cns_stat = Util.checkString(req.getParameter("cns_stat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String def_type = Util.Uni2Ksc(Util.checkString(req.getParameter("def_type")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String agentnm = Util.Uni2Ksc(Util.checkString(req.getParameter("agentnm")));
String cns_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDef_type(def_type);
dm.setRdrnm(rdrnm);
dm.setAgentnm(agentnm);
dm.setCns_stat(cns_stat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 15:09:25 KST 2015 */