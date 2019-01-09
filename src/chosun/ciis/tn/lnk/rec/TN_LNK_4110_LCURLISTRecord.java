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

 
public class TN_LNK_4110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String umsidx;
	public String deptidx;
	public String status;
	public String purpose;
	public String title;
	public String sendtype;
	public String startdate;
	public String receiver;
	public String receiver_s;
	public String receiver_f;
	public String writedate;


	public TN_LNK_4110_LCURLISTRecord(){}

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
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSendtype(String sendtype){
		this.sendtype = sendtype;
	}

	public void setStartdate(String startdate){
		this.startdate = startdate;
	}

	public void setReceiver(String receiver){
		this.receiver = receiver;
	}

	public void setReceiver_s(String receiver_s){
		this.receiver_s = receiver_s;
	}

	public void setReceiver_f(String receiver_f){
		this.receiver_f = receiver_f;
	}
	
	public void setWritedate(String writedate) {
		this.writedate = writedate;
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
	
	public String getTitle() {
		return title;
	}
	
	public String getSendtype(){
		return this.sendtype;
	}
 
	public String getStartdate(){
		return this.startdate;
	}

	public String getReceiver(){
		return this.receiver;
	}

	public String getReceiver_s(){
		return this.receiver_s;
	}

	public String getReceiver_f(){
		return this.receiver_f;
	}
	
	public String getWritedate() {
		return writedate;
	}

}

/* 작성시간 : Thu Aug 18 20:21:21 KST 2016 */