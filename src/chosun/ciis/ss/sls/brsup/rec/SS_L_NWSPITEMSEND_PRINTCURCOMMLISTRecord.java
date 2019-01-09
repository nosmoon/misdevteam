/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-신청-인쇄
* 작성일자 : 2009-04-07
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-신문지원물품-신청-인쇄
 */

public class SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sendplacnm;
	public String nbisc;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String itemnm;
	public String itemclsfnm;
	public int aplcqunt;
	public int accdqunt;
	public int uprc;
	public int amt;
	public String senddt;
	public String aplcdt;

	public SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord(){}

	public void setSendplacnm(String sendplacnm){
		this.sendplacnm = sendplacnm;
	}

	public void setNbisc(String nbisc){
		this.nbisc = nbisc;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
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

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public String getSendplacnm(){
		return this.sendplacnm;
	}

	public String getNbisc(){
		return this.nbisc;
	}

	public String getDeptnm(){
		return this.deptnm;
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

	public int getUprc(){
		return this.uprc;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}
}

/* 작성시간 : Tue Apr 07 18:04:34 KST 2009 */