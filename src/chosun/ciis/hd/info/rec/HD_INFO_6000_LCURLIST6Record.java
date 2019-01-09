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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String carr_seq;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String offi_nm;
	public String dty;
	public String posk;
	public String asaly;
	public String lvcmpy_resn;
	public String natn_cd;
	public String natn_nm;
	public String duty_yys;
	public String duty_dds;
	public String carr_aprv_yys;
	public String carr_aprv_dds;

	public HD_INFO_6000_LCURLIST6Record(){}

	public void setCarr_seq(String carr_seq){
		this.carr_seq = carr_seq;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDty(String dty){
		this.dty = dty;
	}

	public void setPosk(String posk){
		this.posk = posk;
	}

	public void setAsaly(String asaly){
		this.asaly = asaly;
	}

	public void setLvcmpy_resn(String lvcmpy_resn){
		this.lvcmpy_resn = lvcmpy_resn;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setDuty_yys(String duty_yys){
		this.duty_yys = duty_yys;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setCarr_aprv_yys(String carr_aprv_yys){
		this.carr_aprv_yys = carr_aprv_yys;
	}

	public void setCarr_aprv_dds(String carr_aprv_dds){
		this.carr_aprv_dds = carr_aprv_dds;
	}

	public String getCarr_seq(){
		return this.carr_seq;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDty(){
		return this.dty;
	}

	public String getPosk(){
		return this.posk;
	}

	public String getAsaly(){
		return this.asaly;
	}

	public String getLvcmpy_resn(){
		return this.lvcmpy_resn;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getDuty_yys(){
		return this.duty_yys;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getCarr_aprv_yys(){
		return this.carr_aprv_yys;
	}

	public String getCarr_aprv_dds(){
		return this.carr_aprv_dds;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */