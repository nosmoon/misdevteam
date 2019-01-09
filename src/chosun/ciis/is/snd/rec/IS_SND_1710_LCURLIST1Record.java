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


package chosun.ciis.is.snd.rec;

import java.sql.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;

/**
 * 
 */


public class IS_SND_1710_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String wh_cd;
	public String send_dt;
	public String send_seq;
	public String send_atic_no;
	public String send_atic_nm;
	public String sendclsf;
	public String serv_ref;
	public String cntc_plac;
	public String send_fee;
	public String start_tm;
	public String end_tm;
	public String send_path;
	public String send_advt_cont;
	public String send_qunt;
	public String remk;

	public IS_SND_1710_LCURLIST1Record(){}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSend_dt(String send_dt){
		this.send_dt = send_dt;
	}

	public void setSend_seq(String send_seq){
		this.send_seq = send_seq;
	}

	public void setSend_atic_no(String send_atic_no){
		this.send_atic_no = send_atic_no;
	}

	public void setSend_atic_nm(String send_atic_nm){
		this.send_atic_nm = send_atic_nm;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setServ_ref(String serv_ref){
		this.serv_ref = serv_ref;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setSend_fee(String send_fee){
		this.send_fee = send_fee;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setEnd_tm(String end_tm){
		this.end_tm = end_tm;
	}

	public void setSend_path(String send_path){
		this.send_path = send_path;
	}

	public void setSend_advt_cont(String send_advt_cont){
		this.send_advt_cont = send_advt_cont;
	}

	public void setSend_qunt(String send_qunt){
		this.send_qunt = send_qunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSend_dt(){
		return this.send_dt;
	}

	public String getSend_seq(){
		return this.send_seq;
	}

	public String getSend_atic_no(){
		return this.send_atic_no;
	}

	public String getSend_atic_nm(){
		return this.send_atic_nm;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getServ_ref(){
		return this.serv_ref;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getSend_fee(){
		return this.send_fee;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getEnd_tm(){
		return this.end_tm;
	}

	public String getSend_path(){
		return this.send_path;
	}

	public String getSend_advt_cont(){
		return this.send_advt_cont;
	}

	public String getSend_qunt(){
		return this.send_qunt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu May 31 09:13:26 KST 2012 */