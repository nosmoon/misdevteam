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


package chosun.ciis.is.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SND_1220_LDataSet(){}
	public IS_SND_1220_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			IS_SND_1220_LCURLISTRecord rec = new IS_SND_1220_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cmpy_cd_nm = Util.checkString(rset0.getString("cmpy_cd_nm"));
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_SND_1220_LDataSet ds = (IS_SND_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SND_1220_LCURLISTRecord curlistRec = (IS_SND_1220_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.cmpy_cd_nm%>
<%= curlistRec.asnt_dstc_cd%>
<%= curlistRec.asnt_dstc_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 29 14:49:29 KST 2012 */