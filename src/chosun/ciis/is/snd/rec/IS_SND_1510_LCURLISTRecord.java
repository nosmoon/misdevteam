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


package chosun.ciis.is.snd.rec;

import java.sql.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;

/**
 * 
 */


public class IS_SND_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String advcs_cd;
	public String advcs_cd_nm;
	public String chrg_pers;
	public String ariv_plan_tm;

	public IS_SND_1510_LCURLISTRecord(){}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAriv_plan_tm(String ariv_plan_tm){
		this.ariv_plan_tm = ariv_plan_tm;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAriv_plan_tm(){
		return this.ariv_plan_tm;
	}
}

/* 작성시간 : Fri May 25 17:18:34 KST 2012 */