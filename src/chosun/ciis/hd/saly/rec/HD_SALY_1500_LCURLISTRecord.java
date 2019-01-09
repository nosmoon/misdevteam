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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String dept_nm;
	public String nm_korn;
	public String dty_cd;
	public String posi_cd;
	public String dty_nm;
	public String posi_nm;
	public String base_saly_be;
	public String base_saly_nw;
	public String posk_saly_be;
	public String posk_saly_nw;
	public String rgla_saly_be;
	public String rgla_saly_nw;
	public String dty_alon_be; 
	public String dty_alon_nw; 
	public String posk_alon_be;
	public String posk_alon_nw;
	public String food_alon_be;
	public String food_alon_nw;
	public String care_alon_be;
	public String care_alon_nw;
	public String evngt_saly_be;
	public String evngt_saly_nw;
	
	public HD_SALY_1500_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setBase_saly_be(String base_saly_be){
		this.base_saly_be = base_saly_be;
	}

	public void setBase_saly_nw(String base_saly_nw){
		this.base_saly_nw = base_saly_nw;
	}

	public void setPosk_saly_be(String posk_saly_be){
		this.posk_saly_be = posk_saly_be;
	}

	public void setPosk_saly_nw(String posk_saly_nw){
		this.posk_saly_nw = posk_saly_nw;
	}

	public void setRgla_saly_be(String rgla_saly_be){
		this.rgla_saly_be = rgla_saly_be;
	}

	public void setRgla_saly_nw(String rgla_saly_nw){
		this.rgla_saly_nw = rgla_saly_nw;
	}

	public void setDty_alon_be(String dty_alon_be){		
		this.dty_alon_be = dty_alon_be; 
		}
	
	public void setDty_alon_nw(String dty_alon_nw){ 	
		this.dty_alon_nw = dty_alon_nw;
	}
	public void setPosk_alon_be(String posk_alon_be){
		this.posk_alon_be = posk_alon_be; 
	}
	
	public void setPosk_alon_nw(String posk_alon_nw){ 	
		this.posk_alon_nw = posk_alon_nw;	
	}
	
	public void setFood_alon_be(String food_alon_be){		
		this.food_alon_be = food_alon_be; 
	}
	
	public void setFood_alon_nw(String food_alon_nw){ 	
		this.food_alon_nw = food_alon_nw;	
	}
	
	public void setCare_alon_be(String care_alon_be){		
		this.care_alon_be = care_alon_be; 
	}
	
	public void setCare_alon_nw(String care_alon_nw){ 	
		this.care_alon_nw = care_alon_nw;	
	}
	
	public void setEvngt_saly_be(String care_alon_be){ 	
		this.care_alon_be = care_alon_be;	
	}
	
	public void setEvngt_saly_nw(String care_alon_nw){ 	
		this.care_alon_nw = care_alon_nw;	
	}
	
	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getBase_saly_be(){
		return this.base_saly_be;
	}

	public String getBase_saly_nw(){
		return this.base_saly_nw;
	}

	public String getPosk_saly_be(){
		return this.posk_saly_be;
	}

	public String getPosk_saly_nw(){
		return this.posk_saly_nw;
	}

	public String getRgla_saly_be(){
		return this.rgla_saly_be;
	}

	public String getRgla_saly_nw(){
		return this.rgla_saly_nw;
	}
	
	public String getDty_alon_be(){
		return this.dty_alon_be;
	}

	public String getDty_alon_nw(){
		return this.dty_alon_nw;
	}
	
	public String getPosk_alon_be(){
		return this.posk_alon_be;
	}

	public String getPosk_alon_nw(){
		return this.posk_alon_nw;
	}
	
	public String getFood_alon_be(){
		return this.food_alon_be;
	}
	
	public String getFood_alon_nw(){
		return this.food_alon_nw;
	}
	
	public String getCare_alon_be(){
		return this.care_alon_be;
	}

	public String getCare_alon_nw(){
		return this.care_alon_nw;
	}
	
	public String getEvngt_saly_be(){
		return this.evngt_saly_be;
	}

	public String getEvngt_saly_nw(){
		return this.evngt_saly_nw;
	}
}

/* 작성시간 : Fri May 22 11:12:22 KST 2009 */