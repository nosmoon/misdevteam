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


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2900_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur3 = new ArrayList();
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2900_MDataSet(){}
	public SE_SND_2900_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_SND_2900_MCOMMCDCUR1Record rec = new SE_SND_2900_MCOMMCDCUR1Record();
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_SND_2900_MCOMMCDCUR2Record rec = new SE_SND_2900_MCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.commcdcur2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_SND_2900_MCOMMCDCUR3Record rec = new SE_SND_2900_MCOMMCDCUR3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.commcdcur3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2900_MDataSet ds = (SE_SND_2900_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_SND_2900_MCOMMCDCUR1Record commcdcur1Rec = (SE_SND_2900_MCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_SND_2900_MCOMMCDCUR2Record commcdcur2Rec = (SE_SND_2900_MCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur3.size(); i++){
		SE_SND_2900_MCOMMCDCUR3Record commcdcur3Rec = (SE_SND_2900_MCOMMCDCUR3Record)ds.commcdcur3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCommcdcur2()%>
<%= ds.getCommcdcur3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= commcdcur1Rec.area_cd%>
<%= commcdcur1Rec.area_nm%>
<%= commcdcur1Rec.dept_cd%>
<%= commcdcur2Rec.cd%>
<%= commcdcur2Rec.cdnm%>
<%= commcdcur2Rec.cd_abrv_nm%>
<%= commcdcur3Rec.cd%>
<%= commcdcur3Rec.cdnm%>
<%= commcdcur3Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 16 09:41:19 KST 2009 */