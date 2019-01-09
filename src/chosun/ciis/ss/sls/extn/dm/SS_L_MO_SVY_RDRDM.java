/***************************************************************************************************
* 파일명 : SS_L_MO_SVY_RDRDM.java
* 기능 :  문자점검독자관리 설문에 해당하는 독자리스트를 보여준다.
* 작성일자 : 2015.12.03
* 작성자 : 장선희
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


public class SS_L_MO_SVY_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String basicdt;
	public String extntype1;
	public String bocfmyn;
	public String svy_stddt;
	public String svy_enddt;
	public String svynm;
	public String svyid;
	public String respyn;
	public String campnm;
	public String camptype;
	public String rdr_no;
	public String rdrnm;
	public String bschk;
	public String bosend;
	public long pageno;
	public long pagesize;

	public SS_L_MO_SVY_RDRDM(){}
	public SS_L_MO_SVY_RDRDM(String deptcd, String partcd, String areacd, String bocd, String basicdt, String extntype1, String bocfmyn, String svy_stddt, String svy_enddt, String svynm, String svyid, String respyn, String campnm, String camptype, String rdr_no, String rdrnm, String bschk, String bosend, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.basicdt = basicdt;
		this.extntype1 = extntype1;
		this.bocfmyn = bocfmyn;
		this.svy_stddt = svy_stddt;
		this.svy_enddt = svy_enddt;
		this.svynm = svynm;
		this.svyid = svyid;
		this.respyn = respyn;
		this.campnm = campnm;
		this.camptype = camptype;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.bschk = bschk;
		this.bosend = bosend;
		this.pageno = pageno;
		this.pagesize = pagesize;
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

	public void setBasicdt(String basicdt){
		this.basicdt = basicdt;
	}

	public void setExtntype1(String extntype1){
		this.extntype1 = extntype1;
	}

	public void setBocfmyn(String bocfmyn){
		this.bocfmyn = bocfmyn;
	}

	public void setSvy_stddt(String svy_stddt){
		this.svy_stddt = svy_stddt;
	}

	public void setSvy_enddt(String svy_enddt){
		this.svy_enddt = svy_enddt;
	}

	public void setSvynm(String svynm){
		this.svynm = svynm;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setRespyn(String respyn){
		this.respyn = respyn;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBschk(String bschk){
		this.bschk = bschk;
	}

	public void setBosend(String bosend){
		this.bosend = bosend;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
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

	public String getBasicdt(){
		return this.basicdt;
	}

	public String getExtntype1(){
		return this.extntype1;
	}

	public String getBocfmyn(){
		return this.bocfmyn;
	}

	public String getSvy_stddt(){
		return this.svy_stddt;
	}

	public String getSvy_enddt(){
		return this.svy_enddt;
	}

	public String getSvynm(){
		return this.svynm;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getRespyn(){
		return this.respyn;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBschk(){
		return this.bschk;
	}

	public String getBosend(){
		return this.bosend;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MO_SVY_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MO_SVY_RDRDM dm = (SS_L_MO_SVY_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.basicdt);
		cstmt.setString(8, dm.extntype1);
		cstmt.setString(9, dm.bocfmyn);
		cstmt.setString(10, dm.svy_stddt);
		cstmt.setString(11, dm.svy_enddt);
		cstmt.setString(12, dm.svynm);
		cstmt.setString(13, dm.svyid);
		cstmt.setString(14, dm.respyn);
		cstmt.setString(15, dm.campnm);
		cstmt.setString(16, dm.camptype);
		cstmt.setString(17, dm.rdr_no);
		cstmt.setString(18, dm.rdrnm);
		cstmt.setString(19, dm.bschk);
		cstmt.setString(20, dm.bosend);
		cstmt.setLong(21, dm.pageno);
		cstmt.setLong(22, dm.pagesize);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_MO_SVY_RDRDataSet();
	}



    public void print(){
        System.out.println("deptcd = " + getDeptcd());
        System.out.println("partcd = " + getPartcd());
        System.out.println("areacd = " + getAreacd());
        System.out.println("bocd = " + getBocd());
        System.out.println("basicdt = " + getBasicdt());
        System.out.println("extntype1 = " + getExtntype1());
        System.out.println("bocfmyn = " + getBocfmyn());
        System.out.println("svy_stddt = " + getSvy_stddt());
        System.out.println("svy_enddt = " + getSvy_enddt());
        System.out.println("svynm = " + getSvynm());
        System.out.println("svyid = " + getSvyid());
        System.out.println("respyn = " + getRespyn());
        System.out.println("campnm = " + getCampnm());
        System.out.println("camptype = " + getCamptype());
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("rdrnm = " + getRdrnm());
        System.out.println("bschk = " + getBschk());
        System.out.println("bosend = " + getBosend());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
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
String basicdt = req.getParameter("basicdt");
if( basicdt == null){
	System.out.println(this.toString+" : basicdt is null" );
}else{
	System.out.println(this.toString+" : basicdt is "+basicdt );
}
String extntype1 = req.getParameter("extntype1");
if( extntype1 == null){
	System.out.println(this.toString+" : extntype1 is null" );
}else{
	System.out.println(this.toString+" : extntype1 is "+extntype1 );
}
String bocfmyn = req.getParameter("bocfmyn");
if( bocfmyn == null){
	System.out.println(this.toString+" : bocfmyn is null" );
}else{
	System.out.println(this.toString+" : bocfmyn is "+bocfmyn );
}
String svy_stddt = req.getParameter("svy_stddt");
if( svy_stddt == null){
	System.out.println(this.toString+" : svy_stddt is null" );
}else{
	System.out.println(this.toString+" : svy_stddt is "+svy_stddt );
}
String svy_enddt = req.getParameter("svy_enddt");
if( svy_enddt == null){
	System.out.println(this.toString+" : svy_enddt is null" );
}else{
	System.out.println(this.toString+" : svy_enddt is "+svy_enddt );
}
String svynm = req.getParameter("svynm");
if( svynm == null){
	System.out.println(this.toString+" : svynm is null" );
}else{
	System.out.println(this.toString+" : svynm is "+svynm );
}
String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
}
String respyn = req.getParameter("respyn");
if( respyn == null){
	System.out.println(this.toString+" : respyn is null" );
}else{
	System.out.println(this.toString+" : respyn is "+respyn );
}
String campnm = req.getParameter("campnm");
if( campnm == null){
	System.out.println(this.toString+" : campnm is null" );
}else{
	System.out.println(this.toString+" : campnm is "+campnm );
}
String camptype = req.getParameter("camptype");
if( camptype == null){
	System.out.println(this.toString+" : camptype is null" );
}else{
	System.out.println(this.toString+" : camptype is "+camptype );
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
String bschk = req.getParameter("bschk");
if( bschk == null){
	System.out.println(this.toString+" : bschk is null" );
}else{
	System.out.println(this.toString+" : bschk is "+bschk );
}
String bosend = req.getParameter("bosend");
if( bosend == null){
	System.out.println(this.toString+" : bosend is null" );
}else{
	System.out.println(this.toString+" : bosend is "+bosend );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String basicdt = Util.checkString(req.getParameter("basicdt"));
String extntype1 = Util.checkString(req.getParameter("extntype1"));
String bocfmyn = Util.checkString(req.getParameter("bocfmyn"));
String svy_stddt = Util.checkString(req.getParameter("svy_stddt"));
String svy_enddt = Util.checkString(req.getParameter("svy_enddt"));
String svynm = Util.checkString(req.getParameter("svynm"));
String svyid = Util.checkString(req.getParameter("svyid"));
String respyn = Util.checkString(req.getParameter("respyn"));
String campnm = Util.checkString(req.getParameter("campnm"));
String camptype = Util.checkString(req.getParameter("camptype"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String bschk = Util.checkString(req.getParameter("bschk"));
String bosend = Util.checkString(req.getParameter("bosend"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String basicdt = Util.Uni2Ksc(Util.checkString(req.getParameter("basicdt")));
String extntype1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntype1")));
String bocfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocfmyn")));
String svy_stddt = Util.Uni2Ksc(Util.checkString(req.getParameter("svy_stddt")));
String svy_enddt = Util.Uni2Ksc(Util.checkString(req.getParameter("svy_enddt")));
String svynm = Util.Uni2Ksc(Util.checkString(req.getParameter("svynm")));
String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
String respyn = Util.Uni2Ksc(Util.checkString(req.getParameter("respyn")));
String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String bschk = Util.Uni2Ksc(Util.checkString(req.getParameter("bschk")));
String bosend = Util.Uni2Ksc(Util.checkString(req.getParameter("bosend")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBasicdt(basicdt);
dm.setExtntype1(extntype1);
dm.setBocfmyn(bocfmyn);
dm.setSvy_stddt(svy_stddt);
dm.setSvy_enddt(svy_enddt);
dm.setSvynm(svynm);
dm.setSvyid(svyid);
dm.setRespyn(respyn);
dm.setCampnm(campnm);
dm.setCamptype(camptype);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setBschk(bschk);
dm.setBosend(bosend);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 02 10:20:22 KST 2016 */