/***************************************************************************************************
* ���ϸ�   : PS_S_PRINT_INIT.java
* ���     : ��� - �ʱ� ȭ��
* �ۼ����� : 2006-02-01
* �ۼ���   : ����ǥ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :   
* ���     :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.print.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * ��� - �ʱ� ȭ��
 *
 */

public class PS_S_PRINT_INITMEDICDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public PS_S_PRINT_INITMEDICDLISTRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* �ۼ��ð� : Wed May 06 11:07:41 KST 2009 */