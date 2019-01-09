/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 조회
* 작성일자 : 2009-04-29
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-담당별 우편번호 변경처리 조회
 */

public class SS_L_CHGZIPCODEADDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chgclsf;
	public String chgclsfnm;
	public String zip1;
	public String zip2;
	public String zip3;
	public String newzipcode;
	public String newaddr;
	public String oldzipcode;
	public String oldaddr;
	public String stat;
	public String statnm;
	public String chgresn;
	public String incmgpers;
	public Timestamp incmgtm;
	public String chgpers;
	public Timestamp chgtm;

	public SS_L_CHGZIPCODEADDRLISTRecord(){}

	public void setChgclsf(String chgclsf){
		this.chgclsf = chgclsf;
	}

	public void setChgclsfnm(String chgclsfnm){
		this.chgclsfnm = chgclsfnm;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public void setNewzipcode(String newzipcode){
		this.newzipcode = newzipcode;
	}

	public void setNewaddr(String newaddr){
		this.newaddr = newaddr;
	}

	public void setOldzipcode(String oldzipcode){
		this.oldzipcode = oldzipcode;
	}

	public void setOldaddr(String oldaddr){
		this.oldaddr = oldaddr;
	}

	public void setStat(String stat){
		this.stat = stat;
	}

	public void setStatnm(String statnm){
		this.statnm = statnm;
	}

	public void setChgresn(String chgresn){
		this.chgresn = chgresn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgtm(Timestamp incmgtm){
		this.incmgtm = incmgtm;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgtm(Timestamp chgtm){
		this.chgtm = chgtm;
	}

	public String getChgclsf(){
		return this.chgclsf;
	}

	public String getChgclsfnm(){
		return this.chgclsfnm;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getNewzipcode(){
		return this.newzipcode;
	}

	public String getNewaddr(){
		return this.newaddr;
	}

	public String getOldzipcode(){
		return this.oldzipcode;
	}

	public String getOldaddr(){
		return this.oldaddr;
	}

	public String getStat(){
		return this.stat;
	}

	public String getStatnm(){
		return this.statnm;
	}

	public String getChgresn(){
		return this.chgresn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public Timestamp getIncmgtm(){
		return this.incmgtm;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public Timestamp getChgtm(){
		return this.chgtm;
	}
}

/* 작성시간 : Thu Apr 30 14:32:23 KST 2009 */