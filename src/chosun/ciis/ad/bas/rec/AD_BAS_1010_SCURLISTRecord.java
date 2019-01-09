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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1010_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String job_clsf;
	public String advcs_feat;
	public String chrg_pers;
	public String tel_no;

	public AD_BAS_1010_SCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAdvcs_feat(String advcs_feat){
		this.advcs_feat = advcs_feat;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAdvcs_feat(){
		return this.advcs_feat;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getTel_no(){
		return this.tel_no;
	}
}

/* 작성시간 : Wed Jan 22 15:49:02 KST 2014 */