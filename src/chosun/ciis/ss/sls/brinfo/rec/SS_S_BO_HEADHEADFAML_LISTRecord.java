/***************************************************************************************************
 * ���ϸ�   : SS_S_BO_HEADHEADFAML_LISTRecord.java
 * ���     : ����info-����������-����ȸ
 * �ۼ����� : 2007/01/11
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
**  SP_SS_S_BO_HEAD
**/

public class SS_S_BO_HEADHEADFAML_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String prn;
	public String flnm;
	public String rshp;
	public String bidt;

	public SS_S_BO_HEADHEADFAML_LISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setRshp(String rshp){
		this.rshp = rshp;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getRshp(){
		return this.rshp;
	}

	public String getBidt(){
		return this.bidt;
	}
}

/* �ۼ��ð� : Thu Jan 11 14:52:18 KST 2007 */