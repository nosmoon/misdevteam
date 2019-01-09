/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String issu_dt;
	public long ser_no1;
	public long ser_no2;

	public SE_QTY_2300_MDataSet(){}
	public SE_QTY_2300_MDataSet(String errcode, String errmsg, String issu_dt, long ser_no1, long ser_no2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.issu_dt = issu_dt;
		this.ser_no1 = ser_no1;
		this.ser_no2 = ser_no2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSer_no1(long ser_no1){
		this.ser_no1 = ser_no1;
	}

	public void setSer_no2(long ser_no2){
		this.ser_no2 = ser_no2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public long getSer_no1(){
		return this.ser_no1;
	}

	public long getSer_no2(){
		return this.ser_no2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.issu_dt = Util.checkString(cstmt.getString(5));
		this.ser_no1 = cstmt.getLong(6);
		this.ser_no2 = cstmt.getLong(7);
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_QTY_2300_MCOMMCDCUR1Record rec = new SE_QTY_2300_MCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_2300_MDataSet ds = (SE_QTY_2300_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_QTY_2300_MCOMMCDCUR1Record commcdcur1Rec = (SE_QTY_2300_MCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_dt()%>
<%= ds.getSer_no1()%>
<%= ds.getSer_no2()%>
<%= ds.getCommcdcur1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 02 11:51:50 KST 2009 */