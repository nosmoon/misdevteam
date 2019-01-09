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


public class TN_LNK_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplc_path;
	public String requestdate;
	public String paydate;
	public String proof_file;
	public String aplc_file;
	public String result_file;
	public int tot_cnt;
	public int tot_err_cnt;
	public String stat1;
	public String stat2;
	public String stat3;
	public String stat4;
	public String cmsidx;
	public String deptidx;
	public String status;

	public TN_LNK_2010_LCURLISTRecord(){}

	public void setAplc_path(String aplc_path){
		this.aplc_path = aplc_path;
	}

	public void setRequestdate(String requestdate){
		this.requestdate = requestdate;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setProof_file(String proof_file){
		this.proof_file = proof_file;
	}

	public void setAplc_file(String aplc_file){
		this.aplc_file = aplc_file;
	}

	public void setResult_file(String result_file){
		this.result_file = result_file;
	}

	public void setTot_cnt(int tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setTot_err_cnt(int tot_err_cnt){
		this.tot_err_cnt = tot_err_cnt;
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

	public String getAplc_path(){
		return this.aplc_path;
	}

	public String getRequestdate(){
		return this.requestdate;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getProof_file(){
		return this.proof_file;
	}

	public String getAplc_file(){
		return this.aplc_file;
	}

	public String getResult_file(){
		return this.result_file;
	}

	public int getTot_cnt(){
		return this.tot_cnt;
	}

	public int getTot_err_cnt(){
		return this.tot_err_cnt;
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

/* 작성시간 : Thu Jul 21 10:31:09 KST 2016 */