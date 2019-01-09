/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 *
 */

public class HD_AFFR_4001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pont_clsf;
	public String pont;
	public String aply_basi_dt;
	public String seq;
	public String db_status;

	public HD_AFFR_4001_LCURLISTRecord(){}

	public void setPont_clsf(String pont_clsf){
		this.pont_clsf = pont_clsf;
	}

	public void setPont(String pont){
		this.pont = pont;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getPont_clsf(){
		return this.pont_clsf;
	}

	public String getPont(){
		return this.pont;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Mon Jul 06 22:04:14 KST 2009 */