/***************************************************************************************************
* 파일명 : SS_L_POSTDLVRDRDM.java
* 기능 : 독자관리 우송독자관리 조회 
* 작성일자 : 2015-06-17
* 작성자 : 장선희 
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


public class SS_L_POSTDLVRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String dlvzip;
	public String bocd;
	public String rdr_no;
	public String rdrnm;
	public String modiyn;

	public SS_L_POSTDLVRDRDM(){}
	public SS_L_POSTDLVRDRDM(String deptcd, String partcd, String areacd, String dlvzip, String bocd, String rdr_no, String rdrnm, String modiyn){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.dlvzip = dlvzip;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.modiyn = modiyn;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setModiyn(String modiyn){
		this.modiyn = modiyn;
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

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getModiyn(){
		return this.modiyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_POSTDLVRDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_POSTDLVRDRDM dm = (SS_L_POSTDLVRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.dlvzip);
		cstmt.setString(7, dm.bocd);
		cstmt.setString(8, dm.rdr_no);
		cstmt.setString(9, dm.rdrnm);
		cstmt.setString(10, dm.modiyn);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_POSTDLVRDRDataSet();
	}



    public void print(){
        System.out.println("team_cd = " + getDeptcd());
        System.out.println("part_cd = " + getPartcd());
        System.out.println("area_cd = " + getAreacd());
        System.out.println("dlvzip = " + getDlvzip());
        System.out.println("bocd = " + getBocd());
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("rdrnm = " + getRdrnm());
        System.out.println("modiyn = " + getModiyn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String modiyn = req.getParameter("modiyn");
if( modiyn == null){
	System.out.println(this.toString+" : modiyn is null" );
}else{
	System.out.println(this.toString+" : modiyn is "+modiyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String modiyn = Util.checkString(req.getParameter("modiyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String modiyn = Util.Uni2Ksc(Util.checkString(req.getParameter("modiyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setZipcode(zipcode);
dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setModiyn(modiyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 09:50:03 KST 2015 */