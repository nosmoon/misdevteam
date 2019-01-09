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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1720_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_1720_LDataSet(){}
	public IS_BUS_1720_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			IS_BUS_1720_LCURLISTRecord rec = new IS_BUS_1720_LCURLISTRecord();
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.sun = Util.checkString(rset0.getString("sun"));
			rec.mon = Util.checkString(rset0.getString("mon"));
			rec.tue = Util.checkString(rset0.getString("tue"));
			rec.wed = Util.checkString(rset0.getString("wed"));
			rec.thr = Util.checkString(rset0.getString("thr"));
			rec.fri = Util.checkString(rset0.getString("fri"));
			rec.sat = Util.checkString(rset0.getString("sat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BUS_1720_LDataSet ds = (IS_BUS_1720_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BUS_1720_LCURLISTRecord curlistRec = (IS_BUS_1720_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sale_clsf%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.sun%>
<%= curlistRec.mon%>
<%= curlistRec.tue%>
<%= curlistRec.wed%>
<%= curlistRec.thr%>
<%= curlistRec.fri%>
<%= curlistRec.sat%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 20 16:00:38 KST 2012 */