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


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rmsg_dt_tm;

	public CO_COCD_1600_MDataSet(){}
	public CO_COCD_1600_MDataSet(String errcode, String errmsg, String rmsg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rmsg_dt_tm = rmsg_dt_tm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRmsg_dt_tm(String rmsg_dt_tm){
		this.rmsg_dt_tm = rmsg_dt_tm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRmsg_dt_tm(){
		return this.rmsg_dt_tm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.rmsg_dt_tm = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			CO_COCD_1600_MCOMMCDCUR1Record rec = new CO_COCD_1600_MCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			CO_COCD_1600_MCOMMCDCUR2Record rec = new CO_COCD_1600_MCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.commcdcur2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_COCD_1600_MDataSet ds = (CO_COCD_1600_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		CO_COCD_1600_MCOMMCDCUR1Record commcdcur1Rec = (CO_COCD_1600_MCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		CO_COCD_1600_MCOMMCDCUR2Record commcdcur2Rec = (CO_COCD_1600_MCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRmsg_dt_tm()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCommcdcur2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= commcdcur2Rec.cd%>
<%= commcdcur2Rec.cdnm%>
<%= commcdcur2Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 29 15:45:17 KST 2012 */