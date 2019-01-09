/***************************************************************************************************
* 파일명 : CO_L_SCHECURCOMMLISTRecord.java
* 기능 : 정보공유-일정-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-일정-목록을 위한 Record
 */

public class CO_L_SCHECURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String schemangitemcd;
	public String schemangitemcd_nm;
	public String schemangunitcd;
	public String schemangunitcd_nm;
	public Timestamp frdt;
	public Timestamp todt;
	public String remk;
	public String deptcd;
	public String deptnm;
	public String use_pers;
	public String use_persclsf;
	public String empnm;

	public CO_L_SCHECURCOMMLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setSchemangitemcd(String schemangitemcd){
		this.schemangitemcd = schemangitemcd;
	}

	public void setSchemangitemcd_nm(String schemangitemcd_nm){
		this.schemangitemcd_nm = schemangitemcd_nm;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setSchemangunitcd_nm(String schemangunitcd_nm){
		this.schemangunitcd_nm = schemangunitcd_nm;
	}

	public void setFrdt(Timestamp frdt){
		this.frdt = frdt;
	}

	public void setTodt(Timestamp todt){
		this.todt = todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_persclsf(String use_persclsf){
		this.use_persclsf = use_persclsf;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getSchemangitemcd(){
		return this.schemangitemcd;
	}

	public String getSchemangitemcd_nm(){
		return this.schemangitemcd_nm;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getSchemangunitcd_nm(){
		return this.schemangunitcd_nm;
	}

	public Timestamp getFrdt(){
		return this.frdt;
	}

	public Timestamp getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_persclsf(){
		return this.use_persclsf;
	}

	public String getEmpnm(){
		return this.empnm;
	}
}

/* 작성시간 : Sat Jun 05 22:49:40 KST 2004 */