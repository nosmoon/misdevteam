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


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 
 */


public class SS_L_NEWJUSO_APPRCURJUSOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String zip;
	public String addr;
	public String mt;
	public String localnn1;
	public String localnn2;
	public String rdnm;
	public String base;
	public String bldgnn1;
	public String bldgnn2;
	public String bldgnm;
	public String adminnm;
	public String largedlvnm;
	public String bonm;
	public String useyn;
	public String appryn;
	public String bocd;
	public String bldmngnn;
	public String chgbonm;

	public SS_L_NEWJUSO_APPRCURJUSOLISTRecord(){}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setMt(String mt){
		this.mt = mt;
	}

	public void setLocalnn1(String localnn1){
		this.localnn1 = localnn1;
	}

	public void setLocalnn2(String localnn2){
		this.localnn2 = localnn2;
	}

	public void setRdnm(String rdnm){
		this.rdnm = rdnm;
	}

	public void setBase(String base){
		this.base = base;
	}

	public void setBldgnn1(String bldgnn1){
		this.bldgnn1 = bldgnn1;
	}

	public void setBldgnn2(String bldgnn2){
		this.bldgnn2 = bldgnn2;
	}

	public void setBldgnm(String bldgnm){
		this.bldgnm = bldgnm;
	}

	public void setAdminnm(String adminnm){
		this.adminnm = adminnm;
	}

	public void setLargedlvnm(String largedlvnm){
		this.largedlvnm = largedlvnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setUseyn(String useyn){
		this.useyn = useyn;
	}

	public void setAppryn(String appryn){
		this.appryn = appryn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}
	
	public void setChgbonm(String chgbonm){
		this.chgbonm = chgbonm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getMt(){
		return this.mt;
	}

	public String getLocalnn1(){
		return this.localnn1;
	}

	public String getLocalnn2(){
		return this.localnn2;
	}

	public String getRdnm(){
		return this.rdnm;
	}

	public String getBase(){
		return this.base;
	}

	public String getBldgnn1(){
		return this.bldgnn1;
	}

	public String getBldgnn2(){
		return this.bldgnn2;
	}

	public String getBldgnm(){
		return this.bldgnm;
	}

	public String getAdminnm(){
		return this.adminnm;
	}

	public String getLargedlvnm(){
		return this.largedlvnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getUseyn(){
		return this.useyn;
	}

	public String getAppryn(){
		return this.appryn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}
	
	public String getChgbonm(){
		return this.bonm;
	}
}

/* 작성시간 : Fri Nov 22 04:51:55 GMT 2013 */