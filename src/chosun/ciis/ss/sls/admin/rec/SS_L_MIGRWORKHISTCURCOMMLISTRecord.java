/***************************************************************************************************
* ���ϸ� : SS_L_MIGRWORKHISTCURCOMMLISTRecord.java
* ��� : ������-�۾�-���̱׷��̼�-���(�̷�)�� ���� Record
* �ۼ����� : 2004-03-12
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
 * ������-�۾�-���̱׷��̼�-���(�̷�)�� ���� Record
 */

public class SS_L_MIGRWORKHISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String workclsf;
	public String workno;
	public Timestamp workfrdt;
	public Timestamp worktodt;
	public String work_pers;
	public String workremk;

	public SS_L_MIGRWORKHISTCURCOMMLISTRecord(){}

	public void setWorkclsf(String workclsf){
		this.workclsf = workclsf;
	}

	public void setWorkno(String workno){
		this.workno = workno;
	}

	public void setWorkfrdt(Timestamp workfrdt){
		this.workfrdt = workfrdt;
	}

	public void setWorktodt(Timestamp worktodt){
		this.worktodt = worktodt;
	}

	public void setWork_pers(String work_pers){
		this.work_pers = work_pers;
	}

	public void setWorkremk(String workremk){
		this.workremk = workremk;
	}

	public String getWorkclsf(){
		return this.workclsf;
	}

	public String getWorkno(){
		return this.workno;
	}

	public Timestamp getWorkfrdt(){
		return this.workfrdt;
	}

	public Timestamp getWorktodt(){
		return this.worktodt;
	}

	public String getWork_pers(){
		return this.work_pers;
	}

	public String getWorkremk(){
		return this.workremk;
	}
}

/* �ۼ��ð� : Sat Mar 13 14:13:00 KST 2004 */