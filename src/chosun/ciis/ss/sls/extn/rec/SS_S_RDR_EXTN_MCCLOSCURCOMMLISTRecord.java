/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-MCȮ��
* �ۼ����� : 2005-02-19
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-����ISȮ��-MCȮ��
 */


public class SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String deptcd;
	public String deptnm;
	public int basiamt1;
	public int basiamt2;
	public int basiamt3;

	public SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setBasiamt1(int basiamt1){
		this.basiamt1 = basiamt1;
	}

	public void setBasiamt2(int basiamt2){
		this.basiamt2 = basiamt2;
	}

	public void setBasiamt3(int basiamt3){
		this.basiamt3 = basiamt3;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public int getBasiamt1(){
		return this.basiamt1;
	}

	public int getBasiamt2(){
		return this.basiamt2;
	}

	public int getBasiamt3(){
		return this.basiamt3;
	}
}

/* �ۼ��ð� : Sat Feb 19 17:26:38 KST 2005 */