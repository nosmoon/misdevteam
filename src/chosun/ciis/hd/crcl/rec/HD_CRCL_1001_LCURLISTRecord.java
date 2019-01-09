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


package chosun.ciis.hd.crcl.rec;

import java.sql.*;
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.ds.*;

/**
 * 
 */


public class HD_CRCL_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String cmpy_cd;
	public String paty_crc_cd;
	public String bgn_dty_cd;
	public String end_dty_cd;
	public String fix_fix_rate_clsf;
	public String rgla_dduc_dus;
	public String rgla_dduc_ratio;

	public HD_CRCL_1001_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setBgn_dty_cd(String bgn_dty_cd){
		this.bgn_dty_cd = bgn_dty_cd;
	}

	public void setEnd_dty_cd(String end_dty_cd){
		this.end_dty_cd = end_dty_cd;
	}

	public void setFix_fix_rate_clsf(String fix_fix_rate_clsf){
		this.fix_fix_rate_clsf = fix_fix_rate_clsf;
	}

	public void setRgla_dduc_dus(String rgla_dduc_dus){
		this.rgla_dduc_dus = rgla_dduc_dus;
	}

	public void setRgla_dduc_ratio(String rgla_dduc_ratio){
		this.rgla_dduc_ratio = rgla_dduc_ratio;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getBgn_dty_cd(){
		return this.bgn_dty_cd;
	}

	public String getEnd_dty_cd(){
		return this.end_dty_cd;
	}

	public String getFix_fix_rate_clsf(){
		return this.fix_fix_rate_clsf;
	}

	public String getRgla_dduc_dus(){
		return this.rgla_dduc_dus;
	}

	public String getRgla_dduc_ratio(){
		return this.rgla_dduc_ratio;
	}
}

/* 작성시간 : Tue Feb 17 09:59:30 KST 2009 */