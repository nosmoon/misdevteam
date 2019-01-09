/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class SS_SLS_BRMGR_2851_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basiyymm;
	public String medicd;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String valcnt;
	public String aftcnt1;
	public String aftcnt2;
	public String aftcnt3;
	public String aftcnt4;
	public String aftcnt5;
	public String aftcnt6;
	public String sumvalcnt;
	public String excsaftcnt7;
	public String free_misu;
	public String free_disc;
	public String sumnocnt;
	public String resv1;
	public String resv2;
	public String resv3;
	public String totcnt;
	public String thmmsendqty;
	public String per;
	public String subsmappli;
	public String valqty;
	public String valqty1;
	public String valqty2;
	public String valqty3;
	public String valqty4;
	public String valqty5;
	public String valqty6;
	public String sumvalqty;
	public String valqty7;
	public String dueqty;
	public String noqty;
	public String sumnoqty;
	public String totqty;
	public String misissuqty;
	public String rptqty;
	public String abcrate;
	public String bef_amt;
	public String aft_amt;
	public String inc_amt;

	public SS_SLS_BRMGR_2851_LCURLISTRecord(){}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

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

	public void setValcnt(String valcnt){
		this.valcnt = valcnt;
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

	public void setSumvalcnt(String sumvalcnt){
		this.sumvalcnt = sumvalcnt;
	}

	public void setExcsaftcnt7(String excsaftcnt7){
		this.excsaftcnt7 = excsaftcnt7;
	}

	public void setFree_misu(String free_misu){
		this.free_misu = free_misu;
	}

	public void setFree_disc(String free_disc){
		this.free_disc = free_disc;
	}

	public void setSumnocnt(String sumnocnt){
		this.sumnocnt = sumnocnt;
	}

	public void setResv1(String resv1){
		this.resv1 = resv1;
	}

	public void setResv2(String resv2){
		this.resv2 = resv2;
	}

	public void setResv3(String resv3){
		this.resv3 = resv3;
	}

	public void setTotcnt(String totcnt){
		this.totcnt = totcnt;
	}

	public void setThmmsendqty(String thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setPer(String per){
		this.per = per;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setValqty(String valqty){
		this.valqty = valqty;
	}

	public void setValqty1(String valqty1){
		this.valqty1 = valqty1;
	}

	public void setValqty2(String valqty2){
		this.valqty2 = valqty2;
	}

	public void setValqty3(String valqty3){
		this.valqty3 = valqty3;
	}

	public void setValqty4(String valqty4){
		this.valqty4 = valqty4;
	}

	public void setValqty5(String valqty5){
		this.valqty5 = valqty5;
	}

	public void setValqty6(String valqty6){
		this.valqty6 = valqty6;
	}

	public void setSumvalqty(String sumvalqty){
		this.sumvalqty = sumvalqty;
	}

	public void setValqty7(String valqty7){
		this.valqty7 = valqty7;
	}

	public void setDueqty(String dueqty){
		this.dueqty = dueqty;
	}

	public void setNoqty(String noqty){
		this.noqty = noqty;
	}

	public void setSumnoqty(String sumnoqty){
		this.sumnoqty = sumnoqty;
	}

	public void setTotqty(String totqty){
		this.totqty = totqty;
	}

	public void setMisissuqty(String misissuqty){
		this.misissuqty = misissuqty;
	}

	public void setRptqty(String rptqty){
		this.rptqty = rptqty;
	}

	public void setAbcrate(String abcrate){
		this.abcrate = abcrate;
	}

	public void setBef_amt(String bef_amt){
		this.bef_amt = bef_amt;
	}

	public void setAft_amt(String aft_amt){
		this.aft_amt = aft_amt;
	}

	public void setInc_amt(String inc_amt){
		this.inc_amt = inc_amt;
	}

	public String getBasiyymm(){
		return this.basiyymm;
	}

	public String getMedicd(){
		return this.medicd;
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

	public String getValcnt(){
		return this.valcnt;
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

	public String getSumvalcnt(){
		return this.sumvalcnt;
	}

	public String getExcsaftcnt7(){
		return this.excsaftcnt7;
	}

	public String getFree_misu(){
		return this.free_misu;
	}

	public String getFree_disc(){
		return this.free_disc;
	}

	public String getSumnocnt(){
		return this.sumnocnt;
	}

	public String getResv1(){
		return this.resv1;
	}

	public String getResv2(){
		return this.resv2;
	}

	public String getResv3(){
		return this.resv3;
	}

	public String getTotcnt(){
		return this.totcnt;
	}

	public String getThmmsendqty(){
		return this.thmmsendqty;
	}

	public String getPer(){
		return this.per;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getValqty(){
		return this.valqty;
	}

	public String getValqty1(){
		return this.valqty1;
	}

	public String getValqty2(){
		return this.valqty2;
	}

	public String getValqty3(){
		return this.valqty3;
	}

	public String getValqty4(){
		return this.valqty4;
	}

	public String getValqty5(){
		return this.valqty5;
	}

	public String getValqty6(){
		return this.valqty6;
	}

	public String getSumvalqty(){
		return this.sumvalqty;
	}

	public String getValqty7(){
		return this.valqty7;
	}

	public String getDueqty(){
		return this.dueqty;
	}

	public String getNoqty(){
		return this.noqty;
	}

	public String getSumnoqty(){
		return this.sumnoqty;
	}

	public String getTotqty(){
		return this.totqty;
	}

	public String getMisissuqty(){
		return this.misissuqty;
	}

	public String getRptqty(){
		return this.rptqty;
	}

	public String getAbcrate(){
		return this.abcrate;
	}

	public String getBef_amt(){
		return this.bef_amt;
	}

	public String getAft_amt(){
		return this.aft_amt;
	}

	public String getInc_amt(){
		return this.inc_amt;
	}
}

/* 작성시간 : Thu Feb 23 11:34:09 KST 2017 */