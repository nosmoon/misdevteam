/***************************************************************************************************
* ���ϸ� : SE_SND_1230_LCURLISTRecord.java
* ��� : �Ǹ� - �߼۰��� - �뼱���е��
* �ۼ����� : 2009.05.14
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


public class SE_SND_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd	;
	public String cdnm	;

	public SE_SND_1230_LCURLISTRecord(){}

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

/* �ۼ��ð� : Thu May 14 09:57:00 KST 2009 */