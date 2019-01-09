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


public class PR_PAPMAKE_1051_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String use_qunt_1;
	public String use_qunt_2;
	public String seq;
	public String matr_clsf;

	public PR_PAPMAKE_1051_LCURLIST4Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
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

	public void setMatr_clsf(String matr_clsf){
		this.matr_clsf = matr_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
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

	public String getMatr_clsf(){
		return this.matr_clsf;
	}
}

/* 작성시간 : Tue May 19 00:40:44 KST 2009 */