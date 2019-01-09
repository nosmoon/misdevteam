/***************************************************************************************************
 * 파일명   : SP_SS_I_CAMP_EXTN.java
 * 기능     : 캠페인확장
 * 작성일자 : 2005/05/26
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.rec.*;

/**
 * 캠페인확장
 */

public class SS_I_CAMP_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String jobflag;
	public String accflag;
	public String dt;
	public String no;
	public String rshpclsfcd;
	public String aplcpersnm;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String aplcpersemail;
	public String aplcpersptph_no1;
	public String aplcpersptph_no2;
	public String aplcpersptph_no3;
	public String aplcperszip;
	public String aplcpersaddr;
	public String aplcpersdtlsaddr;
	public String rdr_no;
	public String rdrnm;
	public String natncd;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdremail;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String movmresiclsf;
	public String movmresitype;
	public String movmdt;
	public String medicd;
	public String qty;
	public String dlvhopedt;
	public String bocd;
	public String bocd2;
	public String resiclsfcd;
	public String resitypecd;
	public String dscttypecd;
	public String titl;
	public String cont;
	public String clsfcd;
	public String suspfrdt;
	public String susptodt;
	public String vaca_arearegncd;
	public String vaca_areacd;
	public String uid;
	public String nm;
	public String remk;
	public String cnscnfmyn;
	public String cnscnfmcd;
	public String camptypecd;
	public String campid;

	public SS_I_CAMP_EXTNDM(){}
	public SS_I_CAMP_EXTNDM(String jobflag, String accflag, String dt, String no, String rshpclsfcd, String aplcpersnm, String aplcperstel_no1, String aplcperstel_no2, String aplcperstel_no3, String aplcpersemail, String aplcpersptph_no1, String aplcpersptph_no2, String aplcpersptph_no3, String aplcperszip, String aplcpersaddr, String aplcpersdtlsaddr, String rdr_no, String rdrnm, String natncd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdremail, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String movmresiclsf, String movmresitype, String movmdt, String medicd, String qty, String dlvhopedt, String bocd, String bocd2, String resiclsfcd, String resitypecd, String dscttypecd, String titl, String cont, String clsfcd, String suspfrdt, String susptodt, String vaca_arearegncd, String vaca_areacd, String uid, String nm, String remk, String cnscnfmyn, String cnscnfmcd, String camptypecd, String campid){
		this.jobflag = jobflag;
		this.accflag = accflag;
		this.dt = dt;
		this.no = no;
		this.rshpclsfcd = rshpclsfcd;
		this.aplcpersnm = aplcpersnm;
		this.aplcperstel_no1 = aplcperstel_no1;
		this.aplcperstel_no2 = aplcperstel_no2;
		this.aplcperstel_no3 = aplcperstel_no3;
		this.aplcpersemail = aplcpersemail;
		this.aplcpersptph_no1 = aplcpersptph_no1;
		this.aplcpersptph_no2 = aplcpersptph_no2;
		this.aplcpersptph_no3 = aplcpersptph_no3;
		this.aplcperszip = aplcperszip;
		this.aplcpersaddr = aplcpersaddr;
		this.aplcpersdtlsaddr = aplcpersdtlsaddr;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.natncd = natncd;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdremail = rdremail;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.movmresiclsf = movmresiclsf;
		this.movmresitype = movmresitype;
		this.movmdt = movmdt;
		this.medicd = medicd;
		this.qty = qty;
		this.dlvhopedt = dlvhopedt;
		this.bocd = bocd;
		this.bocd2 = bocd2;
		this.resiclsfcd = resiclsfcd;
		this.resitypecd = resitypecd;
		this.dscttypecd = dscttypecd;
		this.titl = titl;
		this.cont = cont;
		this.clsfcd = clsfcd;
		this.suspfrdt = suspfrdt;
		this.susptodt = susptodt;
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_areacd = vaca_areacd;
		this.uid = uid;
		this.nm = nm;
		this.remk = remk;
		this.cnscnfmyn = cnscnfmyn;
		this.cnscnfmcd = cnscnfmcd;
		this.camptypecd = camptypecd;
		this.campid = campid;
	}

	public void setJobflag(String jobflag){
		this.jobflag = jobflag;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setNo(String no){
		this.no = no;
	}

	public void setRshpclsfcd(String rshpclsfcd){
		this.rshpclsfcd = rshpclsfcd;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setAplcperstel_no1(String aplcperstel_no1){
		this.aplcperstel_no1 = aplcperstel_no1;
	}

	public void setAplcperstel_no2(String aplcperstel_no2){
		this.aplcperstel_no2 = aplcperstel_no2;
	}

	public void setAplcperstel_no3(String aplcperstel_no3){
		this.aplcperstel_no3 = aplcperstel_no3;
	}

	public void setAplcpersemail(String aplcpersemail){
		this.aplcpersemail = aplcpersemail;
	}

	public void setAplcpersptph_no1(String aplcpersptph_no1){
		this.aplcpersptph_no1 = aplcpersptph_no1;
	}

	public void setAplcpersptph_no2(String aplcpersptph_no2){
		this.aplcpersptph_no2 = aplcpersptph_no2;
	}

	public void setAplcpersptph_no3(String aplcpersptph_no3){
		this.aplcpersptph_no3 = aplcpersptph_no3;
	}

	public void setAplcperszip(String aplcperszip){
		this.aplcperszip = aplcperszip;
	}

	public void setAplcpersaddr(String aplcpersaddr){
		this.aplcpersaddr = aplcpersaddr;
	}

	public void setAplcpersdtlsaddr(String aplcpersdtlsaddr){
		this.aplcpersdtlsaddr = aplcpersdtlsaddr;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setNatncd(String natncd){
		this.natncd = natncd;
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

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setMovmresiclsf(String movmresiclsf){
		this.movmresiclsf = movmresiclsf;
	}

	public void setMovmresitype(String movmresitype){
		this.movmresitype = movmresitype;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBocd2(String bocd2){
		this.bocd2 = bocd2;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
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

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCnscnfmyn(String cnscnfmyn){
		this.cnscnfmyn = cnscnfmyn;
	}

	public void setCnscnfmcd(String cnscnfmcd){
		this.cnscnfmcd = cnscnfmcd;
	}

	public void setCamptypecd(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public String getJobflag(){
		return this.jobflag;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getDt(){
		return this.dt;
	}

	public String getNo(){
		return this.no;
	}

	public String getRshpclsfcd(){
		return this.rshpclsfcd;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getAplcperstel_no1(){
		return this.aplcperstel_no1;
	}

	public String getAplcperstel_no2(){
		return this.aplcperstel_no2;
	}

	public String getAplcperstel_no3(){
		return this.aplcperstel_no3;
	}

	public String getAplcpersemail(){
		return this.aplcpersemail;
	}

	public String getAplcpersptph_no1(){
		return this.aplcpersptph_no1;
	}

	public String getAplcpersptph_no2(){
		return this.aplcpersptph_no2;
	}

	public String getAplcpersptph_no3(){
		return this.aplcpersptph_no3;
	}

	public String getAplcperszip(){
		return this.aplcperszip;
	}

	public String getAplcpersaddr(){
		return this.aplcpersaddr;
	}

	public String getAplcpersdtlsaddr(){
		return this.aplcpersdtlsaddr;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getNatncd(){
		return this.natncd;
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

	public String getRdremail(){
		return this.rdremail;
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

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getMovmresiclsf(){
		return this.movmresiclsf;
	}

	public String getMovmresitype(){
		return this.movmresitype;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBocd2(){
		return this.bocd2;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
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

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getNm(){
		return this.nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCnscnfmyn(){
		return this.cnscnfmyn;
	}

	public String getCnscnfmcd(){
		return this.cnscnfmcd;
	}

	public String getCamptypecd(){
		return this.camptypecd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_CAMP_EXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_CAMP_EXTNDM dm = (SS_I_CAMP_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.jobflag);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.dt);
		cstmt.setString(6, dm.no);
		cstmt.setString(7, dm.rshpclsfcd);
		cstmt.setString(8, dm.aplcpersnm);
		cstmt.setString(9, dm.aplcperstel_no1);
		cstmt.setString(10, dm.aplcperstel_no2);
		cstmt.setString(11, dm.aplcperstel_no3);
		cstmt.setString(12, dm.aplcpersemail);
		cstmt.setString(13, dm.aplcpersptph_no1);
		cstmt.setString(14, dm.aplcpersptph_no2);
		cstmt.setString(15, dm.aplcpersptph_no3);
		cstmt.setString(16, dm.aplcperszip);
		cstmt.setString(17, dm.aplcpersaddr);
		cstmt.setString(18, dm.aplcpersdtlsaddr);
		cstmt.setString(19, dm.rdr_no);
		cstmt.setString(20, dm.rdrnm);
		cstmt.setString(21, dm.natncd);
		cstmt.setString(22, dm.rdrtel_no1);
		cstmt.setString(23, dm.rdrtel_no2);
		cstmt.setString(24, dm.rdrtel_no3);
		cstmt.setString(25, dm.rdremail);
		cstmt.setString(26, dm.rdrptph_no1);
		cstmt.setString(27, dm.rdrptph_no2);
		cstmt.setString(28, dm.rdrptph_no3);
		cstmt.setString(29, dm.dlvzip);
		cstmt.setString(30, dm.dlvaddr);
		cstmt.setString(31, dm.dlvdtlsaddr);
		cstmt.setString(32, dm.movmresiclsf);
		cstmt.setString(33, dm.movmresitype);
		cstmt.setString(34, dm.movmdt);
		cstmt.setString(35, dm.medicd);
		cstmt.setString(36, dm.qty);
		cstmt.setString(37, dm.dlvhopedt);
		cstmt.setString(38, dm.bocd);
		cstmt.setString(39, dm.bocd2);
		cstmt.setString(40, dm.resiclsfcd);
		cstmt.setString(41, dm.resitypecd);
		cstmt.setString(42, dm.dscttypecd);
		cstmt.setString(43, dm.titl);
		cstmt.setString(44, dm.cont);
		cstmt.setString(45, dm.clsfcd);
		cstmt.setString(46, dm.suspfrdt);
		cstmt.setString(47, dm.susptodt);
		cstmt.setString(48, dm.vaca_arearegncd);
		cstmt.setString(49, dm.vaca_areacd);
		cstmt.setString(50, dm.uid);
		cstmt.setString(51, dm.nm);
		cstmt.setString(52, dm.remk);
		cstmt.setString(53, dm.cnscnfmyn);
		cstmt.setString(54, dm.cnscnfmcd);
		cstmt.setString(55, dm.camptypecd);
		cstmt.setString(56, dm.campid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.camp.ds.SS_I_CAMP_EXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String jobflag = req.getParameter("jobflag");
if( jobflag == null){
	System.out.println(this.toString+" : jobflag is null" );
}else{
	System.out.println(this.toString+" : jobflag is "+jobflag );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String no = req.getParameter("no");
if( no == null){
	System.out.println(this.toString+" : no is null" );
}else{
	System.out.println(this.toString+" : no is "+no );
}
String rshpclsfcd = req.getParameter("rshpclsfcd");
if( rshpclsfcd == null){
	System.out.println(this.toString+" : rshpclsfcd is null" );
}else{
	System.out.println(this.toString+" : rshpclsfcd is "+rshpclsfcd );
}
String aplcpersnm = req.getParameter("aplcpersnm");
if( aplcpersnm == null){
	System.out.println(this.toString+" : aplcpersnm is null" );
}else{
	System.out.println(this.toString+" : aplcpersnm is "+aplcpersnm );
}
String aplcperstel_no1 = req.getParameter("aplcperstel_no1");
if( aplcperstel_no1 == null){
	System.out.println(this.toString+" : aplcperstel_no1 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no1 is "+aplcperstel_no1 );
}
String aplcperstel_no2 = req.getParameter("aplcperstel_no2");
if( aplcperstel_no2 == null){
	System.out.println(this.toString+" : aplcperstel_no2 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no2 is "+aplcperstel_no2 );
}
String aplcperstel_no3 = req.getParameter("aplcperstel_no3");
if( aplcperstel_no3 == null){
	System.out.println(this.toString+" : aplcperstel_no3 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no3 is "+aplcperstel_no3 );
}
String aplcpersemail = req.getParameter("aplcpersemail");
if( aplcpersemail == null){
	System.out.println(this.toString+" : aplcpersemail is null" );
}else{
	System.out.println(this.toString+" : aplcpersemail is "+aplcpersemail );
}
String aplcpersptph_no1 = req.getParameter("aplcpersptph_no1");
if( aplcpersptph_no1 == null){
	System.out.println(this.toString+" : aplcpersptph_no1 is null" );
}else{
	System.out.println(this.toString+" : aplcpersptph_no1 is "+aplcpersptph_no1 );
}
String aplcpersptph_no2 = req.getParameter("aplcpersptph_no2");
if( aplcpersptph_no2 == null){
	System.out.println(this.toString+" : aplcpersptph_no2 is null" );
}else{
	System.out.println(this.toString+" : aplcpersptph_no2 is "+aplcpersptph_no2 );
}
String aplcpersptph_no3 = req.getParameter("aplcpersptph_no3");
if( aplcpersptph_no3 == null){
	System.out.println(this.toString+" : aplcpersptph_no3 is null" );
}else{
	System.out.println(this.toString+" : aplcpersptph_no3 is "+aplcpersptph_no3 );
}
String aplcperszip = req.getParameter("aplcperszip");
if( aplcperszip == null){
	System.out.println(this.toString+" : aplcperszip is null" );
}else{
	System.out.println(this.toString+" : aplcperszip is "+aplcperszip );
}
String aplcpersaddr = req.getParameter("aplcpersaddr");
if( aplcpersaddr == null){
	System.out.println(this.toString+" : aplcpersaddr is null" );
}else{
	System.out.println(this.toString+" : aplcpersaddr is "+aplcpersaddr );
}
String aplcpersdtlsaddr = req.getParameter("aplcpersdtlsaddr");
if( aplcpersdtlsaddr == null){
	System.out.println(this.toString+" : aplcpersdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : aplcpersdtlsaddr is "+aplcpersdtlsaddr );
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
String natncd = req.getParameter("natncd");
if( natncd == null){
	System.out.println(this.toString+" : natncd is null" );
}else{
	System.out.println(this.toString+" : natncd is "+natncd );
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
String rdremail = req.getParameter("rdremail");
if( rdremail == null){
	System.out.println(this.toString+" : rdremail is null" );
}else{
	System.out.println(this.toString+" : rdremail is "+rdremail );
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
String movmresiclsf = req.getParameter("movmresiclsf");
if( movmresiclsf == null){
	System.out.println(this.toString+" : movmresiclsf is null" );
}else{
	System.out.println(this.toString+" : movmresiclsf is "+movmresiclsf );
}
String movmresitype = req.getParameter("movmresitype");
if( movmresitype == null){
	System.out.println(this.toString+" : movmresitype is null" );
}else{
	System.out.println(this.toString+" : movmresitype is "+movmresitype );
}
String movmdt = req.getParameter("movmdt");
if( movmdt == null){
	System.out.println(this.toString+" : movmdt is null" );
}else{
	System.out.println(this.toString+" : movmdt is "+movmdt );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String dlvhopedt = req.getParameter("dlvhopedt");
if( dlvhopedt == null){
	System.out.println(this.toString+" : dlvhopedt is null" );
}else{
	System.out.println(this.toString+" : dlvhopedt is "+dlvhopedt );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String bocd2 = req.getParameter("bocd2");
if( bocd2 == null){
	System.out.println(this.toString+" : bocd2 is null" );
}else{
	System.out.println(this.toString+" : bocd2 is "+bocd2 );
}
String resiclsfcd = req.getParameter("resiclsfcd");
if( resiclsfcd == null){
	System.out.println(this.toString+" : resiclsfcd is null" );
}else{
	System.out.println(this.toString+" : resiclsfcd is "+resiclsfcd );
}
String resitypecd = req.getParameter("resitypecd");
if( resitypecd == null){
	System.out.println(this.toString+" : resitypecd is null" );
}else{
	System.out.println(this.toString+" : resitypecd is "+resitypecd );
}
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String nm = req.getParameter("nm");
if( nm == null){
	System.out.println(this.toString+" : nm is null" );
}else{
	System.out.println(this.toString+" : nm is "+nm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cnscnfmyn = req.getParameter("cnscnfmyn");
if( cnscnfmyn == null){
	System.out.println(this.toString+" : cnscnfmyn is null" );
}else{
	System.out.println(this.toString+" : cnscnfmyn is "+cnscnfmyn );
}
String cnscnfmcd = req.getParameter("cnscnfmcd");
if( cnscnfmcd == null){
	System.out.println(this.toString+" : cnscnfmcd is null" );
}else{
	System.out.println(this.toString+" : cnscnfmcd is "+cnscnfmcd );
}
String camptypecd = req.getParameter("camptypecd");
if( camptypecd == null){
	System.out.println(this.toString+" : camptypecd is null" );
}else{
	System.out.println(this.toString+" : camptypecd is "+camptypecd );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String jobflag = Util.checkString(req.getParameter("jobflag"));
String accflag = Util.checkString(req.getParameter("accflag"));
String dt = Util.checkString(req.getParameter("dt"));
String no = Util.checkString(req.getParameter("no"));
String rshpclsfcd = Util.checkString(req.getParameter("rshpclsfcd"));
String aplcpersnm = Util.checkString(req.getParameter("aplcpersnm"));
String aplcperstel_no1 = Util.checkString(req.getParameter("aplcperstel_no1"));
String aplcperstel_no2 = Util.checkString(req.getParameter("aplcperstel_no2"));
String aplcperstel_no3 = Util.checkString(req.getParameter("aplcperstel_no3"));
String aplcpersemail = Util.checkString(req.getParameter("aplcpersemail"));
String aplcpersptph_no1 = Util.checkString(req.getParameter("aplcpersptph_no1"));
String aplcpersptph_no2 = Util.checkString(req.getParameter("aplcpersptph_no2"));
String aplcpersptph_no3 = Util.checkString(req.getParameter("aplcpersptph_no3"));
String aplcperszip = Util.checkString(req.getParameter("aplcperszip"));
String aplcpersaddr = Util.checkString(req.getParameter("aplcpersaddr"));
String aplcpersdtlsaddr = Util.checkString(req.getParameter("aplcpersdtlsaddr"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String natncd = Util.checkString(req.getParameter("natncd"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdremail = Util.checkString(req.getParameter("rdremail"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String movmresiclsf = Util.checkString(req.getParameter("movmresiclsf"));
String movmresitype = Util.checkString(req.getParameter("movmresitype"));
String movmdt = Util.checkString(req.getParameter("movmdt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String qty = Util.checkString(req.getParameter("qty"));
String dlvhopedt = Util.checkString(req.getParameter("dlvhopedt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bocd2 = Util.checkString(req.getParameter("bocd2"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String clsfcd = Util.checkString(req.getParameter("clsfcd"));
String suspfrdt = Util.checkString(req.getParameter("suspfrdt"));
String susptodt = Util.checkString(req.getParameter("susptodt"));
String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
String uid = Util.checkString(req.getParameter("uid"));
String nm = Util.checkString(req.getParameter("nm"));
String remk = Util.checkString(req.getParameter("remk"));
String cnscnfmyn = Util.checkString(req.getParameter("cnscnfmyn"));
String cnscnfmcd = Util.checkString(req.getParameter("cnscnfmcd"));
String camptypecd = Util.checkString(req.getParameter("camptypecd"));
String campid = Util.checkString(req.getParameter("campid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String jobflag = Util.Uni2Ksc(Util.checkString(req.getParameter("jobflag")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String no = Util.Uni2Ksc(Util.checkString(req.getParameter("no")));
String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));
String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));
String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));
String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));
String aplcpersemail = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersemail")));
String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));
String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));
String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));
String aplcperszip = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperszip")));
String aplcpersaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersaddr")));
String aplcpersdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersdtlsaddr")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String natncd = Util.Uni2Ksc(Util.checkString(req.getParameter("natncd")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String movmresiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresiclsf")));
String movmresitype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresitype")));
String movmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("movmdt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bocd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd2")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfcd")));
String suspfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspfrdt")));
String susptodt = Util.Uni2Ksc(Util.checkString(req.getParameter("susptodt")));
String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
String vaca_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areacd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String nm = Util.Uni2Ksc(Util.checkString(req.getParameter("nm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cnscnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("cnscnfmyn")));
String cnscnfmcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cnscnfmcd")));
String camptypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("camptypecd")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setJobflag(jobflag);
dm.setAccflag(accflag);
dm.setDt(dt);
dm.setNo(no);
dm.setRshpclsfcd(rshpclsfcd);
dm.setAplcpersnm(aplcpersnm);
dm.setAplcperstel_no1(aplcperstel_no1);
dm.setAplcperstel_no2(aplcperstel_no2);
dm.setAplcperstel_no3(aplcperstel_no3);
dm.setAplcpersemail(aplcpersemail);
dm.setAplcpersptph_no1(aplcpersptph_no1);
dm.setAplcpersptph_no2(aplcpersptph_no2);
dm.setAplcpersptph_no3(aplcpersptph_no3);
dm.setAplcperszip(aplcperszip);
dm.setAplcpersaddr(aplcpersaddr);
dm.setAplcpersdtlsaddr(aplcpersdtlsaddr);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setNatncd(natncd);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdremail(rdremail);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setMovmresiclsf(movmresiclsf);
dm.setMovmresitype(movmresitype);
dm.setMovmdt(movmdt);
dm.setMedicd(medicd);
dm.setQty(qty);
dm.setDlvhopedt(dlvhopedt);
dm.setBocd(bocd);
dm.setBocd2(bocd2);
dm.setResiclsfcd(resiclsfcd);
dm.setResitypecd(resitypecd);
dm.setDscttypecd(dscttypecd);
dm.setTitl(titl);
dm.setCont(cont);
dm.setClsfcd(clsfcd);
dm.setSuspfrdt(suspfrdt);
dm.setSusptodt(susptodt);
dm.setVaca_arearegncd(vaca_arearegncd);
dm.setVaca_areacd(vaca_areacd);
dm.setUid(uid);
dm.setNm(nm);
dm.setRemk(remk);
dm.setCnscnfmyn(cnscnfmyn);
dm.setCnscnfmcd(cnscnfmcd);
dm.setCamptypecd(camptypecd);
dm.setCampid(campid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 27 15:22:53 KST 2005 */