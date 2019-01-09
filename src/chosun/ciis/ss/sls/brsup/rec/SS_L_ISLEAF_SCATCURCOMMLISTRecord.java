/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-전단현황-리스트
* 작성일자 : 2009-09-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-전단현황-리스트
 */

public class SS_L_ISLEAF_SCATCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String feeddt;
	public String advtmain;
	public String advtnm;
	public String std;
	public int qunt;
	public int uprc;
	public int amt;
	public String compnm;

	public SS_L_ISLEAF_SCATCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setFeeddt(String feeddt){
		this.feeddt = feeddt;
	}

	public void setAdvtmain(String advtmain){
		this.advtmain = advtmain;
	}

	public void setAdvtnm(String advtnm){
		this.advtnm = advtnm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setQunt(int qunt){
		this.qunt = qunt;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getFeeddt(){
		return this.feeddt;
	}

	public String getAdvtmain(){
		return this.advtmain;
	}

	public String getAdvtnm(){
		return this.advtnm;
	}

	public String getStd(){
		return this.std;
	}

	public int getQunt(){
		return this.qunt;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getCompnm(){
		return this.compnm;
	}
}

/* 작성시간 : Sun Sep 06 17:07:28 KST 2009 */