/***************************************************************************************************
* ���ϸ� : SE_ETC_1200_MDataSet.java
* ��� : �Ǹ�-��Ÿ����-������ ���޵��
* �ۼ����� : 2009-03-05
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist 	= new ArrayList();
	public ArrayList teamlist 	= new ArrayList();
	public ArrayList banklist 	= new ArrayList();
	public ArrayList decidlist	= new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_ETC_1200_MDataSet(){}
	public SE_ETC_1200_MDataSet(String errcode, String errmsg){
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_ETC_1200_MCURLISTRecord rec = new SE_ETC_1200_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		
		rset0 	= (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_ETC_1200_MTEAMLISTRecord rec = new SE_ETC_1200_MTEAMLISTRecord();
			rec.dept_cd		= Util.checkString(rset0.getString("dept_cd"	));
			rec.dept_nm 	= Util.checkString(rset0.getString("dept_nm"	));
			this.teamlist.add(rec);
		}
		
		rset0 	= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_ETC_1200_MBANKLISTRecord rec = new SE_ETC_1200_MBANKLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.banklist.add(rec);
		}
		
		rset0 	= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_ETC_1200_MDECIDLISTRecord rec = new SE_ETC_1200_MDECIDLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.decidlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_ETC_1200_MDataSet ds = (SE_ETC_1200_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1200_MCURLISTRecord curlistRec = (SE_ETC_1200_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 05 09:42:35 KST 2009 */