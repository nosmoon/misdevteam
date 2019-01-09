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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dest;
	public String start_dt;
	public String start_tm;
	public String driv_dt;
	public String ariv_tm;
	public String start_gag;
	public String ariv_gag;
	public String drvr_nm;
	public String rid_pers;
	public String rid_deptcd;
	public String rid_dept_nm;
	public String seq;
	public String occr_dt;
	public String driv_purp;

	public MT_ETCCAR_1000_LCURLIST2Record(){}

	public void setDest(String dest){
		this.dest = dest;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}

	public void setAriv_tm(String ariv_tm){
		this.ariv_tm = ariv_tm;
	}

	public void setStart_gag(String start_gag){
		this.start_gag = start_gag;
	}

	public void setAriv_gag(String ariv_gag){
		this.ariv_gag = ariv_gag;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setRid_pers(String rid_pers){
		this.rid_pers = rid_pers;
	}

	public void setRid_deptcd(String rid_deptcd){
		this.rid_deptcd = rid_deptcd;
	}

	public void setRid_dept_nm(String rid_dept_nm){
		this.rid_dept_nm = rid_dept_nm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDriv_purp(String driv_purp){
		this.driv_purp = driv_purp;
	}

	public String getDest(){
		return this.dest;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getAriv_tm(){
		return this.ariv_tm;
	}

	public String getStart_gag(){
		return this.start_gag;
	}

	public String getAriv_gag(){
		return this.ariv_gag;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getRid_pers(){
		return this.rid_pers;
	}

	public String getRid_deptcd(){
		return this.rid_deptcd;
	}

	public String getRid_dept_nm(){
		return this.rid_dept_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDriv_purp(){
		return this.driv_purp;
	}
}

/* 작성시간 : Wed Sep 09 13:36:33 KST 2009 */