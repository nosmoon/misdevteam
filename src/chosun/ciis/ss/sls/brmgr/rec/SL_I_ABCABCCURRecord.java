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


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SL_I_ABCABCCURRecord extends java.lang.Object implements java.io.Serializable{

	public String basiyymm;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String bocd;
	public String valyymm;
	public String abcvalyymm;
	public String dscnamt;
	public String subsqty;
	public String resitypecd;
	public String rdr_extndt;
	public String clamtmms;
	public String re_freemms;
	public String clamthsty;
	public String status;

	public SL_I_ABCABCCURRecord(){}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setValyymm(String valyymm){
		this.valyymm = valyymm;
	}

	public void setAbcvalyymm(String abcvalyymm){
		this.abcvalyymm = abcvalyymm;
	}

	public void setDscnamt(String dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setClamtmms(String clamtmms){
		this.clamtmms = clamtmms;
	}

	public void setRe_freemms(String re_freemms){
		this.re_freemms = re_freemms;
	}

	public void setClamthsty(String clamthsty){
		this.clamthsty = clamthsty;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getBasiyymm(){
		return this.basiyymm;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getValyymm(){
		return this.valyymm;
	}

	public String getAbcvalyymm(){
		return this.abcvalyymm;
	}

	public String getDscnamt(){
		return this.dscnamt;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getClamtmms(){
		return this.clamtmms;
	}

	public String getRe_freemms(){
		return this.re_freemms;
	}

	public String getClamthsty(){
		return this.clamthsty;
	}

	public String getStatus(){
		return this.status;
	}
}

/* 작성시간 : Thu Feb 25 15:02:39 KST 2010 */