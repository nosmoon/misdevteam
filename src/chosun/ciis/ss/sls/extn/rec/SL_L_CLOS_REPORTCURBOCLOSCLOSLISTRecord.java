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


public class SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String oprenvclsfcd;
	public String sellnetclsf;
	public String dstccd;
	public int rdr_extnaplc;
	public int rdr_extnemp;
	public int rdr_extnstaf;
	public int rdr_extnrdr_movm;
	public int rdr_extnhdqt;
	public int rdr_extnexg;
	public int rdr_extncnvs;
	public int rdr_extnetc;
	public int rdr_extnrate;
	public int suspmovm;
	public int susprefu;
	public int suspothnwsp;
	public int suspetc;
	public int suspetc1;
	public int suspetc2;
	public int suspetc3;
	public int suspetc4;
	public int susprate;
	public int suspaplc;
	public int suspemp;
	public int suspstaf;
	public int susprdr_movm;
	public int susphdqt;
	public int suspexg;
	public int suspcnvsrdr_extn;
	public int suspetcrdr_extn;
	public int thmmsendqty;
	public int thmmvalqty;
	public int aftcnt1;
	public int aftcnt2;
	public int aftcnt3;
	public int aftcnt4;
	public int aftcnt5;
	public int aftcnt6;
	public int excsaftcnt6;
	public int aptqty;
	public int villaqty;
	public int housqty;
	public int offi_roomqty;
	public int shopqty;
	public int etcqty;
	public int pub_infonwsp;
	public int hdqt_dntnwsp;
	public int bodntnwsp;
	public int frc_thrwnwsp;
	public int etcfreenwsp;
	public int resvnwsp;
	public int cupn;
	public int thmmno_valqty;
	public int thmmqty;
	public int nowun_recpqty;
	public int medaqty;
	public int re_freeqty;
	public int lossqty;
	public int ppymqty;
	public int temp_stopqty;
	public String now_un_recp_amt;
	public int thmm_amt;
	public int thmmdscnamt;
	public int thmmpost_dlvfee;
	public int meda_amt;
	public int re_freeamt;
	public int lossamt;
	public int ppymamt;
	public int temp_stopamt;
	public int giroclamt;
	public int vistclamt;
	public int giroauto_shiftclamt;
	public int docard_shiftclamt;
	public int gnrcard_shiftclamt;
	public int onlsetlclamt;
	public int etcclamt;
	public int un_recp_repm;
	public int new_repm;
	public int pre_repm;
	public int arealeafclamt;
	public int teampreisleafclamt;
	public int thmmval_adsc_qty;
	public int thmmval_ndsc_qty;
	public int unclamtcnt;
	public int closmm;

	public SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setOprenvclsfcd(String oprenvclsfcd){
		this.oprenvclsfcd = oprenvclsfcd;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setRdr_extnaplc(int rdr_extnaplc){
		this.rdr_extnaplc = rdr_extnaplc;
	}

	public void setRdr_extnemp(int rdr_extnemp){
		this.rdr_extnemp = rdr_extnemp;
	}

	public void setRdr_extnstaf(int rdr_extnstaf){
		this.rdr_extnstaf = rdr_extnstaf;
	}

	public void setRdr_extnrdr_movm(int rdr_extnrdr_movm){
		this.rdr_extnrdr_movm = rdr_extnrdr_movm;
	}

	public void setRdr_extnhdqt(int rdr_extnhdqt){
		this.rdr_extnhdqt = rdr_extnhdqt;
	}

	public void setRdr_extnexg(int rdr_extnexg){
		this.rdr_extnexg = rdr_extnexg;
	}

	public void setRdr_extncnvs(int rdr_extncnvs){
		this.rdr_extncnvs = rdr_extncnvs;
	}

	public void setRdr_extnetc(int rdr_extnetc){
		this.rdr_extnetc = rdr_extnetc;
	}

	public void setRdr_extnrate(int rdr_extnrate){
		this.rdr_extnrate = rdr_extnrate;
	}

	public void setSuspmovm(int suspmovm){
		this.suspmovm = suspmovm;
	}

	public void setSusprefu(int susprefu){
		this.susprefu = susprefu;
	}

	public void setSuspothnwsp(int suspothnwsp){
		this.suspothnwsp = suspothnwsp;
	}

	public void setSuspetc(int suspetc){
		this.suspetc = suspetc;
	}

	public void setSuspetc1(int suspetc1){
		this.suspetc1 = suspetc1;
	}

	public void setSuspetc2(int suspetc2){
		this.suspetc2 = suspetc2;
	}

	public void setSuspetc3(int suspetc3){
		this.suspetc3 = suspetc3;
	}

	public void setSuspetc4(int suspetc4){
		this.suspetc4 = suspetc4;
	}

	public void setSusprate(int susprate){
		this.susprate = susprate;
	}

	public void setSuspaplc(int suspaplc){
		this.suspaplc = suspaplc;
	}

	public void setSuspemp(int suspemp){
		this.suspemp = suspemp;
	}

	public void setSuspstaf(int suspstaf){
		this.suspstaf = suspstaf;
	}

	public void setSusprdr_movm(int susprdr_movm){
		this.susprdr_movm = susprdr_movm;
	}

	public void setSusphdqt(int susphdqt){
		this.susphdqt = susphdqt;
	}

	public void setSuspexg(int suspexg){
		this.suspexg = suspexg;
	}

	public void setSuspcnvsrdr_extn(int suspcnvsrdr_extn){
		this.suspcnvsrdr_extn = suspcnvsrdr_extn;
	}

	public void setSuspetcrdr_extn(int suspetcrdr_extn){
		this.suspetcrdr_extn = suspetcrdr_extn;
	}

	public void setThmmsendqty(int thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setThmmvalqty(int thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setAftcnt1(int aftcnt1){
		this.aftcnt1 = aftcnt1;
	}

	public void setAftcnt2(int aftcnt2){
		this.aftcnt2 = aftcnt2;
	}

	public void setAftcnt3(int aftcnt3){
		this.aftcnt3 = aftcnt3;
	}

	public void setAftcnt4(int aftcnt4){
		this.aftcnt4 = aftcnt4;
	}

	public void setAftcnt5(int aftcnt5){
		this.aftcnt5 = aftcnt5;
	}

	public void setAftcnt6(int aftcnt6){
		this.aftcnt6 = aftcnt6;
	}

	public void setExcsaftcnt6(int excsaftcnt6){
		this.excsaftcnt6 = excsaftcnt6;
	}

	public void setAptqty(int aptqty){
		this.aptqty = aptqty;
	}

	public void setVillaqty(int villaqty){
		this.villaqty = villaqty;
	}

	public void setHousqty(int housqty){
		this.housqty = housqty;
	}

	public void setOffi_roomqty(int offi_roomqty){
		this.offi_roomqty = offi_roomqty;
	}

	public void setShopqty(int shopqty){
		this.shopqty = shopqty;
	}

	public void setEtcqty(int etcqty){
		this.etcqty = etcqty;
	}

	public void setPub_infonwsp(int pub_infonwsp){
		this.pub_infonwsp = pub_infonwsp;
	}

	public void setHdqt_dntnwsp(int hdqt_dntnwsp){
		this.hdqt_dntnwsp = hdqt_dntnwsp;
	}

	public void setBodntnwsp(int bodntnwsp){
		this.bodntnwsp = bodntnwsp;
	}

	public void setFrc_thrwnwsp(int frc_thrwnwsp){
		this.frc_thrwnwsp = frc_thrwnwsp;
	}

	public void setEtcfreenwsp(int etcfreenwsp){
		this.etcfreenwsp = etcfreenwsp;
	}

	public void setResvnwsp(int resvnwsp){
		this.resvnwsp = resvnwsp;
	}

	public void setCupn(int cupn){
		this.cupn = cupn;
	}

	public void setThmmno_valqty(int thmmno_valqty){
		this.thmmno_valqty = thmmno_valqty;
	}

	public void setThmmqty(int thmmqty){
		this.thmmqty = thmmqty;
	}

	public void setNowun_recpqty(int nowun_recpqty){
		this.nowun_recpqty = nowun_recpqty;
	}

	public void setMedaqty(int medaqty){
		this.medaqty = medaqty;
	}

	public void setRe_freeqty(int re_freeqty){
		this.re_freeqty = re_freeqty;
	}

	public void setLossqty(int lossqty){
		this.lossqty = lossqty;
	}

	public void setPpymqty(int ppymqty){
		this.ppymqty = ppymqty;
	}

	public void setTemp_stopqty(int temp_stopqty){
		this.temp_stopqty = temp_stopqty;
	}

	public void setNow_un_recp_amt(String now_un_recp_amt){
		this.now_un_recp_amt = now_un_recp_amt;
	}

	public void setThmm_amt(int thmm_amt){
		this.thmm_amt = thmm_amt;
	}

	public void setThmmdscnamt(int thmmdscnamt){
		this.thmmdscnamt = thmmdscnamt;
	}

	public void setThmmpost_dlvfee(int thmmpost_dlvfee){
		this.thmmpost_dlvfee = thmmpost_dlvfee;
	}

	public void setMeda_amt(int meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setRe_freeamt(int re_freeamt){
		this.re_freeamt = re_freeamt;
	}

	public void setLossamt(int lossamt){
		this.lossamt = lossamt;
	}

	public void setPpymamt(int ppymamt){
		this.ppymamt = ppymamt;
	}

	public void setTemp_stopamt(int temp_stopamt){
		this.temp_stopamt = temp_stopamt;
	}

	public void setGiroclamt(int giroclamt){
		this.giroclamt = giroclamt;
	}

	public void setVistclamt(int vistclamt){
		this.vistclamt = vistclamt;
	}

	public void setGiroauto_shiftclamt(int giroauto_shiftclamt){
		this.giroauto_shiftclamt = giroauto_shiftclamt;
	}

	public void setDocard_shiftclamt(int docard_shiftclamt){
		this.docard_shiftclamt = docard_shiftclamt;
	}

	public void setGnrcard_shiftclamt(int gnrcard_shiftclamt){
		this.gnrcard_shiftclamt = gnrcard_shiftclamt;
	}

	public void setOnlsetlclamt(int onlsetlclamt){
		this.onlsetlclamt = onlsetlclamt;
	}

	public void setEtcclamt(int etcclamt){
		this.etcclamt = etcclamt;
	}

	public void setUn_recp_repm(int un_recp_repm){
		this.un_recp_repm = un_recp_repm;
	}

	public void setNew_repm(int new_repm){
		this.new_repm = new_repm;
	}

	public void setPre_repm(int pre_repm){
		this.pre_repm = pre_repm;
	}

	public void setArealeafclamt(int arealeafclamt){
		this.arealeafclamt = arealeafclamt;
	}

	public void setTeampreisleafclamt(int teampreisleafclamt){
		this.teampreisleafclamt = teampreisleafclamt;
	}

	public void setThmmval_adsc_qty(int thmmval_adsc_qty){
		this.thmmval_adsc_qty = thmmval_adsc_qty;
	}

	public void setThmmval_ndsc_qty(int thmmval_ndsc_qty){
		this.thmmval_ndsc_qty = thmmval_ndsc_qty;
	}

	public void setUnclamtcnt(int unclamtcnt){
		this.unclamtcnt = unclamtcnt;
	}

	public void setClosmm(int closmm){
		this.closmm = closmm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getOprenvclsfcd(){
		return this.oprenvclsfcd;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public int getRdr_extnaplc(){
		return this.rdr_extnaplc;
	}

	public int getRdr_extnemp(){
		return this.rdr_extnemp;
	}

	public int getRdr_extnstaf(){
		return this.rdr_extnstaf;
	}

	public int getRdr_extnrdr_movm(){
		return this.rdr_extnrdr_movm;
	}

	public int getRdr_extnhdqt(){
		return this.rdr_extnhdqt;
	}

	public int getRdr_extnexg(){
		return this.rdr_extnexg;
	}

	public int getRdr_extncnvs(){
		return this.rdr_extncnvs;
	}

	public int getRdr_extnetc(){
		return this.rdr_extnetc;
	}

	public int getRdr_extnrate(){
		return this.rdr_extnrate;
	}

	public int getSuspmovm(){
		return this.suspmovm;
	}

	public int getSusprefu(){
		return this.susprefu;
	}

	public int getSuspothnwsp(){
		return this.suspothnwsp;
	}

	public int getSuspetc(){
		return this.suspetc;
	}

	public int getSuspetc1(){
		return this.suspetc1;
	}

	public int getSuspetc2(){
		return this.suspetc2;
	}

	public int getSuspetc3(){
		return this.suspetc3;
	}

	public int getSuspetc4(){
		return this.suspetc4;
	}

	public int getSusprate(){
		return this.susprate;
	}

	public int getSuspaplc(){
		return this.suspaplc;
	}

	public int getSuspemp(){
		return this.suspemp;
	}

	public int getSuspstaf(){
		return this.suspstaf;
	}

	public int getSusprdr_movm(){
		return this.susprdr_movm;
	}

	public int getSusphdqt(){
		return this.susphdqt;
	}

	public int getSuspexg(){
		return this.suspexg;
	}

	public int getSuspcnvsrdr_extn(){
		return this.suspcnvsrdr_extn;
	}

	public int getSuspetcrdr_extn(){
		return this.suspetcrdr_extn;
	}

	public int getThmmsendqty(){
		return this.thmmsendqty;
	}

	public int getThmmvalqty(){
		return this.thmmvalqty;
	}

	public int getAftcnt1(){
		return this.aftcnt1;
	}

	public int getAftcnt2(){
		return this.aftcnt2;
	}

	public int getAftcnt3(){
		return this.aftcnt3;
	}

	public int getAftcnt4(){
		return this.aftcnt4;
	}

	public int getAftcnt5(){
		return this.aftcnt5;
	}

	public int getAftcnt6(){
		return this.aftcnt6;
	}

	public int getExcsaftcnt6(){
		return this.excsaftcnt6;
	}

	public int getAptqty(){
		return this.aptqty;
	}

	public int getVillaqty(){
		return this.villaqty;
	}

	public int getHousqty(){
		return this.housqty;
	}

	public int getOffi_roomqty(){
		return this.offi_roomqty;
	}

	public int getShopqty(){
		return this.shopqty;
	}

	public int getEtcqty(){
		return this.etcqty;
	}

	public int getPub_infonwsp(){
		return this.pub_infonwsp;
	}

	public int getHdqt_dntnwsp(){
		return this.hdqt_dntnwsp;
	}

	public int getBodntnwsp(){
		return this.bodntnwsp;
	}

	public int getFrc_thrwnwsp(){
		return this.frc_thrwnwsp;
	}

	public int getEtcfreenwsp(){
		return this.etcfreenwsp;
	}

	public int getResvnwsp(){
		return this.resvnwsp;
	}

	public int getCupn(){
		return this.cupn;
	}

	public int getThmmno_valqty(){
		return this.thmmno_valqty;
	}

	public int getThmmqty(){
		return this.thmmqty;
	}

	public int getNowun_recpqty(){
		return this.nowun_recpqty;
	}

	public int getMedaqty(){
		return this.medaqty;
	}

	public int getRe_freeqty(){
		return this.re_freeqty;
	}

	public int getLossqty(){
		return this.lossqty;
	}

	public int getPpymqty(){
		return this.ppymqty;
	}

	public int getTemp_stopqty(){
		return this.temp_stopqty;
	}

	public String getNow_un_recp_amt(){
		return this.now_un_recp_amt;
	}

	public int getThmm_amt(){
		return this.thmm_amt;
	}

	public int getThmmdscnamt(){
		return this.thmmdscnamt;
	}

	public int getThmmpost_dlvfee(){
		return this.thmmpost_dlvfee;
	}

	public int getMeda_amt(){
		return this.meda_amt;
	}

	public int getRe_freeamt(){
		return this.re_freeamt;
	}

	public int getLossamt(){
		return this.lossamt;
	}

	public int getPpymamt(){
		return this.ppymamt;
	}

	public int getTemp_stopamt(){
		return this.temp_stopamt;
	}

	public int getGiroclamt(){
		return this.giroclamt;
	}

	public int getVistclamt(){
		return this.vistclamt;
	}

	public int getGiroauto_shiftclamt(){
		return this.giroauto_shiftclamt;
	}

	public int getDocard_shiftclamt(){
		return this.docard_shiftclamt;
	}

	public int getGnrcard_shiftclamt(){
		return this.gnrcard_shiftclamt;
	}

	public int getOnlsetlclamt(){
		return this.onlsetlclamt;
	}

	public int getEtcclamt(){
		return this.etcclamt;
	}

	public int getUn_recp_repm(){
		return this.un_recp_repm;
	}

	public int getNew_repm(){
		return this.new_repm;
	}

	public int getPre_repm(){
		return this.pre_repm;
	}

	public int getArealeafclamt(){
		return this.arealeafclamt;
	}

	public int getTeampreisleafclamt(){
		return this.teampreisleafclamt;
	}

	public int getThmmval_adsc_qty(){
		return this.thmmval_adsc_qty;
	}

	public int getThmmval_ndsc_qty(){
		return this.thmmval_ndsc_qty;
	}

	public int getUnclamtcnt(){
		return this.unclamtcnt;
	}

	public int getClosmm(){
		return this.closmm;
	}
}

/* 작성시간 : Thu Aug 17 13:55:12 KST 2017 */