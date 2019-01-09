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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1210_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String seq;
	public String leas_clsf;
	public String sub_seq;
	public String cost_case_titl;
	public String real_ship_dt;
	public String ship_port;
	public String ariv_port;
	public String entr_dt;
	public String ewh_amt;

	public MT_ETCIMPT_1210_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setCost_case_titl(String cost_case_titl){
		this.cost_case_titl = cost_case_titl;
	}

	public void setReal_ship_dt(String real_ship_dt){
		this.real_ship_dt = real_ship_dt;
	}

	public void setShip_port(String ship_port){
		this.ship_port = ship_port;
	}

	public void setAriv_port(String ariv_port){
		this.ariv_port = ariv_port;
	}

	public void setEntr_dt(String entr_dt){
		this.entr_dt = entr_dt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getCost_case_titl(){
		return this.cost_case_titl;
	}

	public String getReal_ship_dt(){
		return this.real_ship_dt;
	}

	public String getShip_port(){
		return this.ship_port;
	}

	public String getAriv_port(){
		return this.ariv_port;
	}

	public String getEntr_dt(){
		return this.entr_dt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}
}

/* 작성시간 : Sat Jul 04 18:33:50 KST 2009 */