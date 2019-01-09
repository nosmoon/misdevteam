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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_cd;
	public String dept_nm;
	public String acct_id;
	public String nm_korn;
	public String posi_cd;
	public String posi_nm;
	public String paper_scor;
	public String chk1;
	public String paper_remk;
	public String pubsh_scor;
	public String chk2;
	public String pubsh_remk;
	public String pric_scor;
	public String chk3;
	public String pric_remk;
	public String spcl_scor;
	public String chk4;
	public String spcl_remk;
	public String adj_evlu_scor;
	public String chk5;
	public String adj_evlu_remk;

	public AD_EVLU_1000_LCURLISTRecord(){}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAcct_id(String acct_id){
		this.acct_id = acct_id;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setPaper_scor(String paper_scor){
		this.paper_scor = paper_scor;
	}

	public void setChk1(String chk1){
		this.chk1 = chk1;
	}

	public void setPaper_remk(String paper_remk){
		this.paper_remk = paper_remk;
	}

	public void setPubsh_scor(String pubsh_scor){
		this.pubsh_scor = pubsh_scor;
	}

	public void setChk2(String chk2){
		this.chk2 = chk2;
	}

	public void setPubsh_remk(String pubsh_remk){
		this.pubsh_remk = pubsh_remk;
	}

	public void setPric_scor(String pric_scor){
		this.pric_scor = pric_scor;
	}

	public void setChk3(String chk3){
		this.chk3 = chk3;
	}

	public void setPric_remk(String pric_remk){
		this.pric_remk = pric_remk;
	}

	public void setSpcl_scor(String spcl_scor){
		this.spcl_scor = spcl_scor;
	}

	public void setChk4(String chk4){
		this.chk4 = chk4;
	}

	public void setSpcl_remk(String spcl_remk){
		this.spcl_remk = spcl_remk;
	}

	public void setAdj_evlu_scor(String adj_evlu_scor){
		this.adj_evlu_scor = adj_evlu_scor;
	}

	public void setChk5(String chk5){
		this.chk5 = chk5;
	}

	public void setAdj_evlu_remk(String adj_evlu_remk){
		this.adj_evlu_remk = adj_evlu_remk;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAcct_id(){
		return this.acct_id;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getPaper_scor(){
		return this.paper_scor;
	}

	public String getChk1(){
		return this.chk1;
	}

	public String getPaper_remk(){
		return this.paper_remk;
	}

	public String getPubsh_scor(){
		return this.pubsh_scor;
	}

	public String getChk2(){
		return this.chk2;
	}

	public String getPubsh_remk(){
		return this.pubsh_remk;
	}

	public String getPric_scor(){
		return this.pric_scor;
	}

	public String getChk3(){
		return this.chk3;
	}

	public String getPric_remk(){
		return this.pric_remk;
	}

	public String getSpcl_scor(){
		return this.spcl_scor;
	}

	public String getChk4(){
		return this.chk4;
	}

	public String getSpcl_remk(){
		return this.spcl_remk;
	}

	public String getAdj_evlu_scor(){
		return this.adj_evlu_scor;
	}

	public String getChk5(){
		return this.chk5;
	}

	public String getAdj_evlu_remk(){
		return this.adj_evlu_remk;
	}
}

/* 작성시간 : Tue Mar 16 10:49:19 KST 2010 */