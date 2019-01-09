/***************************************************************************************************
* 파일명 : SE_SND_2710_LCURLISTRecord.java
* 기능 : 판매-발송관리-기간별수송비 조회
* 작성일자 : 2009-03-02
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


public class SE_SND_2710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_dt;
	public String tran_uprc_clas;
	public String tran_uprc_nm;
	public String std_tran_uprc;
	public String pay_tran_uprc;
	public String work_dds;
	public String pay_tran_cost;
	public String tran_uprc_cd;
	public String tran_uprc_route_nm;
	public String route_clsf;
	public String route_clsf_nm;
	public String route_cd;
	public String route_nm;
	public String prt_plac_cd;
	public String prt_plac_nm;
	public String dlco_no;
	public String tran_cmpy_cd;
	public String tran_cmpy_nm;
	public String corp_clsf;
	public String corp_clsf_nm;
	public String acct_no;
	public String medi_cd;
	public String medi_nm;

	public SE_SND_2710_LCURLISTRecord(){}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setTran_uprc_nm(String tran_uprc_nm){
		this.tran_uprc_nm = tran_uprc_nm;
	}

	public void setStd_tran_uprc(String std_tran_uprc){
		this.std_tran_uprc = std_tran_uprc;
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

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_clsf_nm(String route_clsf_nm){
		this.route_clsf_nm = route_clsf_nm;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd){
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setCorp_clsf_nm(String corp_clsf_nm){
		this.corp_clsf_nm = corp_clsf_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getTran_uprc_nm(){
		return this.tran_uprc_nm;
	}

	public String getStd_tran_uprc(){
		return this.std_tran_uprc;
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

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_clsf_nm(){
		return this.route_clsf_nm;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getTran_cmpy_cd(){
		return this.tran_cmpy_cd;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getCorp_clsf_nm(){
		return this.corp_clsf_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}
}

/* 작성시간 : Mon Mar 02 13:18:46 KST 2009 */