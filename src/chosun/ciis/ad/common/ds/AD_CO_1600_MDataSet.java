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


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.common.rec.AD_CO_1600_MCURLISTRecord;

/**
 * 
 */


public class AD_CO_1600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_CO_1600_MDataSet(){}
	public AD_CO_1600_MDataSet(String errcode, String errmsg){
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
		
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_CO_1600_MCURLISTRecord rec = new AD_CO_1600_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset1.getString("cd"));
			rec.cdnm 		= Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm 	= Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd 	= Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_CO_1600_MCURLISTRecord rec = new AD_CO_1600_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset2.getString("cd"));
			rec.cdnm 		= Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm 	= Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd 	= Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			AD_CO_1600_MCURLISTRecord rec = new AD_CO_1600_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset3.getString("cd"));
			rec.cdnm 		= Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm 	= Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd 	= Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_CO_1100_LDataSet ds = (AD_CO_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_CO_1100_LCURLISTRecord curlistRec = (AD_CO_1100_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_CO_1100_LCURLIST2Record curlist2Rec = (AD_CO_1100_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist2Rec.major%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 02 15:48:45 KST 2009 */