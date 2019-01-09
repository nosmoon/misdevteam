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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1052_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String vip_matr_clsf;
	public String matr_cd;
	public String matr_nm;
	public String use_qunt_1;
	public String use_qunt_2;
	public String seq;
	public String dlco_cd;
	public String dlco_nm;

	public PR_PAPMAKE_1052_LCURLIST1Record(){}

	public void setVip_matr_clsf(String vip_matr_clsf){
		this.vip_matr_clsf = vip_matr_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUse_qunt_1(String use_qunt_1){
		this.use_qunt_1 = use_qunt_1;
	}

	public void setUse_qunt_2(String use_qunt_2){
		this.use_qunt_2 = use_qunt_2;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getVip_matr_clsf(){
		return this.vip_matr_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUse_qunt_1(){
		return this.use_qunt_1;
	}

	public String getUse_qunt_2(){
		return this.use_qunt_2;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* 작성시간 : Mon Jul 20 21:09:37 KST 2009 */