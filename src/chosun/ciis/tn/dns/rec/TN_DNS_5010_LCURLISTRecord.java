/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.dns.rec;

import java.sql.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 * 
 */


public class TN_DNS_5010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String subs_nm;
	public String subs_addr;
	public String subs_tel;
	public String subs_email;
	public String agree_yn;
	public String etc1;
	public String etc2;
	public String etc3;
	public String etc4;
	public String etc5;
	public String event_cd;
	public String incmgdt;

	public TN_DNS_5010_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubs_nm(String subs_nm){
		this.subs_nm = subs_nm;
	}

	public void setSubs_addr(String subs_addr){
		this.subs_addr = subs_addr;
	}

	public void setSubs_tel(String subs_tel){
		this.subs_tel = subs_tel;
	}

	public void setSubs_email(String subs_email){
		this.subs_email = subs_email;
	}

	public void setAgree_yn(String agree_yn){
		this.agree_yn = agree_yn;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public void setEtc4(String etc4){
		this.etc4 = etc4;
	}

	public void setEtc5(String etc5){
		this.etc5 = etc5;
	}

	public void setEvent_cd(String event_cd){
		this.event_cd = event_cd;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubs_nm(){
		return this.subs_nm;
	}

	public String getSubs_addr(){
		return this.subs_addr;
	}

	public String getSubs_tel(){
		return this.subs_tel;
	}

	public String getSubs_email(){
		return this.subs_email;
	}

	public String getAgree_yn(){
		return this.agree_yn;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public String getEtc4(){
		return this.etc4;
	}

	public String getEtc5(){
		return this.etc5;
	}

	public String getEvent_cd(){
		return this.event_cd;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}
}

/* 작성시간 : Thu Jun 01 13:56:28 KST 2017 */