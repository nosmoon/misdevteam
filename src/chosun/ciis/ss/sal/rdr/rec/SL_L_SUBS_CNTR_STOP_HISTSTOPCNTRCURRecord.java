/***************************************************************************************************
* 파일명 : SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord.java
* 기능 : 독자정보관리(중지내역팝업)(목록조회)
* 작성일자 : 2004-04-01
* 작성자 : 김영윤
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
 * 독자정보관리(중지내역팝업)(목록조회)
 *
 */

public class SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String medinm;
	public String suspdt;
	public String suspresncd;
	public String suspresn;
	public String rdr_extndt;
	public String valmm;
	public String rdr_extnno;
	public String rdr_extntypecd;
	public String rdr_extntype;
	public String extnnm;
	public int subsuprc;
	public int subsqty;
	public int dscnamt;
	public int rdr_extncost;
	public String freeyn;
	public String freeclsf;
	public String bns_itemnm;
	public String cancposbyn;

	public SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public void setSuspresn(String suspresn){
		this.suspresn = suspresn;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdr_extntype(String rdr_extntype){
		this.rdr_extntype = rdr_extntype;
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

	public void setRdr_extncost(int rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setCancposbyn(String cancposbyn){
		this.cancposbyn = cancposbyn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}

	public String getSuspresn(){
		return this.suspresn;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getRdr_extntype(){
		return this.rdr_extntype;
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

	public int getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public String getCancposbyn(){
		return this.cancposbyn;
	}
}

/* 작성시간 : Sat Apr 03 21:58:52 KST 2004 */