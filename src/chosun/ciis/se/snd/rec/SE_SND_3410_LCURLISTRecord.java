/***************************************************************************************************
* 파일명 : SE_SND_3410_LCURLISTRecord.java
* 기능 : 판매 - 발송관리 - 대표노선, 노선 설정
* 작성일자 : 2009-05-14
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


public class SE_SND_3410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd			;
	public String rptv_route_clsf	;
	public String rptv_route_cd		;
	public String rptv_route_nm		;
	public String route_rank		;
	public String prt_plac_cd		;
	public String ecnt_cd			;
	public String ledt_cd			;
	public String qty				;
	public String route_cnt			;

	public SE_SND_3410_LCURLISTRecord(){}

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

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setRoute_cnt(String route_cnt){
		this.route_cnt = route_cnt;
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

	public String getQty(){
		return this.qty;
	}

	public String getRoute_cnt(){
		return this.route_cnt;
	}
}

/* 작성시간 : Thu May 14 14:32:14 KST 2009 */