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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_4120_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String umsidx;
	public String deptidx;
	public String status;
	public String purpose;
	public String title;
	public String sendtype;
	public String startdate;
	public String enddate;
	public String remk1;
	public String remk2;
	public String sendcontents;
	public String isreserved;
	public String adminname;
	public String writedate;
	public String memo;

	public TN_LNK_4120_LCURLIST1Record(){}

	public void setUmsidx(String umsidx){
		this.umsidx = umsidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setPurpose(String purpose){
		this.purpose = purpose;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setSendtype(String sendtype){
		this.sendtype = sendtype;
	}

	public void setStartdate(String startdate){
		this.startdate = startdate;
	}

	public void setRemk1(String remk1){
		this.remk1 = remk1;
	}

	public void setRemk2(String remk2){
		this.remk2 = remk2;
	}

	public void setSendcontents(String sendcontents){
		this.sendcontents = sendcontents;
	}

	public void setIsreserved(String isreserved){
		this.isreserved = isreserved;
	}

	public void setAdminname(String adminname){
		this.adminname = adminname;
	}

	public void setWritedate(String writedate){
		this.writedate = writedate;
	}
	
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getUmsidx(){
		return this.umsidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getStatus(){
		return this.status;
	}

	public String getPurpose(){
		return this.purpose;
	}

	public String getTitle(){
		return this.title;
	}

	public String getSendtype(){
		return this.sendtype;
	}

	public String getStartdate(){
		return this.startdate;
	}

	public String getRemk1(){
		return this.remk1;
	}

	public String getRemk2(){
		return this.remk2;
	}

	public String getSendcontents(){
		return this.sendcontents;
	}

	public String getIsreserved(){
		return this.isreserved;
	}

	public String getAdminname(){
		return this.adminname;
	}

	public String getWritedate(){
		return this.writedate;
	}

	public String getEnddate() {
		return enddate;
	}
	
	public String getMemo() {
		return memo;
	}

	
	
}

/* 작성시간 : Tue Sep 06 19:21:28 KST 2016 */