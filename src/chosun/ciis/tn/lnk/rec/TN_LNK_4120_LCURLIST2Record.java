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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_4120_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String umsidx;
	public String memberidx;
	public String name;
	public String receiverinfo;
	public String status;
	public String senddate;

	public TN_LNK_4120_LCURLIST2Record(){}

	public void setUmsidx(String umsidx){
		this.umsidx = umsidx;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setReceiverinfo(String receiverinfo){
		this.receiverinfo = receiverinfo;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setSenddate(String senddate){
		this.senddate = senddate;
	}

	public String getUmsidx(){
		return this.umsidx;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getName(){
		return this.name;
	}

	public String getReceiverinfo(){
		return this.receiverinfo;
	}

	public String getStatus(){
		return this.status;
	}

	public String getSenddate(){
		return this.senddate;
	}
}

/* �ۼ��ð� : Tue Sep 06 19:21:28 KST 2016 */