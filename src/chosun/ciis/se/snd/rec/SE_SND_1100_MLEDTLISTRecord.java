/***************************************************************************************************
* ���ϸ� : SE_SND_1100_MLEDTLISTRecord.java
* ��� : �Ǹ� - �߼۰��� - �뼱���
 * �ۼ����� : 2009.02.03
 * �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1100_MLEDTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public SE_SND_1100_MLEDTLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */