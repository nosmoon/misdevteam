/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-발송-목록
* 작성일자 : 2009-09-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-신문지원물품-발송-목록
 */

public class SS_L_NWSPITEMSENDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sendplacnm;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String itemnm;
	public String itemclsfnm;
	public int aplcqunt;
	public int accdqunt;
	public String senddt;

	public SS_L_NWSPITEMSENDCURCOMMLISTRecord(){}

	public void setSendplacnm(String sendplacnm){
		this.sendplacnm = sendplacnm;
	}

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

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setItemclsfnm(String itemclsfnm){
		this.itemclsfnm = itemclsfnm;
	}

	public void setAplcqunt(int aplcqunt){
		this.aplcqunt = aplcqunt;
	}

	public void setAccdqunt(int accdqunt){
		this.accdqunt = accdqunt;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public String getSendplacnm(){
		return this.sendplacnm;
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

	public String getItemnm(){
		return this.itemnm;
	}

	public String getItemclsfnm(){
		return this.itemclsfnm;
	}

	public int getAplcqunt(){
		return this.aplcqunt;
	}

	public int getAccdqunt(){
		return this.accdqunt;
	}

	public String getSenddt(){
		return this.senddt;
	}
}

/* 작성시간 : Sun Sep 06 19:22:10 KST 2009 */