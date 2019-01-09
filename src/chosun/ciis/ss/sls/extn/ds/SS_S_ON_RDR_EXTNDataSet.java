/***************************************************************************************************
 * 파일명   : SP_SS_S_ON_RDR_EXTN
 * 기능     : 확장현황-온라인확장 신청 상세
 * 작성일자 : 2007/06/12
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  SP_SS_S_ON_RDR_EXTN
**/

public class SS_S_ON_RDR_EXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rdr_extndt;
	public String rdr_extnno;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String medicdnm;
	public String aplcdt;
	public long qty;
	public String aplcpathnm;
	public String rdr_extntypecd;
	public String rdr_extntypecdnm;
	public String extnblngcd;
	public String extnblngcdnm;
	public String empclsfcdnm;
	public String empdeptnm;
	public String empseq;
	public String bodutycdnm;
	public String boposicdnm;
	public String stafclsfcdnm;
	public String stafno;
	public String rdr_extnbocdnm;
	public String boemp_no;
	public String extnid;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String prvsubsmedicd;
	public String rshpclsfcd;
	public String rshpclsfcdnm;
	public String aplcpersnm;
	public String aplcpersemail;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String aplcpersptph_no1;
	public String aplcpersptph_no2;
	public String aplcpersptph_no3;
	public String aplcpersremk;
	public String post_dlvyn;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdremail;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvhopedt;
	public String pymtflnm;
	public String pymttel_no1;
	public String pymttel_no2;
	public String pymttel_no3;
	public String pymtptph_no1;
	public String pymtptph_no2;
	public String pymtptph_no3;
	public String exstbocdnm;
	public String corrbocdnm;
	public String bo_tel_no11;
	public String bo_tel_no12;
	public String bo_tel_no13;
	public String extnbo_tel_no11;
	public String extnbo_tel_no12;
	public String extnbo_tel_no13;
	public String resiclsfcd;
	public String resiclsfcdnm;
	public String resitypecd;
	public String resitypecdnm;
	public String bo_headcnfmyn;
	public Timestamp bo_headcnfmdt;
	public String lastdlvcnfmyn;
	public Timestamp lastdlvcnfmdt;
	public String subscnfmstatcdnm;
	public String cns_empcnfmstatnm;
	public String cns_empid;
	public String cns_empnm;
	public String remk;
	public String prcmsg;
	public String aplcperszip;
	public String aplcpersaddr;
	public String aplcpersdtlsaddr;
	public String corrbocd;
	public String natnnm;
	public String advtpathcd;
	public String advtpathnm;
	public String valmm;
	public String freeday;
	public String aplcclsf;
	public String item;

	public SS_S_ON_RDR_EXTNDataSet(){}
	public SS_S_ON_RDR_EXTNDataSet(String errcode, String errmsg, String rdr_extndt, String rdr_extnno, String rdr_no, String medicd, String cntrno, String mangno, String medicdnm, String aplcdt, long qty, String aplcpathnm, String rdr_extntypecd, String rdr_extntypecdnm, String extnblngcd, String extnblngcdnm, String empclsfcdnm, String empdeptnm, String empseq, String bodutycdnm, String boposicdnm, String stafclsfcdnm, String stafno, String rdr_extnbocdnm, String boemp_no, String extnid, String extnflnm, String extntel1, String extntel2, String extntel3, String extnptph_no1, String extnptph_no2, String extnptph_no3, String extnprn, String prvsubsmedicd, String rshpclsfcd, String rshpclsfcdnm, String aplcpersnm, String aplcpersemail, String aplcperstel_no1, String aplcperstel_no2, String aplcperstel_no3, String aplcpersptph_no1, String aplcpersptph_no2, String aplcpersptph_no3, String aplcpersremk, String post_dlvyn, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String rdremail, String dlvzip, String dlvaddr, String dlvdtlsaddr, String dlvhopedt, String pymtflnm, String pymttel_no1, String pymttel_no2, String pymttel_no3, String pymtptph_no1, String pymtptph_no2, String pymtptph_no3, String exstbocdnm, String corrbocdnm, String bo_tel_no11, String bo_tel_no12, String bo_tel_no13, String extnbo_tel_no11, String extnbo_tel_no12, String extnbo_tel_no13, String resiclsfcd, String resiclsfcdnm, String resitypecd, String resitypecdnm, String bo_headcnfmyn, Timestamp bo_headcnfmdt, String lastdlvcnfmyn, Timestamp lastdlvcnfmdt, String subscnfmstatcdnm, String cns_empcnfmstatnm, String cns_empid, String cns_empnm, String remk, String prcmsg, String aplcperszip, String aplcpersaddr, String aplcpersdtlsaddr, String corrbocd, String natnnm, String advtpathcd, String advtpathnm, String valmm, String freeday, String aplcclsf, String item){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.cntrno = cntrno;
		this.mangno = mangno;
		this.medicdnm = medicdnm;
		this.aplcdt = aplcdt;
		this.qty = qty;
		this.aplcpathnm = aplcpathnm;
		this.rdr_extntypecd = rdr_extntypecd;
		this.rdr_extntypecdnm = rdr_extntypecdnm;
		this.extnblngcd = extnblngcd;
		this.extnblngcdnm = extnblngcdnm;
		this.empclsfcdnm = empclsfcdnm;
		this.empdeptnm = empdeptnm;
		this.empseq = empseq;
		this.bodutycdnm = bodutycdnm;
		this.boposicdnm = boposicdnm;
		this.stafclsfcdnm = stafclsfcdnm;
		this.stafno = stafno;
		this.rdr_extnbocdnm = rdr_extnbocdnm;
		this.boemp_no = boemp_no;
		this.extnid = extnid;
		this.extnflnm = extnflnm;
		this.extntel1 = extntel1;
		this.extntel2 = extntel2;
		this.extntel3 = extntel3;
		this.extnptph_no1 = extnptph_no1;
		this.extnptph_no2 = extnptph_no2;
		this.extnptph_no3 = extnptph_no3;
		this.extnprn = extnprn;
		this.prvsubsmedicd = prvsubsmedicd;
		this.rshpclsfcd = rshpclsfcd;
		this.rshpclsfcdnm = rshpclsfcdnm;
		this.aplcpersnm = aplcpersnm;
		this.aplcpersemail = aplcpersemail;
		this.aplcperstel_no1 = aplcperstel_no1;
		this.aplcperstel_no2 = aplcperstel_no2;
		this.aplcperstel_no3 = aplcperstel_no3;
		this.aplcpersptph_no1 = aplcpersptph_no1;
		this.aplcpersptph_no2 = aplcpersptph_no2;
		this.aplcpersptph_no3 = aplcpersptph_no3;
		this.aplcpersremk = aplcpersremk;
		this.post_dlvyn = post_dlvyn;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.rdremail = rdremail;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.dlvhopedt = dlvhopedt;
		this.pymtflnm = pymtflnm;
		this.pymttel_no1 = pymttel_no1;
		this.pymttel_no2 = pymttel_no2;
		this.pymttel_no3 = pymttel_no3;
		this.pymtptph_no1 = pymtptph_no1;
		this.pymtptph_no2 = pymtptph_no2;
		this.pymtptph_no3 = pymtptph_no3;
		this.exstbocdnm = exstbocdnm;
		this.corrbocdnm = corrbocdnm;
		this.bo_tel_no11 = bo_tel_no11;
		this.bo_tel_no12 = bo_tel_no12;
		this.bo_tel_no13 = bo_tel_no13;
		this.extnbo_tel_no11 = extnbo_tel_no11;
		this.extnbo_tel_no12 = extnbo_tel_no12;
		this.extnbo_tel_no13 = extnbo_tel_no13;
		this.resiclsfcd = resiclsfcd;
		this.resiclsfcdnm = resiclsfcdnm;
		this.resitypecd = resitypecd;
		this.resitypecdnm = resitypecdnm;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.bo_headcnfmdt = bo_headcnfmdt;
		this.lastdlvcnfmyn = lastdlvcnfmyn;
		this.lastdlvcnfmdt = lastdlvcnfmdt;
		this.subscnfmstatcdnm = subscnfmstatcdnm;
		this.cns_empcnfmstatnm = cns_empcnfmstatnm;
		this.cns_empid = cns_empid;
		this.cns_empnm = cns_empnm;
		this.remk = remk;
		this.prcmsg = prcmsg;
		this.aplcperszip = aplcperszip;
		this.aplcpersaddr = aplcpersaddr;
		this.aplcpersdtlsaddr = aplcpersdtlsaddr;
		this.corrbocd = corrbocd;
		this.natnnm = natnnm;
		this.advtpathcd = advtpathcd;
		this.advtpathnm = advtpathnm;
		this.valmm = valmm;
		this.freeday = freeday;
		this.aplcclsf = aplcclsf;
		this.item = item;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setQty(long qty){
		this.qty = qty;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdr_extntypecdnm(String rdr_extntypecdnm){
		this.rdr_extntypecdnm = rdr_extntypecdnm;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setExtnblngcdnm(String extnblngcdnm){
		this.extnblngcdnm = extnblngcdnm;
	}

	public void setEmpclsfcdnm(String empclsfcdnm){
		this.empclsfcdnm = empclsfcdnm;
	}

	public void setEmpdeptnm(String empdeptnm){
		this.empdeptnm = empdeptnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setBodutycdnm(String bodutycdnm){
		this.bodutycdnm = bodutycdnm;
	}

	public void setBoposicdnm(String boposicdnm){
		this.boposicdnm = boposicdnm;
	}

	public void setStafclsfcdnm(String stafclsfcdnm){
		this.stafclsfcdnm = stafclsfcdnm;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setRdr_extnbocdnm(String rdr_extnbocdnm){
		this.rdr_extnbocdnm = rdr_extnbocdnm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setExtnid(String extnid){
		this.extnid = extnid;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtntel1(String extntel1){
		this.extntel1 = extntel1;
	}

	public void setExtntel2(String extntel2){
		this.extntel2 = extntel2;
	}

	public void setExtntel3(String extntel3){
		this.extntel3 = extntel3;
	}

	public void setExtnptph_no1(String extnptph_no1){
		this.extnptph_no1 = extnptph_no1;
	}

	public void setExtnptph_no2(String extnptph_no2){
		this.extnptph_no2 = extnptph_no2;
	}

	public void setExtnptph_no3(String extnptph_no3){
		this.extnptph_no3 = extnptph_no3;
	}

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setPrvsubsmedicd(String prvsubsmedicd){
		this.prvsubsmedicd = prvsubsmedicd;
	}

	public void setRshpclsfcd(String rshpclsfcd){
		this.rshpclsfcd = rshpclsfcd;
	}

	public void setRshpclsfcdnm(String rshpclsfcdnm){
		this.rshpclsfcdnm = rshpclsfcdnm;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setAplcpersemail(String aplcpersemail){
		this.aplcpersemail = aplcpersemail;
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

	public void setAplcpersptph_no1(String aplcpersptph_no1){
		this.aplcpersptph_no1 = aplcpersptph_no1;
	}

	public void setAplcpersptph_no2(String aplcpersptph_no2){
		this.aplcpersptph_no2 = aplcpersptph_no2;
	}

	public void setAplcpersptph_no3(String aplcpersptph_no3){
		this.aplcpersptph_no3 = aplcpersptph_no3;
	}

	public void setAplcpersremk(String aplcpersremk){
		this.aplcpersremk = aplcpersremk;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
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

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setPymtflnm(String pymtflnm){
		this.pymtflnm = pymtflnm;
	}

	public void setPymttel_no1(String pymttel_no1){
		this.pymttel_no1 = pymttel_no1;
	}

	public void setPymttel_no2(String pymttel_no2){
		this.pymttel_no2 = pymttel_no2;
	}

	public void setPymttel_no3(String pymttel_no3){
		this.pymttel_no3 = pymttel_no3;
	}

	public void setPymtptph_no1(String pymtptph_no1){
		this.pymtptph_no1 = pymtptph_no1;
	}

	public void setPymtptph_no2(String pymtptph_no2){
		this.pymtptph_no2 = pymtptph_no2;
	}

	public void setPymtptph_no3(String pymtptph_no3){
		this.pymtptph_no3 = pymtptph_no3;
	}

	public void setExstbocdnm(String exstbocdnm){
		this.exstbocdnm = exstbocdnm;
	}

	public void setCorrbocdnm(String corrbocdnm){
		this.corrbocdnm = corrbocdnm;
	}

	public void setBo_tel_no11(String bo_tel_no11){
		this.bo_tel_no11 = bo_tel_no11;
	}

	public void setBo_tel_no12(String bo_tel_no12){
		this.bo_tel_no12 = bo_tel_no12;
	}

	public void setBo_tel_no13(String bo_tel_no13){
		this.bo_tel_no13 = bo_tel_no13;
	}

	public void setExtnbo_tel_no11(String extnbo_tel_no11){
		this.extnbo_tel_no11 = extnbo_tel_no11;
	}

	public void setExtnbo_tel_no12(String extnbo_tel_no12){
		this.extnbo_tel_no12 = extnbo_tel_no12;
	}

	public void setExtnbo_tel_no13(String extnbo_tel_no13){
		this.extnbo_tel_no13 = extnbo_tel_no13;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResiclsfcdnm(String resiclsfcdnm){
		this.resiclsfcdnm = resiclsfcdnm;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setResitypecdnm(String resitypecdnm){
		this.resitypecdnm = resitypecdnm;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setBo_headcnfmdt(Timestamp bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setLastdlvcnfmyn(String lastdlvcnfmyn){
		this.lastdlvcnfmyn = lastdlvcnfmyn;
	}

	public void setLastdlvcnfmdt(Timestamp lastdlvcnfmdt){
		this.lastdlvcnfmdt = lastdlvcnfmdt;
	}

	public void setSubscnfmstatcdnm(String subscnfmstatcdnm){
		this.subscnfmstatcdnm = subscnfmstatcdnm;
	}

	public void setCns_empcnfmstatnm(String cns_empcnfmstatnm){
		this.cns_empcnfmstatnm = cns_empcnfmstatnm;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPrcmsg(String prcmsg){
		this.prcmsg = prcmsg;
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

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setNatnnm(String natnnm){
		this.natnnm = natnnm;
	}

	public void setAdvtpathcd(String advtpathcd){
		this.advtpathcd = advtpathcd;
	}

	public void setAdvtpathnm(String advtpathnm){
		this.advtpathnm = advtpathnm;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setFreeday(String freeday){
		this.freeday = freeday;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setItem(String item){
		this.item = item;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public long getQty(){
		return this.qty;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getRdr_extntypecdnm(){
		return this.rdr_extntypecdnm;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getExtnblngcdnm(){
		return this.extnblngcdnm;
	}

	public String getEmpclsfcdnm(){
		return this.empclsfcdnm;
	}

	public String getEmpdeptnm(){
		return this.empdeptnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getBodutycdnm(){
		return this.bodutycdnm;
	}

	public String getBoposicdnm(){
		return this.boposicdnm;
	}

	public String getStafclsfcdnm(){
		return this.stafclsfcdnm;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getRdr_extnbocdnm(){
		return this.rdr_extnbocdnm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getExtnid(){
		return this.extnid;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtntel1(){
		return this.extntel1;
	}

	public String getExtntel2(){
		return this.extntel2;
	}

	public String getExtntel3(){
		return this.extntel3;
	}

	public String getExtnptph_no1(){
		return this.extnptph_no1;
	}

	public String getExtnptph_no2(){
		return this.extnptph_no2;
	}

	public String getExtnptph_no3(){
		return this.extnptph_no3;
	}

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getPrvsubsmedicd(){
		return this.prvsubsmedicd;
	}

	public String getRshpclsfcd(){
		return this.rshpclsfcd;
	}

	public String getRshpclsfcdnm(){
		return this.rshpclsfcdnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getAplcpersemail(){
		return this.aplcpersemail;
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

	public String getAplcpersptph_no1(){
		return this.aplcpersptph_no1;
	}

	public String getAplcpersptph_no2(){
		return this.aplcpersptph_no2;
	}

	public String getAplcpersptph_no3(){
		return this.aplcpersptph_no3;
	}

	public String getAplcpersremk(){
		return this.aplcpersremk;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getRdremail(){
		return this.rdremail;
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

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getPymtflnm(){
		return this.pymtflnm;
	}

	public String getPymttel_no1(){
		return this.pymttel_no1;
	}

	public String getPymttel_no2(){
		return this.pymttel_no2;
	}

	public String getPymttel_no3(){
		return this.pymttel_no3;
	}

	public String getPymtptph_no1(){
		return this.pymtptph_no1;
	}

	public String getPymtptph_no2(){
		return this.pymtptph_no2;
	}

	public String getPymtptph_no3(){
		return this.pymtptph_no3;
	}

	public String getExstbocdnm(){
		return this.exstbocdnm;
	}

	public String getCorrbocdnm(){
		return this.corrbocdnm;
	}

	public String getBo_tel_no11(){
		return this.bo_tel_no11;
	}

	public String getBo_tel_no12(){
		return this.bo_tel_no12;
	}

	public String getBo_tel_no13(){
		return this.bo_tel_no13;
	}

	public String getExtnbo_tel_no11(){
		return this.extnbo_tel_no11;
	}

	public String getExtnbo_tel_no12(){
		return this.extnbo_tel_no12;
	}

	public String getExtnbo_tel_no13(){
		return this.extnbo_tel_no13;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResiclsfcdnm(){
		return this.resiclsfcdnm;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getResitypecdnm(){
		return this.resitypecdnm;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public Timestamp getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public String getLastdlvcnfmyn(){
		return this.lastdlvcnfmyn;
	}

	public Timestamp getLastdlvcnfmdt(){
		return this.lastdlvcnfmdt;
	}

	public String getSubscnfmstatcdnm(){
		return this.subscnfmstatcdnm;
	}

	public String getCns_empcnfmstatnm(){
		return this.cns_empcnfmstatnm;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPrcmsg(){
		return this.prcmsg;
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

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getNatnnm(){
		return this.natnnm;
	}

	public String getAdvtpathcd(){
		return this.advtpathcd;
	}

	public String getAdvtpathnm(){
		return this.advtpathnm;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getFreeday(){
		return this.freeday;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getItem(){
		return this.item;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_extndt = Util.checkString(cstmt.getString(12));
		this.rdr_extnno = Util.checkString(cstmt.getString(13));
		this.rdr_no = Util.checkString(cstmt.getString(14));
		this.medicd = Util.checkString(cstmt.getString(15));
		this.cntrno = Util.checkString(cstmt.getString(16));
		this.mangno = Util.checkString(cstmt.getString(17));
		this.medicdnm = Util.checkString(cstmt.getString(18));
		this.aplcdt = Util.checkString(cstmt.getString(19));
		this.qty = cstmt.getLong(20);
		this.aplcpathnm = Util.checkString(cstmt.getString(21));
		this.rdr_extntypecd = Util.checkString(cstmt.getString(22));
		this.rdr_extntypecdnm = Util.checkString(cstmt.getString(23));
		this.extnblngcd = Util.checkString(cstmt.getString(24));
		this.extnblngcdnm = Util.checkString(cstmt.getString(25));
		this.empclsfcdnm = Util.checkString(cstmt.getString(26));
		this.empdeptnm = Util.checkString(cstmt.getString(27));
		this.empseq = Util.checkString(cstmt.getString(28));
		this.bodutycdnm = Util.checkString(cstmt.getString(29));
		this.boposicdnm = Util.checkString(cstmt.getString(30));
		this.stafclsfcdnm = Util.checkString(cstmt.getString(31));
		this.stafno = Util.checkString(cstmt.getString(32));
		this.rdr_extnbocdnm = Util.checkString(cstmt.getString(33));
		this.boemp_no = Util.checkString(cstmt.getString(34));
		this.extnid = Util.checkString(cstmt.getString(35));
		this.extnflnm = Util.checkString(cstmt.getString(36));
		this.extntel1 = Util.checkString(cstmt.getString(37));
		this.extntel2 = Util.checkString(cstmt.getString(38));
		this.extntel3 = Util.checkString(cstmt.getString(39));
		this.extnptph_no1 = Util.checkString(cstmt.getString(40));
		this.extnptph_no2 = Util.checkString(cstmt.getString(41));
		this.extnptph_no3 = Util.checkString(cstmt.getString(42));
		this.extnprn = Util.checkString(cstmt.getString(43));
		this.prvsubsmedicd = Util.checkString(cstmt.getString(44));
		this.rshpclsfcd = Util.checkString(cstmt.getString(45));
		this.rshpclsfcdnm = Util.checkString(cstmt.getString(46));
		this.aplcpersnm = Util.checkString(cstmt.getString(47));
		this.aplcpersemail = Util.checkString(cstmt.getString(48));
		this.aplcperstel_no1 = Util.checkString(cstmt.getString(49));
		this.aplcperstel_no2 = Util.checkString(cstmt.getString(50));
		this.aplcperstel_no3 = Util.checkString(cstmt.getString(51));
		this.aplcpersptph_no1 = Util.checkString(cstmt.getString(52));
		this.aplcpersptph_no2 = Util.checkString(cstmt.getString(53));
		this.aplcpersptph_no3 = Util.checkString(cstmt.getString(54));
		this.aplcpersremk = Util.checkString(cstmt.getString(55));
		this.post_dlvyn = Util.checkString(cstmt.getString(56));
		this.rdrnm = Util.checkString(cstmt.getString(57));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(58));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(59));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(60));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(61));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(62));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(63));
		this.rdremail = Util.checkString(cstmt.getString(64));
		this.dlvzip = Util.checkString(cstmt.getString(65));
		this.dlvaddr = Util.checkString(cstmt.getString(66));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(67));
		this.dlvhopedt = Util.checkString(cstmt.getString(68));
		this.pymtflnm = Util.checkString(cstmt.getString(69));
		this.pymttel_no1 = Util.checkString(cstmt.getString(70));
		this.pymttel_no2 = Util.checkString(cstmt.getString(71));
		this.pymttel_no3 = Util.checkString(cstmt.getString(72));
		this.pymtptph_no1 = Util.checkString(cstmt.getString(73));
		this.pymtptph_no2 = Util.checkString(cstmt.getString(74));
		this.pymtptph_no3 = Util.checkString(cstmt.getString(75));
		this.exstbocdnm = Util.checkString(cstmt.getString(76));
		this.corrbocdnm = Util.checkString(cstmt.getString(77));
		this.bo_tel_no11 = Util.checkString(cstmt.getString(78));
		this.bo_tel_no12 = Util.checkString(cstmt.getString(79));
		this.bo_tel_no13 = Util.checkString(cstmt.getString(80));
		this.extnbo_tel_no11 = Util.checkString(cstmt.getString(81));
		this.extnbo_tel_no12 = Util.checkString(cstmt.getString(82));
		this.extnbo_tel_no13 = Util.checkString(cstmt.getString(83));
		this.resiclsfcd = Util.checkString(cstmt.getString(84));
		this.resiclsfcdnm = Util.checkString(cstmt.getString(85));
		this.resitypecd = Util.checkString(cstmt.getString(86));
		this.resitypecdnm = Util.checkString(cstmt.getString(87));
		this.bo_headcnfmyn = Util.checkString(cstmt.getString(88));
		this.bo_headcnfmdt = cstmt.getTimestamp(89);
		this.lastdlvcnfmyn = Util.checkString(cstmt.getString(90));
		this.lastdlvcnfmdt = cstmt.getTimestamp(91);
		this.subscnfmstatcdnm = Util.checkString(cstmt.getString(92));
		this.cns_empcnfmstatnm = Util.checkString(cstmt.getString(93));
		this.cns_empid = Util.checkString(cstmt.getString(94));
		this.cns_empnm = Util.checkString(cstmt.getString(95));
		this.remk = Util.checkString(cstmt.getString(96));
		this.prcmsg = Util.checkString(cstmt.getString(97));
		this.aplcperszip = Util.checkString(cstmt.getString(98));
		this.aplcpersaddr = Util.checkString(cstmt.getString(99));
		this.aplcpersdtlsaddr = Util.checkString(cstmt.getString(100));
		this.corrbocd = Util.checkString(cstmt.getString(101));
		this.natnnm = Util.checkString(cstmt.getString(102));
		this.advtpathcd = Util.checkString(cstmt.getString(103));
		this.advtpathnm = Util.checkString(cstmt.getString(104));
		this.valmm = Util.checkString(cstmt.getString(105));
		this.freeday = Util.checkString(cstmt.getString(106));
		this.aplcclsf = Util.checkString(cstmt.getString(107));
		this.item = Util.checkString(cstmt.getString(108));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_ON_RDR_EXTNDataSet ds = (SS_S_ON_RDR_EXTNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_extndt()%>
<%= ds.getRdr_extnno()%>
<%= ds.getRdr_no()%>
<%= ds.getMedicd()%>
<%= ds.getCntrno()%>
<%= ds.getMangno()%>
<%= ds.getMedicdnm()%>
<%= ds.getAplcdt()%>
<%= ds.getQty()%>
<%= ds.getAplcpathnm()%>
<%= ds.getRdr_extntypecd()%>
<%= ds.getRdr_extntypecdnm()%>
<%= ds.getExtnblngcd()%>
<%= ds.getExtnblngcdnm()%>
<%= ds.getEmpclsfcdnm()%>
<%= ds.getEmpdeptnm()%>
<%= ds.getEmpseq()%>
<%= ds.getBodutycdnm()%>
<%= ds.getBoposicdnm()%>
<%= ds.getStafclsfcdnm()%>
<%= ds.getStafno()%>
<%= ds.getRdr_extnbocdnm()%>
<%= ds.getBoemp_no()%>
<%= ds.getExtnid()%>
<%= ds.getExtnflnm()%>
<%= ds.getExtntel1()%>
<%= ds.getExtntel2()%>
<%= ds.getExtntel3()%>
<%= ds.getExtnptph_no1()%>
<%= ds.getExtnptph_no2()%>
<%= ds.getExtnptph_no3()%>
<%= ds.getExtnprn()%>
<%= ds.getPrvsubsmedicd()%>
<%= ds.getRshpclsfcd()%>
<%= ds.getRshpclsfcdnm()%>
<%= ds.getAplcpersnm()%>
<%= ds.getAplcpersemail()%>
<%= ds.getAplcperstel_no1()%>
<%= ds.getAplcperstel_no2()%>
<%= ds.getAplcperstel_no3()%>
<%= ds.getAplcpersptph_no1()%>
<%= ds.getAplcpersptph_no2()%>
<%= ds.getAplcpersptph_no3()%>
<%= ds.getAplcpersremk()%>
<%= ds.getPost_dlvyn()%>
<%= ds.getRdrnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getRdremail()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getDlvhopedt()%>
<%= ds.getPymtflnm()%>
<%= ds.getPymttel_no1()%>
<%= ds.getPymttel_no2()%>
<%= ds.getPymttel_no3()%>
<%= ds.getPymtptph_no1()%>
<%= ds.getPymtptph_no2()%>
<%= ds.getPymtptph_no3()%>
<%= ds.getExstbocdnm()%>
<%= ds.getCorrbocdnm()%>
<%= ds.getBo_tel_no11()%>
<%= ds.getBo_tel_no12()%>
<%= ds.getBo_tel_no13()%>
<%= ds.getExtnbo_tel_no11()%>
<%= ds.getExtnbo_tel_no12()%>
<%= ds.getExtnbo_tel_no13()%>
<%= ds.getResiclsfcd()%>
<%= ds.getResiclsfcdnm()%>
<%= ds.getResitypecd()%>
<%= ds.getResitypecdnm()%>
<%= ds.getBo_headcnfmyn()%>
<%= ds.getBo_headcnfmdt()%>
<%= ds.getLastdlvcnfmyn()%>
<%= ds.getLastdlvcnfmdt()%>
<%= ds.getSubscnfmstatcdnm()%>
<%= ds.getCns_empcnfmstatnm()%>
<%= ds.getCns_empid()%>
<%= ds.getCns_empnm()%>
<%= ds.getRemk()%>
<%= ds.getPrcmsg()%>
<%= ds.getAplcperszip()%>
<%= ds.getAplcpersaddr()%>
<%= ds.getAplcpersdtlsaddr()%>
<%= ds.getCorrbocd()%>
<%= ds.getNatnnm()%>
<%= ds.getAdvtpathcd()%>
<%= ds.getAdvtpathnm()%>
<%= ds.getValmm()%>
<%= ds.getFreeday()%>
<%= ds.getAplcclsf()%>
<%= ds.getItem()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 14 14:18:10 KST 2007 */