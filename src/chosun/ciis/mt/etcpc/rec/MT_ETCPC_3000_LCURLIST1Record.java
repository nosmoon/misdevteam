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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_3000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String swmang_no;
	public String make_cmpy;
	public String swnm;
	public String swkind;
	public String use_usag;
	public String buy_dt;
	public String buy_draft_dept;
	public String buy_draft_dept_nm;
	public String buy_draft_no;
	public String swlics_cnt;
	public String swlics_cnt2;
	public String gds_key;
	public String lics_certi_no;
	public String swver;
	public String remk;

	public MT_ETCPC_3000_LCURLIST1Record(){}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setSwkind(String swkind){
		this.swkind = swkind;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setBuy_draft_dept(String buy_draft_dept){
		this.buy_draft_dept = buy_draft_dept;
	}

	public void setBuy_draft_dept_nm(String buy_draft_dept_nm){
		this.buy_draft_dept_nm = buy_draft_dept_nm;
	}

	public void setBuy_draft_no(String buy_draft_no){
		this.buy_draft_no = buy_draft_no;
	}

	public void setSwlics_cnt(String swlics_cnt){
		this.swlics_cnt = swlics_cnt;
	}

	public void setSwlics_cnt2(String swlics_cnt2){
		this.swlics_cnt2 = swlics_cnt2;
	}

	public void setGds_key(String gds_key){
		this.gds_key = gds_key;
	}

	public void setLics_certi_no(String lics_certi_no){
		this.lics_certi_no = lics_certi_no;
	}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getSwkind(){
		return this.swkind;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getBuy_draft_dept(){
		return this.buy_draft_dept;
	}

	public String getBuy_draft_dept_nm(){
		return this.buy_draft_dept_nm;
	}

	public String getBuy_draft_no(){
		return this.buy_draft_no;
	}

	public String getSwlics_cnt(){
		return this.swlics_cnt;
	}

	public String getSwlics_cnt2(){
		return this.swlics_cnt2;
	}

	public String getGds_key(){
		return this.gds_key;
	}

	public String getLics_certi_no(){
		return this.lics_certi_no;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Mar 26 17:42:16 KST 2009 */