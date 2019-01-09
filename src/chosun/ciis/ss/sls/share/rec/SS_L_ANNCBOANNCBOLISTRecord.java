/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 리스트(조회)
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-실시간공지-지국공지 리스트(조회)
 */

public class SS_L_ANNCBOANNCBOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String makepersid;
	public String makepersnm;
	public String posicd;
	public String posinm;
	public String deptcd;
	public String deptnm;
	public String rmsgclsf;
	public String rmsgdept;
	public String rmsgdeptnm;
	public String rmsgarea;
	public String rmsgareanm;
	public String anncbgntm;
	public String anncendtm;
	public String annctitl;
	public String annccont;
	public String incmgpers;
	public String incmgdt;
	public String chgpers;
	public String chgdt;

	public SS_L_ANNCBOANNCBOLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setPosicd(String posicd){
		this.posicd = posicd;
	}

	public void setPosinm(String posinm){
		this.posinm = posinm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setRmsgclsf(String rmsgclsf){
		this.rmsgclsf = rmsgclsf;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgdeptnm(String rmsgdeptnm){
		this.rmsgdeptnm = rmsgdeptnm;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgareanm(String rmsgareanm){
		this.rmsgareanm = rmsgareanm;
	}

	public void setAnncbgntm(String anncbgntm){
		this.anncbgntm = anncbgntm;
	}

	public void setAnncendtm(String anncendtm){
		this.anncendtm = anncendtm;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getPosicd(){
		return this.posicd;
	}

	public String getPosinm(){
		return this.posinm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getRmsgclsf(){
		return this.rmsgclsf;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgdeptnm(){
		return this.rmsgdeptnm;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgareanm(){
		return this.rmsgareanm;
	}

	public String getAnncbgntm(){
		return this.anncbgntm;
	}

	public String getAnncendtm(){
		return this.anncendtm;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}
}

/* 작성시간 : Thu Apr 16 19:59:05 KST 2009 */