/***************************************************************************************************
* ���ϸ� : SE_SND_2500_MSECTLISTRecord.java
* ��� : �Ǹ�-�߼۰���-�߼ۺ�û��
* �ۼ����� : 2009-02-24
* �ۼ��� : �����
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


public class SE_SND_2500_MSECTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;

	public SE_SND_2500_MSECTLISTRecord(){}

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

/* �ۼ��ð� : Tue Feb 24 19:54:16 KST 2009 */