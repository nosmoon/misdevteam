/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_cd;
	public String team_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String evlu_yn;
	public String evlu_grp;
	public String remk;

	public SE_TRG_1810_LCURLISTRecord(){}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setEvlu_yn(String evlu_yn){
		this.evlu_yn = evlu_yn;
	}

	public void setEvlu_grp(String evlu_grp){
		this.evlu_grp = evlu_grp;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getEvlu_yn(){
		return this.evlu_yn;
	}

	public String getEvlu_grp(){
		return this.evlu_grp;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Apr 07 20:07:36 KST 2009 */