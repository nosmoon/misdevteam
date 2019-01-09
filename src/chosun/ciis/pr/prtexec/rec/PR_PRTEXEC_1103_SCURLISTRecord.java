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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_1103_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ref_matt;

	public PR_PRTEXEC_1103_SCURLISTRecord(){}

	public void setRef_matt(String ref_matt){
		this.ref_matt = ref_matt;
	}

	public String getRef_matt(){
		return this.ref_matt;
	}
}

/* 작성시간 : Thu Jun 25 22:58:50 KST 2009 */