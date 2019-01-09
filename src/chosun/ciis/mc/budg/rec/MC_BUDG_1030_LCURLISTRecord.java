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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_cdnm;
	public String t1_hmcd;
	public String itm_15;
	public String itm_16;
	public String itm_17;
	public String itm_25;
	public String itm_35;
	public String itm_91;
	public String itm_92;
	public String itm_93;
	public String itm_94;
	public String itm_95;
	public String itm_96;
	public String flag;

	public MC_BUDG_1030_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setT1_hmcd(String t1_hmcd){
		this.t1_hmcd = t1_hmcd;
	}

	public void setItm_15(String itm_15){
		this.itm_15 = itm_15;
	}

	public void setItm_16(String itm_16){
		this.itm_16 = itm_16;
	}

	public void setItm_17(String itm_17){
		this.itm_17 = itm_17;
	}

	public void setItm_25(String itm_25){
		this.itm_25 = itm_25;
	}

	public void setItm_35(String itm_35){
		this.itm_35 = itm_35;
	}

	public void setItm_91(String itm_91){
		this.itm_91 = itm_91;
	}

	public void setItm_92(String itm_92){
		this.itm_92 = itm_92;
	}

	public void setItm_93(String itm_93){
		this.itm_93 = itm_93;
	}

	public void setItm_94(String itm_94){
		this.itm_94 = itm_94;
	}

	public void setItm_95(String itm_95){
		this.itm_95 = itm_95;
	}

	public void setItm_96(String itm_96){
		this.itm_96 = itm_96;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getT1_hmcd(){
		return this.t1_hmcd;
	}

	public String getItm_15(){
		return this.itm_15;
	}

	public String getItm_16(){
		return this.itm_16;
	}

	public String getItm_17(){
		return this.itm_17;
	}

	public String getItm_25(){
		return this.itm_25;
	}

	public String getItm_35(){
		return this.itm_35;
	}

	public String getItm_91(){
		return this.itm_91;
	}

	public String getItm_92(){
		return this.itm_92;
	}

	public String getItm_93(){
		return this.itm_93;
	}

	public String getItm_94(){
		return this.itm_94;
	}

	public String getItm_95(){
		return this.itm_95;
	}

	public String getItm_96(){
		return this.itm_96;
	}

	public String getFlag(){
		return this.flag;
	}
}

/* 작성시간 : Sat Apr 11 12:04:53 KST 2009 */