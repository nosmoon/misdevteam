/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3420_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String tot_proc_stat;
	public String tot_proc_stat_nm;

	public HD_VACA_3420_LCURLIST3Record(){}

	public void setTot_proc_stat(String tot_proc_stat){
		this.tot_proc_stat = tot_proc_stat;
	}

	public void setTot_proc_stat_nm(String tot_proc_stat_nm){
		this.tot_proc_stat_nm = tot_proc_stat_nm;
	}

	public String getTot_proc_stat(){
		return this.tot_proc_stat;
	}

	public String getTot_proc_stat_nm(){
		return this.tot_proc_stat_nm;
	}
}

/* 작성시간 : Mon Aug 31 13:48:56 KST 2015 */