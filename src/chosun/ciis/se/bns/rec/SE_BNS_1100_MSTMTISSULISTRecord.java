/***************************************************************************************************
* ���ϸ� : SE_BNS_1100_MSTMTISSULISTRecord.java
* ��� : ���˹����� - ���˹����
* �ۼ����� : 2009-03-11
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1100_MSTMTISSULISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String cdnm_cd;
	public String cdabrvnm_cd;

	public SE_BNS_1100_MSTMTISSULISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public void setCdabrvnm_cd(String cdabrvnm_cd){
		this.cdabrvnm_cd = cdabrvnm_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}

	public String getCdabrvnm_cd(){
		return this.cdabrvnm_cd;
	}
}

/* �ۼ��ð� : Wed Mar 11 10:07:49 KST 2009 */