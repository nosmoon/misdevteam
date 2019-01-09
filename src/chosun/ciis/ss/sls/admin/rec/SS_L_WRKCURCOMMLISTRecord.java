/***************************************************************************************************
* 파일명 : SS_L_WRKCURCOMMLISTRecord.java
* 기능 : 관리자-작업-등록-목록을 위한 Record
* 작성일자 : 2004-04-08
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-작업-등록-목록을 위한 Record
 */

public class SS_L_WRKCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String id;
	public String cyclnm;
	public String basidt;
	public String basitm;
	public String pgmnm;

	public SS_L_WRKCURCOMMLISTRecord(){}

	public void setId(String id){
		this.id = id;
	}

	public void setCyclnm(String cyclnm){
		this.cyclnm = cyclnm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setBasitm(String basitm){
		this.basitm = basitm;
	}

	public void setPgmnm(String pgmnm){
		this.pgmnm = pgmnm;
	}

	public String getId(){
		return this.id;
	}

	public String getCyclnm(){
		return this.cyclnm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getBasitm(){
		return this.basitm;
	}

	public String getPgmnm(){
		return this.pgmnm;
	}
}

/* 작성시간 : Thu Apr 08 21:03:58 KST 2004 */