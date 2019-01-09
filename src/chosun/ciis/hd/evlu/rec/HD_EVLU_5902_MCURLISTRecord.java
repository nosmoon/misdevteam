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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5902_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grad_cd;
	public String gradpoint;

	public HD_EVLU_5902_MCURLISTRecord(){}

	public void setEvlu_grad_cd(String evlu_grad_cd){
		this.evlu_grad_cd = evlu_grad_cd;
	}

	public void setGradpoint(String gradpoint){
		this.gradpoint = gradpoint;
	}

	public String getEvlu_grad_cd(){
		return this.evlu_grad_cd;
	}

	public String getGradpoint(){
		return this.gradpoint;
	}
}

/* 작성시간 : Tue Jun 09 10:20:36 KST 2009 */