/***************************************************************************************************
* 파일명 : SS_L_MIGRWORKPTCRCURCOMMLISTRecord.java
* 기능 : 관리자-작업-마이그레이션-목록(내역)을 위한 Record
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-작업-마이그레이션-목록(내역)을 위한 Record
 */

public class SS_L_MIGRWORKPTCRCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String workclsf;
	public String workno;
	public String dtlsworkno;
	public String workdescri;
	public Timestamp workfrdt;
	public Timestamp worktodt;
	public String srctbl;
	public String targtbl;
	public int abstrnoit;
	public int switnoit;
	public String errcd;
	public String errmsg;

	public SS_L_MIGRWORKPTCRCURCOMMLISTRecord(){}

	public void setWorkclsf(String workclsf){
		this.workclsf = workclsf;
	}

	public void setWorkno(String workno){
		this.workno = workno;
	}

	public void setDtlsworkno(String dtlsworkno){
		this.dtlsworkno = dtlsworkno;
	}

	public void setWorkdescri(String workdescri){
		this.workdescri = workdescri;
	}

	public void setWorkfrdt(Timestamp workfrdt){
		this.workfrdt = workfrdt;
	}

	public void setWorktodt(Timestamp worktodt){
		this.worktodt = worktodt;
	}

	public void setSrctbl(String srctbl){
		this.srctbl = srctbl;
	}

	public void setTargtbl(String targtbl){
		this.targtbl = targtbl;
	}

	public void setAbstrnoit(int abstrnoit){
		this.abstrnoit = abstrnoit;
	}

	public void setSwitnoit(int switnoit){
		this.switnoit = switnoit;
	}

	public void setErrcd(String errcd){
		this.errcd = errcd;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getWorkclsf(){
		return this.workclsf;
	}

	public String getWorkno(){
		return this.workno;
	}

	public String getDtlsworkno(){
		return this.dtlsworkno;
	}

	public String getWorkdescri(){
		return this.workdescri;
	}

	public Timestamp getWorkfrdt(){
		return this.workfrdt;
	}

	public Timestamp getWorktodt(){
		return this.worktodt;
	}

	public String getSrctbl(){
		return this.srctbl;
	}

	public String getTargtbl(){
		return this.targtbl;
	}

	public int getAbstrnoit(){
		return this.abstrnoit;
	}

	public int getSwitnoit(){
		return this.switnoit;
	}

	public String getErrcd(){
		return this.errcd;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
}

/* 작성시간 : Mon Mar 15 13:15:14 KST 2004 */