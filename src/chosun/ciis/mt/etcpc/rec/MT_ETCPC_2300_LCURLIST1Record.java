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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_2300_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String swlics_no;
	public String swver;
	public String lisno;
	public String swlics_cnt;
	public String swestb_dt;
	public String swclsf;
	public String remk;
	public String mchn_mang_no;
	public String seq;

	public MT_ETCPC_2300_LCURLIST1Record(){}

	public void setSwlics_no(String swlics_no){
		this.swlics_no = swlics_no;
	}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setLisno(String lisno){
		this.lisno = lisno;
	}

	public void setSwlics_cnt(String swlics_cnt){
		this.swlics_cnt = swlics_cnt;
	}

	public void setSwestb_dt(String swestb_dt){
		this.swestb_dt = swestb_dt;
	}

	public void setSwclsf(String swclsf){
		this.swclsf = swclsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getSwlics_no(){
		return this.swlics_no;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getLisno(){
		return this.lisno;
	}

	public String getSwlics_cnt(){
		return this.swlics_cnt;
	}

	public String getSwestb_dt(){
		return this.swestb_dt;
	}

	public String getSwclsf(){
		return this.swclsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* �ۼ��ð� : Tue Jul 07 11:20:32 KST 2009 */