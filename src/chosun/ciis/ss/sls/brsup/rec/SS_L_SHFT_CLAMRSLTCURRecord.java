/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
* 작성일자 : 2009-04-14
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 */

public class SS_L_SHFT_CLAMRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String areanm;
	public int giroclamnoit;
	public int giroclamtotamt;
	public int girorecpnoit;
	public int girorecptotamt;
	public int docardclamnoit;
	public int docardclamtotamt;
	public int docardrecpnoit;
	public int docardrecptotamt;
	public int cardclamnoit;
	public int cardclamtotamt;
	public int cardrecpnoit;
	public int cardrecptotamt;

	public SS_L_SHFT_CLAMRSLTCURRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setGiroclamnoit(int giroclamnoit){
		this.giroclamnoit = giroclamnoit;
	}

	public void setGiroclamtotamt(int giroclamtotamt){
		this.giroclamtotamt = giroclamtotamt;
	}

	public void setGirorecpnoit(int girorecpnoit){
		this.girorecpnoit = girorecpnoit;
	}

	public void setGirorecptotamt(int girorecptotamt){
		this.girorecptotamt = girorecptotamt;
	}

	public void setDocardclamnoit(int docardclamnoit){
		this.docardclamnoit = docardclamnoit;
	}

	public void setDocardclamtotamt(int docardclamtotamt){
		this.docardclamtotamt = docardclamtotamt;
	}

	public void setDocardrecpnoit(int docardrecpnoit){
		this.docardrecpnoit = docardrecpnoit;
	}

	public void setDocardrecptotamt(int docardrecptotamt){
		this.docardrecptotamt = docardrecptotamt;
	}

	public void setCardclamnoit(int cardclamnoit){
		this.cardclamnoit = cardclamnoit;
	}

	public void setCardclamtotamt(int cardclamtotamt){
		this.cardclamtotamt = cardclamtotamt;
	}

	public void setCardrecpnoit(int cardrecpnoit){
		this.cardrecpnoit = cardrecpnoit;
	}

	public void setCardrecptotamt(int cardrecptotamt){
		this.cardrecptotamt = cardrecptotamt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public int getGiroclamnoit(){
		return this.giroclamnoit;
	}

	public int getGiroclamtotamt(){
		return this.giroclamtotamt;
	}

	public int getGirorecpnoit(){
		return this.girorecpnoit;
	}

	public int getGirorecptotamt(){
		return this.girorecptotamt;
	}

	public int getDocardclamnoit(){
		return this.docardclamnoit;
	}

	public int getDocardclamtotamt(){
		return this.docardclamtotamt;
	}

	public int getDocardrecpnoit(){
		return this.docardrecpnoit;
	}

	public int getDocardrecptotamt(){
		return this.docardrecptotamt;
	}

	public int getCardclamnoit(){
		return this.cardclamnoit;
	}

	public int getCardclamtotamt(){
		return this.cardclamtotamt;
	}

	public int getCardrecpnoit(){
		return this.cardrecpnoit;
	}

	public int getCardrecptotamt(){
		return this.cardrecptotamt;
	}
}

/* 작성시간 : Tue Apr 14 14:50:31 KST 2009 */