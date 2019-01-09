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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_5400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String buy_lent_clsf;
	public String control;
	public String car_no;
	public String car_modl;
	public String mnft_cmpy;
	public String engn_dsplt;
	public String engnclsf;
	public String gearbx;
	public String rid_nops;
	public String oil_kind;
	public String own_clsf;
	public String use_usag;
	public String cmpy_mang_nm;
	public String use_pers;
	public String buy_dt;
	public String buy_amt;
	public String carp_car_clsf;
	public String carp_car_dt;
	public String remk;

	public MT_ETCCAR_5400_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBuy_lent_clsf(String buy_lent_clsf){
		this.buy_lent_clsf = buy_lent_clsf;
	}

	public void setControl(String control){
		this.control = control;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCar_modl(String car_modl){
		this.car_modl = car_modl;
	}

	public void setMnft_cmpy(String mnft_cmpy){
		this.mnft_cmpy = mnft_cmpy;
	}

	public void setEngn_dsplt(String engn_dsplt){
		this.engn_dsplt = engn_dsplt;
	}

	public void setEngnclsf(String engnclsf){
		this.engnclsf = engnclsf;
	}

	public void setGearbx(String gearbx){
		this.gearbx = gearbx;
	}

	public void setRid_nops(String rid_nops){
		this.rid_nops = rid_nops;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public void setOwn_clsf(String own_clsf){
		this.own_clsf = own_clsf;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setBuy_amt(String buy_amt){
		this.buy_amt = buy_amt;
	}

	public void setCarp_car_clsf(String carp_car_clsf){
		this.carp_car_clsf = carp_car_clsf;
	}

	public void setCarp_car_dt(String carp_car_dt){
		this.carp_car_dt = carp_car_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBuy_lent_clsf(){
		return this.buy_lent_clsf;
	}

	public String getControl(){
		return this.control;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCar_modl(){
		return this.car_modl;
	}

	public String getMnft_cmpy(){
		return this.mnft_cmpy;
	}

	public String getEngn_dsplt(){
		return this.engn_dsplt;
	}

	public String getEngnclsf(){
		return this.engnclsf;
	}

	public String getGearbx(){
		return this.gearbx;
	}

	public String getRid_nops(){
		return this.rid_nops;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getOwn_clsf(){
		return this.own_clsf;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getBuy_amt(){
		return this.buy_amt;
	}

	public String getCarp_car_clsf(){
		return this.carp_car_clsf;
	}

	public String getCarp_car_dt(){
		return this.carp_car_dt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Apr 24 10:19:13 KST 2009 */