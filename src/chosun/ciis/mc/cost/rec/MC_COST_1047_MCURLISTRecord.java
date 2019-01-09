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


public class MC_COST_1047_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bucdnm;
	public String bucd;
	public String bunm;

	public MC_COST_1047_MCURLISTRecord(){}

	public void setBucdnm(String bucdnm){
		this.bucdnm = bucdnm;
	}

	public void setBucd(String bucd){
		this.bucd = bucd;
	}

	public void setBunm(String bunm){
		this.bunm = bunm;
	}

	public String getBucdnm(){
		return this.bucdnm;
	}

	public String getBucd(){
		return this.bucd;
	}

	public String getBunm(){
		return this.bunm;
	}
}

/* 작성시간 : Wed May 06 11:48:32 KST 2009 */