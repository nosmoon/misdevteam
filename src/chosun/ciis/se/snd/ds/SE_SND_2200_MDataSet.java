/***************************************************************************************************
* ���ϸ� : SE_SND_2200_MDataSet.java
* ��� : �Ǹ�-�߼۰���-�߼۸���Ʈ
* �ۼ����� : 2009-05-12
* �ۼ��� : �����
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


public class SE_SND_2200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList ecntlist = new ArrayList();
	public ArrayList routelist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2200_MDataSet(){}
	public SE_SND_2200_MDataSet(String errcode, String errmsg){
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
			SE_SND_2200_MCURLISTRecord rec = new SE_SND_2200_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		ResultSet rset2 	= (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SE_SND_2200_MECNTLISTRecord rec = new SE_SND_2200_MECNTLISTRecord();
			rec.cd 			= Util.checkString(rset2.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset2.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset2.getString("cd_abrv_nm"	));
			this.ecntlist.add(rec);
		}
		ResultSet rset3 	= (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			SE_SND_2200_MROUTELISTRecord rec = new SE_SND_2200_MROUTELISTRecord();
			rec.cd 			= Util.checkString(rset3.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset3.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset3.getString("cd_abrv_nm"	));
			this.routelist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2200_MDataSet ds = (SE_SND_2200_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2200_MCURLISTRecord curlistRec = (SE_SND_2200_MCURLISTRecord)ds.curlist.get(i);%>
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


/* �ۼ��ð� : Tue May 12 11:12:12 KST 2009 */