/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class TN_LNK_3010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pymtmm;
	public String pymtdd;
	public String requestdate;
	public String paydate;
	public String filename;
	public String resultfilename;
	public int okcount;
	public int okprice;
	public int errorcount;
	public int errorprice;
	public int fee;
	public String stat1;
	public String stat2;
	public String stat3;
	public String stat4;
	public String cmsidx;
	public String deptidx;
	public String status;

	public TN_LNK_3010_LCURLISTRecord(){}

	public void setPymtmm(String pymtmm){
		this.pymtmm = pymtmm;
	}

	public void setPymtdd(String pymtdd){
		this.pymtdd = pymtdd;
	}

	public void setRequestdate(String requestdate){
		this.requestdate = requestdate;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public void setResultfilename(String resultfilename){
		this.resultfilename = resultfilename;
	}

	public void setOkcount(int okcount){
		this.okcount = okcount;
	}

	public void setOkprice(int okprice){
		this.okprice = okprice;
	}

	public void setErrorcount(int errorcount){
		this.errorcount = errorcount;
	}

	public void setErrorprice(int errorprice){
		this.errorprice = errorprice;
	}

	public void setFee(int fee){
		this.fee = fee;
	}

	public void setStat1(String stat1){
		this.stat1 = stat1;
	}

	public void setStat2(String stat2){
		this.stat2 = stat2;
	}

	public void setStat3(String stat3){
		this.stat3 = stat3;
	}

	public void setStat4(String stat4){
		this.stat4 = stat4;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getPymtmm(){
		return this.pymtmm;
	}

	public String getPymtdd(){
		return this.pymtdd;
	}

	public String getRequestdate(){
		return this.requestdate;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getFilename(){
		return this.filename;
	}

	public String getResultfilename(){
		return this.resultfilename;
	}

	public int getOkcount(){
		return this.okcount;
	}

	public int getOkprice(){
		return this.okprice;
	}

	public int getErrorcount(){
		return this.errorcount;
	}

	public int getErrorprice(){
		return this.errorprice;
	}

	public int getFee(){
		return this.fee;
	}

	public String getStat1(){
		return this.stat1;
	}

	public String getStat2(){
		return this.stat2;
	}

	public String getStat3(){
		return this.stat3;
	}

	public String getStat4(){
		return this.stat4;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getStatus(){
		return this.status;
	}
}

/* 작성시간 : Mon Aug 22 17:58:09 KST 2016 */