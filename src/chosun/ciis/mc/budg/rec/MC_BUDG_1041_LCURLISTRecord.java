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


public class MC_BUDG_1041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String maecd;
	public String mcnm;
	public String ifyb;
	public String entdate;

	public MC_BUDG_1041_LCURLISTRecord(){}

	public void setMaecd(String maecd){
		this.maecd = maecd;
	}

	public void setMcnm(String mcnm){
		this.mcnm = mcnm;
	}

	public void setIfyb(String ifyb){
		this.ifyb = ifyb;
	}

	public void setEntdate(String entdate){
		this.entdate = entdate;
	}

	public String getMaecd(){
		return this.maecd;
	}

	public String getMcnm(){
		return this.mcnm;
	}

	public String getIfyb(){
		return this.ifyb;
	}

	public String getEntdate(){
		return this.entdate;
	}
}

/* 작성시간 : Fri Mar 20 09:44:42 KST 2009 */