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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1151_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1151_LDataSet(){}
	public FC_FUNC_1151_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1151_LCURLISTRecord rec = new FC_FUNC_1151_LCURLISTRecord();
			rec.yyyymm = Util.checkString(rset0.getString("yyyymm"));
			rec.balsaengcnttot = Util.checkString(rset0.getString("balsaengcnttot"));
			rec.balsaengamttot = Util.checkString(rset0.getString("balsaengamttot"));
			rec.somyeolcnttot = Util.checkString(rset0.getString("somyeolcnttot"));
			rec.somyeolamttot = Util.checkString(rset0.getString("somyeolamttot"));
			rec.daesoncnttot = Util.checkString(rset0.getString("daesoncnttot"));
			rec.daesonamttot = Util.checkString(rset0.getString("daesonamttot"));
			rec.janaegcnttot = Util.checkString(rset0.getString("janaegcnttot"));
			rec.janaegamttot = Util.checkString(rset0.getString("janaegamttot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1151_LDataSet ds = (FC_FUNC_1151_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1151_LCURLISTRecord curlistRec = (FC_FUNC_1151_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yyyymm%>
<%= curlistRec.balsaengcnttot%>
<%= curlistRec.balsaengamttot%>
<%= curlistRec.somyeolcnttot%>
<%= curlistRec.somyeolamttot%>
<%= curlistRec.daesoncnttot%>
<%= curlistRec.daesonamttot%>
<%= curlistRec.janaegcnttot%>
<%= curlistRec.janaegamttot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 05 17:20:16 KST 2009 */