/***************************************************************************************************
* 파일명 : SE_SND_2010_LCURLISTRecord.java
* 기능 : 판매-발송관리-노선순위변경
* 작성일자 : 2009-02-12
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String prt_plac_cd;
	public String route_clsf;
	public String route_cd;
	public String route_nm;
	public String route_rank;

	public SE_SND_2010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setRoute_rank(String route_rank){
		this.route_rank = route_rank;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getRoute_rank(){
		return this.route_rank;
	}
}

/* 작성시간 : Thu Feb 12 17:16:24 KST 2009 */