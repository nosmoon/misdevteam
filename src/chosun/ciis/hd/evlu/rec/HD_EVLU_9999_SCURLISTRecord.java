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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_9999_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String class_result;
	public String busn_rslt_scor;
	public String evlu_part_cd1;
	public String evlu_part_cd2;

	public HD_EVLU_9999_SCURLISTRecord(){}

	public void setClass_result(String class_result){
		this.class_result = class_result;
	}

	public void setBusn_rslt_scor(String busn_rslt_scor){
		this.busn_rslt_scor = busn_rslt_scor;
	}

	public void setEvlu_part_cd1(String evlu_part_cd1){
		this.evlu_part_cd1 = evlu_part_cd1;
	}

	public void setEvlu_part_cd2(String evlu_part_cd2){
		this.evlu_part_cd2 = evlu_part_cd2;
	}

	public String getClass_result(){
		return this.class_result;
	}

	public String getBusn_rslt_scor(){
		return this.busn_rslt_scor;
	}

	public String getEvlu_part_cd1(){
		return this.evlu_part_cd1;
	}

	public String getEvlu_part_cd2(){
		return this.evlu_part_cd2;
	}
}

/* �ۼ��ð� : Tue Oct 13 17:37:16 KST 2009 */