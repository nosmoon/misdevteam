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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_2200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_yymm;
	public String fac_clsf;
	public String ps_loss_rate;
	public String film_loss_rate;

	public PR_PAPMAKE_2200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPs_loss_rate(String ps_loss_rate){
		this.ps_loss_rate = ps_loss_rate;
	}

	public void setFilm_loss_rate(String film_loss_rate){
		this.film_loss_rate = film_loss_rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yymm(){
		return this.clos_yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPs_loss_rate(){
		return this.ps_loss_rate;
	}

	public String getFilm_loss_rate(){
		return this.film_loss_rate;
	}
}

/* �ۼ��ð� : Sat Oct 31 16:10:09 KST 2009 */