/***************************************************************************************************
* ���ϸ� : SS_L_ANNCSLSMAINANNCLISTRecord.java
* ��� : �Ǹű�����-�ǽð������� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * �Ǹű�����-�ǽð������� ���� Record
 */


public class SS_L_ANNCSLSMAINANNCLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String makepersid;
	public String makepersnm;
	public String annctitl;
	public String annccont;

	public SS_L_ANNCSLSMAINANNCLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}
}

/* �ۼ��ð� : Sat Jul 10 15:08:33 KST 2004 */