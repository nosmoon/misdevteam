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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6121_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String make_dt;
	public String prof_type_cd;
	public String sgamt6042;
	public String sgvat6042;
	public String sgamt8035;
	public String sgvat8035;
	public String sgamt6054;
	public String sgvat6054;
	public String sgtotamt;
	public String sgtotvat;
	public String mang_clsf_cd;
	public String hjpamt6042;
	public String hjpvat6042;
	public String hjpamt8035;
	public String hjpvat8035;
	public String hjpamt6054;
	public String hjpvat6054;
	public String hjptotamt;
	public String hjptotvat;
	public String diftotamt;
	public String diftotvat;

	public FC_ACCT_6121_LCURLISTRecord(){}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSgamt6042(String sgamt6042){
		this.sgamt6042 = sgamt6042;
	}

	public void setSgvat6042(String sgvat6042){
		this.sgvat6042 = sgvat6042;
	}

	public void setSgamt8035(String sgamt8035){
		this.sgamt8035 = sgamt8035;
	}

	public void setSgvat8035(String sgvat8035){
		this.sgvat8035 = sgvat8035;
	}

	public void setSgamt6054(String sgamt6054){
		this.sgamt6054 = sgamt6054;
	}

	public void setSgvat6054(String sgvat6054){
		this.sgvat6054 = sgvat6054;
	}

	public void setSgtotamt(String sgtotamt){
		this.sgtotamt = sgtotamt;
	}

	public void setSgtotvat(String sgtotvat){
		this.sgtotvat = sgtotvat;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setHjpamt6042(String hjpamt6042){
		this.hjpamt6042 = hjpamt6042;
	}

	public void setHjpvat6042(String hjpvat6042){
		this.hjpvat6042 = hjpvat6042;
	}

	public void setHjpamt8035(String hjpamt8035){
		this.hjpamt8035 = hjpamt8035;
	}

	public void setHjpvat8035(String hjpvat8035){
		this.hjpvat8035 = hjpvat8035;
	}

	public void setHjpamt6054(String hjpamt6054){
		this.hjpamt6054 = hjpamt6054;
	}

	public void setHjpvat6054(String hjpvat6054){
		this.hjpvat6054 = hjpvat6054;
	}

	public void setHjptotamt(String hjptotamt){
		this.hjptotamt = hjptotamt;
	}

	public void setHjptotvat(String hjptotvat){
		this.hjptotvat = hjptotvat;
	}

	public void setDiftotamt(String diftotamt){
		this.diftotamt = diftotamt;
	}

	public void setDiftotvat(String diftotvat){
		this.diftotvat = diftotvat;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSgamt6042(){
		return this.sgamt6042;
	}

	public String getSgvat6042(){
		return this.sgvat6042;
	}

	public String getSgamt8035(){
		return this.sgamt8035;
	}

	public String getSgvat8035(){
		return this.sgvat8035;
	}

	public String getSgamt6054(){
		return this.sgamt6054;
	}

	public String getSgvat6054(){
		return this.sgvat6054;
	}

	public String getSgtotamt(){
		return this.sgtotamt;
	}

	public String getSgtotvat(){
		return this.sgtotvat;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getHjpamt6042(){
		return this.hjpamt6042;
	}

	public String getHjpvat6042(){
		return this.hjpvat6042;
	}

	public String getHjpamt8035(){
		return this.hjpamt8035;
	}

	public String getHjpvat8035(){
		return this.hjpvat8035;
	}

	public String getHjpamt6054(){
		return this.hjpamt6054;
	}

	public String getHjpvat6054(){
		return this.hjpvat6054;
	}

	public String getHjptotamt(){
		return this.hjptotamt;
	}

	public String getHjptotvat(){
		return this.hjptotvat;
	}

	public String getDiftotamt(){
		return this.diftotamt;
	}

	public String getDiftotvat(){
		return this.diftotvat;
	}
}

/* 작성시간 : Tue Sep 15 15:11:40 KST 2009 */