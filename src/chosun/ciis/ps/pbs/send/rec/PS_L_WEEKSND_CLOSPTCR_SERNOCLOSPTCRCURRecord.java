/***************************************************************************************************
* ���ϸ� : SP_PS_L_WEEKSND_CLOSPTCR_SERNO.java  
* ��� :   ���Ǿ��������ý��� ���긶�� �󼼳���ȭ��
* �ۼ����� : 2007-11-02
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 *  ���Ǿ��������ý��� ���긶�� �󼼳���ȭ��
 *
 **/

public class PS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String clsfcd;
	public String closseq;
	public String closyymm;
	public String closdt;
	public String mediser_no;
	public int lumpcnt;
	public int retncnt;
	public int closcnt;
	public int lumpamt;
	public int retnamt;
	public int closamt;

	public PS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord(){}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setClosseq(String closseq){
		this.closseq = closseq;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setLumpcnt(int lumpcnt){
		this.lumpcnt = lumpcnt;
	}

	public void setRetncnt(int retncnt){
		this.retncnt = retncnt;
	}

	public void setCloscnt(int closcnt){
		this.closcnt = closcnt;
	}

	public void setLumpamt(int lumpamt){
		this.lumpamt = lumpamt;
	}

	public void setRetnamt(int retnamt){
		this.retnamt = retnamt;
	}

	public void setClosamt(int closamt){
		this.closamt = closamt;
	}

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getClosseq(){
		return this.closseq;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public int getLumpcnt(){
		return this.lumpcnt;
	}

	public int getRetncnt(){
		return this.retncnt;
	}

	public int getCloscnt(){
		return this.closcnt;
	}

	public int getLumpamt(){
		return this.lumpamt;
	}

	public int getRetnamt(){
		return this.retnamt;
	}

	public int getClosamt(){
		return this.closamt;
	}
}

/* �ۼ��ð� : Fri Nov 02 14:55:05 KST 2007 */