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


package chosun.ciis.fc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_8010_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_CO_8010_MDataSet(){}
	public FC_CO_8010_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_CO_8010_MCURLIST1Record rec = new FC_CO_8010_MCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset0.getString("cd_clsf"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_CO_8010_MCURLIST2Record rec = new FC_CO_8010_MCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.job_clsf = Util.checkString(rset1.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset1.getString("cd_clsf"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_CO_8010_MDataSet ds = (FC_CO_8010_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_CO_8010_MCURLIST1Record curlist1Rec = (FC_CO_8010_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_CO_8010_MCURLIST2Record curlist2Rec = (FC_CO_8010_MCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.job_clsf%>
<%= curlist1Rec.cd_clsf%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.job_clsf%>
<%= curlist2Rec.cd_clsf%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 16 17:56:47 KST 2009 */