/***************************************************************************************************
* 파일명 : SS_L_MIG_CONV_STATUSCURCOMMLISTRecord.java
* 기능 : 관리자-작업-마이그레이션-목록을 위한 Record
* 작성일자 : 2004-02-13
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
 * 관리자-작업-마이그레이션-목록을 위한 Record
 */

public class SS_L_MIG_CONV_STATUSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public Timestamp start_time;
	public Timestamp end_time;
	public String src_tblnm;
	public String trg_tblnm;
	public String status;
	public int src_count;
	public int trg_count;
	public String err_code;
	public String err_msg;
	public String sp_name;
	public String sp_desc;

	public SS_L_MIG_CONV_STATUSCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setStart_time(Timestamp start_time){
		this.start_time = start_time;
	}

	public void setEnd_time(Timestamp end_time){
		this.end_time = end_time;
	}

	public void setSrc_tblnm(String src_tblnm){
		this.src_tblnm = src_tblnm;
	}

	public void setTrg_tblnm(String trg_tblnm){
		this.trg_tblnm = trg_tblnm;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setSrc_count(int src_count){
		this.src_count = src_count;
	}

	public void setTrg_count(int trg_count){
		this.trg_count = trg_count;
	}

	public void setErr_code(String err_code){
		this.err_code = err_code;
	}

	public void setErr_msg(String err_msg){
		this.err_msg = err_msg;
	}

	public void setSp_name(String sp_name){
		this.sp_name = sp_name;
	}

	public void setSp_desc(String sp_desc){
		this.sp_desc = sp_desc;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public Timestamp getStart_time(){
		return this.start_time;
	}

	public Timestamp getEnd_time(){
		return this.end_time;
	}

	public String getSrc_tblnm(){
		return this.src_tblnm;
	}

	public String getTrg_tblnm(){
		return this.trg_tblnm;
	}

	public String getStatus(){
		return this.status;
	}

	public int getSrc_count(){
		return this.src_count;
	}

	public int getTrg_count(){
		return this.trg_count;
	}

	public String getErr_code(){
		return this.err_code;
	}

	public String getErr_msg(){
		return this.err_msg;
	}

	public String getSp_name(){
		return this.sp_name;
	}

	public String getSp_desc(){
		return this.sp_desc;
	}
}

/* 작성시간 : Sat Feb 14 15:15:39 KST 2004 */