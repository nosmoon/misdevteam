/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1018_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cont_yy;
	public String cont_dd;
	public String cont_yy_cal;
	public String cont_yy_cal_2012;
	public String cont_yy_cal_2013;

	public HD_LVCMPY_1018_LCURLISTRecord(){}

	public void setCont_yy(String cont_yy){
		this.cont_yy = cont_yy;
	}

	public void setCont_dd(String cont_dd){
		this.cont_dd = cont_dd;
	}

	public void setCont_yy_cal(String cont_yy_cal){
		this.cont_yy_cal = cont_yy_cal;
	}

	public void setCont_yy_cal_2012(String cont_yy_cal_2012){
		this.cont_yy_cal_2012 = cont_yy_cal_2012;
	}

	public void setCont_yy_cal_2013(String cont_yy_cal_2013){
		this.cont_yy_cal_2013 = cont_yy_cal_2013;
	}

	public String getCont_yy(){
		return this.cont_yy;
	}

	public String getCont_dd(){
		return this.cont_dd;
	}

	public String getCont_yy_cal(){
		return this.cont_yy_cal;
	}

	public String getCont_yy_cal_2012(){
		return this.cont_yy_cal_2012;
	}

	public String getCont_yy_cal_2013(){
		return this.cont_yy_cal_2013;
	}
}

/* �ۼ��ð� : Tue Mar 19 14:42:29 KST 2013 */