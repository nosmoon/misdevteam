/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_3761_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String pubc_dt;
	public String pubc_seq;
	public String sect;
	public String hndl_nm_cd;
	public String advt_cont;
	public String dn;
	public String cm;
	public String hndl_evlt_cd;
	public String points;
	public String other;
	public String remk;
	public String slcrg_remk;
	public String slcrg_nm;

	public AD_BAS_3761_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_seq(String pubc_seq){
		this.pubc_seq = pubc_seq;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setHndl_nm_cd(String hndl_nm_cd){
		this.hndl_nm_cd = hndl_nm_cd;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setHndl_evlt_cd(String hndl_evlt_cd){
		this.hndl_evlt_cd = hndl_evlt_cd;
	}

	public void setPoints(String points){
		this.points = points;
	}

	public void setOther(String other){
		this.other = other;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlcrg_remk(String slcrg_remk){
		this.slcrg_remk = slcrg_remk;
	}

	public void setSlcrg_nm(String slcrg_nm){
		this.slcrg_nm = slcrg_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_seq(){
		return this.pubc_seq;
	}

	public String getSect(){
		return this.sect;
	}

	public String getHndl_nm_cd(){
		return this.hndl_nm_cd;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getHndl_evlt_cd(){
		return this.hndl_evlt_cd;
	}

	public String getPoints(){
		return this.points;
	}

	public String getOther(){
		return this.other;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlcrg_remk(){
		return this.slcrg_remk;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}
}

/* 작성시간 : Wed Jan 14 15:49:33 KST 2015 */