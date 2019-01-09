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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3111_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medialeb_yn;
	public String agentrate;
	public String agentrate2;
	public String trst_rate;
	public String trst_fee;

	public AD_PUB_3111_SDataSet(){}
	public AD_PUB_3111_SDataSet(String errcode, String errmsg, String medialeb_yn, String agentrate, String agentrate2, String trst_rate, String trst_fee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medialeb_yn = medialeb_yn;
		this.agentrate = agentrate;
		this.agentrate2 = agentrate2;
		this.trst_rate = trst_rate;
		this.trst_fee = trst_fee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedialeb_yn(String medialeb_yn){
		this.medialeb_yn = medialeb_yn;
	}

	public void setAgentrate(String agentrate){
		this.agentrate = agentrate;
	}

	public void setAgentrate2(String agentrate2){
		this.agentrate2 = agentrate2;
	}

	public void setTrst_rate(String trst_rate){
		this.trst_rate = trst_rate;
	}

	public void setTrst_fee(String trst_fee){
		this.trst_fee = trst_fee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedialeb_yn(){
		return this.medialeb_yn;
	}

	public String getAgentrate(){
		return this.agentrate;
	}

	public String getAgentrate2(){
		return this.agentrate2;
	}

	public String getTrst_rate(){
		return this.trst_rate;
	}

	public String getTrst_fee(){
		return this.trst_fee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medialeb_yn = Util.checkString(cstmt.getString(14));
		this.agentrate = Util.checkString(cstmt.getString(15));
		this.agentrate2 = Util.checkString(cstmt.getString(16));
		this.trst_rate = Util.checkString(cstmt.getString(17));
		this.trst_fee = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_3111_SDataSet ds = (AD_PUB_3111_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedialeb_yn()%>
<%= ds.getAgentrate()%>
<%= ds.getAgentrate2()%>
<%= ds.getTrst_rate()%>
<%= ds.getTrst_fee()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 10 19:15:14 KST 2014 */