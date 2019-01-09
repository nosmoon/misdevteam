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


public class SS_L_EXCDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String deptcd;
	public String partnm;
	public String partcd;
	public String areanm;
	public String areacd;
	public String bonm;
	public String bocd;
	public String extncdusagenm;
	public String resitypenm;
	public String bns1_00;
	public String bns2_00;
	public String bns3_00;
	public String bns4_00;
	public String bns5_00;
	public String bns1_01;
	public String bns2_01;
	public String bns3_01;
	public String bns4_01;
	public String bns5_01;
	public String medi1_00;
	public String medi2_00;
	public String medi3_00;
	public String medi4_00;
	public String medi5_00;
	public String medi6_00;
	public String medi7_00;
	public String medi1_01;
	public String medi2_01;
	public String medi3_01;
	public String medi4_01;
	public String medi5_01;
	public String medi6_01;
	public String medi7_01;
	public String giftcard_00;
	public String giftcard_01;
	public String servimm_00;
	public String servimm_01;
	public String rflyn00;
	public String rflyn01;
	public String extncdusage;
	public String resitype;

	public SS_L_EXCDCURCOMMLISTRecord(){}

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

	public void setExtncdusagenm(String extncdusagenm){
		this.extncdusagenm = extncdusagenm;
	}

	public void setResitypenm(String resitypenm){
		this.resitypenm = resitypenm;
	}

	public void setBns1_00(String bns1_00){
		this.bns1_00 = bns1_00;
	}

	public void setBns2_00(String bns2_00){
		this.bns2_00 = bns2_00;
	}

	public void setBns3_00(String bns3_00){
		this.bns3_00 = bns3_00;
	}

	public void setBns4_00(String bns4_00){
		this.bns4_00 = bns4_00;
	}

	public void setBns5_00(String bns5_00){
		this.bns5_00 = bns5_00;
	}

	public void setBns1_01(String bns1_01){
		this.bns1_01 = bns1_01;
	}

	public void setBns2_01(String bns2_01){
		this.bns2_01 = bns2_01;
	}

	public void setBns3_01(String bns3_01){
		this.bns3_01 = bns3_01;
	}

	public void setBns4_01(String bns4_01){
		this.bns4_01 = bns4_01;
	}

	public void setBns5_01(String bns5_01){
		this.bns5_01 = bns5_01;
	}

	public void setMedi1_00(String medi1_00){
		this.medi1_00 = medi1_00;
	}

	public void setMedi2_00(String medi2_00){
		this.medi2_00 = medi2_00;
	}

	public void setMedi3_00(String medi3_00){
		this.medi3_00 = medi3_00;
	}

	public void setMedi4_00(String medi4_00){
		this.medi4_00 = medi4_00;
	}

	public void setMedi5_00(String medi5_00){
		this.medi5_00 = medi5_00;
	}

	public void setMedi6_00(String medi6_00){
		this.medi6_00 = medi6_00;
	}

	public void setMedi7_00(String medi7_00){
		this.medi7_00 = medi7_00;
	}

	public void setMedi1_01(String medi1_01){
		this.medi1_01 = medi1_01;
	}

	public void setMedi2_01(String medi2_01){
		this.medi2_01 = medi2_01;
	}

	public void setMedi3_01(String medi3_01){
		this.medi3_01 = medi3_01;
	}

	public void setMedi4_01(String medi4_01){
		this.medi4_01 = medi4_01;
	}

	public void setMedi5_01(String medi5_01){
		this.medi5_01 = medi5_01;
	}

	public void setMedi6_01(String medi6_01){
		this.medi6_01 = medi6_01;
	}

	public void setMedi7_01(String medi7_01){
		this.medi7_01 = medi7_01;
	}

	public void setGiftcard_00(String giftcard_00){
		this.giftcard_00 = giftcard_00;
	}

	public void setGiftcard_01(String giftcard_01){
		this.giftcard_01 = giftcard_01;
	}

	public void setServimm_00(String servimm_00){
		this.servimm_00 = servimm_00;
	}

	public void setServimm_01(String servimm_01){
		this.servimm_01 = servimm_01;
	}

	public void setRflyn00(String rflyn00){
		this.rflyn00 = rflyn00;
	}

	public void setRflyn01(String rflyn01){
		this.rflyn01 = rflyn01;
	}

	public void setExtncdusage(String extncdusage){
		this.extncdusage = extncdusage;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
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

	public String getExtncdusagenm(){
		return this.extncdusagenm;
	}

	public String getResitypenm(){
		return this.resitypenm;
	}

	public String getBns1_00(){
		return this.bns1_00;
	}

	public String getBns2_00(){
		return this.bns2_00;
	}

	public String getBns3_00(){
		return this.bns3_00;
	}

	public String getBns4_00(){
		return this.bns4_00;
	}

	public String getBns5_00(){
		return this.bns5_00;
	}

	public String getBns1_01(){
		return this.bns1_01;
	}

	public String getBns2_01(){
		return this.bns2_01;
	}

	public String getBns3_01(){
		return this.bns3_01;
	}

	public String getBns4_01(){
		return this.bns4_01;
	}

	public String getBns5_01(){
		return this.bns5_01;
	}

	public String getMedi1_00(){
		return this.medi1_00;
	}

	public String getMedi2_00(){
		return this.medi2_00;
	}

	public String getMedi3_00(){
		return this.medi3_00;
	}

	public String getMedi4_00(){
		return this.medi4_00;
	}

	public String getMedi5_00(){
		return this.medi5_00;
	}

	public String getMedi6_00(){
		return this.medi6_00;
	}

	public String getMedi7_00(){
		return this.medi7_00;
	}

	public String getMedi1_01(){
		return this.medi1_01;
	}

	public String getMedi2_01(){
		return this.medi2_01;
	}

	public String getMedi3_01(){
		return this.medi3_01;
	}

	public String getMedi4_01(){
		return this.medi4_01;
	}

	public String getMedi5_01(){
		return this.medi5_01;
	}

	public String getMedi6_01(){
		return this.medi6_01;
	}

	public String getMedi7_01(){
		return this.medi7_01;
	}

	public String getGiftcard_00(){
		return this.giftcard_00;
	}

	public String getGiftcard_01(){
		return this.giftcard_01;
	}

	public String getServimm_00(){
		return this.servimm_00;
	}

	public String getServimm_01(){
		return this.servimm_01;
	}

	public String getRflyn00(){
		return this.rflyn00;
	}

	public String getRflyn01(){
		return this.rflyn01;
	}

	public String getExtncdusage(){
		return this.extncdusage;
	}

	public String getResitype(){
		return this.resitype;
	}
}

/* 작성시간 : Wed Mar 25 13:27:20 KST 2015 */