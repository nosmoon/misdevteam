/***************************************************************************************************
* 파일명 : .java
* 기능 : 비독자관리 조회
* 작성일자 : 2009-08-07
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 비독자관리 조회 
 */

public class SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord extends java.lang.Object implements java.io.Serializable{

	public String custclas;
	public String clsf;
	public String clsfdesc;
	public String regdt;
	public String custnm;
	public String sex;
	public String age;
	public String home_zip;
	public String home_addr;
	public String email;
	public String rdrptph_no1;
	public String medinm;
	public String subs_prd;
	public int chrn_pre;
	public int chrn_emy;
	public int chrn_mid;
	public int chrn_hig;
	public String evntdate_from;
	public String evntdate_to;

	public SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord(){}

	public void setCustclas(String custclas){
		this.custclas = custclas;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setClsfdesc(String clsfdesc){
		this.clsfdesc = clsfdesc;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setCustnm(String custnm){
		this.custnm = custnm;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setHome_zip(String home_zip){
		this.home_zip = home_zip;
	}

	public void setHome_addr(String home_addr){
		this.home_addr = home_addr;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubs_prd(String subs_prd){
		this.subs_prd = subs_prd;
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

	public void setEvntdate_from(String evntdate_from){
		this.evntdate_from = evntdate_from;
	}

	public void setEvntdate_to(String evntdate_to){
		this.evntdate_to = evntdate_to;
	}

	public String getCustclas(){
		return this.custclas;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getClsfdesc(){
		return this.clsfdesc;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getCustnm(){
		return this.custnm;
	}

	public String getSex(){
		return this.sex;
	}

	public String getAge(){
		return this.age;
	}

	public String getHome_zip(){
		return this.home_zip;
	}

	public String getHome_addr(){
		return this.home_addr;
	}

	public String getEmail(){
		return this.email;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubs_prd(){
		return this.subs_prd;
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

	public String getEvntdate_from(){
		return this.evntdate_from;
	}

	public String getEvntdate_to(){
		return this.evntdate_to;
	}
}

/* 작성시간 : Tue Aug 11 16:44:11 KST 2009 */