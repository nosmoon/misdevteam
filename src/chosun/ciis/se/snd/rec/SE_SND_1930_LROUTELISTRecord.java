/***************************************************************************************************
* ���ϸ� : SE_SND_1930_LROUTELISTRecord.java
* ��� : �Ǹ�-�߼۰���-�߼۸�����
* �ۼ����� : 2009-02-11
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1930_LROUTELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String route_clsf;
	public String route_clsf_nm;
	public String route_cd;
	public String route_nm;
	public String send_rank;
	public String cnsg_seqo;
	public String use_yn;

	public SE_SND_1930_LROUTELISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_clsf_nm(String route_clsf_nm){
		this.route_clsf_nm = route_clsf_nm;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setSend_rank(String send_rank){
		this.send_rank = send_rank;
	}

	public void setCnsg_seqo(String cnsg_seqo){
		this.cnsg_seqo = cnsg_seqo;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_clsf_nm(){
		return this.route_clsf_nm;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getSend_rank(){
		return this.send_rank;
	}

	public String getCnsg_seqo(){
		return this.cnsg_seqo;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* �ۼ��ð� : Wed Feb 11 15:16:08 KST 2009 */