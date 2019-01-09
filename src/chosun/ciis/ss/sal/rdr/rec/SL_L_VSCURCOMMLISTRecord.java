/***************************************************************************************************
* 파일명 : SL_L_VSCURCOMMLISTRecord.java
* 기능 : 독자-VacationStop관리-목록
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
 * 독자-VacationStop관리-목록
 *
 */

public class SL_L_VSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String medinm;
	public String aplcdt;
	public String suspfrdt;
	public String susptodt;
	public String clsfnm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String bocnfmyn;
	public String vaca_areadlvofficnfmyn;

	public SL_L_VSCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setClsfnm(String clsfnm){
		this.clsfnm = clsfnm;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setVaca_areadlvofficnfmyn(String vaca_areadlvofficnfmyn){
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getClsfnm(){
		return this.clsfnm;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getVaca_areadlvofficnfmyn(){
		return this.vaca_areadlvofficnfmyn;
	}
}

/* 작성시간 : Thu Apr 01 22:20:38 KST 2004 */