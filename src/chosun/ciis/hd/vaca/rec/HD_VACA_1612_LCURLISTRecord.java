

package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1612_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stat_proc;
	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;

	public HD_VACA_1612_LCURLISTRecord(){}

	public void setStat_proc(String stat_proc){
		this.stat_proc = stat_proc;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}

	public String getStat_proc(){
		return this.stat_proc;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getVaca_dds(){
		return this.vaca_dds;
	}
}

/* 작성시간 : Fri Oct 29 16:59:47 KST 2010 */