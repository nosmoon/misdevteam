/***************************************************************************************************
* ���ϸ� : SE_SND_1810_LCURLISTRecord.java
* ��� : �Ǹ� - �߼۰��� - �뼱��ȸ
* �ۼ����� : 2009.03.12
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


public class SE_SND_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String route_cd		;
	public String route_nm		;
	public String send_plac_nm	;
	public String qty			;

	public SE_SND_1810_LCURLISTRecord(){}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getQty(){
		return this.qty;
	}
}

/* �ۼ��ð� : Thu Mar 12 16:49:03 KST 2009 */