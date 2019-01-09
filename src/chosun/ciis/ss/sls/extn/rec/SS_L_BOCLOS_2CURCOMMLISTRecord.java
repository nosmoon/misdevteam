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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_BOCLOS_2CURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String deptcd;
	public String partnm;
	public String partcd;
	public String areanm;
	public String areacd;
	public String bonm;
	public String bocd;
	public String oprenvclsfcd;
	public String sellnetclsf;
	public String dstccd;
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
	public String misu;

	public SS_L_BOCLOS_2CURCOMMLISTRecord(){}

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

	public void setOprenvclsfcd(String oprenvclsfcd){
		this.oprenvclsfcd = oprenvclsfcd;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
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

	public void setMisu(String misu){
		this.misu = misu;
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

	public String getOprenvclsfcd(){
		return this.oprenvclsfcd;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}

	public String getDstccd(){
		return this.dstccd;
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

	public String getMisu(){
		return this.misu;
	}
}

/* 작성시간 : Wed Oct 26 15:30:00 KST 2011 */