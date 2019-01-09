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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_SUSP_DEFSUSPDEFCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String areacd;
	public String bonm;
	public String bocd;
	public String def_type;
	public String rdrnm;
	public String rdr_no;
	public String medinm;
	public String aplcpathnm;
	public String rdr_extndt;
	public String subsfr_dt;
	public String subsqty;
	public String agentnm;
	public String cns_stat;
	public String aplcdt;
	public String aplcno;

	public SS_L_SUSP_DEFSUSPDEFCURRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDef_type(String def_type){
		this.def_type = def_type;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}
	
	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}
	
	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setAgentnm(String agentnm){
		this.agentnm = agentnm;
	}

	public void setCns_stat(String cns_stat){
		this.cns_stat = cns_stat;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
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

	public String getAreacd(){
		return this.areacd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}
	
	public String getDef_type(){
		return this.def_type;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}
	
	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}
	
	public String getSubsqty(){
		return this.subsqty;
	}

	public String getAgentnm(){
		return this.agentnm;
	}

	public String getCns_stat(){
		return this.cns_stat;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}
}

/* 작성시간 : Thu Feb 26 18:14:58 KST 2015 */