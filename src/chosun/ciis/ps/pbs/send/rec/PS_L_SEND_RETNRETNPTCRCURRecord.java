/***************************************************************************************************
* 파일명 : SP_PS_L_SEND_RETN.java
* 발송-반송관리 조회화면
* 작성일자 : 2004-03-19
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-반송관리 조회화면
 *
 */

public class PS_L_SEND_RETNRETNPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdrnm;
	public String retnseq;
	public String retndt;
	public String retnclsf;
	public String retnclsf_nm;
	public String retn_nmno;
	public String bns_bookcd;
	public String bns_booknm;
	public String agrmntdt;
	public String agrmntamt;
	public String retnresncd;
	public String retnresncd_nm;
	public String memo;
	public String boprocyn;
	public String boprocdt;
	public String boprocmemo;
	public String bocd;

	public PS_L_SEND_RETNRETNPTCRCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRetnseq(String retnseq){
		this.retnseq = retnseq;
	}

	public void setRetndt(String retndt){
		this.retndt = retndt;
	}

	public void setRetnclsf(String retnclsf){
		this.retnclsf = retnclsf;
	}

	public void setRetnclsf_nm(String retnclsf_nm){
		this.retnclsf_nm = retnclsf_nm;
	}

	public void setRetn_nmno(String retn_nmno){
		this.retn_nmno = retn_nmno;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setAgrmntdt(String agrmntdt){
		this.agrmntdt = agrmntdt;
	}

	public void setAgrmntamt(String agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public void setRetnresncd(String retnresncd){
		this.retnresncd = retnresncd;
	}

	public void setRetnresncd_nm(String retnresncd_nm){
		this.retnresncd_nm = retnresncd_nm;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoprocdt(String boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setBoprocmemo(String boprocmemo){
		this.boprocmemo = boprocmemo;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRetnseq(){
		return this.retnseq;
	}

	public String getRetndt(){
		return this.retndt;
	}

	public String getRetnclsf(){
		return this.retnclsf;
	}

	public String getRetnclsf_nm(){
		return this.retnclsf_nm;
	}

	public String getRetn_nmno(){
		return this.retn_nmno;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public String getAgrmntdt(){
		return this.agrmntdt;
	}

	public String getAgrmntamt(){
		return this.agrmntamt;
	}

	public String getRetnresncd(){
		return this.retnresncd;
	}

	public String getRetnresncd_nm(){
		return this.retnresncd_nm;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoprocdt(){
		return this.boprocdt;
	}

	public String getBoprocmemo(){
		return this.boprocmemo;
	}

	public String getBocd(){
		return this.bocd;
	}
}

/* 작성시간 : Fri Apr 18 16:58:09 KST 2008 */