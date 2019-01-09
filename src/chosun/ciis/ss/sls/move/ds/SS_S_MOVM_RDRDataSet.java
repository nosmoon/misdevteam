/***************************************************************************************************
* 파일명 : SS_S_MOVM_RDRDataSet.java
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


package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_S_MOVM_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmediqty = new ArrayList();
	public String errcode;
	public String errmsg;
	public String regdt;
	public String regno;
	public String aplcpathnm;
	public String trsfbocd;
	public String acptbocd;
	public String rdr_no;
	public String rdrnm;
	public String trsfbonm;
	public String trfsbo_tel;
	public String acptbonm;
	public String acptbo_tel;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String resiclsf;
	public String resiclsfcd;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String movmzip;
	public String movmaddr;
	public String movmdtlsaddr;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String movmtel_no1;
	public String movmtel_no2;
	public String movmtel_no3;
	public String movmresiclsf;
	public String movmresitype;
	public String movmresiclsfcd;
	public String movmresitypecd;
	public String remk;
	public String dlvhopedt;
	public String movmdt;
	public Timestamp trsfbocnfmdt_tm;
	public String trsfbocnfmyn;
	public String trsfbocnfmstat;
	public Timestamp acptbocnfmdt_tm;
	public String acptbocnfmyn;
	public String acptbocnfmstat;
	public String acptboremk;
	public String trsfboremk;
	public String cns_empid;
	public String cns_empnm;
	public String cns_empremk;
	public String cns_empcnfmyn;
	public Timestamp cns_empcnfmdt;
	public String movmrdrtype;
	public String rstsubsmonths;
	public String movmrdrtypenm;
	public String rstsubsmonthsnm;
	public String movmlinkalon_plan;
	public String movmlinkalon_fix;
	public String movmlinkalon_ptcr;
	public String svcnm;
	public String svcmm;
	public String giftcard;
	public String set_medicd;
	public String cs_cns_empid;
	public String cs_cns_empnm;
	public String cs_cns_empremk;
	public String cs_cns_empcnfmyn;
	public Timestamp cs_cns_empcnfmdt;
	public String bldmngnn;
	public String movmbldmngnn;

	public SS_S_MOVM_RDRDataSet(){}
	public SS_S_MOVM_RDRDataSet(String errcode, String errmsg, String regdt, String regno, String aplcpathnm, String trsfbocd, String acptbocd, String rdr_no, String rdrnm, String trsfbonm, String trfsbo_tel, String acptbonm, String acptbo_tel, String zip, String addr, String dtlsaddr, String resiclsf, String resiclsfcd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String movmzip, String movmaddr, String movmdtlsaddr, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String movmtel_no1, String movmtel_no2, String movmtel_no3, String movmresiclsf, String movmresitype, String movmresiclsfcd, String movmresitypecd, String remk, String dlvhopedt, String movmdt, Timestamp trsfbocnfmdt_tm, String trsfbocnfmyn, String trsfbocnfmstat, Timestamp acptbocnfmdt_tm, String acptbocnfmyn, String acptbocnfmstat, String acptboremk, String trsfboremk, String cns_empid, String cns_empnm, String cns_empremk, String cns_empcnfmyn, Timestamp cns_empcnfmdt, String movmrdrtype, String rstsubsmonths, String movmrdrtypenm, String rstsubsmonthsnm, String movmlinkalon_plan, String movmlinkalon_fix, String movmlinkalon_ptcr, String svcnm, String svcmm, String giftcard, String set_medicd, String cs_cns_empid, String cs_cns_empnm, String cs_cns_empremk, String cs_cns_empcnfmyn, Timestamp cs_cns_empcnfmdt, String bldmngnn, String movmbldmngnn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.regdt = regdt;
		this.regno = regno;
		this.aplcpathnm = aplcpathnm;
		this.trsfbocd = trsfbocd;
		this.acptbocd = acptbocd;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.trsfbonm = trsfbonm;
		this.trfsbo_tel = trfsbo_tel;
		this.acptbonm = acptbonm;
		this.acptbo_tel = acptbo_tel;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.resiclsf = resiclsf;
		this.resiclsfcd = resiclsfcd;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.movmzip = movmzip;
		this.movmaddr = movmaddr;
		this.movmdtlsaddr = movmdtlsaddr;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.movmtel_no1 = movmtel_no1;
		this.movmtel_no2 = movmtel_no2;
		this.movmtel_no3 = movmtel_no3;
		this.movmresiclsf = movmresiclsf;
		this.movmresitype = movmresitype;
		this.movmresiclsfcd = movmresiclsfcd;
		this.movmresitypecd = movmresitypecd;
		this.remk = remk;
		this.dlvhopedt = dlvhopedt;
		this.movmdt = movmdt;
		this.trsfbocnfmdt_tm = trsfbocnfmdt_tm;
		this.trsfbocnfmyn = trsfbocnfmyn;
		this.trsfbocnfmstat = trsfbocnfmstat;
		this.acptbocnfmdt_tm = acptbocnfmdt_tm;
		this.acptbocnfmyn = acptbocnfmyn;
		this.acptbocnfmstat = acptbocnfmstat;
		this.acptboremk = acptboremk;
		this.trsfboremk = trsfboremk;
		this.cns_empid = cns_empid;
		this.cns_empnm = cns_empnm;
		this.cns_empremk = cns_empremk;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.cns_empcnfmdt = cns_empcnfmdt;
		this.movmrdrtype = movmrdrtype;
		this.rstsubsmonths = rstsubsmonths;
		this.movmrdrtypenm = movmrdrtypenm;
		this.rstsubsmonthsnm = rstsubsmonthsnm;
		this.movmlinkalon_plan = movmlinkalon_plan;
		this.movmlinkalon_fix = movmlinkalon_fix;
		this.movmlinkalon_ptcr = movmlinkalon_ptcr;
		this.svcnm = svcnm;
		this.svcmm = svcmm;
		this.giftcard = giftcard;
		this.set_medicd = set_medicd;
		this.cs_cns_empid = cs_cns_empid;
		this.cs_cns_empnm = cs_cns_empnm;
		this.cs_cns_empremk = cs_cns_empremk;
		this.cs_cns_empcnfmyn = cs_cns_empcnfmyn;
		this.cs_cns_empcnfmdt = cs_cns_empcnfmdt;
		this.bldmngnn = bldmngnn;
		this.movmbldmngnn = movmbldmngnn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setTrfsbo_tel(String trfsbo_tel){
		this.trfsbo_tel = trfsbo_tel;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public void setAcptbo_tel(String acptbo_tel){
		this.acptbo_tel = acptbo_tel;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setResiclsf(String resiclsf){
		this.resiclsf = resiclsf;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
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

	public void setMovmzip(String movmzip){
		this.movmzip = movmzip;
	}

	public void setMovmaddr(String movmaddr){
		this.movmaddr = movmaddr;
	}

	public void setMovmdtlsaddr(String movmdtlsaddr){
		this.movmdtlsaddr = movmdtlsaddr;
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

	public void setMovmtel_no1(String movmtel_no1){
		this.movmtel_no1 = movmtel_no1;
	}

	public void setMovmtel_no2(String movmtel_no2){
		this.movmtel_no2 = movmtel_no2;
	}

	public void setMovmtel_no3(String movmtel_no3){
		this.movmtel_no3 = movmtel_no3;
	}

	public void setMovmresiclsf(String movmresiclsf){
		this.movmresiclsf = movmresiclsf;
	}

	public void setMovmresitype(String movmresitype){
		this.movmresitype = movmresitype;
	}

	public void setMovmresiclsfcd(String movmresiclsfcd){
		this.movmresiclsfcd = movmresiclsfcd;
	}

	public void setMovmresitypecd(String movmresitypecd){
		this.movmresitypecd = movmresitypecd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setTrsfbocnfmdt_tm(Timestamp trsfbocnfmdt_tm){
		this.trsfbocnfmdt_tm = trsfbocnfmdt_tm;
	}

	public void setTrsfbocnfmyn(String trsfbocnfmyn){
		this.trsfbocnfmyn = trsfbocnfmyn;
	}

	public void setTrsfbocnfmstat(String trsfbocnfmstat){
		this.trsfbocnfmstat = trsfbocnfmstat;
	}

	public void setAcptbocnfmdt_tm(Timestamp acptbocnfmdt_tm){
		this.acptbocnfmdt_tm = acptbocnfmdt_tm;
	}

	public void setAcptbocnfmyn(String acptbocnfmyn){
		this.acptbocnfmyn = acptbocnfmyn;
	}

	public void setAcptbocnfmstat(String acptbocnfmstat){
		this.acptbocnfmstat = acptbocnfmstat;
	}

	public void setAcptboremk(String acptboremk){
		this.acptboremk = acptboremk;
	}

	public void setTrsfboremk(String trsfboremk){
		this.trsfboremk = trsfboremk;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empremk(String cns_empremk){
		this.cns_empremk = cns_empremk;
	}

	public void setCns_empcnfmyn(String cns_empcnfmyn){
		this.cns_empcnfmyn = cns_empcnfmyn;
	}

	public void setCns_empcnfmdt(Timestamp cns_empcnfmdt){
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public void setMovmrdrtype(String movmrdrtype){
		this.movmrdrtype = movmrdrtype;
	}

	public void setRstsubsmonths(String rstsubsmonths){
		this.rstsubsmonths = rstsubsmonths;
	}

	public void setMovmrdrtypenm(String movmrdrtypenm){
		this.movmrdrtypenm = movmrdrtypenm;
	}

	public void setRstsubsmonthsnm(String rstsubsmonthsnm){
		this.rstsubsmonthsnm = rstsubsmonthsnm;
	}

	public void setMovmlinkalon_plan(String movmlinkalon_plan){
		this.movmlinkalon_plan = movmlinkalon_plan;
	}

	public void setMovmlinkalon_fix(String movmlinkalon_fix){
		this.movmlinkalon_fix = movmlinkalon_fix;
	}

	public void setMovmlinkalon_ptcr(String movmlinkalon_ptcr){
		this.movmlinkalon_ptcr = movmlinkalon_ptcr;
	}

	public void setSvcnm(String svcnm){
		this.svcnm = svcnm;
	}

	public void setSvcmm(String svcmm){
		this.svcmm = svcmm;
	}

	public void setGiftcard(String giftcard){
		this.giftcard = giftcard;
	}

	public void setSet_medicd(String set_medicd){
		this.set_medicd = set_medicd;
	}

	public void setCs_cns_empid(String cs_cns_empid){
		this.cs_cns_empid = cs_cns_empid;
	}

	public void setCs_cns_empnm(String cs_cns_empnm){
		this.cs_cns_empnm = cs_cns_empnm;
	}

	public void setCs_cns_empremk(String cs_cns_empremk){
		this.cs_cns_empremk = cs_cns_empremk;
	}

	public void setCs_cns_empcnfmyn(String cs_cns_empcnfmyn){
		this.cs_cns_empcnfmyn = cs_cns_empcnfmyn;
	}

	public void setCs_cns_empcnfmdt(Timestamp cs_cns_empcnfmdt){
		this.cs_cns_empcnfmdt = cs_cns_empcnfmdt;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setMovmbldmngnn(String movmbldmngnn){
		this.movmbldmngnn = movmbldmngnn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getTrfsbo_tel(){
		return this.trfsbo_tel;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}

	public String getAcptbo_tel(){
		return this.acptbo_tel;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getResiclsf(){
		return this.resiclsf;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
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

	public String getMovmzip(){
		return this.movmzip;
	}

	public String getMovmaddr(){
		return this.movmaddr;
	}

	public String getMovmdtlsaddr(){
		return this.movmdtlsaddr;
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

	public String getMovmtel_no1(){
		return this.movmtel_no1;
	}

	public String getMovmtel_no2(){
		return this.movmtel_no2;
	}

	public String getMovmtel_no3(){
		return this.movmtel_no3;
	}

	public String getMovmresiclsf(){
		return this.movmresiclsf;
	}

	public String getMovmresitype(){
		return this.movmresitype;
	}

	public String getMovmresiclsfcd(){
		return this.movmresiclsfcd;
	}

	public String getMovmresitypecd(){
		return this.movmresitypecd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public Timestamp getTrsfbocnfmdt_tm(){
		return this.trsfbocnfmdt_tm;
	}

	public String getTrsfbocnfmyn(){
		return this.trsfbocnfmyn;
	}

	public String getTrsfbocnfmstat(){
		return this.trsfbocnfmstat;
	}

	public Timestamp getAcptbocnfmdt_tm(){
		return this.acptbocnfmdt_tm;
	}

	public String getAcptbocnfmyn(){
		return this.acptbocnfmyn;
	}

	public String getAcptbocnfmstat(){
		return this.acptbocnfmstat;
	}

	public String getAcptboremk(){
		return this.acptboremk;
	}

	public String getTrsfboremk(){
		return this.trsfboremk;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empremk(){
		return this.cns_empremk;
	}

	public String getCns_empcnfmyn(){
		return this.cns_empcnfmyn;
	}

	public Timestamp getCns_empcnfmdt(){
		return this.cns_empcnfmdt;
	}

	public String getMovmrdrtype(){
		return this.movmrdrtype;
	}

	public String getRstsubsmonths(){
		return this.rstsubsmonths;
	}

	public String getMovmrdrtypenm(){
		return this.movmrdrtypenm;
	}

	public String getRstsubsmonthsnm(){
		return this.rstsubsmonthsnm;
	}

	public String getMovmlinkalon_plan(){
		return this.movmlinkalon_plan;
	}

	public String getMovmlinkalon_fix(){
		return this.movmlinkalon_fix;
	}

	public String getMovmlinkalon_ptcr(){
		return this.movmlinkalon_ptcr;
	}

	public String getSvcnm(){
		return this.svcnm;
	}

	public String getSvcmm(){
		return this.svcmm;
	}

	public String getGiftcard(){
		return this.giftcard;
	}

	public String getSet_medicd(){
		return this.set_medicd;
	}

	public String getCs_cns_empid(){
		return this.cs_cns_empid;
	}

	public String getCs_cns_empnm(){
		return this.cs_cns_empnm;
	}

	public String getCs_cns_empremk(){
		return this.cs_cns_empremk;
	}

	public String getCs_cns_empcnfmyn(){
		return this.cs_cns_empcnfmyn;
	}

	public Timestamp getCs_cns_empcnfmdt(){
		return this.cs_cns_empcnfmdt;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getMovmbldmngnn(){
		return this.movmbldmngnn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.regdt = Util.checkString(cstmt.getString(5));
		this.regno = Util.checkString(cstmt.getString(6));
		this.aplcpathnm = Util.checkString(cstmt.getString(7));
		this.trsfbocd = Util.checkString(cstmt.getString(8));
		this.acptbocd = Util.checkString(cstmt.getString(9));
		this.rdr_no = Util.checkString(cstmt.getString(10));
		this.rdrnm = Util.checkString(cstmt.getString(11));
		this.trsfbonm = Util.checkString(cstmt.getString(12));
		this.trfsbo_tel = Util.checkString(cstmt.getString(13));
		this.acptbonm = Util.checkString(cstmt.getString(14));
		this.acptbo_tel = Util.checkString(cstmt.getString(15));
		this.zip = Util.checkString(cstmt.getString(16));
		this.addr = Util.checkString(cstmt.getString(17));
		this.dtlsaddr = Util.checkString(cstmt.getString(18));
		this.resiclsf = Util.checkString(cstmt.getString(19));
		this.resiclsfcd = Util.checkString(cstmt.getString(20));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(21));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(22));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(23));
		this.movmzip = Util.checkString(cstmt.getString(24));
		this.movmaddr = Util.checkString(cstmt.getString(25));
		this.movmdtlsaddr = Util.checkString(cstmt.getString(26));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(27));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(28));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(29));
		this.movmtel_no1 = Util.checkString(cstmt.getString(30));
		this.movmtel_no2 = Util.checkString(cstmt.getString(31));
		this.movmtel_no3 = Util.checkString(cstmt.getString(32));
		this.movmresiclsf = Util.checkString(cstmt.getString(33));
		this.movmresitype = Util.checkString(cstmt.getString(34));
		this.movmresiclsfcd = Util.checkString(cstmt.getString(35));
		this.movmresitypecd = Util.checkString(cstmt.getString(36));
		this.remk = Util.checkString(cstmt.getString(37));
		this.dlvhopedt = Util.checkString(cstmt.getString(38));
		this.movmdt = Util.checkString(cstmt.getString(39));
		this.trsfbocnfmdt_tm = cstmt.getTimestamp(40);
		this.trsfbocnfmyn = Util.checkString(cstmt.getString(41));
		this.trsfbocnfmstat = Util.checkString(cstmt.getString(42));
		this.acptbocnfmdt_tm = cstmt.getTimestamp(43);
		this.acptbocnfmyn = Util.checkString(cstmt.getString(44));
		this.acptbocnfmstat = Util.checkString(cstmt.getString(45));
		this.acptboremk = Util.checkString(cstmt.getString(46));
		this.trsfboremk = Util.checkString(cstmt.getString(47));
		this.cns_empid = Util.checkString(cstmt.getString(48));
		this.cns_empnm = Util.checkString(cstmt.getString(49));
		this.cns_empremk = Util.checkString(cstmt.getString(50));
		this.cns_empcnfmyn = Util.checkString(cstmt.getString(51));
		this.cns_empcnfmdt = cstmt.getTimestamp(52);
		this.movmrdrtype = Util.checkString(cstmt.getString(53));
		this.rstsubsmonths = Util.checkString(cstmt.getString(54));
		this.movmrdrtypenm = Util.checkString(cstmt.getString(55));
		this.rstsubsmonthsnm = Util.checkString(cstmt.getString(56));
		this.movmlinkalon_plan = Util.checkString(cstmt.getString(57));
		this.movmlinkalon_fix = Util.checkString(cstmt.getString(58));
		this.movmlinkalon_ptcr = Util.checkString(cstmt.getString(59));
		ResultSet rset0 = (ResultSet) cstmt.getObject(60);
		while(rset0.next()){
			SS_S_MOVM_RDRCURMEDIQTYRecord rec = new SS_S_MOVM_RDRCURMEDIQTYRecord();
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.qty = rset0.getInt("qty");
			this.curmediqty.add(rec);
		}
		this.svcnm = Util.checkString(cstmt.getString(61));
		this.svcmm = Util.checkString(cstmt.getString(62));
		this.giftcard = Util.checkString(cstmt.getString(63));
		this.set_medicd = Util.checkString(cstmt.getString(64));
		this.cs_cns_empid = Util.checkString(cstmt.getString(65));
		this.cs_cns_empnm = Util.checkString(cstmt.getString(66));
		this.cs_cns_empremk = Util.checkString(cstmt.getString(67));
		this.cs_cns_empcnfmyn = Util.checkString(cstmt.getString(68));
		this.cs_cns_empcnfmdt = cstmt.getTimestamp(69);
		this.bldmngnn = Util.checkString(cstmt.getString(70));
		this.movmbldmngnn = Util.checkString(cstmt.getString(71));
	}

	/*
	public String curmediqtyOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmediqty.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCURMEDIQTYRecord rec = (SS_S_MOVM_RDRCURMEDIQTYRecord)curmediqty.get(i);
			
			
			String code = rec.medinm;
			String name = rec.qty;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String curmediqtyChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmediqty.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCURMEDIQTYRecord rec = (SS_S_MOVM_RDRCURMEDIQTYRecord)curmediqty.get(i);
			
			
			String code = rec.medinm;
			String name = rec.qty;
			
			sb.append("<input name=\"");
			sb.append("medinm");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String curmediqtyRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmediqty.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCURMEDIQTYRecord rec = (SS_S_MOVM_RDRCURMEDIQTYRecord)curmediqty.get(i);
			
			
			String code = rec.medinm;
			String name = rec.qty;
			
			sb.append("<input name=\"");
			sb.append("medinm");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
	*/
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_MOVM_RDRDataSet ds = (SS_S_MOVM_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmediqty.size(); i++){
		SS_S_MOVM_RDRCURMEDIQTYRecord curmediqtyRec = (SS_S_MOVM_RDRCURMEDIQTYRecord)ds.curmediqty.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
<%= ds.getAplcpathnm()%>
<%= ds.getTrsfbocd()%>
<%= ds.getAcptbocd()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getTrsfbonm()%>
<%= ds.getTrfsbo_tel()%>
<%= ds.getAcptbonm()%>
<%= ds.getAcptbo_tel()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtlsaddr()%>
<%= ds.getResiclsf()%>
<%= ds.getResiclsfcd()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getMovmzip()%>
<%= ds.getMovmaddr()%>
<%= ds.getMovmdtlsaddr()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getMovmtel_no1()%>
<%= ds.getMovmtel_no2()%>
<%= ds.getMovmtel_no3()%>
<%= ds.getMovmresiclsf()%>
<%= ds.getMovmresitype()%>
<%= ds.getMovmresiclsfcd()%>
<%= ds.getMovmresitypecd()%>
<%= ds.getRemk()%>
<%= ds.getDlvhopedt()%>
<%= ds.getMovmdt()%>
<%= ds.getTrsfbocnfmdt_tm()%>
<%= ds.getTrsfbocnfmyn()%>
<%= ds.getTrsfbocnfmstat()%>
<%= ds.getAcptbocnfmdt_tm()%>
<%= ds.getAcptbocnfmyn()%>
<%= ds.getAcptbocnfmstat()%>
<%= ds.getAcptboremk()%>
<%= ds.getTrsfboremk()%>
<%= ds.getCns_empid()%>
<%= ds.getCns_empnm()%>
<%= ds.getCns_empremk()%>
<%= ds.getCns_empcnfmyn()%>
<%= ds.getCns_empcnfmdt()%>
<%= ds.getMovmrdrtype()%>
<%= ds.getRstsubsmonths()%>
<%= ds.getMovmrdrtypenm()%>
<%= ds.getRstsubsmonthsnm()%>
<%= ds.getMovmlinkalon_plan()%>
<%= ds.getMovmlinkalon_fix()%>
<%= ds.getMovmlinkalon_ptcr()%>
<%= ds.getCurmediqty()%>
<%= ds.getSvcnm()%>
<%= ds.getSvcmm()%>
<%= ds.getGiftcard()%>
<%= ds.getSet_medicd()%>
<%= ds.getCs_cns_empid()%>
<%= ds.getCs_cns_empnm()%>
<%= ds.getCs_cns_empremk()%>
<%= ds.getCs_cns_empcnfmyn()%>
<%= ds.getCs_cns_empcnfmdt()%>
<%= ds.getBldmngnn()%>
<%= ds.getMovmbldmngnn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmediqtyRec.medinm%>
<%= curmediqtyRec.qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 10 11:10:26 KST 2015 */