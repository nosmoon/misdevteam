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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_yy;
	public String tms_clsf;
	public String evlu_obj_bgn_dd;
	public String evlu_obj_end_dd;
	public String evlu_excl_dd;
	public String evlu_excl_daycnt;
	public String remk;
	public String db_status;

	public HD_EVLU_1001_LCURLISTRecord(){}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_obj_bgn_dd(String evlu_obj_bgn_dd){
		this.evlu_obj_bgn_dd = evlu_obj_bgn_dd;
	}

	public void setEvlu_obj_end_dd(String evlu_obj_end_dd){
		this.evlu_obj_end_dd = evlu_obj_end_dd;
	}

	public void setEvlu_excl_dd(String evlu_excl_dd){
		this.evlu_excl_dd = evlu_excl_dd;
	}

	public void setEvlu_excl_daycnt(String evlu_excl_daycnt){
		this.evlu_excl_daycnt = evlu_excl_daycnt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_obj_bgn_dd(){
		return this.evlu_obj_bgn_dd;
	}

	public String getEvlu_obj_end_dd(){
		return this.evlu_obj_end_dd;
	}

	public String getEvlu_excl_dd(){
		return this.evlu_excl_dd;
	}

	public String getEvlu_excl_daycnt(){
		return this.evlu_excl_daycnt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Wed May 13 16:43:36 KST 2009 */