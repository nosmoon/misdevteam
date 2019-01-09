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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String clsf_cd;
	public String cont;

	public SP_SUP_1230_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getCont(){
		return this.cont;
	}
}

/* 작성시간 : Fri Jul 20 16:53:33 KST 2012 */