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


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_L_BOSENDPCONDCURCOMMLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String yymm;
	public String medicd;
	public String rdr_extnaplc;
	public String rdr_extnemp;
	public String rdr_extnstaf;
	public String rdr_extnrdr_movm;
	public String rdr_extnhdqt;
	public String rdr_extnexg;
	public String rdr_extncnvs;
	public String rdr_extnetc;
	public String rdr_extnrate;
	public String suspmovm;
	public String susprefu;
	public String suspothnwsp;
	public String suspetc;
	public String suspetc1;
	public String suspetc2;
	public String suspetc3;
	public String suspetc4;
	public String susprate;
	public String suspaplc;
	public String suspemp;
	public String suspstaf;
	public String susprdr_movm;
	public String susphdqt;
	public String suspexg;
	public String suspcnvsrdr_extn;
	public String suspetcrdr_extn;
	public String thmmsendqty;
	public String thmmvalqty;
	public String aftcnt1;
	public String aftcnt2;
	public String aftcnt3;
	public String aftcnt4;
	public String aftcnt5;
	public String aftcnt6;
	public String excsaftcnt6;
	public String aptqty;
	public String villaqty;
	public String housqty;
	public String offi_roomqty;
	public String shopqty;
	public String etcqty;
	public String pub_infonwsp;
	public String hdqt_dntnwsp;
	public String bodntnwsp;
	public String frc_thrwnwsp;
	public String etcfreenwsp;
	public String resvnwsp;
	public String cupn;
	public String thmmno_valqty;
	public String thmmqty;
	public String nowun_recpqty;
	public String medaqty;
	public String re_freeqty;
	public String lossqty;
	public String ppymqty;
	public String temp_stopqty;
	public String now_un_recp_amt;
	public String thmm_amt;
	public String thmmdscnamt;
	public String thmmpost_dlvfee;
	public String meda_amt;
	public String re_freeamt;
	public String lossamt;
	public String ppymamt;
	public String temp_stopamt;
	public String giroclamt;
	public String vistclamt;
	public String giroauto_shiftclamt;
	public String docard_shiftclamt;
	public String gnrcard_shiftclamt;
	public String onlsetlclamt;
	public String etcclamt;
	public String un_recp_repm;
	public String new_repm;
	public String pre_repm;
	public String arealeafclamt;
	public String teampreisleafclamt;
	public String incmgpers;
	public String incmgdt;
	public String chgpers;
	public String chgdt;
	public String thmmval_adsc_qty;
	public String thmmval_ndsc_qty;

	public SS_L_BOSENDPCONDCURCOMMLIST2Record(){}

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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdr_extnaplc(String rdr_extnaplc){
		this.rdr_extnaplc = rdr_extnaplc;
	}

	public void setRdr_extnemp(String rdr_extnemp){
		this.rdr_extnemp = rdr_extnemp;
	}

	public void setRdr_extnstaf(String rdr_extnstaf){
		this.rdr_extnstaf = rdr_extnstaf;
	}

	public void setRdr_extnrdr_movm(String rdr_extnrdr_movm){
		this.rdr_extnrdr_movm = rdr_extnrdr_movm;
	}

	public void setRdr_extnhdqt(String rdr_extnhdqt){
		this.rdr_extnhdqt = rdr_extnhdqt;
	}

	public void setRdr_extnexg(String rdr_extnexg){
		this.rdr_extnexg = rdr_extnexg;
	}

	public void setRdr_extncnvs(String rdr_extncnvs){
		this.rdr_extncnvs = rdr_extncnvs;
	}

	public void setRdr_extnetc(String rdr_extnetc){
		this.rdr_extnetc = rdr_extnetc;
	}

	public void setRdr_extnrate(String rdr_extnrate){
		this.rdr_extnrate = rdr_extnrate;
	}

	public void setSuspmovm(String suspmovm){
		this.suspmovm = suspmovm;
	}

	public void setSusprefu(String susprefu){
		this.susprefu = susprefu;
	}

	public void setSuspothnwsp(String suspothnwsp){
		this.suspothnwsp = suspothnwsp;
	}

	public void setSuspetc(String suspetc){
		this.suspetc = suspetc;
	}

	public void setSuspetc1(String suspetc1){
		this.suspetc1 = suspetc1;
	}

	public void setSuspetc2(String suspetc2){
		this.suspetc2 = suspetc2;
	}

	public void setSuspetc3(String suspetc3){
		this.suspetc3 = suspetc3;
	}

	public void setSuspetc4(String suspetc4){
		this.suspetc4 = suspetc4;
	}

	public void setSusprate(String susprate){
		this.susprate = susprate;
	}

	public void setSuspaplc(String suspaplc){
		this.suspaplc = suspaplc;
	}

	public void setSuspemp(String suspemp){
		this.suspemp = suspemp;
	}

	public void setSuspstaf(String suspstaf){
		this.suspstaf = suspstaf;
	}

	public void setSusprdr_movm(String susprdr_movm){
		this.susprdr_movm = susprdr_movm;
	}

	public void setSusphdqt(String susphdqt){
		this.susphdqt = susphdqt;
	}

	public void setSuspexg(String suspexg){
		this.suspexg = suspexg;
	}

	public void setSuspcnvsrdr_extn(String suspcnvsrdr_extn){
		this.suspcnvsrdr_extn = suspcnvsrdr_extn;
	}

	public void setSuspetcrdr_extn(String suspetcrdr_extn){
		this.suspetcrdr_extn = suspetcrdr_extn;
	}

	public void setThmmsendqty(String thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setThmmvalqty(String thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setAftcnt1(String aftcnt1){
		this.aftcnt1 = aftcnt1;
	}

	public void setAftcnt2(String aftcnt2){
		this.aftcnt2 = aftcnt2;
	}

	public void setAftcnt3(String aftcnt3){
		this.aftcnt3 = aftcnt3;
	}

	public void setAftcnt4(String aftcnt4){
		this.aftcnt4 = aftcnt4;
	}

	public void setAftcnt5(String aftcnt5){
		this.aftcnt5 = aftcnt5;
	}

	public void setAftcnt6(String aftcnt6){
		this.aftcnt6 = aftcnt6;
	}

	public void setExcsaftcnt6(String excsaftcnt6){
		this.excsaftcnt6 = excsaftcnt6;
	}

	public void setAptqty(String aptqty){
		this.aptqty = aptqty;
	}

	public void setVillaqty(String villaqty){
		this.villaqty = villaqty;
	}

	public void setHousqty(String housqty){
		this.housqty = housqty;
	}

	public void setOffi_roomqty(String offi_roomqty){
		this.offi_roomqty = offi_roomqty;
	}

	public void setShopqty(String shopqty){
		this.shopqty = shopqty;
	}

	public void setEtcqty(String etcqty){
		this.etcqty = etcqty;
	}

	public void setPub_infonwsp(String pub_infonwsp){
		this.pub_infonwsp = pub_infonwsp;
	}

	public void setHdqt_dntnwsp(String hdqt_dntnwsp){
		this.hdqt_dntnwsp = hdqt_dntnwsp;
	}

	public void setBodntnwsp(String bodntnwsp){
		this.bodntnwsp = bodntnwsp;
	}

	public void setFrc_thrwnwsp(String frc_thrwnwsp){
		this.frc_thrwnwsp = frc_thrwnwsp;
	}

	public void setEtcfreenwsp(String etcfreenwsp){
		this.etcfreenwsp = etcfreenwsp;
	}

	public void setResvnwsp(String resvnwsp){
		this.resvnwsp = resvnwsp;
	}

	public void setCupn(String cupn){
		this.cupn = cupn;
	}

	public void setThmmno_valqty(String thmmno_valqty){
		this.thmmno_valqty = thmmno_valqty;
	}

	public void setThmmqty(String thmmqty){
		this.thmmqty = thmmqty;
	}

	public void setNowun_recpqty(String nowun_recpqty){
		this.nowun_recpqty = nowun_recpqty;
	}

	public void setMedaqty(String medaqty){
		this.medaqty = medaqty;
	}

	public void setRe_freeqty(String re_freeqty){
		this.re_freeqty = re_freeqty;
	}

	public void setLossqty(String lossqty){
		this.lossqty = lossqty;
	}

	public void setPpymqty(String ppymqty){
		this.ppymqty = ppymqty;
	}

	public void setTemp_stopqty(String temp_stopqty){
		this.temp_stopqty = temp_stopqty;
	}

	public void setNow_un_recp_amt(String now_un_recp_amt){
		this.now_un_recp_amt = now_un_recp_amt;
	}

	public void setThmm_amt(String thmm_amt){
		this.thmm_amt = thmm_amt;
	}

	public void setThmmdscnamt(String thmmdscnamt){
		this.thmmdscnamt = thmmdscnamt;
	}

	public void setThmmpost_dlvfee(String thmmpost_dlvfee){
		this.thmmpost_dlvfee = thmmpost_dlvfee;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setRe_freeamt(String re_freeamt){
		this.re_freeamt = re_freeamt;
	}

	public void setLossamt(String lossamt){
		this.lossamt = lossamt;
	}

	public void setPpymamt(String ppymamt){
		this.ppymamt = ppymamt;
	}

	public void setTemp_stopamt(String temp_stopamt){
		this.temp_stopamt = temp_stopamt;
	}

	public void setGiroclamt(String giroclamt){
		this.giroclamt = giroclamt;
	}

	public void setVistclamt(String vistclamt){
		this.vistclamt = vistclamt;
	}

	public void setGiroauto_shiftclamt(String giroauto_shiftclamt){
		this.giroauto_shiftclamt = giroauto_shiftclamt;
	}

	public void setDocard_shiftclamt(String docard_shiftclamt){
		this.docard_shiftclamt = docard_shiftclamt;
	}

	public void setGnrcard_shiftclamt(String gnrcard_shiftclamt){
		this.gnrcard_shiftclamt = gnrcard_shiftclamt;
	}

	public void setOnlsetlclamt(String onlsetlclamt){
		this.onlsetlclamt = onlsetlclamt;
	}

	public void setEtcclamt(String etcclamt){
		this.etcclamt = etcclamt;
	}

	public void setUn_recp_repm(String un_recp_repm){
		this.un_recp_repm = un_recp_repm;
	}

	public void setNew_repm(String new_repm){
		this.new_repm = new_repm;
	}

	public void setPre_repm(String pre_repm){
		this.pre_repm = pre_repm;
	}

	public void setArealeafclamt(String arealeafclamt){
		this.arealeafclamt = arealeafclamt;
	}

	public void setTeampreisleafclamt(String teampreisleafclamt){
		this.teampreisleafclamt = teampreisleafclamt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public void setThmmval_adsc_qty(String thmmval_adsc_qty){
		this.thmmval_adsc_qty = thmmval_adsc_qty;
	}

	public void setThmmval_ndsc_qty(String thmmval_ndsc_qty){
		this.thmmval_ndsc_qty = thmmval_ndsc_qty;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdr_extnaplc(){
		return this.rdr_extnaplc;
	}

	public String getRdr_extnemp(){
		return this.rdr_extnemp;
	}

	public String getRdr_extnstaf(){
		return this.rdr_extnstaf;
	}

	public String getRdr_extnrdr_movm(){
		return this.rdr_extnrdr_movm;
	}

	public String getRdr_extnhdqt(){
		return this.rdr_extnhdqt;
	}

	public String getRdr_extnexg(){
		return this.rdr_extnexg;
	}

	public String getRdr_extncnvs(){
		return this.rdr_extncnvs;
	}

	public String getRdr_extnetc(){
		return this.rdr_extnetc;
	}

	public String getRdr_extnrate(){
		return this.rdr_extnrate;
	}

	public String getSuspmovm(){
		return this.suspmovm;
	}

	public String getSusprefu(){
		return this.susprefu;
	}

	public String getSuspothnwsp(){
		return this.suspothnwsp;
	}

	public String getSuspetc(){
		return this.suspetc;
	}

	public String getSuspetc1(){
		return this.suspetc1;
	}

	public String getSuspetc2(){
		return this.suspetc2;
	}

	public String getSuspetc3(){
		return this.suspetc3;
	}

	public String getSuspetc4(){
		return this.suspetc4;
	}

	public String getSusprate(){
		return this.susprate;
	}

	public String getSuspaplc(){
		return this.suspaplc;
	}

	public String getSuspemp(){
		return this.suspemp;
	}

	public String getSuspstaf(){
		return this.suspstaf;
	}

	public String getSusprdr_movm(){
		return this.susprdr_movm;
	}

	public String getSusphdqt(){
		return this.susphdqt;
	}

	public String getSuspexg(){
		return this.suspexg;
	}

	public String getSuspcnvsrdr_extn(){
		return this.suspcnvsrdr_extn;
	}

	public String getSuspetcrdr_extn(){
		return this.suspetcrdr_extn;
	}

	public String getThmmsendqty(){
		return this.thmmsendqty;
	}

	public String getThmmvalqty(){
		return this.thmmvalqty;
	}

	public String getAftcnt1(){
		return this.aftcnt1;
	}

	public String getAftcnt2(){
		return this.aftcnt2;
	}

	public String getAftcnt3(){
		return this.aftcnt3;
	}

	public String getAftcnt4(){
		return this.aftcnt4;
	}

	public String getAftcnt5(){
		return this.aftcnt5;
	}

	public String getAftcnt6(){
		return this.aftcnt6;
	}

	public String getExcsaftcnt6(){
		return this.excsaftcnt6;
	}

	public String getAptqty(){
		return this.aptqty;
	}

	public String getVillaqty(){
		return this.villaqty;
	}

	public String getHousqty(){
		return this.housqty;
	}

	public String getOffi_roomqty(){
		return this.offi_roomqty;
	}

	public String getShopqty(){
		return this.shopqty;
	}

	public String getEtcqty(){
		return this.etcqty;
	}

	public String getPub_infonwsp(){
		return this.pub_infonwsp;
	}

	public String getHdqt_dntnwsp(){
		return this.hdqt_dntnwsp;
	}

	public String getBodntnwsp(){
		return this.bodntnwsp;
	}

	public String getFrc_thrwnwsp(){
		return this.frc_thrwnwsp;
	}

	public String getEtcfreenwsp(){
		return this.etcfreenwsp;
	}

	public String getResvnwsp(){
		return this.resvnwsp;
	}

	public String getCupn(){
		return this.cupn;
	}

	public String getThmmno_valqty(){
		return this.thmmno_valqty;
	}

	public String getThmmqty(){
		return this.thmmqty;
	}

	public String getNowun_recpqty(){
		return this.nowun_recpqty;
	}

	public String getMedaqty(){
		return this.medaqty;
	}

	public String getRe_freeqty(){
		return this.re_freeqty;
	}

	public String getLossqty(){
		return this.lossqty;
	}

	public String getPpymqty(){
		return this.ppymqty;
	}

	public String getTemp_stopqty(){
		return this.temp_stopqty;
	}

	public String getNow_un_recp_amt(){
		return this.now_un_recp_amt;
	}

	public String getThmm_amt(){
		return this.thmm_amt;
	}

	public String getThmmdscnamt(){
		return this.thmmdscnamt;
	}

	public String getThmmpost_dlvfee(){
		return this.thmmpost_dlvfee;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getRe_freeamt(){
		return this.re_freeamt;
	}

	public String getLossamt(){
		return this.lossamt;
	}

	public String getPpymamt(){
		return this.ppymamt;
	}

	public String getTemp_stopamt(){
		return this.temp_stopamt;
	}

	public String getGiroclamt(){
		return this.giroclamt;
	}

	public String getVistclamt(){
		return this.vistclamt;
	}

	public String getGiroauto_shiftclamt(){
		return this.giroauto_shiftclamt;
	}

	public String getDocard_shiftclamt(){
		return this.docard_shiftclamt;
	}

	public String getGnrcard_shiftclamt(){
		return this.gnrcard_shiftclamt;
	}

	public String getOnlsetlclamt(){
		return this.onlsetlclamt;
	}

	public String getEtcclamt(){
		return this.etcclamt;
	}

	public String getUn_recp_repm(){
		return this.un_recp_repm;
	}

	public String getNew_repm(){
		return this.new_repm;
	}

	public String getPre_repm(){
		return this.pre_repm;
	}

	public String getArealeafclamt(){
		return this.arealeafclamt;
	}

	public String getTeampreisleafclamt(){
		return this.teampreisleafclamt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}

	public String getThmmval_adsc_qty(){
		return this.thmmval_adsc_qty;
	}

	public String getThmmval_ndsc_qty(){
		return this.thmmval_ndsc_qty;
	}
}

/* 작성시간 : Fri Jul 11 17:24:34 KST 2014 */