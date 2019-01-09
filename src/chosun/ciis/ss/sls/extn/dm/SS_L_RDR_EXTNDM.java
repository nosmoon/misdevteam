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


public class SS_L_RDR_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String corrbocd;
	public String rdr_extnbocd;
	public String fromtogb;
	public String fromdt;
	public String todt;
	public String extnflnm;
	public String aplcpersnm;
	public String pymtflnm;
	public String rdrnm;
	public String rdr_extntypecd;
	public String extnblngcd;
	public String medicd;
	public String aplcpathcd;
	public String bo_headcnfmyn;
	public String subscnfmstatcd;
	public long pageno;
	public long pagesize;
	public String incmgdt;
	public String suspyn;

	public SS_L_RDR_EXTNDM(){}
	public SS_L_RDR_EXTNDM(String deptcd, String partcd, String areacd, String corrbocd, String rdr_extnbocd, String fromtogb, String fromdt, String todt, String extnflnm, String aplcpersnm, String pymtflnm, String rdrnm, String rdr_extntypecd, String extnblngcd, String medicd, String aplcpathcd, String bo_headcnfmyn, String subscnfmstatcd, long pageno, long pagesize, String incmgdt, String suspyn){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.corrbocd = corrbocd;
		this.rdr_extnbocd = rdr_extnbocd;
		this.fromtogb = fromtogb;
		this.fromdt = fromdt;
		this.todt = todt;
		this.extnflnm = extnflnm;
		this.aplcpersnm = aplcpersnm;
		this.pymtflnm = pymtflnm;
		this.rdrnm = rdrnm;
		this.rdr_extntypecd = rdr_extntypecd;
		this.extnblngcd = extnblngcd;
		this.medicd = medicd;
		this.aplcpathcd = aplcpathcd;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.subscnfmstatcd = subscnfmstatcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.incmgdt = incmgdt;
		this.suspyn = suspyn;
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

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setRdr_extnbocd(String rdr_extnbocd){
		this.rdr_extnbocd = rdr_extnbocd;
	}

	public void setFromtogb(String fromtogb){
		this.fromtogb = fromtogb;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setPymtflnm(String pymtflnm){
		this.pymtflnm = pymtflnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setSuspyn(String suspyn){
		this.suspyn = suspyn;
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

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getRdr_extnbocd(){
		return this.rdr_extnbocd;
	}

	public String getFromtogb(){
		return this.fromtogb;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getPymtflnm(){
		return this.pymtflnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getSuspyn(){
		return this.suspyn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_RDR_EXTN(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTNDM dm = (SS_L_RDR_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.corrbocd);
		cstmt.setString(7, dm.rdr_extnbocd);
		cstmt.setString(8, dm.fromtogb);
		cstmt.setString(9, dm.fromdt);
		cstmt.setString(10, dm.todt);
		cstmt.setString(11, dm.extnflnm);
		cstmt.setString(12, dm.aplcpersnm);
		cstmt.setString(13, dm.pymtflnm);
		cstmt.setString(14, dm.rdrnm);
		cstmt.setString(15, dm.rdr_extntypecd);
		cstmt.setString(16, dm.extnblngcd);
		cstmt.setString(17, dm.medicd);
		cstmt.setString(18, dm.aplcpathcd);
		cstmt.setString(19, dm.bo_headcnfmyn);
		cstmt.setString(20, dm.subscnfmstatcd);
		cstmt.setLong(21, dm.pageno);
		cstmt.setLong(22, dm.pagesize);
		cstmt.setString(23, dm.incmgdt);
		cstmt.setString(24, dm.suspyn);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, Types.INTEGER);
		cstmt.registerOutParameter(27, Types.INTEGER);
		cstmt.registerOutParameter(28, Types.INTEGER);
		cstmt.registerOutParameter(29, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTNDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("corrbocd = [" + getCorrbocd() + "]");
		System.out.println("rdr_extnbocd = [" + getRdr_extnbocd() + "]");
		System.out.println("fromtogb = [" + getFromtogb() + "]");
		System.out.println("fromdt = [" + getFromdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("extnflnm = [" + getExtnflnm() + "]");
		System.out.println("aplcpersnm = [" + getAplcpersnm() + "]");
		System.out.println("pymtflnm = [" + getPymtflnm() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("rdr_extntypecd = [" + getRdr_extntypecd() + "]");
		System.out.println("extnblngcd = [" + getExtnblngcd() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("aplcpathcd = [" + getAplcpathcd() + "]");
		System.out.println("bo_headcnfmyn = [" + getBo_headcnfmyn() + "]");
		System.out.println("subscnfmstatcd = [" + getSubscnfmstatcd() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
		System.out.println("incmgdt = [" + getIncmgdt() + "]");
		System.out.println("suspyn = [" + getSuspyn() + "]");
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
String corrbocd = req.getParameter("corrbocd");
if( corrbocd == null){
	System.out.println(this.toString+" : corrbocd is null" );
}else{
	System.out.println(this.toString+" : corrbocd is "+corrbocd );
}
String rdr_extnbocd = req.getParameter("rdr_extnbocd");
if( rdr_extnbocd == null){
	System.out.println(this.toString+" : rdr_extnbocd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnbocd is "+rdr_extnbocd );
}
String fromtogb = req.getParameter("fromtogb");
if( fromtogb == null){
	System.out.println(this.toString+" : fromtogb is null" );
}else{
	System.out.println(this.toString+" : fromtogb is "+fromtogb );
}
String fromdt = req.getParameter("fromdt");
if( fromdt == null){
	System.out.println(this.toString+" : fromdt is null" );
}else{
	System.out.println(this.toString+" : fromdt is "+fromdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String extnflnm = req.getParameter("extnflnm");
if( extnflnm == null){
	System.out.println(this.toString+" : extnflnm is null" );
}else{
	System.out.println(this.toString+" : extnflnm is "+extnflnm );
}
String aplcpersnm = req.getParameter("aplcpersnm");
if( aplcpersnm == null){
	System.out.println(this.toString+" : aplcpersnm is null" );
}else{
	System.out.println(this.toString+" : aplcpersnm is "+aplcpersnm );
}
String pymtflnm = req.getParameter("pymtflnm");
if( pymtflnm == null){
	System.out.println(this.toString+" : pymtflnm is null" );
}else{
	System.out.println(this.toString+" : pymtflnm is "+pymtflnm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
String extnblngcd = req.getParameter("extnblngcd");
if( extnblngcd == null){
	System.out.println(this.toString+" : extnblngcd is null" );
}else{
	System.out.println(this.toString+" : extnblngcd is "+extnblngcd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String bo_headcnfmyn = req.getParameter("bo_headcnfmyn");
if( bo_headcnfmyn == null){
	System.out.println(this.toString+" : bo_headcnfmyn is null" );
}else{
	System.out.println(this.toString+" : bo_headcnfmyn is "+bo_headcnfmyn );
}
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
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
String incmgdt = req.getParameter("incmgdt");
if( incmgdt == null){
	System.out.println(this.toString+" : incmgdt is null" );
}else{
	System.out.println(this.toString+" : incmgdt is "+incmgdt );
}
String suspyn = req.getParameter("suspyn");
if( suspyn == null){
	System.out.println(this.toString+" : suspyn is null" );
}else{
	System.out.println(this.toString+" : suspyn is "+suspyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String corrbocd = Util.checkString(req.getParameter("corrbocd"));
String rdr_extnbocd = Util.checkString(req.getParameter("rdr_extnbocd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String aplcpersnm = Util.checkString(req.getParameter("aplcpersnm"));
String pymtflnm = Util.checkString(req.getParameter("pymtflnm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String extnblngcd = Util.checkString(req.getParameter("extnblngcd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String incmgdt = Util.checkString(req.getParameter("incmgdt"));
String suspyn = Util.checkString(req.getParameter("suspyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
String rdr_extnbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbocd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
String suspyn = Util.Uni2Ksc(Util.checkString(req.getParameter("suspyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setCorrbocd(corrbocd);
dm.setRdr_extnbocd(rdr_extnbocd);
dm.setFromtogb(fromtogb);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setExtnflnm(extnflnm);
dm.setAplcpersnm(aplcpersnm);
dm.setPymtflnm(pymtflnm);
dm.setRdrnm(rdrnm);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setExtnblngcd(extnblngcd);
dm.setMedicd(medicd);
dm.setAplcpathcd(aplcpathcd);
dm.setBo_headcnfmyn(bo_headcnfmyn);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setIncmgdt(incmgdt);
dm.setSuspyn(suspyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 16:29:13 KST 2015 */