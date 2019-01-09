/***************************************************************************************************
* 파일명 : SL_A_VSDM.java
* 기능 : 독자-VacationStop관리-등록,수정,삭제
* 작성일자 : 2004-04-01
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
 * 독자-VacationStop관리-등록,수정,삭제
 *
 */

public class SL_A_VSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String userflag;
	public String regdt;
	public String regno;
	public String rdr_no;
	public String medicd;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String bocd;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String qty;
	public String aplcpathcd;
	public String clsfcd;
	public String suspfrdt;
	public String susptodt;
	public String bgnmappli;
	public String endmappli;
	public String spcfdlvdt;
	public String remk;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String vaca_areadlvfrdt;
	public String vaca_areadlvtodt;
	public String vaca_arearegncd;
	public String vaca_areacd;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;
	public String vaca_areabocd;
	public String bocnfmyn;
	public String boremk;
	public String vaca_areadlvofficnfmyn;
	public String vaca_areadlvoffiremk;
	public String cns_empid;
	public String cns_empnm;
	public String cns_empcnfmyn;
	public String procclsfcd;
	public String cns_empremk;

	public SL_A_VSDM(){}
	public SL_A_VSDM(String incmgpers, String accflag, String userflag, String regdt, String regno, String rdr_no, String medicd, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String bocd, String dlvzip, String dlvaddr, String dlvdtlsaddr, String qty, String aplcpathcd, String clsfcd, String suspfrdt, String susptodt, String bgnmappli, String endmappli, String spcfdlvdt, String remk, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String vaca_areadlvfrdt, String vaca_areadlvtodt, String vaca_arearegncd, String vaca_areacd, String vaca_areazip, String vaca_areaaddr, String vaca_areadtlsaddr, String vaca_areabocd, String bocnfmyn, String boremk, String vaca_areadlvofficnfmyn, String vaca_areadlvoffiremk, String cns_empid, String cns_empnm, String cns_empcnfmyn, String procclsfcd, String cns_empremk){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.userflag = userflag;
		this.regdt = regdt;
		this.regno = regno;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.bocd = bocd;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.qty = qty;
		this.aplcpathcd = aplcpathcd;
		this.clsfcd = clsfcd;
		this.suspfrdt = suspfrdt;
		this.susptodt = susptodt;
		this.bgnmappli = bgnmappli;
		this.endmappli = endmappli;
		this.spcfdlvdt = spcfdlvdt;
		this.remk = remk;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
		this.vaca_areadlvtodt = vaca_areadlvtodt;
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_areacd = vaca_areacd;
		this.vaca_areazip = vaca_areazip;
		this.vaca_areaaddr = vaca_areaaddr;
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
		this.vaca_areabocd = vaca_areabocd;
		this.bocnfmyn = bocnfmyn;
		this.boremk = boremk;
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
		this.vaca_areadlvoffiremk = vaca_areadlvoffiremk;
		this.cns_empid = cns_empid;
		this.cns_empnm = cns_empnm;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.procclsfcd = procclsfcd;
		this.cns_empremk = cns_empremk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setUserflag(String userflag){
		this.userflag = userflag;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setBgnmappli(String bgnmappli){
		this.bgnmappli = bgnmappli;
	}

	public void setEndmappli(String endmappli){
		this.endmappli = endmappli;
	}

	public void setSpcfdlvdt(String spcfdlvdt){
		this.spcfdlvdt = spcfdlvdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setVaca_areadlvfrdt(String vaca_areadlvfrdt){
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
	}

	public void setVaca_areadlvtodt(String vaca_areadlvtodt){
		this.vaca_areadlvtodt = vaca_areadlvtodt;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setVaca_areabocd(String vaca_areabocd){
		this.vaca_areabocd = vaca_areabocd;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoremk(String boremk){
		this.boremk = boremk;
	}

	public void setVaca_areadlvofficnfmyn(String vaca_areadlvofficnfmyn){
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
	}

	public void setVaca_areadlvoffiremk(String vaca_areadlvoffiremk){
		this.vaca_areadlvoffiremk = vaca_areadlvoffiremk;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empcnfmyn(String cns_empcnfmyn){
		this.cns_empcnfmyn = cns_empcnfmyn;
	}

	public void setProcclsfcd(String procclsfcd){
		this.procclsfcd = procclsfcd;
	}

	public void setCns_empremk(String cns_empremk){
		this.cns_empremk = cns_empremk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getUserflag(){
		return this.userflag;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getBgnmappli(){
		return this.bgnmappli;
	}

	public String getEndmappli(){
		return this.endmappli;
	}

	public String getSpcfdlvdt(){
		return this.spcfdlvdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getVaca_areadlvfrdt(){
		return this.vaca_areadlvfrdt;
	}

	public String getVaca_areadlvtodt(){
		return this.vaca_areadlvtodt;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public String getVaca_areabocd(){
		return this.vaca_areabocd;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getBoremk(){
		return this.boremk;
	}

	public String getVaca_areadlvofficnfmyn(){
		return this.vaca_areadlvofficnfmyn;
	}

	public String getVaca_areadlvoffiremk(){
		return this.vaca_areadlvoffiremk;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empcnfmyn(){
		return this.cns_empcnfmyn;
	}

	public String getProcclsfcd(){
		return this.procclsfcd;
	}

	public String getCns_empremk(){
		return this.cns_empremk;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_VS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_VSDM dm = (SL_A_VSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.userflag);
		cstmt.setString(6, dm.regdt);
		cstmt.setString(7, dm.regno);
		cstmt.setString(8, dm.rdr_no);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.rdrnm);
		cstmt.setString(11, dm.rdrtel_no1);
		cstmt.setString(12, dm.rdrtel_no2);
		cstmt.setString(13, dm.rdrtel_no3);
		cstmt.setString(14, dm.bocd);
		cstmt.setString(15, dm.dlvzip);
		cstmt.setString(16, dm.dlvaddr);
		cstmt.setString(17, dm.dlvdtlsaddr);
		cstmt.setString(18, dm.qty);
		cstmt.setString(19, dm.aplcpathcd);
		cstmt.setString(20, dm.clsfcd);
		cstmt.setString(21, dm.suspfrdt);
		cstmt.setString(22, dm.susptodt);
		cstmt.setString(23, dm.bgnmappli);
		cstmt.setString(24, dm.endmappli);
		cstmt.setString(25, dm.spcfdlvdt);
		cstmt.setString(26, dm.remk);
		cstmt.setString(27, dm.rdrptph_no1);
		cstmt.setString(28, dm.rdrptph_no2);
		cstmt.setString(29, dm.rdrptph_no3);
		cstmt.setString(30, dm.vaca_areadlvfrdt);
		cstmt.setString(31, dm.vaca_areadlvtodt);
		cstmt.setString(32, dm.vaca_arearegncd);
		cstmt.setString(33, dm.vaca_areacd);
		cstmt.setString(34, dm.vaca_areazip);
		cstmt.setString(35, dm.vaca_areaaddr);
		cstmt.setString(36, dm.vaca_areadtlsaddr);
		cstmt.setString(37, dm.vaca_areabocd);
		cstmt.setString(38, dm.bocnfmyn);
		cstmt.setString(39, dm.boremk);
		cstmt.setString(40, dm.vaca_areadlvofficnfmyn);
		cstmt.setString(41, dm.vaca_areadlvoffiremk);
		cstmt.setString(42, dm.cns_empid);
		cstmt.setString(43, dm.cns_empnm);
		cstmt.setString(44, dm.cns_empcnfmyn);
		cstmt.setString(45, dm.procclsfcd);
		cstmt.setString(46, dm.cns_empremk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_VSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String userflag = req.getParameter("userflag");
if( userflag == null){
	System.out.println(this.toString+" : userflag is null" );
}else{
	System.out.println(this.toString+" : userflag is "+userflag );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel_no1 = req.getParameter("rdrtel_no1");
if( rdrtel_no1 == null){
	System.out.println(this.toString+" : rdrtel_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no1 is "+rdrtel_no1 );
}
String rdrtel_no2 = req.getParameter("rdrtel_no2");
if( rdrtel_no2 == null){
	System.out.println(this.toString+" : rdrtel_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no2 is "+rdrtel_no2 );
}
String rdrtel_no3 = req.getParameter("rdrtel_no3");
if( rdrtel_no3 == null){
	System.out.println(this.toString+" : rdrtel_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no3 is "+rdrtel_no3 );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String clsfcd = req.getParameter("clsfcd");
if( clsfcd == null){
	System.out.println(this.toString+" : clsfcd is null" );
}else{
	System.out.println(this.toString+" : clsfcd is "+clsfcd );
}
String suspfrdt = req.getParameter("suspfrdt");
if( suspfrdt == null){
	System.out.println(this.toString+" : suspfrdt is null" );
}else{
	System.out.println(this.toString+" : suspfrdt is "+suspfrdt );
}
String susptodt = req.getParameter("susptodt");
if( susptodt == null){
	System.out.println(this.toString+" : susptodt is null" );
}else{
	System.out.println(this.toString+" : susptodt is "+susptodt );
}
String bgnmappli = req.getParameter("bgnmappli");
if( bgnmappli == null){
	System.out.println(this.toString+" : bgnmappli is null" );
}else{
	System.out.println(this.toString+" : bgnmappli is "+bgnmappli );
}
String endmappli = req.getParameter("endmappli");
if( endmappli == null){
	System.out.println(this.toString+" : endmappli is null" );
}else{
	System.out.println(this.toString+" : endmappli is "+endmappli );
}
String spcfdlvdt = req.getParameter("spcfdlvdt");
if( spcfdlvdt == null){
	System.out.println(this.toString+" : spcfdlvdt is null" );
}else{
	System.out.println(this.toString+" : spcfdlvdt is "+spcfdlvdt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String rdrptph_no1 = req.getParameter("rdrptph_no1");
if( rdrptph_no1 == null){
	System.out.println(this.toString+" : rdrptph_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no1 is "+rdrptph_no1 );
}
String rdrptph_no2 = req.getParameter("rdrptph_no2");
if( rdrptph_no2 == null){
	System.out.println(this.toString+" : rdrptph_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no2 is "+rdrptph_no2 );
}
String rdrptph_no3 = req.getParameter("rdrptph_no3");
if( rdrptph_no3 == null){
	System.out.println(this.toString+" : rdrptph_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no3 is "+rdrptph_no3 );
}
String vaca_areadlvfrdt = req.getParameter("vaca_areadlvfrdt");
if( vaca_areadlvfrdt == null){
	System.out.println(this.toString+" : vaca_areadlvfrdt is null" );
}else{
	System.out.println(this.toString+" : vaca_areadlvfrdt is "+vaca_areadlvfrdt );
}
String vaca_areadlvtodt = req.getParameter("vaca_areadlvtodt");
if( vaca_areadlvtodt == null){
	System.out.println(this.toString+" : vaca_areadlvtodt is null" );
}else{
	System.out.println(this.toString+" : vaca_areadlvtodt is "+vaca_areadlvtodt );
}
String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
}
String vaca_areacd = req.getParameter("vaca_areacd");
if( vaca_areacd == null){
	System.out.println(this.toString+" : vaca_areacd is null" );
}else{
	System.out.println(this.toString+" : vaca_areacd is "+vaca_areacd );
}
String vaca_areazip = req.getParameter("vaca_areazip");
if( vaca_areazip == null){
	System.out.println(this.toString+" : vaca_areazip is null" );
}else{
	System.out.println(this.toString+" : vaca_areazip is "+vaca_areazip );
}
String vaca_areaaddr = req.getParameter("vaca_areaaddr");
if( vaca_areaaddr == null){
	System.out.println(this.toString+" : vaca_areaaddr is null" );
}else{
	System.out.println(this.toString+" : vaca_areaaddr is "+vaca_areaaddr );
}
String vaca_areadtlsaddr = req.getParameter("vaca_areadtlsaddr");
if( vaca_areadtlsaddr == null){
	System.out.println(this.toString+" : vaca_areadtlsaddr is null" );
}else{
	System.out.println(this.toString+" : vaca_areadtlsaddr is "+vaca_areadtlsaddr );
}
String vaca_areabocd = req.getParameter("vaca_areabocd");
if( vaca_areabocd == null){
	System.out.println(this.toString+" : vaca_areabocd is null" );
}else{
	System.out.println(this.toString+" : vaca_areabocd is "+vaca_areabocd );
}
String bocnfmyn = req.getParameter("bocnfmyn");
if( bocnfmyn == null){
	System.out.println(this.toString+" : bocnfmyn is null" );
}else{
	System.out.println(this.toString+" : bocnfmyn is "+bocnfmyn );
}
String boremk = req.getParameter("boremk");
if( boremk == null){
	System.out.println(this.toString+" : boremk is null" );
}else{
	System.out.println(this.toString+" : boremk is "+boremk );
}
String vaca_areadlvofficnfmyn = req.getParameter("vaca_areadlvofficnfmyn");
if( vaca_areadlvofficnfmyn == null){
	System.out.println(this.toString+" : vaca_areadlvofficnfmyn is null" );
}else{
	System.out.println(this.toString+" : vaca_areadlvofficnfmyn is "+vaca_areadlvofficnfmyn );
}
String vaca_areadlvoffiremk = req.getParameter("vaca_areadlvoffiremk");
if( vaca_areadlvoffiremk == null){
	System.out.println(this.toString+" : vaca_areadlvoffiremk is null" );
}else{
	System.out.println(this.toString+" : vaca_areadlvoffiremk is "+vaca_areadlvoffiremk );
}
String cns_empid = req.getParameter("cns_empid");
if( cns_empid == null){
	System.out.println(this.toString+" : cns_empid is null" );
}else{
	System.out.println(this.toString+" : cns_empid is "+cns_empid );
}
String cns_empnm = req.getParameter("cns_empnm");
if( cns_empnm == null){
	System.out.println(this.toString+" : cns_empnm is null" );
}else{
	System.out.println(this.toString+" : cns_empnm is "+cns_empnm );
}
String cns_empcnfmyn = req.getParameter("cns_empcnfmyn");
if( cns_empcnfmyn == null){
	System.out.println(this.toString+" : cns_empcnfmyn is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmyn is "+cns_empcnfmyn );
}
String procclsfcd = req.getParameter("procclsfcd");
if( procclsfcd == null){
	System.out.println(this.toString+" : procclsfcd is null" );
}else{
	System.out.println(this.toString+" : procclsfcd is "+procclsfcd );
}
String cns_empremk = req.getParameter("cns_empremk");
if( cns_empremk == null){
	System.out.println(this.toString+" : cns_empremk is null" );
}else{
	System.out.println(this.toString+" : cns_empremk is "+cns_empremk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String userflag = Util.checkString(req.getParameter("userflag"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String bocd = Util.checkString(req.getParameter("bocd"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String qty = Util.checkString(req.getParameter("qty"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String clsfcd = Util.checkString(req.getParameter("clsfcd"));
String suspfrdt = Util.checkString(req.getParameter("suspfrdt"));
String susptodt = Util.checkString(req.getParameter("susptodt"));
String bgnmappli = Util.checkString(req.getParameter("bgnmappli"));
String endmappli = Util.checkString(req.getParameter("endmappli"));
String spcfdlvdt = Util.checkString(req.getParameter("spcfdlvdt"));
String remk = Util.checkString(req.getParameter("remk"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String vaca_areadlvfrdt = Util.checkString(req.getParameter("vaca_areadlvfrdt"));
String vaca_areadlvtodt = Util.checkString(req.getParameter("vaca_areadlvtodt"));
String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
String vaca_areazip = Util.checkString(req.getParameter("vaca_areazip"));
String vaca_areaaddr = Util.checkString(req.getParameter("vaca_areaaddr"));
String vaca_areadtlsaddr = Util.checkString(req.getParameter("vaca_areadtlsaddr"));
String vaca_areabocd = Util.checkString(req.getParameter("vaca_areabocd"));
String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));
String boremk = Util.checkString(req.getParameter("boremk"));
String vaca_areadlvofficnfmyn = Util.checkString(req.getParameter("vaca_areadlvofficnfmyn"));
String vaca_areadlvoffiremk = Util.checkString(req.getParameter("vaca_areadlvoffiremk"));
String cns_empid = Util.checkString(req.getParameter("cns_empid"));
String cns_empnm = Util.checkString(req.getParameter("cns_empnm"));
String cns_empcnfmyn = Util.checkString(req.getParameter("cns_empcnfmyn"));
String procclsfcd = Util.checkString(req.getParameter("procclsfcd"));
String cns_empremk = Util.checkString(req.getParameter("cns_empremk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String userflag = Util.Uni2Ksc(Util.checkString(req.getParameter("userflag")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfcd")));
String suspfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspfrdt")));
String susptodt = Util.Uni2Ksc(Util.checkString(req.getParameter("susptodt")));
String bgnmappli = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnmappli")));
String endmappli = Util.Uni2Ksc(Util.checkString(req.getParameter("endmappli")));
String spcfdlvdt = Util.Uni2Ksc(Util.checkString(req.getParameter("spcfdlvdt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String vaca_areadlvfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvfrdt")));
String vaca_areadlvtodt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvtodt")));
String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
String vaca_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areacd")));
String vaca_areazip = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areazip")));
String vaca_areaaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areaaddr")));
String vaca_areadtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadtlsaddr")));
String vaca_areabocd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areabocd")));
String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
String boremk = Util.Uni2Ksc(Util.checkString(req.getParameter("boremk")));
String vaca_areadlvofficnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvofficnfmyn")));
String vaca_areadlvoffiremk = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvoffiremk")));
String cns_empid = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empid")));
String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
String cns_empcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmyn")));
String procclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("procclsfcd")));
String cns_empremk = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empremk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setUserflag(userflag);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setRdrnm(rdrnm);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setBocd(bocd);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setQty(qty);
dm.setAplcpathcd(aplcpathcd);
dm.setClsfcd(clsfcd);
dm.setSuspfrdt(suspfrdt);
dm.setSusptodt(susptodt);
dm.setBgnmappli(bgnmappli);
dm.setEndmappli(endmappli);
dm.setSpcfdlvdt(spcfdlvdt);
dm.setRemk(remk);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setVaca_areadlvfrdt(vaca_areadlvfrdt);
dm.setVaca_areadlvtodt(vaca_areadlvtodt);
dm.setVaca_arearegncd(vaca_arearegncd);
dm.setVaca_areacd(vaca_areacd);
dm.setVaca_areazip(vaca_areazip);
dm.setVaca_areaaddr(vaca_areaaddr);
dm.setVaca_areadtlsaddr(vaca_areadtlsaddr);
dm.setVaca_areabocd(vaca_areabocd);
dm.setBocnfmyn(bocnfmyn);
dm.setBoremk(boremk);
dm.setVaca_areadlvofficnfmyn(vaca_areadlvofficnfmyn);
dm.setVaca_areadlvoffiremk(vaca_areadlvoffiremk);
dm.setCns_empid(cns_empid);
dm.setCns_empnm(cns_empnm);
dm.setCns_empcnfmyn(cns_empcnfmyn);
dm.setProcclsfcd(procclsfcd);
dm.setCns_empremk(cns_empremk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 01 13:54:44 KST 2004 */