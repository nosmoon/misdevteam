/***************************************************************************************************
* ���ϸ� : SE_SND_1910_LROUTELISTRecord.java
* ��� : �Ǹ�-�߼۰���-�߼۸�����
* �ۼ����� : 2009-02-09
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


public class SE_SND_1910_LROUTELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd         ;
	public String route_clsf      ;
	public String route_clsf_nm   ;
	public String route_cd        ;
	public String route_nm        ;
	public String route_rank      ;
	public String send_rank       ;
	public String cnsg_seqo       ;
	public String use_yn					;

	public SE_SND_1910_LROUTELISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	
	public String getCnsg_seqo() {
		return cnsg_seqo;
	}

	public void setCnsg_seqo(String cnsg_seqo) {
		this.cnsg_seqo = cnsg_seqo;
	}

	public String getRoute_cd() {
		return route_cd;
	}

	public void setRoute_cd(String route_cd) {
		this.route_cd = route_cd;
	}

	public String getRoute_clsf() {
		return route_clsf;
	}

	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}

	public String getRoute_clsf_nm() {
		return route_clsf_nm;
	}

	public void setRoute_clsf_nm(String route_clsf_nm) {
		this.route_clsf_nm = route_clsf_nm;
	}

	public String getRoute_nm() {
		return route_nm;
	}

	public void setRoute_nm(String route_nm) {
		this.route_nm = route_nm;
	}

	public String getSend_rank() {
		return send_rank;
	}

	public void setSend_rank(String send_rank) {
		this.send_rank = send_rank;
	}

	public String getUse_yn() {
		return use_yn;
	}

	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}

	public String getRoute_rank() {
		return route_rank;
	}

	public void setRoute_rank(String route_rank) {
		this.route_rank = route_rank;
	}
}

/* �ۼ��ð� : Mon Feb 09 10:18:19 KST 2009 */