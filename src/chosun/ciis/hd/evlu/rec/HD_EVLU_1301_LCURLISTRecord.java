/***************************************************************************************************
* ���ϸ�		: 
* ���		:
* �ۼ�����	: 
* �ۼ���		: 
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������		:   
* ��������	: 
* ���		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_1301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_part_cd;
	public String db_status;

	public HD_EVLU_1301_LCURLISTRecord(){}

	public void setEvlu_part_cd(String evlu_part_cd){
		this.evlu_part_cd = evlu_part_cd;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getEvlu_part_cd(){
		return this.evlu_part_cd;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* �ۼ��ð� : Fri May 15 14:50:06 KST 2009 */