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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_2016_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String intfce_yn;
	public String cost_dstb_cd;
	public String cost_dstb_cdnm;
	public String dept_cdnm;
	public String medi_cdnm;
	public String qunt;
	public String ratio1;
	public String ratio2;

	public MC_COST_2016_LCURLISTRecord(){}

	public void setIntfce_yn(String intfce_yn){
		this.intfce_yn = intfce_yn;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_cdnm(String cost_dstb_cdnm){
		this.cost_dstb_cdnm = cost_dstb_cdnm;
	}

	public void setDept_cdnm(String dept_cdnm){
		this.dept_cdnm = dept_cdnm;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setRatio1(String ratio1){
		this.ratio1 = ratio1;
	}

	public void setRatio2(String ratio2){
		this.ratio2 = ratio2;
	}

	public String getIntfce_yn(){
		return this.intfce_yn;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_cdnm(){
		return this.cost_dstb_cdnm;
	}

	public String getDept_cdnm(){
		return this.dept_cdnm;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getRatio1(){
		return this.ratio1;
	}

	public String getRatio2(){
		return this.ratio2;
	}
}

/* 작성시간 : Thu May 07 15:01:54 KST 2009 */