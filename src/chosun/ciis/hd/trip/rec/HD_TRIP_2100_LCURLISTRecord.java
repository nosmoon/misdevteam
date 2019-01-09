

package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_2100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String biz_trip_dest;
	public String biz_trip_frdt;
	public String biz_trip_todt;
	public String biz_trip_dds;
	public String biz_trip_purp;
	public String occr_dt;
	public String seq;

	public HD_TRIP_2100_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setBiz_trip_dest(String biz_trip_dest){
		this.biz_trip_dest = biz_trip_dest;
	}

	public void setBiz_trip_frdt(String biz_trip_frdt){
		this.biz_trip_frdt = biz_trip_frdt;
	}

	public void setBiz_trip_todt(String biz_trip_todt){
		this.biz_trip_todt = biz_trip_todt;
	}

	public void setBiz_trip_dds(String biz_trip_dds){
		this.biz_trip_dds = biz_trip_dds;
	}

	public void setBiz_trip_purp(String biz_trip_purp){
		this.biz_trip_purp = biz_trip_purp;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getBiz_trip_dest(){
		return this.biz_trip_dest;
	}

	public String getBiz_trip_frdt(){
		return this.biz_trip_frdt;
	}

	public String getBiz_trip_todt(){
		return this.biz_trip_todt;
	}

	public String getBiz_trip_dds(){
		return this.biz_trip_dds;
	}

	public String getBiz_trip_purp(){
		return this.biz_trip_purp;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue May 03 16:14:29 KST 2011 */