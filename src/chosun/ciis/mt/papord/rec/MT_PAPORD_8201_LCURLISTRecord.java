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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_8201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String jejisa;
	public String paper_cmpy;
	public String wgt;
	public String ewh_wgt;
	public String wgt_tot;
	public String rate;
	public String std_rate;
	public String diff_rate;
	public String ad_wgt;

	public MT_PAPORD_8201_LCURLISTRecord(){}

	public void setJejisa(String jejisa){
		this.jejisa = jejisa;
	}

	public void setPaper_cmpy(String paper_cmpy){
		this.paper_cmpy = paper_cmpy;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setWgt_tot(String wgt_tot){
		this.wgt_tot = wgt_tot;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setStd_rate(String std_rate){
		this.std_rate = std_rate;
	}

	public void setDiff_rate(String diff_rate){
		this.diff_rate = diff_rate;
	}

	public void setAd_wgt(String ad_wgt){
		this.ad_wgt = ad_wgt;
	}

	public String getJejisa(){
		return this.jejisa;
	}

	public String getPaper_cmpy(){
		return this.paper_cmpy;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getWgt_tot(){
		return this.wgt_tot;
	}

	public String getRate(){
		return this.rate;
	}

	public String getStd_rate(){
		return this.std_rate;
	}

	public String getDiff_rate(){
		return this.diff_rate;
	}

	public String getAd_wgt(){
		return this.ad_wgt;
	}
}

/* 작성시간 : Tue Nov 01 17:21:52 KST 2016 */