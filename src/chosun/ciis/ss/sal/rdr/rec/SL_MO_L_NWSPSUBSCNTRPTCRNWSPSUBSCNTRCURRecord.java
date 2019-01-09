/***************************************************************************************************
* 파일명 :SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord.java_모바일용
* 기능 : 판매-독자관리-독자정보검색-독자정보조회-구독내역팝업-구독리스트
* 작성일자 : 2017-02-06
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String medinm;
	public String suspdt;
	public String bonm;
	public String rdr_extntypenm;
	public String remk;
	public String extnnm;
	public int subsuprc;
	public int subsqty;
	public int dscnamt;
	public int post_dlvfee;
	public int rdr_extncost;
	public String freeyn;
	public String freeclsf;
	public String suspresncd;

	public SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord(){}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setSubsqty(int subsqty){
		this.subsqty = subsqty;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setPost_dlvfee(int post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setRdr_extncost(int rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public int getSubsqty(){
		return this.subsqty;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public int getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public int getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}
}

/* 작성시간 : Mon Feb 06 10:54:22 KST 2017 */