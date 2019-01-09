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


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String rptv_route_clsf;
	public String rptv_route_cd;
	public String rptv_route_nm;
	public String route_rank;
	public String prt_plac_cd;
	public String ecnt_cd;
	public String ledt_cd;
	public String route_cd;
	public String route_nm;
	public String qty;

	public SE_SND_1010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRptv_route_clsf(String rptv_route_clsf){
		this.rptv_route_clsf = rptv_route_clsf;
	}

	public void setRptv_route_cd(String rptv_route_cd){
		this.rptv_route_cd = rptv_route_cd;
	}

	public void setRptv_route_nm(String rptv_route_nm){
		this.rptv_route_nm = rptv_route_nm;
	}

	public void setRoute_rank(String route_rank){
		this.route_rank = route_rank;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setEcnt_cd(String ecnt_cd){
		this.ecnt_cd = ecnt_cd;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRptv_route_clsf(){
		return this.rptv_route_clsf;
	}

	public String getRptv_route_cd(){
		return this.rptv_route_cd;
	}

	public String getRptv_route_nm(){
		return this.rptv_route_nm;
	}

	public String getRoute_rank(){
		return this.route_rank;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getEcnt_cd(){
		return this.ecnt_cd;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getQty(){
		return this.qty;
	}
}

/* 작성시간 : Fri Jul 03 13:51:41 KST 2009 */