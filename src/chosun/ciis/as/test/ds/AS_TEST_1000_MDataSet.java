/***************************************************************************************************
* ���ϸ� : .java
* ��� : �߼۰��� - �߼ۺ�û��
* �ۼ����� : 2009-11-11
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.as.test.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.test.dm.*;
import chosun.ciis.as.test.rec.*;

/**
 * 
 */


public class AS_TEST_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public ArrayList schelist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_TEST_1000_MDataSet(){}
	public AS_TEST_1000_MDataSet(String errcode, String errmsg){
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
			AS_TEST_1000_MSCHELISTRecord rec = new AS_TEST_1000_MSCHELISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.schelist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_REPORT_5000_MDataSet ds = (MT_REPORT_5000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		MT_REPORT_5000_MMEDILISTRecord medilistRec = (MT_REPORT_5000_MMEDILISTRecord)ds.medilist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.sectlist.size(); i++){
		MT_REPORT_5000_MSECTLISTRecord sectlistRec = (MT_REPORT_5000_MSECTLISTRecord)ds.sectlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedilist()%>
<%= ds.getSectlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= sectlistRec.cd%>
<%= sectlistRec.cdnm%>
<%= sectlistRec.cd_abrv_nm%>
<%= sectlistRec.cdnm_cd%>
<%= sectlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 06 16:04:38 KST 2010 */