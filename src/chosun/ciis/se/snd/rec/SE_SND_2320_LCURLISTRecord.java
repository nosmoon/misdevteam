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


public class SE_SND_2320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tran_uprc_clas;
	public String cmpy_cd;
	public String tran_cmpy_cd;
	public String uprc_seq;
	public String tran_uprc_cd;
	public String tran_uprc_route_nm;
	public String prt_plac_cd;
	public String route_clsf_nm;
	public String tran_cost;
	public String route_clsf;
	public String route_cd;
	public String route_nm;
	public String cnsg_seqo;

	public SE_SND_2320_LCURLISTRecord(){}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd){
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public void setUprc_seq(String uprc_seq){
		this.uprc_seq = uprc_seq;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf_nm(String route_clsf_nm){
		this.route_clsf_nm = route_clsf_nm;
	}

	public void setTran_cost(String tran_cost){
		this.tran_cost = tran_cost;
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

	public void setCnsg_seqo(String cnsg_seqo){
		this.cnsg_seqo = cnsg_seqo;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTran_cmpy_cd(){
		return this.tran_cmpy_cd;
	}

	public String getUprc_seq(){
		return this.uprc_seq;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf_nm(){
		return this.route_clsf_nm;
	}

	public String getTran_cost(){
		return this.tran_cost;
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

	public String getCnsg_seqo(){
		return this.cnsg_seqo;
	}
}

/* 작성시간 : Mon Jun 22 13:36:49 KST 2009 */