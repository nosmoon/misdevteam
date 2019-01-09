

package chosun.ciis.hd.emsy.rec;

import java.sql.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.ds.*;

/**
 * 
 */


public class HD_EMSY_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sfromemail;
	public String smailsubject;
	public String smailcontent;
	public String saly_pay_dt;

	public HD_EMSY_1000_LCURLISTRecord(){}

	public void setSfromemail(String sfromemail){
		this.sfromemail = sfromemail;
	}

	public void setSmailsubject(String smailsubject){
		this.smailsubject = smailsubject;
	}

	public void setSmailcontent(String smailcontent){
		this.smailcontent = smailcontent;
	}

	public void setSaly_pay_dt(String saly_pay_dt){
		this.saly_pay_dt = saly_pay_dt;
	}

	public String getSfromemail(){
		return this.sfromemail;
	}

	public String getSmailsubject(){
		return this.smailsubject;
	}

	public String getSmailcontent(){
		return this.smailcontent;
	}

	public String getSaly_pay_dt(){
		return this.saly_pay_dt;
	}
}

/* 작성시간 : Mon Oct 11 14:15:08 KST 2010 */