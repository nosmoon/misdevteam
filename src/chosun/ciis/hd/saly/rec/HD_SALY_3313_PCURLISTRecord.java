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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3313_PCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yy;
	public String no;
	public String dt;
	public String gugcd;
	public String gugnm;
	public String bunm;
	public String buseocd;
	public String buseonm;
	public String jccd2_jg_hobong;
	public String iwgeub;
	public String ybgbg_25;
	public String ybjmg_25;
	public String gg1tsgy;
	public String gg1bggy;
	public String gbbgggg;
	public String gbjmgeub;
	public String sabeon;
	public String name;
	public String bw;
	public String soin;
	public String noin;
	public String kro;
	public String jae;
	public String jhgbsd;
	public String jhbssd;
	public String bjhilsd;
	public String hgilbssd;
	public String jcilbssd;
	public String jclsd;
	public String cyygsd;
	public String jpbsd;
	public String twcjbi;
	public String jwgogy;
	public String sggy;
	public String sgsy;
	public String jgtot;
	public String ggsae;
	public String juminsae;
	public String jsggsae;
	public String jsjuminsae;
	public String gmyg;
	public String erbhr;
	public String gybhr;
	public String jcbi;
	public String bankdb;
	public String urigg;
	public String snbjkg;
	public String jgwhb;
	public String rdjhb;
	public String dchb;
	public String cchb;
	public String gajgg_1;
	public String gajgg_2;
	public String swgbnm;
	public String gyar;
	public String gjcak;
	public String chainjga;
	public String gtgj;
	public String cnt;
	public String nts;
	public String dty_cd;
	public String dty_nm;
	public String emp_dtls_clsf;
	public String incm_tax;
	public String res_tax;
	public String dty_alon;
	public String care_alon;
	public String food_alon;
	public String lang_study_splamt;
	public String rslt_alon_saly;
	public String scl_exps_alon_saly;
	public String etc_alon_saly;
	public String bns_saly;
	public String rslt_alon_exst_pay;
	public String scl_exps_alon_exst_pay;
	public String etc_alon_exst_pay;
	public String bns_exst_pay;
	public String sply_chk_fee;
	public String anvy_pay_fee;
	public String non_tax_food_alon;
	public String non_tax_care_alon;
	public String posk_alon;
	public String rdr_extn_alon;
	public String vaca_fee;
	public String park_vilt_sply_fee;
	public String clamt_alon;
	public String prz_fee;
	public String hody_duty_alon;
	public String prsn_pens_dduc;

	public HD_SALY_3313_PCURLISTRecord(){}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setNo(String no){
		this.no = no;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setGugcd(String gugcd){
		this.gugcd = gugcd;
	}

	public void setGugnm(String gugnm){
		this.gugnm = gugnm;
	}

	public void setBunm(String bunm){
		this.bunm = bunm;
	}

	public void setBuseocd(String buseocd){
		this.buseocd = buseocd;
	}

	public void setBuseonm(String buseonm){
		this.buseonm = buseonm;
	}

	public void setJccd2_jg_hobong(String jccd2_jg_hobong){
		this.jccd2_jg_hobong = jccd2_jg_hobong;
	}

	public void setIwgeub(String iwgeub){
		this.iwgeub = iwgeub;
	}

	public void setYbgbg_25(String ybgbg_25){
		this.ybgbg_25 = ybgbg_25;
	}

	public void setYbjmg_25(String ybjmg_25){
		this.ybjmg_25 = ybjmg_25;
	}

	public void setGg1tsgy(String gg1tsgy){
		this.gg1tsgy = gg1tsgy;
	}

	public void setGg1bggy(String gg1bggy){
		this.gg1bggy = gg1bggy;
	}

	public void setGbbgggg(String gbbgggg){
		this.gbbgggg = gbbgggg;
	}

	public void setGbjmgeub(String gbjmgeub){
		this.gbjmgeub = gbjmgeub;
	}

	public void setSabeon(String sabeon){
		this.sabeon = sabeon;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setBw(String bw){
		this.bw = bw;
	}

	public void setSoin(String soin){
		this.soin = soin;
	}

	public void setNoin(String noin){
		this.noin = noin;
	}

	public void setKro(String kro){
		this.kro = kro;
	}

	public void setJae(String jae){
		this.jae = jae;
	}

	public void setJhgbsd(String jhgbsd){
		this.jhgbsd = jhgbsd;
	}

	public void setJhbssd(String jhbssd){
		this.jhbssd = jhbssd;
	}

	public void setBjhilsd(String bjhilsd){
		this.bjhilsd = bjhilsd;
	}

	public void setHgilbssd(String hgilbssd){
		this.hgilbssd = hgilbssd;
	}

	public void setJcilbssd(String jcilbssd){
		this.jcilbssd = jcilbssd;
	}

	public void setJclsd(String jclsd){
		this.jclsd = jclsd;
	}

	public void setCyygsd(String cyygsd){
		this.cyygsd = cyygsd;
	}

	public void setJpbsd(String jpbsd){
		this.jpbsd = jpbsd;
	}

	public void setTwcjbi(String twcjbi){
		this.twcjbi = twcjbi;
	}

	public void setJwgogy(String jwgogy){
		this.jwgogy = jwgogy;
	}

	public void setSggy(String sggy){
		this.sggy = sggy;
	}

	public void setSgsy(String sgsy){
		this.sgsy = sgsy;
	}

	public void setJgtot(String jgtot){
		this.jgtot = jgtot;
	}

	public void setGgsae(String ggsae){
		this.ggsae = ggsae;
	}

	public void setJuminsae(String juminsae){
		this.juminsae = juminsae;
	}

	public void setJsggsae(String jsggsae){
		this.jsggsae = jsggsae;
	}

	public void setJsjuminsae(String jsjuminsae){
		this.jsjuminsae = jsjuminsae;
	}

	public void setGmyg(String gmyg){
		this.gmyg = gmyg;
	}

	public void setErbhr(String erbhr){
		this.erbhr = erbhr;
	}

	public void setGybhr(String gybhr){
		this.gybhr = gybhr;
	}

	public void setJcbi(String jcbi){
		this.jcbi = jcbi;
	}

	public void setBankdb(String bankdb){
		this.bankdb = bankdb;
	}

	public void setUrigg(String urigg){
		this.urigg = urigg;
	}

	public void setSnbjkg(String snbjkg){
		this.snbjkg = snbjkg;
	}

	public void setJgwhb(String jgwhb){
		this.jgwhb = jgwhb;
	}

	public void setRdjhb(String rdjhb){
		this.rdjhb = rdjhb;
	}

	public void setDchb(String dchb){
		this.dchb = dchb;
	}

	public void setCchb(String cchb){
		this.cchb = cchb;
	}

	public void setGajgg_1(String gajgg_1){
		this.gajgg_1 = gajgg_1;
	}

	public void setGajgg_2(String gajgg_2){
		this.gajgg_2 = gajgg_2;
	}

	public void setSwgbnm(String swgbnm){
		this.swgbnm = swgbnm;
	}

	public void setGyar(String gyar){
		this.gyar = gyar;
	}

	public void setGjcak(String gjcak){
		this.gjcak = gjcak;
	}

	public void setChainjga(String chainjga){
		this.chainjga = chainjga;
	}

	public void setGtgj(String gtgj){
		this.gtgj = gtgj;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setNts(String nts){
		this.nts = nts;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}

	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}

	public void setFood_alon(String food_alon){
		this.food_alon = food_alon;
	}

	public void setLang_study_splamt(String lang_study_splamt){
		this.lang_study_splamt = lang_study_splamt;
	}

	public void setRslt_alon_saly(String rslt_alon_saly){
		this.rslt_alon_saly = rslt_alon_saly;
	}

	public void setScl_exps_alon_saly(String scl_exps_alon_saly){
		this.scl_exps_alon_saly = scl_exps_alon_saly;
	}

	public void setEtc_alon_saly(String etc_alon_saly){
		this.etc_alon_saly = etc_alon_saly;
	}

	public void setBns_saly(String bns_saly){
		this.bns_saly = bns_saly;
	}

	public void setRslt_alon_exst_pay(String rslt_alon_exst_pay){
		this.rslt_alon_exst_pay = rslt_alon_exst_pay;
	}

	public void setScl_exps_alon_exst_pay(String scl_exps_alon_exst_pay){
		this.scl_exps_alon_exst_pay = scl_exps_alon_exst_pay;
	}

	public void setEtc_alon_exst_pay(String etc_alon_exst_pay){
		this.etc_alon_exst_pay = etc_alon_exst_pay;
	}

	public void setBns_exst_pay(String bns_exst_pay){
		this.bns_exst_pay = bns_exst_pay;
	}

	public void setSply_chk_fee(String sply_chk_fee){
		this.sply_chk_fee = sply_chk_fee;
	}

	public void setAnvy_pay_fee(String anvy_pay_fee){
		this.anvy_pay_fee = anvy_pay_fee;
	}

	public void setNon_tax_food_alon(String non_tax_food_alon){
		this.non_tax_food_alon = non_tax_food_alon;
	}

	public void setNon_tax_care_alon(String non_tax_care_alon){
		this.non_tax_care_alon = non_tax_care_alon;
	}

	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}

	public void setRdr_extn_alon(String rdr_extn_alon){
		this.rdr_extn_alon = rdr_extn_alon;
	}

	public void setVaca_fee(String vaca_fee){
		this.vaca_fee = vaca_fee;
	}

	public void setPark_vilt_sply_fee(String park_vilt_sply_fee){
		this.park_vilt_sply_fee = park_vilt_sply_fee;
	}

	public void setClamt_alon(String clamt_alon){
		this.clamt_alon = clamt_alon;
	}

	public void setPrz_fee(String prz_fee){
		this.prz_fee = prz_fee;
	}

	public void setHody_duty_alon(String hody_duty_alon){
		this.hody_duty_alon = hody_duty_alon;
	}

	public void setPrsn_pens_dduc(String prsn_pens_dduc){
		this.prsn_pens_dduc = prsn_pens_dduc;
	}

	public String getYy(){
		return this.yy;
	}

	public String getNo(){
		return this.no;
	}

	public String getDt(){
		return this.dt;
	}

	public String getGugcd(){
		return this.gugcd;
	}

	public String getGugnm(){
		return this.gugnm;
	}

	public String getBunm(){
		return this.bunm;
	}

	public String getBuseocd(){
		return this.buseocd;
	}

	public String getBuseonm(){
		return this.buseonm;
	}

	public String getJccd2_jg_hobong(){
		return this.jccd2_jg_hobong;
	}

	public String getIwgeub(){
		return this.iwgeub;
	}

	public String getYbgbg_25(){
		return this.ybgbg_25;
	}

	public String getYbjmg_25(){
		return this.ybjmg_25;
	}

	public String getGg1tsgy(){
		return this.gg1tsgy;
	}

	public String getGg1bggy(){
		return this.gg1bggy;
	}

	public String getGbbgggg(){
		return this.gbbgggg;
	}

	public String getGbjmgeub(){
		return this.gbjmgeub;
	}

	public String getSabeon(){
		return this.sabeon;
	}

	public String getName(){
		return this.name;
	}

	public String getBw(){
		return this.bw;
	}

	public String getSoin(){
		return this.soin;
	}

	public String getNoin(){
		return this.noin;
	}

	public String getKro(){
		return this.kro;
	}

	public String getJae(){
		return this.jae;
	}

	public String getJhgbsd(){
		return this.jhgbsd;
	}

	public String getJhbssd(){
		return this.jhbssd;
	}

	public String getBjhilsd(){
		return this.bjhilsd;
	}

	public String getHgilbssd(){
		return this.hgilbssd;
	}

	public String getJcilbssd(){
		return this.jcilbssd;
	}

	public String getJclsd(){
		return this.jclsd;
	}

	public String getCyygsd(){
		return this.cyygsd;
	}

	public String getJpbsd(){
		return this.jpbsd;
	}

	public String getTwcjbi(){
		return this.twcjbi;
	}

	public String getJwgogy(){
		return this.jwgogy;
	}

	public String getSggy(){
		return this.sggy;
	}

	public String getSgsy(){
		return this.sgsy;
	}

	public String getJgtot(){
		return this.jgtot;
	}

	public String getGgsae(){
		return this.ggsae;
	}

	public String getJuminsae(){
		return this.juminsae;
	}

	public String getJsggsae(){
		return this.jsggsae;
	}

	public String getJsjuminsae(){
		return this.jsjuminsae;
	}

	public String getGmyg(){
		return this.gmyg;
	}

	public String getErbhr(){
		return this.erbhr;
	}

	public String getGybhr(){
		return this.gybhr;
	}

	public String getJcbi(){
		return this.jcbi;
	}

	public String getBankdb(){
		return this.bankdb;
	}

	public String getUrigg(){
		return this.urigg;
	}

	public String getSnbjkg(){
		return this.snbjkg;
	}

	public String getJgwhb(){
		return this.jgwhb;
	}

	public String getRdjhb(){
		return this.rdjhb;
	}

	public String getDchb(){
		return this.dchb;
	}

	public String getCchb(){
		return this.cchb;
	}

	public String getGajgg_1(){
		return this.gajgg_1;
	}

	public String getGajgg_2(){
		return this.gajgg_2;
	}

	public String getSwgbnm(){
		return this.swgbnm;
	}

	public String getGyar(){
		return this.gyar;
	}

	public String getGjcak(){
		return this.gjcak;
	}

	public String getChainjga(){
		return this.chainjga;
	}

	public String getGtgj(){
		return this.gtgj;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getNts(){
		return this.nts;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getDty_alon(){
		return this.dty_alon;
	}

	public String getCare_alon(){
		return this.care_alon;
	}

	public String getFood_alon(){
		return this.food_alon;
	}

	public String getLang_study_splamt(){
		return this.lang_study_splamt;
	}

	public String getRslt_alon_saly(){
		return this.rslt_alon_saly;
	}

	public String getScl_exps_alon_saly(){
		return this.scl_exps_alon_saly;
	}

	public String getEtc_alon_saly(){
		return this.etc_alon_saly;
	}

	public String getBns_saly(){
		return this.bns_saly;
	}

	public String getRslt_alon_exst_pay(){
		return this.rslt_alon_exst_pay;
	}

	public String getScl_exps_alon_exst_pay(){
		return this.scl_exps_alon_exst_pay;
	}

	public String getEtc_alon_exst_pay(){
		return this.etc_alon_exst_pay;
	}

	public String getBns_exst_pay(){
		return this.bns_exst_pay;
	}

	public String getSply_chk_fee(){
		return this.sply_chk_fee;
	}

	public String getAnvy_pay_fee(){
		return this.anvy_pay_fee;
	}

	public String getNon_tax_food_alon(){
		return this.non_tax_food_alon;
	}

	public String getNon_tax_care_alon(){
		return this.non_tax_care_alon;
	}

	public String getPosk_alon(){
		return this.posk_alon;
	}

	public String getRdr_extn_alon(){
		return this.rdr_extn_alon;
	}

	public String getVaca_fee(){
		return this.vaca_fee;
	}

	public String getPark_vilt_sply_fee(){
		return this.park_vilt_sply_fee;
	}

	public String getClamt_alon(){
		return this.clamt_alon;
	}

	public String getPrz_fee(){
		return this.prz_fee;
	}

	public String getHody_duty_alon(){
		return this.hody_duty_alon;
	}

	public String getPrsn_pens_dduc(){
		return this.prsn_pens_dduc;
	}
}

/* 작성시간 : Fri Sep 06 11:05:02 KST 2013 */