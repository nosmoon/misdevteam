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


public class SE_SND_2580_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String route_nm;
	public String route_clsf_nm;
	public String prt_plac_cd_nm;
	public String tran_cmpy_nm;
	public String acct_no;
	public String pay_tran_uprc;
	public String work_dds;
	public String pay_tran_cost;

	public SE_SND_2580_LCURLISTRecord(){}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setRoute_clsf_nm(String route_clsf_nm){
		this.route_clsf_nm = route_clsf_nm;
	}

	public void setPrt_plac_cd_nm(String prt_plac_cd_nm){
		this.prt_plac_cd_nm = prt_plac_cd_nm;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setPay_tran_uprc(String pay_tran_uprc){
		this.pay_tran_uprc = pay_tran_uprc;
	}

	public void setWork_dds(String work_dds){
		this.work_dds = work_dds;
	}

	public void setPay_tran_cost(String pay_tran_cost){
		this.pay_tran_cost = pay_tran_cost;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getRoute_clsf_nm(){
		return this.route_clsf_nm;
	}

	public String getPrt_plac_cd_nm(){
		return this.prt_plac_cd_nm;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getPay_tran_uprc(){
		return this.pay_tran_uprc;
	}

	public String getWork_dds(){
		return this.work_dds;
	}

	public String getPay_tran_cost(){
		return this.pay_tran_cost;
	}
}

/* 작성시간 : Tue Aug 18 14:13:34 KST 2009 */