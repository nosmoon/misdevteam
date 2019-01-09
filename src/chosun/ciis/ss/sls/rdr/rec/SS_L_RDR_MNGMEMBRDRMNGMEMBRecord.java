/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자관리 비독자관리 조회 
* 작성일자 : 2009/09/25
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자관리 비독자관리 조회
 */

public class SS_L_RDR_MNGMEMBRDRMNGMEMBRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String deptcd;
	public String custclas;
	public String custclas2;
	public String area;
	public String custclasdesc;
	public String custseq;
	public String evntdate_from;
	public String evntdate_to;
	public String custnm;
	public String custennm;
	public String prn;
	public String home_zip;
	public String home_addr;
	public String home_dtlsaddr;
	public String hometel_no1;
	public String hometel_no2;
	public String hometel_no3;
	public String offitel_no1;
	public String offitel_no2;
	public String offitel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String offi_zip;
	public String offi_addr;
	public String offi_dtlsaddr;
	public String email;
	public String blng;
	public String posi;
	public String achievement;
	public String grade;
	public String cust_stat;
	public String inout;
	public String remk;
	public String updateyn;
	public String clsf;
	public String clsfdesc;
	public String sex;
	public String age;
	public int chrn_pre;
	public int chrn_emy;
	public int chrn_mid;
	public int chrn_hig;
	public String subs_prd;
	public String medinm;
	public String regdt;

	public SS_L_RDR_MNGMEMBRDRMNGMEMBRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setCustclas(String custclas){
		this.custclas = custclas;
	}

	public void setCustclas2(String custclas2){
		this.custclas2 = custclas2;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setCustclasdesc(String custclasdesc){
		this.custclasdesc = custclasdesc;
	}

	public void setCustseq(String custseq){
		this.custseq = custseq;
	}

	public void setEvntdate_from(String evntdate_from){
		this.evntdate_from = evntdate_from;
	}

	public void setEvntdate_to(String evntdate_to){
		this.evntdate_to = evntdate_to;
	}

	public void setCustnm(String custnm){
		this.custnm = custnm;
	}

	public void setCustennm(String custennm){
		this.custennm = custennm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setHome_zip(String home_zip){
		this.home_zip = home_zip;
	}

	public void setHome_addr(String home_addr){
		this.home_addr = home_addr;
	}

	public void setHome_dtlsaddr(String home_dtlsaddr){
		this.home_dtlsaddr = home_dtlsaddr;
	}

	public void setHometel_no1(String hometel_no1){
		this.hometel_no1 = hometel_no1;
	}

	public void setHometel_no2(String hometel_no2){
		this.hometel_no2 = hometel_no2;
	}

	public void setHometel_no3(String hometel_no3){
		this.hometel_no3 = hometel_no3;
	}

	public void setOffitel_no1(String offitel_no1){
		this.offitel_no1 = offitel_no1;
	}

	public void setOffitel_no2(String offitel_no2){
		this.offitel_no2 = offitel_no2;
	}

	public void setOffitel_no3(String offitel_no3){
		this.offitel_no3 = offitel_no3;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setOffi_zip(String offi_zip){
		this.offi_zip = offi_zip;
	}

	public void setOffi_addr(String offi_addr){
		this.offi_addr = offi_addr;
	}

	public void setOffi_dtlsaddr(String offi_dtlsaddr){
		this.offi_dtlsaddr = offi_dtlsaddr;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setBlng(String blng){
		this.blng = blng;
	}

	public void setPosi(String posi){
		this.posi = posi;
	}

	public void setAchievement(String achievement){
		this.achievement = achievement;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}

	public void setCust_stat(String cust_stat){
		this.cust_stat = cust_stat;
	}

	public void setInout(String inout){
		this.inout = inout;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUpdateyn(String updateyn){
		this.updateyn = updateyn;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setClsfdesc(String clsfdesc){
		this.clsfdesc = clsfdesc;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setChrn_pre(int chrn_pre){
		this.chrn_pre = chrn_pre;
	}

	public void setChrn_emy(int chrn_emy){
		this.chrn_emy = chrn_emy;
	}

	public void setChrn_mid(int chrn_mid){
		this.chrn_mid = chrn_mid;
	}

	public void setChrn_hig(int chrn_hig){
		this.chrn_hig = chrn_hig;
	}

	public void setSubs_prd(String subs_prd){
		this.subs_prd = subs_prd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getCustclas(){
		return this.custclas;
	}

	public String getCustclas2(){
		return this.custclas2;
	}

	public String getArea(){
		return this.area;
	}

	public String getCustclasdesc(){
		return this.custclasdesc;
	}

	public String getCustseq(){
		return this.custseq;
	}

	public String getEvntdate_from(){
		return this.evntdate_from;
	}

	public String getEvntdate_to(){
		return this.evntdate_to;
	}

	public String getCustnm(){
		return this.custnm;
	}

	public String getCustennm(){
		return this.custennm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getHome_zip(){
		return this.home_zip;
	}

	public String getHome_addr(){
		return this.home_addr;
	}

	public String getHome_dtlsaddr(){
		return this.home_dtlsaddr;
	}

	public String getHometel_no1(){
		return this.hometel_no1;
	}

	public String getHometel_no2(){
		return this.hometel_no2;
	}

	public String getHometel_no3(){
		return this.hometel_no3;
	}

	public String getOffitel_no1(){
		return this.offitel_no1;
	}

	public String getOffitel_no2(){
		return this.offitel_no2;
	}

	public String getOffitel_no3(){
		return this.offitel_no3;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getOffi_zip(){
		return this.offi_zip;
	}

	public String getOffi_addr(){
		return this.offi_addr;
	}

	public String getOffi_dtlsaddr(){
		return this.offi_dtlsaddr;
	}

	public String getEmail(){
		return this.email;
	}

	public String getBlng(){
		return this.blng;
	}

	public String getPosi(){
		return this.posi;
	}

	public String getAchievement(){
		return this.achievement;
	}

	public String getGrade(){
		return this.grade;
	}

	public String getCust_stat(){
		return this.cust_stat;
	}

	public String getInout(){
		return this.inout;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUpdateyn(){
		return this.updateyn;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getClsfdesc(){
		return this.clsfdesc;
	}

	public String getSex(){
		return this.sex;
	}

	public String getAge(){
		return this.age;
	}

	public int getChrn_pre(){
		return this.chrn_pre;
	}

	public int getChrn_emy(){
		return this.chrn_emy;
	}

	public int getChrn_mid(){
		return this.chrn_mid;
	}

	public int getChrn_hig(){
		return this.chrn_hig;
	}

	public String getSubs_prd(){
		return this.subs_prd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRegdt(){
		return this.regdt;
	}
}

/* 작성시간 : Fri Sep 25 15:12:29 KST 2009 */