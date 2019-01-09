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


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String semuro_id;

	public SE_SAL_2500_MDataSet(){}
	public SE_SAL_2500_MDataSet(String errcode, String errmsg, String semuro_id){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.semuro_id = semuro_id;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSemuro_id(String semuro_id){
		this.semuro_id = semuro_id;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSemuro_id(){
		return this.semuro_id;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.semuro_id = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SAL_2500_MCOMMCDCUR1Record rec = new SE_SAL_2500_MCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SE_SAL_2500_MCOMMCDCUR2Record rec = new SE_SAL_2500_MCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.commcdcur2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_2500_MDataSet ds = (SE_SAL_2500_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_SAL_2500_MCOMMCDCUR1Record commcdcur1Rec = (SE_SAL_2500_MCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_SAL_2500_MCOMMCDCUR2Record commcdcur2Rec = (SE_SAL_2500_MCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSemuro_id()%>
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


/* �ۼ��ð� : Wed Jul 22 14:54:30 KST 2009 */