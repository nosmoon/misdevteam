/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class SE_SND_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prt_plac_nm;
	public String ledt_nm;
	public String ecnt_nm;
	public String route_cd;
	public String route_nm;
	public String qty;
	public String ariv_nomn;

	public SE_SND_1610_LCURLISTRecord(){}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public void setLedt_nm(String ledt_nm){
		this.ledt_nm = ledt_nm;
	}

	public void setEcnt_nm(String ecnt_nm){
		this.ecnt_nm = ecnt_nm;
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

	public void setAriv_nomn(String ariv_nomn){
		this.ariv_nomn = ariv_nomn;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}

	public String getLedt_nm(){
		return this.ledt_nm;
	}

	public String getEcnt_nm(){
		return this.ecnt_nm;
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

	public String getAriv_nomn(){
		return this.ariv_nomn;
	}
}

/* 작성시간 : Thu Aug 13 17:34:20 KST 2009 */