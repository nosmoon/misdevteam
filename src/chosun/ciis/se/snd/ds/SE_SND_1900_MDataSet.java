/***************************************************************************************************
* ���ϸ� : SE_SND_1900_MDataSet.java
* ��� : �Ǹ� - �߼۰��� - �߼۸�����
* �ۼ����� : 2009.02.04
* �ۼ��� :   �����
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


public class SE_SND_1900_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist 	= new ArrayList();
	public ArrayList etclist 	= new ArrayList();
	public ArrayList stetlist 	= new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_1900_MDataSet(){}
	public SE_SND_1900_MDataSet(String errcode, String errmsg){
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_SND_1900_MCURLISTRecord rec = new SE_SND_1900_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_SND_1900_METCLISTRecord rec = new SE_SND_1900_METCLISTRecord();
			rec.cd 			= Util.checkString(rset1.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset1.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset1.getString("cd_abrv_nm"	));
			this.etclist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_SND_1900_MSTETLISTRecord rec = new SE_SND_1900_MSTETLISTRecord();
			rec.cd 			= Util.checkString(rset2.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset2.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset2.getString("cd_abrv_nm"	));
			this.stetlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1900_MDataSet ds = (SE_SND_1900_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1900_MCURLISTRecord curlistRec = (SE_SND_1900_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRownum()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 04 17:46:06 KST 2009 */