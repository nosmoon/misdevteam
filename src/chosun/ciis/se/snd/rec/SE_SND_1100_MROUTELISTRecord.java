/***************************************************************************************************
* ���ϸ� : SE_SND_1100_MROUTELISTRecord.java
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


public class SE_SND_1100_MROUTELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;
	
	public String getMang_cd_1() {
		return mang_cd_1;
	}

	public void setMang_cd_1(String mang_cd_1) {
		this.mang_cd_1 = mang_cd_1;
	}

	public SE_SND_1100_MROUTELISTRecord(){}

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