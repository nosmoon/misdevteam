/***************************************************************************************************
* 파일명 : SS_MO_L_BSNSBSNSLISTRecord.java
* 기능 :  판매-발송관리-마감관리-발송노선 조회_모바일용
* 작성일자 : 2016-12-28
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 발송처코드, 발송처코드명 추가
* 수정자 : 장선희
* 수정일자 : 2017-08-24
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 *
 */


public class SS_MO_L_BSNSBSNSLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String mcname;
	public String jbpansu;
	public String jpcode;
	public String jpname;
	public String send_rank;
	public String inname;
	public String passage;
	public String jbjiorder;
	public String jiname;
	public String jbbusu;
	public String jbbalcha;
	public String jbyetime;
	public String jbdotime;
	public String send_plac_seq;
	public String send_plac_nm;

	public SS_MO_L_BSNSBSNSLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMcname(String mcname){
		this.mcname = mcname;
	}

	public void setJbpansu(String jbpansu){
		this.jbpansu = jbpansu;
	}

	public void setJpcode(String jpcode){
		this.jpcode = jpcode;
	}

	public void setJpname(String jpname){
		this.jpname = jpname;
	}

	public void setSend_rank(String send_rank){
		this.send_rank = send_rank;
	}

	public void setInname(String inname){
		this.inname = inname;
	}

	public void setPassage(String passage){
		this.passage = passage;
	}

	public void setJbjiorder(String jbjiorder){
		this.jbjiorder = jbjiorder;
	}

	public void setJiname(String jiname){
		this.jiname = jiname;
	}

	public void setJbbusu(String jbbusu){
		this.jbbusu = jbbusu;
	}

	public void setJbbalcha(String jbbalcha){
		this.jbbalcha = jbbalcha;
	}

	public void setJbyetime(String jbyetime){
		this.jbyetime = jbyetime;
	}

	public void setJbdotime(String jbdotime){
		this.jbdotime = jbdotime;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMcname(){
		return this.mcname;
	}

	public String getJbpansu(){
		return this.jbpansu;
	}

	public String getJpcode(){
		return this.jpcode;
	}

	public String getJpname(){
		return this.jpname;
	}

	public String getSend_rank(){
		return this.send_rank;
	}

	public String getInname(){
		return this.inname;
	}

	public String getPassage(){
		return this.passage;
	}

	public String getJbjiorder(){
		return this.jbjiorder;
	}

	public String getJiname(){
		return this.jiname;
	}

	public String getJbbusu(){
		return this.jbbusu;
	}

	public String getJbbalcha(){
		return this.jbbalcha;
	}

	public String getJbyetime(){
		return this.jbyetime;
	}

	public String getJbdotime(){
		return this.jbdotime;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}
}

/* 작성시간 : Thu Aug 24 16:48:05 KST 2017 */