/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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

/* �ۼ��ð� : Thu Apr 09 13:44:11 KST 2009 */