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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1004_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String land_plcw;
	public String acqr_land_amt;
	public String acqr_yymm;
	public String now_land_amt;
	public String now_yymm;
	public String land_usag;
	public String rela_aset_no;
	public String rela_aset_nm;

	public AS_ASET_1004_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setLand_plcw(String land_plcw){
		this.land_plcw = land_plcw;
	}

	public void setAcqr_land_amt(String acqr_land_amt){
		this.acqr_land_amt = acqr_land_amt;
	}

	public void setAcqr_yymm(String acqr_yymm){
		this.acqr_yymm = acqr_yymm;
	}

	public void setNow_land_amt(String now_land_amt){
		this.now_land_amt = now_land_amt;
	}

	public void setNow_yymm(String now_yymm){
		this.now_yymm = now_yymm;
	}

	public void setLand_usag(String land_usag){
		this.land_usag = land_usag;
	}

	public void setRela_aset_no(String rela_aset_no){
		this.rela_aset_no = rela_aset_no;
	}

	public void setRela_aset_nm(String rela_aset_nm){
		this.rela_aset_nm = rela_aset_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getLand_plcw(){
		return this.land_plcw;
	}

	public String getAcqr_land_amt(){
		return this.acqr_land_amt;
	}

	public String getAcqr_yymm(){
		return this.acqr_yymm;
	}

	public String getNow_land_amt(){
		return this.now_land_amt;
	}

	public String getNow_yymm(){
		return this.now_yymm;
	}

	public String getLand_usag(){
		return this.land_usag;
	}

	public String getRela_aset_no(){
		return this.rela_aset_no;
	}

	public String getRela_aset_nm(){
		return this.rela_aset_nm;
	}
}

/* 작성시간 : Tue Mar 03 14:30:09 KST 2009 */