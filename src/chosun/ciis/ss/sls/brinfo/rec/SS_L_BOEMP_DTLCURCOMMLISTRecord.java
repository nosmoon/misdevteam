/***************************************************************************************************
* 파일명 : SS_L_BOEMP_DTLCURCOMMLISTRecord.java
* 기능 : 지국Info-지국종사원현황-상세목록을 위한 Record
* 작성일자 : 2004-11-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국Info-지국종사원현황-상세목록을 위한 Record
 */


public class SS_L_BOEMP_DTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flnm;
	public String dutynm;
	public String prn;
	public String tel1;
	public String tel2;
	public String tel3;
	public String addr;
	public String dtlsaddr;
	public String in_cmpy_dt;
	public String regdt;
	public String cctryn;

	public SS_L_BOEMP_DTLCURCOMMLISTRecord(){}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel1(String tel1){
		this.tel1 = tel1;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public void setTel3(String tel3){
		this.tel3 = tel3;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setCctryn(String cctryn){
		this.cctryn = cctryn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel1(){
		return this.tel1;
	}

	public String getTel2(){
		return this.tel2;
	}

	public String getTel3(){
		return this.tel3;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getCctryn(){
		return this.cctryn;
	}
}

/* 작성시간 : Fri Nov 12 16:49:17 KST 2004 */