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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8131_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String dt;
	public String memo_cont;
	public String memo_seq;

	public FC_FUNC_8131_LCURLIST3Record(){}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setMemo_cont(String memo_cont){
		this.memo_cont = memo_cont;
	}

	public void setMemo_seq(String memo_seq){
		this.memo_seq = memo_seq;
	}

	public String getDt(){
		return this.dt;
	}

	public String getMemo_cont(){
		return this.memo_cont;
	}

	public String getMemo_seq(){
		return this.memo_seq;
	}
}

/* 작성시간 : Thu Apr 09 13:44:11 KST 2009 */