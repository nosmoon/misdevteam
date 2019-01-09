/***************************************************************************************************
* 파일명 : SS_L_WRKDTLCURCOMMLISTRecord.java
* 기능 : 관리자-작업-작업이력-목록(내역) 을 위한 Record
* 작성일자 : 2004-04-10
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
 * 관리자-작업-작업이력-목록(내역) 을 위한 Record
 */

public class SS_L_WRKDTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String id;
	public String execno;
	public String execdtlsno;
	public String workdescri;
	public Timestamp workfrdt;
	public Timestamp worktodt;
	public String srctbl;
	public String targtbl;
	public int noit1;
	public int noit2;
	public String errcd;
	public String errmsg;

	public SS_L_WRKDTLCURCOMMLISTRecord(){}

	public void setId(String id){
		this.id = id;
	}

	public void setExecno(String execno){
		this.execno = execno;
	}

	public void setExecdtlsno(String execdtlsno){
		this.execdtlsno = execdtlsno;
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

	public void setNoit1(int noit1){
		this.noit1 = noit1;
	}

	public void setNoit2(int noit2){
		this.noit2 = noit2;
	}

	public void setErrcd(String errcd){
		this.errcd = errcd;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getId(){
		return this.id;
	}

	public String getExecno(){
		return this.execno;
	}

	public String getExecdtlsno(){
		return this.execdtlsno;
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

	public int getNoit1(){
		return this.noit1;
	}

	public int getNoit2(){
		return this.noit2;
	}

	public String getErrcd(){
		return this.errcd;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
}

/* 작성시간 : Mon Apr 12 11:46:05 KST 2004 */