/***************************************************************************************************
* ���ϸ� : SE_SND_3420_LNOLISTRecord.java
* ��� : �Ǹ� - �߼۰��� - ��ǥ�뼱, �뼱 ����
* �ۼ����� : 2009-05-14
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


public class SE_SND_3420_LNOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String route_clsf	;
	public String rptv_route_cd	;
	public String rptv_route_nm	;
	public String route_cd		;
	public String route_nm		;

	public SE_SND_3420_LNOLISTRecord(){}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRptv_route_cd(String rptv_route_cd){
		this.rptv_route_cd = rptv_route_cd;
	}

	public void setRptv_route_nm(String rptv_route_nm){
		this.rptv_route_nm = rptv_route_nm;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRptv_route_cd(){
		return this.rptv_route_cd;
	}

	public String getRptv_route_nm(){
		return this.rptv_route_nm;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}
}

/* �ۼ��ð� : Thu May 14 17:12:53 KST 2009 */