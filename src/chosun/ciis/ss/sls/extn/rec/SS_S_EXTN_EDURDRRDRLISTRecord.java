/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 상세 조회  
* 작성일자 : 2009-05-28
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 에듀/제휴 확장 상세 조회  
 */

public class SS_S_EXTN_EDURDRRDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String type1;
	public String type2;
	public String insttnm;
	public String nm;
	public String protpersnm;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String tel_no;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String subsyn;
	public String dlvhopedd;
	public String bocd;
	public String rdrcnfm;
	public String procstat;
	public String resn;
	public String remk;
	public String dept_cd;
	public String part_cd;
	public String area_cd;
	public String cmpycd;
	public String insttcd;
	public String seq;
	public String rdr_extndt;
	public String rdr_extnno;

	public SS_S_EXTN_EDURDRRDRLISTRecord(){}

	public void setType1(String type1){
		this.type1 = type1;
	}

	public void setType2(String type2){
		this.type2 = type2;
	}

	public void setInsttnm(String insttnm){
		this.insttnm = insttnm;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setProtpersnm(String protpersnm){
		this.protpersnm = protpersnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
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

	public void setSubsyn(String subsyn){
		this.subsyn = subsyn;
	}

	public void setDlvhopedd(String dlvhopedd){
		this.dlvhopedd = dlvhopedd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdrcnfm(String rdrcnfm){
		this.rdrcnfm = rdrcnfm;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setResn(String resn){
		this.resn = resn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public String getType1(){
		return this.type1;
	}

	public String getType2(){
		return this.type2;
	}

	public String getInsttnm(){
		return this.insttnm;
	}

	public String getNm(){
		return this.nm;
	}

	public String getProtpersnm(){
		return this.protpersnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getTel_no(){
		return this.tel_no;
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

	public String getSubsyn(){
		return this.subsyn;
	}

	public String getDlvhopedd(){
		return this.dlvhopedd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdrcnfm(){
		return this.rdrcnfm;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getResn(){
		return this.resn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}
}

/* 작성시간 : Fri May 29 12:24:24 KST 2009 */