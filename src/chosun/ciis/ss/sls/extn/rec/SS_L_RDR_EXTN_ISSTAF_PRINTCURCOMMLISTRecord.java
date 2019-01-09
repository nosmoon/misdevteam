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


public class SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String deptcd;
	public String partnm;
	public String partcd;
	public String areanm;
	public String areacd;
	public String bonm;
	public String bocd;
	public String stafno;
	public String stafnm;
	public String prn;
	public int a1;
	public int a2;
	public int a3;
	public int a4;
	public int a5;
	public int h1;
	public int h2;
	public int h3;
	public int h4;
	public int h5;
	public int s1;
	public int s2;
	public int s3;
	public int s4;
	public int s5;
	public int corr_qty;
	public int tot_qty;

	public SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord(){}

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

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setA1(int a1){
		this.a1 = a1;
	}

	public void setA2(int a2){
		this.a2 = a2;
	}

	public void setA3(int a3){
		this.a3 = a3;
	}

	public void setA4(int a4){
		this.a4 = a4;
	}

	public void setA5(int a5){
		this.a5 = a5;
	}

	public void setH1(int h1){
		this.h1 = h1;
	}

	public void setH2(int h2){
		this.h2 = h2;
	}

	public void setH3(int h3){
		this.h3 = h3;
	}

	public void setH4(int h4){
		this.h4 = h4;
	}

	public void setH5(int h5){
		this.h5 = h5;
	}

	public void setS1(int s1){
		this.s1 = s1;
	}

	public void setS2(int s2){
		this.s2 = s2;
	}

	public void setS3(int s3){
		this.s3 = s3;
	}

	public void setS4(int s4){
		this.s4 = s4;
	}

	public void setS5(int s5){
		this.s5 = s5;
	}

	public void setCorr_qty(int corr_qty){
		this.corr_qty = corr_qty;
	}

	public void setTot_qty(int tot_qty){
		this.tot_qty = tot_qty;
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

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public int getA1(){
		return this.a1;
	}

	public int getA2(){
		return this.a2;
	}

	public int getA3(){
		return this.a3;
	}

	public int getA4(){
		return this.a4;
	}

	public int getA5(){
		return this.a5;
	}

	public int getH1(){
		return this.h1;
	}

	public int getH2(){
		return this.h2;
	}

	public int getH3(){
		return this.h3;
	}

	public int getH4(){
		return this.h4;
	}

	public int getH5(){
		return this.h5;
	}

	public int getS1(){
		return this.s1;
	}

	public int getS2(){
		return this.s2;
	}

	public int getS3(){
		return this.s3;
	}

	public int getS4(){
		return this.s4;
	}

	public int getS5(){
		return this.s5;
	}

	public int getCorr_qty(){
		return this.corr_qty;
	}

	public int getTot_qty(){
		return this.tot_qty;
	}
}

/* 작성시간 : Fri Aug 21 09:45:18 KST 2015 */