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


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1610_LDataSet(){}
	public SE_BAS_1610_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_BAS_1610_LCURLISTRecord rec = new SE_BAS_1610_LCURLISTRecord();
			rec.sell_net_clsf = Util.checkString(rset0.getString("sell_net_clsf"));
			rec.sell_net_clsf_nm = Util.checkString(rset0.getString("sell_net_clsf_nm"));
			rec.aply_mm = Util.checkString(rset0.getString("aply_mm"));
			rec.aply_bgn_dd = Util.checkString(rset0.getString("aply_bgn_dd"));
			rec.enty_rate = Util.checkString(rset0.getString("enty_rate"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BAS_1610_LDataSet ds = (SE_BAS_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BAS_1610_LCURLISTRecord curlistRec = (SE_BAS_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sell_net_clsf%>
<%= curlistRec.sell_net_clsf_nm%>
<%= curlistRec.aply_mm%>
<%= curlistRec.aply_bgn_dd%>
<%= curlistRec.enty_rate%>
<%= curlistRec.remk%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 21 19:36:36 KST 2009 */