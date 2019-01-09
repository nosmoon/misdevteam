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


package chosun.ciis.hd.orga.rec;

import java.sql.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */


public class HD_ORGA_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String orga_reorga_dd;
	public String orga_reorga_dd_nm;
	public String orga_reorga_resn;

	public HD_ORGA_1101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrga_reorga_dd(String orga_reorga_dd){
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public void setOrga_reorga_dd_nm(String orga_reorga_dd_nm){
		this.orga_reorga_dd_nm = orga_reorga_dd_nm;
	}

	public void setOrga_reorga_resn(String orga_reorga_resn){
		this.orga_reorga_resn = orga_reorga_resn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrga_reorga_dd(){
		return this.orga_reorga_dd;
	}

	public String getOrga_reorga_dd_nm(){
		return this.orga_reorga_dd_nm;
	}

	public String getOrga_reorga_resn(){
		return this.orga_reorga_resn;
	}
}

/* 작성시간 : Wed Jun 17 11:48:17 KST 2009 */