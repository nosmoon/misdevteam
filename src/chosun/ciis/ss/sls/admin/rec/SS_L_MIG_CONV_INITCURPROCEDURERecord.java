/***************************************************************************************************
* ���ϸ� : SS_L_MIG_CONV_INITCURPROCEDURERecord.java
* ��� : ������-�۾�-���̱׷��̼�-�ʱ�ȭ��-���ν��� ����� ���� Record
* �ۼ����� : 2004-02-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-�۾�-���̱׷��̼�-�ʱ�ȭ��-���ν��� ����� ���� Record
 */

public class SS_L_MIG_CONV_INITCURPROCEDURERecord extends java.lang.Object implements java.io.Serializable{

	public String sp_auto;
	public String sp_mgyn;
	public String sp_name;
	public String sp_desc;
	public String sp_remk;

	public SS_L_MIG_CONV_INITCURPROCEDURERecord(){}

	public void setSp_auto(String sp_auto){
		this.sp_auto = sp_auto;
	}

	public void setSp_mgyn(String sp_mgyn){
		this.sp_mgyn = sp_mgyn;
	}

	public void setSp_name(String sp_name){
		this.sp_name = sp_name;
	}

	public void setSp_desc(String sp_desc){
		this.sp_desc = sp_desc;
	}

	public void setSp_remk(String sp_remk){
		this.sp_remk = sp_remk;
	}

	public String getSp_auto(){
		return this.sp_auto;
	}

	public String getSp_mgyn(){
		return this.sp_mgyn;
	}

	public String getSp_name(){
		return this.sp_name;
	}

	public String getSp_desc(){
		return this.sp_desc;
	}

	public String getSp_remk(){
		return this.sp_remk;
	}
}

/* �ۼ��ð� : Wed Feb 25 14:25:10 KST 2004 */