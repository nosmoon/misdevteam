/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-마스터 우편번호 변경처리 조회
* 작성일자 : 2009-05-07
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-마스터 우편번호 변경처리 조회
 */

public class SS_L_MSTZIPCODEADDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String workver;
	public String newzip1;
	public String newzip2;
	public String newzip3;
	public String newzip4;
	public String chgclsf;
	public String stat;
	public String chgclsfnm;
	public String statnm;
	public String dtlzipcode;
	public String dtladdr;
	public String newbgnbnji;
	public String newendbnji;
	public String bocd;
	public String bonm;
	public String mstzipcode;
	public String mstaddr;
	public String mstnewbgnbnji;
	public String mstnewendbnji;
	public String mstbonm;
	public String empnm;
	public String chgresn;

	public SS_L_MSTZIPCODEADDRLISTRecord(){}

	public void setWorkver(String workver){
		this.workver = workver;
	}

	public void setNewzip1(String newzip1){
		this.newzip1 = newzip1;
	}

	public void setNewzip2(String newzip2){
		this.newzip2 = newzip2;
	}

	public void setNewzip3(String newzip3){
		this.newzip3 = newzip3;
	}

	public void setNewzip4(String newzip4){
		this.newzip4 = newzip4;
	}

	public void setChgclsf(String chgclsf){
		this.chgclsf = chgclsf;
	}

	public void setStat(String stat){
		this.stat = stat;
	}

	public void setChgclsfnm(String chgclsfnm){
		this.chgclsfnm = chgclsfnm;
	}

	public void setStatnm(String statnm){
		this.statnm = statnm;
	}

	public void setDtlzipcode(String dtlzipcode){
		this.dtlzipcode = dtlzipcode;
	}

	public void setDtladdr(String dtladdr){
		this.dtladdr = dtladdr;
	}

	public void setNewbgnbnji(String newbgnbnji){
		this.newbgnbnji = newbgnbnji;
	}

	public void setNewendbnji(String newendbnji){
		this.newendbnji = newendbnji;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMstzipcode(String mstzipcode){
		this.mstzipcode = mstzipcode;
	}

	public void setMstaddr(String mstaddr){
		this.mstaddr = mstaddr;
	}

	public void setMstnewbgnbnji(String mstnewbgnbnji){
		this.mstnewbgnbnji = mstnewbgnbnji;
	}

	public void setMstnewendbnji(String mstnewendbnji){
		this.mstnewendbnji = mstnewendbnji;
	}

	public void setMstbonm(String mstbonm){
		this.mstbonm = mstbonm;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setChgresn(String chgresn){
		this.chgresn = chgresn;
	}

	public String getWorkver(){
		return this.workver;
	}

	public String getNewzip1(){
		return this.newzip1;
	}

	public String getNewzip2(){
		return this.newzip2;
	}

	public String getNewzip3(){
		return this.newzip3;
	}

	public String getNewzip4(){
		return this.newzip4;
	}

	public String getChgclsf(){
		return this.chgclsf;
	}

	public String getStat(){
		return this.stat;
	}

	public String getChgclsfnm(){
		return this.chgclsfnm;
	}

	public String getStatnm(){
		return this.statnm;
	}

	public String getDtlzipcode(){
		return this.dtlzipcode;
	}

	public String getDtladdr(){
		return this.dtladdr;
	}

	public String getNewbgnbnji(){
		return this.newbgnbnji;
	}

	public String getNewendbnji(){
		return this.newendbnji;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMstzipcode(){
		return this.mstzipcode;
	}

	public String getMstaddr(){
		return this.mstaddr;
	}

	public String getMstnewbgnbnji(){
		return this.mstnewbgnbnji;
	}

	public String getMstnewendbnji(){
		return this.mstnewendbnji;
	}

	public String getMstbonm(){
		return this.mstbonm;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getChgresn(){
		return this.chgresn;
	}
}

/* 작성시간 : Thu May 07 20:01:04 KST 2009 */