/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.lst.rec;

import java.sql.*;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.ds.*;

/**
 * 
 */


public class PL_LST_3000_MMEDI_CD_MAGZCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String issu_cmpy;
	public String issu_clsf;

	public PL_LST_3000_MMEDI_CD_MAGZCURRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}
}

/* 작성시간 : Wed Aug 12 20:29:50 KST 2009 */