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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SAL_1100_MDataSet(){}
	public IS_SAL_1100_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_SAL_1100_MCURLIST1Record rec = new IS_SAL_1100_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			IS_SAL_1100_MCURLIST2Record rec = new IS_SAL_1100_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			IS_SAL_1100_MCURLIST3Record rec = new IS_SAL_1100_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			IS_SAL_1100_MCURLIST4Record rec = new IS_SAL_1100_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			IS_SAL_1100_MTEAMLISTRecord rec = new IS_SAL_1100_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset4.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset4.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			IS_SAL_1100_MPARTLISTRecord rec = new IS_SAL_1100_MPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset5.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset5.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset5.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_SAL_1100_MDataSet ds = (IS_SAL_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_SAL_1100_MCURLIST1Record curlist1Rec = (IS_SAL_1100_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		IS_SAL_1100_MCURLIST2Record curlist2Rec = (IS_SAL_1100_MCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		IS_SAL_1100_MCURLIST3Record curlist3Rec = (IS_SAL_1100_MCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		IS_SAL_1100_MCURLIST4Record curlist4Rec = (IS_SAL_1100_MCURLIST4Record)ds.curlist4.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		IS_SAL_1100_MTEAMLISTRecord teamlistRec = (IS_SAL_1100_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		IS_SAL_1100_MPARTLISTRecord partlistRec = (IS_SAL_1100_MPARTLISTRecord)ds.partlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist3Rec.cdabrvnm_cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist4Rec.cdnm_cd%>
<%= curlist4Rec.cdabrvnm_cd%>
<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 26 14:50:57 KST 2012 */