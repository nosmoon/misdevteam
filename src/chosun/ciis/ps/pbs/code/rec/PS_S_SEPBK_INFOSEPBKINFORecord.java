/***************************************************************************************************
 * 파일명   : PS_S_SEPBK_INFODM.java
 * 기능     : 코드-단행본 등록 상세내역
 * 작성일자 : 2004-09-21
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드-단행본 등록 상세내역
 */

public class PS_S_SEPBK_INFOSEPBKINFORecord extends java.lang.Object implements java.io.Serializable{

	public String sep_bookcd;
	public String medicd;
	public String mediser_no;
	public String medi_clsf;
	public String sep_bookcdnm;
	public String issuclsf;
	public String basiyymm;
	public int uprc;
	public int subsuprc;
	public int dcrate;
	public String contclascd;
	public String author;
	public String type;
	public String std;
	public int page;
	public String covermodl;
	public String reg_dt;
	public int extdtms;
	public String absenceyn;
	public String absencedt;
	public String absenceprocdt;
	public String cmpycd;
	public int bundunit;
	public int unitmidlqunt;
	public int pjbasimidlqunt;
	public String sericd;
	public String medinm;
	public String issuclsfnm;
	public String memo;
	public String endbasiyymm;

	public PS_S_SEPBK_INFOSEPBKINFORecord(){}

	public void setSep_bookcd(String sep_bookcd){
		this.sep_bookcd = sep_bookcd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setSep_bookcdnm(String sep_bookcdnm){
		this.sep_bookcdnm = sep_bookcdnm;
	}

	public void setIssuclsf(String issuclsf){
		this.issuclsf = issuclsf;
	}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setDcrate(int dcrate){
		this.dcrate = dcrate;
	}

	public void setContclascd(String contclascd){
		this.contclascd = contclascd;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setPage(int page){
		this.page = page;
	}

	public void setCovermodl(String covermodl){
		this.covermodl = covermodl;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setExtdtms(int extdtms){
		this.extdtms = extdtms;
	}

	public void setAbsenceyn(String absenceyn){
		this.absenceyn = absenceyn;
	}

	public void setAbsencedt(String absencedt){
		this.absencedt = absencedt;
	}

	public void setAbsenceprocdt(String absenceprocdt){
		this.absenceprocdt = absenceprocdt;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBundunit(int bundunit){
		this.bundunit = bundunit;
	}

	public void setUnitmidlqunt(int unitmidlqunt){
		this.unitmidlqunt = unitmidlqunt;
	}

	public void setPjbasimidlqunt(int pjbasimidlqunt){
		this.pjbasimidlqunt = pjbasimidlqunt;
	}

	public void setSericd(String sericd){
		this.sericd = sericd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setIssuclsfnm(String issuclsfnm){
		this.issuclsfnm = issuclsfnm;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setEndbasiyymm(String endbasiyymm){
		this.endbasiyymm = endbasiyymm;
	}

	public String getSep_bookcd(){
		return this.sep_bookcd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getSep_bookcdnm(){
		return this.sep_bookcdnm;
	}

	public String getIssuclsf(){
		return this.issuclsf;
	}

	public String getBasiyymm(){
		return this.basiyymm;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public int getDcrate(){
		return this.dcrate;
	}

	public String getContclascd(){
		return this.contclascd;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getType(){
		return this.type;
	}

	public String getStd(){
		return this.std;
	}

	public int getPage(){
		return this.page;
	}

	public String getCovermodl(){
		return this.covermodl;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public int getExtdtms(){
		return this.extdtms;
	}

	public String getAbsenceyn(){
		return this.absenceyn;
	}

	public String getAbsencedt(){
		return this.absencedt;
	}

	public String getAbsenceprocdt(){
		return this.absenceprocdt;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public int getBundunit(){
		return this.bundunit;
	}

	public int getUnitmidlqunt(){
		return this.unitmidlqunt;
	}

	public int getPjbasimidlqunt(){
		return this.pjbasimidlqunt;
	}

	public String getSericd(){
		return this.sericd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getIssuclsfnm(){
		return this.issuclsfnm;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getEndbasiyymm(){
		return this.endbasiyymm;
	}
}

/* 작성시간 : Mon Jan 31 14:22:14 KST 2005 */