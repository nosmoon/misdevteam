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


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_L_ABCABCCURRecord extends java.lang.Object implements java.io.Serializable{

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
	public String excsaftcnt7;
	public String free_misu;
	public String free_disc;
	public String resv1;
	public String resv2;
	public String resv3;
	public String thmmsendqty;
	public String per;

	public SS_L_ABCABCCURRecord(){}

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

	public void setExcsaftcnt7(String excsaftcnt7){
		this.excsaftcnt7 = excsaftcnt7;
	}

	public void setFree_misu(String free_misu){
		this.free_misu = free_misu;
	}

	public void setFree_disc(String free_disc){
		this.free_disc = free_disc;
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

	public void setThmmsendqty(String thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setPer(String per){
		this.per = per;
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

	public String getExcsaftcnt7(){
		return this.excsaftcnt7;
	}

	public String getFree_misu(){
		return this.free_misu;
	}

	public String getFree_disc(){
		return this.free_disc;
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

	public String getThmmsendqty(){
		return this.thmmsendqty;
	}

	public String getPer(){
		return this.per;
	}
}

/* 작성시간 : Wed Dec 09 22:43:24 KST 2009 */