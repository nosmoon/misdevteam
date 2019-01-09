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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_yy;
	public String year_vaca_dds;
	public String add_vaca_dds;
	public String use_vaca_dds;
	public String duty_vaca_dds;
	public String rmn_vaca_dds;

	public HD_VACA_1202_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setYear_vaca_dds(String year_vaca_dds){
		this.year_vaca_dds = year_vaca_dds;
	}

	public void setAdd_vaca_dds(String add_vaca_dds){
		this.add_vaca_dds = add_vaca_dds;
	}

	public void setUse_vaca_dds(String use_vaca_dds){
		this.use_vaca_dds = use_vaca_dds;
	}

	public void setDuty_vaca_dds(String duty_vaca_dds){
		this.duty_vaca_dds = duty_vaca_dds;
	}

	public void setRmn_vaca_dds(String rmn_vaca_dds){
		this.rmn_vaca_dds = rmn_vaca_dds;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getYear_vaca_dds(){
		return this.year_vaca_dds;
	}

	public String getAdd_vaca_dds(){
		return this.add_vaca_dds;
	}

	public String getUse_vaca_dds(){
		return this.use_vaca_dds;
	}

	public String getDuty_vaca_dds(){
		return this.duty_vaca_dds;
	}

	public String getRmn_vaca_dds(){
		return this.rmn_vaca_dds;
	}
}

/* 작성시간 : Fri Apr 24 15:48:10 KST 2009 */