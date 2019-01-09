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


public class AD_BAS_3710_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String pubc_dt;
	public String pubc_seq;
	public String sect;
	public String sect_nm_cd;
	public String advt_cont;
	public String dn;
	public String cm;
	public String pubc_asse_cd;
	public String indt_clsf;
	public String remk;
	public String slcrg_nm;

	public AD_BAS_3710_LCURLIST5Record(){}

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

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
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

	public void setPubc_asse_cd(String pubc_asse_cd){
		this.pubc_asse_cd = pubc_asse_cd;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
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

	public String getPubc_asse_cd(){
		return this.pubc_asse_cd;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}
}

/* 작성시간 : Tue Dec 19 15:19:27 KST 2017 */