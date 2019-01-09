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


public class SS_P_SUSP_DEFSUSPDEFCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String deptcd;
	public String partnm;
	public String partcd;
	public String areanm;
	public String areacd;
	public String bonm;
	public String bocd;
	public String def_type;
	public String aplcdt;
	public String rdr_no;
	public String rdrnm;
	public String medinm;
	public String subsqty;
	public String valmm;
	public String rdr_extndt;
	public String subsfr_dt;
	public String aplcpathnm;
	public String onlmembid;
	public String agentnm;
	public String cns_stat;
	public String cns_cnfmdt;
	public String bo_stat;
	public String bo_cnfmdt;
	public String remk;
	public String svccd;
	public String svcmm;
	public String giftcard;
	public String set_medicd;

	public SS_P_SUSP_DEFSUSPDEFCURRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
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

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setAgentnm(String agentnm){
		this.agentnm = agentnm;
	}

	public void setCns_stat(String cns_stat){
		this.cns_stat = cns_stat;
	}

	public void setCns_cnfmdt(String cns_cnfmdt){
		this.cns_cnfmdt = cns_cnfmdt;
	}

	public void setBo_stat(String bo_stat){
		this.bo_stat = bo_stat;
	}

	public void setBo_cnfmdt(String bo_cnfmdt){
		this.bo_cnfmdt = bo_cnfmdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSvccd(String svccd){
		this.svccd = svccd;
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

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getPartcd(){
		return this.partcd;
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

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getAgentnm(){
		return this.agentnm;
	}

	public String getCns_stat(){
		return this.cns_stat;
	}

	public String getCns_cnfmdt(){
		return this.cns_cnfmdt;
	}

	public String getBo_stat(){
		return this.bo_stat;
	}

	public String getBo_cnfmdt(){
		return this.bo_cnfmdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSvccd(){
		return this.svccd;
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
}

/* 작성시간 : Tue Mar 03 19:00:46 KST 2015 */