/***************************************************************************************************
* ���ϸ� : SE_MO_SND_1811_LCURLISTRecord.java
* ��� : �Ǹ� - �߼۰���-�뼱����-�뼱��ȸ_����Ͽ�
 * �ۼ����� : 2017-01-07
 * �ۼ��� :   �弱��
***************************************************************************************************
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


public class SE_MO_SND_1811_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String route_cd;
	public String route_nm;
	public String plac_nm;
	public String send_rank;
	public String addr;
	public String route_seq;

	public SE_MO_SND_1811_LCURLISTRecord(){}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setPlac_nm(String plac_nm){
		this.plac_nm = plac_nm;
	}

	public void setSend_rank(String send_rank){
		this.send_rank = send_rank;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setRoute_seq(String route_seq){
		this.route_seq = route_seq;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getPlac_nm(){
		return this.plac_nm;
	}

	public String getSend_rank(){
		return this.send_rank;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getRoute_seq(){
		return this.route_seq;
	}
}

/* �ۼ��ð� : Mon Jan 09 10:25:36 KST 2017 */