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


public class HD_SALY_4101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String emp_clsf;
	public String last_midl_adjm_dt;
	public String gsycnt;
	public String sb;
	public String eg;
	public String gm;
	public String rgla_saly;
	public String base_saly;
	public String supl_saly;
	public String gb;
	public String tjamt;
	public String tjg;
	public String jgcmjamt;
	public String sbjanamt;

	public HD_SALY_4101_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setLast_midl_adjm_dt(String last_midl_adjm_dt){
		this.last_midl_adjm_dt = last_midl_adjm_dt;
	}

	public void setGsycnt(String gsycnt){
		this.gsycnt = gsycnt;
	}

	public void setSb(String sb){
		this.sb = sb;
	}

	public void setEg(String eg){
		this.eg = eg;
	}

	public void setGm(String gm){
		this.gm = gm;
	}

	public void setRgla_saly(String rgla_saly){
		this.rgla_saly = rgla_saly;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setSupl_saly(String supl_saly){
		this.supl_saly = supl_saly;
	}

	public void setGb(String gb){
		this.gb = gb;
	}

	public void setTjamt(String tjamt){
		this.tjamt = tjamt;
	}

	public void setTjg(String tjg){
		this.tjg = tjg;
	}

	public void setJgcmjamt(String jgcmjamt){
		this.jgcmjamt = jgcmjamt;
	}

	public void setSbjanamt(String sbjanamt){
		this.sbjanamt = sbjanamt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getLast_midl_adjm_dt(){
		return this.last_midl_adjm_dt;
	}

	public String getGsycnt(){
		return this.gsycnt;
	}

	public String getSb(){
		return this.sb;
	}

	public String getEg(){
		return this.eg;
	}

	public String getGm(){
		return this.gm;
	}

	public String getRgla_saly(){
		return this.rgla_saly;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getSupl_saly(){
		return this.supl_saly;
	}

	public String getGb(){
		return this.gb;
	}

	public String getTjamt(){
		return this.tjamt;
	}

	public String getTjg(){
		return this.tjg;
	}

	public String getJgcmjamt(){
		return this.jgcmjamt;
	}

	public String getSbjanamt(){
		return this.sbjanamt;
	}
}

/* 작성시간 : Tue May 19 19:29:43 KST 2009 */