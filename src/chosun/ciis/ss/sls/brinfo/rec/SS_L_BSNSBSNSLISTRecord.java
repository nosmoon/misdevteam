/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국Info-발송노선(발차노선조회)
* 작성일자 : 2009-10-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 *  지국Info-발송노선(발차노선조회)
 */

public class SS_L_BSNSBSNSLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String mcname;
	public String jbpansu;
	public String jpname;
	public String inname;
	public String passage;
	public String jbjiorder;
	public String jiname;
	public String jbbusu;
	public String jbbalcha;
	public String jbyetime;
	public String jbdotime;

	public SS_L_BSNSBSNSLISTRecord(){}

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

	public void setJpname(String jpname){
		this.jpname = jpname;
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

	public String getJpname(){
		return this.jpname;
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
}

/* 작성시간 : Wed Oct 07 16:31:25 KST 2009 */