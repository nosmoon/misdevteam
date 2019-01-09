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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String title;
	public String s_ibgoamt;
	public String s_jiamt;
	public String tot_ibgoamt;
	public String di_ibgojo_amt;
	public String di_ibgojovat;
	public String s_cgamt;
	public String s_jcamt;
	public String tot_cgamt;
	public String di_cgjo_amt;
	public String di_cgjo_vat;
	public String matr_cd;
	public String grp;

	public MT_PAPINOUT_2301_LCURLISTRecord(){}

	public void setTitle(String title){
		this.title = title;
	}

	public void setS_ibgoamt(String s_ibgoamt){
		this.s_ibgoamt = s_ibgoamt;
	}

	public void setS_jiamt(String s_jiamt){
		this.s_jiamt = s_jiamt;
	}

	public void setTot_ibgoamt(String tot_ibgoamt){
		this.tot_ibgoamt = tot_ibgoamt;
	}

	public void setDi_ibgojo_amt(String di_ibgojo_amt){
		this.di_ibgojo_amt = di_ibgojo_amt;
	}

	public void setDi_ibgojovat(String di_ibgojovat){
		this.di_ibgojovat = di_ibgojovat;
	}

	public void setS_cgamt(String s_cgamt){
		this.s_cgamt = s_cgamt;
	}

	public void setS_jcamt(String s_jcamt){
		this.s_jcamt = s_jcamt;
	}

	public void setTot_cgamt(String tot_cgamt){
		this.tot_cgamt = tot_cgamt;
	}

	public void setDi_cgjo_amt(String di_cgjo_amt){
		this.di_cgjo_amt = di_cgjo_amt;
	}

	public void setDi_cgjo_vat(String di_cgjo_vat){
		this.di_cgjo_vat = di_cgjo_vat;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setGrp(String grp){
		this.grp = grp;
	}

	public String getTitle(){
		return this.title;
	}

	public String getS_ibgoamt(){
		return this.s_ibgoamt;
	}

	public String getS_jiamt(){
		return this.s_jiamt;
	}

	public String getTot_ibgoamt(){
		return this.tot_ibgoamt;
	}

	public String getDi_ibgojo_amt(){
		return this.di_ibgojo_amt;
	}

	public String getDi_ibgojovat(){
		return this.di_ibgojovat;
	}

	public String getS_cgamt(){
		return this.s_cgamt;
	}

	public String getS_jcamt(){
		return this.s_jcamt;
	}

	public String getTot_cgamt(){
		return this.tot_cgamt;
	}

	public String getDi_cgjo_amt(){
		return this.di_cgjo_amt;
	}

	public String getDi_cgjo_vat(){
		return this.di_cgjo_vat;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getGrp(){
		return this.grp;
	}
}

/* 작성시간 : Tue Apr 21 18:58:36 KST 2009 */